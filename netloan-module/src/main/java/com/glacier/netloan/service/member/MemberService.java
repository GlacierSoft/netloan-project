package com.glacier.netloan.service.member;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.glacier.basic.util.CollectionsUtil;
import com.glacier.basic.util.RandomGUID;
import com.glacier.jqueryui.util.JqGridReturn;
import com.glacier.jqueryui.util.JqPager;
import com.glacier.jqueryui.util.JqReturnJson;
import com.glacier.netloan.dao.basicdatas.ParameterCreditTypeMapper;
import com.glacier.netloan.dao.finance.FinanceMemberMapper;
import com.glacier.netloan.dao.member.MemberAuthMapper;
import com.glacier.netloan.dao.member.MemberCreditIntegralMapper;
import com.glacier.netloan.dao.member.MemberMapper;
import com.glacier.netloan.dao.member.MemberMessageNoticeMapper;
import com.glacier.netloan.dao.member.MemberStatisticsMapper;
import com.glacier.netloan.dao.member.MemberTokenMapper;
import com.glacier.netloan.dao.member.MemberWorkMapper;
import com.glacier.netloan.dao.system.UserMapper;
import com.glacier.netloan.dto.query.member.MemberQueryDTO;
import com.glacier.netloan.entity.basicdatas.ParameterCredit;
import com.glacier.netloan.entity.basicdatas.ParameterCreditType;
import com.glacier.netloan.entity.basicdatas.ParameterCreditTypeExample;
import com.glacier.netloan.entity.borrow.BorrowingLoan;
import com.glacier.netloan.entity.member.Member;
import com.glacier.netloan.entity.member.MemberAuthExample;
import com.glacier.netloan.entity.member.MemberAuthWithBLOBs;
import com.glacier.netloan.entity.member.MemberCreditIntegral;
import com.glacier.netloan.entity.member.MemberExample;
import com.glacier.netloan.entity.member.MemberMessageNotice;
import com.glacier.netloan.entity.member.MemberExample.Criteria;
import com.glacier.netloan.entity.member.MemberToken;
import com.glacier.netloan.entity.member.MemberWork;
import com.glacier.netloan.entity.member.MemberWorkExample;
import com.glacier.netloan.entity.system.User;
import com.glacier.netloan.entity.system.UserExample;
import com.glacier.netloan.service.basicdatas.ParameterCreditService;
import com.glacier.netloan.util.MethodLog;
import com.glacier.security.util.Digests;
import com.glacier.security.util.Encodes;

/**
 * @ClassName: MemberService 
 * @Description: TODO(会员表业务类) 
 * @author yuzexu
 * @email 804346249@QQ.com
 * @date 2014-2-20下午5:23:09
 */
