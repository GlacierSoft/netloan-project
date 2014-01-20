package com.glacier.netloan.service.sysmgr;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.sysmgr.ActionMapper;
import com.glacier.netloan.dao.sysmgr.AuthorityMapper;
import com.glacier.netloan.dao.sysmgr.RoleMapper;
import com.glacier.netloan.entity.sysmgr.Action;
import com.glacier.netloan.entity.sysmgr.ActionExample;
import com.glacier.netloan.entity.sysmgr.Authority;
import com.glacier.netloan.entity.sysmgr.AuthorityExample;
import com.glacier.netloan.entity.sysmgr.Role;
import com.glacier.netloan.entity.sysmgr.RoleExample;
import com.glacier.netloan.entity.sysmgr.User;
import com.glacier.netloan.util.MethodLog;

@Service
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private AuthorityMapper authorityMapper;

    @Autowired
    private ActionMapper actionMapper;

    /**
     * @Title: getRole
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param roleId
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */

    public Object getRole(String roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }

    /**
     * 
     * @Title: listAsGrid
     * @Description: TODO(以表格结构展示角色列表)
     * @param @param menuId 动作对应的菜单Id
     * @param @param pager 分页参数
     * @param @return 设定文件
     * @return Object 返回类型
     * @throws
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "浏览角色")
    public Object listAsGrid(JqPager pager) {

        JqGridReturn returnResult = new JqGridReturn();
        RoleExample roleExample = new RoleExample();

        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        if (null != pager.getPage() && null != pager.getRows()) {// 设置排序信息
            roleExample.setLimitStart((pager.getPage() - 1) * pager.getRows());
            roleExample.setLimitEnd(pager.getRows());
        }
        if (StringUtils.isNotBlank(pager.getSort()) && StringUtils.isNotBlank(pager.getOrder())) {// 设置排序信息
            roleExample.setOrderByClause(pager.getOrderBy("temp_role_"));
        }
        List<Role> Roles = roleMapper.selectByExample(roleExample); // 查询所有操作列表
        int total = roleMapper.countByExample(roleExample); // 查询总页数
        returnResult.setRows(Roles);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }

    /**
     * @Title: addRole
     * @Description: TODO(增加角色)
     * @param @param role
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "新增角色")
    public Object addRole(Role role) {
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        RoleExample roleExample = new RoleExample();
        int count = 0;
        // 防止角色名称重复
        roleExample.createCriteria().andRoleCnNameEqualTo(role.getRoleCnName());
        count = roleMapper.countByExample(roleExample);// 查找相同中文名称的角色数量
        if (count > 0) {
            returnResult.setMsg("角色名称重复，请重新填写!");
            return returnResult;
        }
        // 防止英文名称重复
        roleExample.clear();
        roleExample.createCriteria().andRoleEnNameEqualTo(role.getRoleEnName());
        count = roleMapper.countByExample(roleExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复，请重新填写!");
            return returnResult;
        }
        role.setRoleId(RandomGUID.getRandomGUID());
        role.setCreater(pricipalUser.getUserId());
        role.setCreateTime(new Date());
        count = roleMapper.insert(role);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + role.getRoleCnName() + "] 角色信息已保存");
        } else {
            returnResult.setMsg("角色信息保存失败，请联系管理员!");
        }
        return returnResult;
    }

    /**
     * @Title: editRole
     * @Description: TODO(这里用一句话描述这个方法的作用)
     * @param @param role
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "修改角色")
    public Object editRole(Role role) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        RoleExample roleExample = new RoleExample();
        int count = 0;
        // 防止角色名称重复
        roleExample.createCriteria().andRoleIdNotEqualTo(role.getRoleId()).andRoleCnNameEqualTo(role.getRoleCnName());
        count = roleMapper.countByExample(roleExample);// 查找相同中文名称的角色数量
        if (count > 0) {
            returnResult.setMsg("角色名称重复，请重新填写!");
            return returnResult;
        }
        // 防止英文名称重复
        roleExample.clear();
        roleExample.createCriteria().andRoleIdNotEqualTo(role.getRoleId()).andRoleEnNameEqualTo(role.getRoleEnName());
        count = roleMapper.countByExample(roleExample);// 查找相同英文名称的菜单数量
        if (count > 0) {
            returnResult.setMsg("英文名称重复，请重新填写!");
            return returnResult;
        }
        count = roleMapper.updateByPrimaryKeySelective(role);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + role.getRoleCnName() + "] 角色信息已保存");
        } else {
            returnResult.setMsg("角色信息保存失败，请联系管理员!");
        }
        return returnResult;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "保存角色菜单权限")
    public Object saveRoleMenuAuths(String roleId, List<String> menuIds) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        AuthorityExample authorityExample = new AuthorityExample();
        if (menuIds.size() > 0) {
            // 先清除所选角色在数据库中没有的权限
            authorityExample.createCriteria().andRoleIdEqualTo(roleId).andMenuIdNotIn(menuIds);
            authorityMapper.deleteByExample(authorityExample);
            // 取出所选角色在数据库中已有的权限，如果是新的菜单权限则插入
            authorityExample.clear();
            authorityExample.createCriteria().andRoleIdEqualTo(roleId);
            List<Authority> authorities = authorityMapper.selectByExample(authorityExample);
            for (String menuId : menuIds) {
                Authority authority = new Authority();
                authority.setMenuId(menuId);
                authority.setRoleId(roleId);
                if (!authorities.contains(authority)) {// 已经存在的权限跳过
                    // 添加默认操作
                    ActionExample actionExample = new ActionExample();
                    List<Action> defaultActions = actionMapper.selectByExample(actionExample);
                    authorityMapper.insert(authority);
                }
            }
        } else {
            authorityExample.createCriteria().andRoleIdEqualTo(roleId);
            authorityMapper.deleteByExample(authorityExample);
        }
        returnResult.setSuccess(true);
        returnResult.setMsg("角色菜单权限已保存");
        return returnResult;
    }

    /**
     * @Title: saveRoleMenuActionAuths
     * @Description: TODO(保存角色菜单操作权限)
     * @param @param authority
     * @param @return
     * @throws 备注
     *             <p>
     *             已检查测试:Green
     *             <p>
     */
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    @MethodLog(opera = "保存角色菜单操作权限")
    public Object saveRoleMenuActionAuths(Authority authority) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        AuthorityExample authorityExample = new AuthorityExample();
        authorityExample.createCriteria().andRoleIdEqualTo(authority.getRoleId()).andMenuIdEqualTo(authority.getMenuId());
        count = authorityMapper.countByExample(authorityExample);
        if(count > 0){
            count = authorityMapper.updateByPrimaryKey(authority);
        }else{
            count = authorityMapper.insert(authority);
        }
        if(count == 1){
            returnResult.setSuccess(true);
            returnResult.setMsg("角色操作权限已保存");
            return returnResult;
        } 
        returnResult.setMsg("角色操作权限保存失败");
        return returnResult;
    }

}
