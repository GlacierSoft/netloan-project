/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-06-30 08:49:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_account_invest`
-- ----------------------------
DROP TABLE IF EXISTS `t_account_invest`;
CREATE TABLE `t_account_invest` (
  `invest_id` varchar(32) NOT NULL COMMENT '投资统计ID',
  `sum_uncollected` float(20,2) default NULL COMMENT '投资成功待收金额',
  `sum_reward` float(20,2) default NULL COMMENT '投资奖励金额',
  `sum_fine` float(20,2) default NULL COMMENT '借款人逾期罚款金额',
  `sum_borrow` float(20,2) default NULL COMMENT '借款成功总额',
  `sum_advfee` float(20,2) default NULL COMMENT '借款管理费总额',
  `sum_interest` float(20,2) default NULL COMMENT '借款利息总额',
  `sum_interestfee` float(20,2) default NULL COMMENT '借款逾期罚息总额',
  `creater` varchar(32) default NULL COMMENT '创建人',
  `create_time` datetime default NULL COMMENT '录入时间',
  `updater` varchar(32) default NULL COMMENT '更新人',
  `update_time` datetime default NULL COMMENT '更新时间',
  PRIMARY KEY  (`invest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_account_invest
-- ----------------------------
INSERT INTO `t_account_invest` VALUES ('1', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-05 13:57:45', '8b25651c2d896297530b64e4b80ec503', '2014-06-05 13:57:53');
INSERT INTO `t_account_invest` VALUES ('2ce1c2d08b5e6c4a58be07f6c592cb66', '1044.00', '20033.00', '0.00', '65.00', '0.00', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-12 13:58:58', '8b25651c2d896297530b64e4b80ec503', '2014-06-12 13:58:58');
INSERT INTO `t_account_invest` VALUES ('376c92e7a30cd65df300c274269b37bb', '1044.00', '20033.00', '0.00', '65.00', '0.00', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-18 16:53:19', '8b25651c2d896297530b64e4b80ec503', '2014-06-18 16:53:19');
INSERT INTO `t_account_invest` VALUES ('566d89b4d7e902b226fc27e243c33546', '5055.00', '20033.00', '1000.00', '10011.00', '10200.00', '2000.00', '2100.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-26 09:51:35', '8b25651c2d896297530b64e4b80ec503', '2014-06-26 09:51:35');
INSERT INTO `t_account_invest` VALUES ('67442b06cb200b8fcedd1ae51eb56ea7', '5055.00', '20033.00', '1000.00', '10011.00', '10200.00', '2000.00', '2100.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-20 13:35:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-20 13:35:18');
INSERT INTO `t_account_invest` VALUES ('8bfb8f4a5ad9810e077e3923d9e10f47', '5055.00', '20033.00', '1000.00', '10011.00', '10200.00', '2000.00', '2100.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:15:07', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:15:07');
INSERT INTO `t_account_invest` VALUES ('a3836315ac5a5bf89cb3c22305918530', '5055.00', '20033.00', '1000.00', '10011.00', '10200.00', '2000.00', '2100.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 08:45:00', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 08:45:00');
INSERT INTO `t_account_invest` VALUES ('a77e87f04e23426230685b2fbd803870', '5055.00', '20033.00', '1000.00', '10011.00', '10200.00', '2000.00', '2100.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 08:36:20', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 08:36:20');
INSERT INTO `t_account_invest` VALUES ('dc7c063d35738195210d173b407172ec', '1044.00', '20033.00', '0.00', '65.00', '0.00', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-13 08:49:04', '8b25651c2d896297530b64e4b80ec503', '2014-06-13 08:49:04');

-- ----------------------------
-- Table structure for `t_action`
-- ----------------------------
DROP TABLE IF EXISTS `t_action`;
CREATE TABLE `t_action` (
  `action_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_id` varchar(32) default NULL,
  `action_cn_name` varchar(30) NOT NULL,
  `action_en_name` varchar(30) NOT NULL,
  `icon_cls` varchar(30) default NULL,
  `type` enum('Link','Button') default 'Button',
  `disabled` enum('disable','enable') default NULL,
  `method` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(50) default NULL,
  PRIMARY KEY  (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', '');
INSERT INTO `t_action` VALUES ('01dc883fe7100411013efd59c60efe12', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.delParameterBasic();', '3', '');
INSERT INTO `t_action` VALUES ('02e8e7c29c545810f77ad6714153d1e3', '185b00f80aaa910fa99d9abc99c84d58', 'ad2e8abecde386abbd1738707beccfee', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.LoanReview_mgr.LoanReview.delLoanReview();', '1', '');
INSERT INTO `t_action` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.editNews();', '2', '');
INSERT INTO `t_action` VALUES ('0fa43c6542365762ae60ccc552a33fd9', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.addRechargeSet();', '1', '');
INSERT INTO `t_action` VALUES ('164cdcc07fc0588cc16bdbafe55eff07', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.editRepaymentType();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eads', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.addAge();', '2', null);
INSERT INTO `t_action` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', '');
INSERT INTO `t_action` VALUES ('1cccbe2e088ea3848e78e2338f572675', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.auditOverdueAdvances();', '4', '');
INSERT INTO `t_action` VALUES ('1fb7d55569a297d8c9c8df576e7aa3c6', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.delIntegralType();', '3', '');
INSERT INTO `t_action` VALUES ('2213139f0e736a796d5ac4bdd78332', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.delIntegral();', '3', null);
INSERT INTO `t_action` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action` VALUES ('2432c7b3282c5b6482e6950da3b79ad8', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.delMember();', '3', '');
INSERT INTO `t_action` VALUES ('25860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.addCredit();', '1', null);
INSERT INTO `t_action` VALUES ('28060139f0e736a796d5ac4bdd78dawx', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.editAge();', '3', null);
INSERT INTO `t_action` VALUES ('2847af4d9e73cd7a4c1a5b1933cac4c0', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.addQuestion();', '1', '');
INSERT INTO `t_action` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', '');
INSERT INTO `t_action` VALUES ('2c3f7432c92f50ae582efd60424c025f', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.addCreditType();', '1', '');
INSERT INTO `t_action` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.editLink();', '2', '');
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', '');
INSERT INTO `t_action` VALUES ('34560139f0e736a796d5ac4bdd78344', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.addIntegral();', '1', null);
INSERT INTO `t_action` VALUES ('35860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.editCredit();', '2', null);
INSERT INTO `t_action` VALUES ('38060139f0e736a796d5ac4bdd78escs', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.delAge();', '4', null);
INSERT INTO `t_action` VALUES ('3ceb75f4b0d0565546cd24d1dc7b3140', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '新增', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.addOverdueAdvances();', '1', '');
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', '');
INSERT INTO `t_action` VALUES ('43286edc2a67d2cc48258ed3445fcb7c', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.addIntegralType();', '1', '');
INSERT INTO `t_action` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action` VALUES ('4586054157cf483a790f4eea35dsf6f6', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.delCredit();', '3', null);
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', '');
INSERT INTO `t_action` VALUES ('48f761b33f08cc3403e0ee74ff68b960', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.addLoanTender();', '1', '');
INSERT INTO `t_action` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.addService();', '1', '');
INSERT INTO `t_action` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', '');
INSERT INTO `t_action` VALUES ('4c81203b3b78f009a00b76f4b5c2f1c6', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.editMessageNotice();', '2', '');
INSERT INTO `t_action` VALUES ('5145b54dcf298e8acc62618c50ae9658', '3a0891f27514a093a5869da2afc22268', 'd758d23f2be619905b89146a228c3336', '导出Excel', 'exp', 'icon-standard-note-go', 'Button', 'enable', 'glacier.account_mgr.accountBorrow_mgr.accountBorrow.expAccountBorrow();', '1', '');
INSERT INTO `t_action` VALUES ('5358a74c967ccb2e7f8e19ada4b56dc5', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.editFinancePlatform();', '2', '');
INSERT INTO `t_action` VALUES ('53c1484ea13b45e89165b1f324cb4c87', 'f15eee7156a6e9821ad60ea9747b6878', '22bb4909b6184fadfdb5bc5566a911ae', '审核', 'audit', 'icon-cologne-customers', 'Button', 'enable', 'glacier.member_mgr.estate_mgr.estate.auditHiring();', '1', '');
INSERT INTO `t_action` VALUES ('56890139f0e736a796d5ac4bdd78211', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.editIntegral();', '2', null);
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', '');
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', '');
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', '');
INSERT INTO `t_action` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.editService();', '2', '');
INSERT INTO `t_action` VALUES ('5b5621bc4bc8226055d59cbf5c7852b2', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.editOverdueFineSet();', '2', '');
INSERT INTO `t_action` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.delLink();', '3', '');
INSERT INTO `t_action` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', '');
INSERT INTO `t_action` VALUES ('5ec88454af4be3068ddb590c76edd72b', '9dc3357651c9ecbb9b7c51005be28d18', '5a5b45f5c22bb597247bf1ba380f8968', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.secretSecurity_mgr.secretSecurity.delSecretSecurity();', '1', '');
INSERT INTO `t_action` VALUES ('603c90108811ef9e8bb9c9639cc5c027', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.delRechargeSet();', '3', '');
INSERT INTO `t_action` VALUES ('61456d3d7696bfe35938d1e14b38a9f6', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.auditFinancePlatform();', '4', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', '');
INSERT INTO `t_action` VALUES ('6e2f6c1b5c542cb289cdadb07c9164b9', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.delQuestion();', '3', '');
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', '');
INSERT INTO `t_action` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', '');
INSERT INTO `t_action` VALUES ('745f2c5fbd9ff0393b422d69ec411b6a', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.editRechargeSet();', '2', '');
INSERT INTO `t_action` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.addNews();', '1', '');
INSERT INTO `t_action` VALUES ('7b77c2b0294c356ed5447a3857b02fcd', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.editOverdueAdvances();', '2', '');
INSERT INTO `t_action` VALUES ('7caffce8ea39108e446907222540bdba', '9171c71b4bab5578ef0bbeac30072c73', 'a466d90682f5e1b36f0d1813c2d9c844', '导出Excel', 'exp', 'icon-standard-note-go', 'Button', 'enable', 'glacier.member_mgr.statistics_mgr.statistics.expStatistics();', '1', '');
INSERT INTO `t_action` VALUES ('7e5859ec7d629ee40e81ebed04c4b097', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.delFinancePlatform();', '3', '');
INSERT INTO `t_action` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', '');
INSERT INTO `t_action` VALUES ('83da88e1222fd62309915a2ccee9bd52', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.editCreditType();', '2', '');
INSERT INTO `t_action` VALUES ('84ed9df00a0bcb687170e6a09767b4d2', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.addMessageNotice();', '1', '');
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', '');
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', '');
INSERT INTO `t_action` VALUES ('8dd9d2808e9363daf78642bcb64bfa7e', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.editMember();', '2', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', '');
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', '');
INSERT INTO `t_action` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', '');
INSERT INTO `t_action` VALUES ('9bd85330248f3e9a3839fc7fb22e7989', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.auditBankCard();', '4', '');
INSERT INTO `t_action` VALUES ('9c975e58b77030f3eaa72f95ab34f786', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.applyAmount_mgr.applyAmount.auditApplyAmount();', '4', '');
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', '');
INSERT INTO `t_action` VALUES ('9e797156c229191ab00bb4b0476ce3e3', '765726125327148f709cb1b98e8e2fb8', '961af6c94e64222b875d5a0546b8675b', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountTender_mgr.accountTender.expAccountTender();', '1', '');
INSERT INTO `t_action` VALUES ('9f2bde7246ca2ad13dc64bbc5f4efb3d', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.delUser();', '3', '');
INSERT INTO `t_action` VALUES ('9f9e45b7c4cd5416067357793231eb85', '8b442566ffbc9531ee5e3aef7c41d740', '0ff45a0906e1ec4b169953b2c177db3e', '审核', 'auth', 'icon-standard-attach', 'Button', 'enable', 'glacier.member_mgr.memberAuth_mgr.memberAuth.authMemberAuth();', '1', '');
INSERT INTO `t_action` VALUES ('a04ae9ab4aeffa6fbffbae0f3630aa64', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.addMember();', '1', '');
INSERT INTO `t_action` VALUES ('a27471575ce1f86d15e43a163b2195dd', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.addLink();', '1', '');
INSERT INTO `t_action` VALUES ('a34eddbd653c462a87afe23eab0c6391', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement();', '1', '');
INSERT INTO `t_action` VALUES ('a6e49ea671cecee4c618785aa5eff06b', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.auditOverdueFineSet();', '4', '');
INSERT INTO `t_action` VALUES ('a8167ddeb588a6b88b81c81fbf1504a9', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', ' 修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.editIntegralType();', '2', '');
INSERT INTO `t_action` VALUES ('aa1a5a2270461de1688af30e776f2da1', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.addParameterBasic();', '1', '');
INSERT INTO `t_action` VALUES ('aa92fc184111c854d2c88774e4d941c4', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.auditRechargeSet();', '4', '');
INSERT INTO `t_action` VALUES ('abaa0bc85e3c239161d04abe65acdac4', 'd1f203ea6815e227579b88c5d6235629', 'a143b131cf265bb53467012fd788ed66', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountInvest_mgr.accountInvest.expAccountInvest();', '1', '');
INSERT INTO `t_action` VALUES ('ad2388e634c5e313d1c71eecdc849cb6', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.delAnnouncement();', '3', '');
INSERT INTO `t_action` VALUES ('ae83596beea547d81692aa19ed036b84', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.delOverdueAdvances();', '3', '');
INSERT INTO `t_action` VALUES ('aea7efcb8741c644ca693486220fe031', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '分配还款方式', 'assign', 'icon-standard-key-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.assignRepayment();', '4', '');
INSERT INTO `t_action` VALUES ('afa46628496d4d07c56a03e83a0094d0', 'c5cbf9f0961aa8249322d9ac20ba996e', 'f02605440920e2e2f7ed260f81674410', '初审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanFirstAudit.auditBorrowingLoanFirstAudit();', '1', '');
INSERT INTO `t_action` VALUES ('b0648b51ebbf9831702a3f616a75ca3a', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.delNews();', '3', '');
INSERT INTO `t_action` VALUES ('b0f605139653554aa66cf38a78fe42ba', '54eb754157cf483a790f4eea35200118', 'eb07f8ec54989seb66e4e8a1a0f21604', '列表', 'list', '', 'Button', 'disable', '', '1', '');
INSERT INTO `t_action` VALUES ('b140fe41933ae262393262348962f50e', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '添加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.addOverdueFineSet();', '1', '');
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', '');
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('ba99418ca949feedcedfa04396235827', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.delService();', '3', '');
INSERT INTO `t_action` VALUES ('bb182dacbb7641b9a337962406a6281f', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.editQuestion();', '2', '');
INSERT INTO `t_action` VALUES ('bd12ba2da228817eb381868d63ff9031', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.delRepaymentType();', '3', '');
INSERT INTO `t_action` VALUES ('be0471ff12b16ba7ef172aecd18ca4a4', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.delCreditType();', '3', '');
INSERT INTO `t_action` VALUES ('c1a3054399d0f62140f0389d3c0761a7', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.addRepaymentType();', '1', '');
INSERT INTO `t_action` VALUES ('c2bbacb3cc9924e87aebce80f5bcbebc', '6b44218344d328305de2bcdf82cb8741', 'ea7a850b7fe4c05f180e28e6e7fa76fa', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.tenderNotes_mgr.tenderNotes.delTenderNotes();', '1', '');
INSERT INTO `t_action` VALUES ('c50c979b621ff41f0677cdf02e29648b', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.editHiring();', '2', '');
INSERT INTO `t_action` VALUES ('c84bb71923c9297ee8ba7e06207a8608', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.editParameterBasic();', '2', '');
INSERT INTO `t_action` VALUES ('d54e5e68cc6d3310e663678a674c4193', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.addFinancePlatform();', '1', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', '');
INSERT INTO `t_action` VALUES ('dc73a4be22344ac72054f8e664806320', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.delLoanTender();', '3', '');
INSERT INTO `t_action` VALUES ('e07e6f29a82367df51fd80863f28503a', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.delBankCard();', '3', '');
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', '');
INSERT INTO `t_action` VALUES ('e32722bcb1b49ff2ed7ce3029200fe80', '31a605c2a2a777c738a09103b9915615', '8e6e60bd7b85314ab9555e64bc6e5d08', '复审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanSecAudit.auditBorrowingLoanSecAudit();', '1', '');
INSERT INTO `t_action` VALUES ('e450b55ffaeca413fdd6551591993893', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.addAnnouncement();', '1', '');
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', '');
INSERT INTO `t_action` VALUES ('e637975493d65070499ebfb8b15b37f6', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.editHelp();', '2', '');
INSERT INTO `t_action` VALUES ('e6dc58cf519c048b4674a4581054d237', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.delMessageNotice();', '3', '');
INSERT INTO `t_action` VALUES ('ec40a2a3a246442c53a3554cdae59cbb', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.delOverdueFineSet();', '3', '');
INSERT INTO `t_action` VALUES ('ed9331339d87314589ce7e19de4dab86', '8b4c5afb8d66b21e8900822c5c6bff35', '56a81ee56b6ed438bbc43d17b2e4b96e', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.recharge_mgr.recharge.auditRecharge();', '1', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', '');
INSERT INTO `t_action` VALUES ('fbbda7cc81811077445c4bc94c53ce08', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.editNav();', '2', '');
INSERT INTO `t_action` VALUES ('fbfded9986f0ad39d43d789b7594463d', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.delHiring();', '3', '');
INSERT INTO `t_action` VALUES ('fc1dd61babab45fb3942b311dda6a501', '3f029e72ef13db56e8b65866984da722', 'bcc05279c70cd8a320ad70bd7cd0b12d', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdraw_mgr.withdraw.auditWithdraw();', '1', '');
INSERT INTO `t_action` VALUES ('fdd2966ba48e34c5e5ad8dc6d8964f8b', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.editLoanTender();', '2', '');
INSERT INTO `t_action` VALUES ('fe2471a42fc0e7d61343f4e53c8eb429', '51af37d8918504c4ba34a85b1a3d94fc', '7568bd9e76ee7bfa7ac7e2ef470cce78', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountLogin_mgr.accountLogin.expAccountLogin();', '1', '');
INSERT INTO `t_action` VALUES ('fef8bd050155337259ac615a077be166', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '设置为默认账户', 'update', 'icon-hamburg-config', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.editnancePlatformType();', '5', '');
INSERT INTO `t_action` VALUES ('sd54fsd4fsd2sg45r4hrtj2fg1j2g1', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.delArea();', '3', null);

-- ----------------------------
-- Table structure for `t_attention_borrowing`
-- ----------------------------
DROP TABLE IF EXISTS `t_attention_borrowing`;
CREATE TABLE `t_attention_borrowing` (
  `attention_borrowing_id` varchar(32) NOT NULL,
  `loan_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`attention_borrowing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_attention_borrowing
-- ----------------------------
INSERT INTO `t_attention_borrowing` VALUES ('01049c1c6b7256dd0910ab53338dc687', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 14:06:59', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 14:06:59');
INSERT INTO `t_attention_borrowing` VALUES ('296807d21dd5b725c36a667eee609d02', 'a7dd8236b93b6997a06b6652eca21eb3', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:49', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:49');
INSERT INTO `t_attention_borrowing` VALUES ('2db9c333a0b6370013ea565f1b4d034f', '5627fc801ee0205417d66b1daec10423', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 14:36:09', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 14:36:09');
INSERT INTO `t_attention_borrowing` VALUES ('601e0faaf4ef3d48a24c70e6f88a0304', '4535fsdfaf9f2c9bc59bbc6df4523s34', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:34', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:34');
INSERT INTO `t_attention_borrowing` VALUES ('6ff61e11041b21722e4cde728046de57', 'a74835e0efd680bdffca5adebb196c4e', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-27 15:37:26', 'f842fdbfe42190da7bea612a54debb31', '2014-05-27 15:37:26');
INSERT INTO `t_attention_borrowing` VALUES ('adfadsfsdf', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', '关注借款', 'f842fdbfe42190da7bea612a54debb31', '2014-05-20 16:43:07', 'f842fdbfe42190da7bea612a54debb31', '2014-05-20 16:43:03');
INSERT INTO `t_attention_borrowing` VALUES ('bb4d4693f735d04f65b9886c97744fdd', 'dff3423436b93b6997a06b66324564c', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:38:20', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:38:20');
INSERT INTO `t_attention_borrowing` VALUES ('bcgddfadsf', 'a7dd8236b93b6997a06b6652eca21eb3', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:57:43', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:57:40');
INSERT INTO `t_attention_borrowing` VALUES ('ddb06cbf7be11507da0a7b754939da84', '9841ce94a6789b3d824994b477c0a148', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:27', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:27');
INSERT INTO `t_attention_borrowing` VALUES ('f054c8d6c12603fc682056b659809d6a', '80ebfeaf9f2c9bc59bbc66d588a0fcb9', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:41', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:35:41');
INSERT INTO `t_attention_borrowing` VALUES ('greradsasd', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:56:10', 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 15:56:13');

-- ----------------------------
-- Table structure for `t_authority`
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority` (
  `role_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) NOT NULL,
  `actions` varchar(21779) default NULL,
  PRIMARY KEY  (`role_id`,`menu_id`),
  KEY `FK_t_authority2` (`menu_id`),
  CONSTRAINT `FK_auth_menu_menu_id` FOREIGN KEY (`menu_id`) REFERENCES `t_menu` (`menu_id`),
  CONSTRAINT `FK_auth_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_authority
-- ----------------------------
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0107a40612ffaefe86f255341b6f9e03', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '02e56de3282b5404fdba2e2c957d1b92', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '054464fdb73c76b5cfd4efa16fcaa8e1', 'CreditTypeList_add,CreditTypeList_edit,CreditTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '055b7c1a9499420b2982a207dc027389', 'ParameterBasicList_add,ParameterBasicList_edit,ParameterBasicList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '079cecd38fb5df02ed6e4d84446d072e', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '0b097738ce712d563199ad7c7240212c', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '10a7f2fd8253d90b8672d4096f8f9ed4', 'LoanTenderList_add,LoanTenderList_edit,LoanTenderList_del,LoanTenderList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '125cc7156b53015b809d9a27b55fbf57', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '185b00f80aaa910fa99d9abc99c84d58', 'LoanReviewList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '2a93efe5aeae3cdef871447bd49134a0', 'FinancePlatformList_add,FinancePlatformList_edit,FinancePlatformList_del,FinancePlatformList_audit,FinancePlatformList_update');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '2ce7311ee180ae794c608251997dad9c', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '31a605c2a2a777c738a09103b9915615', 'BorrowingLoanSecAuditList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '33f5e9959e821a58696e2d2fb5c322fc', 'QuestionList_add,QuestionList_edit,QuestionList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3775cc8c3044650697dbb4d8636b5464', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '389f33c7b34582376d4d99282faa03b9', 'RepaymentTypeList_add,RepaymentTypeList_edit,RepaymentTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3a0891f27514a093a5869da2afc22268', 'AccountBorrowList_exp');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3d69786613fe15615172d1ae22defed4', 'integralTypeList_add,integralTypeList_edit,integralTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3f029e72ef13db56e8b65866984da722', 'WithdrawList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '43b1d02267e9ed610543845a1c1a24ca', 'OverdueAdvancesList_add,OverdueAdvancesList_edit,OverdueAdvancesList_del,OverdueAdvancesList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4c654b11b08eecbf6eb4e6688ea83b7d', 'MemberList_add,MemberList_edit,MemberList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f1b6666b70be892469b6e93c1eb30ce', 'NavTree_add,NavTree_edit,NavTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '51af37d8918504c4ba34a85b1a3d94fc', 'AccountLoginList_exp');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '57c06b09c96c8f852993f07580ffcdfa', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5db451044c71b4eb5448a4291d538241', 'bankCardList_del,bankCardList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6460c4e2cb89b498712c96e9b4d1acce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6a56f98aba3ed0e794a9906e138195a9', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6b44218344d328305de2bcdf82cb8741', 'TenderNotesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '703a3f819925f89a9c370c0324d784a0', 'MessageNoticeList_add,MessageNoticeList_edit,MessageNoticeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '765726125327148f709cb1b98e8e2fb8', 'AccountTenderList_exp');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '81d6b2292bbe73c29bc76679201662e1', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '88ee044d59911b3b1a67ba4cdd0ee90d', 'AnnouncementList_add,AnnouncementList_edit,AnnouncementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8b442566ffbc9531ee5e3aef7c41d740', 'MemberAuthList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8b4c5afb8d66b21e8900822c5c6bff35', 'RechargeList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9171c71b4bab5578ef0bbeac30072c73', 'StatisticsList_exp');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_del,UserList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f0fcfa7cdff069d929723062b53211', 'VariablesList_add,VariablesList_edit,VariablesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f6161c579a1df53d49eb2655d29645', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9dc3357651c9ecbb9b7c51005be28d18', 'secretSecurityList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a99477bf949bcae7143004e369d31d6c', 'RechargeSetList_add,RechargeSetList_edit,RechargeSetList_del,RechargeSetList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ae024ce004991607d5ae9e725d67cce8', 'ApplyAmountList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b67d550a506255816d54840a853b7a46', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c3c78541e9041ab6659fd3399aa6445b', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c58c25c6cb2e8d9fdf39493dde51d80d', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c5cbf9f0961aa8249322d9ac20ba996e', 'BorrowingLoanFirstAuditList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd1f203ea6815e227579b88c5d6235629', 'AccountInvestList_exp');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd31f853097d3bd74741d6418f6a2c7d5', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd60a6e3369f1b7fdb249aa61ba4add6e', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'de34654c5e6c1e94ee70cc833asd142', 'AreaTree_add,AreaTree_edit,AreaTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e46f33cd486fe42c714c909e32966b4c', 'OverdueFineSetList_add,OverdueFineSetList_edit,OverdueFineSetList_del,OverdueFineSetList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e4d2578abb2e36eb4aea5fa8caed2a51', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e75a41ba4a2bc299e3b50a15580a103b', 'ServiceList_add,ServiceList_edit,ServiceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'f15eee7156a6e9821ad60ea9747b6878', 'EstateList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'fd23f24a96e40753c6e0f1286bf47326', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'fefe8e9ee335dadbace082923415e023', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdeg454c5e6c1e94ee70cc833asd142', 'IntegralList_add,IntegralList_edit,IntegralList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdsfeg4157cf483a790f4eea35ds5675', 'OptgroupValueList_add,OptgroupValueList_edit,OptgroupValueList_del,OptgroupTree_add,OptgroupTree_edit,OptgroupTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 't110147c5e6c1e94ee70cc833aa7f5d3', 'AgeList_add,AgeList_edit,AgeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'v465654c5e6c1e94ee70cc833asd142', 'CreditList_add,CreditList_edit,CreditList_del');

-- ----------------------------
-- Table structure for `t_borrowing_loan`
-- ----------------------------
DROP TABLE IF EXISTS `t_borrowing_loan`;
CREATE TABLE `t_borrowing_loan` (
  `loan_id` varchar(32) NOT NULL,
  `loan_code` varchar(50) default NULL,
  `member_id` varchar(32) default NULL,
  `loan_title` varchar(50) default NULL,
  `loan_picture` varchar(255) default NULL,
  `loan_tender_id` varchar(32) default NULL,
  `loan_purpose_id` varchar(32) default NULL,
  `loan_deadlines_id` varchar(32) default NULL,
  `failed_reason` enum('manually','other') default NULL,
  `is_day_marked` enum('no','yes') default NULL,
  `is_bid_reward` enum('no','yes') default NULL,
  `bid_pro_reward` float default NULL,
  `fixed_app_reward` float default NULL,
  `is_bid_marked` enum('no','yes') default NULL,
  `ready_rec_money` float default NULL,
  `is_bid_pwd` enum('no','yes') default NULL,
  `bid_pwd` varchar(10) default NULL,
  `loan_management_fees` float default NULL,
  `repayment_type_id` varchar(32) default NULL,
  `loan_total` float default NULL,
  `loan_apr` float default NULL,
  `lowest_bid_money` varchar(50) default NULL,
  `largest_bid_money` varchar(50) default NULL,
  `lowest_sub` float default NULL,
  `sub_total` float default NULL,
  `alr_sub_sum` float default NULL,
  `alr_tender_pro` float default NULL,
  `tender_sum` float default NULL,
  `wait_bid_deadlines` varchar(50) default NULL,
  `loan_detail` varchar(500) default NULL,
  `is_account_funds` enum('no','yes') default NULL,
  `is_loan_funds` enum('no','yes') default NULL,
  `is_credit_amount` enum('no','yes') default NULL,
  `is_bid_funds` enum('no','yes') default NULL,
  `is_automatic_bid` enum('no','yes') default NULL,
  `is_recommend` enum('no','yes') default NULL,
  `create_time` datetime default NULL,
  `loan_date` datetime default NULL,
  `member_ip` varchar(50) default NULL,
  `loan_state` enum('firstAudit','tendering','secondAuditor','repaymenting','completed','bids') default NULL,
  `remark` varchar(255) default NULL,
  `first_audit_state` enum('firstSucess','firstFailure') default NULL,
  `first_auditor_id` varchar(32) default NULL,
  `first_advice` varchar(500) default NULL,
  `first_mes_notice` varchar(500) default NULL,
  `first_audit_date` datetime default NULL,
  `second_audit_state` enum('secondSucess','secondFailure') default NULL,
  `second_auditor_id` varchar(32) default NULL,
  `second_advice` varchar(500) default NULL,
  `second_mes_notice` varchar(500) default NULL,
  `second_audit_date` datetime default NULL,
  `creater` varchar(32) default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  `alr_bid_money` float default NULL COMMENT '已投标金额',
  PRIMARY KEY  (`loan_id`),
  KEY `FK_t_borrowing_loan_t_loan_tender_loan_tender_id` (`loan_tender_id`),
  CONSTRAINT `t_borrowing_loan_ibfk_1` FOREIGN KEY (`loan_tender_id`) REFERENCES `t_loan_tender` (`loan_tender_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_borrowing_loan
-- ----------------------------
INSERT INTO `t_borrowing_loan` VALUES ('0807d75c82783213a1be6f16bbac6a34', '借款_201405271402', '0d06ae74d5a50659c4c40d4ee980a748', '借钱开公司', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', 'aa09e227a4a40cb6cb15703b98522672', '买房借款', '2', null, 'yes', 'yes', '0.1', '0', 'yes', null, 'no', null, null, 'e444483d3b503b99d7572d2008e5b099', '10', '0.1', '200', '20000', '100', '0', '0', '0', '0', '2', '10', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-05-27 14:02:48', '2014-05-27 14:02:48', null, 'firstAudit', '10', null, null, null, null, null, null, null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 14:02:48', null);
INSERT INTO `t_borrowing_loan` VALUES ('4535fsdfaf9f2c9bc59bbc6df4523s34', '装修', '0d06ae74d5a50659c4c40d4ee980a748', '装修', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '1c362eac7ec315aa47ab84360d4e390d', '资金周转', '4', 'other', 'no', 'no', '0', '0', 'no', '1000', 'no', '0', '0.1', 'e444483d3b503b99d7572d2008e5b099', '5000', '0.12', '100', '1000', '100', '0', '0', '0', '0', '2', '装修', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-21 10:08:21', '2014-04-21 10:08:24', null, 'bids', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', ' 	初审通过   ', ' 	初审通过   ', '2014-04-21 14:06:24', 'secondSucess', '', ' ', '', '2014-04-21 14:06:21', '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 14:38:50', '0');
INSERT INTO `t_borrowing_loan` VALUES ('4b9939b5b3f8e449e5e38eec61db3227', '借款_201405271359', '0d06ae74d5a50659c4c40d4ee980a748', '借钱买坦克', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '资金周转', '3', 'other', 'yes', 'yes', '0.1', '0', 'yes', null, 'no', null, null, 'e444483d3b503b99d7572d2008e5b099', '10000', '0.1', '10000', '100000', '100', '0', '0', '0', '0', '2', '', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-05-27 13:59:39', '2014-05-27 13:59:39', null, 'bids', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', '', '', '2014-06-19 10:34:16', null, null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 08:45:02', null);
INSERT INTO `t_borrowing_loan` VALUES ('5627fc801ee0205417d66b1daec10423', '扩大经营生产', '225b8f6a7863d52f947b265f869e48be', '扩大经营生产', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140522/20140522143627_500.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '资金周转', '3', 'other', 'no', 'no', '0', '0', 'no', '1000', 'no', '0', '0.1', 'e444483d3b503b99d7572d2008e5b099', '12000', '0.24', '500', '2000', '100', '0', '0', '0', '0', '5', '扩大经营生产', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-18 11:10:27', '2014-05-21 15:28:07', null, 'bids', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', ' 	初审通过   	初审通过  ', ' 	初审通过   	初审通过  ', '2014-05-27 13:44:39', 'secondSucess', '', '', '', '2014-04-29 10:16:37', '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 10:24:16', '0');
INSERT INTO `t_borrowing_loan` VALUES ('80ebfeaf9f2c9bc59bbc66d588a0fcb9', '购置家电', '225b8f6a7863d52f947b265f869e48be', '购置家电', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140522/20140522143627_500.jpg', '1c362eac7ec315aa47ab84360d4e390d', '短期周转', '7', 'other', 'no', 'no', '0', '0', 'no', '1000', 'no', '0', '0.1', 'e444483d3b503b99d7572d2008e5b099', '20000', '0.24', '100', '200', '100', '0', '0', '0', '0', '1', '购置家电', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-18 11:10:52', '2014-05-14 15:28:10', null, 'bids', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', ' 	初审通过   ', ' 	初审通过   ', '2014-05-27 13:44:29', 'secondSucess', '', ' ', '', '2014-05-09 16:19:40', '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-05-09 16:19:40', '0');
INSERT INTO `t_borrowing_loan` VALUES ('8f81ba9da78723695ab5764db5b570a2', '借款_201405271403', '0d06ae74d5a50659c4c40d4ee980a748', '借钱回家', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '1c362eac7ec315aa47ab84360d4e390d', '长期使用', '2', null, 'yes', 'yes', '0.12', '0', 'yes', null, 'yes', '123', null, 'e444483d3b503b99d7572d2008e5b099', '1000', '0.12', '200', '200', '100', '0', '0', '0', '0', '3', '111', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-05-27 14:03:26', '2014-05-27 14:03:26', null, 'firstAudit', '1000', null, null, null, null, null, null, null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 14:03:26', null);
INSERT INTO `t_borrowing_loan` VALUES ('9841ce94a6789b3d824994b477c0a148', '采购工程材料', '0d06ae74d5a50659c4c40d4ee980a748', '采购工程材料', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', 'aa09e227a4a40cb6cb15703b98522672', '资金周转', '2', 'other', 'no', 'no', '0', '0', 'no', '1000', 'no', '0', '0.1', '60d13359890d7edfe536ce87af02d6e5', '10000', '0.24', '100', '1000', '500', '0', '0', '0', '0', '5', '采购工程材料', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-22 10:20:00', '2014-05-13 15:28:14', null, 'bids', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', ' 	初审通过   ', ' 	初审通过   ', '2014-05-27 13:44:32', 'secondSucess', null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '0d06ae74d5a50659c4c40d4ee980a748', '2014-06-03 10:24:16', '0');
INSERT INTO `t_borrowing_loan` VALUES ('a2e88edde6ece006c694edbcdc90ea62', '结婚救急', '0d06ae74d5a50659c4c40d4ee980a748', '结婚救急', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '长期使用', '2', null, 'no', 'yes', '0', '100', 'no', '1000', 'no', '0', '0.1', '60d13359890d7edfe536ce87af02d6e5', '10000', '0.24', '100', '1000', '100', '0', '0', '1', '43', '1', '结婚救急', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-22 16:12:47', '2014-05-15 15:28:20', null, 'bids', '', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', ' 	初审通过   ', ' 	初审通过   ', '2014-05-27 13:44:34', 'secondFailure', '8b25651c2d896297530b64e4b80ec503', '复审不通过 ', '复审不通过 ', '2014-05-26 16:58:10', '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '10000');
INSERT INTO `t_borrowing_loan` VALUES ('a74835e0efd680bdffca5adebb196c4e', '购车', '0d06ae74d5a50659c4c40d4ee980a748', '购车', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '9788195653f335695256551b82fcbac6', '资金周转', '3', 'other', 'no', 'no', '0', '0', 'no', '1000', 'no', '0', '100', '60d13359890d7edfe536ce87af02d6e5', '20000', '0.12', '100', '1000', '100', '0', '0', '0.05', '1', '3', '购车', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-05-27 09:27:16', '2014-05-27 13:39:59', null, 'bids', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', ' 	初审通过   ', ' 	初审通过   ', '2014-05-27 13:44:37', 'secondSucess', null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 15:37:01', '1000');
INSERT INTO `t_borrowing_loan` VALUES ('a7dd8236b93b6997a06b6652eca21eb3', '创业资金', '0d06ae74d5a50659c4c40d4ee980a748', '创业资金', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '长期使用', '2', 'other', 'no', 'no', '0', '0', 'no', '1000', 'no', '0', '0.1', '60d13359890d7edfe536ce87af02d6e5', '6000', '0.2', '100', '1000', '100', '0', '0', '0', '0', '1', '创业资金', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-18 11:10:01', '2014-05-16 15:28:25', null, 'bids', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', ' 	初审通过   ', ' 	初审通过   ', '2014-04-21 16:14:11', 'secondSucess', '', '', '', null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-04-21 16:14:11', '0');
INSERT INTO `t_borrowing_loan` VALUES ('d072a1197a690344d0e0b6b6f6bf63c8', '借款_201405271404', '0d06ae74d5a50659c4c40d4ee980a748', '测试净值标', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '9788195653f335695256551b82fcbac6', '资金周转', '2', null, 'yes', 'yes', '0', '100', 'yes', null, 'no', null, null, '1873eeaa00e9e544c759595ffb98ab06', '20000', '0.1', '200', '2000', '100', '0', '0', '0', '0', '2', '', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-05-27 14:04:09', '2014-05-27 14:04:09', null, 'firstAudit', '1000', null, null, null, null, null, null, null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 14:04:09', null);
INSERT INTO `t_borrowing_loan` VALUES ('dff3423436b93b6997a06b66324564c', '日常生活消费', '0d06ae74d5a50659c4c40d4ee980a748', '日常生活消费', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '9788195653f335695256551b82fcbac6', '资金周转', '3', 'other', 'no', 'no', '0', '0', 'no', '1000', 'no', '0', '0.1', 'e444483d3b503b99d7572d2008e5b099', '8000', '0.15', '100', '2000', '100', '100', '16', '0.16', '4', '3', '日常生活消费', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-05-27 13:39:55', '2014-05-17 15:28:29', null, 'repaymenting', '已过筹标期限，此借款变成流标。', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', '	初审通过   ', '	初审通过   ', '2014-05-27 13:43:05', 'secondSucess', '', '', '', '2014-05-27 13:42:59', '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 15:36:44', '1500');

-- ----------------------------
-- Table structure for `t_finance_bank_card`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_bank_card`;
CREATE TABLE `t_finance_bank_card` (
  `bank_card_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `opening_bank` varchar(50) default NULL,
  `subbranch` varchar(50) default NULL,
  `card_name` varchar(20) default NULL,
  `card_number` varchar(20) default NULL,
  `status` enum('authstr','changing','pass','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`bank_card_id`),
  KEY `FK_t_bank_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_bank_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的银行卡表';

-- ----------------------------
-- Records of t_finance_bank_card
-- ----------------------------
INSERT INTO `t_finance_bank_card` VALUES ('6ae3020a31124df7628573b9385e3208', 'f842fdbfe42190da7bea612a54debb31', '交通银行', '香洲唐家支行', '交通2', '1134567299176543215', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 13:14:38', '', 'f842fdbfe42190da7bea612a54debb31', '2014-04-15 14:18:23', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 13:14:38');
INSERT INTO `t_finance_bank_card` VALUES ('757b4d0f3e6b96acfe77cf446743ada2', 'f842fdbfe42190da7bea612a54debb31', '交通银行', '香洲唐家支行', '交通1', '1234567899876543218', 'authstr', null, null, null, 'f842fdbfe42190da7bea612a54debb31', '2014-04-04 17:56:05', 'f842fdbfe42190da7bea612a54debb31', '2014-04-04 17:56:05');
INSERT INTO `t_finance_bank_card` VALUES ('asdfasdfasdasdf', 'f842fdbfe42190da7bea612a54debb31', '工商银行', '珠海香洲支行', '工商1', '1234567899987654321', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:50:32', '审核通过', 'f842fdbfe42190da7bea612a54debb31', '2014-04-04 16:17:55', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:50:32');
INSERT INTO `t_finance_bank_card` VALUES ('dsfasdfasdfevq', 'f842fdbfe42190da7bea612a54debb31', '建设银行', '珠海香洲支行', '建行1', '987654321123456789', 'authstr', null, null, null, 'f842fdbfe42190da7bea612a54debb31', '2014-04-04 16:18:45', 'f842fdbfe42190da7bea612a54debb31', '2014-04-04 16:18:41');

-- ----------------------------
-- Table structure for `t_finance_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_member`;
CREATE TABLE `t_finance_member` (
  `finance_member_id` varchar(32) NOT NULL,
  `bank_card_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL,
  `usable_money` float(20,2) default NULL,
  `frozen_money` float(20,2) default NULL,
  `collecting_money` float(20,2) default NULL,
  `refund_money` float(20,2) default NULL,
  `amount` float(20,2) default NULL,
  `recharge_month_times` float(20,2) default NULL,
  `recharge_times` float(20,2) default NULL,
  `recharge_money` float(20,2) default NULL,
  `withdraw_month_times` float(20,2) default NULL,
  `withdraw_times` float(20,2) default NULL,
  `withdraw_money` float(20,2) default NULL,
  `borrower_credit` float(20,2) default NULL,
  `available_credit` float(20,2) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`finance_member_id`),
  KEY `FK_t_finance_member_t_bank_bank_id` (`bank_card_id`),
  KEY `FK_t_finance_member_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_finance_member_t_bank_bank_id` FOREIGN KEY (`bank_card_id`) REFERENCES `t_finance_bank_card` (`bank_card_id`),
  CONSTRAINT `FK_t_finance_member_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员资金信息表。';

-- ----------------------------
-- Records of t_finance_member
-- ----------------------------
INSERT INTO `t_finance_member` VALUES ('2541ad18f86870b6c621fs1d94ecsf1', '6ae3020a31124df7628573b9385e3208', '0d06ae74d5a50659c4c40d4ee980a748', '1112904.75', '18000.00', '5000.00', '4000.00', '1112910.00', '11.00', '8.00', '43470.00', '10.00', '2.00', '40000.00', '100.00', '10.00', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-08 10:22:32', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48');
INSERT INTO `t_finance_member` VALUES ('42c77f6f02f77271a71e90a07d6b23ea', null, '5e8ff8778334ea358ded91802bb4a086', '900.00', '0.00', '0.00', '0.00', '900.00', '1.00', '1.00', '900.00', '0.00', '0.00', '0.00', '0.00', '0.00', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:55:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56');
INSERT INTO `t_finance_member` VALUES ('adfsfsddfwef', 'asdfasdfasdasdf', 'f842fdbfe42190da7bea612a54debb31', '993556.38', '9500.00', '10000.00', '200.00', '993556.69', '2.00', '2.00', '3000.00', '10.00', '5.00', '40000.00', '100.00', '10.00', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-12 14:07:37', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 10:24:16');
INSERT INTO `t_finance_member` VALUES ('asdfsadfsfdwe', '6ae3020a31124df7628573b9385e3208', 'c61da6243a471bfffbe3fd4101e41242', '1242230.38', '10000.00', '2000.00', '2000.00', '1242230.38', '5.00', '2.00', '3000.00', '10.00', '5.00', '40000.00', '100.00', '10.00', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-26 14:14:25', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');

-- ----------------------------
-- Table structure for `t_finance_overdue_advances`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_overdue_advances`;
CREATE TABLE `t_finance_overdue_advances` (
  `overdue_advances_id` varchar(32) NOT NULL,
  `overdue_advances_name` varchar(50) default NULL COMMENT '逾期垫付管理名称',
  `member_type` enum('general','vip','all') default NULL,
  `feeWay` enum('proportion','directcost') default NULL,
  `value` float default NULL,
  `audit_state` enum('failure','pass','authstr') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`overdue_advances_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的逾期垫付表。';

-- ----------------------------
-- Records of t_finance_overdue_advances
-- ----------------------------
INSERT INTO `t_finance_overdue_advances` VALUES ('13aca8b3e01e6fed580e03dc13f1321b', '逾期垫付设置_001', 'all', null, '12', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:08:08', '', 'TEXT', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 15:02:32', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:08:08');
INSERT INTO `t_finance_overdue_advances` VALUES ('cf9b1a2643490686484e54a89632e8df', '逾期垫付设置_002', 'general', null, '11', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 16:35:28', '', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 13:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 16:35:28');
INSERT INTO `t_finance_overdue_advances` VALUES ('ff3379a817e3de194afcd8dfd728aef4', '逾期垫付设置_003', 'vip', null, '10', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:07:57', '', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-28 16:21:17', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:07:57');

-- ----------------------------
-- Table structure for `t_finance_overdue_advances_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_overdue_advances_record`;
CREATE TABLE `t_finance_overdue_advances_record` (
  `advances_record_id` varchar(32) NOT NULL,
  `overdue_advances_id` varchar(32) NOT NULL,
  `platform_transaction_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `repay_notes_detail_id` varchar(32) default NULL,
  `member_type` enum('general','vip','all') default NULL,
  `advances_percent` varchar(20) default NULL,
  `advances_money` varchar(20) default NULL,
  `audit_state` enum('failure','pass','authstr') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`advances_record_id`),
  KEY `FK_t_advances_record_t_overdue_advances_overdue_advances_id` (`overdue_advances_id`),
  KEY `FK_t_advances_record_t_platform_transaction_id` (`platform_transaction_id`),
  CONSTRAINT `t_finance_overdue_advances_record_ibfk_1` FOREIGN KEY (`platform_transaction_id`) REFERENCES `t_finance_platform_transaction` (`platform_transaction_id`),
  CONSTRAINT `t_finance_overdue_advances_record_ibfk_2` FOREIGN KEY (`overdue_advances_id`) REFERENCES `t_finance_overdue_advances` (`overdue_advances_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的逾期垫付记录表。';

-- ----------------------------
-- Records of t_finance_overdue_advances_record
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_overdue_fine`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_overdue_fine`;
CREATE TABLE `t_finance_overdue_fine` (
  `overdue_fine_id` varchar(32) NOT NULL,
  `overdue_fine_set_id` varchar(32) NOT NULL,
  `overdue_fine_set_name` varchar(50) default NULL,
  `member_id` varchar(32) NOT NULL,
  `repay_notes_detail_id` varchar(32) NOT NULL,
  `overdue_fine_money` float default NULL,
  `should_pay_date` datetime default NULL,
  `actual_pay_date` datetime default NULL,
  `audit_state` enum('failure','pass','authstr') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`overdue_fine_id`),
  KEY `FK_t_overdue_fine_t_overdue_fine_set_overdue_fine_set_id` (`overdue_fine_set_id`),
  CONSTRAINT `t_finance_overdue_fine_ibfk_1` FOREIGN KEY (`overdue_fine_set_id`) REFERENCES `t_finance_overdue_fine_set` (`overdue_fine_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的逾期罚款记录表。';

-- ----------------------------
-- Records of t_finance_overdue_fine
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_overdue_fine_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_overdue_fine_set`;
CREATE TABLE `t_finance_overdue_fine_set` (
  `overdue_fine_set_id` varchar(32) NOT NULL,
  `overdue_fine_set_name` varchar(50) default NULL,
  `member_type` enum('general','vip','all') default NULL,
  `member_privilege` enum('enable','disable') default NULL COMMENT '是否减少VIP会员设定天数',
  `vip_days` float default NULL COMMENT 'vip会员减少天数',
  `value` float default NULL,
  `fee_way` enum('proportion','directcost') default NULL COMMENT 'ȡ�ѷ�ʽ���������û��Զ����ȡ�',
  `audit_state` enum('failure','pass','authstr') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `money` float default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`overdue_fine_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的逾期罚款设置表。';

-- ----------------------------
-- Records of t_finance_overdue_fine_set
-- ----------------------------
INSERT INTO `t_finance_overdue_fine_set` VALUES ('76abd1448d5d81c5f0face3aae68b8e2', 'FineSet_6', 'all', 'enable', '12', null, 'proportion', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 14:08:53', null, '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 14:08:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:07:05');
INSERT INTO `t_finance_overdue_fine_set` VALUES ('7fb1c32f9f8ed0c3ca96572f120161f9', 'FineSet_06', 'all', 'disable', '0', null, 'proportion', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 14:34:47', null, '13', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 14:34:47', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:07:26');
INSERT INTO `t_finance_overdue_fine_set` VALUES ('990c154772f6e74cabcedea2c4f2dfe7', 'DineSet_07', 'general', 'disable', '10', null, 'proportion', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:11:01', null, '100', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:11:01', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:11:01');
INSERT INTO `t_finance_overdue_fine_set` VALUES ('a6fc688e58b233b11e0974d7880d8b65', 'FineSet_4', 'all', 'disable', '0', null, 'proportion', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 17:03:27', null, '100', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 17:03:27', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:07:21');
INSERT INTO `t_finance_overdue_fine_set` VALUES ('bd8521da40f7809ae5019be52c4b2aea', 'FineSet_08', 'all', 'disable', '0', null, 'proportion', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-06-06 10:49:58', null, '0', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-06 10:49:58', '8b25651c2d896297530b64e4b80ec503', '2014-06-06 10:49:58');

-- ----------------------------
-- Table structure for `t_finance_platform`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_platform`;
CREATE TABLE `t_finance_platform` (
  `finance_platform_id` varchar(32) NOT NULL,
  `platform_code` varchar(50) default NULL,
  `platform_name` varchar(50) default NULL,
  `platform_account` varchar(50) default NULL,
  `platform_money` float default NULL,
  `audit_state` enum('failure','pass','authstr') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  `opening_bank` varchar(50) default NULL COMMENT '开户行',
  `card_name` varchar(30) default NULL COMMENT '银行卡名称',
  `subbranch` varchar(50) default NULL COMMENT '支行',
  `card_number` varchar(30) default NULL COMMENT '银行卡号',
  `platform_type` enum('external','default') default NULL COMMENT '资金平台类型',
  PRIMARY KEY  (`finance_platform_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的平台资金信息表。';

-- ----------------------------
-- Records of t_finance_platform
-- ----------------------------
INSERT INTO `t_finance_platform` VALUES ('50b708e8fbaa5649c74a11cf475e2796', '1001', '小风平台资金', '1055644646298', '44', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-05-19 17:19:06', 'bbbbb', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-16 13:42:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:22:43', '工商银行', '工商信用卡', '哈工大工商支行', '448865456456', 'external');
INSERT INTO `t_finance_platform` VALUES ('779704b7753c12ae409909291ba72399', '1002', '冰川平台资金', '1055644646234', '14403', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:43', '......', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-16 13:42:01', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48', '工商银行', '工商储蓄卡', '哈工大工商支行', '577878745678', 'default');
INSERT INTO `t_finance_platform` VALUES ('sdf54s5df454sd45sg', '1003', '哈工大平台资金', '1055644646265', '20000', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 09:51:31', 'yjtjtjtj', null, '8b25651c2d896297530b64e4b80ec503', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:51', '邮政银行', '邮政储蓄卡', '哈工大邮政支行', '854518788888', 'external');

-- ----------------------------
-- Table structure for `t_finance_platform_transaction`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_platform_transaction`;
CREATE TABLE `t_finance_platform_transaction` (
  `platform_transaction_id` varchar(32) NOT NULL,
  `finance_platform_id` varchar(32) NOT NULL,
  `transaction_target` varchar(32) default NULL,
  `transaction_type` varchar(100) default NULL,
  `earning_money` float default NULL,
  `expend_money` float default NULL,
  `amount` float default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`platform_transaction_id`),
  KEY `FK_t_platform_transaction_t_platform_finance_platform_id` (`finance_platform_id`),
  CONSTRAINT `t_finance_platform_transaction_ibfk_1` FOREIGN KEY (`finance_platform_id`) REFERENCES `t_finance_platform` (`finance_platform_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的平台交易明细表。';

-- ----------------------------
-- Records of t_finance_platform_transaction
-- ----------------------------
INSERT INTO `t_finance_platform_transaction` VALUES ('0341d560a05c0520781fd25b842bfad6', '779704b7753c12ae409909291ba72399', '张三', '充值', '4990', '0', '8623', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:23:37', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:23:37');
INSERT INTO `t_finance_platform_transaction` VALUES ('0a7db986e7745c1490d8c76c0def909d', '779704b7753c12ae409909291ba72399', '张三', '充值', '1800', '0', '2733', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:21:05', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:21:05');
INSERT INTO `t_finance_platform_transaction` VALUES ('445528e89a0cc6c2db97756f3c91f5ce', '779704b7753c12ae409909291ba72399', '张三', '充值', '1990', '0', '10613', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:46:21', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:46:21');
INSERT INTO `t_finance_platform_transaction` VALUES ('a3s5gsdg454g5weg5saf', 'sdf54s5df454sd45sg', '李四', '借款', '2000', '100', '50000', null, null, null, null, null);
INSERT INTO `t_finance_platform_transaction` VALUES ('b3c9845139de312366b7aafd6e81a1e9', '779704b7753c12ae409909291ba72399', '宋俊东', '充值', '900', '0', '933', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56');
INSERT INTO `t_finance_platform_transaction` VALUES ('c519c79cd047767fe43fae591e7d9bd9', '779704b7753c12ae409909291ba72399', '张三', '充值', '1800', '0', '12413', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:56:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:56:08');
INSERT INTO `t_finance_platform_transaction` VALUES ('c5873303ce1a471264281399f5977902', '779704b7753c12ae409909291ba72399', '张三', '充值', '900', '0', '3633', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:22:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:22:53');
INSERT INTO `t_finance_platform_transaction` VALUES ('de4aeed3848ff6e43c6eddc18860daea', '779704b7753c12ae409909291ba72399', '张三', '充值', '1990', '0', '14403', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48');

-- ----------------------------
-- Table structure for `t_finance_recharge`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge`;
CREATE TABLE `t_finance_recharge` (
  `finance_recharge_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `finance_recharge_set_id` varchar(32) NOT NULL,
  `recharge_receipt` varchar(50) default NULL COMMENT '充值回执',
  `recharge_code` varchar(50) default NULL COMMENT '流水号（编号）',
  `recharge_amount` float default NULL,
  `handling_charge` float default NULL,
  `recharge_rate` float default NULL,
  `arrive_money` float default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL COMMENT '审核状态',
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`finance_recharge_id`),
  KEY `FK_t_recharge_t_recharge_set_finance_recharge_set_id` (`finance_recharge_set_id`),
  KEY `FK_t_finance_recharge_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_finance_recharge_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`),
  CONSTRAINT `FK_t_recharge_t_recharge_set_finance_recharge_set_id` FOREIGN KEY (`finance_recharge_set_id`) REFERENCES `t_finance_recharge_set` (`finance_recharge_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员充值记录表。';

-- ----------------------------
-- Records of t_finance_recharge
-- ----------------------------
INSERT INTO `t_finance_recharge` VALUES ('0268ab1f51e5f8e759cbabeb3b6b3ea4', '0d06ae74d5a50659c4c40d4ee980a748', 'b6cb483c206fbdbe370d5941a10a1c1f', '222020285122', '充值_201405211125', '10000', '4124', '4124', '5876', 'authstr', null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-21 11:25:12', null, null);
INSERT INTO `t_finance_recharge` VALUES ('04320c09c0b47b0111f81d08c2606d66', '0d06ae74d5a50659c4c40d4ee980a748', 'b6cb483c206fbdbe370d5941a10a1c1f', '', '充值_201406271645', '2000', '10', '10', '1990', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:46:21', '', '充值成功', '0d06ae74d5a50659c4c40d4ee980a748', '2014-06-27 16:45:00', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:46:21');
INSERT INTO `t_finance_recharge` VALUES ('0b883c5bd5731e5256678ec2477555d8', '5e8ff8778334ea358ded91802bb4a086', '8f49f6dcbe06833f65c44220e6552676', '', '充值_201406271458', '1000', '100', '0.1', '900', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56', '充值成功,系统自动审核通过', '充值成功', '5e8ff8778334ea358ded91802bb4a086', '2014-06-27 14:58:56', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56');
INSERT INTO `t_finance_recharge` VALUES ('274edb12ac4c45fe974565b711524e38', '0d06ae74d5a50659c4c40d4ee980a748', '8f49f6dcbe06833f65c44220e6552676', '', '充值_201406271656', '2000', '200', '0.1', '1800', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:56:08', '充值成功,系统自动审核通过', '充值成功', '0d06ae74d5a50659c4c40d4ee980a748', '2014-06-27 16:56:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:56:08');
INSERT INTO `t_finance_recharge` VALUES ('2cdf6e0da5717d64fc3c81645836ebc9', '0d06ae74d5a50659c4c40d4ee980a748', '1ac50d47c763ea03f6892d84fc4f7a4d', '', '充值_201406271621', '2000', '200', '0.1', '1800', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:21:05', '充值成功,系统自动审核通过', '充值成功', '0d06ae74d5a50659c4c40d4ee980a748', '2014-06-27 16:21:05', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:21:05');
INSERT INTO `t_finance_recharge` VALUES ('a7be6c589322d8a2a94dc27a39c63c99', '0d06ae74d5a50659c4c40d4ee980a748', '8f49f6dcbe06833f65c44220e6552676', '', '充值_201406271622', '1000', '100', '0.1', '900', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:22:53', '充值成功,系统自动审核通过', '充值成功', '0d06ae74d5a50659c4c40d4ee980a748', '2014-06-27 16:22:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:22:53');
INSERT INTO `t_finance_recharge` VALUES ('bbe9b49c974ffdc7c7e2cea0f3d90a80', '0d06ae74d5a50659c4c40d4ee980a748', '1ac50d47c763ea03f6892d84fc4f7a4d', '', '充值_201405211125', '50000', '5000', '0.1', '45000', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-21 11:25:22', '系统自动审核通过', null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-21 11:25:22', '8b25651c2d896297530b64e4b80ec503', '2014-05-21 11:25:22');
INSERT INTO `t_finance_recharge` VALUES ('c2dcda6d0092f4b1f58e5a6dcb9bdc2e', '0d06ae74d5a50659c4c40d4ee980a748', 'b6cb483c206fbdbe370d5941a10a1c1f', '', '充值_201406271623', '5000', '10', '10', '4990', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:23:37', '', '充值成功', '0d06ae74d5a50659c4c40d4ee980a748', '2014-06-27 16:23:04', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:23:37');
INSERT INTO `t_finance_recharge` VALUES ('cd9b05d1a9c2d49b7c5c187533a83812', '0d06ae74d5a50659c4c40d4ee980a748', 'b6cb483c206fbdbe370d5941a10a1c1f', '', '充值_201406271647', '2000', '10', '10', '1990', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48', '', '充值成功', '0d06ae74d5a50659c4c40d4ee980a748', '2014-06-27 16:47:11', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48');

-- ----------------------------
-- Table structure for `t_finance_recharge_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge_set`;
CREATE TABLE `t_finance_recharge_set` (
  `finance_recharge_set_id` varchar(32) NOT NULL,
  `recharge_set_name` varchar(32) default NULL,
  `recharge_type` enum('offline','onLine') default NULL,
  `recharge_rate` float default NULL,
  `member_type` enum('general','vip','all') default NULL,
  `value` float default NULL,
  `fee_way` enum('proportion','directcost') default NULL,
  `audit_state` enum('failure','pass','authstr') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`finance_recharge_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员充值设置表。';

-- ----------------------------
-- Records of t_finance_recharge_set
-- ----------------------------
INSERT INTO `t_finance_recharge_set` VALUES ('1ac50d47c763ea03f6892d84fc4f7a4d', '支付宝', 'onLine', '0.1', 'all', '0.2', 'proportion', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 16:29:34', '', '支付宝', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:02', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 16:18:21');
INSERT INTO `t_finance_recharge_set` VALUES ('8f49f6dcbe06833f65c44220e6552676', '财务通', 'onLine', '0.1', 'vip', '0.2', 'proportion', 'failure', null, null, null, '财务通', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:22', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 16:18:26');
INSERT INTO `t_finance_recharge_set` VALUES ('b6cb483c206fbdbe370d5941a10a1c1f', '线下充值', 'offline', '10', 'general', '10', 'directcost', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 16:33:52', '', '线下充值', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 11:07:59', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:53:01');

-- ----------------------------
-- Table structure for `t_finance_transaction`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_transaction`;
CREATE TABLE `t_finance_transaction` (
  `transaction_id` varchar(32) NOT NULL,
  `finance_member_id` varchar(32) NOT NULL,
  `member_id` varchar(32) default NULL,
  `transaction_target` varchar(32) default NULL COMMENT '交易对方',
  `transaction_type` varchar(100) default NULL COMMENT '交易类型',
  `earning_money` float(20,2) default NULL COMMENT '收入金额',
  `expend_money` float(20,2) default NULL COMMENT '支出金额',
  `usable_money` float(20,2) default NULL COMMENT '可用金额',
  `frozen_money` float(20,2) default NULL COMMENT '冻结金额',
  `collecting_money` float(20,2) default NULL COMMENT '代收金额',
  `refund_money` float(20,2) default NULL COMMENT '代还金额',
  `amount` float(20,2) default NULL COMMENT '总金额',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`transaction_id`),
  KEY `FK_t_finance_transaction_t_finance_member _finance_member_id` (`finance_member_id`),
  KEY `FK_t_finance_transaction_t_member_member_id` USING BTREE (`member_id`),
  CONSTRAINT `FK_t_finance_transaction_t_finance_member _finance_member_id` FOREIGN KEY (`finance_member_id`) REFERENCES `t_finance_member` (`finance_member_id`),
  CONSTRAINT `FK_t_finance_transaction_t_member _member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员资金交易明细表。';

-- ----------------------------
-- Records of t_finance_transaction
-- ----------------------------
INSERT INTO `t_finance_transaction` VALUES ('08de1ef089b63e9b03251de301e2148b', '2541ad18f86870b6c621fs1d94ecsf1', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '1200.00', '0.00', '1099434.75', '18000.00', '5000.00', '4000.00', '1099440.00', '借款[日常生活消费]变为流标,解冻投标金额[1200.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20');
INSERT INTO `t_finance_transaction` VALUES ('1622693bfb9a3c10f1ce7781fe0f0473', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '1241150.38', '11000.00', '2000.00', '2000.00', '1241150.38', '投标借款[测试流转标],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:38', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:38');
INSERT INTO `t_finance_transaction` VALUES ('1b1d632ff04fce29ec07fd2539e13ae6', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', 'zhagnsan', '解冻投标金额', '100.00', '0.00', '1098034.75', '19400.00', '5000.00', '4000.00', '1098040.00', '借款[日常生活消费]变为流标,解冻投标金额[100.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20');
INSERT INTO `t_finance_transaction` VALUES ('2372b20f52bc81413220ada619e5d1bb', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '冻结投标金额', '0.00', '200.00', '1238150.38', '14000.00', '2000.00', '2000.00', '1238150.38', '投标借款[测试流转标],冻结投标金额[200.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:02', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:02');
INSERT INTO `t_finance_transaction` VALUES ('25cd45723570cb4c7c1f2e24e28e8760', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '冻结投标金额', '0.00', '800.00', '1239350.38', '12800.00', '2000.00', '2000.00', '1239350.38', '投标借款[测试流转标],冻结投标金额[800.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:49', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:49');
INSERT INTO `t_finance_transaction` VALUES ('2922ff953a20a7f2e5ab575393b30b80', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '500.00', '0.00', '990656.38', '11900.00', '10000.00', '200.00', '990656.69', '借款[测试流转标]审核不通过,解冻投标金额[500.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('2c98a8b4e5664163cbae7e5be0e1ddb3', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '900.00', '988036.38', '14900.00', '10000.00', '200.00', '988036.69', '投标借款[测试流转标],冻结投标金额[900.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:50', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:50');
INSERT INTO `t_finance_transaction` VALUES ('2ef2e4e9152fdfda5c08a9949381756a', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '991956.38', '11100.00', '10000.00', '200.00', '991956.69', '投标借款[购车],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 15:37:01', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 15:37:01');
INSERT INTO `t_finance_transaction` VALUES ('2fa4b98a05903c71e7384caa857f0900', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '992056.38', '10000.00', '10000.00', '200.00', '992056.69', '借款[测试流转标]审核不通过,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('3819f0f8ae6874a77cb7e66f9f3e9106', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', 'zhagnsan', '解冻投标金额', '100.00', '0.00', '1097534.75', '19900.00', '5000.00', '4000.00', '1097540.00', '借款[日常生活消费]变为流标,解冻投标金额[100.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20');
INSERT INTO `t_finance_transaction` VALUES ('3ae0d04c9f75a20d3e0cc62abf563dd6', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'lisi', '解冻投标金额', '300.00', '0.00', '993256.38', '9800.00', '10000.00', '200.00', '993256.69', '借款[扩大经营生产]变为流标,解冻投标金额[300.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 10:24:16', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 10:24:16');
INSERT INTO `t_finance_transaction` VALUES ('40fb9a0b474371b748fa5c2bfc82b823', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '1238350.38', '13800.00', '2000.00', '2000.00', '1238350.38', '投标借款[测试流转标],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:54', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:54');
INSERT INTO `t_finance_transaction` VALUES ('41d2b599eb8d69eb92c4fbd2c03161bd', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '988936.38', '14000.00', '10000.00', '200.00', '988936.69', '投标借款[测试流转标],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:44', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:44');
INSERT INTO `t_finance_transaction` VALUES ('6ff5594313bd2aec2a0bf4a74bbab4d6', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '1240150.38', '12000.00', '2000.00', '2000.00', '1240150.38', '投标借款[测试流转标],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:14:43');
INSERT INTO `t_finance_transaction` VALUES ('7567cab163c8c4645b7f1f9e88950164', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '990936.38', '12000.00', '10000.00', '200.00', '990936.69', '投标借款[测试流转标],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:35', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:35');
INSERT INTO `t_finance_transaction` VALUES ('7a3597db7e1e574a1c5ffc16cafda152', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '989656.38', '12400.00', '10000.00', '200.00', '989656.69', '借款[测试流转标]审核不通过,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('7a69ea7da3da8a03c8e54a233535aafd', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '987056.38', '15000.00', '10000.00', '200.00', '987056.69', '借款[测试流转标]审核不通过,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('809670e4758392da93ebe0256d10d6f1', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', '系统账号', '充值', '900.00', '0.00', '1102134.75', '18000.00', '5000.00', '4000.00', '1102140.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:22:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:22:53');
INSERT INTO `t_finance_transaction` VALUES ('81253b49dea8fb2d4d1bef0aa54fff4f', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', 'zhagnsan', '解冻投标金额', '200.00', '0.00', '1098234.75', '19200.00', '5000.00', '4000.00', '1098240.00', '借款[日常生活消费]变为流标,解冻投标金额[200.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20');
INSERT INTO `t_finance_transaction` VALUES ('83d09fc07640adb1881950b03c909efa', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', '系统账号', '充值', '1990.00', '0.00', '1109114.75', '18000.00', '5000.00', '4000.00', '1109120.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:46:21', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:46:21');
INSERT INTO `t_finance_transaction` VALUES ('8b44c97c84f2925f74b84a7227926c67', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '1239430.38', '11800.00', '2000.00', '2000.00', '1239430.38', '借款[测试流转标]审核不通过,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('91978e423bfd92fa9916641c4b575aa6', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', '系统账号', '充值', '1800.00', '0.00', '1110914.75', '18000.00', '5000.00', '4000.00', '1110920.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:56:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:56:08');
INSERT INTO `t_finance_transaction` VALUES ('92ab6295eb2890b99f07adb223213e3a', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '1241230.38', '10000.00', '2000.00', '2000.00', '1241230.38', '借款[测试流转标]审核不通过,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('a245e75afbdc4980964f4675ac154691', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '900.00', '0.00', '991156.38', '11000.00', '10000.00', '200.00', '991156.69', '借款[测试流转标]审核不通过,解冻投标金额[900.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('a279bc9c23f93bd6eae065b035acc173', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '988656.38', '13400.00', '10000.00', '200.00', '988656.69', '借款[测试流转标]审核不通过,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('a281ca683daef32eb67044e4dba7f926', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', 'zhagnsan', '解冻投标金额', '100.00', '0.00', '1097934.75', '19500.00', '5000.00', '4000.00', '1097940.00', '借款[日常生活消费]变为流标,解冻投标金额[100.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20');
INSERT INTO `t_finance_transaction` VALUES ('a52ea0fd94cada4f3365919ede511810', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '解冻投标金额', '200.00', '0.00', '1239230.38', '12800.00', '2000.00', '2000.00', '1239230.38', '借款[测试流转标]审核不通过,解冻投标金额[200.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('a6fce472631ff1817ad0357226e5c0c6', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '1238230.38', '13000.00', '2000.00', '2000.00', '1238230.38', '借款[测试流转标]审核不通过,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('acb5db0a7c3fdb073e8d76412aff46c1', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '989936.38', '13000.00', '10000.00', '200.00', '989936.69', '投标借款[测试流转标],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:40', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:40');
INSERT INTO `t_finance_transaction` VALUES ('ae0ee1f7135c7da941c29a75b07ae0c9', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '1000.00', '991936.38', '11000.00', '10000.00', '200.00', '991936.69', '投标借款[测试流转标],冻结投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:31', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:31');
INSERT INTO `t_finance_transaction` VALUES ('ae33a7f8dd65313e4c2d34711a501d2d', '2541ad18f86870b6c621fs1d94ecsf1', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '200.00', '0.00', '1097734.75', '19700.00', '5000.00', '4000.00', '1097740.00', '借款[日常生活消费]变为流标,解冻投标金额[200.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20');
INSERT INTO `t_finance_transaction` VALUES ('c2dbf1ec9e154a9ad100a517a2599b75', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'lisi', '解冻投标金额', '300.00', '0.00', '993556.38', '9500.00', '10000.00', '200.00', '993556.69', '借款[扩大经营生产]变为流标,解冻投标金额[300.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 10:24:16', '8b25651c2d896297530b64e4b80ec503', '2014-06-03 10:24:16');
INSERT INTO `t_finance_transaction` VALUES ('c40cf5633928c7e234924ac919019274', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '500.00', '987536.38', '15400.00', '10000.00', '200.00', '987536.69', '投标借款[测试流转标],冻结投标金额[500.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:59', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:15:59');
INSERT INTO `t_finance_transaction` VALUES ('c8d9890a79885b0b9f9136d8c7a148ab', '42c77f6f02f77271a71e90a07d6b23ea', '5e8ff8778334ea358ded91802bb4a086', '系统账号', '充值', '900.00', '0.00', '900.00', '0.00', '0.00', '0.00', '900.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56');
INSERT INTO `t_finance_transaction` VALUES ('ccaa9e83ae576c80075715d9ed12f4b8', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '1000.00', '0.00', '992956.38', '10100.00', '10000.00', '200.00', '992956.69', '借款[购车]变为流标,解冻投标金额[1000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:40:33', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:40:33');
INSERT INTO `t_finance_transaction` VALUES ('d1a727231e30aa5d5b71afc11b0c4a83', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', '系统账号', '充值', '1990.00', '0.00', '1112904.75', '18000.00', '5000.00', '4000.00', '1112910.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48');
INSERT INTO `t_finance_transaction` VALUES ('d52442a7901640f70da3e2aa0d9a8bbb', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '600.00', '986936.38', '16000.00', '10000.00', '200.00', '986936.69', '投标借款[测试流转标],冻结投标金额[600.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:16:04', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 15:16:04');
INSERT INTO `t_finance_transaction` VALUES ('d63bc3de03e0702b6060fea39a4a5929', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', '系统账号', '充值', '1800.00', '0.00', '1101234.75', '18000.00', '5000.00', '4000.00', '1101240.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:21:05', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:21:05');
INSERT INTO `t_finance_transaction` VALUES ('db4b2927a1468452c23251d7f66fc840', '2541ad18f86870b6c621fs1d94ecsf1', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '100.00', '0.00', '1097834.75', '19600.00', '5000.00', '4000.00', '1097840.00', '借款[日常生活消费]变为流标,解冻投标金额[100.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:45:20');
INSERT INTO `t_finance_transaction` VALUES ('e05dad34934c8c3b85d450434afff37e', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '冻结投标金额', '0.00', '100.00', '992956.38', '10100.00', '10000.00', '200.00', '992956.69', '投标借款[日常生活消费],冻结投标金额[100.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 15:36:44', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 15:36:44');
INSERT INTO `t_finance_transaction` VALUES ('e09d7068b29d7773fdd4d90fba17bf09', 'asdfsadfsfdwe', 'c61da6243a471bfffbe3fd4101e41242', 'zhagnsan', '解冻投标金额', '800.00', '0.00', '1240430.38', '11000.00', '2000.00', '2000.00', '1240430.38', '借款[测试流转标]审核不通过,解冻投标金额[800.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');
INSERT INTO `t_finance_transaction` VALUES ('ee47698a2575f6f8626e4d5763b94067', '2541ad18f86870b6c621fs1d94ecsf1', '0d06ae74d5a50659c4c40d4ee980a748', '系统账号', '充值', '4990.00', '0.00', '1107124.75', '18000.00', '5000.00', '4000.00', '1107130.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:23:37', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 16:23:37');
INSERT INTO `t_finance_transaction` VALUES ('f5a8390491fefedcb9c1f3dab666565f', 'adfsfsddfwef', 'f842fdbfe42190da7bea612a54debb31', 'zhagnsan', '解冻投标金额', '600.00', '0.00', '988056.38', '14400.00', '10000.00', '200.00', '988056.69', '借款[测试流转标]审核不通过,解冻投标金额[600.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10', '8b25651c2d896297530b64e4b80ec503', '2014-05-26 16:58:10');

-- ----------------------------
-- Table structure for `t_finance_withdraw`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_withdraw`;
CREATE TABLE `t_finance_withdraw` (
  `finance_withdraw_id` varchar(32) NOT NULL,
  `withdraw_code` varchar(50) default NULL,
  `member_id` varchar(32) NOT NULL,
  `opening_bank` varchar(50) default NULL,
  `subbranch` varchar(50) default NULL,
  `card_name` varchar(20) default NULL,
  `card_number` varchar(20) default NULL,
  `withdraw_amount` float default NULL,
  `arrive_money` float default NULL,
  `handling_charge` float default NULL,
  `withdraw_rate` float default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL COMMENT '审核状态',
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`finance_withdraw_id`),
  KEY `FK_t_finance_withdraw_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_finance_withdraw_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员提现记录表。';

-- ----------------------------
-- Records of t_finance_withdraw
-- ----------------------------
INSERT INTO `t_finance_withdraw` VALUES ('dsfsd234523562fdf', '0001', '0d06ae74d5a50659c4c40d4ee980a748', '工商银行', '唐家支行', '李四', '440982', '20000', '19000', '1000', '0', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-05-21 10:46:16', '审核通过', '提现', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 14:26:44', '8b25651c2d896297530b64e4b80ec503', '2014-05-21 10:46:16');

-- ----------------------------
-- Table structure for `t_loan_review`
-- ----------------------------
DROP TABLE IF EXISTS `t_loan_review`;
CREATE TABLE `t_loan_review` (
  `loan_review_id` varchar(32) NOT NULL,
  `loan_id` varchar(32) default NULL,
  `review_content` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`loan_review_id`),
  KEY `FK_t_loan_review_t_borrowing_loan_loan_id` (`loan_id`),
  CONSTRAINT `t_loan_review_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `t_borrowing_loan` (`loan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loan_review
-- ----------------------------
INSERT INTO `t_loan_review` VALUES ('1b9402d6f255cefbdf63f700bab8fb40', 'a2e88edde6ece006c694edbcdc90ea62', '我是第三哈哈', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-07 13:09:34');
INSERT INTO `t_loan_review` VALUES ('84e46bf1229d01abeeb3a26efd589510', 'a2e88edde6ece006c694edbcdc90ea62', 'aaa', null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-06 09:01:25');
INSERT INTO `t_loan_review` VALUES ('adfsa', '4535fsdfaf9f2c9bc59bbc6df4523s34', '啊啊啊啊', '啊啊', '8b25651c2d896297530b64e4b80ec503', '2014-05-04 16:44:42');
INSERT INTO `t_loan_review` VALUES ('asdfdw', '5627fc801ee0205417d66b1daec10423', 'fdafas', 'ad', '8b25651c2d896297530b64e4b80ec503', '2014-05-04 16:45:15');
INSERT INTO `t_loan_review` VALUES ('bef49b11b76fc36ef0bcc4ae156c4ca0', 'a2e88edde6ece006c694edbcdc90ea62', 'n hao a hah', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-07 11:31:31');

-- ----------------------------
-- Table structure for `t_loan_tender`
-- ----------------------------
DROP TABLE IF EXISTS `t_loan_tender`;
CREATE TABLE `t_loan_tender` (
  `loan_tender_id` varchar(32) NOT NULL,
  `loanr_tender_name` varchar(32) default NULL,
  `description` varchar(255) default NULL,
  `state` enum('open','close') default NULL,
  `lowest_loan_amount` float default NULL,
  `largest_loan_amount` float default NULL,
  `loan_money_multiple` float default NULL,
  `lowest_apr` float default NULL,
  `loan_deadlines_mon` varchar(50) default NULL,
  `loan_deadlines_day` varchar(50) default NULL,
  `wait_bid_deadlines` varchar(50) default NULL,
  `lowest_bid_money` varchar(50) default NULL,
  `largest_bid_money` varchar(50) default NULL,
  `is_bid_reward` enum('no','yes') default NULL,
  `largest_apr` float default NULL COMMENT '已投标金额',
  `alr_bid_money` float default NULL,
  `is_bid_pwd` enum('no','yes') default NULL,
  `lowest_reward_pro` float default NULL,
  `largest_reward_pro` float default NULL,
  `lowest_reward_money` float default NULL,
  `largest_reward_money` float default NULL,
  `vip_freeze_bail` float default NULL,
  `general_freeze_bail` float default NULL,
  `adv_over_month` float default NULL,
  `adv_over_day` float default NULL,
  `loan_mana_fee_month` float default NULL,
  `loan_mana_fee_day` float default NULL,
  `limited_periods` float default NULL,
  `over_limited_fee` float default NULL,
  `subscription_state` enum('open','close') default NULL,
  `guarantee_agency_id` varchar(32) default NULL,
  `anti_guarantee_id` varchar(32) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`loan_tender_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loan_tender
-- ----------------------------
INSERT INTO `t_loan_tender` VALUES ('1c362eac7ec315aa47ab84360d4e390d', '信用标', '说明：信用借款标显示\"信\"字标记，是一种免抵押、免担保、纯信用，最高授信为10万元的小额个人信用借款标,主要面向公务员、医生或教师等机关企事业单位的在编人员。如借款人到期还款出现困难，逾期第30~33天由网站风险金补偿，债权转让为晋商贷网站所有。 ', 'open', '200', '100000', null, '0.1', '1,2,3,4,5,6,7,8', '1,2,3,4,5,6,7,8,9,10,11,12', '1,2,3,4,5,6,7,8', '100,200,500,1000,10000', '100,200,500,1000,10000,100000', 'yes', '0.254', null, 'yes', '0.1', null, null, null, null, null, '1', '30', '3000', '2000', '2000', null, 'open', '', '', '用户成功借款后按借款期限一次性从所得借款中直接扣除收取，1个月内统一收取借款金额的1%。从第2个月开始，每个月加收0.4%的手续费（年手续费合计为5.4%）。借款手续费不计息，不退还，在借款金额中直接扣除。作为成交服务费。', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 15:56:21', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 14:00:15');
INSERT INTO `t_loan_tender` VALUES ('2587bd0ecc859e35f2874f2aff0d4852', '流转标', '债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。', 'open', '50000', '200000', null, '0.1', '1,2,3,4,5,6,7', '1,2,3,4,5,6,7,8', '1,2,5,8,9', '100,200,500,1000', '5000,8000,10000,200000', 'yes', '0.24', null, 'yes', '0.1', '0.2', '100', '10000', '10000', '20000', '1', '30', '2000', '1000', '1000', null, 'open', '', '', '债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。投资者对于流转标的购买份额最小为100元/份，流转期限由借款人确定,流转的周期不同，回报收益不同；通常流转期限越长，回报收益则越高。 ', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 14:31:40', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 14:01:15');
INSERT INTO `t_loan_tender` VALUES ('9788195653f335695256551b82fcbac6', '净值标', '说明：净值借款标显示\"净\"字标记，允许发布的最大金额为净资产，净资产小于20万不能发标。发布净值借款标用于临时周转，可以循环借款，但用户提现将受到限制。他是一种相对安全系数很高的借款标，因此利率方面可能比较低，用户可以借助此标放大自己的资金杠杆。 ', 'open', '1000', '200000', '2', '1.2', '1,2,3,4,5,7,9', '1,2,3,4,5,6,7,8,9', '1,2,3,4,5,6,7,8', '100,200,500,1000', '1000,2000,5000,10000,20000', 'yes', '2.4', null, 'yes', '2', '20', '100', '2000', '10000', '20000', '5', '5', null, null, null, null, 'open', '', '', '说明：净值借款标显示', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:13:50', '8b25651c2d896297530b64e4b80ec503', '2014-04-30 14:11:00');
INSERT INTO `t_loan_tender` VALUES ('aa09e227a4a40cb6cb15703b98522672', '抵押标', '说明：抵质押借款标显示 \"抵\"字标记，是经过线下严格核查借款人资产负债、抵押担保（矿资源房产、土地抵押等）、优质资产和股权等有价证券质押担保手续，然后通过平台发布借款需求，【晋商贷】对借贷方提供连带担保责任的业务品种，确保风险控制在最低水平。', 'open', '1000', '1e+006', '100', '0.2', '1,2,3,4,5', '1,2,3,4,5', '1,2,3,4,5', '100,200,500,1000,10000', '1000,20000,50000', 'yes', '0.4', null, 'yes', '5', '2', '2', '5', '2', '2', '2', '2', '22', '30', '20', '1000', 'open', '', '', '说明：抵质押借款标显示 ', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:13:03', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 14:00:45');

-- ----------------------------
-- Table structure for `t_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_loginlog`;
CREATE TABLE `t_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) default NULL,
  `login_user` varchar(32) default NULL,
  `login_time` datetime default NULL,
  `login_ip` varchar(50) default NULL,
  `browser_version` varchar(50) default NULL,
  `screen_size` varchar(50) default NULL,
  PRIMARY KEY  (`loginlog_id`),
  KEY `FK_loginlog_user_loginlog_id` (`user_id`),
  CONSTRAINT `FK_loginlog_user_loginlog_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loginlog
-- ----------------------------
INSERT INTO `t_loginlog` VALUES ('03ba1f49dc148c2dd1b9ad6c7f27967e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 15:05:13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0b3f9745f17ef4e91f28147c3b90eedf', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:03:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0e50747684159b0c768e2f0dcb629a94', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 16:34:32', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('14aefa8ed0a1757b67c1a1bf4827d783', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 15:52:52', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('17ce76e908e00a653029e8d568b4d6be', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 10:30:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1c95ae1b8af81f0b9af6c041fa057f4e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 13:47:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1df8983bf45848095c2191a3f7381e6d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 15:45:37', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('21594b8b26cf367b4ebd08ede2e1955b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 09:51:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('21efc0e07c47bafb68616942466d366b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 15:33:35', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2b6a04f0959a463fd92d6819b4ae6450', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-20 17:03:02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2d27ff474c13bb71f6cff83519b3fea2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:34:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('31e02399ef273fd093a7aa21bccbbfe2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 09:53:30', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('33a13614cd0cefa501095bd0b0cac1c5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:39:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('33cad5d24e8310afab8a82cb05a9ac2d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 10:06:58', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('37f53d11ecc93394d60d9ab50edbd809', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 08:45:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('381410ecf8eec4e06769e44c024a9e6c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 15:01:55', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('39d578e412163ad10e44c60eb038d2b1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 15:12:42', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3d3ca3bff3c0a47e79596b86f4c8661a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-20 16:39:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3f5ee8d48430e1e65cdaf49c7701f113', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-27 14:28:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('46e2456e22e023adc13dfba34288d07d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 09:51:28', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4b3b9a55b9bc93fda7a939a85adb7e10', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:30:27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4b3f79762ae90f4a340b957672e6f034', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 10:21:33', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4fcfde40135807cec8dc8a065fdb415c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 13:36:57', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('53532152bdd962098a74589fd5176658', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 13:22:01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5ceec84f06daba1697838e9d8818f167', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-27 16:20:50', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('61b26d32d77608759f2b4d4f306dde78', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-27 14:16:04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6cd8dac4178da2d8940f835ac7338df5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 10:51:22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('719acd72397a9462d1512c62aa401321', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 13:42:00', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7729628b67142d3f7f1648cf4e0d905c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 17:11:07', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('844fce515c5fe6f64181864ea300bd87', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:33:05', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('88d0611a290034286cc59a6bfd68c5ef', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-20 16:42:54', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8a31a54ddaa185a92e729eb6d8e37129', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 10:28:29', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8ba28cb41f76c5b4df9f05c63d1150f3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 13:17:46', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8c1fac7450b2035759304eb02fb6bbf5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 17:47:31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8e3e298e208634756791c489749b8b5d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 16:00:01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('906cf38daaefd138288296df5995eb11', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 17:51:22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b6e7596d423affc44b3b6b88a789030', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-27 17:28:29', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9c7ec9eded5b01def9518fa97790269e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 17:08:01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a68a315731bc83de6b2eda9e49862abc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-27 14:21:40', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ac4ec14c39bcb77ebaf58c1022bbe022', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:16:19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ae5f2e02d131e3f45255b80d2e2c6bbc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:35:53', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c2d056a158bdc3e34e3c81ac93fc0a7d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 12:29:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c3daf4b8274b1fbdad725b79eca5c9dd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-20 16:29:03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c9dfbbd36fd8e817f0cf731ef31fca63', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 08:53:06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cc544f2fb594c1ee8c1d7a42cfc6739c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 16:02:56', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d8be269836d9bf1e16f091be5f20c8da', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:53:41', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('dc3d319c0eecfc785ca2d6bf876ce927', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 15:25:19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('dffab3e323be646e5769802e229ed6c9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 08:45:18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e1459f1e8e06d8a6b4c4497f7d5d2caa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 13:09:26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e233a9b390a6d8b7aac9220245cb8975', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-20 16:36:38', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e4bd762227f96c5428c6c2ccab45deab', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 10:50:27', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e4dff071a047c5f40ecce60e6d784b55', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 13:29:09', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ecaf157aad490481a3ea3fce16d4197a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-24 08:41:20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f021fee35695758bb6b7a621db49af25', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 14:50:25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f31cb80232fcec62808b5a72220139b1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-26 13:11:37', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f9b66aab39f745d9b8438a1772381494', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-27 16:45:23', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fd7368edbae0960fae7f91ef0e22cc42', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-06-23 08:50:53', '127.0.0.1[本地]', null, null);

-- ----------------------------
-- Table structure for `t_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `member_id` varchar(32) NOT NULL COMMENT '会员Id',
  `member_name` varchar(20) default NULL COMMENT '会员名字',
  `member_password` varchar(64) default NULL COMMENT '会员密码',
  `traders_password` varchar(64) default NULL COMMENT '交易密码',
  `member_real_name` varchar(20) default NULL COMMENT '会员真实姓名',
  `member_photo` varchar(255) default NULL,
  `member_age` int(5) default NULL COMMENT '会员年龄',
  `mobile_number` varchar(20) default NULL COMMENT '手机号码',
  `sex` enum('man','woman','secret') default NULL COMMENT '性别',
  `marital_status` enum('married','single','secret') default NULL COMMENT '状态',
  `card_id` varchar(20) default NULL COMMENT '身份证号',
  `email` varchar(32) default NULL COMMENT '电子邮箱',
  `registration_time` datetime default NULL,
  `credit_integral` float default NULL,
  `integral` float default NULL,
  `creditAmount` float(20,0) default NULL,
  `status` enum('enable','disable') default NULL,
  `type` enum('general','vip') default NULL,
  `valid_time` datetime default NULL COMMENT '类型有效时间',
  `expire_time` datetime default NULL,
  `accessory` varchar(255) default NULL,
  `educational` varchar(32) default NULL,
  `personal_des` varchar(255) default NULL,
  `hometown` varchar(20) default NULL,
  `live_address` varchar(100) default NULL,
  `home_phone` varchar(20) default NULL,
  `first_contact` varchar(10) default NULL,
  `first_contact_relation` enum('family','friend','business') default NULL,
  `first_contact_phone` varchar(20) default NULL,
  `first_contact_address` varchar(100) default NULL,
  `second_contact` varchar(10) default NULL,
  `second_contact_relation` enum('family','friend','business') default NULL,
  `second_contact_phone` varchar(20) default NULL,
  `second_contact_address` varchar(100) default NULL,
  `last_login_time` datetime default NULL COMMENT '最后一次登录时间',
  `last_login_ip_address` varchar(150) default NULL COMMENT '最后一次登录ip地址',
  `login_count` int(10) default NULL COMMENT '登录次数',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员资料表';

-- ----------------------------
-- Records of t_member
-- ----------------------------
INSERT INTO `t_member` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', '张三', 'zhangsan', '12345678', '张三', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '25', '13411379365', 'man', 'single', '440583199110302853', 'cc@d.co', '2014-02-21 15:42:33', '60', '0', '300', 'enable', 'general', null, null, 'ccdd', '大专', 'ccddffee', '湖南', '深圳', '3242334', '', 'friend', '', '', '', 'friend', '', '', '2014-06-27 16:44:46', '127.0.0.1[本地]', '94', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-21 15:42:33', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:43:42');
INSERT INTO `t_member` VALUES ('225b8f6a7863d52f947b265f869e48be', '李四', 'lisi123', '12345678', '李四', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140522/20140522143627_500.jpg', '23', '13411231231', 'woman', 'married', '440583199110302853', '58454@qd.com', '2014-02-21 16:26:38', '0', '0', '300', 'enable', 'general', null, null, 'ee', 'ee', 'ee', '广东', '珠海', '32434243', ' ', 'family', '', '', ' ', 'business', '', '', null, null, '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-21 16:26:38', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:39:12');
INSERT INTO `t_member` VALUES ('5e8ff8778334ea358ded91802bb4a086', '宋俊东', 'bb7ba24588df146b87b89c2f969ac87cc61498cc', null, '宋俊东', null, '21', '13411381321', 'man', 'single', '431081199309212993', '985776597@qq.com', '2014-06-27 14:55:18', '0', '0', '0', 'enable', 'general', null, null, null, '研究生或以上', '', '湖南', '珠海', '2211221', '', 'family', '', '', '', 'family', '', '', '2014-06-27 14:55:40', '127.0.0.1[本地]', '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:55:18', '5e8ff8778334ea358ded91802bb4a086', '2014-06-27 14:56:48');
INSERT INTO `t_member` VALUES ('987166e483ea028eb355ec309aa3def0', '赵丹亦 ', 'zhaodanyi', '12345678', '赵丹亦 ', null, '23', '13511678456', 'woman', 'single', '450802198005262808', '04346249@qq.com', '2014-03-27 13:11:02', '0', '0', '300', 'enable', 'general', null, null, '', '', '', '广东', '珠海', '35678676', '', 'family', '', '', '', 'family', '', '', null, null, '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-27 13:11:02', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:23:36');
INSERT INTO `t_member` VALUES ('c61da6243a471bfffbe3fd4101e41242', '123312', 'lujiele', '12345678', '卢杰乐', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140401/20140401105503_21.jpg', '34', '13798985542', 'man', 'single', '440583199110302853', '04346249@qq.com', '2014-04-01 10:53:19', '0', '0', '300', 'disable', 'general', null, null, '', '', '', '福建', '东莞', '3565443', '', 'family', '', '', '', 'family', '', '', '2014-05-26 15:13:08', '127.0.0.1[本地]', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 10:53:19', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 08:42:51');
INSERT INTO `t_member` VALUES ('e7580ab8a59e33a709af8cdc30e025a3', '小文', 'xiaowen', '12345678', '王小文', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140522/20140522143627_500.jpg', '25', '13411381333', 'man', 'secret', '420201199201129238', '804346249@qq.com', '2014-05-22 14:35:19', '0', '0', '300', 'enable', 'general', null, null, '', '', '为人诚恳', '广东', '珠海', '3355685', '', 'family', '', '', '', 'family', '', '', '2014-05-22 14:35:56', '127.0.0.1[本地]', '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-22 14:35:19', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:04:53');
INSERT INTO `t_member` VALUES ('f842fdbfe42190da7bea612a54debb31', '余泽徐', 'xiaozhe', '12345678', '余泽徐', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140331/20140331091414_175.jpg', '23', '13798985542', 'man', 'single', '440583199110302853', '04346249@qq.com', '2014-03-18 09:14:29', '30', '0', '300', 'enable', 'vip', null, null, '', '', '打篮球', 'aa', '珠海唐家', '33223423', '', 'family', '', '', '', 'family', '', '', '2014-05-27 15:36:31', '192.168.1.109[未分配或者内网IP   ]', '86', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-18 09:14:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:45:44');
INSERT INTO `t_member` VALUES ('fe0d9386ff19d3366901ab1bb1faa5c8', '唐醉柳', 'tangzuiliu', '12345678', '唐醉柳', 'website/resources/upload/attached/image/20140522/20140522143627_500.jpg', '26', '13411584687', 'woman', 'married', '610725197905067682', '406592176@qq.com', '2014-04-30 15:01:21', '10', '0', '300', 'enable', 'general', null, null, '', '', '', '湖南', '广州', '33556778', '', 'family', '', '', '', 'family', '', '', '2014-04-30 15:01:39', '0:0:0:0:0:0:0:1[本地]', '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:13:30');

-- ----------------------------
-- Table structure for `t_member_apply_amount`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_apply_amount`;
CREATE TABLE `t_member_apply_amount` (
  `apply_amount_id` varchar(32) NOT NULL,
  `member_id` varchar(32) default NULL,
  `apply_type` enum('phone','internet','scene') default NULL,
  `original_amount` float(20,2) default NULL,
  `apply_money` float(20,2) default NULL,
  `apply_explanation` varchar(255) default NULL,
  `authorized_amount` float(20,2) default NULL,
  `audit_state` enum('authstr','pass','failure') default NULL,
  `process_explanation` varchar(255) default NULL,
  `apply_date` datetime default NULL,
  `auditor_id` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`apply_amount_id`),
  KEY `FK_t_member_apply_amount_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_apply_amount_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员申请额度表';

-- ----------------------------
-- Records of t_member_apply_amount
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_auth`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_auth`;
CREATE TABLE `t_member_auth` (
  `member_id` varchar(32) NOT NULL default '' COMMENT '会员Id',
  `info_name` varchar(20) default '基本信息认证' COMMENT '基本信息认证名称',
  `info_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '基本资料认证状态',
  `info_accessory` text COMMENT '基本信息认证附件',
  `info_auditor` varchar(32) default NULL COMMENT '基本资料审核人',
  `info_remark` varchar(255) default NULL COMMENT '基本信息审核说明',
  `info_time` datetime default NULL COMMENT '审核时间',
  `info_num` int(10) default NULL COMMENT '基本信息认证排序号',
  `vip_name` varchar(20) default 'VIP认证' COMMENT 'VIP认证名称',
  `vip_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT 'VIP认证状态',
  `vip_accessory` text COMMENT 'VIP认证附件',
  `vip_auditor` varchar(32) default NULL COMMENT 'VIP审核人',
  `vip_remark` varchar(255) default NULL COMMENT 'VIP审核说明',
  `vip_time` datetime default NULL COMMENT 'VIP认证审核说明',
  `vip_num` int(10) default NULL COMMENT 'VIP认证排序',
  `email_name` varchar(20) default '邮箱认证' COMMENT '邮箱认证名称',
  `email_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '邮箱认证状态',
  `email_accessory` text COMMENT '邮箱认证附件',
  `email_auditor` varchar(32) default NULL COMMENT '邮箱认证审核人',
  `email_remark` varchar(255) default NULL COMMENT '邮箱认证审核说明',
  `email_time` datetime default NULL COMMENT '邮箱认证审核时间',
  `email_num` int(10) default NULL COMMENT '邮箱认证排序号',
  `mobile_name` varchar(20) default '手机认证' COMMENT '手机认证名称',
  `mobile_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '手机认证状态',
  `mobile_accessory` text COMMENT '手机认证附件',
  `mobile_auditor` varchar(32) default NULL COMMENT '手机认证审核人',
  `mobile_remark` varchar(255) default NULL COMMENT '手机认证审核说明',
  `mobile_time` datetime default NULL COMMENT '手机认证审核时间',
  `mobile_num` int(10) default NULL COMMENT '手机认证排序号',
  `credit_name` varchar(20) default '信用认证' COMMENT '信用认证名称',
  `credit_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '信用认证状态',
  `credit_accessory` text COMMENT '信用认证附件',
  `credit_auditor` varchar(32) default NULL COMMENT '信用认证审核人',
  `credit_remark` varchar(255) default NULL COMMENT '信用认证审核说明',
  `credit_time` datetime default NULL COMMENT '信用认证审核时间',
  `credit_num` int(10) default NULL COMMENT '信用认证排序号',
  `company_name` varchar(20) default '企业认证' COMMENT '企业认证名称',
  `company_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '企业认证状态',
  `company_accessory` text COMMENT '企业认证附件',
  `company_auditor` varchar(32) default NULL COMMENT '企业认证审核人',
  `company_remark` varchar(255) default NULL COMMENT '企业认证审核说明',
  `company_time` datetime default NULL COMMENT '其它认证审核时间',
  `company_num` int(10) default NULL COMMENT '企业认证排序号',
  `real_name` varchar(20) default '真实姓名认证' COMMENT '真实姓名认证名称',
  `real_name_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '真实姓名认证状态',
  `real_name_accessory` text COMMENT '真实姓名认证附件',
  `real_name_auditor` varchar(32) default NULL COMMENT '真实姓名审核人',
  `real_name_remark` varchar(255) default NULL COMMENT '真实姓名审核说明',
  `real_name_time` datetime default NULL COMMENT '真实姓名审核时间',
  `real_name_num` int(10) default NULL COMMENT '真实姓名排序号',
  `id_card_name` varchar(20) default '身份证认证' COMMENT '身份证认证名称',
  `id_card_accessory` text COMMENT '身份证认证附件',
  `id_card_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '身份证认证状态',
  `id_card_auditor` varchar(32) default NULL COMMENT '身份证认证审核人',
  `id_card_remark` varchar(255) default NULL COMMENT '身份证审核说明',
  `id_card_time` datetime default NULL COMMENT '身份证审核时间',
  `id_card_num` int(10) default NULL COMMENT '身份证认证排序号',
  `work_name` varchar(20) default '工作认证' COMMENT '工作认证名称',
  `work_auth` enum('noapply','authstr','pass','failure') default 'noapply' COMMENT '工作认证状态',
  `work_accessory` text COMMENT '工作认证附件',
  `work_auditor` varchar(32) default NULL COMMENT '工作认证审核人',
  `work_remark` varchar(255) default NULL COMMENT '工作认证审核说明',
  `work_time` datetime default NULL COMMENT '工作认证审核时间',
  `work_num` int(10) default NULL COMMENT '工作认证排序号',
  PRIMARY KEY  (`member_id`),
  KEY `FK_t_member_auth_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_auth_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员认证表';

-- ----------------------------
-- Records of t_member_auth
-- ----------------------------
INSERT INTO `t_member_auth` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', '基本信息认证', 'pass', 'aaaaa', '8b25651c2d896297530b64e4b80ec503', 'aaa', '2014-05-27 13:24:08', '1', 'VIP认证', 'failure', 'aaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 16:46:12', '1', '邮箱认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:42', '1', '手机认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:24', '1', '信用认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 13:37:04', '1', '企业认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 13:35:35', '1', '真实姓名认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 16:46:32', '1', '身份证认证', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140325/20140325170450_46.jpg\" title=\"yd.jpg\" alt=\"yd.jpg\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140325/20140325170458_216.jpg\" title=\"ty.jpg\" alt=\"ty.jpg\" /><br />', 'pass', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:58', '2', '工作认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-05-27 13:24:15', '1');
INSERT INTO `t_member_auth` VALUES ('225b8f6a7863d52f947b265f869e48be', '基本信息认证', 'pass', 'aaaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:00', '2', 'VIP认证', 'authstr', 'aaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:29', '2', '邮箱认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:45', '2', '手机认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:27', '2', '信用认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:56', '2', '企业认证', 'failure', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:39', '2', '真实姓名认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:23', '2', '身份证认证', 'aaaa', 'pass', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:00', '1', '工作认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:45', '2');
INSERT INTO `t_member_auth` VALUES ('5e8ff8778334ea358ded91802bb4a086', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, '8b25651c2d896297530b64e4b80ec503', '邮箱验证通过', '2014-06-27 14:55:18', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);
INSERT INTO `t_member_auth` VALUES ('987166e483ea028eb355ec309aa3def0', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, null, null, '2014-03-27 13:11:02', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);
INSERT INTO `t_member_auth` VALUES ('c61da6243a471bfffbe3fd4101e41242', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, null, null, '2014-04-01 10:53:19', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);
INSERT INTO `t_member_auth` VALUES ('e7580ab8a59e33a709af8cdc30e025a3', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, '8b25651c2d896297530b64e4b80ec503', '邮箱验证通过', '2014-05-22 14:35:19', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);
INSERT INTO `t_member_auth` VALUES ('f842fdbfe42190da7bea612a54debb31', '基本信息认证', 'failure', null, '8b25651c2d896297530b64e4b80ec503', '审核通过', '2014-04-04 13:34:07', null, 'VIP认证', 'noapply', '', null, '', null, null, '邮箱认证', 'pass', '', null, '', '2014-03-18 09:14:29', null, '手机认证', 'noapply', '', null, '', null, null, '信用认证', 'pass', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140327/20140327144627_148.jpg\" title=\"yd.jpg\" alt=\"yd.jpg\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140327/20140327144656_862.jpg\" title=\"sq.jpg\" alt=\"sq.jpg\" />', '8b25651c2d896297530b64e4b80ec503', '审核通过 ', '2014-04-02 17:36:16', null, '企业认证', 'pass', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140326/20140326175838_258.jpg\" title=\"tangwei.jpg\" alt=\"tangwei.jpg\" />', '8b25651c2d896297530b64e4b80ec503', '审核通过', '2014-03-27 11:09:38', null, '真实姓名认证', 'noapply', '', null, '', null, null, '身份证认证', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140326/20140326095412_606.jpg\" title=\"gd.jpg\" alt=\"gd.jpg\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140326/20140326095421_443.jpg\" title=\"fbb.jpg\" alt=\"fbb.jpg\" /><br />', 'pass', '8b25651c2d896297530b64e4b80ec503', '审核通过', '2014-03-26 17:57:34', null, '工作认证', 'failure', '', '8b25651c2d896297530b64e4b80ec503', '审核不通过', '2014-04-04 13:44:51', null);
INSERT INTO `t_member_auth` VALUES ('fe0d9386ff19d3366901ab1bb1faa5c8', '基本信息认证', 'noapply', null, 'fe0d9386ff19d3366901ab1bb1faa5c8', '', '2014-04-30 15:02:22', null, 'VIP认证', 'noapply', null, null, '', null, null, '邮箱认证', 'pass', '', '8b25651c2d896297530b64e4b80ec503', '邮箱验证通过', '2014-04-30 15:01:21', null, '手机认证', 'noapply', '', null, '', null, null, '信用认证', 'noapply', '', null, '', null, null, '企业认证', 'noapply', '', null, '', null, null, '真实姓名认证', 'noapply', '', null, '', null, null, '身份证认证', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150202_74.png\" alt=\"\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150208_364.jpg\" alt=\"\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150213_558.jpg\" alt=\"\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150216_8.jpeg\" alt=\"\" />', 'pass', '8b25651c2d896297530b64e4b80ec503', '', '2014-06-19 10:46:52', null, '工作认证', 'noapply', null, null, '', null, null);

-- ----------------------------
-- Table structure for `t_member_credit_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_credit_integral`;
CREATE TABLE `t_member_credit_integral` (
  `credit_integral_id` varchar(32) NOT NULL COMMENT '信用积分Id',
  `member_id` varchar(32) default NULL COMMENT '会员Id',
  `integral_type` enum('infoAuth','vipAuth','emailAuth','mobileAuth','creditAuth','companyAuth','realNameAuth','idCardAuth','workAuth') default NULL COMMENT '积分类型',
  `change_type` enum('increase','reduction') default NULL COMMENT '改变类型',
  `change_value` int(10) default NULL COMMENT '改变分值',
  `remark` varchar(255) default NULL COMMENT '备注',
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`credit_integral_id`),
  KEY `FK_t_credit_integral_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_credit_integral_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员信用积分表';

-- ----------------------------
-- Records of t_member_credit_integral
-- ----------------------------
INSERT INTO `t_member_credit_integral` VALUES ('10c95fea5e18e8bf05d0fedf1ff2875c', 'f842fdbfe42190da7bea612a54debb31', 'companyAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-27 11:09:38', '8b25651c2d896297530b64e4b80ec503', '2014-03-27 11:09:38');
INSERT INTO `t_member_credit_integral` VALUES ('1433b756451506a5c1a45867fd47bdff', 'e7580ab8a59e33a709af8cdc30e025a3', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-22 14:35:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-22 14:35:20');
INSERT INTO `t_member_credit_integral` VALUES ('146231981fcbd8d4d91413654417623c', '0d06ae74d5a50659c4c40d4ee980a748', 'companyAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:35:35', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:35:35');
INSERT INTO `t_member_credit_integral` VALUES ('2a48b995f06e8c1a27fbf6bacf63794d', '0d06ae74d5a50659c4c40d4ee980a748', 'realNameAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32');
INSERT INTO `t_member_credit_integral` VALUES ('359ee618d92f0cf67860ad60ecef9185', '0d06ae74d5a50659c4c40d4ee980a748', 'workAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:15', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:15');
INSERT INTO `t_member_credit_integral` VALUES ('4227abe292af03d1dff9fb22cf10482c', 'c61da6243a471bfffbe3fd4101e41242', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 10:53:19', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 10:53:19');
INSERT INTO `t_member_credit_integral` VALUES ('69fc8e2fb7445e877838fada891329a2', '5e8ff8778334ea358ded91802bb4a086', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:55:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:55:18');
INSERT INTO `t_member_credit_integral` VALUES ('7c4beb512df1ac0b1f5346607d5ca552', 'f842fdbfe42190da7bea612a54debb31', 'creditAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-02 17:36:16', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 17:36:16');
INSERT INTO `t_member_credit_integral` VALUES ('af2aaf0e9c2391c116e4c50f978e5799', '0d06ae74d5a50659c4c40d4ee980a748', 'infoAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:08', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:08');
INSERT INTO `t_member_credit_integral` VALUES ('b295d1c6d240cc58bac45bf12ff99057', '987166e483ea028eb355ec309aa3def0', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-27 13:11:02', '8b25651c2d896297530b64e4b80ec503', '2014-03-27 13:11:02');
INSERT INTO `t_member_credit_integral` VALUES ('cb93d2b09155200129ab96d8b3559055', 'fe0d9386ff19d3366901ab1bb1faa5c8', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21', '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21');
INSERT INTO `t_member_credit_integral` VALUES ('d6c618dd7d4748481ca71e45b1d99050', 'f842fdbfe42190da7bea612a54debb31', 'idCardAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:57:34', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:57:34');
INSERT INTO `t_member_credit_integral` VALUES ('dswe75465g44ty43345', '225b8f6a7863d52f947b265f869e48be', 'emailAuth', 'reduction', '10', '投资获取信用积分5', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:04:52', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:04:50');
INSERT INTO `t_member_credit_integral` VALUES ('e3699ea8806e321755137456d992d85a', '0d06ae74d5a50659c4c40d4ee980a748', 'creditAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:37:04', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:37:04');
INSERT INTO `t_member_credit_integral` VALUES ('f3d93f7d6569b52d5c943220e3a95e1b', 'fe0d9386ff19d3366901ab1bb1faa5c8', 'idCardAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:46:52', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:46:52');
INSERT INTO `t_member_credit_integral` VALUES ('hd5675465g44ty435y5y', '0d06ae74d5a50659c4c40d4ee980a748', 'emailAuth', 'increase', '10', '借款获得信用积分2', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 17:41:48', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 17:41:50');

-- ----------------------------
-- Table structure for `t_member_estate`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_estate`;
CREATE TABLE `t_member_estate` (
  `estate_id` varchar(32) NOT NULL COMMENT '会员房产Id',
  `member_id` varchar(32) default NULL COMMENT '会员Id',
  `address` varchar(50) default NULL COMMENT '地址',
  `area` float(20,2) default NULL COMMENT '面积',
  `year_built` datetime default NULL COMMENT '建筑年份',
  `age_expenses` enum('mortgage','finished') default NULL COMMENT '供款状况',
  `first_owner` varchar(32) default NULL COMMENT '所有权人一',
  `second_owner` varchar(32) default NULL COMMENT '所有权人二',
  `loan_period` datetime default NULL COMMENT '贷款年限',
  `month_contributions` float(20,2) default NULL COMMENT '每月供款',
  `outstand_balances` float(20,2) default NULL COMMENT '尚欠贷款余额',
  `mortgage_bank` varchar(50) default NULL COMMENT '按揭银行',
  `audit_state` enum('pass','authstr','failure') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
  `audit_remark` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`estate_id`),
  KEY `FK_t_member_estate_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_estate_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员房产表';

-- ----------------------------
-- Records of t_member_estate
-- ----------------------------
INSERT INTO `t_member_estate` VALUES ('sdfsdf3432sc32', '0d06ae74d5a50659c4c40d4ee980a748', '广东省珠海市', '100.00', '2014-02-22 17:16:55', 'mortgage', '小李', '张三', '2014-02-22 17:17:01', '2000.00', '5000.00', '工商银行', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-05 17:47:51', 'ss', 'ss', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 16:26:25', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:10:22');

-- ----------------------------
-- Table structure for `t_member_finance`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_finance`;
CREATE TABLE `t_member_finance` (
  `member_id` varchar(32) NOT NULL default '' COMMENT '会员Id',
  `ave_income` float(20,2) default NULL COMMENT '月均收入',
  `ave_income_des` varchar(100) default NULL COMMENT '收入构成描述',
  `ave_expenses` float(20,2) default NULL COMMENT '月均支出',
  `age_expenses_des` varchar(100) default NULL COMMENT '支出构成描述',
  `buy_estate` enum('havehouse','nohouse') default NULL COMMENT '是否购房',
  `estate_value` float(20,2) default NULL COMMENT '房产价值',
  `buy_car` enum('havecar','nocar') default NULL COMMENT '是否购车',
  `car_value` float(20,2) default NULL COMMENT '车辆价值',
  `car_auth` enum('authstr','pass','failure') default NULL,
  `company_name` varchar(50) default NULL COMMENT '参股企业名称',
  `companies_capital_con` varchar(50) default NULL COMMENT '参股企业出资额',
  `other_assets_described` varchar(100) default NULL COMMENT '其他资产描述',
  `first_united` varchar(10) default NULL COMMENT '第一联保人',
  `first_united_contact` enum('family','friend','business') default NULL COMMENT '第一联保人关系',
  `first_united_phone` varchar(20) default NULL COMMENT '第一联保人电话',
  `second_united` varchar(10) default NULL COMMENT '第二联保人',
  `second_contact` enum('family','friend','business') default NULL COMMENT '第二联保人关系',
  `second_phone` varchar(20) default NULL COMMENT '第二联保人电话',
  `estate_auth` enum('authstr','pass','failure') default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`member_id`),
  KEY `FK_t_member_finance_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_finance_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员财务信息表';

-- ----------------------------
-- Records of t_member_finance
-- ----------------------------
INSERT INTO `t_member_finance` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', '10000.00', '工资+奖金', '5000.00', '生活费', 'havehouse', '1000000.00', 'nocar', '200000.00', 'pass', '哈哈', '10000', '兼职', '小米', 'friend', '13798976669', '小兰', 'friend', '13798985546', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 18:01:04', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 18:00:59');
INSERT INTO `t_member_finance` VALUES ('225b8f6a7863d52f947b265f869e48be', '20000.00', '工资+奖金', '10000.00', '生活费', 'nohouse', '2000000.00', 'havecar', '100000.00', 'authstr', '呵呵', '10000', '兼职', '小虎', 'business', '13798976652', '小芳', 'family', '13798975412', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 10:12:57', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 10:13:02');

-- ----------------------------
-- Table structure for `t_member_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_integral`;
CREATE TABLE `t_member_integral` (
  `member_integral_id` varchar(32) NOT NULL COMMENT '会员积分Id',
  `member_id` varchar(32) NOT NULL COMMENT '会员Id',
  `type` enum('login','borrow','withdraw','recharge','invest') default NULL COMMENT '积分类型',
  `change_type` enum('increase','reduction') default NULL,
  `change_value` int(10) default NULL,
  `remark` varchar(255) default NULL COMMENT '备注',
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`member_integral_id`),
  KEY `FK_t_member_integral_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_integral_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员积分表';

-- ----------------------------
-- Records of t_member_integral
-- ----------------------------
INSERT INTO `t_member_integral` VALUES ('456fewfsdf43523df32q32', '225b8f6a7863d52f947b265f869e48be', 'borrow', 'increase', '5', '借款获得5积分', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:42:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:42:14');
INSERT INTO `t_member_integral` VALUES ('afdsasfd', 'f842fdbfe42190da7bea612a54debb31', 'recharge', 'increase', '1', '充值获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:03', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:51');
INSERT INTO `t_member_integral` VALUES ('afdsfdsafsadfsadf', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:15', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:42');
INSERT INTO `t_member_integral` VALUES ('asdfadsafasdf', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:11', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:37');
INSERT INTO `t_member_integral` VALUES ('asdfasdf', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:24', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:28');
INSERT INTO `t_member_integral` VALUES ('asdfasdfad', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:32:55', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:31');
INSERT INTO `t_member_integral` VALUES ('asdfsafdasdfasdf', 'f842fdbfe42190da7bea612a54debb31', 'borrow', 'increase', '5', '贷款积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:19', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:44');
INSERT INTO `t_member_integral` VALUES ('asdfsdf324dfssadf', 'f842fdbfe42190da7bea612a54debb31', 'invest', 'increase', '5', '投资积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:06', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:34');
INSERT INTO `t_member_integral` VALUES ('asfdasdfdsfa', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:32:58', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:54');
INSERT INTO `t_member_integral` VALUES ('asfdsdafasdfasdf', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:08', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:39');
INSERT INTO `t_member_integral` VALUES ('fadsfaaadda', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:27', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:46');
INSERT INTO `t_member_integral` VALUES ('fdsaadasfd', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:32:53', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:25');
INSERT INTO `t_member_integral` VALUES ('ffdsaddasdf', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:21', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:48');
INSERT INTO `t_member_integral` VALUES ('fsdfewfsdf43523df32qrt', '0d06ae74d5a50659c4c40d4ee980a748', 'login', 'increase', '1', '登录获得1积分', '8b25651c2d896297530b64e4b80ec503', '2014-02-11 15:09:02', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 15:09:07');

-- ----------------------------
-- Table structure for `t_member_message_notice`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_message_notice`;
CREATE TABLE `t_member_message_notice` (
  `message_notice_id` varchar(32) NOT NULL,
  `sender` varchar(32) default NULL COMMENT '发信人',
  `addressee` varchar(32) default NULL COMMENT '收信人',
  `title` varchar(50) default NULL COMMENT '标题',
  `content` varchar(255) default NULL COMMENT '内容',
  `sendTime` datetime default NULL COMMENT '发送时间',
  `letterStatus` enum('read','unread','delete') default NULL COMMENT '信件状态（已读，未读，删除）',
  `letterType` enum('notSystem','system') default NULL COMMENT '信件类型（系统消息or非系统消息）',
  `remark` varchar(255) default NULL COMMENT '备注',
  `creater` varchar(32) default NULL COMMENT '创建人',
  `create_time` datetime default NULL COMMENT '创建时间',
  `updater` varchar(32) default NULL COMMENT '更新人',
  `update_time` datetime default NULL COMMENT '更新时间',
  PRIMARY KEY  (`message_notice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_message_notice
-- ----------------------------
INSERT INTO `t_member_message_notice` VALUES ('13db2a772f92a1a49b471e3ae26a13a1', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-12 15:37:04', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:37:04', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:37:04');
INSERT INTO `t_member_message_notice` VALUES ('177b246773a4a6431e798710da2662a3', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '真实姓名认证审核通知', '您的真实姓名认证审核状况:通过', '2014-04-14 16:46:32', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32');
INSERT INTO `t_member_message_notice` VALUES ('19a6fe030693c3df4cfc54e356a79f61', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '工作认证审核通知', '您的工作认证审核状况:通过', '2014-05-27 13:24:15', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:15', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:15');
INSERT INTO `t_member_message_notice` VALUES ('1de0ec93cd3be668e7368edcba25dcf0', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-13 17:20:34', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-13 17:20:34', '8b25651c2d896297530b64e4b80ec503', '2014-05-13 17:20:34');
INSERT INTO `t_member_message_notice` VALUES ('2720f1352dd4d96ca1d84fe4e7b9273d', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-12 15:29:46', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:29:46', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:29:46');
INSERT INTO `t_member_message_notice` VALUES ('2c07a4ebc9660b4b1d4eef004caf6f9f', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '基本信息认证审核通知', '您的基本信息认证审核状况:不通过', '2014-04-14 16:46:43', 'read', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:43', '8b25651c2d896297530b64e4b80ec503', '2014-04-17 17:38:43');
INSERT INTO `t_member_message_notice` VALUES ('33f009dc2db99aeb98f3270cbedb1f52', '8b25651c2d896297530b64e4b80ec503', null, '借款标题为：借钱回家老婆,满标审核通知', '复审通过', '2014-05-09 16:19:40', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-09 16:19:40', '8b25651c2d896297530b64e4b80ec503', '2014-05-09 16:19:40');
INSERT INTO `t_member_message_notice` VALUES ('3d7e51afc10095f5e35b2ad4cdf6697e', '8b25651c2d896297530b64e4b80ec503', 'e7580ab8a59e33a709af8cdc30e025a3', '邮箱认证审核通知', '您的邮箱认证审核状况:通过', '2014-05-22 14:35:20', 'read', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-22 14:35:20', '8b25651c2d896297530b64e4b80ec503', '2014-05-22 14:36:02');
INSERT INTO `t_member_message_notice` VALUES ('49df6560020281a83ffba8cb3655d589', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '审核信息', '					复审通过 \r\n				', '2014-05-12 11:05:22', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-12 11:05:22', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:31:57');
INSERT INTO `t_member_message_notice` VALUES ('51b3ebb0b2b0498dbfe11e6f6022b9ee', '8b25651c2d896297530b64e4b80ec503', 'fe0d9386ff19d3366901ab1bb1faa5c8', '身份证认证审核通知', '您的身份证认证审核状况:通过', '2014-06-19 10:46:52', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:46:52', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:46:52');
INSERT INTO `t_member_message_notice` VALUES ('57246cfd02166b0c19262d079f5b2ea1', '8b25651c2d896297530b64e4b80ec503', null, '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-12 10:11:32', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-12 10:11:32', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 10:11:32');
INSERT INTO `t_member_message_notice` VALUES ('658004ec8ae719999c595da201c979ea', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-12 16:39:21', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-12 16:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 16:39:21');
INSERT INTO `t_member_message_notice` VALUES ('7b8f8f4b11ae0d7ce4bb1509f448298d', '8b25651c2d896297530b64e4b80ec503', null, '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-12 09:29:05', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-12 09:29:05', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 09:29:05');
INSERT INTO `t_member_message_notice` VALUES ('81e2abd52cc81171372f7498e956d9fc', '8b25651c2d896297530b64e4b80ec503', 'fe0d9386ff19d3366901ab1bb1faa5c8', '邮箱认证审核通知', '您的邮箱认证审核状况:通过', '2014-04-30 15:01:21', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21', '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21');
INSERT INTO `t_member_message_notice` VALUES ('84f603ff7769cd78348148144fb8f577', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '基本信息认证审核通知', '您的基本信息认证审核状况:通过', '2014-05-27 13:24:08', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:08', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:24:08');
INSERT INTO `t_member_message_notice` VALUES ('8ff2d269b41d322ad8fab12e132051c9', '8b25651c2d896297530b64e4b80ec503', null, null, null, '2014-06-23 13:14:38', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-23 13:14:38', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 13:14:38');
INSERT INTO `t_member_message_notice` VALUES ('aa57327c618b8595f0ec75c417b9662e', '8b25651c2d896297530b64e4b80ec503', 'f842fdbfe42190da7bea612a54debb31', '基本资料审核通知', '					\r\n		审核通过，信用分10分。		', '2014-04-09 17:16:17', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-09 17:16:17', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 17:16:17');
INSERT INTO `t_member_message_notice` VALUES ('c812a24cf91ed5fa3c9a45299eebb014', '8b25651c2d896297530b64e4b80ec503', 'f842fdbfe42190da7bea612a54debb31', '哈哈', '										你懂的					\r\n				\r\n				\r\n				', '2014-04-09 17:15:13', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-09 17:15:13', '8b25651c2d896297530b64e4b80ec503', '2014-04-10 09:02:37');
INSERT INTO `t_member_message_notice` VALUES ('ee9adf709dc532faa403e714e409eb3b', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-19 14:26:40', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-19 14:26:40', '8b25651c2d896297530b64e4b80ec503', '2014-05-19 14:26:40');
INSERT INTO `t_member_message_notice` VALUES ('f5e50ce856ca4f868748f101666e0c81', '8b25651c2d896297530b64e4b80ec503', null, '借款标题为：测试流转标,满标审核通知', '复审通过 ', '2014-05-09 16:24:59', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-09 16:24:59', '8b25651c2d896297530b64e4b80ec503', '2014-05-09 16:24:59');
INSERT INTO `t_member_message_notice` VALUES ('fecbaca9b1b52cf19a765133b3ef28e1', '8b25651c2d896297530b64e4b80ec503', '5e8ff8778334ea358ded91802bb4a086', '邮箱认证审核通知', '您的邮箱认证审核状况:通过', '2014-06-27 14:55:18', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:55:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:55:18');

-- ----------------------------
-- Table structure for `t_member_secret_security`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_secret_security`;
CREATE TABLE `t_member_secret_security` (
  `secret_security_id` varchar(32) NOT NULL,
  `question_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL,
  `answer` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`secret_security_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_secret_security
-- ----------------------------
INSERT INTO `t_member_secret_security` VALUES ('534df13218b8bf1a42813dda631d123c', '3550a0380ba642fc470530373dad0d89', 'f842fdbfe42190da7bea612a54debb31', '茂南', null, null, '2014-04-17 16:08:52', null, '2014-04-17 16:08:52');
INSERT INTO `t_member_secret_security` VALUES ('7881e9800506b67bc40bcadb29e226d2', 'fbce9b6269e69d3efa74fef9f2b3dc3e', '0d06ae74d5a50659c4c40d4ee980a748', '小学', null, null, '2014-04-17 17:15:33', null, '2014-04-17 17:15:33');
INSERT INTO `t_member_secret_security` VALUES ('a0de25f215990231bbf9e6c636406adb', '7b09183b272b0e14496048c46a687624', '0d06ae74d5a50659c4c40d4ee980a748', '知道', null, null, '2014-04-17 17:15:33', null, '2014-04-17 17:15:33');
INSERT INTO `t_member_secret_security` VALUES ('b54d5b569ff49746d340ed68d3d68cf9', 'da8dd84b35e344dc2dea59f51a194a88', 'f842fdbfe42190da7bea612a54debb31', '科干', null, null, '2014-04-17 16:08:52', null, '2014-04-17 16:08:52');
INSERT INTO `t_member_secret_security` VALUES ('febade9ea4ff7b12b36d16ed397db7ce', 'da8dd84b35e344dc2dea59f51a194a88', '0d06ae74d5a50659c4c40d4ee980a748', '大学', null, null, '2014-04-17 17:15:33', null, '2014-04-17 17:15:33');

-- ----------------------------
-- Table structure for `t_member_statistics`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_statistics`;
CREATE TABLE `t_member_statistics` (
  `statistics_id` varchar(32) NOT NULL COMMENT '统计Id',
  `member_id` varchar(32) default NULL COMMENT '会员Id',
  `total_borrowings` float(20,2) default NULL COMMENT '借款总额',
  `cumulative_loss_profit` float(20,2) default NULL COMMENT '累计亏盈',
  `already_total` float(20,2) default NULL COMMENT '已还总额',
  `wait_also_total` float(20,2) default NULL COMMENT '待还总额',
  `already_income_total` float(20,2) default NULL COMMENT '已收总额',
  `wait_income_total` float(20,2) default NULL COMMENT '待收总额',
  `already_principal` float(20,2) default NULL COMMENT '已还本金',
  `wait_also_principal` float(20,2) default NULL COMMENT '待还本金',
  `already_interest` float(20,2) default NULL COMMENT '已还利息',
  `wait_also_interest` float(20,2) default NULL COMMENT '待还利息',
  `already_income_principal` float(20,2) default NULL COMMENT '已收本金',
  `wait_income_principal` float(20,2) default NULL COMMENT '代收本金',
  `already_income_interest` float(20,2) default NULL COMMENT '已收利息',
  `wait_income_interest` float(20,2) default NULL COMMENT '待收利息',
  `overdue_fine_amount` float(20,2) default NULL COMMENT '逾期罚款金额',
  `overdue_interest_amount` float(20,2) default NULL COMMENT '逾期利息总额',
  `loan_management_amount` float(20,2) default NULL COMMENT '借款管理费',
  `loan_interest_amount` float(20,2) default NULL COMMENT ' 借款利息总额',
  `normal_repayment` int(10) default NULL COMMENT '正常还款次数',
  `advance_repayment` int(10) default NULL COMMENT '提前还款次数',
  `late_repayment` int(10) default NULL COMMENT '逾期还款次数',
  `late` int(10) default NULL COMMENT '迟还次数',
  `website_substitute` int(10) default NULL COMMENT '网站代还次数',
  `investment_total` float(20,2) default NULL COMMENT '投资总额',
  `tender_awards` float(20,2) default NULL COMMENT '投标奖励',
  `promotion_awards` float(20,2) default NULL COMMENT '推广奖励',
  `borrow_success` int(10) default NULL COMMENT '借款成功次数',
  `upline_delta_awards` float(20,2) default NULL COMMENT '线下冲值奖励',
  `continue_awards` float(20,2) default NULL COMMENT '续投奖励',
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`statistics_id`),
  KEY `FK_t_member_statistics_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_statistics_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员借款投资统计';

-- ----------------------------
-- Records of t_member_statistics
-- ----------------------------
INSERT INTO `t_member_statistics` VALUES ('25dd51c2d896297530b64e4b80ec503', '225b8f6a7863d52f947b265f869e48be', '10000.00', '20000.00', '50000.00', '1000.00', '50000.00', '5000.00', '100.00', '200.00', '200.00', '500.00', '600.00', '700.00', '200.00', '100.00', '800.00', '600.00', '200.00', '2000.00', '8', '4', '47', '17', '10', '10000.00', '20000.00', '1000.00', '10', '40000.00', '2000.00', null, null, null, null);
INSERT INTO `t_member_statistics` VALUES ('3455651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '11.00', '22.00', '33.00', '44.00', '445.00', '55.00', '200.00', '400.00', '4000.00', '4000.00', '5000.00', '6000.00', '2000.00', '1000.00', '200.00', '1500.00', '10000.00', '50000.00', '66', '77', '88', '99', '11', '22.00', '33.00', '66.00', '55', '0.00', '88.00', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 13:04:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:00:48');
INSERT INTO `t_member_statistics` VALUES ('d64a618caad0e9a79a46d0bedb936250', '5e8ff8778334ea358ded91802bb4a086', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0', '0', '0', '0', '0', '0.00', '0.00', '0.00', '0', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:55:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:56');

-- ----------------------------
-- Table structure for `t_member_token`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_token`;
CREATE TABLE `t_member_token` (
  `member_id` varchar(32) NOT NULL COMMENT '会员Id和会员表一一对应',
  `username` varchar(30) default NULL COMMENT '用户名',
  `password` varchar(64) default NULL COMMENT '密码',
  `salt` varchar(50) default NULL COMMENT '盐值',
  PRIMARY KEY  (`member_id`),
  KEY `FK_t_member_token_t_member_member_id` USING BTREE (`member_id`),
  CONSTRAINT `FK_t_member_token_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_token
-- ----------------------------
INSERT INTO `t_member_token` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', 'zhangsan', '3c2bcbc72726c2db8b8f4bbd2a6b2d3caa57b9dc', '17aa1bb4d491a29c');
INSERT INTO `t_member_token` VALUES ('5e8ff8778334ea358ded91802bb4a086', '宋俊东', 'bb7ba24588df146b87b89c2f969ac87cc61498cc', '315503b5d267f6bc');
INSERT INTO `t_member_token` VALUES ('987166e483ea028eb355ec309aa3def0', '雨中', 'c2355a91280cba570dca2eae66043c85d5da375a', '11b53e365e90d878');
INSERT INTO `t_member_token` VALUES ('c61da6243a471bfffbe3fd4101e41242', '哈哈', '4acf71a7c3b962c446e0b2d8ab504a840aae77bc', '00787498f9beebb2');
INSERT INTO `t_member_token` VALUES ('e7580ab8a59e33a709af8cdc30e025a3', '晕死', '30d24fe4ac8b3a337003b615662fedd18cdbf8e2', 'a16b28de4149d716');
INSERT INTO `t_member_token` VALUES ('f842fdbfe42190da7bea612a54debb31', '小泽', '36bf73f04cafa875716cff2556fa611d5b07fafe', 'b8a703e71a0a8cc0');
INSERT INTO `t_member_token` VALUES ('fe0d9386ff19d3366901ab1bb1faa5c8', '123456', 'fe6b7d338bc001e0051623ff2e46ef215b02d6b0', 'e59ad311b59227c4');

-- ----------------------------
-- Table structure for `t_member_vip`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_vip`;
CREATE TABLE `t_member_vip` (
  `vip_id` varchar(32) NOT NULL COMMENT 'VIPId',
  `member_id` varchar(32) NOT NULL COMMENT '会员Id',
  `vip_level` varchar(32) default NULL COMMENT '等级',
  `vip_integral` int(10) default NULL COMMENT '积分',
  `vip_start` datetime default NULL,
  `vip_end` datetime default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`vip_id`),
  KEY `FK_t_member_vip_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_vip_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员VIP表';

-- ----------------------------
-- Records of t_member_vip
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_work`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_work`;
CREATE TABLE `t_member_work` (
  `member_id` varchar(32) NOT NULL,
  `unit_name` varchar(50) default NULL,
  `unit_phone` varchar(20) default NULL,
  `unit_adress` varchar(50) default NULL,
  `work_age` int(2) default NULL,
  `salary` float default NULL,
  `proof_person` varchar(20) default NULL,
  `proof_phone` varchar(20) default NULL,
  PRIMARY KEY  (`member_id`),
  KEY `FK_t_member_work_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_work_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员工作资料表';

-- ----------------------------
-- Records of t_member_work
-- ----------------------------
INSERT INTO `t_member_work` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', '滨城', '', '', '32', '23', '', '');
INSERT INTO `t_member_work` VALUES ('225b8f6a7863d52f947b265f869e48be', '冰川', '', '', '23', '3', '', '');
INSERT INTO `t_member_work` VALUES ('5e8ff8778334ea358ded91802bb4a086', '冰川软件', '', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('987166e483ea028eb355ec309aa3def0', '哈工大', '', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('c61da6243a471bfffbe3fd4101e41242', '冰川', '', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('e7580ab8a59e33a709af8cdc30e025a3', '冰川软件有限公司', '', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('f842fdbfe42190da7bea612a54debb31', '冰川', '', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('fe0d9386ff19d3366901ab1bb1faa5c8', '冰川', '', '', null, null, '', '');

-- ----------------------------
-- Table structure for `t_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `menu_id` varchar(32) NOT NULL,
  `pid` varchar(32) default NULL,
  `menu_en_name` varchar(30) default NULL,
  `menu_cn_name` varchar(30) default NULL,
  `icon_cls` varchar(50) default NULL,
  `url` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(255) default NULL,
  PRIMARY KEY  (`menu_id`),
  KEY `FK_menu2parent1N` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('0107a40612ffaefe86f255341b6f9e03', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'repaymentNotes', '还款记录', 'icon-standard-application-side-expand', '/do/repaymentNotes/index.htm', '13', '');
INSERT INTO `t_menu` VALUES ('02e56de3282b5404fdba2e2c957d1b92', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'repaymentNotesDetail', '还款记录明细', 'icon-standard-application-view-columns', '/do/repaymentNotesDetail/index.htm', '14', '');
INSERT INTO `t_menu` VALUES ('054464fdb73c76b5cfd4efa16fcaa8e1', '14sdf54157cf483a790f4eea35dsf6f6', 'creditType', '信用类别', 'icon-standard-award-star-silver-1', '/do/creditType/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('055b7c1a9499420b2982a207dc027389', '14sdf54157cf483a790f4eea35dsf6f6', 'parameterBasic', '基础参数', 'icon-standard-application-add', '/do/parameterBasic/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('079cecd38fb5df02ed6e4d84446d072e', 'fefe8e9ee335dadbace082923415e023', 'memberFinance', '会员财务', 'icon-standard-building-delete', '/do/memberFinance/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('0b097738ce712d563199ad7c7240212c', 'b67d550a506255816d54840a853b7a46', 'platformTransaction', '平台资金记录', 'icon-cologne-special-offer', '/do/platformTransaction/index.htm', '8', '');
INSERT INTO `t_menu` VALUES ('10a7f2fd8253d90b8672d4096f8f9ed4', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'loanTender', '标种类型', 'icon-standard-package', '/do/loanTender/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('125cc7156b53015b809d9a27b55fbf57', 'b67d550a506255816d54840a853b7a46', 'overdueFine', '逾期罚款记录', 'icon-cologne-limited-edition', '/do/overdueFine/index.htm', '12', '');
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('185b00f80aaa910fa99d9abc99c84d58', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'LoanReview', '借款留言', 'icon-standard-page-edit', '/do/LoanReview/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('2a93efe5aeae3cdef871447bd49134a0', 'b67d550a506255816d54840a853b7a46', 'financePlatform', '平台资金', 'icon-cologne-credit-card', '/do/financePlatform/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('2ce7311ee180ae794c608251997dad9c', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'receivablesNotesDetail', '收款记录明细', 'icon-standard-application-view-detail', '/do/receivablesNotesDetail/index.htm', '12', '');
INSERT INTO `t_menu` VALUES ('31a605c2a2a777c738a09103b9915615', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingLoanSecAudit', '满标借款', 'icon-standard-money-euro', '/do/borrowingLoan/borrowingLoanSecAudit.htm', '4', '');
INSERT INTO `t_menu` VALUES ('33f5e9959e821a58696e2d2fb5c322fc', '14sdf54157cf483a790f4eea35dsf6f6', 'question', '密保问题', 'icon-standard-lock-delete', '/do/question/index.htm', '9', '');
INSERT INTO `t_menu` VALUES ('3775cc8c3044650697dbb4d8636b5464', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingOverdue', '逾期借款', 'icon-standard-clock-red', '/do/borrowingLoan/borrowingOverdue.htm', '5', '');
INSERT INTO `t_menu` VALUES ('389f33c7b34582376d4d99282faa03b9', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'repaymentType', '还款方式', 'icon-standard-money', '/do/repaymentType/index.htm', '8', '');
INSERT INTO `t_menu` VALUES ('3a0891f27514a093a5869da2afc22268', '6a56f98aba3ed0e794a9906e138195a9', 'AccountBorrow', '借款统计', 'icon-standard-table-row-insert', '/do/accountBorrow/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('3d69786613fe15615172d1ae22defed4', '14sdf54157cf483a790f4eea35dsf6f6', 'integralType', '积分类别', 'icon-standard-coins', '/do/integralType/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('3f029e72ef13db56e8b65866984da722', 'b67d550a506255816d54840a853b7a46', 'withdraw', '提现记录', 'icon-cologne-sign-out', '/do/withdraw/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('43b1d02267e9ed610543845a1c1a24ca', 'b67d550a506255816d54840a853b7a46', 'overdueAdvances', '逾期垫付设置', 'icon-cologne-graphic-design', '/do/overdueAdvances/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('4c654b11b08eecbf6eb4e6688ea83b7d', 'fefe8e9ee335dadbace082923415e023', 'member', '会员信息', 'icon-standard-user', '/do/member/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('4f1b6666b70be892469b6e93c1eb30ce', 'a60cca184eff20fdce88b3f1ab5a9cce', 'nav', '导航信息', 'icon-hamburg-category', '/do/nav/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('51af37d8918504c4ba34a85b1a3d94fc', '6a56f98aba3ed0e794a9906e138195a9', 'AccountLogin', '登录统计', 'icon-hamburg-old-versions', '/do/accountLogin/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('54d652799e07bb8be54483301a89ff90', 'a60cca184eff20fdce88b3f1ab5a9cce', 'help', '帮助中心', 'icon-hamburg-config', '/do/help/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('57c06b09c96c8f852993f07580ffcdfa', 'b67d550a506255816d54840a853b7a46', 'advancesRecord', '逾期垫付记录', 'icon-cologne-print', '/do/advancesRecord/index.htm', '9', '');
INSERT INTO `t_menu` VALUES ('5b6eaabb2c3a020c4d85ab50d11ffd85', 'a60cca184eff20fdce88b3f1ab5a9cce', 'link', '友情链接', 'icon-hamburg-link', '/do/link/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('5db451044c71b4eb5448a4291d538241', 'b67d550a506255816d54840a853b7a46', 'bankCard', '会员银行卡', 'icon-cologne-payment-card', '/do/bankCard/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('6460c4e2cb89b498712c96e9b4d1acce', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingLoan', '所有借款', 'icon-standard-money-dollar', '/do/borrowingLoan/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('6a56f98aba3ed0e794a9906e138195a9', null, '', '统计管理', 'icon-standard-application-view-detail', '', '6', '');
INSERT INTO `t_menu` VALUES ('6b44218344d328305de2bcdf82cb8741', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'tenderNotes', '投标记录', 'icon-standard-anchor', '/do/tenderNotes/index.htm', '9', '');
INSERT INTO `t_menu` VALUES ('703a3f819925f89a9c370c0324d784a0', 'fefe8e9ee335dadbace082923415e023', 'messageNotice', '信息通知', 'icon-standard-comment', '/do/messageNotice/index.htm', '7', '');
INSERT INTO `t_menu` VALUES ('765726125327148f709cb1b98e8e2fb8', '6a56f98aba3ed0e794a9906e138195a9', 'AccountTender', '投标统计', 'icon-standard-table-edit', '/do/accountTender/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('81d6b2292bbe73c29bc76679201662e1', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'receivablesNotes', '收款记录', 'icon-standard-application-side-contract', '/do/receivablesNotes/index.htm', '11', '');
INSERT INTO `t_menu` VALUES ('88ee044d59911b3b1a67ba4cdd0ee90d', 'a60cca184eff20fdce88b3f1ab5a9cce', 'announcement', '公告管理', 'icon-hamburg-pencil', '/do/announcement/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('8b442566ffbc9531ee5e3aef7c41d740', 'fefe8e9ee335dadbace082923415e023', 'memberAuth', '会员认证', 'icon-standard-bell', '/do/memberAuth/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('8b4c5afb8d66b21e8900822c5c6bff35', 'b67d550a506255816d54840a853b7a46', 'recharge', '充值记录', 'icon-cologne-sign-in', '/do/recharge/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('9171c71b4bab5578ef0bbeac30072c73', '6a56f98aba3ed0e794a9906e138195a9', 'memberStatistics', '会员统计', 'icon-cologne-attibutes', '/do/memberStatistics/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-hamburg-hire-me', '/do/user/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('93f6161c579a1df53d49eb2655d29645', 'fefe8e9ee335dadbace082923415e023', 'creditIntegral', '信用记录', 'icon-hamburg-issue', '/do/creditIntegral/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('9dc3357651c9ecbb9b7c51005be28d18', 'fefe8e9ee335dadbace082923415e023', 'secretSecurity', '密保管理', 'icon-standard-application-key', '/do/secretSecurity/index.htm', '8', '');
INSERT INTO `t_menu` VALUES ('a60cca184eff20fdce88b3f1ab5a9cce', null, 'website', '网站管理', 'icon-hamburg-world', '', '7', '');
INSERT INTO `t_menu` VALUES ('a652d3fe69c067cb94b73361351b8378', 'a60cca184eff20fdce88b3f1ab5a9cce', 'news', '新闻管理', 'icon-standard-monitor', '/do/news/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('a99477bf949bcae7143004e369d31d6c', 'b67d550a506255816d54840a853b7a46', 'rechargeSet', '充值设置', 'icon-cologne-product-design', '/do/rechargeSet/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('ab01dd2ac38d920f691bbc65b7a4bfb2', 'a60cca184eff20fdce88b3f1ab5a9cce', 'hiring', '招聘信息', 'icon-hamburg-customers', '/do/hiring/index.htm', '8', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-report-key', '/do/operalog/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('ae024ce004991607d5ae9e725d67cce8', 'fefe8e9ee335dadbace082923415e023', 'applyAmount', '申请额度', 'icon-standard-star', '/do/applyAmount/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('b34761b59816e63743643c6f179683a4', 'a60cca184eff20fdce88b3f1ab5a9cce', 'advertisement', '广告管理', 'icon-standard-tag-orange', '/do/advertisement/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('b67d550a506255816d54840a853b7a46', null, 'finance', '财务管理', 'icon-standard-money-dollar', '', '5', '');
INSERT INTO `t_menu` VALUES ('c3c78541e9041ab6659fd3399aa6445b', 'b67d550a506255816d54840a853b7a46', 'financeMember', '会员资金', 'icon-cologne-suppliers', '/do/financeMember/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('c58c25c6cb2e8d9fdf39493dde51d80d', null, 'borrow', '我要借款', 'icon-standard-award-star-gold-3', '', '4', '');
INSERT INTO `t_menu` VALUES ('c5cbf9f0961aa8249322d9ac20ba996e', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingLoanFirstAudit', '初审借款', 'icon-standard-lock-go', '/do/borrowingLoan/borrowingLoanFirstAudit.htm', '3', '');
INSERT INTO `t_menu` VALUES ('d1f203ea6815e227579b88c5d6235629', '6a56f98aba3ed0e794a9906e138195a9', 'AccountInvest', '投资统计', 'icon-standard-table-multiple', '/do/accountInvest/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('d31f853097d3bd74741d6418f6a2c7d5', 'b67d550a506255816d54840a853b7a46', 'transaction', '会员资金记录', 'icon-cologne-collaboration', '/do/transaction/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('d503136bdab7bbdc8d09f3bbb28fa979', null, 'info', '信息管理', 'icon-hamburg-consulting', '', '8', '');
INSERT INTO `t_menu` VALUES ('d60a6e3369f1b7fdb249aa61ba4add6e', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'gatheringRepayment', '收款还款', 'icon-standard-clock', '/do/borrowingLoan/gatheringRepayment.htm', '10', '');
INSERT INTO `t_menu` VALUES ('de34654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'area', '地区管理', 'icon-hamburg-product', '/do/area/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-report-edit', '/do/loginlog/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('e46f33cd486fe42c714c909e32966b4c', 'b67d550a506255816d54840a853b7a46', 'overdueFineSet', '逾期罚款设置', 'icon-cologne-folder', '/do/overdueFineSet/index.htm', '11', '');
INSERT INTO `t_menu` VALUES ('e4d2578abb2e36eb4aea5fa8caed2a51', 'fefe8e9ee335dadbace082923415e023', 'memberIntegral', '积分记录', 'icon-standard-award-star-gold-2', '/do/memberIntegral/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-hamburg-customers', '/do/role/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('e75a41ba4a2bc299e3b50a15580a103b', 'a60cca184eff20fdce88b3f1ab5a9cce', 'service', '客服服务', 'icon-cologne-customers', '/do/service/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('f15eee7156a6e9821ad60ea9747b6878', 'fefe8e9ee335dadbace082923415e023', 'estate', '房产信息', 'icon-hamburg-home', '/do/estate/index.htm', '9', '');
INSERT INTO `t_menu` VALUES ('fd23f24a96e40753c6e0f1286bf47326', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'attentionBorrowing', '关注借款', 'icon-standard-asterisk-orange', '/do/attentionBorrowing/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('fefe8e9ee335dadbace082923415e023', null, 'member_mgr', '会员管理', 'icon-standard-group', '', '3', '');
INSERT INTO `t_menu` VALUES ('sdeg454c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'integral', '会员积分', 'icon-hamburg-special', '/do/integral/index.htm', '8', '');
INSERT INTO `t_menu` VALUES ('sdsfeg4157cf483a790f4eea35ds5675', '14sdf54157cf483a790f4eea35dsf6f6', 'optgroup', '下拉项管理', 'icon-hamburg-sitemap', '/do/optgroup/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('t110147c5e6c1e94ee70cc833aa7f5d3', '14sdf54157cf483a790f4eea35dsf6f6', 'age', '年龄别称', 'icon-standard-pencil', '/do/age/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('v465654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'credit', '会员信用', 'icon-standard-award-star-gold-3', '/do/credit/index.htm', '6', '');

-- ----------------------------
-- Table structure for `t_operalog`
-- ----------------------------
DROP TABLE IF EXISTS `t_operalog`;
CREATE TABLE `t_operalog` (
  `operalog_id` varchar(32) NOT NULL COMMENT '主键',
  `opera_menu` varchar(255) default NULL COMMENT '操作菜单',
  `opera_penal` varchar(255) default NULL COMMENT '操作面板',
  `opera_method` varchar(255) default NULL COMMENT '操作方法',
  `opera_result` varchar(255) default NULL COMMENT '操作结果',
  `opera_desc` varchar(255) default NULL COMMENT '返回内容',
  `opera_class` varchar(255) default NULL COMMENT '调用类',
  `opera_md` varchar(255) default NULL COMMENT '调用方法',
  `opera_key` varchar(255) default NULL COMMENT '操作KEY',
  `operator` varchar(32) default NULL COMMENT '操作人',
  `opera_time` datetime default NULL COMMENT '操作世间',
  PRIMARY KEY  (`operalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_operalog
-- ----------------------------
INSERT INTO `t_operalog` VALUES ('00a6c2ef0328c68188e301b2b47e94bf', '资源管理', '菜单树', '修改', '1', '[年龄别称] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:18:56');
INSERT INTO `t_operalog` VALUES ('023a6306869586691e171aafb9cbf303', '下拉项管理', '下拉项树', '修改', '1', '[信用积分类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:06:35');
INSERT INTO `t_operalog` VALUES ('031b2c30f53686f1748608a3650e06c8', '资源管理', '菜单树', '修改', '1', '[会员积分] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:18:48');
INSERT INTO `t_operalog` VALUES ('049538bd98393f9bc011c2502d1f98d9', '资源管理', '菜单树', '修改', '1', '[所有借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:24:13');
INSERT INTO `t_operalog` VALUES ('053ba58d2e96ff941d84c44a69c1d529', '资源管理', '面板列表', '修改', '1', '[信用列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-06-23 10:41:41');
INSERT INTO `t_operalog` VALUES ('07f71582528135fa6e561d01b5c6f6f5', '资源管理', '菜单树', '修改', '1', '[借款留言] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:54:39');
INSERT INTO `t_operalog` VALUES ('0810f427a78bff7050fd0a0ea36fca57', '资源管理', '菜单树', '修改', '1', '[还款方式] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:29:43');
INSERT INTO `t_operalog` VALUES ('0a87d2d35a5dc87d7d1d97bdc046886d', '下拉项管理', '下拉项树', '修改', '1', '[婚姻状况] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:10:27');
INSERT INTO `t_operalog` VALUES ('0b4c03191583e1d5eb5d401042ff6e81', '基础参数', '基础参数列表', '修改', '1', '[罚息利率1至30天] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-06-23 13:48:27');
INSERT INTO `t_operalog` VALUES ('0e52d79b01823e7de9e1aea98202d32b', '资源管理', '面板列表', '修改', '1', '[地区树] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-06-23 10:41:31');
INSERT INTO `t_operalog` VALUES ('0f98e2a359e18f7b3add39e04e7f9297', '下拉项管理', '下拉项树', '修改', '1', '[网站管理] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:13:50');
INSERT INTO `t_operalog` VALUES ('1047488048750c92e819d87aa55713be', '资源管理', '菜单树', '修改', '1', '[申请额度] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:03:12');
INSERT INTO `t_operalog` VALUES ('1104a7e13649e36322844fa84a9c55b5', '资源管理', '面板列表', '增加', '1', '[会员统计列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-06-24 10:48:55');
INSERT INTO `t_operalog` VALUES ('12446a419d4302579022d27849022e93', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-24 10:11:16');
INSERT INTO `t_operalog` VALUES ('127bcddba80fe42859e694d697e9497d', '资源管理', '菜单树', '修改', '1', '[初审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:53:59');
INSERT INTO `t_operalog` VALUES ('12b8970dd616a0281ef09c61828046d8', '资源管理', '菜单树', '修改', '1', '[会员积分] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-25 15:40:25');
INSERT INTO `t_operalog` VALUES ('13657fe10550bfe87544c610511e45a3', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:41:07');
INSERT INTO `t_operalog` VALUES ('14f8dbf27d01a338aed061188ec93613', '资源管理', '菜单树', '修改', '1', '[所有借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:03:21');
INSERT INTO `t_operalog` VALUES ('15859b98d4b4e721977214c03071006c', '资源管理', '菜单树', '修改', '1', '[信用记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:21:58');
INSERT INTO `t_operalog` VALUES ('16ac7c161fe9f80814945d1bdfbd5101', '资源管理', '菜单树', '修改', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:09:38');
INSERT INTO `t_operalog` VALUES ('18d51ed87290abe84e32094cb5ccb913', '下拉项管理', '下拉项树', '修改', '1', '[供款状况] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:09:11');
INSERT INTO `t_operalog` VALUES ('1a5276d748dacdf21775065dc112b5c2', '资源管理', '菜单树', '修改', '1', '[导航信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:33:27');
INSERT INTO `t_operalog` VALUES ('1b41a23d808f9816e4036c9214425727', '资源管理', '菜单树', '修改', '1', '[收款还款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:27:39');
INSERT INTO `t_operalog` VALUES ('1c146cadeba90942857c315cd2c901b1', '资源管理', '菜单树', '修改', '1', '[满标借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:54:10');
INSERT INTO `t_operalog` VALUES ('1cb1efa82b178f426b7deda4704e1021', '资源管理', '菜单树', '修改', '1', '[逾期借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:26:35');
INSERT INTO `t_operalog` VALUES ('1e348f79ff0925b1ee0d68ca8d31345b', '下拉项管理', '下拉项树', '修改', '1', '[收款状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:47:37');
INSERT INTO `t_operalog` VALUES ('1ec5ca36b9e62fb016ec3da0703dca83', '登录日志', '登录日志列表', '删除', '1', '成功删除了[ 超级管理员 ]操作', 'com.glacier.netloan.service.system.LoginLogService', 'delLoginLog', 'LoginlogList_del', '超级管理员', '2014-06-23 11:27:06');
INSERT INTO `t_operalog` VALUES ('22cf43a3bfda5fe68519e7c546d5cc88', '下拉项管理', '下拉列表', '增加', '1', '[取消手机认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:27:50');
INSERT INTO `t_operalog` VALUES ('24c3377c174d7f0c3be68bc484b4f476', '下拉项管理', '下拉项树', '修改', '1', '[借款状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:01:57');
INSERT INTO `t_operalog` VALUES ('25149cb5b1d26106221b51806c11807f', '公告管理', '公告列表', '修改', '1', '[关于2014春节期间业务受理及值班公告] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-06-23 11:16:42');
INSERT INTO `t_operalog` VALUES ('2980dee19b79e0e3d3d85b6f3fec248d', '地区管理', '地区树', '修改', '1', '[香洲区] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:28:58');
INSERT INTO `t_operalog` VALUES ('2a780289ce60b806bd8257732fd27987', '资源管理', '菜单树', '修改', '1', '[逾期借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:13:03');
INSERT INTO `t_operalog` VALUES ('2b83a36076ea61df947b59277889cfe6', '资源管理', '面板列表', '增加', '1', '[积分类别列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-06-25 15:41:08');
INSERT INTO `t_operalog` VALUES ('2c83abf246c802a0a97fde91d001900c', '信用类别', '信用类别列表', '增加', '1', '[recharge] 积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-06-27 17:40:39');
INSERT INTO `t_operalog` VALUES ('2d832518ac54ccbfb5addc7fe2e61f31', '资源管理', '菜单树', '修改', '1', '[初审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:26:22');
INSERT INTO `t_operalog` VALUES ('2e5f7ce7b098df3366d6c2627649901f', '资源管理', '菜单树', '修改', '1', '[收款还款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:25:36');
INSERT INTO `t_operalog` VALUES ('302c75fc5984d91d1744ece69d10ce3d', '资源管理', '面板列表', '修改', '1', '[年龄列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-06-23 10:41:55');
INSERT INTO `t_operalog` VALUES ('315956926686ebd8c2566208835bfca0', '充值记录', '充值列表', '审核', '1', '[充值_201406271647] 会员充值记录信息已审核', 'com.glacier.netloan.service.finance.FinanceRechargeService', 'auditRecharge', 'RechargeList_audit', '超级管理员', '2014-06-27 17:00:48');
INSERT INTO `t_operalog` VALUES ('3223762687c079747ec7f995dd73d16c', '资源管理', '菜单树', '修改', '1', '[收款记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:29:52');
INSERT INTO `t_operalog` VALUES ('323e36c6c437219fb38406a97eaa91b4', '资源管理', '菜单树', '修改', '1', '[借款留言] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:12:57');
INSERT INTO `t_operalog` VALUES ('32a7ea7b612b18ff41ffd3d6f1263470', '资源管理', '菜单树', '修改', '1', '[会员统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:05:40');
INSERT INTO `t_operalog` VALUES ('34141d275c645a91c73abe017eef97b8', '资源管理', '菜单树', '修改', '1', '[借款留言] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:24:25');
INSERT INTO `t_operalog` VALUES ('34990484f1747f1f1efcb48df61b5100', '下拉项管理', '下拉项树', '修改', '1', '[财务管理] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:13:21');
INSERT INTO `t_operalog` VALUES ('35dc7a2a8c252cbc1ff2708600226513', '下拉项管理', '下拉项树', '修改', '1', '[借款状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:02:39');
INSERT INTO `t_operalog` VALUES ('37a7f8abfc2beaa1a2746d67c2698257', '资源管理', '菜单树', '修改', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:28:52');
INSERT INTO `t_operalog` VALUES ('3803a3abf8b7d2e7f6fedbb8ee1ab3d3', '资源管理', '菜单树', '修改', '1', '[逾期借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:09:29');
INSERT INTO `t_operalog` VALUES ('394148215cf6b92290eba6a084270dc4', '资源管理', '菜单树', '修改', '1', '[会员认证] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:10:29');
INSERT INTO `t_operalog` VALUES ('39b182eb60f18d2d5c7271ac59952f3c', '资源管理', '菜单树', '增加', '1', '[积分类别] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-06-25 15:40:15');
INSERT INTO `t_operalog` VALUES ('3b306f4b15eafb6947fd11a291ac3045', '资源管理', '菜单树', '修改', '1', '[信用类别] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:18:15');
INSERT INTO `t_operalog` VALUES ('3e567b1799891324a8dba6c95ee2a57c', '导航信息', '导航树', '修改', '1', '[发布信用标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:13:28');
INSERT INTO `t_operalog` VALUES ('3e8d5b98094064ac47c62c58e51a235a', '下拉项管理', '下拉项树', '修改', '1', '[内置] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:04:12');
INSERT INTO `t_operalog` VALUES ('40a4fc21e329b1ac0944c0e152f30e7e', '资源管理', '菜单树', '修改', '1', '[年龄别称] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-25 15:40:35');
INSERT INTO `t_operalog` VALUES ('416593c8ee409ea71ee495dc4122b690', '公告管理', '公告列表', '修改', '1', '[关于净值借款入帐款禁止投标、提现公告说明] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-06-23 11:16:46');
INSERT INTO `t_operalog` VALUES ('42186ad4371a0ec1eb3ed2c112b31443', '下拉项管理', '下拉项树', '修改', '1', '[流标原因] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:47:32');
INSERT INTO `t_operalog` VALUES ('422a29a4f321a0710a122840dcf6d7a2', '操作日志', '操作日志列表', '删除', '1', '成功删除了[ 下拉项树 ]操作', 'com.glacier.netloan.service.system.OperaLogService', 'delOperaLog', 'OperalogList_del', '超级管理员', '2014-06-23 13:33:35');
INSERT INTO `t_operalog` VALUES ('4466f2daa898952b720bc6236d907c78', '资源管理', '菜单树', '修改', '1', '[下拉项管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:16:24');
INSERT INTO `t_operalog` VALUES ('453b48526ddb42a0b4dfdc371d7e9062', '资源管理', '菜单树', '修改', '1', '[满标借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:27:32');
INSERT INTO `t_operalog` VALUES ('454558a29c336b2e6431b791e2439851', '导航信息', '导航树', '修改', '1', '[我要登录] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:13:43');
INSERT INTO `t_operalog` VALUES ('4555e341358263e4fb2b2d4cf3b25a02', '下拉项管理', '下拉项树', '修改', '1', '[还款明细状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:02:31');
INSERT INTO `t_operalog` VALUES ('456f0042ccbe9c7acd891ba2f2ca4622', '下拉项管理', '下拉项树', '修改', '1', '[信件类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:08:20');
INSERT INTO `t_operalog` VALUES ('45e6de90675fd6404a47f4220ad23055', '地区管理', '地区树', '修改', '1', '[深圳] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:28:48');
INSERT INTO `t_operalog` VALUES ('4648ba57de81f87b2b59c1feb11c6605', '地区管理', '地区树', '修改', '1', '[香洲区] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:28:28');
INSERT INTO `t_operalog` VALUES ('46d17439a1d3a5c1a1716ab2e672ed4a', '下拉项管理', '下拉项树', '修改', '1', '[认证状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:05:48');
INSERT INTO `t_operalog` VALUES ('48a4685a77726a65fe263a42855b2399', '下拉项管理', '下拉列表', '增加', '1', '[取消身份认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:26:39');
INSERT INTO `t_operalog` VALUES ('4b156420dd7fc50e122edfd411aa9d0a', '资源管理', '菜单树', '修改', '1', '[借款统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:04:26');
INSERT INTO `t_operalog` VALUES ('4bb453d21393b8bd472ca40e197d600a', '下拉项管理', '下拉项树', '修改', '1', '[初审审核状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:47:19');
INSERT INTO `t_operalog` VALUES ('4c9fc32f9a38d707fec5569b8613e0fa', '操作日志', '操作日志列表', '删除', '1', '成功删除了[ 管理员列表 ]操作', 'com.glacier.netloan.service.system.OperaLogService', 'delOperaLog', 'OperalogList_del', '超级管理员', '2014-06-23 13:33:22');
INSERT INTO `t_operalog` VALUES ('4d33e0f13d688bfe5eb2de7aa05c7fd4', '资源管理', '菜单树', '修改', '1', '[平台资金] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:32:38');
INSERT INTO `t_operalog` VALUES ('4de00b65606d26149b48f9cf822c1186', '操作日志', '操作日志列表', '删除', '1', '成功删除了[ 会员信息列表 ]操作', 'com.glacier.netloan.service.system.OperaLogService', 'delOperaLog', 'OperalogList_del', '超级管理员', '2014-06-23 13:33:28');
INSERT INTO `t_operalog` VALUES ('52cc5bf1a3c28d828c2be328f24a2cc0', '下拉项管理', '下拉项树', '修改', '1', '[积分类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:06:20');
INSERT INTO `t_operalog` VALUES ('52f616f8816997b2897ee995f1801eee', '资源管理', '菜单树', '修改', '1', '[角色管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:15:14');
INSERT INTO `t_operalog` VALUES ('543f89031f24e12a72c575e06fea4f90', '资源管理', '菜单树', '修改', '1', '[逾期借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:08:56');
INSERT INTO `t_operalog` VALUES ('5494575b7495afa889b869292267a7ca', '会员信息', '会员信息列表', '修改', '1', '[123312] 会员信息已修改', 'com.glacier.netloan.service.member.MemberService', 'editMemberandWork', 'MemberList_edit', '超级管理员', '2014-06-24 08:42:51');
INSERT INTO `t_operalog` VALUES ('554d84ee6745193b5b944fa080fc62ee', '下拉项管理', '下拉列表', '修改', '1', '[外置账户] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-06-27 14:22:25');
INSERT INTO `t_operalog` VALUES ('5609ff105f699cbfc5102d608ac8e783', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:21:47');
INSERT INTO `t_operalog` VALUES ('5610c550e284ec52c172a18cd5a895c6', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:41:03');
INSERT INTO `t_operalog` VALUES ('565b8922d91a60e15564d0406a23fdb2', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:40:42');
INSERT INTO `t_operalog` VALUES ('57b1af4a82ae6c6e9e01fcb70f9cebb1', '资源管理', '菜单树', '修改', '1', '[积分类别] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-26 09:52:15');
INSERT INTO `t_operalog` VALUES ('5862af6be3320600d42bd59e013e555d', '下拉项管理', '下拉项树', '修改', '1', '[借款状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:59:29');
INSERT INTO `t_operalog` VALUES ('58a264c0dfb02147c6dc95f10e3c3800', '下拉项管理', '下拉列表', '增加', '1', '[取消邮箱认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:18:10');
INSERT INTO `t_operalog` VALUES ('58c6c077a6bb738960eb7eae2ca95af2', '导航信息', '导航树', '修改', '1', '[关于我们] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:14:29');
INSERT INTO `t_operalog` VALUES ('592e87456ca46c85105f7a5dca1751ab', '下拉项管理', '下拉项树', '修改', '1', '[开启关闭] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:47:02');
INSERT INTO `t_operalog` VALUES ('5938ff1c5e27675cfd8ca3f191bd1104', '下拉项管理', '下拉项树', '修改', '1', '[系统设置] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:12:31');
INSERT INTO `t_operalog` VALUES ('59c4fa07036d83a61a8a44dfefe791e8', '导航信息', '导航树', '修改', '1', '[我的账号] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:13:39');
INSERT INTO `t_operalog` VALUES ('5a10e8f97f5518cd3c730e8f6d588b60', '下拉项管理', '下拉项树', '修改', '1', '[审核状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:50:41');
INSERT INTO `t_operalog` VALUES ('5ad0dcc41b21b63a69803058483b3b1e', '资源管理', '菜单树', '修改', '1', '[会员认证] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:22:10');
INSERT INTO `t_operalog` VALUES ('5b6fec6c4b992b84e9690f6f1f464a1c', '资源管理', '菜单树', '修改', '1', '[会员统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:20:09');
INSERT INTO `t_operalog` VALUES ('5b7b55a674df10ad86ab7b354434e4e8', '资源管理', '菜单树', '修改', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:54:58');
INSERT INTO `t_operalog` VALUES ('5c4c78b8c9df9d3990e114c813f331c3', '下拉项管理', '下拉项树', '修改', '1', '[是否购车] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:10:53');
INSERT INTO `t_operalog` VALUES ('5d67d4be06ecd7ec3b9fb93e13c257ec', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:40:35');
INSERT INTO `t_operalog` VALUES ('5d78bc717bcfeccb686903c7e9155bab', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-06-24 10:50:48');
INSERT INTO `t_operalog` VALUES ('5e40d3602efeb7fb6846fe9a62957db5', '资源管理', '菜单树', '修改', '1', '[新闻管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:33:53');
INSERT INTO `t_operalog` VALUES ('5efc309d77a8b63d10517b426d56b421', '资源管理', '菜单树', '修改', '1', '[客服服务] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:34:03');
INSERT INTO `t_operalog` VALUES ('603b94875ff958c71be4d1244cf17d94', '操作日志', '操作日志列表', '删除', '1', '成功删除了[ 操作日志列表 ]操作', 'com.glacier.netloan.service.system.OperaLogService', 'delOperaLog', 'OperalogList_del', '超级管理员', '2014-06-23 13:38:35');
INSERT INTO `t_operalog` VALUES ('605a517b3c7ee2f7b1bca8590c91bc39', '资源管理', '菜单树', '修改', '1', '[投标统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:06:09');
INSERT INTO `t_operalog` VALUES ('60a8426e291a2e58d17396c7a838e27f', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-06-25 15:42:32');
INSERT INTO `t_operalog` VALUES ('6160bbb9686e3668198768507f7b6098', '资源管理', '菜单树', '修改', '1', '[登录日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:15:26');
INSERT INTO `t_operalog` VALUES ('62863a7bb190ebf4d4ee47150eb128fa', '下拉项管理', '下拉项树', '修改', '1', '[我要借款] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:13:07');
INSERT INTO `t_operalog` VALUES ('639095e8492e7ebdaac82d2bfbf7a58e', '资源管理', '操作列表', '编辑', '1', '[编辑] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:40:30');
INSERT INTO `t_operalog` VALUES ('65d403b36313da78ee61aef0c7a45b7a', '信用类别', '信用类别列表', '增加', '1', '[withdraw] 积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-06-27 17:41:09');
INSERT INTO `t_operalog` VALUES ('67cde6888b3e276709b0455f6ea2ca22', '公告管理', '公告列表', '修改', '1', '[关于1月11日凌晨零点临时维护公告] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-06-23 11:17:01');
INSERT INTO `t_operalog` VALUES ('68744e21db850ee82efc9aa9daeaf29f', '新闻管理', '新闻列表', '修改', '1', '[冰川贷李欣贺参加2013互联网金融年度论坛] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-06-23 11:18:18');
INSERT INTO `t_operalog` VALUES ('68b47eac4bfc73a13afe59f215ed9f78', '资源管理', '菜单树', '修改', '1', '[逾期罚款设置] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:33:01');
INSERT INTO `t_operalog` VALUES ('69836825e2bda64767591894ae6fe65e', '资源管理', '菜单树', '修改', '1', '[关注借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:03:50');
INSERT INTO `t_operalog` VALUES ('6a3f2ab5f451d765346c8f48bbe66fd7', '地区管理', '地区树', '修改', '1', '[珠海] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:28:54');
INSERT INTO `t_operalog` VALUES ('6a70805bff12d750ad7c0bf764f38f0e', '导航信息', '导航树', '修改', '1', '[联系我们] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:14:48');
INSERT INTO `t_operalog` VALUES ('6ac5de69155c6b545ec3fa7a139ed745', '下拉项管理', '下拉项树', '增加', '1', '[资金平台类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-06-26 13:39:51');
INSERT INTO `t_operalog` VALUES ('6bd0bcc260a9cb8ae8c259d75c08515e', '下拉项管理', '下拉项树', '修改', '1', '[信件状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:07:01');
INSERT INTO `t_operalog` VALUES ('70796c029b38e2fbf7e5f3645eceb4e1', '下拉项管理', '下拉列表', '增加', '1', '[取消身份认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:26:39');
INSERT INTO `t_operalog` VALUES ('7274dd6d8884f6a99be4639d21084465', '资源管理', '菜单树', '修改', '1', '[还款记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:44:23');
INSERT INTO `t_operalog` VALUES ('73a59155676eb7ff549af6b1354a2955', '资源管理', '菜单树', '修改', '1', '[投标记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:29:06');
INSERT INTO `t_operalog` VALUES ('73dc288329491ca3eab0fe39768bdca5', '资源管理', '菜单树', '修改', '1', '[信息通知] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:10:35');
INSERT INTO `t_operalog` VALUES ('744d1f9c9cded6066352281955428f57', '资源管理', '菜单树', '修改', '1', '[逾期罚款记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:33:08');
INSERT INTO `t_operalog` VALUES ('77b85a3c7706c1c26f1f36d08669de1d', '基础参数', '基础参数列表', '删除', '1', '成功删除了[ 利息管理费 ]基础参数', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'delParameterBasics', 'ParameterBasicList_del', '超级管理员', '2014-06-23 13:48:00');
INSERT INTO `t_operalog` VALUES ('77c6ccda7dea032f2ad69e2d7e02c94f', '资源管理', '菜单树', '修改', '1', '[收款记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:44:37');
INSERT INTO `t_operalog` VALUES ('7a5f306fc131aca742d730cd332620bd', '下拉项管理', '下拉项树', '修改', '1', '[系统变量] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:04:28');
INSERT INTO `t_operalog` VALUES ('7b07d514a9f7b010a4c6ef9ccc5ad6ee', '资源管理', '菜单树', '修改', '1', '[管理员设置] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:15:08');
INSERT INTO `t_operalog` VALUES ('7d2960be59f624ff0c6a1313116107ae', '下拉项管理', '下拉项树', '修改', '1', '[借款状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:47:24');
INSERT INTO `t_operalog` VALUES ('80f107bb37caeb87ee47a7b71905a0ed', '新闻管理', '新闻列表', '修改', '1', '[祝冰川贷第一期积分土豪奖品活动圆满结束] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-06-23 11:18:06');
INSERT INTO `t_operalog` VALUES ('8186013338c6cabc97830cae56848ba4', '下拉项管理', '下拉列表', '增加', '1', '[取消信用认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:20:24');
INSERT INTO `t_operalog` VALUES ('8381c1e525e209dc67eba59fd4a7d5f5', '下拉项管理', '下拉项树', '修改', '1', '[是否逾期] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:00:13');
INSERT INTO `t_operalog` VALUES ('83be036ad68d617c0887ecc2a6caf648', '资源管理', '菜单树', '修改', '1', '[会员财务] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:20:17');
INSERT INTO `t_operalog` VALUES ('848177470e52be1ed6165680df17f023', '下拉项管理', '下拉列表', '增加', '1', '[外置账户] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-26 13:40:38');
INSERT INTO `t_operalog` VALUES ('85844c0e29516ccdfe6059f3eaaeba48', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:16:06');
INSERT INTO `t_operalog` VALUES ('8afa5d9a521cbc738a03cfc20d746ae5', '资源管理', '菜单树', '修改', '1', '[公告管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:33:33');
INSERT INTO `t_operalog` VALUES ('8ea972f5cd385c49da1db321688b0a50', '资源管理', '菜单树', '修改', '1', '[还款方式] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:55:11');
INSERT INTO `t_operalog` VALUES ('8ff048352f7baf66694d87ddd2eae665', '资源管理', '菜单树', '修改', '1', '[会员信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:03:07');
INSERT INTO `t_operalog` VALUES ('90e775fd4b991b784eda065bcb226f03', '资源管理', '菜单树', '修改', '1', '[所有借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:55:49');
INSERT INTO `t_operalog` VALUES ('90f484aff14f37be302a70c8529367d5', '下拉项管理', '下拉项树', '修改', '1', '[参数管理] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:12:47');
INSERT INTO `t_operalog` VALUES ('936eef14e08b66bd059076cc0f069594', '资源管理', '菜单树', '修改', '1', '[平台资金记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:32:44');
INSERT INTO `t_operalog` VALUES ('966b4966ced5b03e10b51ca8e125e1f3', '下拉项管理', '下拉项树', '修改', '1', '[是否] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:52:25');
INSERT INTO `t_operalog` VALUES ('96b154dd9f1a00acc5e535f72ba5974c', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:40:52');
INSERT INTO `t_operalog` VALUES ('96c47eb79732ea0741e23beda2cc3e90', '资源管理', '菜单树', '修改', '1', '[投资统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:06:14');
INSERT INTO `t_operalog` VALUES ('979c32e465aa1d25a9ba0c166c5107ea', '操作日志', '操作日志列表', '删除', '1', '成功删除了[ 银行卡列表 ]操作', 'com.glacier.netloan.service.system.OperaLogService', 'delOperaLog', 'OperalogList_del', '超级管理员', '2014-06-23 13:33:07');
INSERT INTO `t_operalog` VALUES ('99698e33da0261323fb533536d0f25a8', '资源管理', '菜单树', '修改', '1', '[密保问题] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:19:02');
INSERT INTO `t_operalog` VALUES ('9971fd916740e19d3a7e14684a376736', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:40:24');
INSERT INTO `t_operalog` VALUES ('9a2f8bb7d6f7fcefaf9d97a68e430026', '资源管理', '操作列表', '增加', '1', '[ 修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-06-25 15:43:08');
INSERT INTO `t_operalog` VALUES ('9b49dd0d090b44dec17d9ed2bcdfcd1d', '资源管理', '菜单树', '修改', '1', '[满标借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:08:45');
INSERT INTO `t_operalog` VALUES ('9b8d306c4ee487615f67f6a7cdf17367', '资源管理', '菜单树', '修改', '1', '[信息通知] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:22:25');
INSERT INTO `t_operalog` VALUES ('9c5b64780bb248f49967960324573dd7', '资源管理', '菜单树', '修改', '1', '[友情链接] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:33:58');
INSERT INTO `t_operalog` VALUES ('9e40ae087d35ae0641fb42ed7d4a8df2', '资源管理', '菜单树', '修改', '1', '[收款还款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:29:12');
INSERT INTO `t_operalog` VALUES ('9f9a3d9b9f176b97d233fc62669cf252', '下拉项管理', '下拉列表', '增加', '1', '[取消实名认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:27:27');
INSERT INTO `t_operalog` VALUES ('9fcbe0e5ebb879a82a1f8bbba87d5937', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-06-25 15:44:07');
INSERT INTO `t_operalog` VALUES ('a134d5b56a34774252801220fd2a880f', '地区管理', '地区树', '修改', '1', '[深圳] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:28:19');
INSERT INTO `t_operalog` VALUES ('a21cf99ebe7502b8f3c0423b712cc06f', '资源管理', '菜单树', '修改', '1', '[逾期借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:54:20');
INSERT INTO `t_operalog` VALUES ('a2767d6904fa4ee0c58322527f3b6415', '资源管理', '菜单树', '修改', '1', '[房产信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:10:47');
INSERT INTO `t_operalog` VALUES ('a3577f951a092c744695d5de297e229b', '下拉项管理', '下拉项树', '修改', '1', '[会员管理] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:12:56');
INSERT INTO `t_operalog` VALUES ('a4481b97864645dabe5b58be4fefcd05', '资源管理', '菜单树', '修改', '1', '[密保管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:10:41');
INSERT INTO `t_operalog` VALUES ('a4cc0c8e7c02279d0a458e330f4605ba', '地区管理', '地区树', '修改', '1', '[珠海] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:28:24');
INSERT INTO `t_operalog` VALUES ('a53ac98981e5304ca3f26a7cad8c394a', '资源管理', '操作列表', '增加', '1', '[设置为默认账户] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-06-27 14:19:43');
INSERT INTO `t_operalog` VALUES ('a6459dfa4fe519c7876e1006aa9bb1e5', '资源管理', '面板列表', '修改', '1', '[下拉项树] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-06-23 10:39:37');
INSERT INTO `t_operalog` VALUES ('a81d1ed15765fa043a5ebf5577bedd42', '资源管理', '操作列表', '增加', '1', '[导出Excel] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-06-24 10:49:46');
INSERT INTO `t_operalog` VALUES ('a840889bb28d194f146c71581a58e204', '资源管理', '面板列表', '修改', '1', '[积分列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-06-23 10:41:48');
INSERT INTO `t_operalog` VALUES ('a94eb6e2bb9a0b016d90edcd267e0054', '资源管理', '菜单树', '修改', '1', '[收款还款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:00:27');
INSERT INTO `t_operalog` VALUES ('ab8fafe07d802f994b89b5f66190b954', '密保问题', '问题列表', '删除', '1', '成功删除了[ 你家里人知道吗 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'delQuestion', 'QuestionList_del', '超级管理员', '2014-06-23 11:30:01');
INSERT INTO `t_operalog` VALUES ('abc02cc0b127921a26c6a924189b8b9f', '下拉项管理', '下拉项树', '修改', '1', '[联系人关系] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:10:22');
INSERT INTO `t_operalog` VALUES ('abfbac32dd0c19503feeae8c93651974', '下拉项管理', '下拉列表', '增加', '1', '[取消工作认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:06:09');
INSERT INTO `t_operalog` VALUES ('ad88c8f7827dc497a2468a60897e9ecf', '资源管理', '菜单树', '修改', '1', '[逾期垫付记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:32:49');
INSERT INTO `t_operalog` VALUES ('ad971628a8e91f66e8af0598603082c8', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-24 10:11:09');
INSERT INTO `t_operalog` VALUES ('ad9bbc2d765ea57be24b0f4e3f6128c0', '下拉项管理', '下拉项树', '修改', '1', '[认证类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:05:37');
INSERT INTO `t_operalog` VALUES ('adf8880bf35780f0717cffa697f02da9', '资源管理', '菜单树', '修改', '1', '[投标统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:04:38');
INSERT INTO `t_operalog` VALUES ('ae663d3066dc51b6e77a64296ccb3428', '资源管理', '菜单树', '修改', '1', '[还款记录明细] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:30:00');
INSERT INTO `t_operalog` VALUES ('af2d7a7aa2bd7b3054f4fea90218fe02', '资源管理', '菜单树', '修改', '1', '[会员认证] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:21:11');
INSERT INTO `t_operalog` VALUES ('b0fd6d44e978e1891a10f96a40a48720', '充值记录', '充值列表', '审核', '1', '[充值_201406271645] 会员充值记录信息已审核', 'com.glacier.netloan.service.finance.FinanceRechargeService', 'auditRecharge', 'RechargeList_audit', '超级管理员', '2014-06-27 16:46:21');
INSERT INTO `t_operalog` VALUES ('b17f4596ba9faaae076a20c729adb9eb', '资源管理', '菜单树', '修改', '1', '[收款记录明细] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:00:48');
INSERT INTO `t_operalog` VALUES ('b1fce645d992e8d2eed4f40771529819', '充值记录', '充值列表', '审核', '1', '[充值_201406271623] 会员充值记录信息已审核', 'com.glacier.netloan.service.finance.FinanceRechargeService', 'auditRecharge', 'RechargeList_audit', '超级管理员', '2014-06-27 16:23:37');
INSERT INTO `t_operalog` VALUES ('b56c2f52f66d5a7bce65b343d353552e', '地区管理', '地区树', '修改', '1', '[广州] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:29:05');
INSERT INTO `t_operalog` VALUES ('b63901a9fa70eb6409e948473b3008f0', '下拉项管理', '下拉项树', '修改', '1', '[审核状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:04:04');
INSERT INTO `t_operalog` VALUES ('b6677c4b6e1dd4681c0b43e062b0f082', '资源管理', '菜单树', '修改', '1', '[招聘信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:34:15');
INSERT INTO `t_operalog` VALUES ('b6e68f4b9b76a6b7d055553ef32d0029', '资源管理', '操作列表', '编辑', '1', '[设置为默认账户] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-27 14:20:17');
INSERT INTO `t_operalog` VALUES ('baef095e80138e34c560ebd4e15155a1', '下拉项管理', '下拉列表', '增加', '1', '[提现] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-27 17:20:16');
INSERT INTO `t_operalog` VALUES ('bbb4c6bbecc86007a0a64851a79d4428', '下拉项管理', '下拉列表', '增加', '1', '[充值] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-27 17:19:57');
INSERT INTO `t_operalog` VALUES ('bc7eee4d65df014f273ba30d88697992', '新闻管理', '新闻列表', '修改', '1', '[冰川贷李欣贺参加2013互联网金融年度论坛] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-06-23 11:18:23');
INSERT INTO `t_operalog` VALUES ('be509d2b6156295534c18d7c80a1bbd1', '新闻管理', '新闻列表', '修改', '1', '[十五年一遇的双情人节，大家准备好了吗？] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-06-23 11:18:11');
INSERT INTO `t_operalog` VALUES ('bfbb271bc507f4615b0c166b3539acdb', '资源管理', '菜单树', '修改', '1', '[信用记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:10:23');
INSERT INTO `t_operalog` VALUES ('c0e77902b19b0c08617e355a0baf6f16', '资源管理', '菜单树', '修改', '1', '[信用记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:20:45');
INSERT INTO `t_operalog` VALUES ('c17b1a4ae0ae6f8570ff1acba2b4a65c', '资源管理', '菜单树', '修改', '1', '[逾期垫付设置] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:32:55');
INSERT INTO `t_operalog` VALUES ('c1fa2f70024072c378f510019f53c105', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-06-27 14:20:29');
INSERT INTO `t_operalog` VALUES ('c283e1f324f24f001d12c3f50c946d4e', '资源管理', '菜单树', '修改', '1', '[还款方式] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:09:45');
INSERT INTO `t_operalog` VALUES ('c299138db39aa98bf7fdcf4e1995616c', '资源管理', '菜单树', '修改', '1', '[地区管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:16:32');
INSERT INTO `t_operalog` VALUES ('c2bd3c0b5226c481677f8c4c2388e31f', '资源管理', '菜单树', '修改', '1', '[年龄别称] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-25 15:40:30');
INSERT INTO `t_operalog` VALUES ('c35a65873f4e7d6c6324388dfbbd1aee', '资源管理', '面板列表', '修改', '1', '[下拉列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-06-23 10:39:32');
INSERT INTO `t_operalog` VALUES ('c43961e887869ad906c28644eeac0623', '下拉项管理', '下拉列表', '增加', '1', '[取消信息认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:23:08');
INSERT INTO `t_operalog` VALUES ('c57bf5ad8420e435a5ef6552ec99e3f3', '资源管理', '菜单树', '修改', '1', '[基础参数] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:15:47');
INSERT INTO `t_operalog` VALUES ('c629312a4035854cd981b2132571bca4', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:10:18');
INSERT INTO `t_operalog` VALUES ('c8243cc10dc2383aa1f8d02c28870c0c', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:39:53');
INSERT INTO `t_operalog` VALUES ('ca42b3093ae2134446be19a2bbbdec17', '下拉项管理', '下拉列表', '修改', '1', '[外置账户] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-06-26 13:46:27');
INSERT INTO `t_operalog` VALUES ('cab6cfef93f7c632ec963c89d69676a6', '导航信息', '导航树', '修改', '1', '[发布担保标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:13:33');
INSERT INTO `t_operalog` VALUES ('cbc603af0cca547f3d0cc4c96544a726', '资源管理', '菜单树', '修改', '1', '[广告管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:33:47');
INSERT INTO `t_operalog` VALUES ('cd0785e36ce396a1b3bbb6fd8aaa689c', '下拉项管理', '下拉项树', '修改', '1', '[还款明细状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:47:12');
INSERT INTO `t_operalog` VALUES ('cfb622d2770a8334be347f71261013c2', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-06-25 15:43:41');
INSERT INTO `t_operalog` VALUES ('d0730ce25922cb3002a215a8e8c3b808', '管理员设置', '管理员列表', '删除', '1', '成功删除了[ dsfsdf ]操作', 'com.glacier.netloan.service.system.UserService', 'delUser', 'UserList_del', '超级管理员', '2014-06-23 11:25:48');
INSERT INTO `t_operalog` VALUES ('d0dd23f9793b2a4b3e5768035dbf63b4', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:40:47');
INSERT INTO `t_operalog` VALUES ('d2446b808dc8ca26158e3e81b7f40826', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-06-27 14:16:55');
INSERT INTO `t_operalog` VALUES ('d2f5792aa7cd943cf6be3f23897d69cf', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-23 10:40:59');
INSERT INTO `t_operalog` VALUES ('d4840f133a66156dce3014c53cc8d423', '资源管理', '菜单树', '修改', '1', '[会员统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:05:55');
INSERT INTO `t_operalog` VALUES ('d4d69333aa1abc35d1f2c5c4297537aa', '资源管理', '菜单树', '修改', '1', '[帮助中心] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:34:09');
INSERT INTO `t_operalog` VALUES ('d4ee5a015c84451cbf83c7231b3e13f0', '下拉项管理', '下拉列表', '增加', '1', '[取消VIP认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:25:12');
INSERT INTO `t_operalog` VALUES ('d60d07c83a78fd016713226fe508066d', '下拉项管理', '下拉项树', '修改', '1', '[收款明细状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:47:42');
INSERT INTO `t_operalog` VALUES ('d644ffad1cf9636cbfc4ffa0bd5eae45', '公告管理', '公告列表', '修改', '1', '[关于DNS服务器维护相关公告] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-06-23 11:16:36');
INSERT INTO `t_operalog` VALUES ('d7836679ccd94ef8fdc60ed2e7de0775', '下拉项管理', '下拉列表', '增加', '1', '[默认账户] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-26 13:41:07');
INSERT INTO `t_operalog` VALUES ('d869a3e2ed2492df9ee4bf861258f3a9', '公告管理', '公告列表', '修改', '1', '[关于中国工商银行系统维护的公告] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-06-23 11:16:52');
INSERT INTO `t_operalog` VALUES ('daf0c26befca9d3473f31e50ce8c1e71', '下拉项管理', '下拉项树', '修改', '1', '[银行卡认证] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:11:02');
INSERT INTO `t_operalog` VALUES ('dcc919eb4f85bb97c1154743ba6bf17a', '资源管理', '菜单树', '修改', '1', '[会员信用] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:18:34');
INSERT INTO `t_operalog` VALUES ('de4b22c2e9113655e3230c37249810d6', '资源管理', '菜单树', '修改', '1', '[操作日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:15:32');
INSERT INTO `t_operalog` VALUES ('ded1b556399e88c831857ff439eca914', '地区管理', '地区树', '修改', '1', '[南宁] 地区信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterAreaService', 'editArea', 'AreaTree_edit', '超级管理员', '2014-06-23 11:29:12');
INSERT INTO `t_operalog` VALUES ('deeeb93cddac3206a5620718e644c61f', '资源管理', '菜单树', '修改', '1', '[密保管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:22:31');
INSERT INTO `t_operalog` VALUES ('df0c98b4555deb28c14041f442135374', '角色管理', '角色列表', '删除', '1', '成功删除了[ 测试角色2 ]操作', 'com.glacier.netloan.service.system.RoleService', 'delRoles', 'RoleList_del', '超级管理员', '2014-06-23 11:26:01');
INSERT INTO `t_operalog` VALUES ('df38272b82a08f4dbdec16092c060176', '下拉项管理', '下拉项树', '修改', '1', '[是否网站代还] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:01:19');
INSERT INTO `t_operalog` VALUES ('e1a176e650acc2c2c8a2926de56f5999', '下拉项管理', '下拉项树', '修改', '1', '[开启关闭] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 09:52:33');
INSERT INTO `t_operalog` VALUES ('e2497bc105c1fadb15e25379077fad57', '下拉项管理', '下拉列表', '增加', '1', '[取消企业认证审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-06-24 10:26:07');
INSERT INTO `t_operalog` VALUES ('e3f56a151266be57c4af05befe74eef1', '下拉项管理', '下拉项树', '修改', '1', '[复审审核状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:03:13');
INSERT INTO `t_operalog` VALUES ('e63370b9bd45a9ea4b26ef32145eb8a4', '下拉项管理', '下拉项树', '修改', '1', '[表单类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:04:35');
INSERT INTO `t_operalog` VALUES ('e84eaf560372c9af5c57a83b46096d29', '资源管理', '菜单树', '修改', '1', '[收款记录明细] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:29:33');
INSERT INTO `t_operalog` VALUES ('eb7fa514a8b8cb4dcde2fd1e58927cf8', '资源管理', '菜单树', '修改', '1', '[初审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:03:56');
INSERT INTO `t_operalog` VALUES ('ec5f696639245773ec83788125b82e3e', '信用类别', '信用类别列表', '增加', '1', '[invest] 积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-06-27 17:44:41');
INSERT INTO `t_operalog` VALUES ('ecc02635409437ffbd16a8dab89ff425', '导航信息', '导航树', '修改', '1', '[发布信用标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 13:49:56');
INSERT INTO `t_operalog` VALUES ('ed436aa7bb575eb5dc86b769df248cc8', '导航信息', '导航树', '修改', '1', '[公司简介] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:14:59');
INSERT INTO `t_operalog` VALUES ('edb40e068537a888d4d3312d8b941d5e', '资源管理', '菜单树', '修改', '1', '[关注借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:23:58');
INSERT INTO `t_operalog` VALUES ('ee1d9227746cbc95ae40b655b5d6f65b', '导航信息', '导航树', '修改', '1', '[招聘信息] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:15:07');
INSERT INTO `t_operalog` VALUES ('f3f31211ce5a20b390b402b0121788dc', '导航信息', '导航树', '修改', '1', '[发布信用标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 13:49:32');
INSERT INTO `t_operalog` VALUES ('f491f6777387cfcf85764c4d3d95fd23', '资源管理', '菜单树', '修改', '1', '[收款记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:00:37');
INSERT INTO `t_operalog` VALUES ('f4f99784af7b5257b41fab12624636de', '资源管理', '菜单树', '修改', '1', '[借款统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:06:01');
INSERT INTO `t_operalog` VALUES ('f5ef7d471441588c42da3559d4465834', '下拉项管理', '下拉项树', '修改', '1', '[是否购房] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-06-23 10:10:34');
INSERT INTO `t_operalog` VALUES ('f5fa91c3af237a4c89c8f1a20ae62391', '导航信息', '导航树', '修改', '1', '[帮助中心] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:15:16');
INSERT INTO `t_operalog` VALUES ('f76fec5ddc76be9a8f20cb78a29fa146', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-06-24 10:11:01');
INSERT INTO `t_operalog` VALUES ('f8a83da82f39c74ab51136ef0660d3d2', '资源管理', '菜单树', '修改', '1', '[资源管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 10:15:21');
INSERT INTO `t_operalog` VALUES ('fa6c009a3b90db160e343b27bd44ebe8', '资源管理', '菜单树', '修改', '1', '[投标记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-06-23 11:00:14');
INSERT INTO `t_operalog` VALUES ('fe7b4d830e0a02fc089e5268df616d7f', '导航信息', '导航树', '修改', '1', '[我要注册] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-06-23 11:13:50');

-- ----------------------------
-- Table structure for `t_overdue_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_overdue_notes`;
CREATE TABLE `t_overdue_notes` (
  `overdue_notes_id` varchar(32) NOT NULL,
  `repay_notes_detail_id` varchar(32) default NULL,
  `overdue_result` varchar(255) default NULL,
  `name_remark` varchar(20) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`overdue_notes_id`),
  KEY `FK_t_overdue_notes_t_repayment_notes_detail_repay_id` (`repay_notes_detail_id`),
  CONSTRAINT `t_overdue_notes_ibfk_1` FOREIGN KEY (`repay_notes_detail_id`) REFERENCES `t_repayment_notes_detail` (`repay_notes_detail_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_overdue_notes
-- ----------------------------

-- ----------------------------
-- Table structure for `t_panel`
-- ----------------------------
DROP TABLE IF EXISTS `t_panel`;
CREATE TABLE `t_panel` (
  `panel_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) default NULL,
  `panel_cn_name` varchar(50) default NULL,
  `panel_en_name` varchar(50) default NULL,
  `order_num` int(11) default NULL,
  PRIMARY KEY  (`panel_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_panel
-- ----------------------------
INSERT INTO `t_panel` VALUES ('0b7cd76c60a6b07c9b94f2a2eb7ebe29', '2ce7311ee180ae794c608251997dad9c', '收款记录明细列表', 'ReceivablesNotesDetailList', '1');
INSERT INTO `t_panel` VALUES ('0ff45a0906e1ec4b169953b2c177db3e', '8b442566ffbc9531ee5e3aef7c41d740', '认证列表', 'MemberAuthList', '1');
INSERT INTO `t_panel` VALUES ('17d04eebb4a66712961343c652696dbd', '055b7c1a9499420b2982a207dc027389', '基础参数列表', 'ParameterBasicList', '1');
INSERT INTO `t_panel` VALUES ('20814591aaa67351ab28198ec8531c80', '5b6eaabb2c3a020c4d85ab50d11ffd85', '友情列表', 'LinkList', '1');
INSERT INTO `t_panel` VALUES ('21gfdg1rgrh1dfhsjdfh124564sdf21d', 't110147c5e6c1e94ee70cc833aa7f5d3', '年龄列表', 'AgeList', '1');
INSERT INTO `t_panel` VALUES ('22bb4909b6184fadfdb5bc5566a911ae', 'f15eee7156a6e9821ad60ea9747b6878', '房产列表', 'EstateList', '1');
INSERT INTO `t_panel` VALUES ('27db7c27498df5f4a5402cd105c63dda', '02e56de3282b5404fdba2e2c957d1b92', '还款记录明细列表', 'RepaymentNotesDetailList', '1');
INSERT INTO `t_panel` VALUES ('28764ec6c61fd04f84bd20de8a96bfc8', '43b1d02267e9ed610543845a1c1a24ca', '垫付管理列表', 'OverdueAdvancesList', '1');
INSERT INTO `t_panel` VALUES ('28fe18d693742ae7db094fc750715c46', '54d652799e07bb8be54483301a89ff90', '帮助列表', 'HelpList', '1');
INSERT INTO `t_panel` VALUES ('2fe59d827540532df7f7ad86364d88aa', '6460c4e2cb89b498712c96e9b4d1acce', '借款列表', 'BorrowingLoanList', '1');
INSERT INTO `t_panel` VALUES ('3454dcbd02994a182203bf0f99bc4a63', '10a7f2fd8253d90b8672d4096f8f9ed4', '标种类型列表', 'LoanTenderList', '1');
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '1');
INSERT INTO `t_panel` VALUES ('34eg454c5e6c1e94ee70cc833asd87', 'sdeg454c5e6c1e94ee70cc833asd142', '积分列表', 'IntegralList', '1');
INSERT INTO `t_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_panel` VALUES ('3fae5276226498a6cb1b5cf466793cd6', '14sdf54157cf483a790f4eea35dsf6f6', '信用类别', 'creditType', '27');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '2');
INSERT INTO `t_panel` VALUES ('51258977cd4fc6a5bb19bc144cd752d6', '81d6b2292bbe73c29bc76679201662e1', '收款记录列表', 'ReceivablesNotesList', '1');
INSERT INTO `t_panel` VALUES ('529749f08cebb1f2291f1aee740b6505', '079cecd38fb5df02ed6e4d84446d072e', '会员财务列表', 'MemberFinanceList', '1');
INSERT INTO `t_panel` VALUES ('557cf8b2740e6792f517138703afb407', 'ac892df07f9087fb1c89ac968bb5f555', '操作日志列表', 'OperalogList', '1');
INSERT INTO `t_panel` VALUES ('56a81ee56b6ed438bbc43d17b2e4b96e', '8b4c5afb8d66b21e8900822c5c6bff35', '充值列表', 'RechargeList', '1');
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('5a5b45f5c22bb597247bf1ba380f8968', '9dc3357651c9ecbb9b7c51005be28d18', '密保列表', 'secretSecurityList', '1');
INSERT INTO `t_panel` VALUES ('5cd4cb6d36559b7d7e3a022e53a3bd71', 'a652d3fe69c067cb94b73361351b8378', '新闻列表', 'NewsList', '1');
INSERT INTO `t_panel` VALUES ('60ef5b40e8753bdc2909a2413a379091', '14sdf54157cf483a790f4eea35dsf6f6', 'asdf', 'adf', '1');
INSERT INTO `t_panel` VALUES ('64e21bca11e8269cf68163ca490145d7', '2a93efe5aeae3cdef871447bd49134a0', '平台资金列表', 'FinancePlatformList', '1');
INSERT INTO `t_panel` VALUES ('6e8859d95d4d4874c378f80f642740df', '5db451044c71b4eb5448a4291d538241', '银行卡列表', 'bankCardList', '1');
INSERT INTO `t_panel` VALUES ('7568bd9e76ee7bfa7ac7e2ef470cce78', '51af37d8918504c4ba34a85b1a3d94fc', '登录统计列表', 'AccountLoginList', '1');
INSERT INTO `t_panel` VALUES ('780a15a12d2fc981cccb418dafce08b2', '4f1b6666b70be892469b6e93c1eb30ce', '导航树', 'NavTree', '1');
INSERT INTO `t_panel` VALUES ('7b6390143d9a9c234890391f475ef7c9', 'ae024ce004991607d5ae9e725d67cce8', '申请额度列表', 'ApplyAmountList', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('86d2ccad701f94c9e80d71557b1c62e6', '88ee044d59911b3b1a67ba4cdd0ee90d', '公告列表', 'AnnouncementList', '1');
INSERT INTO `t_panel` VALUES ('87gfdg1rgrh1dfhsjdfh124564sderbg', 'v465654c5e6c1e94ee70cc833asd142', '信用列表', 'CreditList', '1');
INSERT INTO `t_panel` VALUES ('8a63e66cba37b7a9f7e99ff684791264', '389f33c7b34582376d4d99282faa03b9', '还款方式列表', 'RepaymentTypeList', '1');
INSERT INTO `t_panel` VALUES ('8e6e60bd7b85314ab9555e64bc6e5d08', '31a605c2a2a777c738a09103b9915615', '满标借款列表', 'BorrowingLoanSecAuditList', '1');
INSERT INTO `t_panel` VALUES ('93fc21dd1e7d69dd439c77c9e94e25af', 'e75a41ba4a2bc299e3b50a15580a103b', '客服列表', 'ServiceList', '1');
INSERT INTO `t_panel` VALUES ('961af6c94e64222b875d5a0546b8675b', '765726125327148f709cb1b98e8e2fb8', '投标统计列表', 'AccountTenderList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('98954ee69de34d2515468cbc031376ec', '33f5e9959e821a58696e2d2fb5c322fc', '问题列表', 'QuestionList', '1');
INSERT INTO `t_panel` VALUES ('a143b131cf265bb53467012fd788ed66', 'd1f203ea6815e227579b88c5d6235629', '投资统计列表', 'AccountInvestList', '1');
INSERT INTO `t_panel` VALUES ('a1d130de95607ffc00fb455c749cf1a1', 'ab01dd2ac38d920f691bbc65b7a4bfb2', '招聘列表', 'HiringList', '1');
INSERT INTO `t_panel` VALUES ('a466d90682f5e1b36f0d1813c2d9c844', '9171c71b4bab5578ef0bbeac30072c73', '会员统计列表', 'StatisticsList', '1');
INSERT INTO `t_panel` VALUES ('a6776188d6b27af2659a71f77ff71e02', '054464fdb73c76b5cfd4efa16fcaa8e1', '信用类别列表', 'CreditTypeList', '1');
INSERT INTO `t_panel` VALUES ('ab7d2a01ee055d1539613510d172d543', 'fd23f24a96e40753c6e0f1286bf47326', '关注借款列表', 'AttentionBorrowingList', '1');
INSERT INTO `t_panel` VALUES ('ad2e8abecde386abbd1738707beccfee', '185b00f80aaa910fa99d9abc99c84d58', '借款留言列表', 'LoanReviewList', '1');
INSERT INTO `t_panel` VALUES ('b10c70408381896f937bfe688daf8c25', '703a3f819925f89a9c370c0324d784a0', '信息通知列表', 'MessageNoticeList', '1');
INSERT INTO `t_panel` VALUES ('b8a03efe50a44d460983badb4be96eea', 'b34761b59816e63743643c6f179683a4', '广告列表', 'AdvertisementList', '1');
INSERT INTO `t_panel` VALUES ('bcc05279c70cd8a320ad70bd7cd0b12d', '3f029e72ef13db56e8b65866984da722', '提现记录列表', 'WithdrawList', '1');
INSERT INTO `t_panel` VALUES ('c17d966fcbec924f28c742456684aad4', 'e46f33cd486fe42c714c909e32966b4c', '逾期罚款设置', 'OverdueFineSetList', '1');
INSERT INTO `t_panel` VALUES ('cc479685206a45181c5965a09b72ffc5', 'a99477bf949bcae7143004e369d31d6c', '充值设置列表', 'RechargeSetList', '1');
INSERT INTO `t_panel` VALUES ('d758d23f2be619905b89146a228c3336', '3a0891f27514a093a5869da2afc22268', '借款统计列表', 'AccountBorrowList', '1');
INSERT INTO `t_panel` VALUES ('e01877cc411934b02581a9287dea79ae', '0107a40612ffaefe86f255341b6f9e03', '还款记录列表', 'RepaymentNotesList', '1');
INSERT INTO `t_panel` VALUES ('e6784ccad10e3414b99b77b303a338c7', '93f0fcfa7cdff069d929723062b53211', '变量列表', 'VariablesList', '1');
INSERT INTO `t_panel` VALUES ('ea7a850b7fe4c05f180e28e6e7fa76fa', '6b44218344d328305de2bcdf82cb8741', '投标记录列表', 'TenderNotesList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_panel` VALUES ('f02605440920e2e2f7ed260f81674410', 'c5cbf9f0961aa8249322d9ac20ba996e', '初审借款列表', 'BorrowingLoanFirstAuditList', '1');
INSERT INTO `t_panel` VALUES ('f769a64bb571aa0c7ac269b807af4782', 'e42b98561176563f930d82c80b041ed8', '登录日志列表', 'LoginlogList', '1');
INSERT INTO `t_panel` VALUES ('f77e36ed70a04d8123a466f8dd0a9b5b', '3d69786613fe15615172d1ae22defed4', '积分类别列表', 'integralTypeList', '1');
INSERT INTO `t_panel` VALUES ('fc5113080081ca9c40d5fc0a7b66da8b', '4c654b11b08eecbf6eb4e6688ea83b7d', '会员信息列表', 'MemberList', '1');
INSERT INTO `t_panel` VALUES ('swdf697aea23532eb8162f5ba1818c6f', 'de34654c5e6c1e94ee70cc833asd142', '地区树', 'AreaTree', '1');

-- ----------------------------
-- Table structure for `t_parameter_age`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_age`;
CREATE TABLE `t_parameter_age` (
  `age_id` varchar(32) NOT NULL,
  `age_name` varchar(50) default NULL,
  `age_begin` int(20) default NULL,
  `age_end` int(20) default NULL,
  `accessory` varchar(255) default NULL,
  `age_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`age_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的年龄别称设置。';

-- ----------------------------
-- Records of t_parameter_age
-- ----------------------------
INSERT INTO `t_parameter_age` VALUES ('25gtr54157cf483a790f4eea3der25', '创业期', '1', '29', null, '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-21 15:13:28', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:12:39');
INSERT INTO `t_parameter_age` VALUES ('3f2sa343dg54f65fh54fh67h5sf4h5', '黄金岁月', '30', '40', null, '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-21 15:13:26', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:12:42');
INSERT INTO `t_parameter_age` VALUES ('45dfdsf554f5sd4fsdf4s5df4sd5f4s', '成功人士', '41', '59', null, '3', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-21 15:13:24', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:12:44');

-- ----------------------------
-- Table structure for `t_parameter_area`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_area`;
CREATE TABLE `t_parameter_area` (
  `area_id` varchar(32) NOT NULL,
  `area_pid` varchar(32) default NULL,
  `area_name` varchar(20) default NULL,
  `area_subsite` enum('subsite1','subsite0') default NULL,
  `accessory` varchar(255) default NULL,
  `area_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`area_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的地区设置。';

-- ----------------------------
-- Records of t_parameter_area
-- ----------------------------
INSERT INTO `t_parameter_area` VALUES ('2580884c5e6c1e94ee70cc833aa1c247', null, '广东', 'subsite1', '000', '1', '000', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('8740884c5e6c1e94ee70cc833aa1c123', '2580884c5e6c1e94ee70cc833aa1c247', '深圳', null, null, '1', '0755', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:28:48');
INSERT INTO `t_parameter_area` VALUES ('cd092470b03f7cad7a45dad4c9f6876b', '2580884c5e6c1e94ee70cc833aa1c247', '珠海', null, null, '2', '0756', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:21', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:28:54');
INSERT INTO `t_parameter_area` VALUES ('f6d7ea91dc3255d4d5efac64bb4923bd', 'cd092470b03f7cad7a45dad4c9f6876b', '香洲区', null, null, '1', '0756', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:28:58');
INSERT INTO `t_parameter_area` VALUES ('sdf2s2df1s2dg1ager521ger1ge2r1g', null, '广西', 'subsite1', '0358', '2', '0358', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('sdf3dsf3sd3g25s3dg2sdgsdg', 'sdf2s2df1s2dg1ager521ger1ge2r1g', '南宁', null, null, '1', '0358', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:29:12');
INSERT INTO `t_parameter_area` VALUES ('sdw0884c5e6c1e94ee70cc833aa1c2sd', '2580884c5e6c1e94ee70cc833aa1c247', '广州', null, null, '3', '020', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:29:05');

-- ----------------------------
-- Table structure for `t_parameter_basic`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_basic`;
CREATE TABLE `t_parameter_basic` (
  `basic_id` varchar(32) NOT NULL default '',
  `basic_title` varchar(100) default NULL,
  `basic_value` varchar(100) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`basic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter_basic
-- ----------------------------
INSERT INTO `t_parameter_basic` VALUES ('42d7a714a87b0219e1e3aca7579e944c', '罚息利率30天以上', '0.001', '罚息利率30天以上', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:57:51', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:57:51');
INSERT INTO `t_parameter_basic` VALUES ('608eced480dd680a4e8d4903b6aabae9', '罚息利率1至30天', '0.22', '罚息利率1至30天', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:57:31', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 13:48:27');
INSERT INTO `t_parameter_basic` VALUES ('7ec6569718a58dfc0fbddcd6ab0ec1a4', '逾期管理费30天以上', '0.005', '逾期管理费30天以上', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:58:26', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:58:26');
INSERT INTO `t_parameter_basic` VALUES ('b401347a8d5c6ab8a29f4ee4ebaa9b73', '逾期管理费1至30天', '0.001', '逾期管理费1至30天', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:58:07', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:58:07');

-- ----------------------------
-- Table structure for `t_parameter_credit`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_credit`;
CREATE TABLE `t_parameter_credit` (
  `credit_id` varchar(32) NOT NULL,
  `credit_name` varchar(50) default NULL,
  `credit_begin_integral` int(20) default NULL,
  `credit_end_integral` int(20) default NULL,
  `credit_photo` varchar(100) default NULL,
  `accessory` varchar(255) default NULL,
  `credit_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`credit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的会员信用级别设置。';

-- ----------------------------
-- Records of t_parameter_credit
-- ----------------------------
INSERT INTO `t_parameter_credit` VALUES ('125s754157cf483a790f4eea35200118', '一级', '0', '30', 'http://localhost:8888/netloan/resources/upload/image/20140331/20140331102433_822.jpg', null, '1', '', '8b25651c2d896297530b64e4b80ec503', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:24:35');
INSERT INTO `t_parameter_credit` VALUES ('2545745dsfsd4gsd5gs5dg8gsd54gyt', '二级', '30', '49', 'http://localhost:8888/netloan/resources/upload/image/20140331/20140331102506_417.jpg', null, '2', '', '8b25651c2d896297530b64e4b80ec503', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:08');
INSERT INTO `t_parameter_credit` VALUES ('354sdf454dsg54j5ytktku4y5u5ege5r', '三级', '50', '69', 'http://localhost:8888/netloan/resources/upload/image/20140331/20140331102514_717.jpg', null, '3', '', '8b25651c2d896297530b64e4b80ec503', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:16');
INSERT INTO `t_parameter_credit` VALUES ('457df5a5hrstj4tyk5je54g6er4g64g5', '四级', '70', '79', 'http://localhost:8888/netloan/resources/upload/image/20140331/20140331102522_820.jpg', null, '4', '', '8b25651c2d896297530b64e4b80ec503', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:23');
INSERT INTO `t_parameter_credit` VALUES ('61fdf9ebb768d72633fa24183317d878', '七级', '100', '1000', 'http://localhost:8888/netloan/resources/upload/image/20140331/20140331102544_840.jpg', null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:45');
INSERT INTO `t_parameter_credit` VALUES ('8161cd132ff0ae30e96ccf1ad2ab1f9f', '六级', '90', '99', 'http://localhost:8888/netloan/resources/upload/image/20140331/20140331102537_496.jpg', null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:01', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:39');
INSERT INTO `t_parameter_credit` VALUES ('9074203d753243f8be823ac411f6adc0', '五级', '80', '89', 'http://localhost:8888/netloan/resources/upload/image/20140331/20140331102529_603.jpg', null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 10:18:37', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:31');

-- ----------------------------
-- Table structure for `t_parameter_credit_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_credit_type`;
CREATE TABLE `t_parameter_credit_type` (
  `credit_type_id` varchar(32) NOT NULL,
  `credit_type` varchar(50) default NULL,
  `change_type` enum('reduction','increase') default NULL,
  `change_value` int(10) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`credit_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter_credit_type
-- ----------------------------
INSERT INTO `t_parameter_credit_type` VALUES ('07435d2048121b19211b9ed6c734bf56', 'vipAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:04:41', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:04:41');
INSERT INTO `t_parameter_credit_type` VALUES ('07753f2dd6504262cc9bb236036c596d', 'CancelWorkAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:07:06', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:10:27');
INSERT INTO `t_parameter_credit_type` VALUES ('0bc48c8f1dee476cc326ed8571998c83', 'realNameAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:06:13', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:06:13');
INSERT INTO `t_parameter_credit_type` VALUES ('11706490d8a7fdc69e45329b948a43d7', 'workAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:06:30', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:06:30');
INSERT INTO `t_parameter_credit_type` VALUES ('247969e65733a11f3d3cbbacadc21c97', 'creditAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:05:49', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:05:49');
INSERT INTO `t_parameter_credit_type` VALUES ('3a555a55d1e1e531faf0303733bf39de', 'CancelemailAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:57', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:57');
INSERT INTO `t_parameter_credit_type` VALUES ('3c8174696b45c52df876ce39b0bac2bb', 'CancelInfoAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:43', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:43');
INSERT INTO `t_parameter_credit_type` VALUES ('68c909cb081ec51445c3049880973049', 'idCardAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:54:32', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:54:32');
INSERT INTO `t_parameter_credit_type` VALUES ('6a5d30aeaaac36425e376c60b97f8aa5', 'mobileAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:05:19', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:05:19');
INSERT INTO `t_parameter_credit_type` VALUES ('7ef93697530f74b4073cc9f886b12431', 'CancelCreditAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:08:33', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:08:33');
INSERT INTO `t_parameter_credit_type` VALUES ('925e7ad974a37e07111bf9a01b699357', 'infoAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:03:39', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:03:39');
INSERT INTO `t_parameter_credit_type` VALUES ('a00ab722a6d78f12b09ab361480f8225', 'companyAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:06:03', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:06:03');
INSERT INTO `t_parameter_credit_type` VALUES ('a42c2ef10e7385a8e77464329956a42d', 'CancelVipAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:22');
INSERT INTO `t_parameter_credit_type` VALUES ('d126caad2b557228b5c9e3bb05660c50', 'CancelCompanyAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:07:56', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:10:49');
INSERT INTO `t_parameter_credit_type` VALUES ('d20a0fe0bc6b7009b569ef50a0ca6bfa', 'CancelIdCardAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:10:18', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:10:18');
INSERT INTO `t_parameter_credit_type` VALUES ('df4fe45001703cffb50496b06714fae7', 'emailAuth', 'increase', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 16:25:21', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 16:25:21');
INSERT INTO `t_parameter_credit_type` VALUES ('e11e436d6c9103c448845a8aeacce2e2', 'CancelRealNameAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:07:31', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:10:40');
INSERT INTO `t_parameter_credit_type` VALUES ('f21de85827d03f1719f64ba6274b4211', 'CancelMobileAuth', 'reduction', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:04', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:09:04');

-- ----------------------------
-- Table structure for `t_parameter_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_integral`;
CREATE TABLE `t_parameter_integral` (
  `integral_id` varchar(32) NOT NULL,
  `integral_name` varchar(50) default NULL,
  `integral_begin` int(20) default NULL,
  `integral_end` int(20) default NULL,
  `integral_photo` varchar(50) default NULL,
  `integral_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`integral_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的会员积分设置。';

-- ----------------------------
-- Records of t_parameter_integral
-- ----------------------------
INSERT INTO `t_parameter_integral` VALUES ('dcf785c13dabfeac6dc6ee0c610607b0', '三级积分', '101', '500', null, '2', '阿道夫的', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 10:35:39', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 10:38:58');
INSERT INTO `t_parameter_integral` VALUES ('er80884c5e6c1e94ee70cc833aa1c587', '一级积分', '0', '50', null, '1', null, null, null, null, null);
INSERT INTO `t_parameter_integral` VALUES ('gfd0884c5e6c1e94ee70cc833aa1c277', '二级积分', '51', '100', null, '2', null, null, null, null, null);

-- ----------------------------
-- Table structure for `t_parameter_integral_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_integral_type`;
CREATE TABLE `t_parameter_integral_type` (
  `integral_type_id` varchar(32) NOT NULL,
  `integral_type` varchar(50) default NULL,
  `change_type` enum('increase','reduction') default NULL,
  `change_value` int(10) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`integral_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter_integral_type
-- ----------------------------
INSERT INTO `t_parameter_integral_type` VALUES ('465sdaf46sd4f6', 'borrow', 'increase', '10', '借款获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-25 15:37:38', '8b25651c2d896297530b64e4b80ec503', '2014-06-25 15:37:40');
INSERT INTO `t_parameter_integral_type` VALUES ('d307a2bd62deb8c65be762ef27ceda30', 'withdraw', 'increase', '5', '提现获得5积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:41:09', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:41:09');
INSERT INTO `t_parameter_integral_type` VALUES ('d52e414663c9b191c43b4407fb76234a', 'invest', 'increase', '10', '投资获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:44:41', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:44:41');
INSERT INTO `t_parameter_integral_type` VALUES ('dd0b121fdd5c4aca2b38f5b41bfc355c', 'recharge', 'increase', '10', '充值获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:40:39', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:40:39');
INSERT INTO `t_parameter_integral_type` VALUES ('sdfg654as6df4894', 'login', 'increase', '5', '登录获得5积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-25 15:36:32', '8b25651c2d896297530b64e4b80ec503', '2014-06-25 15:36:34');

-- ----------------------------
-- Table structure for `t_parameter_optgroup`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup`;
CREATE TABLE `t_parameter_optgroup` (
  `optgroup_id` varchar(32) NOT NULL,
  `optgroup_pid` varchar(32) default NULL,
  `optgroup_code` varchar(50) default NULL,
  `optgroup_name` varchar(50) default NULL,
  `optgroup_icon` varchar(50) default NULL,
  `optgroup_url` varchar(50) default NULL,
  `optgroup_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`optgroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的下拉项管理设置。';

-- ----------------------------
-- Records of t_parameter_optgroup
-- ----------------------------
INSERT INTO `t_parameter_optgroup` VALUES ('011af2cdbc88a79786c23c8e1e940ba5', 'f48441e0a58646544deb0f4c5d8f8451', 'feeWay', '取费方式', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:35:30', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:35:30');
INSERT INTO `t_parameter_optgroup` VALUES ('0157da7199bb6160b4e22f127688c418', null, 'borrow', '我要借款', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:42:28', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:13:07');
INSERT INTO `t_parameter_optgroup` VALUES ('067abb1f4a35c41ddce2c3e1dcb45e65', '70f3280adc4b70b24d945e247909adbc', 'integralType', '积分类型', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:44:37', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:06:20');
INSERT INTO `t_parameter_optgroup` VALUES ('0af82d4dabd9cb2b809f01578965e028', '524a5f048b92584ff849a206f3c53076', 'help', '帮助中心', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:57:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('0b6919d96ff46e91471d9714bd1d205f', '113afb2ecac88fe851ad501c53b7d82b', 'auditState', '审核状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:15:43', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:04');
INSERT INTO `t_parameter_optgroup` VALUES ('113afb2ecac88fe851ad501c53b7d82b', null, 'common', '公用下拉项', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:29:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:40:24');
INSERT INTO `t_parameter_optgroup` VALUES ('163d9c2f8c189e64658e79e4e78aef73', '70f3280adc4b70b24d945e247909adbc', 'ageExpenses', '供款状况', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:09:11');
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', '113afb2ecac88fe851ad501c53b7d82b', 'status', '状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:37:23');
INSERT INTO `t_parameter_optgroup` VALUES ('1fc81d388dd8ae5e2aa23f325b193a94', '0157da7199bb6160b4e22f127688c418', 'isOverdue', '是否逾期', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:48:23', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:00:13');
INSERT INTO `t_parameter_optgroup` VALUES ('270360ceaa6ad462229f98b356909829', '70f3280adc4b70b24d945e247909adbc', 'letterstatus', '信件状态', null, null, '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:09:56', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:07:01');
INSERT INTO `t_parameter_optgroup` VALUES ('28ee70d89cd44ab3e8f6a54929a47952', '0af82d4dabd9cb2b809f01578965e028', 'webHelpType', '帮助中心类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:59:38', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('2rtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:31');
INSERT INTO `t_parameter_optgroup` VALUES ('35a594e3165ef413550cfd413fc33642', '70f3280adc4b70b24d945e247909adbc', 'bankCardAuths', '银行卡认证', null, null, '15', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:46:57', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:11:02');
INSERT INTO `t_parameter_optgroup` VALUES ('3be6f556f18b7763c74eb3e6fd992785', '70f3280adc4b70b24d945e247909adbc', 'applyType', '申请类型', null, null, '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:01:50', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:01:50');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:47');
INSERT INTO `t_parameter_optgroup` VALUES ('413a9c8479ba9b057f4b7f9c076b93ba', '0157da7199bb6160b4e22f127688c418', 'isAdvances', '是否网站代还', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:51:01', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:01:19');
INSERT INTO `t_parameter_optgroup` VALUES ('4776fe7b0e02b3467b4ea41c7e237223', '70f3280adc4b70b24d945e247909adbc', 'buyCar', '是否购车', null, null, '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:39:25', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:53');
INSERT INTO `t_parameter_optgroup` VALUES ('4aec15c2d46a7e98e6a646e0821f76cd', 'f48441e0a58646544deb0f4c5d8f8451', 'rechargeType', '充值类型', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 15:47:56', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 15:47:56');
INSERT INTO `t_parameter_optgroup` VALUES ('50891ccba80188b42cb263699ca7f689', '70f3280adc4b70b24d945e247909adbc', 'lettertype', '信件类型', null, null, '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:06:13', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:08:20');
INSERT INTO `t_parameter_optgroup` VALUES ('524a5f048b92584ff849a206f3c53076', null, 'website', '网站管理', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:56:19', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:13:50');
INSERT INTO `t_parameter_optgroup` VALUES ('54d980527c2227b5ccc8b87e46e9c1e6', 'f48441e0a58646544deb0f4c5d8f8451', 'platformType', '资金平台类型', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-26 13:39:51', '8b25651c2d896297530b64e4b80ec503', '2014-06-26 13:39:51');
INSERT INTO `t_parameter_optgroup` VALUES ('676531ee865ec4ed5f3c3ca029596293', '70f3280adc4b70b24d945e247909adbc', 'type', '类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:24:04', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:08:32');
INSERT INTO `t_parameter_optgroup` VALUES ('70f3280adc4b70b24d945e247909adbc', null, 'memberMgr', '会员管理', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:23:11', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:12:56');
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:35');
INSERT INTO `t_parameter_optgroup` VALUES ('7224e23dff0a3b71faa0a2739bd03341', '70f3280adc4b70b24d945e247909adbc', 'changeType', '改变类型', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:24', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:02:58');
INSERT INTO `t_parameter_optgroup` VALUES ('723e02be061a63f73629257804c75f46', '70f3280adc4b70b24d945e247909adbc', 'auths', '认证状态', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:24:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:05:48');
INSERT INTO `t_parameter_optgroup` VALUES ('79be87300c0df2a803dd75221f9ca0b0', '70f3280adc4b70b24d945e247909adbc', 'creditIntegralType', '信用积分类型', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:55:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:06:35');
INSERT INTO `t_parameter_optgroup` VALUES ('87a737d4e8ab1ce4f99c4d7e8332faa1', '0157da7199bb6160b4e22f127688c418', 'repayState', '还款状态', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:42:32', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:46:51');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', '113afb2ecac88fe851ad501c53b7d82b', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:52:39');
INSERT INTO `t_parameter_optgroup` VALUES ('888d760dec0ad6dfb91e8cab99091d8e', 'f48441e0a58646544deb0f4c5d8f8451', 'memberType', '有效会员等级', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:33:41', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:33:41');
INSERT INTO `t_parameter_optgroup` VALUES ('9fa0f7f7ce49cd65efae5f4e6e2f3888', '0157da7199bb6160b4e22f127688c418', 'secondAuditState', '复审审核状态', null, null, '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:09:46', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:03:13');
INSERT INTO `t_parameter_optgroup` VALUES ('a8bef69c1a0844c12750920724d858e6', '0157da7199bb6160b4e22f127688c418', 'state', '开启关闭', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:43:30', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:52:33');
INSERT INTO `t_parameter_optgroup` VALUES ('aa2fe4d8f0b757d1329ba54745721d23', '70f3280adc4b70b24d945e247909adbc', 'authType', '认证类型', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:30:00', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:05:37');
INSERT INTO `t_parameter_optgroup` VALUES ('ab01266e39b5c3949d5111ec53ec2b89', '0157da7199bb6160b4e22f127688c418', 'yesOrNo', '是否', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:37:05', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:52:25');
INSERT INTO `t_parameter_optgroup` VALUES ('b5ac6ebbc227b3a2cfe5b75ae48d81ca', '70f3280adc4b70b24d945e247909adbc', 'contactRelation', '联系人关系', null, null, '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:03:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:22');
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:28');
INSERT INTO `t_parameter_optgroup` VALUES ('cbe00383b14bfda6baccca63dc57b409', '0157da7199bb6160b4e22f127688c418', 'repayDetailState', '还款明细状态', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:46:34', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:02:31');
INSERT INTO `t_parameter_optgroup` VALUES ('ed362e9f461f6216a26f960377266e2d', '0157da7199bb6160b4e22f127688c418', 'firstAuditState', '初审审核状态', null, null, '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:08:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:47:19');
INSERT INTO `t_parameter_optgroup` VALUES ('f162bad386611ea6705db86adce95fc7', '70f3280adc4b70b24d945e247909adbc', 'maritalStatus', '婚姻状况', null, null, '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:02', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:27');
INSERT INTO `t_parameter_optgroup` VALUES ('f2cbc02d97c7bdefcb7947ef6d1c9839', '70f3280adc4b70b24d945e247909adbc', 'buyEstate', '是否购房', null, null, '13', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:36:41', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:10:34');
INSERT INTO `t_parameter_optgroup` VALUES ('f48441e0a58646544deb0f4c5d8f8451', null, 'finance', '财务管理', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:33:03', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:13:21');
INSERT INTO `t_parameter_optgroup` VALUES ('f7b381dfb53d6af2848e31907a1d9a87', '0157da7199bb6160b4e22f127688c418', 'loanState', '借款状态', null, null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:59:17', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:02:39');
INSERT INTO `t_parameter_optgroup` VALUES ('f803df8a981b670e9f41e43c7c146dc5', '0157da7199bb6160b4e22f127688c418', 'failedReason', '流标原因', null, null, '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:51:49', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:47:32');
INSERT INTO `t_parameter_optgroup` VALUES ('fd88b3384c71b648a6a4de78b8c08e7b', '0157da7199bb6160b4e22f127688c418', 'receState', '收款状态', null, null, '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:52:22', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:47:37');
INSERT INTO `t_parameter_optgroup` VALUES ('fdf78bcc980b29a21a65131eab1c1b38', '113afb2ecac88fe851ad501c53b7d82b', 'builtin', '内置', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 10:04:12');
INSERT INTO `t_parameter_optgroup` VALUES ('ffd7c68ea12a0fc392fd535e8f1e9fc1', '0157da7199bb6160b4e22f127688c418', 'receDetailState', '收款明细状态', null, null, '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:54:27', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 09:47:42');
INSERT INTO `t_parameter_optgroup` VALUES ('ss34g1rgrh1dfhsjdfh124564sdf21d', '2rtfdg1rgrh1dfhsjdfh124564sdf21d', 'user', '用户设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:25');

-- ----------------------------
-- Table structure for `t_parameter_optgroup_value`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup_value`;
CREATE TABLE `t_parameter_optgroup_value` (
  `optgroup_value_id` varchar(32) NOT NULL,
  `optgroup_id` varchar(32) default NULL,
  `optgroup_value_code` varchar(50) default NULL,
  `optgroup_value_name` varchar(50) default NULL,
  `status` enum('enable','disable') default NULL,
  `optgroup_value_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`optgroup_value_id`),
  KEY `FK_t_optvalue_t_parameter_optgroup_optgroup_id` (`optgroup_id`),
  CONSTRAINT `FK_t_optvalue_t_parameter_optgroup_optgroup_id` FOREIGN KEY (`optgroup_id`) REFERENCES `t_parameter_optgroup` (`optgroup_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的下拉项值设置。';

-- ----------------------------
-- Records of t_parameter_optgroup_value
-- ----------------------------
INSERT INTO `t_parameter_optgroup_value` VALUES ('01e83c3c661abd8809c87f0e576311ae', '79be87300c0df2a803dd75221f9ca0b0', 'realNameAuth', '实名认证信用积分', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:20:55', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:20:55');
INSERT INTO `t_parameter_optgroup_value` VALUES ('02545aea6325b648b0584d913d8713d1', 'f7b381dfb53d6af2848e31907a1d9a87', 'repaymenting', '还款中', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:08', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:08');
INSERT INTO `t_parameter_optgroup_value` VALUES ('02df4e5c07bb38221b41c9c74448fd8f', '87e805fcf0c779b8f57fde22d819e2db', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0615767fa982aecbfaf3481782f0ca9d', '723e02be061a63f73629257804c75f46', 'failure', '不通过', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:27:22', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:27:22');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0769765b6d7bafc39e154b8d478f1f81', 'a8bef69c1a0844c12750920724d858e6', 'close', '关闭', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:32:54', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:32:54');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0b5542adbf297edc010938b328dbcb09', '9fa0f7f7ce49cd65efae5f4e6e2f3888', 'secondSucess', '复审通过', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:10:11', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:10:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0de4cdf1498363b60228266317c050c1', '067abb1f4a35c41ddce2c3e1dcb45e65', 'withdraw', '提现', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:20:16', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:20:16');
INSERT INTO `t_parameter_optgroup_value` VALUES ('0f092de3c9d78e87828887caa70344e4', '79be87300c0df2a803dd75221f9ca0b0', 'CancelCompanyAuth', '取消企业认证审核', 'enable', '16', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:07', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:07');
INSERT INTO `t_parameter_optgroup_value` VALUES ('11a14da652efb14c166c9809578dad08', 'fd88b3384c71b648a6a4de78b8c08e7b', 'receiving', '收款中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:52:58', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:52:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('12f7ad68fe9be3c47fed2e9d92ddaa99', '011af2cdbc88a79786c23c8e1e940ba5', 'proportion', '比例收费', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:36:16', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:36:16');
INSERT INTO `t_parameter_optgroup_value` VALUES ('13ede9705189fd37fc29f20f9c993da1', '723e02be061a63f73629257804c75f46', 'noapply', '未申请', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:25:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:25:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('15098c1cf1c1f60ccd7fbbbfce071abf', '54d980527c2227b5ccc8b87e46e9c1e6', 'default', '默认账户', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-26 13:41:07', '8b25651c2d896297530b64e4b80ec503', '2014-06-26 13:41:07');
INSERT INTO `t_parameter_optgroup_value` VALUES ('17d110a7a8d03cefa063597749609eb4', 'f7b381dfb53d6af2848e31907a1d9a87', 'bids', '流标', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:50', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('19c24a40147510aa21c7f28e72dd8d05', '79be87300c0df2a803dd75221f9ca0b0', 'emailAuth', '邮箱认证信用积分', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:58:57', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:58:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1a41da9325b5db271741f2245055095b', '28ee70d89cd44ab3e8f6a54929a47952', 'borrow', '借款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:01:18', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1a539fceddc26eaed2b43d0606cfe990', '9fa0f7f7ce49cd65efae5f4e6e2f3888', 'secondFailure', '复审失败', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:10:59', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:10:59');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1b6a3d921eccdf2c1852a7a5b7df608a', 'f162bad386611ea6705db86adce95fc7', 'married', '已结婚', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:49', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:49');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1bcd51b7c71fc1c1f3100d378e99d5dd', 'ab01266e39b5c3949d5111ec53ec2b89', 'no', '否', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:42:09', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:42:09');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('233cd9f2502854bc1769282d4690bf3f', '79be87300c0df2a803dd75221f9ca0b0', 'idCardAuth', '身份认证信用积分', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:21:41', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:21:41');
INSERT INTO `t_parameter_optgroup_value` VALUES ('235165418eb735d5dfe7bd76638b3072', '79be87300c0df2a803dd75221f9ca0b0', 'CancelWorkAuth', '取消工作认证审核', 'enable', '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:06:09', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:06:09');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('25d256039589f8fbf89a4da80b941b36', '79be87300c0df2a803dd75221f9ca0b0', 'creditAuth', '信用认证信用积分', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:28', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('26c518f522dbbd5654a7ac77eabc79fe', 'f803df8a981b670e9f41e43c7c146dc5', 'other', '其它', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:43', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:43');
INSERT INTO `t_parameter_optgroup_value` VALUES ('27e48a33bc0571eae87094a06c108d06', '50891ccba80188b42cb263699ca7f689', 'system', '系统消息', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2a9acb4226dcaa290ec1741101e6b101', 'f803df8a981b670e9f41e43c7c146dc5', 'manually', '手动取消', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:15', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:15');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('31d06b659676b6fa953d3cb25e680315', '79be87300c0df2a803dd75221f9ca0b0', 'CancelemailAuth', '取消邮箱认证审核', 'enable', '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:18:10', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:18:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3415704bbd2882779d7c6699c987d1d4', '79be87300c0df2a803dd75221f9ca0b0', 'CancelInfoAuth', '取消信息认证审核', 'enable', '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:23:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:23:08');
INSERT INTO `t_parameter_optgroup_value` VALUES ('34bffacc5214b5e8656b30aede271ef4', '79be87300c0df2a803dd75221f9ca0b0', 'CancelMobileAuth', '取消手机认证审核', 'enable', '19', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:50', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('38def58eb2727ac6f7dd1032a5d9e434', '270360ceaa6ad462229f98b356909829', 'unread', '未读', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:34', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:34');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3f536b628f1d014dd731e7f0bc6a63e7', '3be6f556f18b7763c74eb3e6fd992785', 'phone', '电话', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3f5df7acbf734a1f96365c5624ca97bc', 'f7b381dfb53d6af2848e31907a1d9a87', 'secondAuditor', '满标', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:06:34', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 09:48:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('40d86ed33a48a1aa128fd2defaaeebea', 'aa2fe4d8f0b757d1329ba54745721d23', 'idCardAuth', '身份证认证', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41fe1d97989449699e90f7f2858d45e9', 'f7b381dfb53d6af2848e31907a1d9a87', 'completed', '已还完', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:30', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 09:49:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('42b0cbbb83cadb318ca8e134f69909d4', '35a594e3165ef413550cfd413fc33642', 'authstr', '待审核', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:13', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4346c17adc9f4b126baa6e593dfb1219', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('444bea0a1319a559f8dad6e569737fb0', '067abb1f4a35c41ddce2c3e1dcb45e65', 'invest', '投资', 'enable', '3', '投资获取积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:47:07', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:47:07');
INSERT INTO `t_parameter_optgroup_value` VALUES ('44cd3de201fd64dd1efd5d72e2b31e97', 'f7b381dfb53d6af2848e31907a1d9a87', 'firstAudit', '初审中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:05:44', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:05:44');
INSERT INTO `t_parameter_optgroup_value` VALUES ('45ed46f38b64e660713c065abcf2be95', '79be87300c0df2a803dd75221f9ca0b0', 'companyAuth', '企业认证信用积分', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:53', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('46a48351bed57b07b599a565234823f8', 'a8bef69c1a0844c12750920724d858e6', 'open', '开启', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:32:20', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:32:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('47859bb01516af361ef1b61ed5d41ba6', 'ed362e9f461f6216a26f960377266e2d', 'firstFailure', '初审失败', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:09:16', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:09:16');
INSERT INTO `t_parameter_optgroup_value` VALUES ('48219c94dc94c86116997c48c910500e', '676531ee865ec4ed5f3c3ca029596293', 'vip', 'vip会员', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:32:30', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4860bf6e387e3c1cd1f0a6b1b9395b47', '413a9c8479ba9b057f4b7f9c076b93ba', 'yes', '是', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:51:13', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:51:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4dc1fd5f1ac24e8807f59254139b0912', '79be87300c0df2a803dd75221f9ca0b0', 'infoAuth', '基本信息认证信用积分', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:56:43', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:56:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5122f4929b14499ebd97f7f99552d5c7', '28ee70d89cd44ab3e8f6a54929a47952', 'fund', '基金', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:27', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('538c0911b50592e0546800ddffd1fc5b', 'f2cbc02d97c7bdefcb7947ef6d1c9839', 'havehouse', '已购房', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('55cef926490517adcbccb54c867bd176', '888d760dec0ad6dfb91e8cab99091d8e', 'all', '全部会员', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:35:00', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:35:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('56eeec8a7371ddf86b432b42ff999b4f', '79be87300c0df2a803dd75221f9ca0b0', 'CancelIdCardAuth', '取消身份认证审核', 'enable', '17', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5be37ff93bdc78b8457a0584f2713c9f', '4776fe7b0e02b3467b4ea41c7e237223', 'nocar', '未购车', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:36', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5dfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'disable', '禁用', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6282d9040a2029a89017d1998e4ad476', '3be6f556f18b7763c74eb3e6fd992785', 'internet', '互联网', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:37', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6389ad1302b149b26120f9762f2393a9', '79be87300c0df2a803dd75221f9ca0b0', 'mobileAuth', '手机认证信用积分', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:59:32', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:59:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('66416703e266b5af49036fde2020789e', 'b5ac6ebbc227b3a2cfe5b75ae48d81ca', 'friend', '朋友', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:15', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:15');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6769699850e2ea349a9e5e24117da8dc', 'aa2fe4d8f0b757d1329ba54745721d23', 'realNameAuth', '真实姓名认证', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:41');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6796d7bfab06bd3966cacc94258f98bd', 'f2cbc02d97c7bdefcb7947ef6d1c9839', 'nohouse', '未购房', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:39', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6c1746ab0796dc6eab250aac44ea81f6', '35a594e3165ef413550cfd413fc33642', 'failure', '不通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:57', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6cac68505375f5bbb11192e56bbd907c', '888d760dec0ad6dfb91e8cab99091d8e', 'general', '普通会员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:34:04', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:34:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6d1af7e5738a6764d5d15357ad6d44cf', 'aa2fe4d8f0b757d1329ba54745721d23', 'emailAuth', '邮箱认证', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6fa46bf6f61a4794f427337fcbffdb1f', '163d9c2f8c189e64658e79e4e78aef73', 'finished', '购买完成', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:50:34', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:50:34');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6feab1473ef6cf10690d501963222c61', 'f803df8a981b670e9f41e43c7c146dc5', 'overdue', '过期取消', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:57:24', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:57:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('719669d8773b03d8e86c53363cff0276', 'ed362e9f461f6216a26f960377266e2d', 'firstSucess', '初审通过', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:08:54', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:08:54');
INSERT INTO `t_parameter_optgroup_value` VALUES ('739dcd0db0c97cb552b4b21d12fab839', 'aa2fe4d8f0b757d1329ba54745721d23', 'companyAuth', '企业认证', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:22', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:33:22');
INSERT INTO `t_parameter_optgroup_value` VALUES ('7e791fbcc7a4f82987e920cdd3638bab', 'f7b381dfb53d6af2848e31907a1d9a87', 'tendering', '招标中', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:06:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:06:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('83acf0b4025d339e4de145a31f4a5cbd', '87a737d4e8ab1ce4f99c4d7e8332faa1', 'repaying', '还款中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:43:05', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:43:05');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85787fcf128bb21708c82c6473bcefb3', '011af2cdbc88a79786c23c8e1e940ba5', 'directcost', '直接收费', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:37:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:37:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85fb7a7b1ba9c9a7194e725deca686ca', '4aec15c2d46a7e98e6a646e0821f76cd', 'offline', '线下充值', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 15:48:35', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 15:49:08');
INSERT INTO `t_parameter_optgroup_value` VALUES ('87a2ffd63588307bb94e24ec612497ea', 'cbe00383b14bfda6baccca63dc57b409', 'notRepay', '未还', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:47:14', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:47:14');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88059e49f722a35f308078da1c5713d1', '676531ee865ec4ed5f3c3ca029596293', 'general', '普通会员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:25:07', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88b3276bf8a64a68b2bea24bfaa55c8a', 'aa2fe4d8f0b757d1329ba54745721d23', 'infoAuth', '基础资料认证', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:06');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88d2f9676c58e8c8503fd8341188d22c', '3be6f556f18b7763c74eb3e6fd992785', 'scene', '现场', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:55', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:55');
INSERT INTO `t_parameter_optgroup_value` VALUES ('8bd22429b25a09ae88dfca998475c9f0', '270360ceaa6ad462229f98b356909829', 'delete', '删除', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:11:19', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:11:19');
INSERT INTO `t_parameter_optgroup_value` VALUES ('8ce23e1892cb2d3b60d402cae39a48ac', '413a9c8479ba9b057f4b7f9c076b93ba', 'no', '否', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:51:30', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:51:30');
INSERT INTO `t_parameter_optgroup_value` VALUES ('8ec85c8e13abad5110a27d7daeff7861', '7224e23dff0a3b71faa0a2739bd03341', 'reduction', '减少', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:58:20', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:58:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('92585169762ebad8a4fc2d28bf7865dd', '35a594e3165ef413550cfd413fc33642', 'changing', '变更中', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('929772e69691022e11eec98422cce15f', '79be87300c0df2a803dd75221f9ca0b0', 'CancelCreditAuth', '取消信用认证审核', 'enable', '13', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:20:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:20:24');
INSERT INTO `t_parameter_optgroup_value` VALUES ('940ab465ac0863bcc50ca35c6b27c898', 'fd88b3384c71b648a6a4de78b8c08e7b', 'Receivables', '已收', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:53:31', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:53:31');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9800aa3a72ecf3a0a3ba7008e4e5804b', 'aa2fe4d8f0b757d1329ba54745721d23', 'vipAuth', 'VIP认证', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:54');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9826ce475f1f4958f71d3f8374be1e02', 'ab01266e39b5c3949d5111ec53ec2b89', 'yes', '是', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:41:51', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:41:51');
INSERT INTO `t_parameter_optgroup_value` VALUES ('99287efc0741afc3b42d92e0e3cf64ed', 'cbe00383b14bfda6baccca63dc57b409', 'alreadRepay', '已还', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:47:31', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:47:31');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9e1cf045b48daf41b02b2e1cd6b5d271', 'aa2fe4d8f0b757d1329ba54745721d23', 'creditAuth', '信用认证', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:50', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9f82df6d34e2a30b6d739abc1c173188', 'f162bad386611ea6705db86adce95fc7', 'single', '单身', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:48:15', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:48:15');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a046211d69ac7de678e2e1cbcedf5c7c', '7224e23dff0a3b71faa0a2739bd03341', 'increase', '增加', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:58', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a0ea94aac7c6f682a5de9593bcfcf867', '79be87300c0df2a803dd75221f9ca0b0', 'CancelIdCardAuth', '取消身份认证审核', 'enable', '17', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:26:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a125b18d3e4af3551f20934c49b88c39', 'aa2fe4d8f0b757d1329ba54745721d23', 'workAuth', '工作认证', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:28', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a25bd70a928aa93d7e95cfba53d12a10', '79be87300c0df2a803dd75221f9ca0b0', 'CancelRealNameAuth', '取消实名认证审核', 'enable', '18', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:27', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:27:27');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a7a015d101c9c15598874faaab0c3292', '723e02be061a63f73629257804c75f46', 'pass', '通过', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:58', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('aa64b3148747c20abb499a752ab16858', '79be87300c0df2a803dd75221f9ca0b0', 'workAuth', '工作认证信用积分', 'enable', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:23:02', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:23:02');
INSERT INTO `t_parameter_optgroup_value` VALUES ('acd28ca36fec95be41cfdb16861fab45', '79be87300c0df2a803dd75221f9ca0b0', 'CancelVipAuth', '取消VIP认证审核', 'enable', '15', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:25:12', '8b25651c2d896297530b64e4b80ec503', '2014-06-24 10:25:12');
INSERT INTO `t_parameter_optgroup_value` VALUES ('adf5a85fc6937d07f65484014cc2ce76', '0b6919d96ff46e91471d9714bd1d205f', 'failure', '审核失败', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:17:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:23');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b33d9b72d332881a8ecc7d1841f771df', 'ffd7c68ea12a0fc392fd535e8f1e9fc1', 'notReceiving', '未收', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:54:53', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:54:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b3cae9a622e4727d3ce63bea18849fb6', '35a594e3165ef413550cfd413fc33642', 'pass', '通过', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:37', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b7fb0acac87c95c57593cee784b4527d', '87a737d4e8ab1ce4f99c4d7e8332faa1', 'alreadRepay', '已还完', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:43:28', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:43:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b9c9c122500d23bb53323b37cbee1959', '4aec15c2d46a7e98e6a646e0821f76cd', 'onLine', '线上充值', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 15:48:55', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 15:49:02');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ba125aeae408f4bb9da13fb0ea2ac67e', 'aa2fe4d8f0b757d1329ba54745721d23', 'mobileAuth', '手机认证', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:31', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:31');
INSERT INTO `t_parameter_optgroup_value` VALUES ('c0c9665a005791fd2f9550d97fe3aeb5', '79be87300c0df2a803dd75221f9ca0b0', 'vipAuth', 'VIP认证信用积分', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:55:58', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:57:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cc1db2e08263755408d0ab7c8a0bdaef', '4776fe7b0e02b3467b4ea41c7e237223', 'havecar', '已购车', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:08', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:49');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cef639d80ab89a98df7301fc8b084d32', '28ee70d89cd44ab3e8f6a54929a47952', 'invest', '投资', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('d19be93476640d86b05a60cc8a16f7af', '270360ceaa6ad462229f98b356909829', 'read', '已读', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:56', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:56');
INSERT INTO `t_parameter_optgroup_value` VALUES ('da16e6936c73f263c7d4e559dfd06849', '1fc81d388dd8ae5e2aa23f325b193a94', 'yes', '是', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:49:45', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:49:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('dc3c29fcfe59463259909304f8fe28c5', 'b5ac6ebbc227b3a2cfe5b75ae48d81ca', 'business', '商业伙伴', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:39', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('de25c503ee8296b846f9f22b3dde4b12', '1fc81d388dd8ae5e2aa23f325b193a94', 'no', '否', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:49:19', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:49:30');
INSERT INTO `t_parameter_optgroup_value` VALUES ('deb838911730fd2ae91a3d86740b6ca5', '163d9c2f8c189e64658e79e4e78aef73', 'mortgage', '抵押贷款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e45a84327d26ffa159da270f95ef0a91', '067abb1f4a35c41ddce2c3e1dcb45e65', 'recharge', '充值', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:19:57', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:19:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e562da88a8cd568afc60c2c31b83e2f4', '067abb1f4a35c41ddce2c3e1dcb45e65', 'login', '登录', 'enable', '1', '登录获取积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:45:30', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:45:40');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e5b76e49ef32f7636d377e5bda82c27e', '888d760dec0ad6dfb91e8cab99091d8e', 'vip', 'VIP会员', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:34:39', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:34:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e60a0f1adebf1b828640fbb338316eb8', '0b6919d96ff46e91471d9714bd1d205f', 'authstr', '审核中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ead9c20f4d1457b1d436e8333aeb9a13', '723e02be061a63f73629257804c75f46', 'authstr', '待审核', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 16:29:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('eaff01e8813e716704ddf0427e633b1c', '54d980527c2227b5ccc8b87e46e9c1e6', 'external', '外置账户', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-26 13:40:38', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:22:25');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ecefc7db8ad84949efb3aeaeacbef2de', 'f162bad386611ea6705db86adce95fc7', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:49:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:49:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f081962b0b8f3b28b727c60b821dbee2', '87e805fcf0c779b8f57fde22d819e2db', 'woman', '女', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f1498ee9de5b4e78fe4654ae3b3175bb', '0b6919d96ff46e91471d9714bd1d205f', 'pass', '审核通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f574f84909058730e0a5ea9b4e60b207', 'ffd7c68ea12a0fc392fd535e8f1e9fc1', 'alreadReceivables', '已收', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:55:09', '8b25651c2d896297530b64e4b80ec503', '2014-05-12 15:55:09');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f5c6d5d996f84d958bff9d5512457896', '067abb1f4a35c41ddce2c3e1dcb45e65', 'borrow', '借款', 'enable', '2', '借款获取积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:46:02', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 13:46:02');
INSERT INTO `t_parameter_optgroup_value` VALUES ('fb1fe48c81c8e52c70578b8420f2d1bf', '50891ccba80188b42cb263699ca7f689', 'notSystem', '非系统消息', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:01', '8b25651c2d896297530b64e4b80ec503', '2014-06-16 15:07:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('fdc17951d080e6b815c1aab0d5c8ed32', 'b5ac6ebbc227b3a2cfe5b75ae48d81ca', 'family', '家人', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:03:56', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:03:56');

-- ----------------------------
-- Table structure for `t_parameter_question`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_question`;
CREATE TABLE `t_parameter_question` (
  `question_id` varchar(32) NOT NULL,
  `question_des` varchar(255) default NULL,
  `question_num` int(10) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`question_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter_question
-- ----------------------------
INSERT INTO `t_parameter_question` VALUES ('3550a0380ba642fc470530373dad0d89', '您中学学校校名？', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:11', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:11');
INSERT INTO `t_parameter_question` VALUES ('832ff47c0d30120d30a93cc6921c0ee0', '您高中学校校名？', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:20', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:20');
INSERT INTO `t_parameter_question` VALUES ('da8dd84b35e344dc2dea59f51a194a88', '您大学学校校名？', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:29', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:29');
INSERT INTO `t_parameter_question` VALUES ('fbce9b6269e69d3efa74fef9f2b3dc3e', '您小学学校校名？', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:01', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:20:01');

-- ----------------------------
-- Table structure for `t_parameter_system_variables`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_system_variables`;
CREATE TABLE `t_parameter_system_variables` (
  `variables_id` varchar(32) NOT NULL COMMENT '系统变量Id',
  `specification` varchar(50) default NULL COMMENT '参数说明',
  `input_tip` varchar(50) default NULL COMMENT '输入提示',
  `parameter_values` varchar(50) default NULL COMMENT '参数值',
  `variable_name` varchar(50) default NULL COMMENT '变量名',
  `form_type` enum('input','textarea') default NULL COMMENT '表单类型',
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`variables_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的系统变量';

-- ----------------------------
-- Records of t_parameter_system_variables
-- ----------------------------
INSERT INTO `t_parameter_system_variables` VALUES ('4css921507de7b121d37b460d65b5g', '参数说明', '输入提示', '参数值', '变量名', 'input', '测试数据', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 15:22:26', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 13:49:07');

-- ----------------------------
-- Table structure for `t_receivables_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_receivables_notes`;
CREATE TABLE `t_receivables_notes` (
  `rece_notes_id` varchar(32) NOT NULL,
  `tender_notes_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL COMMENT '收款人',
  `receivables_total` float default NULL COMMENT '收款总金额',
  `should_rece_money` float default NULL COMMENT '应收本息',
  `alr_rece_money` float default NULL COMMENT '已收本息',
  `not_rece_money` float default NULL COMMENT '未收本息',
  `should_rece_principal` float default NULL COMMENT '应收本金',
  `alr_rece_principal` float default NULL COMMENT '已收本金',
  `not_rece_principal` float default NULL COMMENT '未收本金',
  `should_rece_interest` float default NULL COMMENT '应收利息',
  `alr_rece_interest` float default NULL COMMENT '已收利息',
  `not_rece_interest` float default NULL COMMENT '未收利息',
  `alr_overdue_interest` float default NULL,
  `rece_state` enum('receiving','Receivables') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`rece_notes_id`),
  KEY `FK_FK_t_receivables_notes_t_tender_notes_tender_notes_id` (`tender_notes_id`),
  CONSTRAINT `t_receivables_notes_ibfk_1` FOREIGN KEY (`tender_notes_id`) REFERENCES `t_tender_notes` (`tender_notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_receivables_notes
-- ----------------------------
INSERT INTO `t_receivables_notes` VALUES ('asd2f32ds3f2sadf', '03eccc594991a0128ec3c58161be952a', '0d06ae74d5a50659c4c40d4ee980a748', '1474', '2000', '10', '10', '10', '10', '10', '10', '10', '10', '10', 'receiving', null, null, '2014-06-17 14:50:05', null, '2014-06-27 17:28:10');

-- ----------------------------
-- Table structure for `t_receivables_notes_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_receivables_notes_detail`;
CREATE TABLE `t_receivables_notes_detail` (
  `rece_notes_detail_id` varchar(32) NOT NULL,
  `rece_notes_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL,
  `alr_rece_money` float default NULL,
  `number_period` varchar(32) default NULL,
  `should_rece_date` datetime default NULL,
  `actual_rece_date` datetime default NULL,
  `current_rece_moeny` float default NULL,
  `current_rece_principal` float default NULL,
  `current_rece_interest` float default NULL,
  `surplus_principal` float default NULL,
  `interest_mana_fee` float default NULL,
  `is_overdue` enum('no','yes') default NULL,
  `overdue_interest` float default NULL,
  `overdue_days` float default NULL,
  `income` float default NULL,
  `amount` float default NULL COMMENT '总金额',
  `rece_state` enum('notReceiving','alreadReceivables') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`rece_notes_detail_id`),
  KEY `FK_t_receivables_notes_detail_t_receivables_notes_rece_notes_id` (`rece_notes_id`),
  CONSTRAINT `t_receivables_notes_detail_ibfk_1` FOREIGN KEY (`rece_notes_id`) REFERENCES `t_receivables_notes` (`rece_notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_receivables_notes_detail
-- ----------------------------
INSERT INTO `t_receivables_notes_detail` VALUES ('as323sa2df', 'asd2f32ds3f2sadf', '0d06ae74d5a50659c4c40d4ee980a748', '1000', '200', '2014-06-17 14:45:47', '2014-06-17 14:45:51', '200', '22', '10', '10', '10', 'yes', '484', '11', '10', '10000', 'alreadReceivables', null, null, '2014-06-17 14:50:09', null, '2014-06-27 17:28:10');

-- ----------------------------
-- Table structure for `t_repayment_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_notes`;
CREATE TABLE `t_repayment_notes` (
  `repay_notes_id` varchar(32) NOT NULL default '',
  `loan_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL COMMENT '还款人',
  `repayment_total` float default NULL,
  `should_pay_money` float default NULL,
  `alr_pay_money` float default NULL,
  `not_pay_money` float default NULL,
  `should_pay_principal` float default NULL COMMENT '应还本金',
  `alr_pay_principal` float default NULL COMMENT '已还本金',
  `not_pay_principal` float default NULL COMMENT '未还本金',
  `should_pay_interest` float default NULL COMMENT '应还利息',
  `alr_pay_interest` float default NULL COMMENT '已还利息',
  `not_pay_interest` float default NULL COMMENT '未还利息',
  `alr_overdue_interest` float default NULL,
  `alr_overdue_urge` float default NULL,
  `alr_overdue_mana` float default NULL,
  `repay_state` enum('repaying','alreadRepay') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`repay_notes_id`),
  KEY `FK_t_repayment_notes_t_borrowing_loan_loan_id` (`loan_id`),
  CONSTRAINT `t_repayment_notes_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `t_borrowing_loan` (`loan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repayment_notes
-- ----------------------------
INSERT INTO `t_repayment_notes` VALUES ('dsf65s4dg56', 'dff3423436b93b6997a06b66324564c', '', '6100', '200', '300', '400', null, null, null, null, null, null, '500', '600', '700', 'repaying', null, null, null, null, '2014-06-27 17:28:10');

-- ----------------------------
-- Table structure for `t_repayment_notes_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_notes_detail`;
CREATE TABLE `t_repayment_notes_detail` (
  `repay_notes_detail_id` varchar(32) NOT NULL,
  `repay_notes_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL COMMENT '还款人',
  `number_period` float default NULL,
  `should_pay_date` datetime default NULL,
  `actual_pay_date` datetime default NULL,
  `current_pay_moeny` float default NULL,
  `current_pay_principal` float default NULL,
  `current_pay_interest` float default NULL,
  `actual_pay_money` float default NULL,
  `also_need_money` float default NULL COMMENT '总还款金额',
  `overdue_interest` float default NULL,
  `overdue_urge_fee` float default NULL,
  `overdue_mana_fee` float default NULL,
  `overdue_days` varchar(32) default NULL,
  `is_overdue` enum('no','yes') default NULL,
  `is_advances` enum('no','yes') default NULL,
  `repay_state` enum('notRepay','alreadRepay') default NULL,
  `remark` varchar(32) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`repay_notes_detail_id`),
  KEY `FK_t_repayment_notes_t_repayment_notes_detail_repay_notes_id` (`repay_notes_id`),
  CONSTRAINT `t_repayment_notes_detail_ibfk_1` FOREIGN KEY (`repay_notes_id`) REFERENCES `t_repayment_notes` (`repay_notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repayment_notes_detail
-- ----------------------------
INSERT INTO `t_repayment_notes_detail` VALUES ('asf262asf2dg6gd23sg', 'dsf65s4dg56', '0d06ae74d5a50659c4c40d4ee980a748', '1000', '2014-06-03 10:45:15', '2014-06-03 10:45:18', '2000', '3000', '4000', '5000', '6000', '11000', '8000', '11000', '25', 'yes', 'no', 'notRepay', null, null, null, null, '2014-06-27 17:28:10');

-- ----------------------------
-- Table structure for `t_repayment_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_type`;
CREATE TABLE `t_repayment_type` (
  `repayment_type_id` varchar(32) NOT NULL,
  `repayment_type_name` varchar(30) default NULL,
  `algorithm_info` varchar(50) default NULL,
  `state` enum('open','close') default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`repayment_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repayment_type
-- ----------------------------
INSERT INTO `t_repayment_type` VALUES ('1873eeaa00e9e544c759595ffb98ab06', '一次性还款', '到期还本付息   ', 'open', '到期还本付息   ', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 13:37:28', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 14:05:57');
INSERT INTO `t_repayment_type` VALUES ('60d13359890d7edfe536ce87af02d6e5', '等额本息', '贷款本金×月利率×（1+月利率）还款月数/[（1+月利率）还款月数-1]', 'open', '额本息还款法是一种被广泛采用的还款方式。在还款期内，每月偿还同等数额的借款(包括本金和利息)。借款人每月还款额中的本金比重逐月递增、利息比重逐月递减。', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:18:03', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 14:06:09');
INSERT INTO `t_repayment_type` VALUES ('e444483d3b503b99d7572d2008e5b099', '按月付息，到期还本', '按月付息，到期还本', 'close', '按月付息，到期还本', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:18:27', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 14:06:01');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` varchar(32) NOT NULL,
  `role_en_name` varchar(25) NOT NULL,
  `role_cn_name` varchar(25) default NULL,
  `builtin` varchar(10) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'test', '测试角色', 'custom', '看看', '8b25651c2d896297530b64e4b80ec503', '2014-02-10 02:58:02');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'admin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16 02:58:58');

-- ----------------------------
-- Table structure for `t_tender_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_tender_notes`;
CREATE TABLE `t_tender_notes` (
  `tender_notes_id` varchar(32) NOT NULL,
  `loan_id` varchar(32) default NULL,
  `member_id` varchar(32) default NULL COMMENT '���ID',
  `sub_sum` float default NULL,
  `tender_money` float default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`tender_notes_id`),
  KEY `FK_t_tender_notes_t_borrowing_loan_loan_id` (`loan_id`),
  CONSTRAINT `t_tender_notes_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `t_borrowing_loan` (`loan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_tender_notes
-- ----------------------------
INSERT INTO `t_tender_notes` VALUES ('03eccc594991a0128ec3c58161be952a', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, '1000', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-26 15:15:35', null, null);
INSERT INTO `t_tender_notes` VALUES ('16c1eb21c895a50733d61459f3cbe3da', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, '600', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-26 15:16:04', null, null);
INSERT INTO `t_tender_notes` VALUES ('26ded07582ba784806c0652d07313ea6', 'a2e88edde6ece006c694edbcdc90ea62', 'c61da6243a471bfffbe3fd4101e41242', null, '1000', null, 'c61da6243a471bfffbe3fd4101e41242', '2014-05-26 15:14:54', null, null);
INSERT INTO `t_tender_notes` VALUES ('3556685f2d48dd1ce2a4ea95b8d5937d', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, '1000', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-26 15:15:44', null, null);
INSERT INTO `t_tender_notes` VALUES ('530e1d86768790a6f0ef5fcb1d765c57', 'dff3423436b93b6997a06b66324564c', '0d06ae74d5a50659c4c40d4ee980a748', '1', null, null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-06 15:38:51', null, null);
INSERT INTO `t_tender_notes` VALUES ('57523ce1fd4c8f3af01e3978575ccfbc', 'a2e88edde6ece006c694edbcdc90ea62', 'c61da6243a471bfffbe3fd4101e41242', null, '200', null, 'c61da6243a471bfffbe3fd4101e41242', '2014-05-26 15:15:02', null, null);
INSERT INTO `t_tender_notes` VALUES ('5e3b69ef82035f2bda823e1e86bb7bda', 'a74835e0efd680bdffca5adebb196c4e', 'f842fdbfe42190da7bea612a54debb31', null, '1000', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-27 15:37:01', null, null);
INSERT INTO `t_tender_notes` VALUES ('5fe22f2ec877d7887c6718e99a1c92af', 'dff3423436b93b6997a06b66324564c', 'f842fdbfe42190da7bea612a54debb31', '2', null, null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-06 15:37:35', null, null);
INSERT INTO `t_tender_notes` VALUES ('65469892137840a5557c0a046d204989', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, '1000', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-26 15:15:31', null, null);
INSERT INTO `t_tender_notes` VALUES ('7ceb7aa962a1b81b2c23ec908e08026b', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, '500', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-26 15:15:59', null, null);
INSERT INTO `t_tender_notes` VALUES ('83eb911dbb3be75f43a7029c234b44a4', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, '900', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-26 15:15:50', null, null);
INSERT INTO `t_tender_notes` VALUES ('979424adf6c3084d879d716500337a47', 'a2e88edde6ece006c694edbcdc90ea62', 'c61da6243a471bfffbe3fd4101e41242', null, '1000', null, 'c61da6243a471bfffbe3fd4101e41242', '2014-05-26 15:14:38', null, null);
INSERT INTO `t_tender_notes` VALUES ('a10c339e987606b4fbab9fa485619779', '5627fc801ee0205417d66b1daec10423', 'f842fdbfe42190da7bea612a54debb31', null, '300', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 13:16:03', null, null);
INSERT INTO `t_tender_notes` VALUES ('ba4c58f351eec4d8b820f2a9487ea477', 'dff3423436b93b6997a06b66324564c', 'f842fdbfe42190da7bea612a54debb31', '1', null, null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-27 15:36:44', null, null);
INSERT INTO `t_tender_notes` VALUES ('c555828f69680450e20a6d0e434d9649', 'dff3423436b93b6997a06b66324564c', '0d06ae74d5a50659c4c40d4ee980a748', '1', null, null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-06 15:06:06', null, null);
INSERT INTO `t_tender_notes` VALUES ('c8d167b6a6790d86bfc384c5fce2446c', 'dff3423436b93b6997a06b66324564c', '0d06ae74d5a50659c4c40d4ee980a748', '1', null, null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-06 15:32:34', null, null);
INSERT INTO `t_tender_notes` VALUES ('d9b1b519c5ac011fbc4651f9b062c8c5', 'a2e88edde6ece006c694edbcdc90ea62', 'c61da6243a471bfffbe3fd4101e41242', null, '800', null, 'c61da6243a471bfffbe3fd4101e41242', '2014-05-26 15:14:49', null, null);
INSERT INTO `t_tender_notes` VALUES ('de183739a0eb5dd1ad4764218a45c22a', 'a2e88edde6ece006c694edbcdc90ea62', 'c61da6243a471bfffbe3fd4101e41242', null, '1000', null, 'c61da6243a471bfffbe3fd4101e41242', '2014-05-26 15:14:43', null, null);
INSERT INTO `t_tender_notes` VALUES ('de7c4f195ee4de7243da15261151e6b5', '5627fc801ee0205417d66b1daec10423', 'f842fdbfe42190da7bea612a54debb31', null, '300', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-21 13:20:45', null, null);
INSERT INTO `t_tender_notes` VALUES ('e41ae7c34b4f2648633608cc1e3419c5', 'dff3423436b93b6997a06b66324564c', '0d06ae74d5a50659c4c40d4ee980a748', '2', null, null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-06 15:39:03', null, null);
INSERT INTO `t_tender_notes` VALUES ('fa61bc80eca0c1aaebd241aa8376a7f2', 'a2e88edde6ece006c694edbcdc90ea62', 'f842fdbfe42190da7bea612a54debb31', null, '1000', null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-26 15:15:40', null, null);
INSERT INTO `t_tender_notes` VALUES ('ff913d3eb3052363509f72c280641eeb', 'dff3423436b93b6997a06b66324564c', 'f842fdbfe42190da7bea612a54debb31', '12', null, null, 'f842fdbfe42190da7bea612a54debb31', '2014-05-06 17:37:32', null, null);

-- ----------------------------
-- Table structure for `t_tender_repayment`
-- ----------------------------
DROP TABLE IF EXISTS `t_tender_repayment`;
CREATE TABLE `t_tender_repayment` (
  `repayment_type_id` varchar(32) NOT NULL,
  `loan_tender_id` varchar(32) NOT NULL,
  PRIMARY KEY  (`repayment_type_id`,`loan_tender_id`),
  KEY `FK_t_tender_repayment_t_repayment_type_repayment_type_id` (`repayment_type_id`),
  KEY `t_tender_repayment_t_loan_tender_loan_tender_id` (`loan_tender_id`),
  CONSTRAINT `t_tender_repayment_ibfk_1` FOREIGN KEY (`loan_tender_id`) REFERENCES `t_loan_tender` (`loan_tender_id`),
  CONSTRAINT `t_tender_repayment_ibfk_2` FOREIGN KEY (`repayment_type_id`) REFERENCES `t_repayment_type` (`repayment_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_tender_repayment
-- ----------------------------
INSERT INTO `t_tender_repayment` VALUES ('1873eeaa00e9e544c759595ffb98ab06', '1c362eac7ec315aa47ab84360d4e390d');
INSERT INTO `t_tender_repayment` VALUES ('1873eeaa00e9e544c759595ffb98ab06', '9788195653f335695256551b82fcbac6');
INSERT INTO `t_tender_repayment` VALUES ('60d13359890d7edfe536ce87af02d6e5', '2587bd0ecc859e35f2874f2aff0d4852');
INSERT INTO `t_tender_repayment` VALUES ('60d13359890d7edfe536ce87af02d6e5', '9788195653f335695256551b82fcbac6');
INSERT INTO `t_tender_repayment` VALUES ('60d13359890d7edfe536ce87af02d6e5', 'aa09e227a4a40cb6cb15703b98522672');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', '1c362eac7ec315aa47ab84360d4e390d');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', '2587bd0ecc859e35f2874f2aff0d4852');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', '9788195653f335695256551b82fcbac6');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', 'aa09e227a4a40cb6cb15703b98522672');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` varchar(32) NOT NULL,
  `username` varchar(20) NOT NULL,
  `user_cn_name` varchar(50) default NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(50) default NULL,
  `status` enum('disable','enable') NOT NULL,
  `builtin` enum('custom','builtin','admin') NOT NULL,
  `email` varchar(50) default NULL,
  `user_image` varchar(50) default NULL,
  `remark` varchar(255) default NULL,
  `last_login_time` datetime default NULL,
  `last_login_ip_address` varchar(150) default NULL,
  `login_count` int(10) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('79695ff17eb0c8f486b8bd88a51b057e', 'secondaryAdmin', '二级管理员', '166db4478d48c7de310ea745077f9315cd3ae354', 'bb00b73f65c81d5f', 'enable', 'custom', 'secondaryAdmin@glacier.cn', null, '这是二级管理员，权限低于超级管理员', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 02:58:58');
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2014-06-27 17:28:29', '127.0.0.1[本地]', '832', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');

-- ----------------------------
-- Table structure for `t_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `role_id` varchar(32) NOT NULL COMMENT '角色Id',
  PRIMARY KEY  (`user_id`,`role_id`),
  KEY `FK_t_user_role2` (`role_id`),
  CONSTRAINT `FK_t_user_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`),
  CONSTRAINT `FK_t_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('79695ff17eb0c8f486b8bd88a51b057e', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', 'c87dd7161dbf8777c41b8cbfaa985db4');

-- ----------------------------
-- Table structure for `t_user_setting`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_setting`;
CREATE TABLE `t_user_setting` (
  `user_id` varchar(32) NOT NULL,
  `set_key` varchar(50) default NULL,
  `set_name` varchar(50) default NULL,
  `set_value` varchar(255) default NULL,
  `set_description` varchar(255) default NULL,
  PRIMARY KEY  (`user_id`),
  CONSTRAINT `FK_user_user_setting_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user_setting
-- ----------------------------

-- ----------------------------
-- Table structure for `t_website_advertisement`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_advertisement`;
CREATE TABLE `t_website_advertisement` (
  `web_adv_id` varchar(32) NOT NULL,
  `web_adv_theme` varchar(100) default NULL,
  `web_adv_content` text,
  `web_adv_status` enum('enable','disable') default NULL COMMENT 'dsafsdafasdfd',
  `clicks` int(11) default NULL,
  `accessory` varchar(255) default NULL,
  `web_adv_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_adv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的网站广告表。';

-- ----------------------------
-- Records of t_website_advertisement
-- ----------------------------
INSERT INTO `t_website_advertisement` VALUES ('034a562ab8d16e9cae8deaf2387453be', '央行公布新货币政策工具SLF 曾用于春节及6月钱荒', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=287\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">央行公布新货币政策工具SLF 曾用于春节及6月钱荒】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=287\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">央行公布新货币政策工具SLF 曾用于春节及6月钱荒】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=287\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">央行公布新货币政策工具SLF 曾用于春节及6月钱荒】</a>', 'enable', '0', null, '3', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:02', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:02');
INSERT INTO `t_website_advertisement` VALUES ('38e6894817f7a7f0609511469e20249b', '腾讯联手华夏基金 挑战阿里互联网金融', '腾讯联手华夏基金 挑战阿里互联网金融腾讯联手华夏基金 挑战阿里互联网金融腾讯联手华夏基金 挑战阿里互联网金融腾讯联手华夏基金 挑战阿里互联网金融', 'enable', '0', null, '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:41:50', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:41:50');
INSERT INTO `t_website_advertisement` VALUES ('995199d3cf93d7a5e4c499fcbbcb4ad9', '冰川贷投资月收入超十万，突破两年来记录。', '					今月单个VIP会员最高收入达十万元。<img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/81.gif\" alt=\"\" border=\"0\" />\r\n				', 'enable', '0', null, '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:27:40', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:31:16');
INSERT INTO `t_website_advertisement` VALUES ('a3502a7c0d6f63d4288a186435d2bf4a', '移动支付国家标准2014年5月1日起实施 亮点解读', '移动支付国家标准2014年5月1日起实施 亮点解读移动支付国家标准2014年5月1日起实施 亮点解读移动支付国家标准2014年5月1日起实施 亮点解读移动支付国家标准2014年5月1日起实施 亮点解读', 'enable', '0', null, '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:17', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:17');
INSERT INTO `t_website_advertisement` VALUES ('ff2295894bad92777fb28caf90d05908', '2013年人民币汇率41次创新高 2014年或仍将升值】', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=147&amp;id=169\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">2013年人民币汇率41次创新高 2014年或仍将升值】</a>', 'enable', '0', null, '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:32', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:42:32');

-- ----------------------------
-- Table structure for `t_website_announcement`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_announcement`;
CREATE TABLE `t_website_announcement` (
  `web_ann_id` varchar(32) NOT NULL,
  `web_ann_theme` varchar(100) default NULL,
  `web_ann_content` text,
  `web_ann_status` enum('enable','disable') default NULL COMMENT 'dsafsdafasdfd',
  `clicks` int(11) default NULL,
  `accessory` varchar(255) default NULL,
  `web_ann_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_ann_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的网站公告表。';

-- ----------------------------
-- Records of t_website_announcement
-- ----------------------------
INSERT INTO `t_website_announcement` VALUES ('275bbd0ecc859e35f2874f2aff056671', '关于“积分金冠”活动土豪金奖品获奖名单公布', '关于“积分金冠”活动土豪金奖品获奖名单公布关于“积分金冠”活动土豪金奖品获奖名单公布关于“积分金冠”活动土豪金奖品获奖名单公布关于“积分金冠”活动土豪金奖品获奖名单公布', 'enable', '0', null, '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:42', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:42');
INSERT INTO `t_website_announcement` VALUES ('2f8fb008b129488fefbbb96808cc46dd', '关于2014春节期间业务受理及值班公告', '					<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a>\r\n				', 'enable', '0', null, '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:28', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:16:42');
INSERT INTO `t_website_announcement` VALUES ('3a0e6fb0045f2ad1507d206952faf980', '关于DNS服务器维护相关公告', '					<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a>\r\n				', 'enable', '0', null, '3', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:58', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:16:36');
INSERT INTO `t_website_announcement` VALUES ('480ba7dc83bbd37fded2533446262793', '关于国付宝充值接口升级相关公告', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a>', 'enable', '0', null, '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:56', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:56');
INSERT INTO `t_website_announcement` VALUES ('6deb238f5c69836026451fe5547cec7f', '关于净值借款入帐款禁止投标、提现公告说明', '					<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a>\r\n				', 'enable', '0', null, '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:44', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:16:46');
INSERT INTO `t_website_announcement` VALUES ('6f4364db610a43e36927f0c55d903631', '关于1月11日凌晨零点临时维护公告', '					<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a>\r\n				', 'enable', '0', null, '7', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:11', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:17:01');
INSERT INTO `t_website_announcement` VALUES ('9d7da5657873c1acfc2a1c6cfa6fa27c', '关于中国工商银行系统维护的公告', '					关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告\r\n				', 'enable', '0', null, '6', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:58', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:16:52');

-- ----------------------------
-- Table structure for `t_website_help`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_help`;
CREATE TABLE `t_website_help` (
  `web_help_id` varchar(32) NOT NULL,
  `web_help_theme` varchar(100) default NULL,
  `web_help_content` text,
  `web_help_type` enum('borrow','invest','fund') default NULL,
  `web_help_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_cla_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_help_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的帮助中心表。';

-- ----------------------------
-- Records of t_website_help
-- ----------------------------
INSERT INTO `t_website_help` VALUES ('165f89c9b030fe9c2726e1f6ce2e57bb', '冰川贷公司斩获2013中关村十大评选两项大奖 ', '					\r\n				', 'borrow', 'enable', '', '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:35:36', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:10:35');
INSERT INTO `t_website_help` VALUES ('343d2f62064b0fa55703d31f29c55b24', '个人借款需提供的资料有哪些？', '<a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss18\">个人借款需提供的资料有哪些？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss18\">个人借款需提供的资料有哪些？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss18\">个人借款需提供的资料有哪些？</span></a>', 'borrow', 'enable', '', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:24', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:24');
INSERT INTO `t_website_help` VALUES ('5a6c7cb818603650f5ac75894744d8af', '机构借款需提供哪些资料？', '<a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss21\">机构借款需提供哪些资料？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss21\">机构借款需提供哪些资料？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss21\">机构借款需提供哪些资料？</span></a>', 'borrow', 'enable', '', '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:36', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:36');
INSERT INTO `t_website_help` VALUES ('673a31387a479d6bf97cb54de8662218', '借款期限、利率和还款方式?', '					\r\n				', 'borrow', 'enable', '', '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:51:38', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:10:45');
INSERT INTO `t_website_help` VALUES ('73c8f1be77eed5fbfb8dbe6e1613c920', '贷款需要满足的条件?', '<a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss5\">贷款需要满足的条件?</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss5\">贷款需要满足的条件?</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss5\">贷款需要满足的条件?</span></a>', 'borrow', 'enable', '', '6', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:53', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:53');
INSERT INTO `t_website_help` VALUES ('ae43db242a43892080eada7e68383960', '怎样进行提现设置?', '<a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss6\">怎样进行提现设置?</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss6\">怎样进行提现设置?</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss6\">怎样进行提现设置?</span></a>', 'fund', 'enable', '', '3', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:07', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:07');
INSERT INTO `t_website_help` VALUES ('ca356d498bc568561eb92e7fb5f2274b', '视频认证、借款成功?', '<a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss13\">视频认证、借款成功?</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss13\">视频认证、借款成功?</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss13\">视频认证、借款成功?</span></a>', 'borrow', 'enable', '', '7', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:53:17', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:53:17');

-- ----------------------------
-- Table structure for `t_website_hiring`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_hiring`;
CREATE TABLE `t_website_hiring` (
  `web_hiring_id` varchar(32) NOT NULL,
  `web_hiring_theme` varchar(100) default NULL,
  `web_hiring_content` text,
  `web_hiring_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_hiring_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_hiring_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的招聘管理表。';

-- ----------------------------
-- Records of t_website_hiring
-- ----------------------------
INSERT INTO `t_website_hiring` VALUES ('34561fa9f66ac61df8e98ea2391341e6', '招聘投资/理财顾问10名 ', '					招聘投资/理财顾问10名\r\n				', 'enable', '', '3', 'sf', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:25:29', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:11:35');
INSERT INTO `t_website_hiring` VALUES ('7777a1a9f65a86675dcc82ca4f574f7b', '招聘信贷经理/信贷助理/信贷秘书2名 ', '					招聘信贷经理/信贷助理/信贷秘书2名 <br />\r\n				', 'enable', '', '2', 'asdasdf', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:53:13', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:11:29');
INSERT INTO `t_website_hiring` VALUES ('7bacad18f86870b6c6ae4f1d94ec8902', '招聘金融信贷专员5名 ', '招聘金融信贷专员5名招聘金融信贷专员5名', 'enable', '', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:29:33', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:48:31');
INSERT INTO `t_website_hiring` VALUES ('86d2cabfc0253442feb472f3917f745d', '招聘投资/理财主管2名 ', '										招聘投资/理财主管2名 <br />\r\n				\r\n				', 'enable', '', '1', 'dd', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 14:58:17', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:11:21');
INSERT INTO `t_website_hiring` VALUES ('db5c1fa9f66ac61df8e98ea2391341e6', '招聘系统开发/维护10名 ', '招聘系统开发/维护10名招聘系统开发/维护10名', 'enable', '', '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:48:44', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:48:44');

-- ----------------------------
-- Table structure for `t_website_link`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_link`;
CREATE TABLE `t_website_link` (
  `web_link_id` varchar(32) NOT NULL,
  `web_link_name` varchar(100) default NULL,
  `web_link_url` varchar(100) default NULL,
  `web_link_photo` varchar(100) default NULL,
  `web_link_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_link_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的友情链接表。';

-- ----------------------------
-- Records of t_website_link
-- ----------------------------
INSERT INTO `t_website_link` VALUES ('4fc1c2b44ceb087b3fc4faf4831a9f20', '中移电子商务有限公司', 'zhongyidianzi.com', 'C://photo', 'enable', null, '3', '中移电子商务有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:55', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:07:32');
INSERT INTO `t_website_link` VALUES ('63070b421c95338eedbca0127e8b382d', '百度一下', 'baidu.com', 'C://photo', 'enable', null, '2', '百度一下', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:32:21', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:07:52');
INSERT INTO `t_website_link` VALUES ('cc4342755eb8ee1d5d106188a44745a3', '宝付网络科技（上海）有限公司', 'zhifubao.com', 'C://photo', 'enable', null, '4', '宝付网络科技（上海）有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:16', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:07:43');
INSERT INTO `t_website_link` VALUES ('cf384296b4cc0904afd6f152752362eb', '冰川软件', 'gracier.com', 'C://photo', 'enable', null, '1', '冰川软件', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:31:02', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:31:02');
INSERT INTO `t_website_link` VALUES ('e13efd6adffe6fa43b589c1f07779bd1', '迅付信息科技有限公司', 'xufuxinxi.com', 'C://photo', 'enable', null, '5', '迅付信息科技有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:37', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 11:08:01');

-- ----------------------------
-- Table structure for `t_website_nav`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_nav`;
CREATE TABLE `t_website_nav` (
  `web_nav_id` varchar(32) NOT NULL,
  `web_nav_pid` varchar(32) default NULL,
  `web_nav_name` varchar(100) default NULL,
  `web_nav_url` varchar(100) default NULL,
  `web_nav_status` enum('enable','disable') default NULL,
  `web_nav_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_nav_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的导航管理表。';

-- ----------------------------
-- Records of t_website_nav
-- ----------------------------
INSERT INTO `t_website_nav` VALUES ('0e68817baeba1109fbcfd53c837dbc66', '533321196059fa5805661651134a58fe', '联系我们', '  ', 'enable', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:51', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:14:48');
INSERT INTO `t_website_nav` VALUES ('133ccad08d70daf73b77fb8fb1bcee0c', null, '首页', 'index', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:43:48', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:56:23');
INSERT INTO `t_website_nav` VALUES ('1c865835cff6982b8dc9f6dd206f28e5', '30380ae8e3ecd0d1a34e41f92a8eadaa', '发布信用标', 'announceCredit', 'disable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:47:55', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 13:49:56');
INSERT INTO `t_website_nav` VALUES ('1d33d5a8b6d5a2fe73eb78b7c8439624', '533321196059fa5805661651134a58fe', '公司简介', ' ', 'enable', '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:36', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:14:59');
INSERT INTO `t_website_nav` VALUES ('29a56a83d3b22d8bf211ac68a0db0d01', null, '我要投资', 'invest', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:26', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:58:14');
INSERT INTO `t_website_nav` VALUES ('30380ae8e3ecd0d1a34e41f92a8eadaa', null, '我要借款', 'borrowMoney', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:38', '8b25651c2d896297530b64e4b80ec503', '2014-06-19 10:58:54');
INSERT INTO `t_website_nav` VALUES ('42bdcfbb624c975eea75c7d06b943853', '533321196059fa5805661651134a58fe', '招聘信息', '  ', 'enable', '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:50:02', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:15:07');
INSERT INTO `t_website_nav` VALUES ('4edb2ec67480c21811ddb0b16f0e5218', null, '我的账号', 'accountNumber', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:34', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:13:39');
INSERT INTO `t_website_nav` VALUES ('533321196059fa5805661651134a58fe', null, '关于我们', '  ', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:12', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:14:29');
INSERT INTO `t_website_nav` VALUES ('5f76cc51c5d787932f09c4425350a79a', '4edb2ec67480c21811ddb0b16f0e5218', '我要登录', 'landing', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:46', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:13:43');
INSERT INTO `t_website_nav` VALUES ('6c0cb4c77e2cc5a3bfa47d79023c5254', null, '帮助中心', '  ', 'enable', '13', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:59', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:15:16');
INSERT INTO `t_website_nav` VALUES ('9ab845b68ca01934138c22ba6729cd75', '30380ae8e3ecd0d1a34e41f92a8eadaa', '发布担保标', 'announceWarrant', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:17', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:13:33');
INSERT INTO `t_website_nav` VALUES ('b45b9148c7cd2b5f7ec1d53a3d6ec99f', '4edb2ec67480c21811ddb0b16f0e5218', '我要注册', 'register', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:59', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:13:50');

-- ----------------------------
-- Table structure for `t_website_news`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_news`;
CREATE TABLE `t_website_news` (
  `web_news_id` varchar(32) NOT NULL,
  `web_news_theme` varchar(100) default NULL,
  `web_news_content` text,
  `web_news_status` enum('enable','disable') default NULL,
  `web_news_num` int(11) default NULL,
  `accessory` varchar(255) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_news_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的新闻管理表。';

-- ----------------------------
-- Records of t_website_news
-- ----------------------------
INSERT INTO `t_website_news` VALUES ('32266efe968c9af524380c699f3d778c', '冰川贷李欣贺入选2014年“中国商业创新50人”大奖 ', '冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖', 'enable', '3', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:21:45', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:21:45');
INSERT INTO `t_website_news` VALUES ('47c34c5c79793dab521a354d496db38b', '冰川贷李欣贺受邀出席中国财富管理50人论坛 ', '冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛', 'enable', '5', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:42', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:42');
INSERT INTO `t_website_news` VALUES ('56d0a51816e4e3362c59569e4ffa38e2', '冰川贷李欣贺入选2013年“世界500强人”大奖', '冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖', 'enable', '7', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:23:24', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:23:24');
INSERT INTO `t_website_news` VALUES ('5efac60a4cfb103e5210ea0d5010d3c7', '冰川贷李欣贺参加2013互联网金融年度论坛', '										冰川贷李欣贺参加2013互联网金融年度论坛冰川贷李欣贺参加2013互联网金融年度论坛冰川贷李欣贺参加2013互联网金融年度论坛冰川贷李欣贺参加2013互联网金融年度论坛\r\n				\r\n				', 'enable', '6', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:08', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:18:23');
INSERT INTO `t_website_news` VALUES ('be1e10183e38beca099ba9694128bab6', '冰川贷公司斩获2013中关村十大评选两项大奖', '冰川贷公司斩获2013中关村十大评选两项大奖冰川贷公司斩获2013中关村十大评选两项大奖冰川贷公司斩获2013中关村十大评选两项大奖冰川贷公司斩获2013中关村十大评选两项大奖', 'enable', '5', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:25', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:25');
INSERT INTO `t_website_news` VALUES ('c7a4cfee09886b6b4662ea8b9d5c861e', '祝冰川贷第一期积分土豪奖品活动圆满结束', '					<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a>\r\n				', 'enable', '1', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:01', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:18:06');
INSERT INTO `t_website_news` VALUES ('c7b04e5bb2c91cd2f31598e65c38359e', '冷空气降临中国，中国将面对一周的低气温', '					今年最大寒流进入广东，最低温度3度。<img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/9.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/93.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/64.gif\" alt=\"\" border=\"0\" />\r\n				', 'enable', '4', '4', '4', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:54', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:24:11');
INSERT INTO `t_website_news` VALUES ('d2321b66d4cdde4bb7f961bbcec9dfc6', '十五年一遇的双情人节，大家准备好了吗？', '					十五年一遇的双情人节，大家准备好了吗？<img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/28.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/63.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/65.gif\" alt=\"\" border=\"0\" />\r\n				', 'enable', '2', '3', '3', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:40', '8b25651c2d896297530b64e4b80ec503', '2014-06-23 11:18:11');

-- ----------------------------
-- Table structure for `t_website_service`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_service`;
CREATE TABLE `t_website_service` (
  `web_service_id` varchar(32) NOT NULL,
  `web_service_name` varchar(100) default NULL,
  `web_service_qq` varchar(100) default NULL,
  `web_service_photo` varchar(100) default NULL,
  `web_service_status` enum('enable','disable') default NULL,
  `accessory` varchar(255) default NULL,
  `web_service_num` int(11) default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`web_service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的客服管理表。';

-- ----------------------------
-- Records of t_website_service
-- ----------------------------
INSERT INTO `t_website_service` VALUES ('5b09aad291adf5a4c6f4be3c6b3a195c', '小春', '4405555', null, 'enable', '', '2', '前台', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:47', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:47');
INSERT INTO `t_website_service` VALUES ('9709efd442475ce555cfeeb3f26294ab', '小秋', '3308888', null, 'enable', '', '4', '售后', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:37', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:37');
INSERT INTO `t_website_service` VALUES ('f94e462f10af076f92459eff090968ab', '小夏', '4408888', null, 'enable', '', '1', '前台\r\n', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:04', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:18');
INSERT INTO `t_website_service` VALUES ('fbb3e704f860029e3be51a0b8501e37f', '小东', '330555', null, 'enable', '3', '3', '后台', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:08', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:08');