@Service
@Transactional(readOnly = true ,propagation = Propagation.REQUIRED)
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	@Autowired
	private MemberTokenMapper memberTokenMapper;
	
	@Autowired
	private MemberWorkMapper memberWorkMapper;
	
	@Autowired
	private MemberAuthMapper memberAuthMapper;
	
	@Autowired
    private ParameterCreditTypeMapper creditTypeMapper;
	
	@Autowired
	private MemberCreditIntegralMapper memberCreditIntegralMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MemberMessageNoticeMapper memberMessageNoticeMapper;
	
	@Autowired
	private ParameterCreditService parameterCreditService;
	
	@Autowired
	private FinanceMemberMapper financeMemberMapper;
	
	@Autowired
	private MemberStatisticsMapper memberStatisticsMapper;
	
	
	
	 /**
     * 加密方式
     */
    public static final String HASH_ALGORITHM = "SHA-1";

    /**
     * 计算次数
     */
    public static final int HASH_INTERATIONS = 1024;

    /**
     * 盐值长度
     */
    public static final int SALT_SIZE = 8;
	
    /**
     * 设定盐值和设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
     */
    private void entryptPassword(MemberToken memberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        memberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(memberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        memberToken.setPassword(Encodes.encodeHex(hashPassword));
    }
    
	/**
	 * @Title: getMember 
	 * @Description: TODO(根据会员Id获取会员信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMember(String memberId) {
    	Member member = memberMapper.selectByPrimaryKey(memberId);
    	//查询基础信用积分的所有数据
        List<ParameterCredit> parameterCredits = (List<ParameterCredit>) parameterCreditService.listCredits();
        //通过嵌套for循环，将会员的信用图标加到会员对象中去
        	for(ParameterCredit parameterCredit : parameterCredits){
    			if(member.getCreditIntegral() >= parameterCredit.getCreditBeginIntegral() && member.getCreditIntegral() < parameterCredit.getCreditEndIntegral()){
    				member.setCreditPhoto(parameterCredit.getCreditPhoto());
        			break;
        		}	
        	}
        return member;
    }
    /**
	 * @Title: getMemberWork 
	 * @Description: TODO(根据会员Id获取会员工作信息) 
	 * @param @param memberId
	 * @param @return    设定文件 
	 * @return Object    返回类型 
	 * @throws
	 */
    public Object getMemberWork(String memberId) {
    	MemberWork memberWork = memberWorkMapper.selectByPrimaryKey(memberId);
        return memberWork;
    }
    
    /**
     * @Title: listAsGrid 
     * @Description: TODO(获取所有会员信息) 
     * @param @param pager
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    public Object listAsGrid(JqPager jqPager, MemberQueryDTO memberQueryDTO, String q) {
        
        JqGridReturn returnResult = new JqGridReturn();
        MemberExample memberExample = new MemberExample();;
        
        Criteria queryCriteria = memberExample.createCriteria();
        memberQueryDTO.setQueryCondition(queryCriteria, q);

        if (null != jqPager.getPage() && null != jqPager.getRows()) {// 设置排序信息
        	memberExample.setLimitStart((jqPager.getPage() - 1) * jqPager.getRows());
        	memberExample.setLimitEnd(jqPager.getRows());
        }
        if (StringUtils.isNotBlank(jqPager.getSort()) && StringUtils.isNotBlank(jqPager.getOrder())) {// 设置排序信息
        	memberExample.setOrderByClause(jqPager.getOrderBy("temp_member_"));
        }
        List<Member>  members = memberMapper.selectByExample(memberExample); // 查询所有会员列表
        int total = memberMapper.countByExample(memberExample); // 查询总页数
        returnResult.setRows(members);
        returnResult.setTotal(total);
        return returnResult;// 返回ExtGrid表
    }
    /**
     * @Title: isUsernameRepeat 
     * @Description: TODO(判断会员名是否重复) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object isUsernameRepeat(Member member){
    	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
          MemberExample memberExample = new MemberExample();
          // 防止会员名称重复
          memberExample.createCriteria().andMemberNameEqualTo(member.getMemberName());
          int count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
          if (count > 0) {
              returnResult.setMsg("会员名称重复");
          }else{
        	  returnResult.setSuccess(true);
          }
          return returnResult;
    }
    /**
     * @Title: isEmailRepeat 
     * @Description: TODO(判断邮箱是否重复) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    public Object isEmailRepeat(Member member){
  	  JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        // 防止邮箱重复
        memberExample.createCriteria().andEmailEqualTo(member.getEmail());
        int count = memberMapper.countByExample(memberExample);// 查找相同邮箱的会员数量
        if (count > 0) {
            returnResult.setMsg("该邮箱已注册！");
        }else{
      	  returnResult.setSuccess(true);
        }
        return returnResult;
  }
    private void updateentryptPassword(MemberToken memberToken) {
        byte[] salt = Digests.generateSalt(SALT_SIZE);
        memberToken.setSalt(Encodes.encodeHex(salt));
        byte[] hashPassword = Digests.sha1(memberToken.getPassword().getBytes(), salt, HASH_INTERATIONS);
        memberToken.setPassword(Encodes.encodeHex(hashPassword));
    }
    /**
     * @Title: isequalsPassword 
     * @Description: TODO(会员密码修改) 
     * @param  @param member
     * @param  @param oldPassword
     * @param  @param memberPassword
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object isequalsPassword(Member member,String oldPassword,String memberPassword){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	Member m1 = memberMapper.selectByPrimaryKey(member.getMemberId());//通过memberid获取member
    	MemberToken mt = memberTokenMapper.selectByPrimaryKey(member.getMemberId());//通过memberId获取memberToken
    	//将前台传来的密码进行加密，
    	byte[] salt = Encodes.decodeHex(mt.getSalt());
    	byte[] hashPassword = Digests.sha1(oldPassword.getBytes(), salt, HASH_INTERATIONS);
    	String encodeHexPwd = Encodes.encodeHex(hashPassword);
    	int count = 0;
    	int countMT = 0;
    	//将加密后的密码和存在数据库里的密码进行比较。
        if ((m1.getMemberPassword()).equals(encodeHexPwd)) {
        	//会员表的修改
            member.setUpdater(member.getMemberId());
            member.setUpdateTime(new Date());
            mt.setPassword(memberPassword);
            //将新密码进行加密
            this.updateentryptPassword(mt);
            //更新member和memberToken
            member.setMemberPassword(mt.getPassword());
            countMT = memberTokenMapper.updateByPrimaryKeySelective(mt);
            count = memberMapper.updateByPrimaryKeySelective(member);
            if(count ==1 && countMT == 1){
            	returnResult.setSuccess(true);
            	returnResult.setMsg("密码修改成功！");
            }else{
            	returnResult.setMsg("密码修改失败！");
            }
        }else{
      	  returnResult.setMsg("原密码不正确！");
        }
        return returnResult;
    }
    /**
     * @Title: addMemberReception 
     * @Description: TODO(前台注册会员，同时生成工作表和认证表) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object addMemberReception(Member member){
    	//Subject pricipalSubject = SecurityUtils.getSubject();
        //User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        int countToken = 0;
        int creditCount = 0;
        int MessageNoticeCount = 0;
        String memberId = RandomGUID.getRandomGUID();
        //获取管理员id
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo("admin");
        List<User> users = userMapper.selectByExample(userExample);
        
        //设置membertoken信息
        MemberToken memberToken = new MemberToken();
        memberToken.setMemberId(memberId);
        memberToken.setUsername(member.getMemberName());
        memberToken.setPassword(member.getMemberPassword());
        this.entryptPassword(memberToken);
       
        
        //增加会员信息
        
        member.setMemberId(memberId);
        member.setMemberPassword(memberToken.getPassword());
        //
        member.setCreditIntegral(0f);
        member.setCreditamount(0f);
        //
        member.setType("general");
        member.setStatus("enable");
        member.setFirstContactRelation("family");
        member.setSecondContactRelation("family");
        member.setIntegral((float) 0);
        member.setCreditIntegral((float) 0);
        member.setRegistrationTime(new Date());
        member.setLastLoginTime(new Date());
        member.setLoginCount(1); 
        member.setMemberPhoto("http://localhost:8080/netloan-website/resources/images/member/member.jpg");//会员注册后的默认头像
        member.setCreater(users.get(0).getUserId());
        member.setCreateTime(new Date());
        member.setUpdater(users.get(0).getUserId());
        member.setUpdateTime(new Date());
        count = memberMapper.insert(member);
        
        //增加membertoken信息 要先增加member记录，才能再生成外键表的记录
        countToken = memberTokenMapper.insert(memberToken);
        
        //增加会员工作信息
        MemberWork memberWork = new MemberWork();
        memberWork.setMemberId(memberId);
        countWork = memberWorkMapper.insert(memberWork);
        
      
        //生成会员认证表信息
        MemberAuthWithBLOBs memberAuthWithBLOBs = new MemberAuthWithBLOBs();
        memberAuthWithBLOBs.setMemberId(memberId);
        memberAuthWithBLOBs.setInfoName("基本信息认证");
        memberAuthWithBLOBs.setInfoAuth("noapply");
        memberAuthWithBLOBs.setVipName("VIP认证");
        memberAuthWithBLOBs.setVipAuth("noapply");
        memberAuthWithBLOBs.setEmailName("邮箱认证");
        memberAuthWithBLOBs.setEmailAuth("pass");
        memberAuthWithBLOBs.setEmailAuditor(users.get(0).getUserId());
        memberAuthWithBLOBs.setEmailRemark("邮箱验证通过");
        memberAuthWithBLOBs.setEmailTime(new Date());
        memberAuthWithBLOBs.setMobileName("手机认证");
        memberAuthWithBLOBs.setMobileAuth("noapply");
        memberAuthWithBLOBs.setCreditName("信用认证");
        memberAuthWithBLOBs.setCreditAuth("noapply");
        memberAuthWithBLOBs.setCompanyName("企业认证");
        memberAuthWithBLOBs.setCompanyAuth("noapply");
        memberAuthWithBLOBs.setRealName("真实姓名认证");
        memberAuthWithBLOBs.setRealNameAuth("noapply");
        memberAuthWithBLOBs.setIdCardName("身份证认证");
        memberAuthWithBLOBs.setIdCardAuth("noapply");
        memberAuthWithBLOBs.setWorkName("工作认证");
        memberAuthWithBLOBs.setWorkAuth("noapply");
        memberAuthMapper.insert(memberAuthWithBLOBs);
        
        //增加邮箱认证信用积分
        ParameterCreditType parameterCreditType = null;
        ParameterCreditTypeExample parameterCreditTypeExample = new ParameterCreditTypeExample();
        MemberCreditIntegral memberCreditIntegral = new MemberCreditIntegral();
        parameterCreditTypeExample.createCriteria().andCreditTypeEqualTo("emailAuth");
		List<ParameterCreditType>  parameterCreditTypes = creditTypeMapper.selectByExample(parameterCreditTypeExample); // 查询所有信用积分类型列表
		parameterCreditType = parameterCreditTypes.get(0);
		
		String creditIntegralId = RandomGUID.getRandomGUID();
		memberCreditIntegral.setCreditIntegralId(creditIntegralId);
		memberCreditIntegral.setMemberId(memberId);
		
		memberCreditIntegral.setIntegralType(parameterCreditType.getCreditType());
		memberCreditIntegral.setChangeType(parameterCreditType.getChangeType());
		memberCreditIntegral.setChangeValue(parameterCreditType.getChangeValue());
       
        memberCreditIntegral.setCreater(users.get(0).getUserId());
        memberCreditIntegral.setCreateTime(new Date());
        memberCreditIntegral.setUpdater(users.get(0).getUserId());
        memberCreditIntegral.setUpdateTime(new Date());
        
        creditCount = memberCreditIntegralMapper.insert(memberCreditIntegral);
        
        //增加邮箱认证审核通过的信息通知
        MemberMessageNotice memberMessageNotice = new MemberMessageNotice();
        memberMessageNotice.setMessageNoticeId(RandomGUID.getRandomGUID());
   		memberMessageNotice.setSender(users.get(0).getUserId());
   		memberMessageNotice.setAddressee(memberId);
   		memberMessageNotice.setTitle("邮箱认证审核通知");
		memberMessageNotice.setContent("您的邮箱认证审核状况:通过");
        memberMessageNotice.setSendtime(new Date());
        memberMessageNotice.setLetterstatus("unread");
        memberMessageNotice.setLettertype("system");
        memberMessageNotice.setCreater(users.get(0).getUserId());
        memberMessageNotice.setCreateTime(new Date());
        memberMessageNotice.setUpdater(users.get(0).getUserId());
        memberMessageNotice.setUpdateTime(new Date());
        MessageNoticeCount = memberMessageNoticeMapper.insert(memberMessageNotice);
        
        
        if (count == 1 && countWork == 1 && countToken == 1 && creditCount == 1 && MessageNoticeCount == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已保存");
            returnResult.setObj(member);
        } else {
            returnResult.setMsg("发生未知错误，会员信息保存失败");
        }
        return returnResult;
    }
    /**
     * @Title: applicationVIP 
     * @Description: TODO(会员前台申请vip审核) 
     * @param  @param memberId
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object applicationVIP(String memberId){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
    	int count = 0;
        
        MemberAuthWithBLOBs memberAuthWithBLOBs = memberAuthMapper.selectByPrimaryKey(memberId);
        memberAuthWithBLOBs.setVipAuth("authstr");
    	count = memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        //count = memberMapper.updateByPrimaryKeySelective(member);
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("申请会员VIP成功，等待审核");
        } else {
            returnResult.setMsg("发生未知错误，申请会员VIP失败");
        }
        return returnResult;
    }
    /**
     * @Title: editMemberReception 
     * @Description: TODO(前台个人信息的修改) 
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object editMemberReception(Member member,MemberWork memberWork,String postAuth){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        //MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        //会员表的修改
        member.setUpdater(member.getMemberId());
        member.setUpdateTime(new Date());
        count = memberMapper.updateByPrimaryKeySelective(member);
        //工作表的修改
        countWork = memberWorkMapper.updateByPrimaryKeySelective(memberWork);
        //将基本信息和工作信息提交审核
        if(postAuth.equalsIgnoreCase("postAuth")){
        	MemberAuthWithBLOBs memberAuthWithBLOBs = memberAuthMapper.selectByPrimaryKey(member.getMemberId());
        	memberAuthWithBLOBs.setInfoAuth("authstr");
        	memberAuthWithBLOBs.setWorkAuth("authstr");
        	memberAuthMapper.updateByPrimaryKeySelective(memberAuthWithBLOBs);
        }
        if (count == 1 && countWork == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("会员信息保存成功");
            //returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员信息修改失败");
        }
        return returnResult;
    }
    /**
     * @Title: editMemberPhotoReception 
     * @Description: TODO(上传个人头像) 
     * @param  @param member
     * @param  @return设定文件
     * @return Object  返回类型
     * @throws 
     *
     */
    @Transactional(readOnly = false)
    public Object editMemberPhotoReception(Member member){
    	JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        //会员表的修改
        member.setUpdater(member.getMemberId());
        member.setUpdateTime(new Date());
        count = memberMapper.updateByPrimaryKeySelective(member);
        
        if (count == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("个人头像保存成功");
        } else {
            returnResult.setMsg("发生未知错误，个人头像上传失败");
        }
        return returnResult;
    }
    /**
     * @Title: addMemberandWorkandAuth 
     * @Description: TODO(新增会员,工作，认证) 
     * @param @param member
     * @param @param memberWork
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_add")
    public Object addMemberandWorkandAuth(Member member,MemberWork memberWork) {
    	
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        int countToken = 0;
        String memberId = RandomGUID.getRandomGUID();
        // 防止会员名称重复
        memberExample.createCriteria().andMemberNameEqualTo(member.getMemberName());
        count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员名称重复");
            return returnResult;
        }
        
        //设置membertoken信息
        MemberToken memberToken = new MemberToken();
        memberToken.setMemberId(memberId);
        memberToken.setUsername(member.getMemberName());
        memberToken.setPassword(member.getMemberPassword());
        this.entryptPassword(memberToken);
       
        
        //增加会员信息
        if(member.getFirstContactRelation() == null || member.getFirstContactRelation().equals("")){
        	member.setFirstContactRelation("family");
        }
        if(member.getSecondContactRelation() == null || member.getSecondContactRelation().equals("")){
        	member.setSecondContactRelation("family");
        }
        
        member.setMemberId(memberId);
        member.setMemberPassword(memberToken.getPassword());
        member.setIntegral((float) 0);
        member.setCreditIntegral((float) 0);
        member.setRegistrationTime(new Date());
        member.setCreater(pricipalUser.getUserId());
        member.setCreateTime(new Date());
        member.setUpdater(pricipalUser.getUserId());
        member.setUpdateTime(new Date());
        count = memberMapper.insert(member);
        
        //增加membertoken信息 要先增加member记录，才能再生成外键表的记录
        countToken = memberTokenMapper.insert(memberToken);
        
        //增加会员工作信息
        memberWork.setMemberId(memberId);
        countWork = memberWorkMapper.insert(memberWork);
        
        //生成会员认证表信息
        MemberAuthWithBLOBs memberAuthWithBLOBs = new MemberAuthWithBLOBs();
        memberAuthWithBLOBs.setMemberId(memberId);
        memberAuthWithBLOBs.setInfoName("基本信息认证");
        memberAuthWithBLOBs.setInfoAuth("noapply");
        memberAuthWithBLOBs.setVipName("VIP认证");
        memberAuthWithBLOBs.setVipAuth("noapply");
        memberAuthWithBLOBs.setEmailName("邮箱认证");
        memberAuthWithBLOBs.setEmailAuth("noapply");
        memberAuthWithBLOBs.setMobileName("手机认证");
        memberAuthWithBLOBs.setMobileAuth("noapply");
        memberAuthWithBLOBs.setCreditName("信用认证");
        memberAuthWithBLOBs.setCreditAuth("noapply");
        memberAuthWithBLOBs.setCompanyName("企业认证");
        memberAuthWithBLOBs.setCompanyAuth("noapply");
        memberAuthWithBLOBs.setRealName("真实姓名认证");
        memberAuthWithBLOBs.setRealNameAuth("noapply");
        memberAuthWithBLOBs.setIdCardName("身份证认证");
        memberAuthWithBLOBs.setIdCardAuth("noapply");
        memberAuthWithBLOBs.setWorkName("工作认证");
        memberAuthWithBLOBs.setWorkAuth("noapply");
        memberAuthMapper.insert(memberAuthWithBLOBs);
        
        if (count == 1 && countWork == 1 && countToken == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已保存");
        } else {
            returnResult.setMsg("发生未知错误，会员信息保存失败");
        }
        return returnResult;
    }
    
    /**
     * @Title: editMemberandWork 
     * @Description: TODO(修改会员，工作) 
     * @param @param member
     * @param @param memberWork
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_edit")
    public Object editMemberandWork(Member member,MemberWork memberWork) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        MemberExample memberExample = new MemberExample();
        int count = 0;
        int countWork = 0;
        // 防止会员名称重复
        memberExample.createCriteria().andMemberIdNotEqualTo(member.getMemberId()).andMemberNameEqualTo(member.getMemberName());
        count = memberMapper.countByExample(memberExample);// 查找相同名称的会员数量
        if (count > 0) {
            returnResult.setMsg("会员名称重复");
            return returnResult;
        }
        
        //会员表的修改
        Subject pricipalSubject = SecurityUtils.getSubject();
        User pricipalUser = (User) pricipalSubject.getPrincipal();
        member.setUpdater(pricipalUser.getUserId());
        member.setUpdateTime(new Date());
        count = memberMapper.updateByPrimaryKeySelective(member);
        
        //工作表的修改
        countWork = memberWorkMapper.updateByPrimaryKeySelective(memberWork);

        if (count == 1 && countWork == 1) {
            returnResult.setSuccess(true);
            returnResult.setMsg("[" + member.getMemberName() + "] 会员信息已修改");
        } else {
            returnResult.setMsg("发生未知错误，会员信息修改失败");
        }
        return returnResult;
    }
    
   /**
     * @Title: delMemberandWorkandAuth 
     * @Description: TODO(删除会员，工作，认证) 
     * @param @param memberIds
     * @param @param annThemes
     * @param @return    设定文件 
     * @return Object    返回类型 
     * @throws
     */
    @Transactional(readOnly = false)
    @MethodLog(opera = "MemberList_del")
    public Object delMemberandWorkandAuth(List<String> memberIds, List<String> memberNames) {
        JqReturnJson returnResult = new JqReturnJson();// 构建返回结果，默认结果为false
        int count = 0;
        int countWork = 0;
        int countAuth = 0;
        if (memberIds.size() > 0) {
        	
            //工作表的删除
            MemberWorkExample memberWorkExample = new MemberWorkExample();
            memberWorkExample.createCriteria().andMemberIdIn(memberIds);
            countWork = memberWorkMapper.deleteByExample(memberWorkExample);
            
            //会员认证表的删除
            MemberAuthExample memberAuthExample = new MemberAuthExample();
            memberAuthExample.createCriteria().andMemberIdIn(memberIds);
            countAuth = memberAuthMapper.deleteByExample(memberAuthExample);
            
            //会员表的删除
        	MemberExample memberExample = new MemberExample();
        	memberExample.createCriteria().andMemberIdIn(memberIds);
            count = memberMapper.deleteByExample(memberExample);
            
            if (count > 0 && countWork >0 && countAuth > 0) {
                returnResult.setSuccess(true);
                returnResult.setMsg("成功删除了[ " + CollectionsUtil.convertToString(memberNames, ",") + " ]操作");
            } else {
                returnResult.setMsg("发生未知错误，会员信息删除失败");
            }
        }
        return returnResult;
    }

}
