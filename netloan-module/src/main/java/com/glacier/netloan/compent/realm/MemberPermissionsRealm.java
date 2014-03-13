package com.glacier.netloan.compent.realm;

import javax.annotation.PostConstruct;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.session.HttpServletSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HttpServletBean;

import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberTokenMapper;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberToken;
import com.glacier.netloan.entity.member.MemberTokenExample;
import com.glacier.netloan.service.system.UserService;
import com.glacier.security.util.Encodes;

/**
 * 
 * @ClassName: MemberPermissionsRealm
 * @Description: TODO(会员进行自定义执行认证和授权的类)
 * @author zhenfei.zhang
 * @email zhangzhenfei_email@163.com
 * @date 2012-12-27 下午2:03:58
 */
public class MemberPermissionsRealm extends AuthorizingRealm {

    @Autowired
    private MemberTokenMapper memberTokenMapper;
    
    @Autowired
    private MemberMapper memberMapper;

    public MemberPermissionsRealm() {
        setName("MemberPermissionsRealm");
    }

    /*
     * (non-Javadoc) <p>Title: doGetAuthorizationInfo</p> <p>Description: 授权</p>
     * <p>当缓存中没有用户的授权信息的时候会从该方法中加载，缓存到文件中</p>
     * 
     * @param principals
     * 
     * @return
     * 
     * @see
     * org.apache.shiro.realm.AuthorizingRealm#doGetAuthorizationInfo(org.apache
     * .shiro.subject.PrincipalCollection)
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        return null;
    }

    /*
     * (non-Javadoc) <p>Title: doGetAuthenticationInfo</p> <p>Description:
     * 认证回调函数,登录时调用.</p>
     * 
     * @param authtoken
     * 
     * @return
     * 
     * @throws AuthenticationException
     * 
     * @see
     * org.apache.shiro.realm.AuthenticatingRealm#doGetAuthenticationInfo(org
     * .apache.shiro.authc.AuthenticationToken)
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
    	CaptchaUsernamePasswordToken token = (CaptchaUsernamePasswordToken) authcToken;
        String username = token.getUsername();
        if (null != username && !"".equals(username)) {
            MemberTokenExample memberTokenExample = new MemberTokenExample();
            memberTokenExample.createCriteria().andUsernameEqualTo(username);
            MemberToken tokenMember= memberTokenMapper.selectByExample(memberTokenExample).get(0);
            System.out.println("ccccccccc");
            if (null != tokenMember) {
                // 用户状态为启用或隐藏让其通过认证
                byte[] salt = Encodes.decodeHex(tokenMember.getSalt());
                for(char r : token.getPassword()){
                	System.out.println("rrrrrrrr  "+r);
                }
                System.out.println("rrrrrrrr  "+token.getPassword());
                Member principalMember = memberMapper.selectByPrimaryKey(tokenMember.getMemberId());
                System.out.println("kkkkkk");
                AuthenticationInfo info = new SimpleAuthenticationInfo(principalMember, tokenMember.getPassword(), ByteSource.Util.bytes(salt), getName());// 将用户的所有信息作为认证对象返回
                System.out.println("tttttt");
                clearCache(info.getPrincipals());// 认证成功后清除之前的缓存
                return info;
            } else {
                throw new DisabledAccountException();
            }
        }
        return null;
    }


    /**
     * 更新用户授权信息缓存.
     */
    public void clearCachedAuthorizationInfo(String principal) {
        SimplePrincipalCollection principals = new SimplePrincipalCollection(principal, getName());
        clearCachedAuthorizationInfo(principals);
    }

    /**
     * 清除所有用户授权信息缓存.
     */
    public void clearAllCachedAuthorizationInfo() {
        Cache<Object, AuthorizationInfo> cache = getAuthorizationCache();
        if (cache != null) {
            for (Object key : cache.keys()) {
                cache.remove(key);
            }
        }
    }

    /**
     * 设定Password校验的Hash算法与迭代次数.
     */
    @PostConstruct
    public void initCredentialsMatcher() {
        HashedCredentialsMatcher matcher = new HashedCredentialsMatcher(UserService.HASH_ALGORITHM);
        matcher.setHashIterations(UserService.HASH_INTERATIONS);
        setCredentialsMatcher(matcher);
    }

}
