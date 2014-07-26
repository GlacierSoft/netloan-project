/*
Navicat MySQL Data Transfer

Source Server         : 61.147.68.41
Source Server Version : 50519
Source Host           : 61.147.68.41:3308
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50519
File Encoding         : 65001

Date: 2014-07-26 21:27:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_account_invest`
-- ----------------------------
DROP TABLE IF EXISTS `t_account_invest`;
CREATE TABLE `t_account_invest` (
  `invest_id` varchar(32) NOT NULL COMMENT '投资统计ID',
  `sum_uncollected` float(20,2) DEFAULT NULL COMMENT '投资成功待收金额',
  `sum_reward` float(20,2) DEFAULT NULL COMMENT '投资奖励金额',
  `sum_fine` float(20,2) DEFAULT NULL COMMENT '借款人逾期罚款金额',
  `sum_borrow` float(20,2) DEFAULT NULL COMMENT '借款成功总额',
  `sum_advfee` float(20,2) DEFAULT NULL COMMENT '借款管理费总额',
  `sum_interest` float(20,2) DEFAULT NULL COMMENT '借款利息总额',
  `sum_interestfee` float(20,2) DEFAULT NULL COMMENT '借款逾期罚息总额',
  `creater` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '录入时间',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`invest_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_account_invest
-- ----------------------------
INSERT INTO `t_account_invest` VALUES ('50de9c03bba6e3650ceef242443386c4', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:19:39', '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:19:39');
INSERT INTO `t_account_invest` VALUES ('c9f593c06b1574369ef2675b65624a15', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:30:55', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:30:55');

-- ----------------------------
-- Table structure for `t_action`
-- ----------------------------
DROP TABLE IF EXISTS `t_action`;
CREATE TABLE `t_action` (
  `action_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) DEFAULT NULL,
  `panel_id` varchar(32) DEFAULT NULL,
  `action_cn_name` varchar(30) NOT NULL,
  `action_en_name` varchar(30) NOT NULL,
  `icon_cls` varchar(30) DEFAULT NULL,
  `type` enum('Link','Button') DEFAULT 'Button',
  `disabled` enum('disable','enable') DEFAULT NULL,
  `method` varchar(100) DEFAULT NULL,
  `order_num` int(10) unsigned DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', null);
INSERT INTO `t_action` VALUES ('01dc883fe7100411013efd59c60efe12', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.delParameterBasic();', '3', null);
INSERT INTO `t_action` VALUES ('02e8e7c29c545810f77ad6714153d1e3', '185b00f80aaa910fa99d9abc99c84d58', 'ad2e8abecde386abbd1738707beccfee', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.LoanReview_mgr.LoanReview.delLoanReview();', '1', null);
INSERT INTO `t_action` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.editNews();', '2', null);
INSERT INTO `t_action` VALUES ('0fa43c6542365762ae60ccc552a33fd9', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.addRechargeSet();', '1', null);
INSERT INTO `t_action` VALUES ('134eb0c6f487f92156c65f9f4e864420', 'd1f203ea6815e227579b88c5d6235629', 'a143b131cf265bb53467012fd788ed66', '生成报表', 'outExp', 'icon-standard-key-go', 'Button', 'enable', 'glacier.account_mgr.accountInvest_mgr.accountInvest.outExpAccountInvest();', '1', '');
INSERT INTO `t_action` VALUES ('164cdcc07fc0588cc16bdbafe55eff07', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.editRepaymentType();', '2', null);
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', null);
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eads', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.addAge();', '2', null);
INSERT INTO `t_action` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', null);
INSERT INTO `t_action` VALUES ('1cccbe2e088ea3848e78e2338f572675', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.auditOverdueAdvances();', '4', null);
INSERT INTO `t_action` VALUES ('1fb7d55569a297d8c9c8df576e7aa3c6', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.delIntegralType();', '3', null);
INSERT INTO `t_action` VALUES ('2213139f0e736a796d5ac4bdd78332', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.delIntegral();', '3', null);
INSERT INTO `t_action` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action` VALUES ('25860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.addCredit();', '1', null);
INSERT INTO `t_action` VALUES ('28060139f0e736a796d5ac4bdd78dawx', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.editAge();', '3', null);
INSERT INTO `t_action` VALUES ('2847af4d9e73cd7a4c1a5b1933cac4c0', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.addQuestion();', '1', null);
INSERT INTO `t_action` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', null);
INSERT INTO `t_action` VALUES ('2c3f7432c92f50ae582efd60424c025f', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.addCreditType();', '1', null);
INSERT INTO `t_action` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.editLink();', '2', null);
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', null);
INSERT INTO `t_action` VALUES ('34560139f0e736a796d5ac4bdd78344', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.addIntegral();', '1', null);
INSERT INTO `t_action` VALUES ('35860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.editCredit();', '2', null);
INSERT INTO `t_action` VALUES ('38060139f0e736a796d5ac4bdd78escs', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.delAge();', '4', null);
INSERT INTO `t_action` VALUES ('3a879058f46d34f021a3fb58dbbc0219', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.editwithdrawSet();', '2', null);
INSERT INTO `t_action` VALUES ('3ceb75f4b0d0565546cd24d1dc7b3140', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '新增', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.addOverdueAdvances();', '1', null);
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', null);
INSERT INTO `t_action` VALUES ('43286edc2a67d2cc48258ed3445fcb7c', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.addIntegralType();', '1', null);
INSERT INTO `t_action` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action` VALUES ('4586054157cf483a790f4eea35dsf6f6', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.delCredit();', '3', null);
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', null);
INSERT INTO `t_action` VALUES ('48f761b33f08cc3403e0ee74ff68b960', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.addLoanTender();', '1', null);
INSERT INTO `t_action` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.addService();', '1', null);
INSERT INTO `t_action` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', null);
INSERT INTO `t_action` VALUES ('4c81203b3b78f009a00b76f4b5c2f1c6', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.editMessageNotice();', '2', null);
INSERT INTO `t_action` VALUES ('5145b54dcf298e8acc62618c50ae9658', '3a0891f27514a093a5869da2afc22268', 'd758d23f2be619905b89146a228c3336', '导出Excel', 'exp', 'icon-standard-note-go', 'Button', 'enable', 'glacier.account_mgr.accountBorrow_mgr.accountBorrow.expAccountBorrow();', '1', null);
INSERT INTO `t_action` VALUES ('5358a74c967ccb2e7f8e19ada4b56dc5', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.editFinancePlatform();', '2', null);
INSERT INTO `t_action` VALUES ('53c1484ea13b45e89165b1f324cb4c87', 'f15eee7156a6e9821ad60ea9747b6878', '22bb4909b6184fadfdb5bc5566a911ae', '审核', 'audit', 'icon-cologne-customers', 'Button', 'enable', 'glacier.member_mgr.estate_mgr.estate.auditHiring();', '1', null);
INSERT INTO `t_action` VALUES ('56890139f0e736a796d5ac4bdd78211', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.editIntegral();', '2', null);
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', null);
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', null);
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', null);
INSERT INTO `t_action` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.editService();', '2', null);
INSERT INTO `t_action` VALUES ('5b5621bc4bc8226055d59cbf5c7852b2', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.editOverdueFineSet();', '2', null);
INSERT INTO `t_action` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.delLink();', '3', null);
INSERT INTO `t_action` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', null);
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', null);
INSERT INTO `t_action` VALUES ('5ec88454af4be3068ddb590c76edd72b', '9dc3357651c9ecbb9b7c51005be28d18', '5a5b45f5c22bb597247bf1ba380f8968', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.secretSecurity_mgr.secretSecurity.delSecretSecurity();', '1', null);
INSERT INTO `t_action` VALUES ('5f1a9114c558b14be5870f6970cc7232', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.addwithdrawSet();', '1', null);
INSERT INTO `t_action` VALUES ('603c90108811ef9e8bb9c9639cc5c027', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.delRechargeSet();', '3', null);
INSERT INTO `t_action` VALUES ('61456d3d7696bfe35938d1e14b38a9f6', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.auditFinancePlatform();', '4', null);
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', null);
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', null);
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', null);
INSERT INTO `t_action` VALUES ('6e2f6c1b5c542cb289cdadb07c9164b9', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.delQuestion();', '3', null);
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', null);
INSERT INTO `t_action` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', null);
INSERT INTO `t_action` VALUES ('745f2c5fbd9ff0393b422d69ec411b6a', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.editRechargeSet();', '2', null);
INSERT INTO `t_action` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.addNews();', '1', null);
INSERT INTO `t_action` VALUES ('7b77c2b0294c356ed5447a3857b02fcd', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.editOverdueAdvances();', '2', null);
INSERT INTO `t_action` VALUES ('7caffce8ea39108e446907222540bdba', '9171c71b4bab5578ef0bbeac30072c73', 'a466d90682f5e1b36f0d1813c2d9c844', '导出Excel', 'exp', 'icon-standard-note-go', 'Button', 'enable', 'glacier.member_mgr.statistics_mgr.statistics.expStatistics();', '1', null);
INSERT INTO `t_action` VALUES ('7e5859ec7d629ee40e81ebed04c4b097', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.delFinancePlatform();', '3', null);
INSERT INTO `t_action` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', null);
INSERT INTO `t_action` VALUES ('83da88e1222fd62309915a2ccee9bd52', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.editCreditType();', '2', null);
INSERT INTO `t_action` VALUES ('84ed9df00a0bcb687170e6a09767b4d2', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.addMessageNotice();', '1', null);
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', null);
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('872c6894ca5e4af50944628948f7cf8b', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.auditwithdrawSet();', '4', null);
INSERT INTO `t_action` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', null);
INSERT INTO `t_action` VALUES ('8dd9d2808e9363daf78642bcb64bfa7e', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.editMember();', '2', null);
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', null);
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', null);
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', null);
INSERT INTO `t_action` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', null);
INSERT INTO `t_action` VALUES ('9bd85330248f3e9a3839fc7fb22e7989', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.auditBankCard();', '4', null);
INSERT INTO `t_action` VALUES ('9c975e58b77030f3eaa72f95ab34f786', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.applyAmount_mgr.applyAmount.auditApplyAmount();', '4', null);
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', null);
INSERT INTO `t_action` VALUES ('9e797156c229191ab00bb4b0476ce3e3', '765726125327148f709cb1b98e8e2fb8', '961af6c94e64222b875d5a0546b8675b', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountTender_mgr.accountTender.expAccountTender();', '1', null);
INSERT INTO `t_action` VALUES ('9f2bde7246ca2ad13dc64bbc5f4efb3d', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.delUser();', '3', null);
INSERT INTO `t_action` VALUES ('9f9e45b7c4cd5416067357793231eb85', '8b442566ffbc9531ee5e3aef7c41d740', '0ff45a0906e1ec4b169953b2c177db3e', '审核', 'auth', 'icon-standard-attach', 'Button', 'enable', 'glacier.member_mgr.memberAuth_mgr.memberAuth.authMemberAuth();', '1', null);
INSERT INTO `t_action` VALUES ('a04ae9ab4aeffa6fbffbae0f3630aa64', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.addMember();', '1', null);
INSERT INTO `t_action` VALUES ('a27471575ce1f86d15e43a163b2195dd', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.addLink();', '1', null);
INSERT INTO `t_action` VALUES ('a34eddbd653c462a87afe23eab0c6391', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement();', '1', null);
INSERT INTO `t_action` VALUES ('a6e49ea671cecee4c618785aa5eff06b', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.auditOverdueFineSet();', '4', null);
INSERT INTO `t_action` VALUES ('a8167ddeb588a6b88b81c81fbf1504a9', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', ' 修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.editIntegralType();', '2', null);
INSERT INTO `t_action` VALUES ('aa1a5a2270461de1688af30e776f2da1', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.addParameterBasic();', '1', null);
INSERT INTO `t_action` VALUES ('aa92fc184111c854d2c88774e4d941c4', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.auditRechargeSet();', '4', null);
INSERT INTO `t_action` VALUES ('abaa0bc85e3c239161d04abe65acdac4', 'd1f203ea6815e227579b88c5d6235629', 'a143b131cf265bb53467012fd788ed66', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountInvest_mgr.accountInvest.expAccountInvest();', '1', null);
INSERT INTO `t_action` VALUES ('ad2388e634c5e313d1c71eecdc849cb6', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.delAnnouncement();', '3', null);
INSERT INTO `t_action` VALUES ('ae83596beea547d81692aa19ed036b84', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.delOverdueAdvances();', '3', null);
INSERT INTO `t_action` VALUES ('aea7efcb8741c644ca693486220fe031', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '分配还款方式', 'assign', 'icon-standard-key-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.assignRepayment();', '4', null);
INSERT INTO `t_action` VALUES ('afa46628496d4d07c56a03e83a0094d0', 'c5cbf9f0961aa8249322d9ac20ba996e', 'f02605440920e2e2f7ed260f81674410', '初审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanFirstAudit.auditBorrowingLoanFirstAudit();', '1', null);
INSERT INTO `t_action` VALUES ('b0648b51ebbf9831702a3f616a75ca3a', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.delNews();', '3', null);
INSERT INTO `t_action` VALUES ('b0f605139653554aa66cf38a78fe42ba', '54eb754157cf483a790f4eea35200118', 'eb07f8ec54989seb66e4e8a1a0f21604', '列表', 'list', null, 'Button', 'disable', null, '1', null);
INSERT INTO `t_action` VALUES ('b140fe41933ae262393262348962f50e', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '添加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.addOverdueFineSet();', '1', null);
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', null);
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('b96deb25d78cfa1c64305a4e4323a882', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.delwithdrawSet();', '3', null);
INSERT INTO `t_action` VALUES ('ba99418ca949feedcedfa04396235827', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.delService();', '3', null);
INSERT INTO `t_action` VALUES ('bb182dacbb7641b9a337962406a6281f', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.editQuestion();', '2', null);
INSERT INTO `t_action` VALUES ('bd12ba2da228817eb381868d63ff9031', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.delRepaymentType();', '3', null);
INSERT INTO `t_action` VALUES ('be0471ff12b16ba7ef172aecd18ca4a4', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.delCreditType();', '3', null);
INSERT INTO `t_action` VALUES ('c1a3054399d0f62140f0389d3c0761a7', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.addRepaymentType();', '1', null);
INSERT INTO `t_action` VALUES ('c50c979b621ff41f0677cdf02e29648b', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.editHiring();', '2', null);
INSERT INTO `t_action` VALUES ('c84bb71923c9297ee8ba7e06207a8608', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.editParameterBasic();', '2', null);
INSERT INTO `t_action` VALUES ('d54e5e68cc6d3310e663678a674c4193', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.addFinancePlatform();', '1', null);
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', null);
INSERT INTO `t_action` VALUES ('dc73a4be22344ac72054f8e664806320', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.delLoanTender();', '3', null);
INSERT INTO `t_action` VALUES ('e07e6f29a82367df51fd80863f28503a', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.delBankCard();', '3', null);
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', null);
INSERT INTO `t_action` VALUES ('e32722bcb1b49ff2ed7ce3029200fe80', '31a605c2a2a777c738a09103b9915615', '8e6e60bd7b85314ab9555e64bc6e5d08', '复审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanSecAudit.auditBorrowingLoanSecAudit();', '1', null);
INSERT INTO `t_action` VALUES ('e450b55ffaeca413fdd6551591993893', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.addAnnouncement();', '1', null);
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', null);
INSERT INTO `t_action` VALUES ('e637975493d65070499ebfb8b15b37f6', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.editHelp();', '2', null);
INSERT INTO `t_action` VALUES ('e6dc58cf519c048b4674a4581054d237', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.delMessageNotice();', '3', null);
INSERT INTO `t_action` VALUES ('ec40a2a3a246442c53a3554cdae59cbb', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.delOverdueFineSet();', '3', null);
INSERT INTO `t_action` VALUES ('ed9331339d87314589ce7e19de4dab86', '8b4c5afb8d66b21e8900822c5c6bff35', '56a81ee56b6ed438bbc43d17b2e4b96e', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.recharge_mgr.recharge.auditRecharge();', '1', null);
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', null);
INSERT INTO `t_action` VALUES ('fbbda7cc81811077445c4bc94c53ce08', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.editNav();', '2', null);
INSERT INTO `t_action` VALUES ('fbfded9986f0ad39d43d789b7594463d', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.delHiring();', '3', null);
INSERT INTO `t_action` VALUES ('fc1dd61babab45fb3942b311dda6a501', '3f029e72ef13db56e8b65866984da722', 'bcc05279c70cd8a320ad70bd7cd0b12d', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdraw_mgr.withdraw.auditWithdraw();', '1', null);
INSERT INTO `t_action` VALUES ('fdd2966ba48e34c5e5ad8dc6d8964f8b', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.editLoanTender();', '2', null);
INSERT INTO `t_action` VALUES ('fe2471a42fc0e7d61343f4e53c8eb429', '51af37d8918504c4ba34a85b1a3d94fc', '7568bd9e76ee7bfa7ac7e2ef470cce78', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountLogin_mgr.accountLogin.expAccountLogin();', '1', null);
INSERT INTO `t_action` VALUES ('fef8bd050155337259ac615a077be166', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '设置为默认账户', 'update', 'icon-hamburg-config', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.editnancePlatformType();', '5', null);
INSERT INTO `t_action` VALUES ('sd54fsd4fsd2sg45r4hrtj2fg1j2g1', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.delArea();', '3', null);

-- ----------------------------
-- Table structure for `t_action_copy`
-- ----------------------------
DROP TABLE IF EXISTS `t_action_copy`;
CREATE TABLE `t_action_copy` (
  `action_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) DEFAULT NULL,
  `panel_id` varchar(32) DEFAULT NULL,
  `action_cn_name` varchar(30) NOT NULL,
  `action_en_name` varchar(30) NOT NULL,
  `icon_cls` varchar(30) DEFAULT NULL,
  `type` enum('Link','Button') DEFAULT 'Button',
  `disabled` enum('disable','enable') DEFAULT NULL,
  `method` varchar(100) DEFAULT NULL,
  `order_num` int(10) unsigned DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action_copy
-- ----------------------------
INSERT INTO `t_action_copy` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', '');
INSERT INTO `t_action_copy` VALUES ('01dc883fe7100411013efd59c60efe12', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.delParameterBasic();', '3', '');
INSERT INTO `t_action_copy` VALUES ('02e8e7c29c545810f77ad6714153d1e3', '185b00f80aaa910fa99d9abc99c84d58', 'ad2e8abecde386abbd1738707beccfee', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.LoanReview_mgr.LoanReview.delLoanReview();', '1', '');
INSERT INTO `t_action_copy` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.editNews();', '2', '');
INSERT INTO `t_action_copy` VALUES ('0fa43c6542365762ae60ccc552a33fd9', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.addRechargeSet();', '1', '');
INSERT INTO `t_action_copy` VALUES ('164cdcc07fc0588cc16bdbafe55eff07', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.editRepaymentType();', '2', '');
INSERT INTO `t_action_copy` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', '');
INSERT INTO `t_action_copy` VALUES ('18060139f0e736a796d5ac4bdd78eads', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.addAge();', '2', null);
INSERT INTO `t_action_copy` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', '');
INSERT INTO `t_action_copy` VALUES ('1cccbe2e088ea3848e78e2338f572675', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.auditOverdueAdvances();', '4', '');
INSERT INTO `t_action_copy` VALUES ('1fb7d55569a297d8c9c8df576e7aa3c6', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.delIntegralType();', '3', '');
INSERT INTO `t_action_copy` VALUES ('2213139f0e736a796d5ac4bdd78332', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.delIntegral();', '3', null);
INSERT INTO `t_action_copy` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action_copy` VALUES ('25860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.addCredit();', '1', null);
INSERT INTO `t_action_copy` VALUES ('28060139f0e736a796d5ac4bdd78dawx', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.editAge();', '3', null);
INSERT INTO `t_action_copy` VALUES ('2847af4d9e73cd7a4c1a5b1933cac4c0', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.addQuestion();', '1', '');
INSERT INTO `t_action_copy` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', '');
INSERT INTO `t_action_copy` VALUES ('2c3f7432c92f50ae582efd60424c025f', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.addCreditType();', '1', '');
INSERT INTO `t_action_copy` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.editLink();', '2', '');
INSERT INTO `t_action_copy` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', '');
INSERT INTO `t_action_copy` VALUES ('34560139f0e736a796d5ac4bdd78344', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.addIntegral();', '1', null);
INSERT INTO `t_action_copy` VALUES ('35860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.editCredit();', '2', null);
INSERT INTO `t_action_copy` VALUES ('38060139f0e736a796d5ac4bdd78escs', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.delAge();', '4', null);
INSERT INTO `t_action_copy` VALUES ('3a879058f46d34f021a3fb58dbbc0219', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.editwithdrawSet();', '2', '');
INSERT INTO `t_action_copy` VALUES ('3ceb75f4b0d0565546cd24d1dc7b3140', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '新增', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.addOverdueAdvances();', '1', '');
INSERT INTO `t_action_copy` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '3', '');
INSERT INTO `t_action_copy` VALUES ('43286edc2a67d2cc48258ed3445fcb7c', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.addIntegralType();', '1', '');
INSERT INTO `t_action_copy` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action_copy` VALUES ('4586054157cf483a790f4eea35dsf6f6', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.delCredit();', '3', null);
INSERT INTO `t_action_copy` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', '');
INSERT INTO `t_action_copy` VALUES ('48f761b33f08cc3403e0ee74ff68b960', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.addLoanTender();', '1', '');
INSERT INTO `t_action_copy` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.addService();', '1', '');
INSERT INTO `t_action_copy` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', '');
INSERT INTO `t_action_copy` VALUES ('4c81203b3b78f009a00b76f4b5c2f1c6', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.editMessageNotice();', '2', '');
INSERT INTO `t_action_copy` VALUES ('5145b54dcf298e8acc62618c50ae9658', '3a0891f27514a093a5869da2afc22268', 'd758d23f2be619905b89146a228c3336', '导出Excel', 'exp', 'icon-standard-note-go', 'Button', 'enable', 'glacier.account_mgr.accountBorrow_mgr.accountBorrow.expAccountBorrow();', '1', '');
INSERT INTO `t_action_copy` VALUES ('5358a74c967ccb2e7f8e19ada4b56dc5', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.editFinancePlatform();', '2', '');
INSERT INTO `t_action_copy` VALUES ('53c1484ea13b45e89165b1f324cb4c87', 'f15eee7156a6e9821ad60ea9747b6878', '22bb4909b6184fadfdb5bc5566a911ae', '审核', 'audit', 'icon-cologne-customers', 'Button', 'enable', 'glacier.member_mgr.estate_mgr.estate.auditHiring();', '1', '');
INSERT INTO `t_action_copy` VALUES ('56890139f0e736a796d5ac4bdd78211', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.editIntegral();', '2', null);
INSERT INTO `t_action_copy` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', '');
INSERT INTO `t_action_copy` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', '');
INSERT INTO `t_action_copy` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', '');
INSERT INTO `t_action_copy` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.editService();', '2', '');
INSERT INTO `t_action_copy` VALUES ('5b5621bc4bc8226055d59cbf5c7852b2', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.editOverdueFineSet();', '2', '');
INSERT INTO `t_action_copy` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.delLink();', '3', '');
INSERT INTO `t_action_copy` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', '');
INSERT INTO `t_action_copy` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', '');
INSERT INTO `t_action_copy` VALUES ('5ec88454af4be3068ddb590c76edd72b', '9dc3357651c9ecbb9b7c51005be28d18', '5a5b45f5c22bb597247bf1ba380f8968', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.secretSecurity_mgr.secretSecurity.delSecretSecurity();', '1', '');
INSERT INTO `t_action_copy` VALUES ('5f1a9114c558b14be5870f6970cc7232', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.addwithdrawSet();', '1', '');
INSERT INTO `t_action_copy` VALUES ('603c90108811ef9e8bb9c9639cc5c027', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.delRechargeSet();', '3', '');
INSERT INTO `t_action_copy` VALUES ('61456d3d7696bfe35938d1e14b38a9f6', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.auditFinancePlatform();', '4', '');
INSERT INTO `t_action_copy` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '1', '');
INSERT INTO `t_action_copy` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '1', '');
INSERT INTO `t_action_copy` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '2', '');
INSERT INTO `t_action_copy` VALUES ('6e2f6c1b5c542cb289cdadb07c9164b9', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.delQuestion();', '3', '');
INSERT INTO `t_action_copy` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', '');
INSERT INTO `t_action_copy` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', '');
INSERT INTO `t_action_copy` VALUES ('745f2c5fbd9ff0393b422d69ec411b6a', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.editRechargeSet();', '2', '');
INSERT INTO `t_action_copy` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.addNews();', '1', '');
INSERT INTO `t_action_copy` VALUES ('7b77c2b0294c356ed5447a3857b02fcd', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.editOverdueAdvances();', '2', '');
INSERT INTO `t_action_copy` VALUES ('7caffce8ea39108e446907222540bdba', '9171c71b4bab5578ef0bbeac30072c73', 'a466d90682f5e1b36f0d1813c2d9c844', '导出Excel', 'exp', 'icon-standard-note-go', 'Button', 'enable', 'glacier.member_mgr.statistics_mgr.statistics.expStatistics();', '1', '');
INSERT INTO `t_action_copy` VALUES ('7e5859ec7d629ee40e81ebed04c4b097', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.delFinancePlatform();', '3', '');
INSERT INTO `t_action_copy` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', '');
INSERT INTO `t_action_copy` VALUES ('83da88e1222fd62309915a2ccee9bd52', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.editCreditType();', '2', '');
INSERT INTO `t_action_copy` VALUES ('84ed9df00a0bcb687170e6a09767b4d2', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.addMessageNotice();', '1', '');
INSERT INTO `t_action_copy` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', '');
INSERT INTO `t_action_copy` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action_copy` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action_copy` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action_copy` VALUES ('872c6894ca5e4af50944628948f7cf8b', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.auditwithdrawSet();', '4', '');
INSERT INTO `t_action_copy` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', '');
INSERT INTO `t_action_copy` VALUES ('8dd9d2808e9363daf78642bcb64bfa7e', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.editMember();', '2', '');
INSERT INTO `t_action_copy` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', '');
INSERT INTO `t_action_copy` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '2', '');
INSERT INTO `t_action_copy` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', '');
INSERT INTO `t_action_copy` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', '');
INSERT INTO `t_action_copy` VALUES ('9bd85330248f3e9a3839fc7fb22e7989', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.auditBankCard();', '4', '');
INSERT INTO `t_action_copy` VALUES ('9c975e58b77030f3eaa72f95ab34f786', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.applyAmount_mgr.applyAmount.auditApplyAmount();', '4', '');
INSERT INTO `t_action_copy` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', '');
INSERT INTO `t_action_copy` VALUES ('9e797156c229191ab00bb4b0476ce3e3', '765726125327148f709cb1b98e8e2fb8', '961af6c94e64222b875d5a0546b8675b', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountTender_mgr.accountTender.expAccountTender();', '1', '');
INSERT INTO `t_action_copy` VALUES ('9f2bde7246ca2ad13dc64bbc5f4efb3d', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.delUser();', '3', '');
INSERT INTO `t_action_copy` VALUES ('9f9e45b7c4cd5416067357793231eb85', '8b442566ffbc9531ee5e3aef7c41d740', '0ff45a0906e1ec4b169953b2c177db3e', '审核', 'auth', 'icon-standard-attach', 'Button', 'enable', 'glacier.member_mgr.memberAuth_mgr.memberAuth.authMemberAuth();', '1', '');
INSERT INTO `t_action_copy` VALUES ('a04ae9ab4aeffa6fbffbae0f3630aa64', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.addMember();', '1', '');
INSERT INTO `t_action_copy` VALUES ('a27471575ce1f86d15e43a163b2195dd', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.addLink();', '1', '');
INSERT INTO `t_action_copy` VALUES ('a34eddbd653c462a87afe23eab0c6391', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement();', '1', '');
INSERT INTO `t_action_copy` VALUES ('a6e49ea671cecee4c618785aa5eff06b', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.auditOverdueFineSet();', '4', '');
INSERT INTO `t_action_copy` VALUES ('a8167ddeb588a6b88b81c81fbf1504a9', '3d69786613fe15615172d1ae22defed4', 'f77e36ed70a04d8123a466f8dd0a9b5b', ' 修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integralType_mgr.integralType.editIntegralType();', '2', '');
INSERT INTO `t_action_copy` VALUES ('aa1a5a2270461de1688af30e776f2da1', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.addParameterBasic();', '1', '');
INSERT INTO `t_action_copy` VALUES ('aa92fc184111c854d2c88774e4d941c4', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.auditRechargeSet();', '4', '');
INSERT INTO `t_action_copy` VALUES ('abaa0bc85e3c239161d04abe65acdac4', 'd1f203ea6815e227579b88c5d6235629', 'a143b131cf265bb53467012fd788ed66', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountInvest_mgr.accountInvest.expAccountInvest();', '1', '');
INSERT INTO `t_action_copy` VALUES ('ad2388e634c5e313d1c71eecdc849cb6', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.delAnnouncement();', '3', '');
INSERT INTO `t_action_copy` VALUES ('ae83596beea547d81692aa19ed036b84', '43b1d02267e9ed610543845a1c1a24ca', '28764ec6c61fd04f84bd20de8a96bfc8', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.overdueAdvances_mgr.overdueAdvances.delOverdueAdvances();', '3', '');
INSERT INTO `t_action_copy` VALUES ('aea7efcb8741c644ca693486220fe031', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '分配还款方式', 'assign', 'icon-standard-key-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.assignRepayment();', '4', '');
INSERT INTO `t_action_copy` VALUES ('afa46628496d4d07c56a03e83a0094d0', 'c5cbf9f0961aa8249322d9ac20ba996e', 'f02605440920e2e2f7ed260f81674410', '初审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanFirstAudit.auditBorrowingLoanFirstAudit();', '1', '');
INSERT INTO `t_action_copy` VALUES ('b0648b51ebbf9831702a3f616a75ca3a', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.delNews();', '3', '');
INSERT INTO `t_action_copy` VALUES ('b0f605139653554aa66cf38a78fe42ba', '54eb754157cf483a790f4eea35200118', 'eb07f8ec54989seb66e4e8a1a0f21604', '列表', 'list', '', 'Button', 'disable', '', '1', '');
INSERT INTO `t_action_copy` VALUES ('b140fe41933ae262393262348962f50e', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '添加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.addOverdueFineSet();', '1', '');
INSERT INTO `t_action_copy` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '3', '');
INSERT INTO `t_action_copy` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action_copy` VALUES ('b96deb25d78cfa1c64305a4e4323a882', 'c5d4cae04f14f76eae54c0da51819af0', '92e73869674d4c3f6b0c9e904bf03edf', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.withdrawSet_mgr.withdrawSet.delwithdrawSet();', '3', '');
INSERT INTO `t_action_copy` VALUES ('ba99418ca949feedcedfa04396235827', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.delService();', '3', '');
INSERT INTO `t_action_copy` VALUES ('bb182dacbb7641b9a337962406a6281f', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.editQuestion();', '2', '');
INSERT INTO `t_action_copy` VALUES ('bd12ba2da228817eb381868d63ff9031', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.delRepaymentType();', '3', '');
INSERT INTO `t_action_copy` VALUES ('be0471ff12b16ba7ef172aecd18ca4a4', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.delCreditType();', '3', '');
INSERT INTO `t_action_copy` VALUES ('c1a3054399d0f62140f0389d3c0761a7', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.addRepaymentType();', '1', '');
INSERT INTO `t_action_copy` VALUES ('c50c979b621ff41f0677cdf02e29648b', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.editHiring();', '2', '');
INSERT INTO `t_action_copy` VALUES ('c84bb71923c9297ee8ba7e06207a8608', '055b7c1a9499420b2982a207dc027389', '17d04eebb4a66712961343c652696dbd', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.parameterBasic_mgr.parameterBasic.editParameterBasic();', '2', '');
INSERT INTO `t_action_copy` VALUES ('d54e5e68cc6d3310e663678a674c4193', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.addFinancePlatform();', '1', '');
INSERT INTO `t_action_copy` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '2', '');
INSERT INTO `t_action_copy` VALUES ('dc73a4be22344ac72054f8e664806320', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.delLoanTender();', '3', '');
INSERT INTO `t_action_copy` VALUES ('e07e6f29a82367df51fd80863f28503a', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.delBankCard();', '3', '');
INSERT INTO `t_action_copy` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', '');
INSERT INTO `t_action_copy` VALUES ('e32722bcb1b49ff2ed7ce3029200fe80', '31a605c2a2a777c738a09103b9915615', '8e6e60bd7b85314ab9555e64bc6e5d08', '复审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanSecAudit.auditBorrowingLoanSecAudit();', '1', '');
INSERT INTO `t_action_copy` VALUES ('e450b55ffaeca413fdd6551591993893', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.addAnnouncement();', '1', '');
INSERT INTO `t_action_copy` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '1', '');
INSERT INTO `t_action_copy` VALUES ('e637975493d65070499ebfb8b15b37f6', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.editHelp();', '2', '');
INSERT INTO `t_action_copy` VALUES ('e6dc58cf519c048b4674a4581054d237', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.delMessageNotice();', '3', '');
INSERT INTO `t_action_copy` VALUES ('ec40a2a3a246442c53a3554cdae59cbb', 'e46f33cd486fe42c714c909e32966b4c', 'c17d966fcbec924f28c742456684aad4', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.overdueFineSet_mgr.overdueFineSet.delOverdueFineSet();', '3', '');
INSERT INTO `t_action_copy` VALUES ('ed9331339d87314589ce7e19de4dab86', '8b4c5afb8d66b21e8900822c5c6bff35', '56a81ee56b6ed438bbc43d17b2e4b96e', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.recharge_mgr.recharge.auditRecharge();', '1', '');
INSERT INTO `t_action_copy` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '3', '');
INSERT INTO `t_action_copy` VALUES ('fbbda7cc81811077445c4bc94c53ce08', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.editNav();', '2', '');
INSERT INTO `t_action_copy` VALUES ('fbfded9986f0ad39d43d789b7594463d', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.delHiring();', '3', '');
INSERT INTO `t_action_copy` VALUES ('fc1dd61babab45fb3942b311dda6a501', '3f029e72ef13db56e8b65866984da722', 'bcc05279c70cd8a320ad70bd7cd0b12d', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdraw_mgr.withdraw.auditWithdraw();', '1', '');
INSERT INTO `t_action_copy` VALUES ('fdd2966ba48e34c5e5ad8dc6d8964f8b', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.editLoanTender();', '2', '');
INSERT INTO `t_action_copy` VALUES ('fe2471a42fc0e7d61343f4e53c8eb429', '51af37d8918504c4ba34a85b1a3d94fc', '7568bd9e76ee7bfa7ac7e2ef470cce78', '导出Excel', 'exp', 'icon-standard-folder-go', 'Button', 'enable', 'glacier.account_mgr.accountLogin_mgr.accountLogin.expAccountLogin();', '1', '');
INSERT INTO `t_action_copy` VALUES ('fef8bd050155337259ac615a077be166', '2a93efe5aeae3cdef871447bd49134a0', '64e21bca11e8269cf68163ca490145d7', '设置为默认账户', 'update', 'icon-hamburg-config', 'Button', 'enable', 'glacier.finance_mgr.financePlatform_mgr.financePlatform.editnancePlatformType();', '5', '');
INSERT INTO `t_action_copy` VALUES ('sd54fsd4fsd2sg45r4hrtj2fg1j2g1', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.delArea();', '3', null);

-- ----------------------------
-- Table structure for `t_attention_borrowing`
-- ----------------------------
DROP TABLE IF EXISTS `t_attention_borrowing`;
CREATE TABLE `t_attention_borrowing` (
  `attention_borrowing_id` varchar(32) NOT NULL,
  `loan_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`attention_borrowing_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_attention_borrowing
-- ----------------------------

-- ----------------------------
-- Table structure for `t_authority`
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority` (
  `role_id` varchar(32) NOT NULL,
  `menu_id` varchar(32) NOT NULL,
  `actions` varchar(21779) DEFAULT NULL,
  PRIMARY KEY (`role_id`,`menu_id`),
  KEY `FK_t_authority2` (`menu_id`),
  CONSTRAINT `FK_auth_menu_menu_id` FOREIGN KEY (`menu_id`) REFERENCES `t_menu` (`menu_id`),
  CONSTRAINT `FK_auth_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_authority
-- ----------------------------
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '0107a40612ffaefe86f255341b6f9e03', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '02e56de3282b5404fdba2e2c957d1b92', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '054464fdb73c76b5cfd4efa16fcaa8e1', 'CreditTypeList_add,CreditTypeList_edit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '079cecd38fb5df02ed6e4d84446d072e', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '0b097738ce712d563199ad7c7240212c', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '10a7f2fd8253d90b8672d4096f8f9ed4', 'LoanTenderList_add,LoanTenderList_edit,LoanTenderList_assign');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '125cc7156b53015b809d9a27b55fbf57', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '185b00f80aaa910fa99d9abc99c84d58', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '2a93efe5aeae3cdef871447bd49134a0', 'FinancePlatformList_add,FinancePlatformList_edit,FinancePlatformList_audit,FinancePlatformList_update');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '2ce7311ee180ae794c608251997dad9c', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '31a605c2a2a777c738a09103b9915615', 'BorrowingLoanSecAuditList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '33f5e9959e821a58696e2d2fb5c322fc', 'QuestionList_add,QuestionList_edit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '3775cc8c3044650697dbb4d8636b5464', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '389f33c7b34582376d4d99282faa03b9', 'RepaymentTypeList_add,RepaymentTypeList_edit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '3a0891f27514a093a5869da2afc22268', 'AccountBorrowList_exp');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '3d69786613fe15615172d1ae22defed4', 'integralTypeList_add,integralTypeList_edit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '3f029e72ef13db56e8b65866984da722', 'WithdrawList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '43b1d02267e9ed610543845a1c1a24ca', 'OverdueAdvancesList_add,OverdueAdvancesList_edit,OverdueAdvancesList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '4c654b11b08eecbf6eb4e6688ea83b7d', 'MemberList_add,MemberList_edit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '4f1b6666b70be892469b6e93c1eb30ce', 'NavTree_add,NavTree_edit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '51af37d8918504c4ba34a85b1a3d94fc', 'AccountLoginList_exp');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '57c06b09c96c8f852993f07580ffcdfa', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '5db451044c71b4eb5448a4291d538241', 'bankCardList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '6460c4e2cb89b498712c96e9b4d1acce', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '6a56f98aba3ed0e794a9906e138195a9', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '6b44218344d328305de2bcdf82cb8741', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '703a3f819925f89a9c370c0324d784a0', 'MessageNoticeList_add,MessageNoticeList_edit,MessageNoticeList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '765726125327148f709cb1b98e8e2fb8', 'AccountTenderList_exp');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '81d6b2292bbe73c29bc76679201662e1', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '88ee044d59911b3b1a67ba4cdd0ee90d', 'AnnouncementList_add,AnnouncementList_edit,AnnouncementList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '8b442566ffbc9531ee5e3aef7c41d740', 'MemberAuthList_auth');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '8b4c5afb8d66b21e8900822c5c6bff35', 'RechargeList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '9171c71b4bab5578ef0bbeac30072c73', 'StatisticsList_exp');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '91ca1b4b197688f21b68a72f69e09a8d', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '93f6161c579a1df53d49eb2655d29645', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', '9dc3357651c9ecbb9b7c51005be28d18', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'a99477bf949bcae7143004e369d31d6c', 'RechargeSetList_add,RechargeSetList_edit,RechargeSetList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'ac892df07f9087fb1c89ac968bb5f555', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'ae024ce004991607d5ae9e725d67cce8', 'ApplyAmountList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'b67d550a506255816d54840a853b7a46', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'c3c78541e9041ab6659fd3399aa6445b', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'c58c25c6cb2e8d9fdf39493dde51d80d', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'c5cbf9f0961aa8249322d9ac20ba996e', 'BorrowingLoanFirstAuditList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'c5d4cae04f14f76eae54c0da51819af0', 'WithdrawSetList_add,WithdrawSetList_edit,WithdrawSetList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'd1f203ea6815e227579b88c5d6235629', 'AccountInvestList_exp');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'd31f853097d3bd74741d6418f6a2c7d5', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'd60a6e3369f1b7fdb249aa61ba4add6e', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'de34654c5e6c1e94ee70cc833asd142', 'AreaTree_add,AreaTree_edit,AreaTree_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e42b98561176563f930d82c80b041ed8', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e46f33cd486fe42c714c909e32966b4c', 'OverdueFineSetList_add,OverdueFineSetList_edit,OverdueFineSetList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e4d2578abb2e36eb4aea5fa8caed2a51', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e550884c5e6c1e94ee70cc833aa1c2b9', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'e75a41ba4a2bc299e3b50a15580a103b', 'ServiceList_add,ServiceList_edit,ServiceList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'f15eee7156a6e9821ad60ea9747b6878', 'EstateList_audit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'fd23f24a96e40753c6e0f1286bf47326', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'fefe8e9ee335dadbace082923415e023', null);
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'sdeg454c5e6c1e94ee70cc833asd142', 'IntegralList_add,IntegralList_edit');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 't110147c5e6c1e94ee70cc833aa7f5d3', 'AgeList_add,AgeList_edit,AgeList_del');
INSERT INTO `t_authority` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'v465654c5e6c1e94ee70cc833asd142', 'CreditList_add,CreditList_edit');
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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4c654b11b08eecbf6eb4e6688ea83b7d', 'MemberList_add,MemberList_edit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f1b6666b70be892469b6e93c1eb30ce', 'NavTree_add,NavTree_edit,NavTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '51af37d8918504c4ba34a85b1a3d94fc', 'AccountLoginList_exp');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '57c06b09c96c8f852993f07580ffcdfa', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5db451044c71b4eb5448a4291d538241', 'bankCardList_del,bankCardList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6460c4e2cb89b498712c96e9b4d1acce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6a56f98aba3ed0e794a9906e138195a9', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6b44218344d328305de2bcdf82cb8741', null);
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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c5d4cae04f14f76eae54c0da51819af0', 'WithdrawSetList_add,WithdrawSetList_edit,WithdrawSetList_del,WithdrawSetList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd1f203ea6815e227579b88c5d6235629', 'AccountInvestList_outExp,AccountInvestList_exp');
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
  `loan_code` varchar(50) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `loan_title` varchar(50) DEFAULT NULL,
  `loan_picture` varchar(255) DEFAULT NULL,
  `loan_tender_id` varchar(32) DEFAULT NULL,
  `loan_purpose_id` varchar(32) DEFAULT NULL,
  `loan_deadlines_id` varchar(32) DEFAULT NULL,
  `failed_reason` enum('manually','other') DEFAULT NULL,
  `is_day_marked` enum('no','yes') DEFAULT NULL,
  `is_bid_reward` enum('no','yes') DEFAULT NULL,
  `bid_pro_reward` float DEFAULT NULL,
  `fixed_app_reward` float DEFAULT NULL,
  `is_bid_marked` enum('no','yes') DEFAULT NULL,
  `ready_rec_money` float DEFAULT NULL,
  `is_bid_pwd` enum('no','yes') DEFAULT NULL,
  `bid_pwd` varchar(10) DEFAULT NULL,
  `loan_management_fees` float DEFAULT NULL,
  `repayment_type_id` varchar(32) DEFAULT NULL,
  `loan_total` float DEFAULT NULL,
  `loan_apr` float DEFAULT NULL,
  `lowest_bid_money` varchar(50) DEFAULT NULL,
  `largest_bid_money` varchar(50) DEFAULT NULL,
  `lowest_sub` float DEFAULT NULL,
  `sub_total` float DEFAULT NULL,
  `alr_sub_sum` float DEFAULT NULL,
  `alr_tender_pro` float DEFAULT NULL,
  `tender_sum` float DEFAULT NULL,
  `wait_bid_deadlines` varchar(50) DEFAULT NULL,
  `loan_detail` varchar(500) DEFAULT NULL,
  `is_account_funds` enum('no','yes') DEFAULT NULL,
  `is_loan_funds` enum('no','yes') DEFAULT NULL,
  `is_credit_amount` enum('no','yes') DEFAULT NULL,
  `is_bid_funds` enum('no','yes') DEFAULT NULL,
  `is_automatic_bid` enum('no','yes') DEFAULT NULL,
  `is_recommend` enum('no','yes') DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `loan_date` datetime DEFAULT NULL,
  `member_ip` varchar(50) DEFAULT NULL,
  `loan_state` enum('firstAudit','tendering','secondAuditor','repaymenting','completed','bids') DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `first_audit_state` enum('firstSucess','firstFailure') DEFAULT NULL,
  `first_auditor_id` varchar(32) DEFAULT NULL,
  `first_advice` varchar(500) DEFAULT NULL,
  `first_mes_notice` varchar(500) DEFAULT NULL,
  `first_audit_date` datetime DEFAULT NULL,
  `second_audit_state` enum('secondSucess','secondFailure') DEFAULT NULL,
  `second_auditor_id` varchar(32) DEFAULT NULL,
  `second_advice` varchar(500) DEFAULT NULL,
  `second_mes_notice` varchar(500) DEFAULT NULL,
  `second_audit_date` datetime DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `alr_bid_money` float DEFAULT NULL COMMENT '已投标金额',
  PRIMARY KEY (`loan_id`),
  KEY `FK_t_borrowing_loan_t_loan_tender_loan_tender_id` (`loan_tender_id`),
  CONSTRAINT `t_borrowing_loan_ibfk_1` FOREIGN KEY (`loan_tender_id`) REFERENCES `t_loan_tender` (`loan_tender_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_borrowing_loan
-- ----------------------------
INSERT INTO `t_borrowing_loan` VALUES ('d1f348f1c7cdd64635b368daea150801', 'borrowing_201407241729', '8ce2d4b7913aa2411870e30a48d46e49', '借钱买手机', 'http://bdmu.v068041.10000net.cn/netloan-website/resources/images/member/member.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '长期使用', '2', null, 'yes', 'no', '0', '0', 'yes', null, 'no', null, null, '1873eeaa00e9e544c759595ffb98ab06', '10000', '0.1', '0', '0', '2000', '5', '1', '0.2', '1', '5', '借钱买手机', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-07-24 17:29:17', '2014-07-24 17:29:17', null, 'tendering', '借钱买手机', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', '初审通过  ', '初审通过  ', '2014-07-24 17:55:56', null, null, null, null, null, '8ce2d4b7913aa2411870e30a48d46e49', '8b25651c2d896297530b64e4b80ec503', '2014-07-26 21:07:28', '0');

-- ----------------------------
-- Table structure for `t_finance_bank_card`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_bank_card`;
CREATE TABLE `t_finance_bank_card` (
  `bank_card_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `opening_bank` varchar(50) DEFAULT NULL,
  `subbranch` varchar(50) DEFAULT NULL,
  `card_name` varchar(20) DEFAULT NULL,
  `card_number` varchar(20) DEFAULT NULL,
  `status` enum('authstr','changing','pass','failure') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`bank_card_id`),
  KEY `FK_t_bank_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_bank_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的银行卡表';

-- ----------------------------
-- Records of t_finance_bank_card
-- ----------------------------
INSERT INTO `t_finance_bank_card` VALUES ('b73efc25dfce71371486529c71b7389a', '4e71816a4e72e843e482629dda416d4d', '工商银行', '哈工大支行', '借记卡', '8888888888888888888', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:21:19', '', '4e71816a4e72e843e482629dda416d4d', '2014-07-25 16:21:05', '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:21:19');

-- ----------------------------
-- Table structure for `t_finance_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_member`;
CREATE TABLE `t_finance_member` (
  `finance_member_id` varchar(32) NOT NULL,
  `bank_card_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `usable_money` float(20,2) DEFAULT NULL,
  `frozen_money` float(20,2) DEFAULT NULL,
  `collecting_money` float(20,2) DEFAULT NULL,
  `refund_money` float(20,2) DEFAULT NULL,
  `amount` float(20,2) DEFAULT NULL,
  `recharge_month_times` float(20,2) DEFAULT NULL,
  `recharge_times` float(20,2) DEFAULT NULL,
  `recharge_money` float(20,2) DEFAULT NULL,
  `withdraw_month_times` float(20,2) DEFAULT NULL,
  `withdraw_times` float(20,2) DEFAULT NULL,
  `withdraw_money` float(20,2) DEFAULT NULL,
  `borrower_credit` float(20,2) DEFAULT NULL,
  `available_credit` float(20,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_member_id`),
  KEY `FK_t_finance_member_t_bank_bank_id` (`bank_card_id`),
  KEY `FK_t_finance_member_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_finance_member_t_bank_bank_id` FOREIGN KEY (`bank_card_id`) REFERENCES `t_finance_bank_card` (`bank_card_id`),
  CONSTRAINT `FK_t_finance_member_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员资金信息表。';

-- ----------------------------
-- Records of t_finance_member
-- ----------------------------
INSERT INTO `t_finance_member` VALUES ('16a682a8b3422b754575753042864183', null, '8ce2d4b7913aa2411870e30a48d46e49', '45000.00', '0.00', '0.00', '0.00', '45000.00', '1.00', '1.00', '45000.00', '0.00', '0.00', '0.00', '0.00', '0.00', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:11', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52');
INSERT INTO `t_finance_member` VALUES ('41f3f2ee7326e20c3df92598364bfc57', null, '4e71816a4e72e843e482629dda416d4d', '38000.00', '2000.00', '0.00', '0.00', '40000.00', '1.00', '1.00', '40000.00', '0.00', '0.00', '0.00', '0.00', '0.00', '投标更新会员资金信息', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:38:45', '8b25651c2d896297530b64e4b80ec503', '2014-07-26 21:07:28');

-- ----------------------------
-- Table structure for `t_finance_overdue_advances`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_overdue_advances`;
CREATE TABLE `t_finance_overdue_advances` (
  `overdue_advances_id` varchar(32) NOT NULL,
  `overdue_advances_name` varchar(50) DEFAULT NULL COMMENT '逾期垫付管理名称',
  `member_type` enum('general','vip','all') DEFAULT NULL,
  `feeWay` enum('proportion','directcost') DEFAULT NULL,
  `value` float(20,2) DEFAULT NULL,
  `audit_state` enum('failure','pass','authstr') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`overdue_advances_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的逾期垫付表。';

-- ----------------------------
-- Records of t_finance_overdue_advances
-- ----------------------------
INSERT INTO `t_finance_overdue_advances` VALUES ('13aca8b3e01e6fed580e03dc13f1321b', '逾期垫付设置_001', 'all', null, '12.00', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:08:08', '', 'TEXT', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 15:02:32', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:08:08');
INSERT INTO `t_finance_overdue_advances` VALUES ('cf9b1a2643490686484e54a89632e8df', '逾期垫付设置_002', 'general', null, '11.00', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 16:35:28', '', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 13:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-05-29 16:35:28');
INSERT INTO `t_finance_overdue_advances` VALUES ('ff3379a817e3de194afcd8dfd728aef4', '逾期垫付设置_003', 'vip', null, '10.00', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:07:57', '', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-28 16:21:17', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 09:07:57');

-- ----------------------------
-- Table structure for `t_finance_overdue_advances_record`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_overdue_advances_record`;
CREATE TABLE `t_finance_overdue_advances_record` (
  `advances_record_id` varchar(32) NOT NULL,
  `overdue_advances_id` varchar(32) NOT NULL,
  `platform_transaction_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `repay_notes_detail_id` varchar(32) DEFAULT NULL,
  `member_type` enum('general','vip','all') DEFAULT NULL,
  `advances_percent` varchar(20) DEFAULT NULL,
  `advances_money` varchar(20) DEFAULT NULL,
  `audit_state` enum('failure','pass','authstr') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`advances_record_id`),
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
  `overdue_fine_set_name` varchar(50) DEFAULT NULL,
  `member_id` varchar(32) NOT NULL,
  `repay_notes_detail_id` varchar(32) NOT NULL,
  `overdue_fine_money` float(20,2) DEFAULT NULL,
  `should_pay_date` datetime DEFAULT NULL,
  `actual_pay_date` datetime DEFAULT NULL,
  `audit_state` enum('failure','pass','authstr') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`overdue_fine_id`),
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
  `overdue_fine_set_name` varchar(50) DEFAULT NULL,
  `member_type` enum('general','vip','all') DEFAULT NULL,
  `member_privilege` enum('enable','disable') DEFAULT NULL COMMENT '是否减少VIP会员设定天数',
  `vip_days` float(20,2) DEFAULT NULL COMMENT 'vip会员减少天数',
  `value` float(20,2) DEFAULT NULL,
  `fee_way` enum('proportion','directcost') DEFAULT NULL COMMENT 'ȡ�ѷ�ʽ���������û��Զ����ȡ�',
  `audit_state` enum('failure','pass','authstr') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `money` float(20,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`overdue_fine_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的逾期罚款设置表。';

-- ----------------------------
-- Records of t_finance_overdue_fine_set
-- ----------------------------
INSERT INTO `t_finance_overdue_fine_set` VALUES ('990c154772f6e74cabcedea2c4f2dfe7', 'FineSet_02', 'general', 'disable', '0.00', null, 'proportion', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:11:01', null, '100.00', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-04 15:11:01', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:07:09');
INSERT INTO `t_finance_overdue_fine_set` VALUES ('bd8521da40f7809ae5019be52c4b2aea', 'FineSet_01', 'all', 'disable', '0.00', null, 'directcost', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-06-06 10:49:58', null, '10.00', 'Pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-06 10:49:58', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:06:36');

-- ----------------------------
-- Table structure for `t_finance_platform`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_platform`;
CREATE TABLE `t_finance_platform` (
  `finance_platform_id` varchar(32) NOT NULL,
  `platform_code` varchar(50) DEFAULT NULL,
  `platform_name` varchar(50) DEFAULT NULL,
  `platform_account` varchar(50) DEFAULT NULL,
  `platform_money` float(20,2) DEFAULT NULL,
  `audit_state` enum('failure','pass','authstr') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `opening_bank` varchar(50) DEFAULT NULL COMMENT '开户行',
  `card_name` varchar(30) DEFAULT NULL COMMENT '银行卡名称',
  `subbranch` varchar(50) DEFAULT NULL COMMENT '支行',
  `card_number` varchar(30) DEFAULT NULL COMMENT '银行卡号',
  `platform_type` enum('external','default') DEFAULT NULL COMMENT '资金平台类型',
  PRIMARY KEY (`finance_platform_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的平台资金信息表。';

-- ----------------------------
-- Records of t_finance_platform
-- ----------------------------
INSERT INTO `t_finance_platform` VALUES ('779704b7753c12ae409909291ba72399', '1002', '冰川平台资金', '1055644646234111111', '100000.00', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 14:58:43', '通过', null, '8b25651c2d896297530b64e4b80ec503', '2014-05-16 13:42:01', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21', '工商银行', '工商储蓄卡', '哈工大工商支行', '8888888888888888888', 'default');
INSERT INTO `t_finance_platform` VALUES ('sdf54s5df454sd45sg', '1003', '哈工大平台资金', '1055644646265', '0.00', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-20 09:51:31', '通过', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:08:57', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:24:18', '邮政银行', '邮政储蓄卡', '哈工大邮政支行', '7777777777777', 'external');

-- ----------------------------
-- Table structure for `t_finance_platform_transaction`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_platform_transaction`;
CREATE TABLE `t_finance_platform_transaction` (
  `platform_transaction_id` varchar(32) NOT NULL,
  `finance_platform_id` varchar(32) NOT NULL,
  `transaction_target` varchar(32) DEFAULT NULL,
  `transaction_type` varchar(100) DEFAULT NULL,
  `earning_money` float(20,2) DEFAULT NULL,
  `expend_money` float(20,2) DEFAULT NULL,
  `amount` float(20,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`platform_transaction_id`),
  KEY `FK_t_platform_transaction_t_platform_finance_platform_id` (`finance_platform_id`),
  CONSTRAINT `t_finance_platform_transaction_ibfk_1` FOREIGN KEY (`finance_platform_id`) REFERENCES `t_finance_platform` (`finance_platform_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的平台交易明细表。';

-- ----------------------------
-- Records of t_finance_platform_transaction
-- ----------------------------
INSERT INTO `t_finance_platform_transaction` VALUES ('053a8e553bf97c7966bd408016073521', '779704b7753c12ae409909291ba72399', 'zhangsan', '充值', '50000.00', '0.00', '50000.00', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52');
INSERT INTO `t_finance_platform_transaction` VALUES ('8a48bbce30e9453662efe0d156e26225', '779704b7753c12ae409909291ba72399', 'song', '充值', '50000.00', '0.00', '100000.00', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21');

-- ----------------------------
-- Table structure for `t_finance_recharge`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge`;
CREATE TABLE `t_finance_recharge` (
  `finance_recharge_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `finance_recharge_set_id` varchar(32) NOT NULL,
  `recharge_receipt` varchar(50) DEFAULT NULL COMMENT '充值回执',
  `recharge_code` varchar(50) DEFAULT NULL COMMENT '流水号（编号）',
  `recharge_amount` float(20,2) DEFAULT NULL,
  `handling_charge` float(20,2) DEFAULT NULL,
  `recharge_rate` float(20,2) DEFAULT NULL,
  `arrive_money` float(20,2) DEFAULT NULL,
  `audit_state` enum('authstr','pass','failure') DEFAULT NULL COMMENT '审核状态',
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_recharge_id`),
  KEY `FK_t_recharge_t_recharge_set_finance_recharge_set_id` (`finance_recharge_set_id`),
  KEY `FK_t_finance_recharge_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_finance_recharge_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`),
  CONSTRAINT `FK_t_recharge_t_recharge_set_finance_recharge_set_id` FOREIGN KEY (`finance_recharge_set_id`) REFERENCES `t_finance_recharge_set` (`finance_recharge_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员充值记录表。';

-- ----------------------------
-- Records of t_finance_recharge
-- ----------------------------
INSERT INTO `t_finance_recharge` VALUES ('37b8b93e974db69fe188a528065a32ad', '4e71816a4e72e843e482629dda416d4d', '8f49f6dcbe06833f65c44220e6552676', '', 'recharge_201407241539', '50000.00', '10000.00', '0.20', '40000.00', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21', '充值成功,系统自动审核通过', '充值成功', '4e71816a4e72e843e482629dda416d4d', '2014-07-24 15:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21');
INSERT INTO `t_finance_recharge` VALUES ('4b8f7f19c6daa76b0fc63ea43365deef', '8ce2d4b7913aa2411870e30a48d46e49', '1ac50d47c763ea03f6892d84fc4f7a4d', '', 'recharge_201407241533', '50000.00', '5000.00', '0.10', '45000.00', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52', '充值成功,系统自动审核通过', '充值成功', '8ce2d4b7913aa2411870e30a48d46e49', '2014-07-24 15:33:52', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52');

-- ----------------------------
-- Table structure for `t_finance_recharge_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge_set`;
CREATE TABLE `t_finance_recharge_set` (
  `finance_recharge_set_id` varchar(32) NOT NULL,
  `recharge_set_name` varchar(32) DEFAULT NULL,
  `recharge_type` enum('offline','onLine') DEFAULT NULL,
  `recharge_rate` float(20,3) DEFAULT NULL,
  `member_type` enum('general','vip','all') DEFAULT NULL,
  `value` float(20,3) DEFAULT NULL,
  `fee_way` enum('proportion','directcost') DEFAULT NULL,
  `audit_state` enum('failure','pass','authstr') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_recharge_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员充值设置表。';

-- ----------------------------
-- Records of t_finance_recharge_set
-- ----------------------------
INSERT INTO `t_finance_recharge_set` VALUES ('1ac50d47c763ea03f6892d84fc4f7a4d', '支付宝', 'onLine', '0.100', 'all', '0.100', 'proportion', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-07-02 08:49:37', '', '支付宝', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:02', 'd6dc13121742a3b331dcb6f93d4f4bce', '2014-07-14 13:46:04');
INSERT INTO `t_finance_recharge_set` VALUES ('8f49f6dcbe06833f65c44220e6552676', '财务通', 'onLine', '0.200', 'vip', '0.200', 'proportion', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-07-02 08:49:26', '', '财务通', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:22', 'd6dc13121742a3b331dcb6f93d4f4bce', '2014-07-14 13:45:56');
INSERT INTO `t_finance_recharge_set` VALUES ('b6cb483c206fbdbe370d5941a10a1c1f', '线下充值', 'offline', '10.000', 'general', '10.000', 'directcost', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-07-02 08:49:42', '', '线下充值', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 11:07:59', '8b25651c2d896297530b64e4b80ec503', '2014-05-27 13:53:01');

-- ----------------------------
-- Table structure for `t_finance_transaction`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_transaction`;
CREATE TABLE `t_finance_transaction` (
  `transaction_id` varchar(32) NOT NULL,
  `finance_member_id` varchar(32) NOT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `transaction_target` varchar(32) DEFAULT NULL COMMENT '交易对方',
  `transaction_type` varchar(100) DEFAULT NULL COMMENT '交易类型',
  `earning_money` float(20,2) DEFAULT NULL COMMENT '收入金额',
  `expend_money` float(20,2) DEFAULT NULL COMMENT '支出金额',
  `usable_money` float(20,2) DEFAULT NULL COMMENT '可用金额',
  `frozen_money` float(20,2) DEFAULT NULL COMMENT '冻结金额',
  `collecting_money` float(20,2) DEFAULT NULL COMMENT '代收金额',
  `refund_money` float(20,2) DEFAULT NULL COMMENT '代还金额',
  `amount` float(20,2) DEFAULT NULL COMMENT '总金额',
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`transaction_id`),
  KEY `FK_t_finance_transaction_t_finance_member _finance_member_id` (`finance_member_id`),
  KEY `FK_t_finance_transaction_t_member_member_id` (`member_id`) USING BTREE,
  CONSTRAINT `FK_t_finance_transaction_t_finance_member _finance_member_id` FOREIGN KEY (`finance_member_id`) REFERENCES `t_finance_member` (`finance_member_id`),
  CONSTRAINT `FK_t_finance_transaction_t_member _member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员资金交易明细表。';

-- ----------------------------
-- Records of t_finance_transaction
-- ----------------------------
INSERT INTO `t_finance_transaction` VALUES ('1fafa337ae3c123d0452e1c753803a1d', '41f3f2ee7326e20c3df92598364bfc57', '4e71816a4e72e843e482629dda416d4d', '张三', '冻结投标金额', '0.00', '0.00', '38000.00', '2000.00', '0.00', '0.00', '40000.00', '投标借款[借钱买手机],冻结投标金额[2000.0]元', '8b25651c2d896297530b64e4b80ec503', '2014-07-26 21:07:28', '8b25651c2d896297530b64e4b80ec503', '2014-07-26 21:07:28');
INSERT INTO `t_finance_transaction` VALUES ('64b1024bda158a2d9d005ebe808a4768', '41f3f2ee7326e20c3df92598364bfc57', '4e71816a4e72e843e482629dda416d4d', '系统账号', '充值', '40000.00', '0.00', '40000.00', '0.00', '0.00', '0.00', '40000.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21');
INSERT INTO `t_finance_transaction` VALUES ('69c807767881f7f184dfe83e34d59ea6', '16a682a8b3422b754575753042864183', '8ce2d4b7913aa2411870e30a48d46e49', '系统账号', '充值', '45000.00', '0.00', '45000.00', '0.00', '0.00', '0.00', '45000.00', '充值自动生成资金明细信息。', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52');

-- ----------------------------
-- Table structure for `t_finance_withdraw`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_withdraw`;
CREATE TABLE `t_finance_withdraw` (
  `finance_withdraw_id` varchar(32) NOT NULL,
  `withdraw_code` varchar(50) DEFAULT NULL,
  `member_id` varchar(32) NOT NULL,
  `opening_bank` varchar(50) DEFAULT NULL,
  `subbranch` varchar(50) DEFAULT NULL,
  `card_name` varchar(20) DEFAULT NULL,
  `card_number` varchar(20) DEFAULT NULL,
  `withdraw_amount` float(20,2) DEFAULT NULL,
  `arrive_money` float(20,2) DEFAULT NULL,
  `handling_charge` float(20,2) DEFAULT NULL,
  `withdraw_rate` float(20,2) DEFAULT NULL,
  `audit_state` enum('authstr','pass','failure') DEFAULT NULL COMMENT '审核状态',
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_withdraw_id`),
  KEY `FK_t_finance_withdraw_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_finance_withdraw_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员提现记录表。';

-- ----------------------------
-- Records of t_finance_withdraw
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_withdraw_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_withdraw_set`;
CREATE TABLE `t_finance_withdraw_set` (
  `finance_withdraw_set_id` varchar(32) NOT NULL,
  `withdraw_set_minimum` float(20,2) DEFAULT NULL COMMENT '提现最小金额',
  `withdraw_set_maximum` float(20,2) DEFAULT NULL COMMENT '最大金额',
  `withdraw_rate` float(20,3) DEFAULT NULL COMMENT '手续费率（100-2000/0.5元一笔）',
  `member_type` enum('all','vip','general') DEFAULT NULL COMMENT '有效会员等级(所有会员，vip会员，普通会员)',
  `value` float(20,3) DEFAULT NULL COMMENT '取值',
  `fee_way` enum('directcost','proportion') DEFAULT NULL COMMENT '直接收费还是比率收费',
  `audit_state` enum('authstr','pass','failure') DEFAULT NULL COMMENT '审核状态',
  `auditor` varchar(32) DEFAULT NULL COMMENT '审核人',
  `audit_date` datetime DEFAULT NULL COMMENT '审核时间',
  `audit_remark` varchar(225) DEFAULT NULL COMMENT '审核备注',
  `creater` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `remark` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`finance_withdraw_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_finance_withdraw_set
-- ----------------------------
INSERT INTO `t_finance_withdraw_set` VALUES ('1001', '100.00', '5000.00', '5.000', 'all', '5.000', 'directcost', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:20:40', '审核通过', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:21:03', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:21:07', '100-5000提现收费标准');
INSERT INTO `t_finance_withdraw_set` VALUES ('1002', '5001.00', '10000.00', '0.050', 'all', '0.050', 'proportion', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:25:12', '审核通过', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:25:24', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:25:28', '5001-10000按0.005%收费');
INSERT INTO `t_finance_withdraw_set` VALUES ('1003', '10001.00', '500000.00', '0.100', 'all', '0.100', 'proportion', 'failure', '8b25651c2d896297530b64e4b80ec503', '2014-07-01 10:09:43', '审核通过', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:28:26', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 15:28:33', '10001-500000按10%收费');

-- ----------------------------
-- Table structure for `t_loan_review`
-- ----------------------------
DROP TABLE IF EXISTS `t_loan_review`;
CREATE TABLE `t_loan_review` (
  `loan_review_id` varchar(32) NOT NULL,
  `loan_id` varchar(32) DEFAULT NULL,
  `review_content` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`loan_review_id`),
  KEY `FK_t_loan_review_t_borrowing_loan_loan_id` (`loan_id`),
  CONSTRAINT `t_loan_review_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `t_borrowing_loan` (`loan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loan_review
-- ----------------------------

-- ----------------------------
-- Table structure for `t_loan_tender`
-- ----------------------------
DROP TABLE IF EXISTS `t_loan_tender`;
CREATE TABLE `t_loan_tender` (
  `loan_tender_id` varchar(32) NOT NULL,
  `loanr_tender_name` varchar(32) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `state` enum('open','close') DEFAULT NULL,
  `lowest_loan_amount` float(20,2) DEFAULT NULL,
  `largest_loan_amount` float(20,2) DEFAULT NULL,
  `loan_money_multiple` float(20,2) DEFAULT NULL,
  `lowest_apr` float(20,3) DEFAULT NULL,
  `loan_deadlines_mon` varchar(50) DEFAULT NULL,
  `loan_deadlines_day` varchar(50) DEFAULT NULL,
  `wait_bid_deadlines` varchar(50) DEFAULT NULL,
  `lowest_bid_money` varchar(50) DEFAULT NULL,
  `largest_bid_money` varchar(50) DEFAULT NULL,
  `is_bid_reward` enum('no','yes') DEFAULT NULL,
  `largest_apr` float(20,3) DEFAULT NULL COMMENT '已投标金额',
  `alr_bid_money` float(20,2) DEFAULT NULL,
  `is_bid_pwd` enum('no','yes') DEFAULT NULL,
  `lowest_reward_pro` float(20,3) DEFAULT NULL,
  `largest_reward_pro` float(20,3) DEFAULT NULL,
  `lowest_reward_money` float(20,2) DEFAULT NULL,
  `largest_reward_money` float(20,2) DEFAULT NULL,
  `vip_freeze_bail` float(20,2) DEFAULT NULL,
  `general_freeze_bail` float(20,2) DEFAULT NULL,
  `adv_over_month` float(20,2) DEFAULT NULL,
  `adv_over_day` float(20,2) DEFAULT NULL,
  `loan_mana_fee_month` float(20,2) DEFAULT NULL,
  `loan_mana_fee_day` float(20,2) DEFAULT NULL,
  `limited_periods` float(20,2) DEFAULT NULL,
  `over_limited_fee` float(20,2) DEFAULT NULL,
  `subscription_state` enum('open','close') DEFAULT NULL,
  `guarantee_agency_id` varchar(32) DEFAULT NULL,
  `anti_guarantee_id` varchar(32) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`loan_tender_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loan_tender
-- ----------------------------
INSERT INTO `t_loan_tender` VALUES ('1c362eac7ec315aa47ab84360d4e390d', '信用标', '说明：信用借款标显示\"信\"字标记，是一种免抵押、免担保、纯信用，最高授信为10万元的小额个人信用借款标,主要面向公务员、医生或教师等机关企事业单位的在编人员。如借款人到期还款出现困难，逾期第30~33天由网站风险金补偿，债权转让为晋商贷网站所有。 ', 'open', '2000.00', '100000.00', null, '0.010', '1,2,3,4,5,6,7,8', '1,2,3,4,5,6,7,8,9,10,11,12', '1,2,3,4,5,6,7,8', '100,200,500,1000,10000', '100,200,500,1000,10000,100000', 'yes', '0.200', null, 'yes', '0.100', null, null, null, null, null, '1.00', '30.00', '3000.00', '2000.00', '2000.00', null, 'open', '', '', '用户成功借款后按借款期限一次性从所得借款中直接扣除收取，1个月内统一收取借款金额的1%。从第2个月开始，每个月加收0.4%的手续费（年手续费合计为5.4%）。借款手续费不计息，不退还，在借款金额中直接扣除。作为成交服务费。', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 15:56:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:36:44');
INSERT INTO `t_loan_tender` VALUES ('2587bd0ecc859e35f2874f2aff0d4852', '流转标', '债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。', 'open', '10000.00', '200000.00', null, '0.100', '1,2,3,4,5,6,7', '1,2,3,4,5,6,7,8', '1,2,5,8,9', '100,200,500,1000', '5000,8000,10000,200000', 'yes', '0.240', null, 'yes', '0.100', '0.200', '100.00', '10000.00', '10000.00', '20000.00', '1.00', '30.00', '2000.00', '1000.00', '1000.00', null, 'open', '', '', '债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。投资者对于流转标的购买份额最小为100元/份，流转期限由借款人确定,流转的周期不同，回报收益不同；通常流转期限越长，回报收益则越高。 ', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 14:31:40', '8b25651c2d896297530b64e4b80ec503', '2014-07-17 10:55:31');
INSERT INTO `t_loan_tender` VALUES ('9788195653f335695256551b82fcbac6', '净值标', '说明：净值借款标显示\"净\"字标记，允许发布的最大金额为净资产，净资产小于20万不能发标。发布净值借款标用于临时周转，可以循环借款，但用户提现将受到限制。他是一种相对安全系数很高的借款标，因此利率方面可能比较低，用户可以借助此标放大自己的资金杠杆。 ', 'open', '1000.00', '200000.00', '2.00', '0.010', '1,2,3,4,5,7,9', '1,2,3,4,5,6,7,8,9', '1,2,3,4,5,6,7,8', '100,200,500,1000', '1000,2000,5000,10000,20000', 'yes', '0.200', null, 'yes', '2.000', '20.000', '100.00', '2000.00', '10000.00', '20000.00', '5.00', '5.00', null, null, null, null, 'open', '', '', '说明：净值借款标显示', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:13:50', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:35:48');
INSERT INTO `t_loan_tender` VALUES ('aa09e227a4a40cb6cb15703b98522672', '抵押标', '说明：抵质押借款标显示 \"抵\"字标记，是经过线下严格核查借款人资产负债、抵押担保（矿资源房产、土地抵押等）、优质资产和股权等有价证券质押担保手续，然后通过平台发布借款需求，【晋商贷】对借贷方提供连带担保责任的业务品种，确保风险控制在最低水平。', 'open', '50000.00', '200000.00', '100.00', '0.100', '1,2,3,4,5', '1,2,3,4,5', '1,2,3,4,5', '100,200,500,1000,10000', '1000,20000,50000', 'yes', '0.240', null, 'yes', '5.000', '2.000', '2.00', '5.00', '2.00', '2.00', '2.00', '2.00', '22.00', '30.00', '20.00', '1000.00', 'open', '', '', '说明：抵质押借款标显示 ', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:13:03', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:37:35');

-- ----------------------------
-- Table structure for `t_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_loginlog`;
CREATE TABLE `t_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) DEFAULT NULL,
  `login_user` varchar(32) DEFAULT NULL,
  `login_time` datetime DEFAULT NULL,
  `login_ip` varchar(50) DEFAULT NULL,
  `browser_version` varchar(50) DEFAULT NULL,
  `screen_size` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`loginlog_id`),
  KEY `FK_loginlog_user_loginlog_id` (`user_id`),
  CONSTRAINT `FK_loginlog_user_loginlog_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loginlog
-- ----------------------------
INSERT INTO `t_loginlog` VALUES ('05ee2d2df879ffe6b69db8eb14859bcf', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-21 17:58:38', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1b908545de2b22c60b816f271aa89c6d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-18 09:48:19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('20bcba44879ff807513002241c4a3718', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-21 17:59:44', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9c219495d65adb80e5e90cfb9a28f812', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-22 15:51:16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a5de05fd69ae03b4feed3055c47f1777', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-18 14:03:39', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b5d6a6a174b17b3854fbca5c82637aae', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-26 21:00:37', '183.33.212.37[中国 广东省 珠海市 电信]', null, null);
INSERT INTO `t_loginlog` VALUES ('dbb096338ec1a9046c21e82956822428', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-22 14:48:16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e00d26837010666ed4a53cfef541b731', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-22 13:54:08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e201f4a86b57717be4d53d3b567f1279', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-24 15:14:59', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fb5f551da6231e7c427d945a827b9b1c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-07-22 14:36:19', '127.0.0.1[本地]', null, null);

-- ----------------------------
-- Table structure for `t_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `member_id` varchar(32) NOT NULL COMMENT '会员Id',
  `member_name` varchar(20) DEFAULT NULL COMMENT '会员名字',
  `member_password` varchar(64) DEFAULT NULL COMMENT '会员密码',
  `traders_password` varchar(64) DEFAULT NULL COMMENT '交易密码',
  `member_real_name` varchar(20) DEFAULT NULL COMMENT '会员真实姓名',
  `member_photo` varchar(255) DEFAULT NULL,
  `member_age` int(5) DEFAULT NULL COMMENT '会员年龄',
  `mobile_number` varchar(20) DEFAULT NULL COMMENT '手机号码',
  `sex` enum('man','woman','secret') DEFAULT NULL COMMENT '性别',
  `marital_status` enum('married','single','secret') DEFAULT NULL COMMENT '状态',
  `card_id` varchar(20) DEFAULT NULL COMMENT '身份证号',
  `email` varchar(32) DEFAULT NULL COMMENT '电子邮箱',
  `registration_time` datetime DEFAULT NULL,
  `credit_integral` float(20,2) DEFAULT NULL,
  `integral` float(20,2) DEFAULT NULL,
  `creditAmount` float(20,2) DEFAULT NULL,
  `status` enum('enable','disable') DEFAULT NULL,
  `type` enum('general','vip') DEFAULT NULL,
  `valid_time` datetime DEFAULT NULL COMMENT '类型有效时间',
  `expire_time` datetime DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `educational` varchar(32) DEFAULT NULL,
  `personal_des` varchar(255) DEFAULT NULL,
  `hometown` varchar(20) DEFAULT NULL,
  `live_address` varchar(100) DEFAULT NULL,
  `home_phone` varchar(20) DEFAULT NULL,
  `first_contact` varchar(10) DEFAULT NULL,
  `first_contact_relation` enum('family','friend','business') DEFAULT NULL,
  `first_contact_phone` varchar(20) DEFAULT NULL,
  `first_contact_address` varchar(100) DEFAULT NULL,
  `second_contact` varchar(10) DEFAULT NULL,
  `second_contact_relation` enum('family','friend','business') DEFAULT NULL,
  `second_contact_phone` varchar(20) DEFAULT NULL,
  `second_contact_address` varchar(100) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL COMMENT '最后一次登录时间',
  `last_login_ip_address` varchar(150) DEFAULT NULL COMMENT '最后一次登录ip地址',
  `login_count` int(10) DEFAULT NULL COMMENT '登录次数',
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员资料表';

-- ----------------------------
-- Records of t_member
-- ----------------------------
INSERT INTO `t_member` VALUES ('4e71816a4e72e843e482629dda416d4d', 'song', '4defbf5cdef89e398b3b2e410badc31c2e2af950', '4defbf5cdef89e398b3b2e410badc31c2e2af950', '宋俊东', 'http://bdmu.v068041.10000net.cn/netloan-website/resources/images/member/member.jpg', '21', '13411381321', 'man', 'single', '431081199309212993', '745258281@qq.com', '2014-07-24 15:38:45', '10.00', '14.00', '10000.00', 'enable', 'general', null, null, null, '研究生或以上', '~~~~', '湖南', '珠海', '2145774', '', 'family', '', '', '', 'family', '', '', '2014-07-26 20:44:58', '183.33.212.37[]', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:38:45', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:40:45');
INSERT INTO `t_member` VALUES ('8ce2d4b7913aa2411870e30a48d46e49', 'zhangsan', '73f28d7e1979a015e47e6dcf7c7187865db52138', '73f28d7e1979a015e47e6dcf7c7187865db52138', '张三', 'http://bdmu.v068041.10000net.cn/netloan-website/resources/images/member/member.jpg', '22', '13411381321', 'man', 'single', '431081199309212993', '985776597@qq.com', '2014-07-24 15:33:11', '10.00', '10.00', '0.00', 'enable', 'general', null, null, null, '研究生或以上', '乐观', '广东', '珠海', '335187464', '', 'family', '', '', '', 'family', '', '', '2014-07-24 17:26:01', '127.0.0.1[本地]', '3', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:11', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:29:17');

-- ----------------------------
-- Table structure for `t_member_apply_amount`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_apply_amount`;
CREATE TABLE `t_member_apply_amount` (
  `apply_amount_id` varchar(32) NOT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `apply_type` enum('phone','internet','scene') DEFAULT NULL,
  `original_amount` float(20,2) DEFAULT NULL,
  `apply_money` float(20,2) DEFAULT NULL,
  `apply_explanation` varchar(255) DEFAULT NULL,
  `authorized_amount` float(20,2) DEFAULT NULL,
  `audit_state` enum('authstr','pass','failure') DEFAULT NULL,
  `process_explanation` varchar(255) DEFAULT NULL,
  `apply_date` datetime DEFAULT NULL,
  `auditor_id` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`apply_amount_id`),
  KEY `FK_t_member_apply_amount_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_apply_amount_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员申请额度表';

-- ----------------------------
-- Records of t_member_apply_amount
-- ----------------------------
INSERT INTO `t_member_apply_amount` VALUES ('7e929fbd7a0cd0e295f68d57309dba5c', '4e71816a4e72e843e482629dda416d4d', 'internet', '0.00', '10000.00', '-------------', '10000.00', 'pass', 'pass', '2014-07-24 15:39:39', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:41:12', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:39', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:41:12');
INSERT INTO `t_member_apply_amount` VALUES ('c07456854410cb531cb834a1605b13e2', '8ce2d4b7913aa2411870e30a48d46e49', 'internet', '0.00', '10000.00', '~~~~~~~~~', '10000.00', 'pass', 'pass', '2014-07-24 15:36:12', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:36:47', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:36:12', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:36:47');

-- ----------------------------
-- Table structure for `t_member_auth`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_auth`;
CREATE TABLE `t_member_auth` (
  `member_id` varchar(32) NOT NULL DEFAULT '' COMMENT '会员Id',
  `info_name` varchar(20) DEFAULT '基本信息认证' COMMENT '基本信息认证名称',
  `info_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '基本资料认证状态',
  `info_accessory` text COMMENT '基本信息认证附件',
  `info_auditor` varchar(32) DEFAULT NULL COMMENT '基本资料审核人',
  `info_remark` varchar(255) DEFAULT NULL COMMENT '基本信息审核说明',
  `info_time` datetime DEFAULT NULL COMMENT '审核时间',
  `info_num` int(10) DEFAULT NULL COMMENT '基本信息认证排序号',
  `vip_name` varchar(20) DEFAULT 'VIP认证' COMMENT 'VIP认证名称',
  `vip_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT 'VIP认证状态',
  `vip_accessory` text COMMENT 'VIP认证附件',
  `vip_auditor` varchar(32) DEFAULT NULL COMMENT 'VIP审核人',
  `vip_remark` varchar(255) DEFAULT NULL COMMENT 'VIP审核说明',
  `vip_time` datetime DEFAULT NULL COMMENT 'VIP认证审核说明',
  `vip_num` int(10) DEFAULT NULL COMMENT 'VIP认证排序',
  `email_name` varchar(20) DEFAULT '邮箱认证' COMMENT '邮箱认证名称',
  `email_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '邮箱认证状态',
  `email_accessory` text COMMENT '邮箱认证附件',
  `email_auditor` varchar(32) DEFAULT NULL COMMENT '邮箱认证审核人',
  `email_remark` varchar(255) DEFAULT NULL COMMENT '邮箱认证审核说明',
  `email_time` datetime DEFAULT NULL COMMENT '邮箱认证审核时间',
  `email_num` int(10) DEFAULT NULL COMMENT '邮箱认证排序号',
  `mobile_name` varchar(20) DEFAULT '手机认证' COMMENT '手机认证名称',
  `mobile_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '手机认证状态',
  `mobile_accessory` text COMMENT '手机认证附件',
  `mobile_auditor` varchar(32) DEFAULT NULL COMMENT '手机认证审核人',
  `mobile_remark` varchar(255) DEFAULT NULL COMMENT '手机认证审核说明',
  `mobile_time` datetime DEFAULT NULL COMMENT '手机认证审核时间',
  `mobile_num` int(10) DEFAULT NULL COMMENT '手机认证排序号',
  `credit_name` varchar(20) DEFAULT '信用认证' COMMENT '信用认证名称',
  `credit_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '信用认证状态',
  `credit_accessory` text COMMENT '信用认证附件',
  `credit_auditor` varchar(32) DEFAULT NULL COMMENT '信用认证审核人',
  `credit_remark` varchar(255) DEFAULT NULL COMMENT '信用认证审核说明',
  `credit_time` datetime DEFAULT NULL COMMENT '信用认证审核时间',
  `credit_num` int(10) DEFAULT NULL COMMENT '信用认证排序号',
  `company_name` varchar(20) DEFAULT '企业认证' COMMENT '企业认证名称',
  `company_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '企业认证状态',
  `company_accessory` text COMMENT '企业认证附件',
  `company_auditor` varchar(32) DEFAULT NULL COMMENT '企业认证审核人',
  `company_remark` varchar(255) DEFAULT NULL COMMENT '企业认证审核说明',
  `company_time` datetime DEFAULT NULL COMMENT '其它认证审核时间',
  `company_num` int(10) DEFAULT NULL COMMENT '企业认证排序号',
  `real_name` varchar(20) DEFAULT '真实姓名认证' COMMENT '真实姓名认证名称',
  `real_name_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '真实姓名认证状态',
  `real_name_accessory` text COMMENT '真实姓名认证附件',
  `real_name_auditor` varchar(32) DEFAULT NULL COMMENT '真实姓名审核人',
  `real_name_remark` varchar(255) DEFAULT NULL COMMENT '真实姓名审核说明',
  `real_name_time` datetime DEFAULT NULL COMMENT '真实姓名审核时间',
  `real_name_num` int(10) DEFAULT NULL COMMENT '真实姓名排序号',
  `id_card_name` varchar(20) DEFAULT '身份证认证' COMMENT '身份证认证名称',
  `id_card_accessory` text COMMENT '身份证认证附件',
  `id_card_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '身份证认证状态',
  `id_card_auditor` varchar(32) DEFAULT NULL COMMENT '身份证认证审核人',
  `id_card_remark` varchar(255) DEFAULT NULL COMMENT '身份证审核说明',
  `id_card_time` datetime DEFAULT NULL COMMENT '身份证审核时间',
  `id_card_num` int(10) DEFAULT NULL COMMENT '身份证认证排序号',
  `work_name` varchar(20) DEFAULT '工作认证' COMMENT '工作认证名称',
  `work_auth` enum('noapply','authstr','pass','failure') DEFAULT 'noapply' COMMENT '工作认证状态',
  `work_accessory` text COMMENT '工作认证附件',
  `work_auditor` varchar(32) DEFAULT NULL COMMENT '工作认证审核人',
  `work_remark` varchar(255) DEFAULT NULL COMMENT '工作认证审核说明',
  `work_time` datetime DEFAULT NULL COMMENT '工作认证审核时间',
  `work_num` int(10) DEFAULT NULL COMMENT '工作认证排序号',
  PRIMARY KEY (`member_id`),
  KEY `FK_t_member_auth_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_auth_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员认证表';

-- ----------------------------
-- Records of t_member_auth
-- ----------------------------
INSERT INTO `t_member_auth` VALUES ('4e71816a4e72e843e482629dda416d4d', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, '8b25651c2d896297530b64e4b80ec503', '邮箱验证通过', '2014-07-24 15:38:45', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);
INSERT INTO `t_member_auth` VALUES ('8ce2d4b7913aa2411870e30a48d46e49', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, '8b25651c2d896297530b64e4b80ec503', '邮箱验证通过', '2014-07-24 15:33:11', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);

-- ----------------------------
-- Table structure for `t_member_credit_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_credit_integral`;
CREATE TABLE `t_member_credit_integral` (
  `credit_integral_id` varchar(32) NOT NULL COMMENT '信用积分Id',
  `member_id` varchar(32) DEFAULT NULL COMMENT '会员Id',
  `integral_type` enum('infoAuth','vipAuth','emailAuth','mobileAuth','creditAuth','companyAuth','realNameAuth','idCardAuth','workAuth') DEFAULT NULL COMMENT '积分类型',
  `change_type` enum('increase','reduction') DEFAULT NULL COMMENT '改变类型',
  `change_value` int(10) DEFAULT NULL COMMENT '改变分值',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`credit_integral_id`),
  KEY `FK_t_credit_integral_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_credit_integral_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员信用积分表';

-- ----------------------------
-- Records of t_member_credit_integral
-- ----------------------------
INSERT INTO `t_member_credit_integral` VALUES ('1718b4cb2944be588f5532bff76e9f1c', '8ce2d4b7913aa2411870e30a48d46e49', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:11', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:11');
INSERT INTO `t_member_credit_integral` VALUES ('68e45b908722778dc9e624e70657a5df', '4e71816a4e72e843e482629dda416d4d', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:38:45', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:38:45');

-- ----------------------------
-- Table structure for `t_member_estate`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_estate`;
CREATE TABLE `t_member_estate` (
  `estate_id` varchar(32) NOT NULL COMMENT '会员房产Id',
  `member_id` varchar(32) DEFAULT NULL COMMENT '会员Id',
  `address` varchar(50) DEFAULT NULL COMMENT '地址',
  `area` float(20,2) DEFAULT NULL COMMENT '面积',
  `year_built` datetime DEFAULT NULL COMMENT '建筑年份',
  `age_expenses` enum('mortgage','finished') DEFAULT NULL COMMENT '供款状况',
  `first_owner` varchar(32) DEFAULT NULL COMMENT '所有权人一',
  `second_owner` varchar(32) DEFAULT NULL COMMENT '所有权人二',
  `loan_period` datetime DEFAULT NULL COMMENT '贷款年限',
  `month_contributions` float(20,2) DEFAULT NULL COMMENT '每月供款',
  `outstand_balances` float(20,2) DEFAULT NULL COMMENT '尚欠贷款余额',
  `mortgage_bank` varchar(50) DEFAULT NULL COMMENT '按揭银行',
  `audit_state` enum('pass','authstr','failure') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `audit_remark` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`estate_id`),
  KEY `FK_t_member_estate_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_estate_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员房产表';

-- ----------------------------
-- Records of t_member_estate
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_finance`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_finance`;
CREATE TABLE `t_member_finance` (
  `member_id` varchar(32) NOT NULL DEFAULT '' COMMENT '会员Id',
  `ave_income` float(20,2) DEFAULT NULL COMMENT '月均收入',
  `ave_income_des` varchar(100) DEFAULT NULL COMMENT '收入构成描述',
  `ave_expenses` float(20,2) DEFAULT NULL COMMENT '月均支出',
  `age_expenses_des` varchar(100) DEFAULT NULL COMMENT '支出构成描述',
  `buy_estate` enum('havehouse','nohouse') DEFAULT NULL COMMENT '是否购房',
  `estate_value` float(20,2) DEFAULT NULL COMMENT '房产价值',
  `buy_car` enum('havecar','nocar') DEFAULT NULL COMMENT '是否购车',
  `car_value` float(20,2) DEFAULT NULL COMMENT '车辆价值',
  `car_auth` enum('authstr','pass','failure') DEFAULT NULL,
  `company_name` varchar(50) DEFAULT NULL COMMENT '参股企业名称',
  `companies_capital_con` varchar(50) DEFAULT NULL COMMENT '参股企业出资额',
  `other_assets_described` varchar(100) DEFAULT NULL COMMENT '其他资产描述',
  `first_united` varchar(10) DEFAULT NULL COMMENT '第一联保人',
  `first_united_contact` enum('family','friend','business') DEFAULT NULL COMMENT '第一联保人关系',
  `first_united_phone` varchar(20) DEFAULT NULL COMMENT '第一联保人电话',
  `second_united` varchar(10) DEFAULT NULL COMMENT '第二联保人',
  `second_contact` enum('family','friend','business') DEFAULT NULL COMMENT '第二联保人关系',
  `second_phone` varchar(20) DEFAULT NULL COMMENT '第二联保人电话',
  `estate_auth` enum('authstr','pass','failure') DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  KEY `FK_t_member_finance_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_finance_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员财务信息表';

-- ----------------------------
-- Records of t_member_finance
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_integral`;
CREATE TABLE `t_member_integral` (
  `member_integral_id` varchar(32) NOT NULL COMMENT '会员积分Id',
  `member_id` varchar(32) NOT NULL COMMENT '会员Id',
  `type` enum('login','borrow','withdraw','recharge','invest') DEFAULT NULL COMMENT '积分类型',
  `change_type` enum('increase','reduction') DEFAULT NULL,
  `change_value` int(10) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`member_integral_id`),
  KEY `FK_t_member_integral_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_integral_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员积分表';

-- ----------------------------
-- Records of t_member_integral
-- ----------------------------
INSERT INTO `t_member_integral` VALUES ('882d0575ebc426bdf00553e6c7c99ae9', '8ce2d4b7913aa2411870e30a48d46e49', 'recharge', 'increase', '10', '充值获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52');
INSERT INTO `t_member_integral` VALUES ('bde937977785b87bdd464daeecbeaebb', '4e71816a4e72e843e482629dda416d4d', 'login', 'increase', '2', '登录获得2积分', '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:20:25', '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:20:25');
INSERT INTO `t_member_integral` VALUES ('d07e77b30e82db3644ecdcf7f8ee0e4d', '4e71816a4e72e843e482629dda416d4d', 'recharge', 'increase', '10', '充值获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21');
INSERT INTO `t_member_integral` VALUES ('f592eacb1108bed24c529dd59f107513', '4e71816a4e72e843e482629dda416d4d', 'login', 'increase', '2', '登录获得2积分', '8b25651c2d896297530b64e4b80ec503', '2014-07-26 20:44:58', '8b25651c2d896297530b64e4b80ec503', '2014-07-26 20:44:58');

-- ----------------------------
-- Table structure for `t_member_message_notice`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_message_notice`;
CREATE TABLE `t_member_message_notice` (
  `message_notice_id` varchar(32) NOT NULL,
  `sender` varchar(32) DEFAULT NULL COMMENT '发信人',
  `addressee` varchar(32) DEFAULT NULL COMMENT '收信人',
  `title` varchar(50) DEFAULT NULL COMMENT '标题',
  `content` varchar(255) DEFAULT NULL COMMENT '内容',
  `sendTime` datetime DEFAULT NULL COMMENT '发送时间',
  `letterStatus` enum('read','unread','delete') DEFAULT NULL COMMENT '信件状态（已读，未读，删除）',
  `letterType` enum('notSystem','system') DEFAULT NULL COMMENT '信件类型（系统消息or非系统消息）',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `creater` varchar(32) DEFAULT NULL COMMENT '创建人',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`message_notice_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_message_notice
-- ----------------------------
INSERT INTO `t_member_message_notice` VALUES ('1f3a28e4b28ab62c1347600beec5dbb5', '8b25651c2d896297530b64e4b80ec503', '4e71816a4e72e843e482629dda416d4d', '会员申请额度审核通知', '您的申请额度金额为[10000.0]，审核状态:[通过],通过金额为[10000.0]', '2014-07-24 15:41:12', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:41:12', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:41:12');
INSERT INTO `t_member_message_notice` VALUES ('2366bce15e8fdfe10993a4bce1b3a311', '8b25651c2d896297530b64e4b80ec503', null, null, null, '2014-07-25 16:21:19', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:21:19', '8b25651c2d896297530b64e4b80ec503', '2014-07-25 16:21:19');
INSERT INTO `t_member_message_notice` VALUES ('25be4ab2cac2319b88d4b7fabf48d0b3', '8b25651c2d896297530b64e4b80ec503', '4e71816a4e72e843e482629dda416d4d', '充值信息', '尊敬的会员：song，您已成功充值￥40000.0元。', '2014-07-24 15:39:21', 'unread', 'system', '会员充值', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21');
INSERT INTO `t_member_message_notice` VALUES ('3bb04c784b9e6d327e09d64274adb68f', '8b25651c2d896297530b64e4b80ec503', '4e71816a4e72e843e482629dda416d4d', '邮箱认证审核通知', '您的邮箱认证审核状况:通过', '2014-07-24 15:38:45', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:38:45', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:38:45');
INSERT INTO `t_member_message_notice` VALUES ('707f5b0d2b6dc4c451dab4c4c87fa04c', '8b25651c2d896297530b64e4b80ec503', '8ce2d4b7913aa2411870e30a48d46e49', '会员申请额度审核通知', '您的申请额度金额为[10000.0]，审核状态:[通过],通过金额为[10000.0]', '2014-07-24 15:36:47', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:36:47', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:36:47');
INSERT INTO `t_member_message_notice` VALUES ('d3ec2da777f7198542d54ae20e6c9ee6', '8b25651c2d896297530b64e4b80ec503', '8ce2d4b7913aa2411870e30a48d46e49', '借钱买手机,初次审核通知', '借款初审审核通过', '2014-07-24 17:55:56', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:55:56', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:55:56');
INSERT INTO `t_member_message_notice` VALUES ('dcc086e8605e5aef3498e1543dc03aa0', '8b25651c2d896297530b64e4b80ec503', '8ce2d4b7913aa2411870e30a48d46e49', '充值信息', '尊敬的会员：zhangsan，您已成功充值￥45000.0元。', '2014-07-24 15:33:52', 'unread', 'system', '会员充值', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52');
INSERT INTO `t_member_message_notice` VALUES ('f50d01b55ad85e90c7fc52c3018e6dfa', '8b25651c2d896297530b64e4b80ec503', '8ce2d4b7913aa2411870e30a48d46e49', '邮箱认证审核通知', '您的邮箱认证审核状况:通过', '2014-07-24 15:33:11', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:11', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:11');

-- ----------------------------
-- Table structure for `t_member_secret_security`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_secret_security`;
CREATE TABLE `t_member_secret_security` (
  `secret_security_id` varchar(32) NOT NULL,
  `question_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `answer` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`secret_security_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_secret_security
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_statistics`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_statistics`;
CREATE TABLE `t_member_statistics` (
  `statistics_id` varchar(32) NOT NULL COMMENT '统计Id',
  `member_id` varchar(32) DEFAULT NULL COMMENT '会员Id',
  `total_borrowings` float(20,2) DEFAULT NULL COMMENT '借款总额',
  `cumulative_loss_profit` float(20,2) DEFAULT NULL COMMENT '累计亏盈',
  `already_total` float(20,2) DEFAULT NULL COMMENT '已还总额',
  `wait_also_total` float(20,2) DEFAULT NULL COMMENT '待还总额',
  `already_income_total` float(20,2) DEFAULT NULL COMMENT '已收总额',
  `wait_income_total` float(20,2) DEFAULT NULL COMMENT '待收总额',
  `already_principal` float(20,2) DEFAULT NULL COMMENT '已还本金',
  `wait_also_principal` float(20,2) DEFAULT NULL COMMENT '待还本金',
  `already_interest` float(20,2) DEFAULT NULL COMMENT '已还利息',
  `wait_also_interest` float(20,2) DEFAULT NULL COMMENT '待还利息',
  `already_income_principal` float(20,2) DEFAULT NULL COMMENT '已收本金',
  `wait_income_principal` float(20,2) DEFAULT NULL COMMENT '代收本金',
  `already_income_interest` float(20,2) DEFAULT NULL COMMENT '已收利息',
  `wait_income_interest` float(20,2) DEFAULT NULL COMMENT '待收利息',
  `overdue_fine_amount` float(20,2) DEFAULT NULL COMMENT '逾期罚款金额',
  `overdue_interest_amount` float(20,2) DEFAULT NULL COMMENT '逾期利息总额',
  `loan_management_amount` float(20,2) DEFAULT NULL COMMENT '借款管理费',
  `loan_interest_amount` float(20,2) DEFAULT NULL COMMENT ' 借款利息总额',
  `normal_repayment` int(10) DEFAULT NULL COMMENT '正常还款次数',
  `advance_repayment` int(10) DEFAULT NULL COMMENT '提前还款次数',
  `late_repayment` int(10) DEFAULT NULL COMMENT '逾期还款次数',
  `late` int(10) DEFAULT NULL COMMENT '迟还次数',
  `website_substitute` int(10) DEFAULT NULL COMMENT '网站代还次数',
  `investment_total` float(20,2) DEFAULT NULL COMMENT '投资总额',
  `tender_awards` float(20,2) DEFAULT NULL COMMENT '投标奖励',
  `promotion_awards` float(20,2) DEFAULT NULL COMMENT '推广奖励',
  `borrow_success` int(10) DEFAULT NULL COMMENT '借款成功次数',
  `upline_delta_awards` float(20,2) DEFAULT NULL COMMENT '线下冲值奖励',
  `continue_awards` float(20,2) DEFAULT NULL COMMENT '续投奖励',
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `success_tender` int(11) DEFAULT '0' COMMENT '成功投标次数',
  PRIMARY KEY (`statistics_id`),
  KEY `FK_t_member_statistics_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_statistics_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员借款投资统计';

-- ----------------------------
-- Records of t_member_statistics
-- ----------------------------
INSERT INTO `t_member_statistics` VALUES ('874f321b7ba35475ff92a391a28e6b6e', '8ce2d4b7913aa2411870e30a48d46e49', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0', '0', '0', '0', '0', '0.00', '0.00', '0.00', '0', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:11', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:33:52', '0');
INSERT INTO `t_member_statistics` VALUES ('ab010d9c3d8559f8967e5e01b88dd070', '4e71816a4e72e843e482629dda416d4d', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0.00', '0', '0', '0', '0', '0', '0.00', '0.00', '0.00', '0', '0.00', '0.00', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:38:45', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 15:39:21', '0');

-- ----------------------------
-- Table structure for `t_member_token`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_token`;
CREATE TABLE `t_member_token` (
  `member_id` varchar(32) NOT NULL COMMENT '会员Id和会员表一一对应',
  `username` varchar(30) DEFAULT NULL COMMENT '用户名',
  `password` varchar(64) DEFAULT NULL COMMENT '密码',
  `salt` varchar(50) DEFAULT NULL COMMENT '盐值',
  `traters_password` varchar(64) DEFAULT NULL COMMENT '交易密码',
  `traders_salt` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  KEY `FK_t_member_token_t_member_member_id` (`member_id`) USING BTREE,
  CONSTRAINT `FK_t_member_token_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_token
-- ----------------------------
INSERT INTO `t_member_token` VALUES ('4e71816a4e72e843e482629dda416d4d', 'song', '4defbf5cdef89e398b3b2e410badc31c2e2af950', '49d3db9251dc581d', '4defbf5cdef89e398b3b2e410badc31c2e2af950', '49d3db9251dc581d');
INSERT INTO `t_member_token` VALUES ('8ce2d4b7913aa2411870e30a48d46e49', 'zhangsan', '73f28d7e1979a015e47e6dcf7c7187865db52138', 'b06c055bd2f443c7', '73f28d7e1979a015e47e6dcf7c7187865db52138', 'b06c055bd2f443c7');

-- ----------------------------
-- Table structure for `t_member_vip`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_vip`;
CREATE TABLE `t_member_vip` (
  `vip_id` varchar(32) NOT NULL COMMENT 'VIPId',
  `member_id` varchar(32) NOT NULL COMMENT '会员Id',
  `vip_level` varchar(32) DEFAULT NULL COMMENT '等级',
  `vip_integral` int(10) DEFAULT NULL COMMENT '积分',
  `vip_start` datetime DEFAULT NULL,
  `vip_end` datetime DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`vip_id`),
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
  `unit_name` varchar(50) DEFAULT NULL,
  `unit_phone` varchar(20) DEFAULT NULL,
  `unit_adress` varchar(50) DEFAULT NULL,
  `work_age` int(2) DEFAULT NULL,
  `salary` float(20,2) DEFAULT NULL,
  `proof_person` varchar(20) DEFAULT NULL,
  `proof_phone` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  KEY `FK_t_member_work_t_member_member_id` (`member_id`),
  CONSTRAINT `FK_t_member_work_t_member_member_id` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会员工作资料表';

-- ----------------------------
-- Records of t_member_work
-- ----------------------------
INSERT INTO `t_member_work` VALUES ('4e71816a4e72e843e482629dda416d4d', '冰川软件公司', '3356884', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('8ce2d4b7913aa2411870e30a48d46e49', '冰川软件公司', '3356884', '', null, null, '', '');

-- ----------------------------
-- Table structure for `t_menu`
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu` (
  `menu_id` varchar(32) NOT NULL,
  `pid` varchar(32) DEFAULT NULL,
  `menu_en_name` varchar(30) DEFAULT NULL,
  `menu_cn_name` varchar(30) DEFAULT NULL,
  `icon_cls` varchar(50) DEFAULT NULL,
  `url` varchar(100) DEFAULT NULL,
  `order_num` int(10) unsigned DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`menu_id`),
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
INSERT INTO `t_menu` VALUES ('3775cc8c3044650697dbb4d8636b5464', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingOverdue', '流标借款', 'icon-standard-clock-red', '/do/borrowingLoan/borrowingOverdue.htm', '5', '');
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
INSERT INTO `t_menu` VALUES ('c5d4cae04f14f76eae54c0da51819af0', 'b67d550a506255816d54840a853b7a46', 'withdrawSet', '提现设置', 'icon-cologne-premium', '/do/withdrawSet/index.htm', '4', '');
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
  `opera_menu` varchar(255) DEFAULT NULL COMMENT '操作菜单',
  `opera_penal` varchar(255) DEFAULT NULL COMMENT '操作面板',
  `opera_method` varchar(255) DEFAULT NULL COMMENT '操作方法',
  `opera_result` varchar(255) DEFAULT NULL COMMENT '操作结果',
  `opera_desc` varchar(1000) DEFAULT NULL COMMENT '返回内容',
  `opera_class` varchar(255) DEFAULT NULL COMMENT '调用类',
  `opera_md` varchar(255) DEFAULT NULL COMMENT '调用方法',
  `opera_key` varchar(255) DEFAULT NULL COMMENT '操作KEY',
  `operator` varchar(32) DEFAULT NULL COMMENT '操作人',
  `opera_time` datetime DEFAULT NULL COMMENT '操作世间',
  PRIMARY KEY (`operalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_operalog
-- ----------------------------
INSERT INTO `t_operalog` VALUES ('0aca39478645fdbf8ca2d789300b6dae', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-07-24 17:36:44');
INSERT INTO `t_operalog` VALUES ('21c9723f36c415672df232d011e41827', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 13:53:40');
INSERT INTO `t_operalog` VALUES ('2451da74af47b1a600a5947cd90987c1', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-07-24 17:33:07');
INSERT INTO `t_operalog` VALUES ('2526c1af00694512b3fbb02ca39b2119', '基础参数', '基础参数列表', '修改', '1', '[罚息利率30天以上] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-14 17:23:25');
INSERT INTO `t_operalog` VALUES ('314ba64d91192a57e5651c368033f3d1', '还款方式', '还款方式列表', '修改', '1', '[按月付息，到期还本] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-07-22 15:51:37');
INSERT INTO `t_operalog` VALUES ('337304143ea1f5e89469c2f20b4631a0', '客服服务', '客服列表', '修改', '1', '[小东] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-07-26 21:12:40');
INSERT INTO `t_operalog` VALUES ('42819197ec44708eb9c936fb857692ac', '充值设置', '充值设置列表', '修改', '1', '[财务通] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '测试用户', '2014-07-14 13:45:56');
INSERT INTO `t_operalog` VALUES ('459f0b56026b95ad2fc32f30911f83d2', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 11:19:06');
INSERT INTO `t_operalog` VALUES ('47f6d95c8458b520a1733d205d2dde13', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-07-24 17:33:02');
INSERT INTO `t_operalog` VALUES ('4c0b567255dbe056020563854ae6dab6', '管理员设置', '管理员列表', '删除', '0', '选中第<font style=\'color:red;font-weight: bold;\'>【1】</font>行数据与【登录日志管理】存在<font style=\'color:red;font-weight: bold;\'>【2】</font>条依赖关系,须先删除【登录日志管理】中<font style=\'color:red;font-weight: bold;\'>【2】</font>条依赖数据', 'com.glacier.netloan.service.system.UserService', 'delUser', 'UserList_del', '超级管理员', '2014-07-15 15:36:11');
INSERT INTO `t_operalog` VALUES ('4dc8d15b58c4daad02fb2ed4fcc19e13', '充值记录', '充值列表', '审核', '1', '[充值_201407081333] 会员充值记录信息已审核', 'com.glacier.netloan.service.finance.FinanceRechargeService', 'auditRecharge', 'RechargeList_audit', '超级管理员', '2014-07-08 13:36:29');
INSERT INTO `t_operalog` VALUES ('57b7599f4dd07a12d0bdb531d61f0abb', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-07-22 15:51:31');
INSERT INTO `t_operalog` VALUES ('5d6ed238802bd0c2d24d82e947950176', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-07-24 17:32:19');
INSERT INTO `t_operalog` VALUES ('636a1f0d23e9d65bfa730c9bc4bc4ab8', '标种类型', '标种类型列表', '修改', '1', '[抵押标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-07-24 17:37:35');
INSERT INTO `t_operalog` VALUES ('69e34343e750fca5786dd231f062b4a8', '客服服务', '客服列表', '修改', '1', '[小夏] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-07-14 13:55:02');
INSERT INTO `t_operalog` VALUES ('6a5378825da5c6feb82b244f8c927534', '角色管理', '角色列表', '授权', '0', '权限信息更新失败', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 11:19:26');
INSERT INTO `t_operalog` VALUES ('6cfd0d203b238f2603459302887cd55c', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 13:44:34');
INSERT INTO `t_operalog` VALUES ('6f59ab4b613f956b20c01e148dede373', '角色管理', '角色列表', '授权', '0', '权限信息更新失败', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 11:18:52');
INSERT INTO `t_operalog` VALUES ('75bd1f39f12f7426763b887e597ac280', '资源管理', '操作列表', '增加', '1', '[生成报表] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-07-25 18:02:36');
INSERT INTO `t_operalog` VALUES ('783680f78d1770949a88af53190c1ccd', '基础参数', '基础参数列表', '修改', '1', '[逾期管理费30天以上] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-14 17:23:14');
INSERT INTO `t_operalog` VALUES ('8edede9b68925bb4dc967c0240366fd6', '客服服务', '客服列表', '修改', '1', '[小东] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-07-14 13:54:33');
INSERT INTO `t_operalog` VALUES ('8f89bc5895c01d4659205eaceb204b6b', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 11:07:23');
INSERT INTO `t_operalog` VALUES ('91f051f260f2b6fa15d18b7daeab0c69', '管理员设置', '管理员列表', '删除', '0', '选中第<font style=\'color:red;font-weight: bold;\'>【1】</font>行数据与【角色管理】存在<font style=\'color:red;font-weight: bold;\'>【2】</font>条依赖关系,与【登录日志管理】存在<font style=\'color:red;font-weight: bold;\'>【11】</font>依赖关系,须先删除【角色管理】中<font style=\'color:red;font-weight: bold;\'>【2】</font>条依赖数据,再删除【登录日志管理】<font style=\'color:red;font-weight: bold;\'>【11】</font>条依赖数据', 'com.glacier.netloan.service.system.UserService', 'delUser', 'UserList_del', '超级管理员', '2014-07-15 15:31:55');
INSERT INTO `t_operalog` VALUES ('99eb27441299dfd4f13d7113e6ade7fb', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-07-24 17:35:33');
INSERT INTO `t_operalog` VALUES ('9bf5caf97de0acb291ac17a0a198ea6b', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-07-17 10:55:23');
INSERT INTO `t_operalog` VALUES ('a026c31b271c5e2a53c6a93a10490d84', '基础参数', '基础参数列表', '修改', '1', '[逾期管理费1至30天] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-24 17:27:04');
INSERT INTO `t_operalog` VALUES ('a15ae4f7d56a3bb8efc86f0255508cb3', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-25 18:02:59');
INSERT INTO `t_operalog` VALUES ('a49b5d150c53299f263b11721c1f12a2', '标种类型', '标种类型列表', '修改', '1', '[流转标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-07-17 10:55:31');
INSERT INTO `t_operalog` VALUES ('a786832bc5b7180813c597f4d34216e3', '标种类型', '标种类型列表', '修改', '1', '[抵押标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-07-24 17:37:00');
INSERT INTO `t_operalog` VALUES ('ae8fae535b8a9499a82d8b45dd3f8aad', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 13:39:33');
INSERT INTO `t_operalog` VALUES ('aff29a04097631cf85478d849f6b4737', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 13:37:02');
INSERT INTO `t_operalog` VALUES ('b00e184c78723edeeff61e9f528f28e5', '客服服务', '客服列表', '修改', '1', '[超哥] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-07-14 13:54:53');
INSERT INTO `t_operalog` VALUES ('b38b1a469c3332bca348976f5cab4339', '会员银行卡', '银行卡列表', '审核', '1', '会员银行卡审核成功', 'com.glacier.netloan.service.finance.FinanceBankCardService', 'auditApplyAmount', 'bankCardList_audit', '超级管理员', '2014-07-25 16:21:19');
INSERT INTO `t_operalog` VALUES ('b6dc10532c1ac4e7081f13a3f9a3b864', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-07-24 17:32:48');
INSERT INTO `t_operalog` VALUES ('b98fd824bede4a8892a5502796f4014d', '管理员设置', '管理员列表', '增加', '1', '[adminTest]管理员信息已保存', 'com.glacier.netloan.service.system.UserService', 'addUser', 'UserList_add', '超级管理员', '2014-07-14 13:40:42');
INSERT INTO `t_operalog` VALUES ('bead73d57301875a2b7e75440dfcfdbb', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 13:53:34');
INSERT INTO `t_operalog` VALUES ('c64ec16e6ceab6d6f11e368137e73e29', '充值设置', '充值设置列表', '修改', '1', '[支付宝] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '测试用户', '2014-07-14 13:46:04');
INSERT INTO `t_operalog` VALUES ('c70342a868ad9cff6d0ac9cf583bbf3c', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-07-24 17:33:23');
INSERT INTO `t_operalog` VALUES ('cea747eb888ae80a33876986bb82ac00', '角色管理', '角色列表', '授权', '0', '权限信息更新失败', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-07-14 11:18:59');
INSERT INTO `t_operalog` VALUES ('d1906969013beb551b86bc78e6e1fb28', '资源管理', '菜单树', '修改', '1', '[流标借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-07-15 15:37:17');
INSERT INTO `t_operalog` VALUES ('da52383b1243abac39e64aab69841388', '基础参数', '基础参数列表', '修改', '1', '[罚息利率30天以上] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-24 17:27:24');
INSERT INTO `t_operalog` VALUES ('db116785374056d44b8c54effbd409c6', '客服服务', '客服列表', '修改', '1', '[小杰] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-07-14 13:54:25');
INSERT INTO `t_operalog` VALUES ('e281f00cc033ea559cc6d32f71ad406e', '基础参数', '基础参数列表', '修改', '1', '[罚息利率1至30天] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-24 17:27:35');
INSERT INTO `t_operalog` VALUES ('e638586303687a6d831afb0146fcc7fd', '基础参数', '基础参数列表', '修改', '1', '[逾期管理费1至30天] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-14 17:23:21');
INSERT INTO `t_operalog` VALUES ('ea2f958feb3a8d2225e41f0298c9531b', '客服服务', '客服列表', '修改', '1', '[小杰] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-07-14 13:54:20');
INSERT INTO `t_operalog` VALUES ('efcd32ec564f2901548ba4e85c3cb014', '基础参数', '基础参数列表', '修改', '1', '[逾期管理费30天以上] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-24 17:26:52');
INSERT INTO `t_operalog` VALUES ('f4edab1676315fba9066d3a72c1f2b54', '基础参数', '基础参数列表', '修改', '1', '[罚息利率1至30天] 基础参数信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterBasicService', 'editParameterBasic', 'ParameterBasicList_edit', '超级管理员', '2014-07-14 17:23:31');
INSERT INTO `t_operalog` VALUES ('fce00c2398ac6df303cae4d281b6743b', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-07-24 17:35:48');

-- ----------------------------
-- Table structure for `t_overdue_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_overdue_notes`;
CREATE TABLE `t_overdue_notes` (
  `overdue_notes_id` varchar(32) NOT NULL,
  `repay_notes_detail_id` varchar(32) DEFAULT NULL,
  `overdue_result` varchar(255) DEFAULT NULL,
  `name_remark` varchar(20) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`overdue_notes_id`),
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
  `menu_id` varchar(32) DEFAULT NULL,
  `panel_cn_name` varchar(50) DEFAULT NULL,
  `panel_en_name` varchar(50) DEFAULT NULL,
  `order_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`panel_id`)
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
INSERT INTO `t_panel` VALUES ('92e73869674d4c3f6b0c9e904bf03edf', 'c5d4cae04f14f76eae54c0da51819af0', '提现设置列表', 'WithdrawSetList', '1');
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
  `age_name` varchar(50) DEFAULT NULL,
  `age_begin` int(20) DEFAULT NULL,
  `age_end` int(20) DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `age_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`age_id`)
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
  `area_pid` varchar(32) DEFAULT NULL,
  `area_name` varchar(20) DEFAULT NULL,
  `area_subsite` enum('subsite1','subsite0') DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `area_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`area_id`)
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
  `basic_id` varchar(32) NOT NULL DEFAULT '',
  `basic_title` varchar(100) DEFAULT NULL,
  `basic_value` varchar(100) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`basic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter_basic
-- ----------------------------
INSERT INTO `t_parameter_basic` VALUES ('42d7a714a87b0219e1e3aca7579e944c', '罚息利率30天以上', '0.003', '罚息利率30天以上', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:57:51', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:27:24');
INSERT INTO `t_parameter_basic` VALUES ('608eced480dd680a4e8d4903b6aabae9', '罚息利率1至30天', '0.002', '罚息利率1至30天', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:57:31', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:27:35');
INSERT INTO `t_parameter_basic` VALUES ('7ec6569718a58dfc0fbddcd6ab0ec1a4', '逾期管理费30天以上', '0.008', '逾期管理费30天以上', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:58:26', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:26:52');
INSERT INTO `t_parameter_basic` VALUES ('a8b38ae7742573a931f5efa8000562bc', '利息管理费', '0.01', '利息管理费', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 13:07:57', '8b25651c2d896297530b64e4b80ec503', '2014-06-30 13:07:57');
INSERT INTO `t_parameter_basic` VALUES ('b401347a8d5c6ab8a29f4ee4ebaa9b73', '逾期管理费1至30天', '0.005', '逾期管理费1至30天', '8b25651c2d896297530b64e4b80ec503', '2014-05-30 16:58:07', '8b25651c2d896297530b64e4b80ec503', '2014-07-24 17:27:04');

-- ----------------------------
-- Table structure for `t_parameter_credit`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_credit`;
CREATE TABLE `t_parameter_credit` (
  `credit_id` varchar(32) NOT NULL,
  `credit_name` varchar(50) DEFAULT NULL,
  `credit_begin_integral` int(20) DEFAULT NULL,
  `credit_end_integral` int(20) DEFAULT NULL,
  `credit_photo` varchar(100) DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `credit_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`credit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的基础资料下的会员信用级别设置。';

-- ----------------------------
-- Records of t_parameter_credit
-- ----------------------------
INSERT INTO `t_parameter_credit` VALUES ('125s754157cf483a790f4eea35200118', '一级', '0', '30', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140331/20140331102433_822.jpg', null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:24:35');
INSERT INTO `t_parameter_credit` VALUES ('2545745dsfsd4gsd5gs5dg8gsd54gyt', '二级', '30', '49', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140331/20140331102506_417.jpg', null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:08');
INSERT INTO `t_parameter_credit` VALUES ('354sdf454dsg54j5ytktku4y5u5ege5r', '三级', '50', '69', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140331/20140331102514_717.jpg', null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:16');
INSERT INTO `t_parameter_credit` VALUES ('457df5a5hrstj4tyk5je54g6er4g64g5', '四级', '70', '79', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140331/20140331102522_820.jpg', null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:23');
INSERT INTO `t_parameter_credit` VALUES ('61fdf9ebb768d72633fa24183317d878', '七级', '100', '1000', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140331/20140331102544_840.jpg', null, '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:45');
INSERT INTO `t_parameter_credit` VALUES ('8161cd132ff0ae30e96ccf1ad2ab1f9f', '六级', '90', '99', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140331/20140331102537_496.jpg', null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:39');
INSERT INTO `t_parameter_credit` VALUES ('9074203d753243f8be823ac411f6adc0', '五级', '80', '89', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140331/20140331102529_603.jpg', null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-19 09:19:22', '8b25651c2d896297530b64e4b80ec503', '2014-03-31 10:25:31');

-- ----------------------------
-- Table structure for `t_parameter_credit_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_credit_type`;
CREATE TABLE `t_parameter_credit_type` (
  `credit_type_id` varchar(32) NOT NULL,
  `credit_type` varchar(50) DEFAULT NULL,
  `change_type` enum('reduction','increase') DEFAULT NULL,
  `change_value` int(10) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`credit_type_id`)
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
  `integral_name` varchar(50) DEFAULT NULL,
  `integral_begin` int(20) DEFAULT NULL,
  `integral_end` int(20) DEFAULT NULL,
  `integral_photo` varchar(50) DEFAULT NULL,
  `integral_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`integral_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='参数设置的会员积分设置。';

-- ----------------------------
-- Records of t_parameter_integral
-- ----------------------------
INSERT INTO `t_parameter_integral` VALUES ('dcf785c13dabfeac6dc6ee0c610607b0', '三级积分', '101', '500', null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:35:39', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:25:27');
INSERT INTO `t_parameter_integral` VALUES ('er80884c5e6c1e94ee70cc833aa1c587', '一级积分', '0', '50', null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-07-07 10:26:24', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:25:38');
INSERT INTO `t_parameter_integral` VALUES ('gfd0884c5e6c1e94ee70cc833aa1c277', '二级积分', '51', '100', null, '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:26:27', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:26:47');

-- ----------------------------
-- Table structure for `t_parameter_integral_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_integral_type`;
CREATE TABLE `t_parameter_integral_type` (
  `integral_type_id` varchar(32) NOT NULL,
  `integral_type` varchar(50) DEFAULT NULL,
  `change_type` enum('increase','reduction') DEFAULT NULL,
  `change_value` int(10) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`integral_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_parameter_integral_type
-- ----------------------------
INSERT INTO `t_parameter_integral_type` VALUES ('3b51171c0de5e973a51dff7f7eeab187', 'login', 'increase', '2', '登录获得2积分', '8b25651c2d896297530b64e4b80ec503', '2014-07-01 17:04:27', '8b25651c2d896297530b64e4b80ec503', '2014-07-01 17:04:27');
INSERT INTO `t_parameter_integral_type` VALUES ('465sdaf46sd4f6', 'borrow', 'increase', '10', '借款获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-25 15:37:38', '8b25651c2d896297530b64e4b80ec503', '2014-06-25 15:37:40');
INSERT INTO `t_parameter_integral_type` VALUES ('d307a2bd62deb8c65be762ef27ceda30', 'withdraw', 'increase', '5', '提现获得5积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:41:09', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:41:09');
INSERT INTO `t_parameter_integral_type` VALUES ('d52e414663c9b191c43b4407fb76234a', 'invest', 'increase', '10', '投资获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:44:41', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:44:41');
INSERT INTO `t_parameter_integral_type` VALUES ('dd0b121fdd5c4aca2b38f5b41bfc355c', 'recharge', 'increase', '10', '充值获得10积分', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:40:39', '8b25651c2d896297530b64e4b80ec503', '2014-06-27 17:40:39');

-- ----------------------------
-- Table structure for `t_parameter_optgroup`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup`;
CREATE TABLE `t_parameter_optgroup` (
  `optgroup_id` varchar(32) NOT NULL,
  `optgroup_pid` varchar(32) DEFAULT NULL,
  `optgroup_code` varchar(50) DEFAULT NULL,
  `optgroup_name` varchar(50) DEFAULT NULL,
  `optgroup_icon` varchar(50) DEFAULT NULL,
  `optgroup_url` varchar(50) DEFAULT NULL,
  `optgroup_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`optgroup_id`)
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
  `optgroup_id` varchar(32) DEFAULT NULL,
  `optgroup_value_code` varchar(50) DEFAULT NULL,
  `optgroup_value_name` varchar(50) DEFAULT NULL,
  `status` enum('enable','disable') DEFAULT NULL,
  `optgroup_value_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`optgroup_value_id`),
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
  `question_des` varchar(255) DEFAULT NULL,
  `question_num` int(10) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`question_id`)
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
  `specification` varchar(50) DEFAULT NULL COMMENT '参数说明',
  `input_tip` varchar(50) DEFAULT NULL COMMENT '输入提示',
  `parameter_values` varchar(50) DEFAULT NULL COMMENT '参数值',
  `variable_name` varchar(50) DEFAULT NULL COMMENT '变量名',
  `form_type` enum('input','textarea') DEFAULT NULL COMMENT '表单类型',
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`variables_id`)
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
  `tender_notes_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL COMMENT '收款人',
  `receivables_total` float(20,2) DEFAULT NULL COMMENT '收款总金额',
  `should_rece_money` float(20,2) DEFAULT NULL COMMENT '应收本息',
  `alr_rece_money` float(20,2) DEFAULT NULL COMMENT '已收本息',
  `not_rece_money` float(20,2) DEFAULT NULL COMMENT '未收本息',
  `should_rece_principal` float(20,2) DEFAULT NULL COMMENT '应收本金',
  `alr_rece_principal` float(20,2) DEFAULT NULL COMMENT '已收本金',
  `not_rece_principal` float(20,2) DEFAULT NULL COMMENT '未收本金',
  `should_rece_interest` float(20,2) DEFAULT NULL COMMENT '应收利息',
  `alr_rece_interest` float(20,2) DEFAULT NULL COMMENT '已收利息',
  `not_rece_interest` float(20,2) DEFAULT NULL COMMENT '未收利息',
  `alr_overdue_interest` float(20,2) DEFAULT NULL,
  `rece_state` enum('receiving','Receivables') DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `interest_mana_fee` float(20,2) DEFAULT NULL COMMENT '利息管理费',
  `income` float(20,2) DEFAULT NULL COMMENT '收益',
  PRIMARY KEY (`rece_notes_id`),
  KEY `FK_FK_t_receivables_notes_t_tender_notes_tender_notes_id` (`tender_notes_id`),
  CONSTRAINT `t_receivables_notes_ibfk_1` FOREIGN KEY (`tender_notes_id`) REFERENCES `t_tender_notes` (`tender_notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_receivables_notes
-- ----------------------------

-- ----------------------------
-- Table structure for `t_receivables_notes_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_receivables_notes_detail`;
CREATE TABLE `t_receivables_notes_detail` (
  `rece_notes_detail_id` varchar(32) NOT NULL,
  `rece_notes_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `alr_rece_money` float(20,2) DEFAULT NULL,
  `number_period` varchar(32) DEFAULT NULL,
  `should_rece_date` datetime DEFAULT NULL,
  `actual_rece_date` datetime DEFAULT NULL,
  `current_rece_moeny` float(20,2) DEFAULT NULL,
  `current_rece_principal` float(20,2) DEFAULT NULL,
  `current_rece_interest` float(20,2) DEFAULT NULL,
  `surplus_principal` float(20,2) DEFAULT NULL,
  `interest_mana_fee` float(20,2) DEFAULT NULL,
  `is_overdue` enum('no','yes') DEFAULT NULL,
  `overdue_interest` float(20,2) DEFAULT NULL,
  `overdue_days` float(20,2) DEFAULT NULL,
  `income` float(20,2) DEFAULT NULL,
  `amount` float(20,2) DEFAULT NULL COMMENT '总金额',
  `rece_state` enum('notReceiving','alreadReceivables') DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`rece_notes_detail_id`),
  KEY `FK_t_receivables_notes_detail_t_receivables_notes_rece_notes_id` (`rece_notes_id`),
  CONSTRAINT `t_receivables_notes_detail_ibfk_1` FOREIGN KEY (`rece_notes_id`) REFERENCES `t_receivables_notes` (`rece_notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_receivables_notes_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_repayment_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_notes`;
CREATE TABLE `t_repayment_notes` (
  `repay_notes_id` varchar(32) NOT NULL DEFAULT '',
  `loan_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL COMMENT '还款人',
  `repayment_total` float(20,2) DEFAULT NULL,
  `should_pay_money` float(20,2) DEFAULT NULL,
  `alr_pay_money` float(20,2) DEFAULT NULL,
  `not_pay_money` float(20,2) DEFAULT NULL,
  `should_pay_principal` float(20,2) DEFAULT NULL COMMENT '应还本金',
  `alr_pay_principal` float(20,2) DEFAULT NULL COMMENT '已还本金',
  `not_pay_principal` float(20,2) DEFAULT NULL COMMENT '未还本金',
  `should_pay_interest` float(20,2) DEFAULT NULL COMMENT '应还利息',
  `alr_pay_interest` float(20,2) DEFAULT NULL COMMENT '已还利息',
  `not_pay_interest` float(20,2) DEFAULT NULL COMMENT '未还利息',
  `alr_overdue_interest` float(20,2) DEFAULT NULL,
  `alr_overdue_urge` float(20,2) DEFAULT NULL,
  `alr_overdue_mana` float(20,2) DEFAULT NULL,
  `repay_state` enum('repaying','alreadRepay') DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`repay_notes_id`),
  KEY `FK_t_repayment_notes_t_borrowing_loan_loan_id` (`loan_id`),
  CONSTRAINT `t_repayment_notes_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `t_borrowing_loan` (`loan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repayment_notes
-- ----------------------------

-- ----------------------------
-- Table structure for `t_repayment_notes_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_notes_detail`;
CREATE TABLE `t_repayment_notes_detail` (
  `repay_notes_detail_id` varchar(32) NOT NULL,
  `repay_notes_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL COMMENT '还款人',
  `number_period` float(20,2) DEFAULT NULL,
  `should_pay_date` datetime DEFAULT NULL,
  `actual_pay_date` datetime DEFAULT NULL,
  `current_pay_moeny` float(20,2) DEFAULT NULL,
  `current_pay_principal` float(20,2) DEFAULT NULL,
  `current_pay_interest` float(20,2) DEFAULT NULL,
  `actual_pay_money` float(20,2) DEFAULT NULL,
  `also_need_money` float(20,2) DEFAULT NULL COMMENT '总还款金额',
  `overdue_interest` float(20,2) DEFAULT NULL,
  `overdue_urge_fee` float(20,2) DEFAULT NULL,
  `overdue_mana_fee` float(20,2) DEFAULT NULL,
  `overdue_days` varchar(32) DEFAULT NULL,
  `is_overdue` enum('no','yes') DEFAULT NULL,
  `is_advances` enum('no','yes') DEFAULT NULL,
  `repay_state` enum('notRepay','alreadRepay') DEFAULT NULL,
  `remark` varchar(32) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`repay_notes_detail_id`),
  KEY `FK_t_repayment_notes_t_repayment_notes_detail_repay_notes_id` (`repay_notes_id`),
  CONSTRAINT `t_repayment_notes_detail_ibfk_1` FOREIGN KEY (`repay_notes_id`) REFERENCES `t_repayment_notes` (`repay_notes_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repayment_notes_detail
-- ----------------------------

-- ----------------------------
-- Table structure for `t_repayment_type`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_type`;
CREATE TABLE `t_repayment_type` (
  `repayment_type_id` varchar(32) NOT NULL,
  `repayment_type_name` varchar(30) DEFAULT NULL,
  `algorithm_info` varchar(50) DEFAULT NULL,
  `state` enum('open','close') DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`repayment_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_repayment_type
-- ----------------------------
INSERT INTO `t_repayment_type` VALUES ('1873eeaa00e9e544c759595ffb98ab06', '一次性还款', '到期还本付息   ', 'open', '到期还本付息   ', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 13:37:28', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 14:05:57');
INSERT INTO `t_repayment_type` VALUES ('60d13359890d7edfe536ce87af02d6e5', '等额本息', '贷款本金×月利率×（1+月利率）还款月数/[（1+月利率）还款月数-1]', 'open', '额本息还款法是一种被广泛采用的还款方式。在还款期内，每月偿还同等数额的借款(包括本金和利息)。借款人每月还款额中的本金比重逐月递增、利息比重逐月递减。', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:18:03', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 14:06:09');
INSERT INTO `t_repayment_type` VALUES ('e444483d3b503b99d7572d2008e5b099', '按月付息，到期还本', '按月付息，到期还本', 'open', '按月付息，到期还本', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:18:27', '8b25651c2d896297530b64e4b80ec503', '2014-07-22 15:51:37');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` varchar(32) NOT NULL,
  `role_en_name` varchar(25) NOT NULL,
  `role_cn_name` varchar(25) DEFAULT NULL,
  `builtin` varchar(10) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'TEST', '测试角色', 'custom', '测试角色', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 00:00:00');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'admin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16 02:58:58');

-- ----------------------------
-- Table structure for `t_tender_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_tender_notes`;
CREATE TABLE `t_tender_notes` (
  `tender_notes_id` varchar(32) NOT NULL,
  `loan_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL COMMENT '���ID',
  `sub_sum` float(20,2) DEFAULT NULL,
  `tender_money` float(20,2) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`tender_notes_id`),
  KEY `FK_t_tender_notes_t_borrowing_loan_loan_id` (`loan_id`),
  CONSTRAINT `t_tender_notes_ibfk_1` FOREIGN KEY (`loan_id`) REFERENCES `t_borrowing_loan` (`loan_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_tender_notes
-- ----------------------------
INSERT INTO `t_tender_notes` VALUES ('3f31abe9cc20aa225ce24e6d5ce08ee6', 'd1f348f1c7cdd64635b368daea150801', '4e71816a4e72e843e482629dda416d4d', '1.00', '0.00', null, '4e71816a4e72e843e482629dda416d4d', '2014-07-26 21:07:28', null, null);

-- ----------------------------
-- Table structure for `t_tender_repayment`
-- ----------------------------
DROP TABLE IF EXISTS `t_tender_repayment`;
CREATE TABLE `t_tender_repayment` (
  `repayment_type_id` varchar(32) NOT NULL,
  `loan_tender_id` varchar(32) NOT NULL,
  PRIMARY KEY (`repayment_type_id`,`loan_tender_id`),
  KEY `FK_t_tender_repayment_t_repayment_type_repayment_type_id` (`repayment_type_id`),
  KEY `t_tender_repayment_t_loan_tender_loan_tender_id` (`loan_tender_id`),
  CONSTRAINT `t_tender_repayment_ibfk_1` FOREIGN KEY (`loan_tender_id`) REFERENCES `t_loan_tender` (`loan_tender_id`),
  CONSTRAINT `t_tender_repayment_ibfk_2` FOREIGN KEY (`repayment_type_id`) REFERENCES `t_repayment_type` (`repayment_type_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_tender_repayment
-- ----------------------------
INSERT INTO `t_tender_repayment` VALUES ('1873eeaa00e9e544c759595ffb98ab06', '2587bd0ecc859e35f2874f2aff0d4852');
INSERT INTO `t_tender_repayment` VALUES ('60d13359890d7edfe536ce87af02d6e5', '1c362eac7ec315aa47ab84360d4e390d');
INSERT INTO `t_tender_repayment` VALUES ('60d13359890d7edfe536ce87af02d6e5', '9788195653f335695256551b82fcbac6');
INSERT INTO `t_tender_repayment` VALUES ('60d13359890d7edfe536ce87af02d6e5', 'aa09e227a4a40cb6cb15703b98522672');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', '9788195653f335695256551b82fcbac6');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', 'aa09e227a4a40cb6cb15703b98522672');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` varchar(32) NOT NULL,
  `username` varchar(20) NOT NULL,
  `user_cn_name` varchar(50) DEFAULT NULL,
  `password` varchar(64) NOT NULL,
  `salt` varchar(50) DEFAULT NULL,
  `status` enum('disable','enable') NOT NULL,
  `builtin` enum('custom','builtin','admin') NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `user_image` varchar(50) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  `last_login_ip_address` varchar(150) DEFAULT NULL,
  `login_count` int(10) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2014-07-26 21:00:37', '183.33.212.37[中国 广东省 珠海市 电信]', '916', '8b25651c2d896297530b64e4b80ec503', '2014-02-27 02:58:02');
INSERT INTO `t_user` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', 'adminTest', '测试用户', 'd7d62bc0a343ffea509247f1a7c92120e762771d', 'baaa252597ec918e', 'enable', 'custom', 'adminTest@163.com', null, '客户、测试使用账号', '2014-07-14 14:08:47', '127.0.0.1[本地]', '2', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:40:42');

-- ----------------------------
-- Table structure for `t_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `user_id` varchar(32) NOT NULL COMMENT '用户id',
  `role_id` varchar(32) NOT NULL COMMENT '角色Id',
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FK_t_user_role2` (`role_id`),
  CONSTRAINT `FK_t_user_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`),
  CONSTRAINT `FK_t_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='用户角色表';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('d6dc13121742a3b331dcb6f93d4f4bce', '56078492e2eed9eb33f32c3af54a8e3f');
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', 'c87dd7161dbf8777c41b8cbfaa985db4');

-- ----------------------------
-- Table structure for `t_user_setting`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_setting`;
CREATE TABLE `t_user_setting` (
  `user_id` varchar(32) NOT NULL,
  `set_key` varchar(50) DEFAULT NULL,
  `set_name` varchar(50) DEFAULT NULL,
  `set_value` varchar(255) DEFAULT NULL,
  `set_description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`user_id`),
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
  `web_adv_theme` varchar(100) DEFAULT NULL,
  `web_adv_content` text,
  `web_adv_status` enum('enable','disable') DEFAULT NULL COMMENT 'dsafsdafasdfd',
  `clicks` int(11) DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `web_adv_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_adv_id`)
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
  `web_ann_theme` varchar(100) DEFAULT NULL,
  `web_ann_content` text,
  `web_ann_status` enum('enable','disable') DEFAULT NULL COMMENT 'dsafsdafasdfd',
  `clicks` int(11) DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `web_ann_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_ann_id`)
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
  `web_help_theme` varchar(100) DEFAULT NULL,
  `web_help_content` text,
  `web_help_type` enum('borrow','invest','fund') DEFAULT NULL,
  `web_help_status` enum('enable','disable') DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `web_cla_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_help_id`)
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
  `web_hiring_theme` varchar(100) DEFAULT NULL,
  `web_hiring_content` text,
  `web_hiring_status` enum('enable','disable') DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `web_hiring_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_hiring_id`)
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
  `web_link_name` varchar(100) DEFAULT NULL,
  `web_link_url` varchar(100) DEFAULT NULL,
  `web_link_photo` varchar(100) DEFAULT NULL,
  `web_link_status` enum('enable','disable') DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `web_link_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_link_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的友情链接表。';

-- ----------------------------
-- Records of t_website_link
-- ----------------------------
INSERT INTO `t_website_link` VALUES ('4fc1c2b44ceb087b3fc4faf4831a9f20', '中移电子商务有限公司', 'www.zhongyidianzi.com', 'C://photo', 'enable', null, '3', '中移电子商务有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:55', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:34:00');
INSERT INTO `t_website_link` VALUES ('63070b421c95338eedbca0127e8b382d', '百度一下', 'www.baidu.com', 'C://photo', 'enable', null, '2', '百度一下', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:32:21', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:34:04');
INSERT INTO `t_website_link` VALUES ('cc4342755eb8ee1d5d106188a44745a3', '宝付网络科技（上海）有限公司', 'www.zhifubao.com', 'C://photo', 'enable', null, '4', '宝付网络科技（上海）有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:16', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:33:54');
INSERT INTO `t_website_link` VALUES ('cf384296b4cc0904afd6f152752362eb', '冰川软件', 'www.gracier.com', 'C://photo', 'enable', null, '1', '冰川软件', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:31:02', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:34:09');
INSERT INTO `t_website_link` VALUES ('e13efd6adffe6fa43b589c1f07779bd1', '迅付信息科技有限公司', 'www.xufuxinxi.com', 'C://photo', 'enable', null, '5', '迅付信息科技有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:37', '8b25651c2d896297530b64e4b80ec503', '2014-07-08 10:33:43');

-- ----------------------------
-- Table structure for `t_website_nav`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_nav`;
CREATE TABLE `t_website_nav` (
  `web_nav_id` varchar(32) NOT NULL,
  `web_nav_pid` varchar(32) DEFAULT NULL,
  `web_nav_name` varchar(100) DEFAULT NULL,
  `web_nav_url` varchar(100) DEFAULT NULL,
  `web_nav_status` enum('enable','disable') DEFAULT NULL,
  `web_nav_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_nav_id`)
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
  `web_news_theme` varchar(100) DEFAULT NULL,
  `web_news_content` text,
  `web_news_status` enum('enable','disable') DEFAULT NULL,
  `web_news_num` int(11) DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_news_id`)
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
  `web_service_name` varchar(100) DEFAULT NULL,
  `web_service_qq` varchar(100) DEFAULT NULL,
  `web_service_photo` varchar(100) DEFAULT NULL,
  `web_service_status` enum('enable','disable') DEFAULT NULL,
  `accessory` varchar(255) DEFAULT NULL,
  `web_service_num` int(11) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`web_service_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='前台设置的客服管理表。';

-- ----------------------------
-- Records of t_website_service
-- ----------------------------
INSERT INTO `t_website_service` VALUES ('5b09aad291adf5a4c6f4be3c6b3a195c', '超哥', '406592176', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135452_164.jpg', 'enable', '', '2', '前台', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:47', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:54:53');
INSERT INTO `t_website_service` VALUES ('9709efd442475ce555cfeeb3f26294ab', '小杰', '1203807137', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135419_328.jpg', 'enable', '', '4', '售后', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:37', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:54:25');
INSERT INTO `t_website_service` VALUES ('f94e462f10af076f92459eff090968ab', '小夏', '920339213', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135502_288.jpg', 'enable', '', '1', '前台\r\n', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:45:04', '8b25651c2d896297530b64e4b80ec503', '2014-07-14 13:55:02');
INSERT INTO `t_website_service` VALUES ('fbb3e704f860029e3be51a0b8501e37f', '小东', '985776597', 'http://bdmu.v068041.10000net.cn/netloan/resources/upload/image/20140714/20140714135432_643.jpg', 'enable', '3', '3', '后台', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:46:08', '8b25651c2d896297530b64e4b80ec503', '2014-07-26 21:12:40');
