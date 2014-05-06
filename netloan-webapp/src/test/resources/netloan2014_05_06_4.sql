/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-05-06 14:29:12
*/

SET FOREIGN_KEY_CHECKS=0;

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
INSERT INTO `t_action` VALUES ('02e8e7c29c545810f77ad6714153d1e3', '185b00f80aaa910fa99d9abc99c84d58', 'ad2e8abecde386abbd1738707beccfee', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.LoanReview_mgr.LoanReview.delLoanReview();', '1', '');
INSERT INTO `t_action` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.editNews();', '2', '');
INSERT INTO `t_action` VALUES ('0fa43c6542365762ae60ccc552a33fd9', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.addRechargeSet();', '1', '');
INSERT INTO `t_action` VALUES ('164cdcc07fc0588cc16bdbafe55eff07', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.editRepaymentType();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eads', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.addAge();', '2', null);
INSERT INTO `t_action` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', '');
INSERT INTO `t_action` VALUES ('2213139f0e736a796d5ac4bdd78332', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.delIntegral();', '3', null);
INSERT INTO `t_action` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action` VALUES ('2432c7b3282c5b6482e6950da3b79ad8', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.delMember();', '3', '');
INSERT INTO `t_action` VALUES ('25860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.addCredit();', '1', null);
INSERT INTO `t_action` VALUES ('2657698064c09f77b845e272b987d16c', '6460c4e2cb89b498712c96e9b4d1acce', '2fe59d827540532df7f7ad86364d88aa', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoan.auditBorrowingLoan();', '1', '');
INSERT INTO `t_action` VALUES ('28060139f0e736a796d5ac4bdd78dawx', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.editAge();', '3', null);
INSERT INTO `t_action` VALUES ('2847af4d9e73cd7a4c1a5b1933cac4c0', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.addQuestion();', '1', '');
INSERT INTO `t_action` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', '');
INSERT INTO `t_action` VALUES ('297c9bdbf0377b73ae49f82e348b49ba', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.applyAmount_mgr.applyAmount.editApplyAmount();', '2', '');
INSERT INTO `t_action` VALUES ('2c3f7432c92f50ae582efd60424c025f', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.addCreditType();', '1', '');
INSERT INTO `t_action` VALUES ('2c5058d555dc3dae55c1dbaeec39fd4c', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.applyAmount_mgr.applyAmount.delApplyAmount();', '3', '');
INSERT INTO `t_action` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.editLink();', '2', '');
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', '');
INSERT INTO `t_action` VALUES ('34560139f0e736a796d5ac4bdd78344', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.addIntegral();', '1', null);
INSERT INTO `t_action` VALUES ('35860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.editCredit();', '2', null);
INSERT INTO `t_action` VALUES ('38060139f0e736a796d5ac4bdd78escs', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.delAge();', '4', null);
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '4', '');
INSERT INTO `t_action` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action` VALUES ('4586054157cf483a790f4eea35dsf6f6', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.delCredit();', '3', null);
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', '');
INSERT INTO `t_action` VALUES ('48f761b33f08cc3403e0ee74ff68b960', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.addLoanTender();', '1', '');
INSERT INTO `t_action` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.addService();', '1', '');
INSERT INTO `t_action` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', '');
INSERT INTO `t_action` VALUES ('4c81203b3b78f009a00b76f4b5c2f1c6', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.editMessageNotice();', '2', '');
INSERT INTO `t_action` VALUES ('53c1484ea13b45e89165b1f324cb4c87', 'f15eee7156a6e9821ad60ea9747b6878', '22bb4909b6184fadfdb5bc5566a911ae', '审核', 'audit', 'icon-cologne-customers', 'Button', 'enable', 'glacier.member_mgr.estate_mgr.estate.auditHiring();', '1', '');
INSERT INTO `t_action` VALUES ('56890139f0e736a796d5ac4bdd78211', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.editIntegral();', '2', null);
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', '');
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', '');
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', '');
INSERT INTO `t_action` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.editService();', '2', '');
INSERT INTO `t_action` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.delLink();', '3', '');
INSERT INTO `t_action` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', '');
INSERT INTO `t_action` VALUES ('5ec88454af4be3068ddb590c76edd72b', '9dc3357651c9ecbb9b7c51005be28d18', '5a5b45f5c22bb597247bf1ba380f8968', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.secretSecurity_mgr.secretSecurity.delSecretSecurity();', '1', '');
INSERT INTO `t_action` VALUES ('603c90108811ef9e8bb9c9639cc5c027', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.delRechargeSet();', '3', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '2', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '2', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '3', '');
INSERT INTO `t_action` VALUES ('6e2f6c1b5c542cb289cdadb07c9164b9', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.delQuestion();', '3', '');
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', '');
INSERT INTO `t_action` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', '');
INSERT INTO `t_action` VALUES ('745f2c5fbd9ff0393b422d69ec411b6a', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.editRechargeSet();', '2', '');
INSERT INTO `t_action` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.addNews();', '1', '');
INSERT INTO `t_action` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', '');
INSERT INTO `t_action` VALUES ('83da88e1222fd62309915a2ccee9bd52', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.editCreditType();', '3', '');
INSERT INTO `t_action` VALUES ('84ed9df00a0bcb687170e6a09767b4d2', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.addMessageNotice();', '1', '');
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', '');
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', '');
INSERT INTO `t_action` VALUES ('8dd9d2808e9363daf78642bcb64bfa7e', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '修改', 'eidt', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.editMember();', '2', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '3', '');
INSERT INTO `t_action` VALUES ('93ff0060577a61e2732d06f0a13d3889', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.editBankCard', '2', '');
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', '');
INSERT INTO `t_action` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', '');
INSERT INTO `t_action` VALUES ('9bd85330248f3e9a3839fc7fb22e7989', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.auditBankCard();', '4', '');
INSERT INTO `t_action` VALUES ('9c975e58b77030f3eaa72f95ab34f786', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '授权', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.applyAmount_mgr.applyAmount.auditApplyAmount();', '4', '');
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', '');
INSERT INTO `t_action` VALUES ('9f2bde7246ca2ad13dc64bbc5f4efb3d', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.delUser();', '3', '');
INSERT INTO `t_action` VALUES ('9f9e45b7c4cd5416067357793231eb85', '8b442566ffbc9531ee5e3aef7c41d740', '0ff45a0906e1ec4b169953b2c177db3e', '审核', 'auth', 'icon-standard-attach', 'Button', 'enable', 'glacier.member_mgr.memberAuth_mgr.memberAuth.authMemberAuth();', '1', '');
INSERT INTO `t_action` VALUES ('a04ae9ab4aeffa6fbffbae0f3630aa64', '4c654b11b08eecbf6eb4e6688ea83b7d', 'fc5113080081ca9c40d5fc0a7b66da8b', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.member_mgr.member.addMember();', '1', '');
INSERT INTO `t_action` VALUES ('a27471575ce1f86d15e43a163b2195dd', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.addLink();', '1', '');
INSERT INTO `t_action` VALUES ('a34eddbd653c462a87afe23eab0c6391', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement();', '1', '');
INSERT INTO `t_action` VALUES ('aa92fc184111c854d2c88774e4d941c4', 'a99477bf949bcae7143004e369d31d6c', 'cc479685206a45181c5965a09b72ffc5', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.rechargeSet_mgr.rechargeSet.auditRechargeSet();', '4', '');
INSERT INTO `t_action` VALUES ('ad2388e634c5e313d1c71eecdc849cb6', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.delAnnouncement();', '3', '');
INSERT INTO `t_action` VALUES ('aea7efcb8741c644ca693486220fe031', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '分配还款方式', 'assign', 'icon-standard-key-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.assignRepayment();', '4', '');
INSERT INTO `t_action` VALUES ('afa46628496d4d07c56a03e83a0094d0', 'c5cbf9f0961aa8249322d9ac20ba996e', 'f02605440920e2e2f7ed260f81674410', '初审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanFirstAudit.auditBorrowingLoanFirstAudit();', '1', '');
INSERT INTO `t_action` VALUES ('b0648b51ebbf9831702a3f616a75ca3a', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.delNews();', '3', '');
INSERT INTO `t_action` VALUES ('b0f605139653554aa66cf38a78fe42ba', '54eb754157cf483a790f4eea35200118', 'eb07f8ec54989seb66e4e8a1a0f21604', '列表', 'list', '', 'Button', 'disable', '', '1', '');
INSERT INTO `t_action` VALUES ('b45e5f92ebc8a419ba85dfc59cbeda50', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.applyAmount_mgr.applyAmount.addApplyAmount();', '1', '');
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '4', '');
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('ba99418ca949feedcedfa04396235827', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.delService();', '3', '');
INSERT INTO `t_action` VALUES ('bb182dacbb7641b9a337962406a6281f', '33f5e9959e821a58696e2d2fb5c322fc', '98954ee69de34d2515468cbc031376ec', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.question_mgr.question.editQuestion();', '2', '');
INSERT INTO `t_action` VALUES ('bd12ba2da228817eb381868d63ff9031', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.delRepaymentType();', '3', '');
INSERT INTO `t_action` VALUES ('be0471ff12b16ba7ef172aecd18ca4a4', '054464fdb73c76b5cfd4efa16fcaa8e1', 'a6776188d6b27af2659a71f77ff71e02', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.creditType_mgr.creditType.delCreditType();', '1', '');
INSERT INTO `t_action` VALUES ('c1a3054399d0f62140f0389d3c0761a7', '389f33c7b34582376d4d99282faa03b9', '8a63e66cba37b7a9f7e99ff684791264', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.borrow_mgr.repaymentType_mgr.repaymentType.addRepaymentType();', '1', '');
INSERT INTO `t_action` VALUES ('c2bbacb3cc9924e87aebce80f5bcbebc', '6b44218344d328305de2bcdf82cb8741', 'ea7a850b7fe4c05f180e28e6e7fa76fa', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.tenderNotes_mgr.tenderNotes.delTenderNotes();', '1', '');
INSERT INTO `t_action` VALUES ('c50c979b621ff41f0677cdf02e29648b', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.editHiring();', '2', '');
INSERT INTO `t_action` VALUES ('d463c7c3dc699550ee3ec4760d4a9bf7', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.addBankCard();', '1', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '3', '');
INSERT INTO `t_action` VALUES ('dc73a4be22344ac72054f8e664806320', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.delLoanTender();', '3', '');
INSERT INTO `t_action` VALUES ('e07e6f29a82367df51fd80863f28503a', '5db451044c71b4eb5448a4291d538241', '6e8859d95d4d4874c378f80f642740df', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.finance_mgr.bankCard_mgr.bankCard.delBankCard();', '3', '');
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', '');
INSERT INTO `t_action` VALUES ('e32722bcb1b49ff2ed7ce3029200fe80', '31a605c2a2a777c738a09103b9915615', '8e6e60bd7b85314ab9555e64bc6e5d08', '复审', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.borrowingLoan_mgr.borrowingLoanSecAudit.auditBorrowingLoanSecAudit();', '1', '');
INSERT INTO `t_action` VALUES ('e450b55ffaeca413fdd6551591993893', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.addAnnouncement();', '1', '');
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '2', '');
INSERT INTO `t_action` VALUES ('e637975493d65070499ebfb8b15b37f6', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.editHelp();', '2', '');
INSERT INTO `t_action` VALUES ('e6dc58cf519c048b4674a4581054d237', '703a3f819925f89a9c370c0324d784a0', 'b10c70408381896f937bfe688daf8c25', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.messageNotice_mgr.messageNotice.delMessageNotice();', '3', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '4', '');
INSERT INTO `t_action` VALUES ('fbbda7cc81811077445c4bc94c53ce08', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.editNav();', '2', '');
INSERT INTO `t_action` VALUES ('fbfded9986f0ad39d43d789b7594463d', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.delHiring();', '3', '');
INSERT INTO `t_action` VALUES ('fc1dd61babab45fb3942b311dda6a501', '3f029e72ef13db56e8b65866984da722', 'bcc05279c70cd8a320ad70bd7cd0b12d', '审核', 'audit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.finance_mgr.withdraw_mgr.withdraw.auditWithdraw();', '1', '');
INSERT INTO `t_action` VALUES ('fdd2966ba48e34c5e5ad8dc6d8964f8b', '10a7f2fd8253d90b8672d4096f8f9ed4', '3454dcbd02994a182203bf0f99bc4a63', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.borrow_mgr.loanTender_mgr.loanTender.editLoanTender();', '2', '');
INSERT INTO `t_action` VALUES ('ff46f7d280ced0c9db44b9b92b7c80fd', '8b442566ffbc9531ee5e3aef7c41d740', '0ff45a0906e1ec4b169953b2c177db3e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.memberAuth_mgr.memberAuth.delMemberAuth();', '2', '');
INSERT INTO `t_action` VALUES ('sd54fsd4fsd2sg45r4hrtj2fg1j2g1', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.delArea();', '3', null);

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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '054464fdb73c76b5cfd4efa16fcaa8e1', 'CreditTypeList_add,CreditTypeList_del,CreditTypeList_edit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '079cecd38fb5df02ed6e4d84446d072e', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '10a7f2fd8253d90b8672d4096f8f9ed4', 'LoanTenderList_add,LoanTenderList_edit,LoanTenderList_del,LoanTenderList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '185b00f80aaa910fa99d9abc99c84d58', 'LoanReviewList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '31a605c2a2a777c738a09103b9915615', 'BorrowingLoanSecAuditList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '33f5e9959e821a58696e2d2fb5c322fc', 'QuestionList_add,QuestionList_edit,QuestionList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3775cc8c3044650697dbb4d8636b5464', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '389f33c7b34582376d4d99282faa03b9', 'RepaymentTypeList_add,RepaymentTypeList_edit,RepaymentTypeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '3f029e72ef13db56e8b65866984da722', 'Withdraw_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4c654b11b08eecbf6eb4e6688ea83b7d', 'MemberList_add,MemberList_eidt,MemberList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f1b6666b70be892469b6e93c1eb30ce', 'NavTree_add,NavTree_edit,NavTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5db451044c71b4eb5448a4291d538241', 'bankCardList_add,bankCardList_edit,bankCardList_del,bankCardList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6460c4e2cb89b498712c96e9b4d1acce', 'BorrowingLoanList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '6b44218344d328305de2bcdf82cb8741', 'TenderNotesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '703a3f819925f89a9c370c0324d784a0', 'MessageNoticeList_add,MessageNoticeList_edit,MessageNoticeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '88ee044d59911b3b1a67ba4cdd0ee90d', 'AnnouncementList_add,AnnouncementList_edit,AnnouncementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8b442566ffbc9531ee5e3aef7c41d740', 'MemberAuthList_auth,MemberAuthList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '8b4c5afb8d66b21e8900822c5c6bff35', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9171c71b4bab5578ef0bbeac30072c73', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_del,UserList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f0fcfa7cdff069d929723062b53211', 'VariablesList_add,VariablesList_edit,VariablesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f6161c579a1df53d49eb2655d29645', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '9dc3357651c9ecbb9b7c51005be28d18', 'secretSecurityList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a99477bf949bcae7143004e369d31d6c', 'RechargeSetList_add,RechargeSetList_edit,RechargeSetList_del,RechargeSetList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ae024ce004991607d5ae9e725d67cce8', 'ApplyAmountList_add,ApplyAmountList_edit,ApplyAmountList_del,ApplyAmountList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b67d550a506255816d54840a853b7a46', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c3c78541e9041ab6659fd3399aa6445b', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c58c25c6cb2e8d9fdf39493dde51d80d', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'c5cbf9f0961aa8249322d9ac20ba996e', 'BorrowingLoanFirstAuditList_audit');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd31f853097d3bd74741d6418f6a2c7d5', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd503136bdab7bbdc8d09f3bbb28fa979', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd60a6e3369f1b7fdb249aa61ba4add6e', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'de34654c5e6c1e94ee70cc833asd142', 'AreaTree_add,AreaTree_edit,AreaTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e4d2578abb2e36eb4aea5fa8caed2a51', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e75a41ba4a2bc299e3b50a15580a103b', 'ServiceList_add,ServiceList_edit,ServiceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'f15eee7156a6e9821ad60ea9747b6878', 'EstateList_audit');
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
  PRIMARY KEY  (`loan_id`),
  KEY `FK_t_borrowing_loan_t_loan_tender_loan_tender_id` (`loan_tender_id`),
  CONSTRAINT `t_borrowing_loan_ibfk_1` FOREIGN KEY (`loan_tender_id`) REFERENCES `t_loan_tender` (`loan_tender_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_borrowing_loan
-- ----------------------------
INSERT INTO `t_borrowing_loan` VALUES ('4535fsdfaf9f2c9bc59bbc6df4523s34', '借钱来买坦克', '0d06ae74d5a50659c4c40d4ee980a748', '借钱来买坦克', 'images/default-img.jpg', '1c362eac7ec315aa47ab84360d4e390d', '资金周转', '4', 'other', 'yes', 'yes', '123', '123', 'yes', '123', 'yes', '123', '1', 'e444483d3b503b99d7572d2008e5b099', '11', '1', '1', '1', '1', '1', '11', '2', '2', '2', '2阿凡达', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-21 10:08:21', '2014-04-21 10:08:24', null, 'tendering', '资金周转', 'firstSucess', '8b25651c2d896297530b64e4b80ec503', '如果你买了坦克，就不还钱了，咱们点办~你不会轰炸了咱们吧。', '如果你买了坦克，就不还钱了，咱们点办~你不会轰炸了咱们吧。', '2014-04-21 14:06:24', 'secondSucess', '8b25651c2d896297530b64e4b80ec503', '坦克也可以买的吗》？', '你别扯淡了 傻逼。', '2014-04-21 14:06:21', '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-04-21 15:28:26');
INSERT INTO `t_borrowing_loan` VALUES ('5627fc801ee0205417d66b1daec10423', '我要买房', '225b8f6a7863d52f947b265f869e48be', '借钱回家哦IU呀', 'images/default-img.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '资金周转', '3', null, null, null, null, null, null, null, null, null, null, 'e444483d3b503b99d7572d2008e5b099', '10000', null, '500', '300', '100', '10000', '100', null, null, '5', '我额额我', null, null, null, null, null, null, '2014-04-18 11:10:27', null, null, 'tendering', null, 'firstSucess', null, ' 	初审通过   	初审通过  ', ' 	初审通过   	初审通过  asdfasf', null, 'secondSucess', '8b25651c2d896297530b64e4b80ec503', 'dfsdfsd', 'sdfsd', '2014-04-29 10:16:37', '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-04-29 10:16:37');
INSERT INTO `t_borrowing_loan` VALUES ('80ebfeaf9f2c9bc59bbc66d588a0fcb9', '我要娶老婆', '225b8f6a7863d52f947b265f869e48be', '借钱回家老婆', 'images/default-img.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '短期周转', '7', 'manually', 'yes', 'no', null, null, 'yes', null, 'yes', '', null, 'e444483d3b503b99d7572d2008e5b099', '20000', '1', '100', '200', '100', '10000', '100', null, null, '1', '额外的费', 'no', 'yes', 'no', 'no', 'yes', 'no', '2014-04-18 11:10:52', null, null, 'secondAuditor', null, 'firstSucess', '8b25651c2d896297530b64e4b80ec503', '这是大事，必须通过。', '这是大事，必须通过。回去准备吧。', null, 'secondSucess', '8b25651c2d896297530b64e4b80ec503', '', '', null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-04-21 15:22:02');
INSERT INTO `t_borrowing_loan` VALUES ('9841ce94a6789b3d824994b477c0a148', '2014-04-22', '0d06ae74d5a50659c4c40d4ee980a748', '借钱泡妞', 'images/default-img.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '资金周转', '2个月', null, 'yes', 'no', null, null, 'no', '10000', 'no', null, '10000', '60d13359890d7edfe536ce87af02d6e5', '10000', '10000', '1000', '100000000000', '500', '10000', '100', null, '10000', '5', '10000问', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-22 10:20:00', null, null, 'repaymenting', '10000', null, null, null, null, null, null, null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '0d06ae74d5a50659c4c40d4ee980a748', '2014-04-22 10:20:00');
INSERT INTO `t_borrowing_loan` VALUES ('a2e88edde6ece006c694edbcdc90ea62', '测试流转标', '0d06ae74d5a50659c4c40d4ee980a748', '测试流转标', 'images/default-img.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '长期使用', '2个月', null, 'yes', 'no', null, null, 'yes', '322', 'no', null, '124', '60d13359890d7edfe536ce87af02d6e5', '214', '21', '100', '1000', '100', '1212', '100', null, '12', '1', '个大胆发', 'yes', 'yes', 'yes', 'yes', 'yes', 'yes', '2014-04-22 16:12:47', null, null, 'repaymenting', '', null, null, null, null, null, null, null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '0d06ae74d5a50659c4c40d4ee980a748', '2014-04-22 16:12:47');
INSERT INTO `t_borrowing_loan` VALUES ('a7dd8236b93b6997a06b6652eca21eb3', '我要买车', '0d06ae74d5a50659c4c40d4ee980a748', '借钱回家买车', 'images/default-img.jpg', '2587bd0ecc859e35f2874f2aff0d4852', '长期使用', '2', null, null, null, null, null, null, null, null, null, null, '60d13359890d7edfe536ce87af02d6e5', null, null, '100', '100', '100', '10000', '100', null, null, '1', '我问的', null, null, null, null, null, null, '2014-04-18 11:10:01', null, null, 'firstAudit', null, 'firstSucess', '8b25651c2d896297530b64e4b80ec503', 'ss', 'ssssssss', '2014-04-21 16:14:11', 'secondSucess', '8b25651c2d896297530b64e4b80ec503', '复审通过 ', '复审通过 ', null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-04-21 16:14:11');
INSERT INTO `t_borrowing_loan` VALUES ('dff3423436b93b6997a06b66324564c', '建房子', '0d06ae74d5a50659c4c40d4ee980a748', '借钱回家fangzi', '', '2587bd0ecc859e35f2874f2aff0d4852', '', '', null, null, null, null, null, null, null, null, '', null, 'e444483d3b503b99d7572d2008e5b099', null, null, '', '', '100', '10000', '100', null, null, null, '我发vv大是', null, null, null, null, null, null, null, null, null, 'secondAuditor', null, 'firstSucess', null, '', '', null, null, null, null, null, null, '0d06ae74d5a50659c4c40d4ee980a748', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 17:07:25');

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
INSERT INTO `t_finance_bank_card` VALUES ('6ae3020a31124df7628573b9385e3208', 'f842fdbfe42190da7bea612a54debb31', '交通银行', '香洲唐家支行', '交通2', '1134567299176543215', 'authstr', null, null, null, 'f842fdbfe42190da7bea612a54debb31', '2014-04-15 14:18:23', 'f842fdbfe42190da7bea612a54debb31', '2014-04-15 14:18:23');
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
  `usable_money` float default NULL,
  `frozen_money` float default NULL,
  `collecting_money` float default NULL,
  `refund_money` float default NULL,
  `amount` float default NULL,
  `recharge_month_times` float default NULL,
  `recharge_times` float default NULL,
  `recharge_money` float default NULL,
  `withdraw_month_times` float default NULL,
  `withdraw_times` float default NULL,
  `withdraw_money` float default NULL,
  `borrower_credit` float default NULL,
  `available_credit` float default NULL,
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

-- ----------------------------
-- Table structure for `t_finance_recharge`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge`;
CREATE TABLE `t_finance_recharge` (
  `finance_recharge_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `finance_recharge_set_id` varchar(32) NOT NULL,
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
INSERT INTO `t_finance_recharge` VALUES ('sdfasfsdfsadger234', '0d06ae74d5a50659c4c40d4ee980a748', '1ac50d47c763ea03f6892d84fc4f7a4d', '0001', '10000', '50', '0.02', '9950', 'authstr', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 13:09:09', '审核通过', '地方', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 13:09:22', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 13:09:26');

-- ----------------------------
-- Table structure for `t_finance_recharge_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge_set`;
CREATE TABLE `t_finance_recharge_set` (
  `finance_recharge_set_id` varchar(32) NOT NULL,
  `recharge_set_name` varchar(32) default NULL,
  `recharge_rate` float default NULL,
  `member_type` enum('general','vip','all') default NULL,
  `value` float default NULL,
  `fee_way` enum('proportion','directcost') default NULL,
  `audit_state` enum('failure','pass','authstr') default NULL,
  `auditor` varchar(32) default NULL,
  `audit_date` datetime default NULL,
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
INSERT INTO `t_finance_recharge_set` VALUES ('1ac50d47c763ea03f6892d84fc4f7a4d', '支付宝', '0.1', 'all', '0.2', 'proportion', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:26', '支付宝', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:02', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 11:07:50');
INSERT INTO `t_finance_recharge_set` VALUES ('8f49f6dcbe06833f65c44220e6552676', '财务通', '0.1', 'vip', '0.2', 'proportion', 'failure', null, null, '财务通', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:22', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 17:07:22');
INSERT INTO `t_finance_recharge_set` VALUES ('b6cb483c206fbdbe370d5941a10a1c1f', 'sdfasf', '12341', 'general', '4124', 'directcost', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 11:08:56', '124', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 11:07:59', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 11:07:59');

-- ----------------------------
-- Table structure for `t_finance_transaction`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_transaction`;
CREATE TABLE `t_finance_transaction` (
  `transaction_id` varchar(32) NOT NULL,
  `finance_member_id` varchar(32) NOT NULL,
  `member_name` varchar(20) default NULL,
  `transaction_target` varchar(32) default NULL,
  `transaction_type` varchar(100) default NULL,
  `earning_money` float default NULL,
  `expend_money` float default NULL,
  `usable_money` float default NULL,
  `frozen_money` float default NULL,
  `collecting_money` float default NULL,
  `refund_money` float default NULL,
  `amount` float default NULL,
  `remark` varchar(255) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` datetime default NULL,
  `updater` varchar(32) default NULL,
  `update_time` datetime default NULL,
  PRIMARY KEY  (`transaction_id`),
  KEY `FK_t_finance_transaction_t_finance_member _finance_member_id` (`finance_member_id`),
  CONSTRAINT `FK_t_finance_transaction_t_finance_member _finance_member_id` FOREIGN KEY (`finance_member_id`) REFERENCES `t_finance_member` (`finance_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='财务的会员资金交易明细表。';

-- ----------------------------
-- Records of t_finance_transaction
-- ----------------------------

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
INSERT INTO `t_finance_withdraw` VALUES ('dsfsd234523562fdf', '0001', 'c61da6243a471bfffbe3fd4101e41242', '工商银行', '唐家支行', '李四', '440982', '20000', '19000', '1000', '0', 'pass', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 14:26:32', '审核通过', '提现', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 14:26:44', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 14:26:47');

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
INSERT INTO `t_loan_review` VALUES ('84e46bf1229d01abeeb3a26efd589510', 'a2e88edde6ece006c694edbcdc90ea62', 'aaa', null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-06 09:01:25');
INSERT INTO `t_loan_review` VALUES ('adfsa', '4535fsdfaf9f2c9bc59bbc6df4523s34', '啊啊啊啊', '啊啊', null, '2014-05-04 16:44:42');
INSERT INTO `t_loan_review` VALUES ('asdfdw', '5627fc801ee0205417d66b1daec10423', 'fdafas', 'ad', null, '2014-05-04 16:45:15');

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
  `largest_apr` float default NULL,
  `loan_deadlines_mon` varchar(50) default NULL,
  `loan_deadlines_day` varchar(50) default NULL,
  `wait_bid_deadlines` varchar(50) default NULL,
  `lowest_bid_money` varchar(50) default NULL,
  `largest_bid_money` varchar(50) default NULL,
  `is_bid_reward` enum('no','yes') default NULL,
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
INSERT INTO `t_loan_tender` VALUES ('1c362eac7ec315aa47ab84360d4e390d', '信用标', '说明：信用借款标显示\"信\"字标记，是一种免抵押、免担保、纯信用，最高授信为10万元的小额个人信用借款标,主要面向公务员、医生或教师等机关企事业单位的在编人员。如借款人到期还款出现困难，逾期第30~33天由网站风险金补偿，债权转让为晋商贷网站所有。 ', 'open', '9.99445e+007', '100000', null, '0.1', '0.254', '1-12个月', '30', '', '10000', '100000', 'yes', 'yes', '0.1', null, null, null, null, null, '1', '30', '3000', '2000', '2000', null, 'open', '', '', '用户成功借款后按借款期限一次性从所得借款中直接扣除收取，1个月内统一收取借款金额的1%。从第2个月开始，每个月加收0.4%的手续费（年手续费合计为5.4%）。借款手续费不计息，不退还，在借款金额中直接扣除。作为成交服务费。', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 15:56:21', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 14:42:52');
INSERT INTO `t_loan_tender` VALUES ('2587bd0ecc859e35f2874f2aff0d4852', '流转标', '债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。', 'open', '50000', '200000', null, '0.1', '0.24', ' 1、2、3、6、9、12个月', '30', null, '10000', '100000', 'yes', 'yes', '0.1', '0.2', '100', '10000', '10000', '20000', '1', '30', '2000', '1000', '1000', null, 'open', null, null, '债权人将手中的债权拆分成小额等份的债权转让给众多投资者,并且承诺到期进行还款的一种理财标种，称为流转标。投资者对于流转标的购买份额最小为100元/份，流转期限由借款人确定,流转的周期不同，回报收益不同；通常流转期限越长，回报收益则越高。 ', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 14:31:40', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 14:31:42');
INSERT INTO `t_loan_tender` VALUES ('9788195653f335695256551b82fcbac6', '净值标', '说明：净值借款标显示\"净\"字标记，允许发布的最大金额为净资产，净资产小于20万不能发标。发布净值借款标用于临时周转，可以循环借款，但用户提现将受到限制。他是一种相对安全系数很高的借款标，因此利率方面可能比较低，用户可以借助此标放大自己的资金杠杆。 ', 'open', '1000', '200000', '2', '1.2', '2.4', '1,2,3,4,5,7,9', '1,2,3,4,5,6,7,8,9', '1,2,3,4,5,6,7,8', '100,200,500,1000', '1000,2000,5000,10000,20000', 'yes', 'yes', '2', '20', '100', '2000', '10000', '20000', '5', '5', null, null, null, null, 'open', '', '', '说明：净值借款标显示', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:13:50', '8b25651c2d896297530b64e4b80ec503', '2014-04-30 14:11:00');
INSERT INTO `t_loan_tender` VALUES ('aa09e227a4a40cb6cb15703b98522672', '抵押标', '说明：抵质押借款标显示 \"抵\"字标记，是经过线下严格核查借款人资产负债、抵押担保（矿资源房产、土地抵押等）、优质资产和股权等有价证券质押担保手续，然后通过平台发布借款需求，【晋商贷】对借贷方提供连带担保责任的业务品种，确保风险控制在最低水平。', 'open', '1000', '1e+006', '100', '0.2', '0.4', '5', '5', '5', '5', '5', 'yes', 'yes', '5', '2', '2', '5', '2', '2', '2', '2', '22', '30', '20', '1000', 'open', '', '', '说明：抵质押借款标显示 \"抵\"字标记，是经过线下严格核查借款人资产负债、抵押担保（矿资源房产、土地抵押等）、优质资产和股权等有价证券质押担保手续，然后通过平台发布借款需求，【晋商贷】对借贷方提供连带担保责任的业务品种，确保风险控制在最低水平。', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:13:03', '8b25651c2d896297530b64e4b80ec503', '2014-04-23 15:13:03');

-- ----------------------------
-- Table structure for `t_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_loginlog`;
CREATE TABLE `t_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) default NULL,
  `login_user` varchar(32) default NULL,
  `login_time` date default NULL,
  `login_ip` varchar(20) default NULL,
  `browser_version` varchar(20) default NULL,
  `screen_size` varchar(20) default NULL,
  PRIMARY KEY  (`loginlog_id`),
  KEY `FK_loginlog_user_loginlog_id` (`user_id`),
  CONSTRAINT `FK_loginlog_user_loginlog_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loginlog
-- ----------------------------
INSERT INTO `t_loginlog` VALUES ('00c68eae80fe7c060882d0911757545a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('00f4e22dded61d8f49dea94f9f6d47fc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('00fde47c53cdb22d9e3dffeab383105c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('015b2e8d03fbfb018eda0cf157370547', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('015e1f66e0095d932b7e254faf04c69c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('01a7bba8471c11b65f3479017d072ee7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('02016b337a28989cccecebf11207b10b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('021b77571cd723a1e8e77ac899b9523b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('034e81b93aaf536ac9cd36b5635ff273', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('036e2ea6ed423356bf73422298825946', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('05aea019947282926ef1c4c3ed2f5525', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('077c4280e5e090b9a4d04938d185ffb4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('08c36626c37a2a98af309be919f2ef49', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0a3f3c67c815555791deb2d0962c3ddd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0be8c544ae21f41c2a2f1bf90c474443', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0c3ff0987ec0f7484b7cbafadcb07f12', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0c4f709476b15c51166c4dfaa33e1333', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0ca97f63f979f0b0a15a0fa218845c0e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0d1c40753986882e86af2bc71df89158', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('0d7ff459c183e6af552b98ccc9fc2c81', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('101a75ebdc2750d123cbcb621521a21c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('113314f6b2aeb4c423d9bb352bf6e1c5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('117581bdaf18e9009f36db34c6ae0b9c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('11a5ec51638c76d41e35fe468eeb6470', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('122ca4a42e0f22e3373240d1d133e939', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1249e27df036611710163c4aec51418e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('127a8007756f2a7b3dffd9a0a3fb9ebc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('128f602b15beec1128d5a64532014543', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-09', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('14156ea580e04c630bea92d698f44382', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1460326518aa61de89667b666a2edb78', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('15bb4f9b1149695baa6327a8234d5bfa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('17ef436587e853aa70759f96da43cb87', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1869b55dd1024f1849dee5822a2853e0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('19ef0fea9499ef9cb311690ecdad861e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1c4aee92c496244879f325f76ce181e5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1c93f1e0639e19fd7d00a171b6991202', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-23', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1d045ccdfbfadad533c5baba20e0bf7c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1d33b1dccecf7406036d8c19901095d6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1d3c703fc49a0e241dfe8faac97b2f75', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1db11608a378bd0caf401cc2c629856b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1e21373677465cb68db073db191d7748', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1ea40e31d3583575fec458ee39401092', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1ead37273cba7ba750b013c2a4a09dfc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1ec14f70fd1c1026f488db162a3b4c88', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2020837b42cad032ea8dd7e98cda8f5c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('210e08b0d331c8668d26fc17d8647b34', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2164cbdaedb62ff6f6b507e698c3a400', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2326600c09854aff71a644107dcdda84', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2400491761d2650d521fdc935bde23a6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('247048e56607a4ee5dfdbf2db223c627', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('25b28afa785e3c807b960fc42706a641', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('25def27dab0211fbaaf1fb4f457fdc32', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2731552eb289e6c1ec22f99b80507d6d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('27ce84f0a3c3e089d92a229147c7635c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('297c74553f5db4be05b95400f25c9e95', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('29d53c3c164fbb197cda77d690340263', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2b7965c0e532630b07905644b181c495', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2bb105aa4ba261a0cef060677ea18078', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-25', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2befc374a89496b210a7e534aab84f88', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2e78987eca033cef0ca2fae280da31d7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2f3cb74b4fdf8d3239b89ff5d652689e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2f76ed5797941cb9189faf828d26fed6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('30452b72728811ee373ba945024c9ed7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-14', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('318a5b2a43d42ce15717296de549ce33', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-14', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('319ffef6ac61815d0225745473e641bc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3212d5335a262256c78aa39e7f23927e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3283f27c2be242c7fce6f78f0991d306', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3360d23285f673451b8d4534a2758b18', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('33801b8019fc60e70f6ed98aff42578c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('338289372f402124a6c228e859acf649', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3409a841a3c8bfacbf67ea1bab09eb2e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('352c11c224105a8c01f262f66c3ee658', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('359b2092fd0d945f54f6a5bf5720faa6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('36b51074e65b5e24039ad1d69671894f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3773ab8b78e124d7593a704f6d8f060d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('378c6bc844076350357c0584a40183cb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('37e5f97470e80fb266a525caf78b6d23', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('38be21bd5f89805851649ed1672c004d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('396fdd330c82d901d3c1be71b34199e8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('39c4af666fbe27588ce64896b278ba77', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a330b9cca174548faf70abfa472f82a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a817edf5b002004b6a485475e23b096', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a8692b9575c844cc9fa0235d58665fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a9aadb97cf03bf4161ac88c372dea72', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3adf06531d1d983b9baf1f39f954a83c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3b35ab03b8d93478384063816811ca33', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3b492941fb125aeb90b682c21e00247d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3c9cfbdcfe4f5eed010abe97d99a066d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3cd85330cfdb6430747080329a8a225b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3e1278807b76f2241b31dcb8916c1d37', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3eddeb4a76dc35f7c4980fdb106deb0d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3ef13778ea67a743fd0c9ecfd138ca89', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3f385f0449f625fba46a6ddf61463a3c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('40048b66be65ff402f30523b33ddc41e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('400cd33111c2fad3a808fad66302c9b1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-25', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('409f97ff656e25e57d68175dad5ad6fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('40c7d3134624b7cc0cf8ad61a79b6365', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('413c3629b40d8d9f00ea1e57a82e8a39', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('41cd644b63565d4a1fa7ce5837bb82bd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-23', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('421675bf67ddbc02b36f6a8dcaeb25f8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('42a913654d0359de1b7d24ed6185671e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('432c49b1c4e1de203e09f2cf019e6372', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('45162abed53ff8aba4e7e6cd650748ab', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('453cf6f84d8811318aa8e2224c7e612e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('454347d01a11ecd78e841b0c18031450', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('45cdde0a93212ae111e57d75acd1d5a5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('471d19a0ab7bf9b94c3ea032247c24b6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('48887bdbd8059b9234734ac9a74dc307', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4a6c38c98f8a04c92d0f9aac6ef9cb0b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4d8a92c98353a6ee8a029392a03ab10a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4e147fb780bb12989c5ea64a79ef42aa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4e2e0e7c655785145d12ae9fe0b8d421', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4e39c47dba268e3397d7fe2b8bbe5b38', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4e7bd925dafee3fc1633b9d56ae213a2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4e8d2622679cb4607b39840754915e0c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4edf56ab1081a07b34ed29a966cf6158', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4efe9a9361250cd3f7fa7772db0ef5ee', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4f12f3c179f4c06cf20b1c1644e193c6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4f154b99f9fc73649b89f2d3fc7fd9cc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4fa7a5ffd24da1be554fd269e2339cc4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('517e7d2fe59cb78020e25f9a4204471d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('51a3bb9f575d0ffc4d43538fb2a104a2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('52431b1ee3ec85fd8993ac87186af6ef', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('53cd83770162120a5ed5515dcc9bc9de', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('53d4d7554f306fac9199386ba6c6fa06', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('54392b45d624c8281826c9f52164ad1f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-10', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('552268cf0e8460c66843658f2459b536', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('554d607e185801aa672179c3fc233905', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5590c03dcab39baa87d99104feb95cd9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('56030646e7c0a5599b9353ea43a0423e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('56190376edce788e875c010fb2bbbf2a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5811d8ece1ef99ee8b68f3bfe57d549f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('58c27088d96b8497181eda58ecd8caf0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5962f01fffda05b6dbc85a19f7cb6374', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('598a7bd87764e534a8c647b057fea31c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5a36371d4e23a7cb61e9197c6ad91ba1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5a4e8c47fe6b0b02d47f8a4591242f80', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5abee9df69eb8f8efb02a0431c08d261', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5b4706631bc867492d26aabe857cdaac', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5b4812b6ce379c1d8400d340147e28c2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5b99f24109a92020ff2bcfa2257761c7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5d3187c3a680c886c2262adc0fc6d316', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5d985345b522d719646d6d48741dd940', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5d9d7aae03846c88e2ed715a41bc99a6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5df67c42bd2b2ef43837c0f83ee00dc1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5e53a76c737e61b0bbf2cb8542338317', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5e5ea73bdc0ed190c74d32c189f34bcd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-25', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5e9d9f267bb88f5adbce1fbd8ed8e6d4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5eafc8209557defd7aa0fce9ca1972a7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5f0ca9ae663f524f208107a05df94549', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5f195cea83b10fd7d8d9436beb2f6c58', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5f386ca066b45cd497c322c57fcebfd7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5f611f1e726d5f6ad1ec95f26f4edeb5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5fdca8929212dcc9a4a3d09516dba5f6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5ffcd60671dae5606b390fd9e418bf8e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('61642108f8d09651c330166f709a63e0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('621a3c7a418991a6b7309e522d9809d5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('622ab3bf3da4fa055b0a6697b7fb903a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('62c3c9b8d1ad27c63a9ab44769887859', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('62d351e68723444f06aa9f93da1fa9fa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('635b819f1e3eec11b40656adb9477f1b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('64200857b076349448a284519b98f91b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('647b2e3cc2479ecb6fbc168e5dc1d312', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('65c7299e1474873506dcfdd82a35394c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('666f6be0188662adf6dc5871280899ea', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-15', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('677fb5ad6a07de1549724a5d79509c05', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-23', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6845db5ff2fc73aff261d5021990a323', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('687f5a2fb78c87a9e3fb62061308d96f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6880b6c85c31834d370a6cd2e920ef33', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('69862d13138bd934c1df663176fafe50', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('69af2c83bde4dae6edef94550953589b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6cf5db6c9da6924a4a634dcb0c8935a4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6d27c77f299383460a719f72bffdf6da', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6d3a48d571fc04ac995686f3a4b5c43f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6d76807bf09266831bdfa3220d4a466b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6fab6d981f091bfecbe4f77f3dad9e0a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('70593c7e6f808fa37b583ec5c17901c1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('707104aba3e39dccf52d5dd8206f58b8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('717acd8c0f1cc1851692f9d4f9630c3c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('71c0de71a0df15a399dd21123a5c9b80', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('722fc1dbc52c5bed1f486e034911e3e5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('748a4e0b84a6b50fe81d52c95fcc27c4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7561784bc574f2ca26590e37120fb3f5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('761576b47fad2de50ba2e722167139e0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7620e7776eb67e93ae6ed01e6f535aae', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('764906320813de001041994e21cd3259', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('76d0270f5a4568855e7dd4a3573dbbaf', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-28', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('779369796e65a1927cc70a1d9191002d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('77ccc3c5b807ee3244a4c48aeea986fa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-23', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7891ade4a8413d8525f62141f5c38474', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7a46ab663e5154e452df2bb8cdc0bce0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7b21d5b1b57785466b8736ebff9c9420', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7bc47fa23da259f2a29bfae45bc232a7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7bdab919bebe8e8944f49e3474ec2325', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7c05b0bc9861dcb82e728674dcdee483', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7c31d54f8c54519acb8bd4d5448977d7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7e038d2308c46adcba7da26d35fc4957', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7ef9230eeefe33ae49ab236bd79cb7f8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7f3fd3e8172cc9cd15c891be38cbd941', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('81a274ddbebf27364d5aaff8a572f40d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('81aa9c4edd839471aa3d1901e65c70ce', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-09', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('81deeedf62470041d1bcf0918f71f6a2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8209755a2e58cfd8abb6082228b77f41', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('84b79c1d6210cb5fb2fd5f6ded533b6e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8565e0d1634ae050d1d29944c787ae17', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('85a8700e24ee11d815fe95e4c4122f74', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('882b2846421f2a7b5106dd915f55c5a4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('88b02fed626344a9666895e42fbf22b9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8aba09fe7e2b5094f1e1ecf5bcdd7395', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8afccf892629f957fa8ca385778f8498', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8b7dce50aff02cbf22491752c11eec50', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8b86a023a1ed4c429f3ffd94eb6a1f18', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8bc78abcacf5fc31b8b55926b30e73db', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8ca49ed9528c75824df507a415fbb056', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-15', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8d0342445e1346460ea571bc3484858f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8ec517e7aec995fbbd253c6d19ecfbb5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8f90cbd33c2e8d23bb5be0f326645876', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8feb9840a374a341ca54011b185a67fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9049b6c410b7cd69b5f35f8d8069d08d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('914716c4a9e507b8998c46ec1a578496', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('91c77c9bd4367ebe9feb77403ed44681', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('928a418d8345285c36c3383cb2662dc7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('92b26c8107f337235a6cc73a09a4b4df', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9488d313d14af9ca7577eec62682771e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('949a54dd4083d3696bfda3659553e5f8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('95e7982af0738c1676e754f7d7359141', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('97c4a756a2b56eeb3d1a8f82c81a8034', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('986f79069a2ac1d2c8c1310e98a490bf', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9a6be9592bc490918a89b21e6fed8449', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9adee662d8a61463f4e17509b7cb660d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9aea5a9c9b01878a3079e513ebe982d8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b2a071325c710997ba4d3ac4d4fe6eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b52f0928e9ae98006f1a4f0bcf59f44', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9e754fcf01fb023e3d46f60bd3dee16f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9ed2fa2b4db6cf97be1dd4411cf50076', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9edd2f6fece5e098a7e01419553ed8e4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9f976e6d8e09fed0e886be29c7cb4523', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9ffef115306310107ec12f5fb0aa22ba', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-25', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a00dd87019fa780f20ed7008b62b0132', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a1e427d1231da6e1117bc5ace4b85762', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a32cc4588a0d4cca40a187f17fdf82e5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a3e5349d8ac420db06cd54f54b54d702', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a4b80e8956adf9362590cb38b64877eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a5a7a48437afcc179ffc74f1b59b13de', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a5fb4e9004edfa815c6f471c4c1f101e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a7103936c710e2cf05a0edd5dec6bf9f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a7b30b2e62ed44553769131eebeda968', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-09', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a80fa870938cb87e696032e0b3b86658', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a84a55f09df7dbcf03b913bc5221810e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a8651bd68ff993a7ccc85176e61a7e31', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('aab21b0d2b6a5925a128ed3e94c05790', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ab83bd3b841b35e959469c04134da510', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('abc62bbb74c68c966121883d21d7be19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('aca1a887e836926a3b2221d313ad4dc3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ae34d5c54c75d534c399770c70b70f71', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ae53cbd83984e4b280d2b87809e19890', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-29', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('af0f0343b1c04a4c7e5149a2c33e335e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('asfdasdf', '8b25651c2d896297530b64e4b80ec503', 'asdf', '2014-02-12', 'afd', 'fd', 'adfs');
INSERT INTO `t_loginlog` VALUES ('b04fd0a3096589a29f81ddf857bb9521', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b1b98e1b7f62bdc4ca3bf7a72cb3cb19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b247b562b9a713e82226e0ffd5754f83', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b27552e697add5ffcb3e2cdf5d9fb116', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b29c854a808333025981f0b1394cd738', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b35974fd90e601d6de3aa005b3b201ac', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b36159bf12c40a1b3ee08d1615c005bf', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b38625cfa21d8773c3bef70494b2b5cb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b535f0fb8bf1999c43fb2cb64270fe8c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b5dd4353c2bb4b9dbf3bdd35f497076c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b612a79f7353f2398af9a198fd1eeae1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b62a63b8d006077e84a5d670e0b72869', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ba74229738c5e2aa64679fcedee637fa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bb8b197075705e6e908ceb0d6d9c3e87', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bc07fd8c1eaf16c629b18fadce09ee51', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-28', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bc349790f864daf796a372a28ac689cc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bce568b40df924ebd88714fb2b987512', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-29', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bd327f69db09ab9eeea9b6a5d16fbcf7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bd6269f2cc80cd754225a7f1b95b223b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-09', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bd822c5c3fd8c875d22b8c7de5e75694', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bdcda0dd9f577e2de2dc0e5e1be9e313', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bdf6e4c2b430b8a5495c1e3cc00fa6e8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('be11dcd151836287642b956259cfd68a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bef0ff11a107a3629ccad2bb026ea34c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bfa2928cc5c871ae0a89b0bea664e26f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bfa906033544a69e63c6daf50f13e046', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c01b422f01d82b39e5f3df3d1a045b42', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c05622b5a87e862bc5784fb23fc26d28', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c0dfe2d152a82a1b7843eb55fda82f36', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c237551dbded74ee1780d240cdac85dc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c35ccdd81718f0a9a36c929ecc74b9dd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c4650a348b8778e51de50b4bfaa362f2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c530bcbc8340b6e1edb06c5a969da8f8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c58030121b937161c4c6ff62c33f365a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c5c0b169dc5ceb278f00bd541ab1f8a1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c61c58f55906c5ca27e86ea1e054a766', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c62a18e3c823c9fd574b461237b76a50', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c9346afa60e15d4b1d544747b18f5fb3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c9a0f913c70252a4aa143769253d8993', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-14', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ca25b859199cc33712116685f93d29bf', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cb81e392b85834b094f043e4c49566fe', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cbed702f33195b7eb15578a4370f7ba7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cbf4469d78f3b8f2ceb42e4249b9aff5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ccc9a2934196f98d5a144907495cb2bc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cd9bda56c48bdd2e6ed395542767eb8b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cdd6d49fc805c3ca218c56a842a40705', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ce7881076b3a0385f255700fc38b1208', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cfaed08b64f6afa498810d5d04e40ad4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d05e8dcf9fda807aa8e648e5740d27eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d0b1ca4e180ee2eb2c96c99643a7ff30', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d0c2880d055877975d95646b7eada073', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d206150343af6501fa99301f7e1b4337', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d2659fc671da6bb836170222aea2b858', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-25', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d27d81cbd607cd4544215701af545d54', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-18', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d28ae069ac76c8172b4d065873af4fd5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-22', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d29f31572f8557580a307274b4434cbe', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d2c2973af9dd04471f6ac62b76e565ec', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d2c9c7f52c0de6f2b08152ae528fd435', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-23', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d352ecbcdf66aeaf2f4d5ee34ec2a16e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d369358694599f549d17b6608d7d4ef0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d385e958e823d34ffa644b12c123f8bd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d3a36e6dbffb9f77a4422600c4daaaee', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d43af90f2f49f95f97f26d4de00fd1a0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d50b54cd06442de9609c13497cb2fc91', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d88d4f981d6d27ff0fe1c036d21c2fbc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('da4f67ded4052636058e1b4166991c36', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('da926083e03a4831be30889d5f3aa375', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('db1194dfdf39066a4715e6ed85f35665', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-16', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('dce5c9ba1078ae4ce8b32706a63f4070', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-29', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('dd1ed7f7f0a3168adc2628fd36aab063', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-23', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ddfdfasd', '8b25651c2d896297530b64e4b80ec503', 'adsf', '2014-02-12', 'adsf', 'fd', 'adsf');
INSERT INTO `t_loginlog` VALUES ('de88b1152dde86d1b9ee26870295be19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('deb25377d234afb2055b50e304f86253', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('deb6591f904db354ccc4aaef752752fc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e088bbed7cf37b0f41f673fc6549c087', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e08c00456bc9eb582b198a74b4820f42', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-27', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e0fafbef2f64de55d5f635e57db8e8ab', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e16e95784d2b509609e95f5a18f44b16', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e1bbe58344013f18651885db6ac348dc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e1d01b9d054f6d79f8941726ca2b88ac', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e2342b3cac04bc03fa7cc0620bc93683', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e3c6838a8b6669c55319e9cd4262c0f9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-03', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e4fdd642155e7da85a3df217dbed5039', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-30', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e597aa58db077907cfd5595699f907b2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e6b04a13679d33501de14c30e2e47427', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-31', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e7d08fd16626c4ed1af3b33295306e1a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-15', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e821a003e7f91853e284fc7364b71c92', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e84c12dfc104bd19948cc2183a57cba2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e9a46d128cf9dc59f9e02fcb9c63d55d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-02', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ea91d9ea39220d493f1324096e21e35c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-15', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('eb5e74c65c8f23d89df83690eca61709', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ebb17f9af834f5c03102eadee0d6d7e0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ebc96167ac536a605d36f9f8ec9c8262', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-21', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ecbbe4d16fc60943f12a5a8ef7efa093', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ed24499a96478c81c46efec85e4df897', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('eeb55a0e6c6864492dc7fcb2ff25f6e8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-22', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('eeee0dbcbf02ea8a6c31e9751e37fd3b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ef7e1e4528b6b2bb590c13d438f67981', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-14', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('eff1988239c4ab3cadb38063eb081942', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f02cbe1c9cfa66ea5f968861002382b7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-26', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f27041912452a36768912ddff79834de', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-03-25', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f28954f8f9ca092cf64f0e951bd40d82', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f2fb7ec484a6fbf17089ba04ae1ef6d2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f33ffd027a6bb438c9afa1d4d4c36c11', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-21', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f40b5cbfe3c42c18fd1812997299fe26', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-24', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f40bccec3dc8d569ad88327cf86a9c51', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-08', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f44ad9a16802d2b0bbf7870b52952a96', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f512ee7475ce73275369b5c6714d936f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f51f629e627f6109c3bbec53142c34b6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-06', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f7a1129cacd4b75249888ff187b041e9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-05-05', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f8442e87c0cc3de96d99f65502cde5ca', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f9623a1bb8b2f978a33cdd7255216b3d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-01', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f99793fabbd8b14e2b1969c00d8beeeb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-04', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f9eb726c12e4168f40cf3b9a231c17ae', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fb59b7f4a2d165a4fb6ab8bbd4257b96', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fc59ec807ae03061eaae4890e438d01a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-23', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fc6b5ad74096510aaba015113dd588f5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-24', '0:0:0:0:0:0:0:1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fcdf6af13a66aa142946ab20dd79495c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-04-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fdbd65fe418262eecc1798e8e1dd6899', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fe6caf01d07c49fc43d31d41bd0b354a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fe989c962250e8960952c5bb72acf3b5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ff44e803d0ef2bebc29471d88bed5638', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);

-- ----------------------------
-- Table structure for `t_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `member_id` varchar(32) NOT NULL COMMENT '会员Id',
  `member_name` varchar(20) default NULL COMMENT '会员名字',
  `member_password` varchar(64) default NULL COMMENT '会员密码',
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
INSERT INTO `t_member` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', 'zhagnsan', 'zhangsan', '张三', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140504/20140504100418_912.jpg', '25', '13411379365', 'man', 'single', '440583199110302853', 'cc@d.co', '2014-02-21 15:42:33', '20', '0', '300', 'enable', 'general', null, null, 'ccdd', '大专', 'ccddffee', 'ccddeeee', 'cceeffffee', '3242334', 'cc', 'friend', '13798985543', 'cc', 'cc', 'friend', '13798985543', 'cc', '2014-05-06 09:01:07', '127.0.0.1[本地]', '47', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-21 15:42:33', '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-04 10:04:19');
INSERT INTO `t_member` VALUES ('225b8f6a7863d52f947b265f869e48be', 'lisi', 'lisi', '李四', null, '23', '3242424', 'woman', 'married', '440583199110302853', '58454@qd.com', '2014-02-21 16:26:38', '0', '0', '300', 'enable', 'general', null, null, 'ee', 'ee', 'ee', 'ee', '34', '32434243', 'ee', 'family', '3242424', 'ee', 'ee', 'business', '3242424', 'ee', null, null, '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-21 16:26:38', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 14:38:11');
INSERT INTO `t_member` VALUES ('987166e483ea028eb355ec309aa3def0', '雨中', 'c2355a91280cba570dca2eae66043c85d5da375a', null, null, null, null, null, 'single', null, '04346249@qq.com', '2014-03-27 13:11:02', '0', '0', '300', null, null, null, null, null, null, null, null, null, null, null, 'family', null, null, null, 'family', null, null, null, null, '1', null, '987166e483ea028eb355ec309aa3def0', '2014-03-27 13:11:02', '987166e483ea028eb355ec309aa3def0', '2014-03-27 13:11:02');
INSERT INTO `t_member` VALUES ('c61da6243a471bfffbe3fd4101e41242', '哈哈', '4acf71a7c3b962c446e0b2d8ab504a840aae77bc', '你好啊', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140401/20140401105503_21.jpg', null, '13798985542', null, 'single', '440583199110302853', '804346249@qq.com', '2014-04-01 10:53:19', '0', '0', '300', null, null, null, null, null, null, '', '', '', '', '', 'family', '', '', '', 'family', '', '', null, null, '1', null, 'c61da6243a471bfffbe3fd4101e41242', '2014-04-01 10:53:19', 'c61da6243a471bfffbe3fd4101e41242', '2014-04-01 10:55:05');
INSERT INTO `t_member` VALUES ('f842fdbfe42190da7bea612a54debb31', '小泽', '36bf73f04cafa875716cff2556fa611d5b07fafe', '余泽徐', 'http://localhost:8080/netloan-website/resources/upload/attached/image/20140331/20140331091414_175.jpg', null, '13798985542', null, 'single', '440583199110302853', '04346249@qq.com', '2014-03-18 09:14:29', '30', '0', '300', null, null, null, null, null, null, '打篮球', 'aa', '珠海唐家', '', '', 'family', '', '', '', 'family', '', '', '2014-05-04 09:27:17', '127.0.0.1[本地]', '47', null, 'f842fdbfe42190da7bea612a54debb31', '2014-03-18 09:14:29', 'f842fdbfe42190da7bea612a54debb31', '2014-04-17 17:14:00');
INSERT INTO `t_member` VALUES ('fe0d9386ff19d3366901ab1bb1faa5c8', '123456', 'fe6b7d338bc001e0051623ff2e46ef215b02d6b0', null, null, null, null, null, 'married', null, '406592176@qq.com', '2014-04-30 15:01:21', '0', '0', '300', 'enable', 'general', null, null, null, null, null, null, null, null, null, 'family', null, null, null, 'family', null, null, '2014-04-30 15:01:39', '0:0:0:0:0:0:0:1[本地]', '2', null, 'fe0d9386ff19d3366901ab1bb1faa5c8', '2014-04-30 15:01:21', 'fe0d9386ff19d3366901ab1bb1faa5c8', '2014-04-30 15:01:21');

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
INSERT INTO `t_member_apply_amount` VALUES ('1dfrb66d4cdde4bb7f961bbcec9dfc0', '0d06ae74d5a50659c4c40d4ee980a748', 'internet', '10000.00', '2000.00', '审核额度', null, 'authstr', null, '2014-02-24 15:18:43', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:18:38', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:18:36');
INSERT INTO `t_member_apply_amount` VALUES ('34321b66d4cdde4bb7f961bbcec9dfc0', '0d06ae74d5a50659c4c40d4ee980a748', 'phone', '12000.00', '5000.00', '说明：请审核。', '4000.00', 'pass', '只能同意4000申请', '2014-02-24 13:32:23', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:32:27', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:56:26', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:56:28');
INSERT INTO `t_member_apply_amount` VALUES ('4bd5a88d7432d0492af29a69a50f7c2f', 'f842fdbfe42190da7bea612a54debb31', 'internet', '300.00', '2000.00', '2000', null, 'authstr', null, '2014-04-01 15:09:13', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:09:13', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:09:13');
INSERT INTO `t_member_apply_amount` VALUES ('61ba16cc6f5cccce88b8c56882f1b430', 'f842fdbfe42190da7bea612a54debb31', 'internet', '300.00', '1000.00', '1000', null, 'authstr', null, '2014-04-01 15:06:47', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:06:47', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:06:47');
INSERT INTO `t_member_apply_amount` VALUES ('6e6e7695c4266c3dbbc4be57863302ff', 'f842fdbfe42190da7bea612a54debb31', 'internet', '300.00', '10000.00', '10000', null, 'authstr', null, '2014-04-01 16:28:57', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 16:28:57', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 16:28:57');
INSERT INTO `t_member_apply_amount` VALUES ('ccad05006a060ccd658e7ca0a3aa1bad', 'f842fdbfe42190da7bea612a54debb31', 'internet', '300.00', '5000.00', '5000', null, 'authstr', null, '2014-04-01 15:10:20', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:10:20', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:10:20');
INSERT INTO `t_member_apply_amount` VALUES ('de43309800345a2984f12279515e023e', '0d06ae74d5a50659c4c40d4ee980a748', 'internet', '20000.00', '10000.00', '请通过。', '8000.00', 'pass', '同意8000', '2014-02-24 15:15:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:16:19', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:15:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:15:39');
INSERT INTO `t_member_apply_amount` VALUES ('dsafasdfasdffds', 'f842fdbfe42190da7bea612a54debb31', 'internet', '10000.00', '10000.00', '阿斯蒂芬', '10000.00', 'pass', '审核通过', '2014-04-02 09:57:35', '8b25651c2d896297530b64e4b80ec503', '2014-04-03 17:22:12', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-02 09:57:49', '8b25651c2d896297530b64e4b80ec503', '2014-04-03 17:22:12');
INSERT INTO `t_member_apply_amount` VALUES ('e5073cf57b1e048fd404c756f02383d0', 'f842fdbfe42190da7bea612a54debb31', 'internet', '300.00', '300.00', '300', null, 'authstr', null, '2014-04-01 15:10:02', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:10:02', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:10:02');
INSERT INTO `t_member_apply_amount` VALUES ('f6e07c7fab7ed3d5dc550637a4b10df0', 'f842fdbfe42190da7bea612a54debb31', 'internet', '300.00', '8000.00', '提交审核。', null, 'authstr', null, '2014-04-01 15:12:53', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:12:53', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 15:12:53');
INSERT INTO `t_member_apply_amount` VALUES ('f842fdbfe42190da7bea612a54debb31', 'f842fdbfe42190da7bea612a54debb31', 'internet', '300.00', '1000.00', '1000', null, 'authstr', null, '2014-04-01 14:59:20', null, null, null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 14:59:20', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 14:59:20');

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
INSERT INTO `t_member_auth` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', '基本信息认证', 'failure', 'aaaaa', '8b25651c2d896297530b64e4b80ec503', 'aaa', '2014-04-14 16:46:43', '1', 'VIP认证', 'failure', 'aaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 16:46:12', '1', '邮箱认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:42', '1', '手机认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:24', '1', '信用认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 13:37:04', '1', '企业认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 13:35:35', '1', '真实姓名认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-04-14 16:46:32', '1', '身份证认证', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140325/20140325170450_46.jpg\" title=\"yd.jpg\" alt=\"yd.jpg\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140325/20140325170458_216.jpg\" title=\"ty.jpg\" alt=\"ty.jpg\" /><br />', 'pass', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:58', '2', '工作认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:42', '1');
INSERT INTO `t_member_auth` VALUES ('225b8f6a7863d52f947b265f869e48be', '基本信息认证', 'pass', 'aaaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:00', '2', 'VIP认证', 'authstr', 'aaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:29', '2', '邮箱认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:45', '2', '手机认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:24:27', '2', '信用认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:56', '2', '企业认证', 'failure', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:39', '2', '真实姓名认证', 'pass', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:23', '2', '身份证认证', 'aaaa', 'pass', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:23:00', '1', '工作认证', 'noapply', 'aaaa', '8b25651c2d896297530b64e4b80ec503', 'aaaa', '2014-02-25 16:22:45', '2');
INSERT INTO `t_member_auth` VALUES ('987166e483ea028eb355ec309aa3def0', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, null, null, '2014-03-27 13:11:02', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);
INSERT INTO `t_member_auth` VALUES ('c61da6243a471bfffbe3fd4101e41242', '基本信息认证', 'noapply', null, null, null, null, null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, null, null, '2014-04-01 10:53:19', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', null, 'noapply', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);
INSERT INTO `t_member_auth` VALUES ('f842fdbfe42190da7bea612a54debb31', '基本信息认证', 'failure', null, '8b25651c2d896297530b64e4b80ec503', '审核通过', '2014-04-04 13:34:07', null, 'VIP认证', 'noapply', '', null, '', null, null, '邮箱认证', 'pass', '', null, '', '2014-03-18 09:14:29', null, '手机认证', 'noapply', '', null, '', null, null, '信用认证', 'pass', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140327/20140327144627_148.jpg\" title=\"yd.jpg\" alt=\"yd.jpg\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140327/20140327144656_862.jpg\" title=\"sq.jpg\" alt=\"sq.jpg\" />', '8b25651c2d896297530b64e4b80ec503', '审核通过 ', '2014-04-02 17:36:16', null, '企业认证', 'pass', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140326/20140326175838_258.jpg\" title=\"tangwei.jpg\" alt=\"tangwei.jpg\" />', '8b25651c2d896297530b64e4b80ec503', '审核通过', '2014-03-27 11:09:38', null, '真实姓名认证', 'noapply', '', null, '', null, null, '身份证认证', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140326/20140326095412_606.jpg\" title=\"gd.jpg\" alt=\"gd.jpg\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140326/20140326095421_443.jpg\" title=\"fbb.jpg\" alt=\"fbb.jpg\" /><br />', 'pass', '8b25651c2d896297530b64e4b80ec503', '审核通过', '2014-03-26 17:57:34', null, '工作认证', 'failure', '', '8b25651c2d896297530b64e4b80ec503', '审核不通过', '2014-04-04 13:44:51', null);
INSERT INTO `t_member_auth` VALUES ('fe0d9386ff19d3366901ab1bb1faa5c8', '基本信息认证', 'noapply', null, 'fe0d9386ff19d3366901ab1bb1faa5c8', null, '2014-04-30 15:02:22', null, 'VIP认证', 'noapply', null, null, null, null, null, '邮箱认证', 'pass', null, '8b25651c2d896297530b64e4b80ec503', '邮箱验证通过', '2014-04-30 15:01:21', null, '手机认证', 'noapply', null, null, null, null, null, '信用认证', 'noapply', null, null, null, null, null, '企业认证', 'noapply', null, null, null, null, null, '真实姓名认证', 'noapply', null, null, null, null, null, '身份证认证', '<img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150202_74.png\" alt=\"\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150208_364.jpg\" alt=\"\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150213_558.jpg\" alt=\"\" /><img src=\"http://localhost:8080/netloan-website/resources/upload/attached/image/20140430/20140430150216_8.jpeg\" alt=\"\" />', 'authstr', null, null, null, null, '工作认证', 'noapply', null, null, null, null, null);

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
INSERT INTO `t_member_credit_integral` VALUES ('146231981fcbd8d4d91413654417623c', '0d06ae74d5a50659c4c40d4ee980a748', 'companyAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:35:35', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:35:35');
INSERT INTO `t_member_credit_integral` VALUES ('2a48b995f06e8c1a27fbf6bacf63794d', '0d06ae74d5a50659c4c40d4ee980a748', 'realNameAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32');
INSERT INTO `t_member_credit_integral` VALUES ('4227abe292af03d1dff9fb22cf10482c', 'c61da6243a471bfffbe3fd4101e41242', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-01 10:53:19', '8b25651c2d896297530b64e4b80ec503', '2014-04-01 10:53:19');
INSERT INTO `t_member_credit_integral` VALUES ('7c4beb512df1ac0b1f5346607d5ca552', 'f842fdbfe42190da7bea612a54debb31', 'creditAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-02 17:36:16', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 17:36:16');
INSERT INTO `t_member_credit_integral` VALUES ('b295d1c6d240cc58bac45bf12ff99057', '987166e483ea028eb355ec309aa3def0', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-27 13:11:02', '8b25651c2d896297530b64e4b80ec503', '2014-03-27 13:11:02');
INSERT INTO `t_member_credit_integral` VALUES ('cb93d2b09155200129ab96d8b3559055', 'fe0d9386ff19d3366901ab1bb1faa5c8', 'emailAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21', '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21');
INSERT INTO `t_member_credit_integral` VALUES ('d6c618dd7d4748481ca71e45b1d99050', 'f842fdbfe42190da7bea612a54debb31', 'idCardAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:57:34', '8b25651c2d896297530b64e4b80ec503', '2014-03-26 17:57:34');
INSERT INTO `t_member_credit_integral` VALUES ('dswe75465g44ty43345', '225b8f6a7863d52f947b265f869e48be', 'emailAuth', 'reduction', '5', '投资获取信用积分5', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:04:52', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:04:50');
INSERT INTO `t_member_credit_integral` VALUES ('e3699ea8806e321755137456d992d85a', '0d06ae74d5a50659c4c40d4ee980a748', 'creditAuth', 'increase', '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:37:04', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 13:37:04');
INSERT INTO `t_member_credit_integral` VALUES ('hd5675465g44ty435y5y', '0d06ae74d5a50659c4c40d4ee980a748', 'emailAuth', 'increase', '2', '借款获得信用积分2', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 17:41:48', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 17:41:50');

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
INSERT INTO `t_member_estate` VALUES ('sdfsdf3432sc32', '0d06ae74d5a50659c4c40d4ee980a748', '广东省珠海市', '100.00', '2014-02-22 17:16:55', 'mortgage', '小李', '张三', '2014-02-22 17:17:01', '2000.00', '5000.00', '工商银行', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 16:26:25', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 16:10:22');

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
  `type` enum('login','borrow','invest') default NULL COMMENT '积分类型',
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
INSERT INTO `t_member_integral` VALUES ('afdsasfd', 'f842fdbfe42190da7bea612a54debb31', 'login', 'increase', '1', '登录积分', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:33:03', '8b25651c2d896297530b64e4b80ec503', '2014-03-24 16:34:51');
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
INSERT INTO `t_member_message_notice` VALUES ('177b246773a4a6431e798710da2662a3', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '真实姓名认证审核通知', '您的真实姓名认证审核状况:通过', '2014-04-14 16:46:32', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:32');
INSERT INTO `t_member_message_notice` VALUES ('2c07a4ebc9660b4b1d4eef004caf6f9f', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '基本信息认证审核通知', '您的基本信息认证审核状况:不通过', '2014-04-14 16:46:43', 'read', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:43', '8b25651c2d896297530b64e4b80ec503', '2014-04-17 17:38:43');
INSERT INTO `t_member_message_notice` VALUES ('81e2abd52cc81171372f7498e956d9fc', '8b25651c2d896297530b64e4b80ec503', 'fe0d9386ff19d3366901ab1bb1faa5c8', '邮箱认证审核通知', '您的邮箱认证审核状况:通过', '2014-04-30 15:01:21', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21', '8b25651c2d896297530b64e4b80ec503', '2014-04-30 15:01:21');
INSERT INTO `t_member_message_notice` VALUES ('aa57327c618b8595f0ec75c417b9662e', '8b25651c2d896297530b64e4b80ec503', 'f842fdbfe42190da7bea612a54debb31', '基本资料审核通知', '					\r\n		审核通过，信用分10分。		', '2014-04-09 17:16:17', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-09 17:16:17', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 17:16:17');
INSERT INTO `t_member_message_notice` VALUES ('c812a24cf91ed5fa3c9a45299eebb014', '8b25651c2d896297530b64e4b80ec503', 'f842fdbfe42190da7bea612a54debb31', '哈哈', '										你懂的					\r\n				\r\n				\r\n				', '2014-04-09 17:15:13', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-09 17:15:13', '8b25651c2d896297530b64e4b80ec503', '2014-04-10 09:02:37');
INSERT INTO `t_member_message_notice` VALUES ('fca3884ceb353a7ed9df7d730a12d77a', '8b25651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', 'VIP认证审核通知', '您的VIP认证审核状况:不通过', '2014-04-14 16:46:12', 'unread', 'system', null, '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:12', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:46:12');

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
INSERT INTO `t_member_secret_security` VALUES ('c874113c698a7215ba84fc754615be47', '832ff47c0d30120d30a93cc6921c0ee0', 'f842fdbfe42190da7bea612a54debb31', '东中', null, null, '2014-04-17 16:08:52', null, '2014-04-17 16:08:52');
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
  `borrow_success` int(10) default NULL COMMENT '借款成功次数',
  `normal_repayment` int(10) default NULL COMMENT '正常还款次数',
  `advance_repayment` int(10) default NULL COMMENT '提前还款次数',
  `late_repayment` int(10) default NULL COMMENT '逾期还款次数',
  `late` int(10) default NULL COMMENT '迟还次数',
  `website_substitute` int(10) default NULL COMMENT '网站代还次数',
  `investment_total` float(20,2) default NULL COMMENT '投资总额',
  `tender_awards` float(20,2) default NULL COMMENT '投标奖励',
  `already_income_total` float(20,2) default NULL COMMENT '已收总额',
  `wait_income_total` float(20,2) default NULL COMMENT '待收总额',
  `promotion_awards` float(20,2) default NULL COMMENT '推广奖励',
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
INSERT INTO `t_member_statistics` VALUES ('25dd51c2d896297530b64e4b80ec503', '225b8f6a7863d52f947b265f869e48be', '10000.00', '20000.00', '50000.00', '1000.00', '10', '8', '4', '47', '17', '10', '10000.00', '20000.00', '50000.00', '5000.00', '1000.00', '40000.00', '2000.00', null, null, null, null);
INSERT INTO `t_member_statistics` VALUES ('3455651c2d896297530b64e4b80ec503', '0d06ae74d5a50659c4c40d4ee980a748', '11.00', '22.00', '33.00', '44.00', '55', '66', '77', '88', '99', '11', '22.00', '33.00', '445.00', '55.00', '66.00', '77.00', '88.00', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 13:04:08', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 13:04:11');

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
INSERT INTO `t_member_token` VALUES ('987166e483ea028eb355ec309aa3def0', '雨中', 'c2355a91280cba570dca2eae66043c85d5da375a', '11b53e365e90d878');
INSERT INTO `t_member_token` VALUES ('c61da6243a471bfffbe3fd4101e41242', '哈哈', '4acf71a7c3b962c446e0b2d8ab504a840aae77bc', '00787498f9beebb2');
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
INSERT INTO `t_member_work` VALUES ('0d06ae74d5a50659c4c40d4ee980a748', 'asd', '1234567', 'adsf', '32', '23', 'd', '13798985542');
INSERT INTO `t_member_work` VALUES ('225b8f6a7863d52f947b265f869e48be', 'as', '32', 'sda', '23', '3', 'ds', '23323');
INSERT INTO `t_member_work` VALUES ('987166e483ea028eb355ec309aa3def0', null, null, null, null, null, null, null);
INSERT INTO `t_member_work` VALUES ('c61da6243a471bfffbe3fd4101e41242', '冰川', '', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('f842fdbfe42190da7bea612a54debb31', 'aa', '', '', null, null, '', '');
INSERT INTO `t_member_work` VALUES ('fe0d9386ff19d3366901ab1bb1faa5c8', null, null, null, null, null, null, null);

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
INSERT INTO `t_menu` VALUES ('054464fdb73c76b5cfd4efa16fcaa8e1', '14sdf54157cf483a790f4eea35dsf6f6', 'creditType', '信用类别', 'icon-standard-award-star-silver-1', '/do/creditType/index.htm', '27', '');
INSERT INTO `t_menu` VALUES ('079cecd38fb5df02ed6e4d84446d072e', 'fefe8e9ee335dadbace082923415e023', 'memberFinance', '会员财务', 'icon-standard-building-delete', '/do/memberFinance/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('10a7f2fd8253d90b8672d4096f8f9ed4', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'loanTender', '标种类型', 'icon-standard-package', '/do/loanTender/index.htm', '17', '');
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('185b00f80aaa910fa99d9abc99c84d58', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'LoanReview', '借款留言', 'icon-standard-application-double', '/do/LoanReview/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('31a605c2a2a777c738a09103b9915615', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingLoanSecAudit', '满标借款', 'icon-standard-money-euro', '/do/borrowingLoan/borrowingLoanSecAudit.htm', '13', '');
INSERT INTO `t_menu` VALUES ('33f5e9959e821a58696e2d2fb5c322fc', '14sdf54157cf483a790f4eea35dsf6f6', 'question', '密保问题', 'icon-standard-application-home', '/do/question/index.htm', '33', '');
INSERT INTO `t_menu` VALUES ('3775cc8c3044650697dbb4d8636b5464', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingOverdue', '逾期借款', 'icon-standard-clock-red', '/do/borrowingLoan/borrowingOverdue.htm', '15', '');
INSERT INTO `t_menu` VALUES ('389f33c7b34582376d4d99282faa03b9', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'repaymentType', '还款方式', 'icon-standard-money', '/do/repaymentType/index.htm', '18', '');
INSERT INTO `t_menu` VALUES ('3f029e72ef13db56e8b65866984da722', 'b67d550a506255816d54840a853b7a46', 'withdraw', '提现记录', 'icon-cologne-sign-out', '/do/withdraw/index.htm', '4', '');
INSERT INTO `t_menu` VALUES ('4c654b11b08eecbf6eb4e6688ea83b7d', 'fefe8e9ee335dadbace082923415e023', 'member', '会员信息', 'icon-standard-user', '/do/member/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('4f1b6666b70be892469b6e93c1eb30ce', 'a60cca184eff20fdce88b3f1ab5a9cce', 'nav', '导航信息', 'icon-standard-application-view-list', '/do/nav/index.htm', '31', '');
INSERT INTO `t_menu` VALUES ('54d652799e07bb8be54483301a89ff90', 'a60cca184eff20fdce88b3f1ab5a9cce', 'help', '帮助中心', 'icon-hamburg-config', '/do/help/index.htm', '37', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '12', null);
INSERT INTO `t_menu` VALUES ('5b6eaabb2c3a020c4d85ab50d11ffd85', 'a60cca184eff20fdce88b3f1ab5a9cce', 'link', '友情链接', 'icon-hamburg-world', '/do/link/index.htm', '35', '');
INSERT INTO `t_menu` VALUES ('5db451044c71b4eb5448a4291d538241', 'b67d550a506255816d54840a853b7a46', 'bankCard', '会员银行卡', 'icon-cologne-payment-card', '/do/bankCard/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('6460c4e2cb89b498712c96e9b4d1acce', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingLoan', '所有借款', 'icon-standard-money-dollar', '/do/borrowingLoan/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('6b44218344d328305de2bcdf82cb8741', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'tenderNotes', '投标记录', 'icon-standard-anchor', '/do/tenderNotes/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('703a3f819925f89a9c370c0324d784a0', 'fefe8e9ee335dadbace082923415e023', 'messageNotice', '信息通知', 'icon-standard-email', '/do/messageNotice/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('88ee044d59911b3b1a67ba4cdd0ee90d', 'a60cca184eff20fdce88b3f1ab5a9cce', 'announcement', '公告管理', 'icon-standard-feed', '/do/announcement/index.htm', '32', '');
INSERT INTO `t_menu` VALUES ('8b442566ffbc9531ee5e3aef7c41d740', 'fefe8e9ee335dadbace082923415e023', 'memberAuth', '会员认证', 'icon-standard-bell', '/do/memberAuth/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('8b4c5afb8d66b21e8900822c5c6bff35', 'b67d550a506255816d54840a853b7a46', 'recharge', '充值记录', 'icon-cologne-sign-in', '/do/recharge/index.htm', '3', '');
INSERT INTO `t_menu` VALUES ('9171c71b4bab5578ef0bbeac30072c73', 'fefe8e9ee335dadbace082923415e023', 'memberStatistics', '会员统计', 'icon-cologne-attibutes', '/do/memberStatistics/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-standard-user-orange', '/do/user/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '26', '');
INSERT INTO `t_menu` VALUES ('93f6161c579a1df53d49eb2655d29645', 'fefe8e9ee335dadbace082923415e023', 'creditIntegral', '信用记录', 'icon-standard-asterisk-yellow', '/do/creditIntegral/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('9dc3357651c9ecbb9b7c51005be28d18', 'fefe8e9ee335dadbace082923415e023', 'secretSecurity', '密保管理', 'icon-standard-application-key', '/do/secretSecurity/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('a60cca184eff20fdce88b3f1ab5a9cce', null, 'website', '网站管理', 'icon-standard-color-wheel', '', '3', '');
INSERT INTO `t_menu` VALUES ('a652d3fe69c067cb94b73361351b8378', 'a60cca184eff20fdce88b3f1ab5a9cce', 'news', '新闻管理', 'icon-standard-monitor', '/do/news/index.htm', '34', '');
INSERT INTO `t_menu` VALUES ('a99477bf949bcae7143004e369d31d6c', 'b67d550a506255816d54840a853b7a46', 'rechargeSet', '充值设置', 'icon-cologne-product-design', '/do/rechargeSet/index.htm', '2', '');
INSERT INTO `t_menu` VALUES ('ab01dd2ac38d920f691bbc65b7a4bfb2', 'a60cca184eff20fdce88b3f1ab5a9cce', 'hiring', '招聘信息', 'icon-hamburg-customers', '/do/hiring/index.htm', '38', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-application-view-detail', '/do/operalog/index.htm', '14', '');
INSERT INTO `t_menu` VALUES ('ae024ce004991607d5ae9e725d67cce8', 'fefe8e9ee335dadbace082923415e023', 'applyAmount', '申请额度', 'icon-standard-star', '/do/applyAmount/index.htm', '1', '');
INSERT INTO `t_menu` VALUES ('b34761b59816e63743643c6f179683a4', 'a60cca184eff20fdce88b3f1ab5a9cce', 'advertisement', '广告管理', 'icon-standard-bell', '/do/advertisement/index.htm', '33', '');
INSERT INTO `t_menu` VALUES ('b67d550a506255816d54840a853b7a46', null, 'finance', '财务管理', 'icon-standard-money-dollar', '', '1', '');
INSERT INTO `t_menu` VALUES ('c3c78541e9041ab6659fd3399aa6445b', 'b67d550a506255816d54840a853b7a46', 'financeMember', '会员资金', 'icon-cologne-suppliers', 'do/financeMember/index.htm', '5', '');
INSERT INTO `t_menu` VALUES ('c58c25c6cb2e8d9fdf39493dde51d80d', null, 'borrow', '我要借款', 'icon-standard-award-star-gold-3', '', '3', '');
INSERT INTO `t_menu` VALUES ('c5cbf9f0961aa8249322d9ac20ba996e', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'borrowingLoanFirstAudit', '初审借款', 'icon-standard-money-pound', '/do/borrowingLoan/borrowingLoanFirstAudit.htm', '12', '');
INSERT INTO `t_menu` VALUES ('d31f853097d3bd74741d6418f6a2c7d5', 'b67d550a506255816d54840a853b7a46', 'transaction', '记录明细', 'icon-cologne-collaboration', '/do/transaction/index.htm', '6', '');
INSERT INTO `t_menu` VALUES ('d503136bdab7bbdc8d09f3bbb28fa979', null, 'info', '信息管理', 'icon-standard-application-view-tile', '', '4', '');
INSERT INTO `t_menu` VALUES ('d60a6e3369f1b7fdb249aa61ba4add6e', 'c58c25c6cb2e8d9fdf39493dde51d80d', 'gatheringRepayment', '收款还款', 'icon-standard-clock', '/do/borrowingLoan/gatheringRepayment.htm', '14', '');
INSERT INTO `t_menu` VALUES ('de34654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'area', '地区管理', 'icon-hamburg-link', '/do/area/index.htm', '23', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-application-view-list', '/do/loginlog/index.htm', '13', '');
INSERT INTO `t_menu` VALUES ('e4d2578abb2e36eb4aea5fa8caed2a51', 'fefe8e9ee335dadbace082923415e023', 'memberIntegral', '积分记录', 'icon-standard-award-star-gold-2', '/do/memberIntegral/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-standard-status-online', '/do/role/index.htm', '11', null);
INSERT INTO `t_menu` VALUES ('e75a41ba4a2bc299e3b50a15580a103b', 'a60cca184eff20fdce88b3f1ab5a9cce', 'service', '客服服务', 'icon-cologne-customers', '/do/service/index.htm', '36', '');
INSERT INTO `t_menu` VALUES ('f15eee7156a6e9821ad60ea9747b6878', 'fefe8e9ee335dadbace082923415e023', 'estate', '房产信息', 'icon-standard-flag-yellow', '/do/estate/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('fefe8e9ee335dadbace082923415e023', null, 'member_mgr', '会员管理', 'icon-standard-group', '', '10', '');
INSERT INTO `t_menu` VALUES ('sdeg454c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'integral', '会员积分', 'icon-standard-tag-blue', '/do/integral/index.htm', '24', '');
INSERT INTO `t_menu` VALUES ('sdsfeg4157cf483a790f4eea35ds5675', '14sdf54157cf483a790f4eea35dsf6f6', 'optgroup', '下拉项管理', 'icon-hamburg-sitemap', '/do/optgroup/index.htm', '25', '');
INSERT INTO `t_menu` VALUES ('t110147c5e6c1e94ee70cc833aa7f5d3', '14sdf54157cf483a790f4eea35dsf6f6', 'age', '年龄别称', 'icon-standard-hourglass', '/do/age/index.htm', '22', '');
INSERT INTO `t_menu` VALUES ('v465654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'credit', '会员信用', 'icon-standard-award-star-gold-3', '/do/credit/index.htm', '21', '');

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
INSERT INTO `t_operalog` VALUES ('0080b72113a4b71bf4c0140f96eb3ce4', '下拉项管理', '下拉列表', '修改', '1', '[基本信息认证信用积分] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-03-25 16:56:36');
INSERT INTO `t_operalog` VALUES ('00ba4ed3494a299e4c3e4b136b4b51c9', '资源管理', '菜单树', '增加', '1', '[密保管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-16 13:47:53');
INSERT INTO `t_operalog` VALUES ('00f4b84d986bf0c48c11256e6fec8288', '还款方式', '还款方式列表', '增加', '1', '[dsf] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:14:45');
INSERT INTO `t_operalog` VALUES ('00ff50dd575259086eea8a6c524d6aa3', '下拉项管理', '下拉项树', '增加', '1', '[财务管理] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-05-05 13:33:03');
INSERT INTO `t_operalog` VALUES ('0121fe461b6fa51cef0826354f00d313', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-18 10:53:10');
INSERT INTO `t_operalog` VALUES ('0162e7430896129a0d4667b9d32cf930', '资源管理', '菜单树', '增加', '1', '[记录明细] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-05-05 10:14:53');
INSERT INTO `t_operalog` VALUES ('01738a3c8619d9c19a0b0a2f9a4e4bf4', '下拉项管理', '下拉项树', '修改', '1', '[开启关闭] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-04-15 16:02:07');
INSERT INTO `t_operalog` VALUES ('0198847ed18470941f89b70229333c8f', '资源管理', '面板列表', '增加', '1', '[密保列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-16 13:48:25');
INSERT INTO `t_operalog` VALUES ('01ec2b9c17c0f90c158dd7e0ef2140b8', '下拉项管理', '下拉列表', '增加', '1', '[未读] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-09 14:10:34');
INSERT INTO `t_operalog` VALUES ('021240519608eb2e5e2c493c0f3c326c', '密保问题', '问题列表', '增加', '1', '[您高中学校校名？] 密保问题信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'addParameterQuestion', 'QuestionList_add', '超级管理员', '2014-04-16 10:20:20');
INSERT INTO `t_operalog` VALUES ('0231ffb7503a7692ade2c1752f5d52df', '资源管理', '操作列表', '编辑', '1', '[复审] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-18 13:28:55');
INSERT INTO `t_operalog` VALUES ('026d04c9a1bdbe3b13334b1f20396214', '下拉项管理', '下拉项树', '增加', '0', '下拉项名称重复', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-14 16:43:18');
INSERT INTO `t_operalog` VALUES ('02c6633d9987d3962c8a3461ec97b8e8', '资源管理', '菜单树', '增加', '0', '英文名称重复', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-22 14:50:19');
INSERT INTO `t_operalog` VALUES ('03ab64d4f2daadbf5377ea008af728b3', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-24 09:49:35');
INSERT INTO `t_operalog` VALUES ('03b00188bde8a83cf30778e9159c7007', '会员信用', '信用列表', '修改', '1', '[二级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 15:25:55');
INSERT INTO `t_operalog` VALUES ('03ce4b803a42399f177607cea9d1064f', '下拉项管理', '下拉项树', '增加', '1', '[会员类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-21 10:24:04');
INSERT INTO `t_operalog` VALUES ('048eadc5b149ffcd191c66dbbf362c5e', '招聘信息', '招聘列表', '增加', '1', '[ggggg] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-24 15:29:33');
INSERT INTO `t_operalog` VALUES ('04b36d65fba206919803df37fb75f9ac', '下拉项管理', '下拉项树', '修改', '1', '[开启关闭] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-04-15 16:02:17');
INSERT INTO `t_operalog` VALUES ('058b6112a0276e84a249a4996d0a1de0', '下拉项管理', '下拉列表', '增加', '1', '[内置] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 16:31:13');
INSERT INTO `t_operalog` VALUES ('0591859706d9cfac2274207ff739135c', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.netloan.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-02-19 17:56:04');
INSERT INTO `t_operalog` VALUES ('0597579bd3057033db4c56467ec19581', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 18:00:19');
INSERT INTO `t_operalog` VALUES ('05a0ceef47727b489ffff31dbfff6509', '新闻管理', '新闻列表', '增加', '0', '新闻主题重复', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-14 10:22:56');
INSERT INTO `t_operalog` VALUES ('05e93db92c2533184902b7c9c7b3cfdd', '角色管理', '角色列表', '修改', '0', '英文名称重复，请重新填写!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('05fa8815f7bd04a6dcb2c2a5660ce39c', '资源管理', '菜单树', '增加', '1', '[信用记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-22 15:11:44');
INSERT INTO `t_operalog` VALUES ('06027b4e8a0446e0d803afcb0f91c111', '帮助中心', '帮助列表', '修改', '1', '[sfew] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-24 15:17:44');
INSERT INTO `t_operalog` VALUES ('06d579ee32b0477022ebc5f793c707ea', '会员积分', '积分列表', '增加', '1', '[水电费] 会员积分级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'addParameterIntegral', 'IntegralList_add', '超级管理员', '2014-02-22 09:16:27');
INSERT INTO `t_operalog` VALUES ('07333344696927255399e7573da71d0b', '广告管理', '广告列表', '增加', '1', '[uiuiu] 广告信息已保存', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-02-22 09:07:54');
INSERT INTO `t_operalog` VALUES ('0775eb508d76f4536753ac2bbd7b1848', '资源管理', '菜单树', '修改', '1', '[登录日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:50:40');
INSERT INTO `t_operalog` VALUES ('077a458894ab733d68789b56f4a81d6c', '会员信用', '信用列表', '修改', '1', '[三级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:18:25');
INSERT INTO `t_operalog` VALUES ('077dd108e672da5e708a8074f0c30d31', '下拉项管理', '下拉列表', '增加', '1', '[家人] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 11:03:56');
INSERT INTO `t_operalog` VALUES ('07b4112c82d9e36c87801c0b1f8aa934', '资源管理', '面板列表', '增加', '1', '[借款列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-18 10:12:42');
INSERT INTO `t_operalog` VALUES ('080f3452f6a8148af507fe21fab84f8d', '下拉项管理', '下拉项树', '增加', '1', '[帮助中心类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-18 10:59:38');
INSERT INTO `t_operalog` VALUES ('08d291fa08ea40daf48f22d86907cfa3', '下拉项管理', '下拉列表', '增加', '1', '[投资] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 11:06:45');
INSERT INTO `t_operalog` VALUES ('08d364211d496152c13dd9c572f9e635', '会员信用', '信用列表', '增加', '1', '[啊的] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-02-19 10:18:37');
INSERT INTO `t_operalog` VALUES ('08e590917d9c942e2e32d2d2093022a8', '会员信用', '信用列表', '修改', '1', '[五级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-31 10:25:31');
INSERT INTO `t_operalog` VALUES ('08fb8d135ad9bf9b490532c35ad07f39', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:16');
INSERT INTO `t_operalog` VALUES ('0936d0479b441c25d94123b93314cd89', '信用类别', '信用类别列表', '增加', '1', '[asdf] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 16:25:56');
INSERT INTO `t_operalog` VALUES ('096746b668e7e6e9e86d063e938973b3', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-09 14:15:38');
INSERT INTO `t_operalog` VALUES ('09924c2f302d62efbb5a8d71c8b44fbf', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-04 16:50:14');
INSERT INTO `t_operalog` VALUES ('0ac3ba40d09e7e8ac5c183a4d85280c7', '下拉项管理', '下拉列表', '增加', '1', '[女] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:55:01');
INSERT INTO `t_operalog` VALUES ('0b1d1ad49a98602b89f702fe5a51debe', '标种类型', '标种类型列表', '增加', '1', '[净值标] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addLoanTender', 'LoanTenderList_add', '超级管理员', '2014-04-23 15:13:50');
INSERT INTO `t_operalog` VALUES ('0b20a293c6e323d0afd239961da1fa46', '下拉项管理', '下拉列表', '增加', '1', '[复审中] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:06:34');
INSERT INTO `t_operalog` VALUES ('0b4529dea580c32905c8eaaf24bd19b0', '会员积分', '积分列表', '修改', '1', '[的萨芬] 会员积分级别信息已修改保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'editParameterIntegral', 'IntegralList_edit', '超级管理员', '2014-02-18 16:39:54');
INSERT INTO `t_operalog` VALUES ('0b52e4dea5ca1600d139b81b6b3af7c7', '公告管理', '公告列表', '修改', '1', '[元宵节快乐，聚餐去。] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-02-22 09:25:47');
INSERT INTO `t_operalog` VALUES ('0c2b01b27d00183459f6818e67681fb1', '友情链接', '友情列表', '增加', '1', '[中移电子商务有限公司] 友情链接信息已保存', 'com.glacier.netloan.service.website.WebsiteLinkService', 'addLink', 'LinkList_add', '超级管理员', '2014-03-14 10:43:55');
INSERT INTO `t_operalog` VALUES ('0c2d0df14464071f8e34ffbb61a56ccc', '还款方式', '还款方式列表', '增加', '0', '还款方式编号重复', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:26:08');
INSERT INTO `t_operalog` VALUES ('0c7f7212ff3c38944d4d94f3ba4cb505', '资源管理', '菜单树', '修改', '1', '[财务管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-04 16:40:58');
INSERT INTO `t_operalog` VALUES ('0d80706cc5263b573a097fea23f3ecd5', '下拉项管理', '下拉项树', '增加', '1', '[表单类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-17 16:19:08');
INSERT INTO `t_operalog` VALUES ('0dd4b918c0347d7f11947968be257acd', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-05 10:21:12');
INSERT INTO `t_operalog` VALUES ('0e0a7eed1cc843c3ae59dd5686e9ec28', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:32:27');
INSERT INTO `t_operalog` VALUES ('0e43ce81c4a937c0c204d491c87fa84f', '下拉项管理', '下拉项树', '增加', '1', '[供款状况] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-24 10:49:08');
INSERT INTO `t_operalog` VALUES ('100831697eccf3454e7a89a7b7eeac26', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-24 13:47:32');
INSERT INTO `t_operalog` VALUES ('1052f33d9196f141401a3b0fd17282c0', '信用类别', '信用类别列表', '增加', '0', '信用积分类型重复', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:05:08');
INSERT INTO `t_operalog` VALUES ('10a12ed99b845cd44b3089de252ec99e', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-17 08:52:29');
INSERT INTO `t_operalog` VALUES ('10a82d891476867c1b77473da9893d4d', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-05 14:49:09');
INSERT INTO `t_operalog` VALUES ('10baeea61bd0dc4ae9f35dbda20be193', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-10 15:18:41');
INSERT INTO `t_operalog` VALUES ('10e922c04896799ac1c4631169ed042d', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-25 14:07:43');
INSERT INTO `t_operalog` VALUES ('10fa3553d1fe605663a958d8be50f6cf', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 银行卡管理 ]菜单', 'com.glacier.netloan.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-02-19 17:56:11');
INSERT INTO `t_operalog` VALUES ('1109a137147f7fb46e525381452c3b02', '资源管理', '面板列表', '增加', '1', '[问题列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-16 09:37:39');
INSERT INTO `t_operalog` VALUES ('115848c4e07856bd91874d4f05a348b5', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-17 15:43:41');
INSERT INTO `t_operalog` VALUES ('119282034bf867392471c976a12a0f60', '下拉项管理', '下拉列表', '增加', '1', '[通过] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 13:26:58');
INSERT INTO `t_operalog` VALUES ('11b82c877ca712e26ac8f07f2de6d413', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 13:45:00');
INSERT INTO `t_operalog` VALUES ('11c328d950a0e3363bb465cf86edf9f1', '下拉项管理', '下拉列表', '修改', '1', '[管理员] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:15:34');
INSERT INTO `t_operalog` VALUES ('121b2793ad54fdeabdcd8dbcc46e9dcb', '充值设置', '充值设置列表', '审核', '1', '[ffff] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:47:46');
INSERT INTO `t_operalog` VALUES ('12b7e25202349b672a20f62f96e5ab79', '下拉项管理', '下拉列表', '增加', '1', '[工作认证信用积分] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-03-25 17:23:02');
INSERT INTO `t_operalog` VALUES ('12db5203c325ef14e38e5e975f0a1dff', '公告管理', '公告列表', '增加', '1', '[冰川贷1月9日23:00到次日凌晨3:00系统版本升级公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:40:58');
INSERT INTO `t_operalog` VALUES ('12ec1c98613870cc8b65cccf05f597a9', '资源管理', '菜单树', '修改', '1', '[信用记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-22 17:34:08');
INSERT INTO `t_operalog` VALUES ('12ef55463be3bec8b5e3803eb62d4a1f', '资源管理', '菜单树', '修改', '1', '[信息管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:24');
INSERT INTO `t_operalog` VALUES ('130fdc1e9446117e6e28edc5f6e25649', '资源管理', '菜单树', '增加', '1', '[我要借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-10 15:12:06');
INSERT INTO `t_operalog` VALUES ('131d22cbc31b3391f4fc10f0fc640e96', '客服服务', '客服列表', '删除', '1', '成功删除了[ dddeee,aaa,aa,fs ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-03-14 10:45:26');
INSERT INTO `t_operalog` VALUES ('134089c6e4cba19183834a797ab216b7', '下拉项管理', '下拉列表', '增加', '1', '[审核中] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-02 15:16:10');
INSERT INTO `t_operalog` VALUES ('1352f5b996b9b3b62506ff695db2f144', '帮助中心', '帮助列表', '增加', '1', '[贷款需要满足的条件?] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-03-14 10:52:53');
INSERT INTO `t_operalog` VALUES ('138003f84b3e88b1230d5dee98ab2ed0', '资源管理', '操作列表', '编辑', '1', '[授权] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 15:53:20');
INSERT INTO `t_operalog` VALUES ('138c9f76181dd31f2a12b32713fdb400', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-30 14:07:14');
INSERT INTO `t_operalog` VALUES ('13ad4ee4478a840d62d4068766f87fc3', '角色管理', '角色列表', '修改', '1', '[角色测试666] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('140c277ede7667be100539d49ebde899', '资源管理', '面板列表', '增加', '1', '[标种类型列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-10 15:17:59');
INSERT INTO `t_operalog` VALUES ('141cd61d07cba0005f2c782413958448', '帮助中心', '帮助列表', '增加', '1', '[as] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:40:14');
INSERT INTO `t_operalog` VALUES ('14a06e81500d50fee2118c02b3110018', '下拉项管理', '下拉列表', '增加', '1', '[初审失败] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:09:16');
INSERT INTO `t_operalog` VALUES ('14b03512f2b6d070742b59fb8dcf4825', '资源管理', '操作列表', '增加', '1', '[分配还款方式] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-24 09:47:15');
INSERT INTO `t_operalog` VALUES ('14b4e13daeb4629d937b54a8c2eeca76', '资源管理', '菜单树', '增加', '1', '[借款列表] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-10 15:13:25');
INSERT INTO `t_operalog` VALUES ('14b98ddf270dd66201bc046f96de4dc0', '招聘信息', '招聘列表', '修改', '1', '[asdfs] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 14:58:04');
INSERT INTO `t_operalog` VALUES ('154fbc80d98f3ac775a5dc03bdee9e7b', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-25 11:29:17');
INSERT INTO `t_operalog` VALUES ('15976c95872f617298548ccb9e9306f5', '下拉项管理', '下拉列表', '修改', '1', '[审核通过] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-05-06 10:52:17');
INSERT INTO `t_operalog` VALUES ('15e23449b91bc3a925a0885d43cd4350', '资源管理', '菜单树', '增加', '0', '菜单名称重复', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-21 10:11:48');
INSERT INTO `t_operalog` VALUES ('15f72aeb68f3d1510d36a384a35787e6', '资源管理', '面板列表', '增加', '1', '[还款方式列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-18 10:51:04');
INSERT INTO `t_operalog` VALUES ('16280bbd87a6929930bbe81017f485fe', '下拉项管理', '下拉列表', '增加', '1', '[已购房] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 17:38:21');
INSERT INTO `t_operalog` VALUES ('1660a224be1a30c91962b684eae17b72', '招聘信息', '招聘列表', '删除', '1', '成功删除了[ asfd,sadf ]操作', 'com.glacier.netloan.service.website.WebsiteHiringService', 'delWebsiteHiring', 'HiringList_del', '超级管理员', '2014-02-18 14:58:32');
INSERT INTO `t_operalog` VALUES ('1676ec7aa4f0f5ab67b91c9ee7834c6d', '资源管理', '操作列表', '编辑', '1', '[授权] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 15:52:58');
INSERT INTO `t_operalog` VALUES ('167ee38b8285a299f5186cb2ad1336cb', '客服服务', '客服列表', '增加', '1', '[dsd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:49:28');
INSERT INTO `t_operalog` VALUES ('16f938e68765a12d38e7ba8ded90f8e4', '公告管理', '公告列表', '增加', '1', '[随身带伞] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-02-22 09:22:44');
INSERT INTO `t_operalog` VALUES ('179d58d03e09e1efc97bb689d40b8f77', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-24 10:01:44');
INSERT INTO `t_operalog` VALUES ('18092c5d774c75ecac82b4febacf2e68', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:42:43');
INSERT INTO `t_operalog` VALUES ('188e362b8d374d953d6398495446b898', '帮助中心', '帮助列表', '增加', '1', '[怎样进行提现设置?] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-03-14 10:52:07');
INSERT INTO `t_operalog` VALUES ('1988921321b14bb27d06e89440043d9f', '下拉项管理', '下拉项树', '增加', '1', '[招聘管理状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:34:22');
INSERT INTO `t_operalog` VALUES ('1993e80d9368fd6ce252306828b96dfc', '资源管理', '菜单树', '修改', '1', '[初审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 11:05:13');
INSERT INTO `t_operalog` VALUES ('19e860f2beded7fcf1b8bf2cd6f91066', '充值设置', '充值设置列表', '增加', '1', '[sdfasf] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addRechargeSet', 'RechargeSetList_add', '超级管理员', '2014-05-06 11:07:59');
INSERT INTO `t_operalog` VALUES ('19f59b37f218b8d6d48ce9d23a0d37a9', '招聘信息', '招聘列表', '修改', '1', '[dddee] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 14:58:25');
INSERT INTO `t_operalog` VALUES ('1a5e4e4a9aa35d98c4a0531a0820f567', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-10 15:23:18');
INSERT INTO `t_operalog` VALUES ('1a9125dfdf8f3673084ef8a5b163645f', '还款方式', '还款方式列表', '修改', '1', '[按月付息，到期还本] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-23 16:21:01');
INSERT INTO `t_operalog` VALUES ('1b265135780b35efdd121a763722fc06', '会员信用', '信用列表', '修改', '1', '[二级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:17:12');
INSERT INTO `t_operalog` VALUES ('1b8bb0b029e8a001992a80caea7e72a7', '下拉项管理', '下拉列表', '增加', '1', '[比例收费] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-05-05 13:36:16');
INSERT INTO `t_operalog` VALUES ('1bb8d23b06fd7da94418afa9c632b0d8', '标种类型', '标种类型列表', '增加', '1', '[b cb] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addLoanTender', 'LoanTenderList_add', '超级管理员', '2014-04-23 10:53:11');
INSERT INTO `t_operalog` VALUES ('1c25c00a0dc33bf75db7fdbfa1647ec0', '资源管理', '面板列表', '修改', '1', '[提现记录列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-05-05 11:16:08');
INSERT INTO `t_operalog` VALUES ('1c42954abb73e38d16df2b34c36c2973', '会员信用', '信用列表', '删除', '1', '成功删除了[ 地方的 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'delCredit', 'CreditList_del', '超级管理员', '2014-02-18 16:39:22');
INSERT INTO `t_operalog` VALUES ('1c5bb086aab635252455b5db2d6ea1a7', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:35:05');
INSERT INTO `t_operalog` VALUES ('1c9c2fc9f425ab78b094f372a9b5f2c0', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-16 13:48:45');
INSERT INTO `t_operalog` VALUES ('1d4647dd8e8803b62d77e7a2036f35cb', '资源管理', '菜单树', '增加', '1', '[会员认证] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-24 11:26:32');
INSERT INTO `t_operalog` VALUES ('1d47f3e9f3adda6e17d3bf10dcc98b20', '公告管理', '公告列表', '修改', '1', '[元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦快乐元旦] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-03-14 10:30:15');
INSERT INTO `t_operalog` VALUES ('1d4b231245d4b70e8785bc9149903bef', '充值设置', '充值设置列表', '审核', '1', '[ggggjjjj] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:51:35');
INSERT INTO `t_operalog` VALUES ('1d992ffe0f246d5ad4214c66cd24b627', '信用类别', '信用类别列表', '增加', '1', '[CancelVipAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:09:22');
INSERT INTO `t_operalog` VALUES ('1e29032eea5b84a2edd92d333d3807a3', '资源管理', '菜单树', '修改', '1', '[提现记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-05-05 10:15:30');
INSERT INTO `t_operalog` VALUES ('1ed326925555b520e064a4857e70a53f', '信用类别', '信用类别列表', '增加', '1', '[CancelcompanyAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:07:56');
INSERT INTO `t_operalog` VALUES ('20487de140b4cb54b2677416ad55394c', '资源管理', '菜单树', '增加', '0', '英文名称重复', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-21 10:13:34');
INSERT INTO `t_operalog` VALUES ('20a1429de13f9e052bc90da0176790eb', '下拉项管理', '下拉项树', '增加', '1', '[网站管理] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-18 10:56:19');
INSERT INTO `t_operalog` VALUES ('20abb06c449bc2f9c10b16996bb0d7ad', '广告管理', '广告列表', '增加', '1', '[央行公布新货币政策工具SLF 曾用于春节及6月钱荒] 广告信息已保存', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-03-14 10:42:02');
INSERT INTO `t_operalog` VALUES ('20c225d8836b7b6d55be6d47502ea1db', '导航信息', '导航树', '删除', '1', '[爱的色放] 导航信息已删除', 'com.glacier.netloan.service.website.WebsiteNavService', 'delNav', 'NavTree_del', '超级管理员', '2014-02-19 10:57:08');
INSERT INTO `t_operalog` VALUES ('20dc307e1aed7c62b471704d3d17dc8d', '导航信息', '导航树', '修改', '1', '[是否] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-18 16:40:30');
INSERT INTO `t_operalog` VALUES ('211c06f3e3d477e6db0ef9803668cb19', '资源管理', '面板列表', '增加', '1', '[银行卡列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-19 16:25:42');
INSERT INTO `t_operalog` VALUES ('22c99e8725f24893ac2d262e8620f6a6', '资源管理', '面板列表', '修改', '1', '[初审借款列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-04-18 13:09:44');
INSERT INTO `t_operalog` VALUES ('22cc94e363764ed95099a7c636d5aac5', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-09 14:16:53');
INSERT INTO `t_operalog` VALUES ('2449a905bfebb92f4e3e94b4f9e2beb3', '下拉项管理', '下拉列表', '增加', '1', '[减少] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 10:58:20');
INSERT INTO `t_operalog` VALUES ('2453716c3bf75648b5d9f73ba10666ef', '下拉项管理', '下拉列表', '增加', '1', '[过期取消] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 09:57:24');
INSERT INTO `t_operalog` VALUES ('24d01b25d3a57956ba59f1350d34c625', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-22 15:16:03');
INSERT INTO `t_operalog` VALUES ('251d69b5af9d4c7e0d6acbbb732ea5dd', '下拉项管理', '下拉列表', '增加', '1', '[已读] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-09 14:10:56');
INSERT INTO `t_operalog` VALUES ('253d4cf44d92411018930a4a5e6203c4', '资源管理', '菜单树', '增加', '1', '[银行卡管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-19 16:23:36');
INSERT INTO `t_operalog` VALUES ('258fa456e2deae8b9ff7e777c41890f9', '下拉项管理', '下拉列表', '增加', '1', '[保密] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:49:21');
INSERT INTO `t_operalog` VALUES ('25dadcf4e9b37fefdd88b54193778e68', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 15:56:37');
INSERT INTO `t_operalog` VALUES ('25dc39a6a7d796937a7ca599d6745443', '充值设置', '充值设置列表', '修改', '1', '[kkkkkkk] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '超级管理员', '2014-05-05 16:34:48');
INSERT INTO `t_operalog` VALUES ('264bc807e2e5591cb333ab18eb474442', '帮助中心', '帮助列表', '增加', '1', '[sfew] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:40:43');
INSERT INTO `t_operalog` VALUES ('2665b8a132b979cfdfd3b461b2d92059', '下拉项管理', '下拉列表', '增加', '1', '[借款] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-18 11:01:18');
INSERT INTO `t_operalog` VALUES ('26e625cf004ccd463b75a8ed72d94fe0', '广告管理', '广告列表', '增加', '1', '[腾讯联手华夏基金 挑战阿里互联网金融] 广告信息已保存', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-03-14 10:41:50');
INSERT INTO `t_operalog` VALUES ('2741c7a57d3b5418c0fc57a164736c1a', '下拉项管理', '下拉列表', '增加', '1', '[信用认证信用积分] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-03-25 17:01:28');
INSERT INTO `t_operalog` VALUES ('2762ed3a3ebe8f0fa0d2d0ed9b63aba7', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-24 13:22:09');
INSERT INTO `t_operalog` VALUES ('284fd4845d699d452bce582485a1f9b5', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-04 16:45:49');
INSERT INTO `t_operalog` VALUES ('2873d21ff5f3f95b53fa477fa1a49ded', '公告管理', '公告列表', '修改', '1', '[元宵节快乐，大家到唐家猪肚鸡等候，一起吃饭。] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-03-14 10:29:42');
INSERT INTO `t_operalog` VALUES ('28ff2a9db0da10dbcda7d6caf1b572c3', '下拉项管理', '下拉项树', '删除', '1', '[会员信息] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-24 11:13:47');
INSERT INTO `t_operalog` VALUES ('293eb52004765edbcd489fc4e45a8908', '资源管理', '面板列表', '增加', '1', '[申请额度列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-19 17:58:30');
INSERT INTO `t_operalog` VALUES ('2975fb0fcdd32f098154dac9c1484236', '下拉项管理', '下拉项树', '增加', '1', '[有效会员等级] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-05-05 13:33:41');
INSERT INTO `t_operalog` VALUES ('299bc366fd2dc3ee5b4b33639d2bd009', '资源管理', '操作列表', '编辑', '1', '[分配角色] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:42:37');
INSERT INTO `t_operalog` VALUES ('29dd5eba14c3ba33f5c1c788ba4a5397', '下拉项管理', '下拉列表', '增加', '1', '[借款] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 10:55:58');
INSERT INTO `t_operalog` VALUES ('29e1ab0acf0617a9e8566efecbd4e3a8', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-04 16:46:31');
INSERT INTO `t_operalog` VALUES ('2a5c497fc11806ca26a8849f30623e5b', '新闻管理', '新闻列表', '修改', '1', '[冷空气] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-02-22 09:29:12');
INSERT INTO `t_operalog` VALUES ('2a988f7961e0d4af4ff879ed156326aa', '资源管理', '菜单树', '修改', '1', '[我要借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:57:11');
INSERT INTO `t_operalog` VALUES ('2a9a0bfd1c701d7775890fd4ba45f450', '充值设置', '充值设置列表', '增加', '1', '[fdg] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addNews', 'RechargeSetList_add', '超级管理员', '2014-05-05 13:38:19');
INSERT INTO `t_operalog` VALUES ('2a9c3044581a19bff9563a2d2681bb57', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-15 14:40:48');
INSERT INTO `t_operalog` VALUES ('2ab0553041fa90190930d99ebbd3f188', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:22');
INSERT INTO `t_operalog` VALUES ('2acc3d059f1873832653a08f0762819a', '下拉项管理', '下拉项树', '修改', '1', '[是否内置] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-15 10:26:11');
INSERT INTO `t_operalog` VALUES ('2afde794c2e4cb02f94112005fe811fe', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-10 15:22:30');
INSERT INTO `t_operalog` VALUES ('2b03bc2d345ff6c673ee1fede3a24e25', '帮助中心', '帮助列表', '增加', '1', '[ad] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 16:42:38');
INSERT INTO `t_operalog` VALUES ('2be66b4082f534e7a9943a6f0700234a', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:55:03');
INSERT INTO `t_operalog` VALUES ('2be72fa7be794d446362d44bbd06bbd6', '信用类别', '信用类别列表', '增加', '1', '[CancelemailAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:09:57');
INSERT INTO `t_operalog` VALUES ('2c38c0792ceb2b7e9f4bc45db57bc5ff', '标种类型', '标种类型列表', '修改', '1', '[时代发生的] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editAdvertisement', 'LoanTenderList_edit', '超级管理员', '2014-04-23 09:44:23');
INSERT INTO `t_operalog` VALUES ('2d1c1d1c71f2b1e2223588f70ec4875f', '资源管理', '面板列表', '增加', '1', '[充值列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-05-05 10:17:16');
INSERT INTO `t_operalog` VALUES ('2d39f73b228599c431bd344be54944b6', '会员信息', '会员信息列表', '增加', '1', '[cc] 会员信息已保存', 'com.glacier.netloan.service.member.MemberService', 'addMemberandWork', 'MemberList_add', '超级管理员', '2014-02-21 15:42:33');
INSERT INTO `t_operalog` VALUES ('2d5471cd422c23dae866a280c5ea3e86', '资源管理', '操作列表', '增加', '1', '[初审] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-18 13:07:06');
INSERT INTO `t_operalog` VALUES ('2d6c21827013183d7b4518664883113f', '资源管理', '操作列表', '增加', '1', '[复审] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-18 13:09:21');
INSERT INTO `t_operalog` VALUES ('2d8bfa6c31befee549da5e4a5ba56d2b', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-19 16:29:05');
INSERT INTO `t_operalog` VALUES ('2d9a492a73a973b88928c4b3678e1eba', '资源管理', '面板列表', '增加', '1', '[会员信息列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-21 10:15:45');
INSERT INTO `t_operalog` VALUES ('2da72ba0438fcef88dc3d1f875295b07', '招聘信息', '招聘列表', '修改', '0', '招聘管理名称重复', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 14:57:49');
INSERT INTO `t_operalog` VALUES ('2e3027ef36a82684824a5ae879342097', '资源管理', '面板列表', '修改', '1', '[充值设置列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-05-05 11:15:49');
INSERT INTO `t_operalog` VALUES ('2e4716581868631cc0a7e889cd0c4dd0', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-29 16:13:42');
INSERT INTO `t_operalog` VALUES ('2e7343f769ad6d38c97631192f5bd114', '下拉项管理', '下拉项树', '删除', '1', '[参数管理] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:37:55');
INSERT INTO `t_operalog` VALUES ('2ea4249df8ba39f04580af76ce388d60', '信用类别', '信用类别列表', '增加', '1', '[infoAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:03:39');
INSERT INTO `t_operalog` VALUES ('2ea5dddcdd2b18eea8f490cdfb738d1a', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-10 15:20:18');
INSERT INTO `t_operalog` VALUES ('2ed2d26ac883b67c57d5506a95acff15', '资源管理', '面板列表', '增加', '1', '[变量列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-17 15:53:16');
INSERT INTO `t_operalog` VALUES ('2fb9a4e90f24287297fd95a836534e58', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-22 15:05:40');
INSERT INTO `t_operalog` VALUES ('3050146322d4b2f66459f24671287eb3', '招聘信息', '招聘列表', '修改', '1', '[dsa] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-19 13:56:29');
INSERT INTO `t_operalog` VALUES ('3088185a047dbc5a10d9ec12ea96b341', '信用类别', '信用类别列表', '增加', '1', '[CancelInfoAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:09:43');
INSERT INTO `t_operalog` VALUES ('30d20f649b0a918e63072415199a6227', '新闻管理', '新闻列表', '增加', '1', '[cccccc] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-21 17:58:04');
INSERT INTO `t_operalog` VALUES ('30dabd11bd41952c0ab8bb115f8b9e54', '下拉项管理', '下拉列表', '增加', '1', '[邮箱认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:32:13');
INSERT INTO `t_operalog` VALUES ('312741870b15cb5895829976c4e1a4f3', '导航信息', '导航树', '修改', '1', '[发布担保标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:42');
INSERT INTO `t_operalog` VALUES ('3159b88b0e79ca858b5be8c7175187a9', '广告管理', '广告列表', '修改', '1', '[冰川贷投资月收入超十万，突破两年来记录。，突破两年来记录。，突破两年来记录。，突破两年来记录。，突破] 广告信息已修改', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'editAdvertisement', 'AdvertisementList_edit', '超级管理员', '2014-03-14 10:31:10');
INSERT INTO `t_operalog` VALUES ('3173ec9e54bb3f9566ba306b3a7c6cbe', '友情链接', '友情列表', '增加', '1', '[宝付网络科技（上海）有限公司] 友情链接信息已保存', 'com.glacier.netloan.service.website.WebsiteLinkService', 'addLink', 'LinkList_add', '超级管理员', '2014-03-14 10:44:16');
INSERT INTO `t_operalog` VALUES ('31b62edf5904cc79d84130ab03badcf1', '还款方式', '还款方式列表', '增加', '1', '[sdf] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:14:52');
INSERT INTO `t_operalog` VALUES ('31edc1a2f366762419740d1c9239c282', '下拉项管理', '下拉项树', '增加', '1', '[额度申请状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-02 15:15:43');
INSERT INTO `t_operalog` VALUES ('328c5b9f2c1e857be2aea308c3b000f3', '资源管理', '菜单树', '增加', '1', '[收款还款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-29 16:10:07');
INSERT INTO `t_operalog` VALUES ('32acb73ec3291d5e0b071d88f2ff6013', '标种类型', '标种类型列表', '增加', '1', '[时代发生的] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'LoanTenderList_add', '超级管理员', '2014-04-21 16:14:31');
INSERT INTO `t_operalog` VALUES ('332a11bedd60475da24386a736d10392', '信用类别', '信用类别列表', '增加', '1', '[emailAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 16:25:21');
INSERT INTO `t_operalog` VALUES ('33d711472119d413adaa05f2023150bf', '公告管理', '公告列表', '修改', '1', '[情人节快乐] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-02-22 09:24:54');
INSERT INTO `t_operalog` VALUES ('33e672b99d257278a7ac595b05e78e86', '资源管理', '面板列表', '修改', '1', '[问题列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-04-16 09:53:41');
INSERT INTO `t_operalog` VALUES ('33fbc33bfa47f675b9bee6243a172472', '下拉项管理', '下拉列表', '修改', '1', '[满标] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-04-24 09:48:36');
INSERT INTO `t_operalog` VALUES ('342306f23b887b8ac1e09836a8fb0244', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-16 10:10:07');
INSERT INTO `t_operalog` VALUES ('347b393d72c4590dfa2eb2e4780b6a5e', '帮助中心', '帮助列表', '增加', '1', '[dd] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-19 13:52:05');
INSERT INTO `t_operalog` VALUES ('34e925f217524247a61f95a4796a172c', '信用类别', '信用类别列表', '修改', '1', '[CancelWorkAuth] 信用积分类型信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'editCreditType', 'CreditTypeList_edit', '超级管理员', '2014-03-26 17:10:27');
INSERT INTO `t_operalog` VALUES ('34ea755859d5eb3f0c3a95c2cd8da311', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:33:31');
INSERT INTO `t_operalog` VALUES ('36007c6ef6d3430b3ddf7ecfb11d2e5d', '还款方式', '还款方式列表', '修改', '1', '[dsf] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-23 13:14:59');
INSERT INTO `t_operalog` VALUES ('36cd10f2341f4130fe8e42bbc08b2014', '资源管理', '菜单树', '修改', '1', '[充值设置] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-05-05 10:09:54');
INSERT INTO `t_operalog` VALUES ('36cf6678e0efd45c163c6125ab027e2f', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-18 10:54:05');
INSERT INTO `t_operalog` VALUES ('370cc191cefa38605a4dac6232cd6288', '资源管理', '菜单树', '修改', '1', '[我要借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:57:00');
INSERT INTO `t_operalog` VALUES ('37bf2c7dfda46f1f7808ac58fdb9623f', '资源管理', '菜单树', '修改', '1', '[密保管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-16 13:52:52');
INSERT INTO `t_operalog` VALUES ('37df8b9feed9a8a64888e43d9cbd7bef', '帮助中心', '帮助列表', '删除', '1', '成功删除了[ afd,sdf ]操作', 'com.glacier.netloan.service.website.WebsiteHelpService', 'delWebsiteHelp', 'HelpList_del', '超级管理员', '2014-02-18 13:40:50');
INSERT INTO `t_operalog` VALUES ('381a37b09ffe637116a0374b51796165', '信用类别', '信用类别列表', '增加', '1', '[idCardAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:54:32');
INSERT INTO `t_operalog` VALUES ('3820fe42ef82ec42ef43635cf80f23ed', '下拉项管理', '下拉项树', '增加', '1', '[借款状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-18 09:59:17');
INSERT INTO `t_operalog` VALUES ('3902edcafc0b0c5732412ba76d8a1764', '下拉项管理', '下拉列表', '增加', '1', '[男] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:54:45');
INSERT INTO `t_operalog` VALUES ('393efb39b4a2646c165fcbe06b333ba5', '下拉项管理', '下拉项树', '删除', '1', '[是否开启认购模式] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-04-15 16:00:02');
INSERT INTO `t_operalog` VALUES ('3969cc00a4182efc3f9739f6519f8ab7', '导航信息', '导航树', '修改', '1', '[我要投资] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:15');
INSERT INTO `t_operalog` VALUES ('39a3d4f3d925e33d41eb585ba431dd9b', '下拉项管理', '下拉项树', '修改', '1', '[信用积分类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 11:03:05');
INSERT INTO `t_operalog` VALUES ('3a68492252a77a2af2311c5af01a1f27', '下拉项管理', '下拉列表', '增加', '1', '[基金] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-18 11:02:27');
INSERT INTO `t_operalog` VALUES ('3b0ee17d70ca2bb653e269e7cdc76408', '广告管理', '广告列表', '增加', '1', '[ggggg] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-04-14 15:58:35');
INSERT INTO `t_operalog` VALUES ('3b26e45a81a4e7f8e1aec24538b910a1', '导航信息', '导航树', '增加', '1', '[爱的色放] 导航信息已保存', 'com.glacier.netloan.service.website.WebsiteNavService', 'addNav', 'NavTree_add', '超级管理员', '2014-02-19 10:56:54');
INSERT INTO `t_operalog` VALUES ('3b3e0ad3a24e9f336b5f3480d8c43c78', '会员信用', '信用列表', '修改', '1', '[二级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:18:19');
INSERT INTO `t_operalog` VALUES ('3b657c7911b783a1283ff5380fd47d75', '信用类别', '信用类别列表', '增加', '1', '[creditAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:05:49');
INSERT INTO `t_operalog` VALUES ('3bd449fa890427bf4e4a111600a192cb', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-19 18:00:42');
INSERT INTO `t_operalog` VALUES ('3be6cdb69c862a4adf8a39faf7ae1273', '资源管理', '操作列表', '编辑', '1', '[初审] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-18 13:29:06');
INSERT INTO `t_operalog` VALUES ('3bf1af1e8f89ca47e6dca6e7283df91d', '充值设置', '充值设置列表', '审核', '1', '[kkkkkkk] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:54:38');
INSERT INTO `t_operalog` VALUES ('3c1a014a79c1f392da8d6ad0612adac1', '会员信用', '信用列表', '修改', '1', '[一级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:10:36');
INSERT INTO `t_operalog` VALUES ('3c845df3011df83b878d3af1b68b6448', '公告管理', '公告列表', '增加', '1', '[中国人民银行关于2014年支付清算系统维护安排通知] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:40:38');
INSERT INTO `t_operalog` VALUES ('3d888aff78c0bbf4df38d0923171ad34', '信用类别', '信用类别列表', '修改', '1', '[CancelRealNameAuth] 信用积分类型信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'editCreditType', 'CreditTypeList_edit', '超级管理员', '2014-03-26 17:10:40');
INSERT INTO `t_operalog` VALUES ('3d923690551e43caca0d1d94df5be2d8', '下拉项管理', '下拉项树', '修改', '1', '[改变类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 11:02:58');
INSERT INTO `t_operalog` VALUES ('3de412d6b0be06dbd0bdf07997d1421d', '下拉项管理', '下拉列表', '增加', '1', '[现场] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 17:02:55');
INSERT INTO `t_operalog` VALUES ('3e1a450eb91b124998d47edc829c54eb', '导航信息', '导航树', '增加', '1', '[是否] 导航信息已保存', 'com.glacier.netloan.service.website.WebsiteNavService', 'addNav', 'NavTree_add', '超级管理员', '2014-02-18 16:40:16');
INSERT INTO `t_operalog` VALUES ('3e8149993be7cd8a49e7a08222cd7e2f', '下拉项管理', '下拉项树', '修改', '1', '[性别] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-21 10:52:39');
INSERT INTO `t_operalog` VALUES ('3f3b8b6848bf9479e97a635532a30bea', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-18 13:10:41');
INSERT INTO `t_operalog` VALUES ('3f3ebe72165fd6b0dfc3dd86faad89ff', '资源管理', '菜单树', '修改', '1', '[帮助中心] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:08');
INSERT INTO `t_operalog` VALUES ('3ffe5bf386e8ce0d29fa6fc27e5634be', '公告管理', '公告列表', '删除', '1', '成功删除了[ 元宵节快乐，大家到唐家猪肚鸡等候，一起吃饭。 ]公告', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'delAnnouncement', 'AnnouncementList_del', '超级管理员', '2014-03-14 10:37:28');
INSERT INTO `t_operalog` VALUES ('4146bfeb7da90a0f6ce3ebb42d92d1e4', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 15:48:51');
INSERT INTO `t_operalog` VALUES ('4238faa45ebc0c7e40d36577b1824ab3', '下拉项管理', '下拉列表', '修改', '1', '[已购车] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-24 17:54:49');
INSERT INTO `t_operalog` VALUES ('42e7b089ae7684d451c78055df9d294e', '下拉项管理', '下拉列表', '增加', '1', '[基础资料认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:31:06');
INSERT INTO `t_operalog` VALUES ('430eee28e9c46b3c5b7ce1f66fecd7c1', '充值设置', '充值设置列表', '增加', '1', '[sdf] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addNews', 'RechargeSetList_add', '超级管理员', '2014-05-05 13:38:14');
INSERT INTO `t_operalog` VALUES ('4358127fed57beb4efbabc1be2b28770', '资源管理', '菜单树', '增加', '1', '[会员信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-21 10:15:04');
INSERT INTO `t_operalog` VALUES ('4368cb3894ffd6fcc7235a2a07fe1cd0', '会员信用', '信用列表', '修改', '1', '[五级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:18:08');
INSERT INTO `t_operalog` VALUES ('4397475546c6d284d2aa93bd9224579f', '公告管理', '公告列表', '增加', '1', '[关于2014春节期间业务受理及值班公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:39:28');
INSERT INTO `t_operalog` VALUES ('441209177de7ed7cb268df49f399615d', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-03-26 15:54:59');
INSERT INTO `t_operalog` VALUES ('44191c4d492210033c3b5afa339ae3ee', '充值设置', '充值设置列表', '增加', '1', '[财务通] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addRechargeSet', 'RechargeSetList_add', '超级管理员', '2014-05-05 17:07:22');
INSERT INTO `t_operalog` VALUES ('4430e5571d3536940eb0ea5c542e1e47', '下拉项管理', '下拉列表', '增加', '1', '[是] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:42:31');
INSERT INTO `t_operalog` VALUES ('45599bb8e7c2cf07b693022de63d7dcd', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 15:52:54');
INSERT INTO `t_operalog` VALUES ('45f458b9bf0fc26e85dbd67c31e35ffb', '资源管理', '面板列表', '修改', '1', '[问题列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-04-16 09:49:40');
INSERT INTO `t_operalog` VALUES ('4688d27f2dbfdb01aadbbdaf66d391b2', '招聘信息', '招聘列表', '增加', '1', '[asd] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-18 16:42:59');
INSERT INTO `t_operalog` VALUES ('46a0a2b01c84deb1f21228c8afcec21c', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-03-26 15:53:47');
INSERT INTO `t_operalog` VALUES ('47b344ef2e5ad5902e3bcb238328b2c6', '标种类型', '标种类型列表', '删除', '1', '成功删除了[ 332423,dfdf ]标种类型', 'com.glacier.netloan.service.borrow.LoanTenderService', 'delLoanTender', 'LoanTenderList_del', '超级管理员', '2014-04-21 16:14:46');
INSERT INTO `t_operalog` VALUES ('48cab0dd4d1334326fc0a7497294e72c', '下拉项管理', '下拉列表', '增加', '1', '[审核失败] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-05-05 16:28:25');
INSERT INTO `t_operalog` VALUES ('492df585e62660cc7d64de8bbeb9e760', '下拉项管理', '下拉项树', '增加', '1', '[流标原因] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-18 09:51:49');
INSERT INTO `t_operalog` VALUES ('49659aed80347f557e955d850cd3be82', '下拉项管理', '下拉列表', '增加', '1', '[3333] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:26:20');
INSERT INTO `t_operalog` VALUES ('49bc12a6f9fdee5fc9b7981172294d9a', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-21 10:16:46');
INSERT INTO `t_operalog` VALUES ('49dd850414dd100d3aa2dc42e2fc35d2', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-24 09:39:15');
INSERT INTO `t_operalog` VALUES ('4aa327bd73fd720eca47936356f741a8', '广告管理', '广告列表', '删除', '1', '成功删除了[ 8,uiuiu ]广告', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'delAdvertisement', 'AdvertisementList_del', '超级管理员', '2014-02-22 09:26:12');
INSERT INTO `t_operalog` VALUES ('4aa61adffeff1096b07b02937bf545dc', '下拉项管理', '下拉项树', '修改', '1', '[申请状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-05-06 10:46:20');
INSERT INTO `t_operalog` VALUES ('4aea4ad72502c1acd274f2a77d804599', '充值设置', '充值设置列表', '增加', '1', '[fff] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addNews', 'RechargeSetList_add', '超级管理员', '2014-05-05 13:59:26');
INSERT INTO `t_operalog` VALUES ('4b209886cfafeaa32a8555eefa93278c', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-18 10:15:54');
INSERT INTO `t_operalog` VALUES ('4bc8ed4c26d7685b57f65908d917e673', '资源管理', '菜单树', '修改', '1', '[充值记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-05-05 10:15:16');
INSERT INTO `t_operalog` VALUES ('4bf1141dde987cad2fd6f25d2a6b3565', '资源管理', '菜单树', '修改', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-14 14:05:18');
INSERT INTO `t_operalog` VALUES ('4c03388a431fe4d094343873a78feaa4', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-24 10:01:48');
INSERT INTO `t_operalog` VALUES ('4c9bc3fdf361ade8527c55aa8a810fb2', '新闻管理', '新闻列表', '增加', '1', '[冰川贷李欣贺入选2014年“中国商业创新50人”大奖 ] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-14 10:21:45');
INSERT INTO `t_operalog` VALUES ('4d0f91eeb9f079d360b2ad30ccf6ca6a', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-25 16:26:18');
INSERT INTO `t_operalog` VALUES ('4e8e17e91ee625b6708348e0fe81e21e', '下拉项管理', '下拉列表', '增加', '1', '[通过] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-08 17:47:37');
INSERT INTO `t_operalog` VALUES ('4ec99aa6ef49b9bf1b8407623eda9b56', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-03-26 15:55:39');
INSERT INTO `t_operalog` VALUES ('4ed477975b62bb85fe79ece022c5938b', '资源管理', '菜单树', '增加', '1', '[会员统计] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-25 11:29:04');
INSERT INTO `t_operalog` VALUES ('4f4c216441e8b3df8a41efed093b28f7', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:41:59');
INSERT INTO `t_operalog` VALUES ('4f91233ccb25094b7c127d0382924fdf', '公告管理', '公告列表', '修改', '1', '[关于暂时关闭宝付充值通道公告] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-03-14 10:39:03');
INSERT INTO `t_operalog` VALUES ('4ff7aa88e54dbb08bc2c7ebcd4474974', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 手动取消,其它 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-04-15 16:00:15');
INSERT INTO `t_operalog` VALUES ('500649940201f248c10b1c51d68af2f5', '下拉项管理', '下拉列表', '增加', '1', '[通过] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-02 15:16:43');
INSERT INTO `t_operalog` VALUES ('505cc29fd4abee087c7a2f39a1f3133c', '下拉项管理', '下拉项树', '删除', '0', '该下拉项存在所属下拉值，如需删除请先删除所属下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:30:11');
INSERT INTO `t_operalog` VALUES ('50ab14012efc0bc63a8f5ef599792048', '会员信用', '信用列表', '删除', '1', '成功删除了[ 阿萨德,地方 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'delCredit', 'CreditList_del', '超级管理员', '2014-03-26 15:44:19');
INSERT INTO `t_operalog` VALUES ('50bc723401eb933e8cc2258aaebcf3a0', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:32:54');
INSERT INTO `t_operalog` VALUES ('50f01029c83f12c65b9262f4bfcb689e', '会员信用', '信用列表', '修改', '1', '[啊的的] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-19 10:40:00');
INSERT INTO `t_operalog` VALUES ('510cd13de6c3e30b47dc03a8cc85e03b', '会员信用', '信用列表', '修改', '1', '[一级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-31 10:24:35');
INSERT INTO `t_operalog` VALUES ('510f98b1645dfc14032b2bc595a55405', '下拉项管理', '下拉列表', '增加', '1', '[抵押贷款] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 10:49:45');
INSERT INTO `t_operalog` VALUES ('5152b0fce22c2c5fd68ea2cb371b5e53', '下拉项管理', '下拉列表', '增加', '1', '[文本框] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:54:06');
INSERT INTO `t_operalog` VALUES ('518b8aea8af9c1dcf20a6931ba77f2b9', '资源管理', '菜单树', '增加', '0', '英文名称重复', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-22 15:11:00');
INSERT INTO `t_operalog` VALUES ('519bd6ad7c779ff862cc5aede5a38786', '客服服务', '客服列表', '修改', '1', '[dddeee] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-19 13:48:25');
INSERT INTO `t_operalog` VALUES ('5225122e41400ee5910bcd0f27db358d', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-18 10:13:47');
INSERT INTO `t_operalog` VALUES ('52bc38baa0c4b406b9c604d5c1af7e8c', '导航信息', '导航树', '删除', '1', '[dfsa] 导航信息已删除', 'com.glacier.netloan.service.website.WebsiteNavService', 'delNav', 'NavTree_del', '超级管理员', '2014-02-19 14:26:57');
INSERT INTO `t_operalog` VALUES ('52e6c81bbe793ab2587069242d9224a6', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-08 17:49:43');
INSERT INTO `t_operalog` VALUES ('53392e53bdb69471aee90a184456dbcd', '下拉项管理', '下拉列表', '增加', '1', '[其它] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 09:52:43');
INSERT INTO `t_operalog` VALUES ('536116d939e39b0f52be1acf517c78c9', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-10 15:22:56');
INSERT INTO `t_operalog` VALUES ('5387cbeba8c60aac025950e79f0b9e1e', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-03-26 15:56:00');
INSERT INTO `t_operalog` VALUES ('53dde291dc59bbe1275da8948b97ecef', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-16 09:54:00');
INSERT INTO `t_operalog` VALUES ('53ebf065fca63136793e00c4bebb3122', '客服服务', '客服列表', '增加', '1', '[小春] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-03-14 10:45:47');
INSERT INTO `t_operalog` VALUES ('54367f196df0f7bc8532d44d2d7287c3', '帮助中心', '帮助列表', '增加', '1', '[hhhhh] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-24 15:13:09');
INSERT INTO `t_operalog` VALUES ('54ab1975e5f39bb985b16e49aec04eca', '下拉项管理', '下拉列表', '增加', '1', '[实名认证信用积分] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-03-25 17:20:55');
INSERT INTO `t_operalog` VALUES ('54b49c34547ff9c9d06857416c2ff638', '信用类别', '信用类别列表', '删除', '1', '成功删除了[ asdf,23 ]信用积分类型', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'delCreditTypes', 'CreditTypeList_del', '超级管理员', '2014-03-26 16:57:41');
INSERT INTO `t_operalog` VALUES ('54b9538ca4da0683348e582878c63006', '充值设置', '充值设置列表', '修改', '1', '[ffff] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '超级管理员', '2014-05-05 16:34:43');
INSERT INTO `t_operalog` VALUES ('553be45a6253340bd6f7cc2f15dcc2e3', '客服服务', '客服列表', '增加', '1', '[fs] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-19 13:50:11');
INSERT INTO `t_operalog` VALUES ('55ccc4f7d5beabb6942da262e84da1d3', '下拉项管理', '下拉项树', '删除', '1', '[是否有投标奖励] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-04-15 15:59:42');
INSERT INTO `t_operalog` VALUES ('55dba7ac1655b308ae5e505b8bd80af3', '资源管理', '菜单树', '修改', '1', '[收款还款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-29 16:13:22');
INSERT INTO `t_operalog` VALUES ('56b68360802bd0c9b983c9140b9ae3ed', '下拉项管理', '下拉项树', '修改', '1', '[开启关闭] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-04-15 16:00:44');
INSERT INTO `t_operalog` VALUES ('576a8681a84f0583efbcde5ad24cfa98', '会员信用', '信用列表', '修改', '1', '[三级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-31 10:25:16');
INSERT INTO `t_operalog` VALUES ('576f0fdb039a87a5704338ee7f0da02b', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-05-06 13:42:44');
INSERT INTO `t_operalog` VALUES ('57aa583a1418f3e09b8da921def230a7', '会员信用', '信用列表', '修改', '1', '[四级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:10:58');
INSERT INTO `t_operalog` VALUES ('580a4a89571e222f8c2065492058a281', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 13:45:23');
INSERT INTO `t_operalog` VALUES ('58465132819f1d73ebf335fa76633d2e', '广告管理', '广告列表', '增加', '1', '[投资月收入十万] 广告信息已保存', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-02-22 09:27:41');
INSERT INTO `t_operalog` VALUES ('588491e42c4bf87d174d0f5561281071', '下拉项管理', '下拉列表', '增加', '1', '[自定义] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 16:31:33');
INSERT INTO `t_operalog` VALUES ('58a5ec0a1ebd4ab00b0bb0869d8f3aa1', '密保问题', '问题列表', '增加', '1', '[您大学学校校名？] 密保问题信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'addParameterQuestion', 'QuestionList_add', '超级管理员', '2014-04-16 10:20:29');
INSERT INTO `t_operalog` VALUES ('58a8bf774810abde353a0425af8abb02', '广告管理', '广告列表', '增加', '1', '[jkjkjk] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-04-14 16:00:08');
INSERT INTO `t_operalog` VALUES ('58f54cc5746fcdc4e8c9ccdd2adcb88e', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 16:27:50');
INSERT INTO `t_operalog` VALUES ('590ad5657cb4d3e0beeeadc3b81135cd', '下拉项管理', '下拉项树', '增加', '1', '[参数管理] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-17 16:15:47');
INSERT INTO `t_operalog` VALUES ('5910337457a5d280cd36630f19847d77', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-04 16:43:53');
INSERT INTO `t_operalog` VALUES ('5918494d834f32e3ded787ea4ed828cf', '导航信息', '导航树', '修改', '1', '[我的账号] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:50');
INSERT INTO `t_operalog` VALUES ('59284cbffd57866c08498079dd192119', '会员积分', '积分列表', '删除', '1', '成功删除了[ 的萨芬 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'delIntegral', 'IntegralList_del', '超级管理员', '2014-02-18 16:39:58');
INSERT INTO `t_operalog` VALUES ('5946711b5be1da6a8a10358dae5d2c89', '下拉项管理', '下拉列表', '增加', '1', '[工作认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:34:28');
INSERT INTO `t_operalog` VALUES ('5a5dc21a533cf3439bc96ad563afc8ca', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-04-15 16:00:00');
INSERT INTO `t_operalog` VALUES ('5a7760de7693d8373fba71b19fd60b2e', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:55:46');
INSERT INTO `t_operalog` VALUES ('5ab7c719f8fda228242a5affef2daf7a', '密保问题', '问题列表', '删除', '1', '成功删除了[ fsd ]操作', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'delQuestion', 'QuestionList_del', '超级管理员', '2014-04-16 10:16:25');
INSERT INTO `t_operalog` VALUES ('5b60fb43d10a613d2a951ff19f6bd645', '公告管理', '公告列表', '增加', '1', '[关于净值借款入帐款禁止投标、提现公告说明] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:39:44');
INSERT INTO `t_operalog` VALUES ('5c067b7595d634e90c6b8478065c6579', '信用类别', '信用类别列表', '增加', '1', '[CancelrealNameAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:07:31');
INSERT INTO `t_operalog` VALUES ('5c8bc28d0f300094b6eb81f8c8929b52', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-10 15:21:49');
INSERT INTO `t_operalog` VALUES ('5d6de739cd13b4d87ed4a96831fb7f89', '密保问题', '问题列表', '修改', '1', '[你家里人知道吗] 密保问题信息信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'editParameterQuestion', 'QuestionList_edit', '超级管理员', '2014-04-16 10:16:40');
INSERT INTO `t_operalog` VALUES ('5dd99415886d63965073820aa4b365b1', '充值设置', '充值设置列表', '修改', '1', '[ffffffff] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '超级管理员', '2014-05-05 16:51:11');
INSERT INTO `t_operalog` VALUES ('5e20b3c1e74fecfdf467973855a1d731', '会员信用', '信用列表', '修改', '1', '[四级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-31 10:25:23');
INSERT INTO `t_operalog` VALUES ('5e5758fd53f26a57d55ee90d8479aed0', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-22 15:03:54');
INSERT INTO `t_operalog` VALUES ('5e9c270c945ceb2a70459e3fc8388696', '下拉项管理', '下拉列表', '增加', '1', '[待审核] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-08 17:48:13');
INSERT INTO `t_operalog` VALUES ('5f7e1aaa5b79147d161f494c5902c310', '下拉项管理', '下拉项树', '修改', '1', '[是否购车] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 17:53:45');
INSERT INTO `t_operalog` VALUES ('5fc5d8dc0c80f819c42c04ef7646613a', '会员信用', '信用列表', '修改', '1', '[一级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:16:39');
INSERT INTO `t_operalog` VALUES ('6012350c31b65b0107f134b17163f8d7', '下拉项管理', '下拉项树', '删除', '1', '[客服状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:42');
INSERT INTO `t_operalog` VALUES ('608d5ed7d1ca925ffac640c120182ef0', '导航信息', '导航树', '修改', '1', '[发布信用标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 10:48:31');
INSERT INTO `t_operalog` VALUES ('60ad7dbca7a228e0fac0e377a751e350', '信用类别', '信用类别列表', '增加', '1', '[CancelCreditAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:08:33');
INSERT INTO `t_operalog` VALUES ('60b52fd85c67c4eb9e842f56c48d4d75', '下拉项管理', '下拉列表', '增加', '1', '[借款] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 11:06:23');
INSERT INTO `t_operalog` VALUES ('60fe9869f62de5a99427f863f538e82f', '广告管理', '广告列表', '修改', '1', '[冰川贷投资月收入超十万，突破两年来记录。] 广告信息已修改', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'editAdvertisement', 'AdvertisementList_edit', '超级管理员', '2014-03-14 10:31:16');
INSERT INTO `t_operalog` VALUES ('61101d42e4293202d396484b2589c397', '下拉项管理', '下拉列表', '增加', '1', '[是] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:43:09');
INSERT INTO `t_operalog` VALUES ('619a703b196810d27e7516a75dcea0ca', '下拉项管理', '下拉列表', '增加', '1', '[否] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:42:49');
INSERT INTO `t_operalog` VALUES ('619f36570ca8a21a74e7baf88c266772', '资源管理', '菜单树', '修改', '1', '[财务管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-05-05 10:08:31');
INSERT INTO `t_operalog` VALUES ('61aebbf7e1a32bd02ea91b3ba4f6d59d', '密保问题', '问题列表', '增加', '1', '[您小学学校校名？] 密保问题信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'addParameterQuestion', 'QuestionList_add', '超级管理员', '2014-04-16 10:20:01');
INSERT INTO `t_operalog` VALUES ('61af9f5430348d2042f319c84efd8a3f', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 15:48:41');
INSERT INTO `t_operalog` VALUES ('622394c607f92bc566d43a62355fc9b9', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:34:48');
INSERT INTO `t_operalog` VALUES ('626434962d5a64d6292e895080869ae1', '标种类型', '标种类型列表', '增加', '1', '[dfdf] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'LoanTenderList_add', '超级管理员', '2014-04-15 16:05:21');
INSERT INTO `t_operalog` VALUES ('62af393d908c8e45f523a15ef88dc5cf', '充值设置', '充值设置列表', '审核', '1', '[ggggjjjj] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:52:31');
INSERT INTO `t_operalog` VALUES ('62b08ab35835c9c2f0eb4a8f1c029225', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:54:36');
INSERT INTO `t_operalog` VALUES ('62b6ec85db8d52aed20ab43b69140f3b', '资源管理', '菜单树', '修改', '1', '[招聘信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:14');
INSERT INTO `t_operalog` VALUES ('62ee8108c3fbe30ab18bd6f28ca8c44e', '帮助中心', '帮助列表', '修改', '1', '[adad] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-18 16:42:44');
INSERT INTO `t_operalog` VALUES ('63260d6ff075c388e5b6bb416671b6d6', '下拉项管理', '下拉列表', '增加', '1', '[开启] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:32:20');
INSERT INTO `t_operalog` VALUES ('6351b139062b0afa1192962fb4ea78f9', '资源管理', '菜单树', '增加', '1', '[投标记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-05-06 13:41:06');
INSERT INTO `t_operalog` VALUES ('637b679fef3b75b2ffa85ab100bb9e30', '下拉项管理', '下拉项树', '增加', '1', '[认证类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-25 14:30:00');
INSERT INTO `t_operalog` VALUES ('6390a25648281dcfbabdc8519abbbfb0', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 13:47:54');
INSERT INTO `t_operalog` VALUES ('646f9afba0edea295e22a299150e83c2', '公告管理', '公告列表', '修改', '1', '[999999] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-04-23 15:40:53');
INSERT INTO `t_operalog` VALUES ('648652593915d02d7de4f23780740b16', '广告管理', '广告列表', '增加', '1', '[fgfdg] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-04-14 15:39:42');
INSERT INTO `t_operalog` VALUES ('649038a9ae79defdfd93ec5c8973c1e8', '下拉项管理', '下拉项树', '删除', '1', '[流标原因] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-04-15 16:00:17');
INSERT INTO `t_operalog` VALUES ('64b700c29d69a09b747d457fa0346d62', '下拉项管理', '下拉列表', '增加', '1', '[普通会员] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-05-05 13:34:04');
INSERT INTO `t_operalog` VALUES ('65049643c7f9e331e36922ccf1b48632', '帮助中心', '帮助列表', '删除', '1', '成功删除了[ hhhhh,dd,sfew,eeeddd ]操作', 'com.glacier.netloan.service.website.WebsiteHelpService', 'delWebsiteHelp', 'HelpList_del', '超级管理员', '2014-03-14 10:51:43');
INSERT INTO `t_operalog` VALUES ('651704d9f8d0cc4b5d60a4c02f13a45d', '公告管理', '公告列表', '增加', '1', '[关于DNS服务器维护相关公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:38:58');
INSERT INTO `t_operalog` VALUES ('65d7441ea70a878be012d70f180ae353', '资源管理', '菜单树', '修改', '1', '[申请额度] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-24 15:46:54');
INSERT INTO `t_operalog` VALUES ('6615f0d73d02f07908000869b38f27f6', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 是,否 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-04-15 15:59:50');
INSERT INTO `t_operalog` VALUES ('661ced6e917f3721564b1f7e73f3d418', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-03-26 15:55:55');
INSERT INTO `t_operalog` VALUES ('66a763826d75752a656e04c0a49dab9b', '导航信息', '导航树', '修改', '1', '[首页] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:26:53');
INSERT INTO `t_operalog` VALUES ('66eac6fc19eee5339e2d471f362f50d6', '下拉项管理', '下拉列表', '增加', '1', '[登录] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 11:06:00');
INSERT INTO `t_operalog` VALUES ('6758aebc025a3d37695216087880b293', '公告管理', '公告列表', '增加', '1', '[DFD] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-02-22 09:04:58');
INSERT INTO `t_operalog` VALUES ('680db6d255130aa5ba76fd4adc54df27', '信用类别', '信用类别列表', '修改', '1', '[idCardAuth] 信用积分类型信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'editCreditType', 'CreditTypeList_edit', '超级管理员', '2014-03-26 17:03:45');
INSERT INTO `t_operalog` VALUES ('681c31aaf6a5914052043be3bf02798c', '资源管理', '菜单树', '增加', '1', '[会员管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-19 16:18:57');
INSERT INTO `t_operalog` VALUES ('68391d28c3f259ad47d556cf8b25736d', '资源管理', '菜单树', '修改', '1', '[银行卡管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-19 16:23:47');
INSERT INTO `t_operalog` VALUES ('683be9a1e4120d21758c2291cc970b82', '会员信用', '信用列表', '修改', '1', '[五级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:18:34');
INSERT INTO `t_operalog` VALUES ('686638aed940a7c60c05d0bb8daf63ad', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-18 10:16:14');
INSERT INTO `t_operalog` VALUES ('687eae17fd1f8348e5b3f41f2a8c3fa1', '下拉项管理', '下拉列表', '增加', '1', '[未申请] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 13:25:53');
INSERT INTO `t_operalog` VALUES ('68ca319425187ce2f5fa375328f51c63', '下拉项管理', '下拉列表', '修改', '1', '[禁用] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-15 16:37:46');
INSERT INTO `t_operalog` VALUES ('6949b7110b4664c126af25e66fc55fbb', '充值设置', '充值设置列表', '删除', '1', '成功删除了[ 23523,ffffffff ]会员充值设置记录', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'delRechargeSet', 'RechargeSetList_del', '超级管理员', '2014-05-05 17:06:24');
INSERT INTO `t_operalog` VALUES ('69b6dc55d124d77165d524673016c81b', '资源管理', '菜单树', '修改', '1', '[会员银行卡] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-05-05 10:11:17');
INSERT INTO `t_operalog` VALUES ('6a22fd96b196c9795f63fb038147a313', '新闻管理', '新闻列表', '修改', '1', '[cccccc] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-03-25 15:13:39');
INSERT INTO `t_operalog` VALUES ('6a2eadbf6d36722c73a65fca0e0915c2', '下拉项管理', '下拉列表', '增加', '1', '[互联网] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 17:02:37');
INSERT INTO `t_operalog` VALUES ('6a4a3afc6c75a23463d1cd8ec993baa2', '下拉项管理', '下拉项树', '增加', '1', '[是否开启认购模式] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-15 15:44:38');
INSERT INTO `t_operalog` VALUES ('6a7c48f5ec64646b85c4807d471b912d', '下拉项管理', '下拉列表', '增加', '1', '[保密] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:55:17');
INSERT INTO `t_operalog` VALUES ('6a87a0f25a1789219d01b64e5d5daa8b', '资源管理', '面板列表', '增加', '1', '[提现记录列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-05-05 10:24:50');
INSERT INTO `t_operalog` VALUES ('6a9e5dbf5c35298688e110ed90c18f6c', '下拉项管理', '下拉列表', '增加', '1', '[电话] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 17:02:21');
INSERT INTO `t_operalog` VALUES ('6ad62926ce4f8a1296ac2268b2bfb147', '资源管理', '菜单树', '增加', '1', '[信息通知] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-09 14:13:24');
INSERT INTO `t_operalog` VALUES ('6ae5f3deafb67c6904f0843e0bb11841', '下拉项管理', '下拉列表', '增加', '1', '[手动取消] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:39:09');
INSERT INTO `t_operalog` VALUES ('6af8637ffd7dcf141c73339d90a2c416', '资源管理', '菜单树', '增加', '1', '[会员资金] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-05-05 10:13:27');
INSERT INTO `t_operalog` VALUES ('6c3cb73389fa070123484a76e5d2de4a', '招聘信息', '招聘列表', '增加', '1', '[dsa] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-19 13:53:13');
INSERT INTO `t_operalog` VALUES ('6c3db1897709cca96955530cb5c0d879', '客服服务', '客服列表', '增加', '1', '[ddd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:45:23');
INSERT INTO `t_operalog` VALUES ('6c848efc8d1947b46dc43858dd1f7721', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-05 10:26:42');
INSERT INTO `t_operalog` VALUES ('6d3ac001fb03e94bcdfc0773612a5864', '下拉项管理', '下拉项树', '删除', '1', '[审核状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-05-06 10:54:02');
INSERT INTO `t_operalog` VALUES ('6d49cf541f24244775b51fcc1b576e7e', '下拉项管理', '下拉项树', '删除', '0', '该下拉项存在所属下拉值，如需删除请先删除所属下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-22 09:17:55');
INSERT INTO `t_operalog` VALUES ('6d89501cc3a800d804006a8e31494044', '下拉项管理', '下拉列表', '增加', '1', '[普通会员] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:25:07');
INSERT INTO `t_operalog` VALUES ('6dcc9f20683d8889eb0fff2a87cdd2a6', '资源管理', '菜单树', '修改', '1', '[积分记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-22 15:05:48');
INSERT INTO `t_operalog` VALUES ('6e5ccff78fa2f5ce1fbd60ce1cfa0a98', '下拉项管理', '下拉列表', '增加', '1', '[招标中] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:06:10');
INSERT INTO `t_operalog` VALUES ('6e850c84ba64acf3bf5b94ca68efb38b', '会员信息', '会员信息列表', '增加', '1', '[ee] 会员信息已保存', 'com.glacier.netloan.service.member.MemberService', 'addMemberandWork', 'MemberList_add', '超级管理员', '2014-02-21 16:26:38');
INSERT INTO `t_operalog` VALUES ('6eb893b4e68085ec7f0437bc63ff91ee', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-05-05 14:50:26');
INSERT INTO `t_operalog` VALUES ('6f0f6cce7691f0fa6154501f0a1c194f', '招聘信息', '招聘列表', '修改', '1', '[招聘投资/理财主管2名 ] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-03-14 10:47:12');
INSERT INTO `t_operalog` VALUES ('6f2cbf3299df4979636beb166f425cb0', '公告管理', '公告列表', '修改', '1', '[元旦到了 大家新年快乐] 公告信息已修改', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'editAnnouncement', 'AnnouncementList_edit', '超级管理员', '2014-03-14 10:30:25');
INSERT INTO `t_operalog` VALUES ('6f6fccf692e120b84e725fdae846ed8a', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:52');
INSERT INTO `t_operalog` VALUES ('6fdeaef8a1794a4f374fc5226d91c097', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 13:44:55');
INSERT INTO `t_operalog` VALUES ('6ffdc7d0b37f5de1e6ee8a2ec9fcbb84', '资源管理', '菜单树', '增加', '1', '[房产信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-22 15:13:06');
INSERT INTO `t_operalog` VALUES ('70155acbd14a24478ec1876372e5cbd3', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-25 15:47:39');
INSERT INTO `t_operalog` VALUES ('7038cd3c063b21e96d333dc8f9f04c8b', '会员信用', '信用列表', '删除', '1', '成功删除了[ 都是 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'delCredit', 'CreditList_del', '超级管理员', '2014-02-18 16:12:09');
INSERT INTO `t_operalog` VALUES ('703db6cf743826b5fa130bfdf04dce9e', '资源管理', '面板列表', '增加', '1', '[复审借款列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-18 13:07:55');
INSERT INTO `t_operalog` VALUES ('706ba656ca0d4b973b9e948e0caf8212', '下拉项管理', '下拉项树', '增加', '1', '[标种类型状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-14 16:43:30');
INSERT INTO `t_operalog` VALUES ('708ecc0e8fbd1441586cd17a63ef7b50', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 银行卡列表 ]mianban ', 'com.glacier.netloan.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-02-19 17:56:08');
INSERT INTO `t_operalog` VALUES ('70b3bdc84357b0c48d0c68f88d737b56', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-17 15:02:09');
INSERT INTO `t_operalog` VALUES ('70e3f8640fb4b939a7f481c22b08747a', '帮助中心', '帮助列表', '删除', '1', '成功删除了[ adad ]操作', 'com.glacier.netloan.service.website.WebsiteHelpService', 'delWebsiteHelp', 'HelpList_del', '超级管理员', '2014-02-18 16:42:47');
INSERT INTO `t_operalog` VALUES ('70f9f06d3ec3511d9cf593ca8559ea9b', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:26:09');
INSERT INTO `t_operalog` VALUES ('71293b1fbb8f230176cd78b6a4e795f7', '帮助中心', '帮助列表', '修改', '1', '[eeeddd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-18 13:39:50');
INSERT INTO `t_operalog` VALUES ('71afd26e036c4e13068e5aa44e3cb55c', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-24 13:28:19');
INSERT INTO `t_operalog` VALUES ('71d3692deb216ebe67fd1a9af963ed64', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:33:47');
INSERT INTO `t_operalog` VALUES ('71eb7ecf1db31348cc4c02692334f075', '新闻管理', '新闻列表', '删除', '1', '成功删除了[ tyu ]新闻', 'com.glacier.netloan.service.website.WebsiteNewsService', 'delNews', 'NewsList_del', '超级管理员', '2014-02-22 09:30:01');
INSERT INTO `t_operalog` VALUES ('72e36f1e7b3189b6ef44cdf1ec4d6d27', '资源管理', '面板列表', '增加', '1', '[房产列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-22 15:13:42');
INSERT INTO `t_operalog` VALUES ('73990d6afe48cc86a52ee85a6e92667b', '下拉项管理', '下拉项树', '增加', '1', '[认证状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-24 13:24:24');
INSERT INTO `t_operalog` VALUES ('73a6dd8770b96f648513d8b6b78959c6', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-10 15:22:39');
INSERT INTO `t_operalog` VALUES ('73bc55c9b9dc4f50e5e24e39c8273a8f', '会员信用', '信用列表', '增加', '1', '[七级] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-03-19 09:19:22');
INSERT INTO `t_operalog` VALUES ('740e84b2586d087382a7edb31fb77ff6', '资源管理', '菜单树', '修改', '1', '[复审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:58:28');
INSERT INTO `t_operalog` VALUES ('7410d5910f2852aa126f57846630cf17', '充值设置', '充值设置列表', '增加', '1', '[23523] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addRechargeSet', 'RechargeSetList_add', '超级管理员', '2014-05-05 17:06:20');
INSERT INTO `t_operalog` VALUES ('7424052f962824b3fe4e67737d10003a', '帮助中心', '帮助列表', '修改', '1', '[dd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 13:52:24');
INSERT INTO `t_operalog` VALUES ('7434b56e8373c8221b7d268b73b697fa', '充值设置', '充值设置列表', '审核', '1', '[ggggjjjj] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:52:20');
INSERT INTO `t_operalog` VALUES ('7454884221cd9647dc2437bf03680787', '资源管理', '操作列表', '增加', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-08 17:49:31');
INSERT INTO `t_operalog` VALUES ('7501f3a2d610206fc34395e77a9d6785', '下拉项管理', '下拉项树', '删除', '0', '该下拉项存在所属下拉值，如需删除请先删除所属下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-05-06 10:52:44');
INSERT INTO `t_operalog` VALUES ('75270fdb6c348051d53e2106dc5d5c03', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-18 10:53:33');
INSERT INTO `t_operalog` VALUES ('755d398080727ab36a6fa2e68dc4f79d', '客服服务', '客服列表', '增加', '1', '[小秋] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-03-14 10:46:37');
INSERT INTO `t_operalog` VALUES ('756f8938ae4ad585940649c4e578287d', '公告管理', '公告列表', '删除', '1', '成功删除了[ 元旦到了 大家新年快乐,情人节快乐,随身带伞,周六加班 ]公告', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'delAnnouncement', 'AnnouncementList_del', '超级管理员', '2014-03-14 10:37:23');
INSERT INTO `t_operalog` VALUES ('757c2e212a02ea531c8232c2dee9751a', '资源管理', '菜单树', '修改', '1', '[复审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:46:51');
INSERT INTO `t_operalog` VALUES ('75a97a12ee190b2c7f21aa8a040e4861', '下拉项管理', '下拉列表', '增加', '1', '[复审通过] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:10:11');
INSERT INTO `t_operalog` VALUES ('764685d52327c050c633e2f2b7c8b2d8', '充值设置', '充值设置列表', '审核', '1', '[ffff] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:47:32');
INSERT INTO `t_operalog` VALUES ('76dfa3a7728a1786c5e20816bd3854f0', '充值设置', '充值设置列表', '审核', '1', '[支付宝] 会员充值设置信息记录审核操作成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 17:07:26');
INSERT INTO `t_operalog` VALUES ('7701865fc92e5bab8da5b2eb83abf23c', '信用类别', '信用类别列表', '增加', '1', '[CancelIdCardAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:10:18');
INSERT INTO `t_operalog` VALUES ('781bcccabf513f69192e5f2fdd9fecc6', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-05-05 10:31:02');
INSERT INTO `t_operalog` VALUES ('786668e28bc4c47f628165ccd200c356', '资源管理', '面板列表', '增加', '1', '[会员财务列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-24 16:49:49');
INSERT INTO `t_operalog` VALUES ('78b0fd5f5916305964cff0cc53fb9c1b', '充值设置', '充值设置列表', '修改', '1', '[kkkkkkk] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '超级管理员', '2014-05-05 15:57:16');
INSERT INTO `t_operalog` VALUES ('79662e83d97759e07db47c8f612e5a4f', '资源管理', '菜单树', '修改', '1', '[导航信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:28');
INSERT INTO `t_operalog` VALUES ('79ae3886501b2b8acf869ec3941959af', '资源管理', '菜单树', '修改', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-29 16:10:21');
INSERT INTO `t_operalog` VALUES ('79c64cf5474d1d6a27c2ed4cd10d9d34', '招聘信息', '招聘列表', '修改', '1', '[asdddddddddddd] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 16:43:09');
INSERT INTO `t_operalog` VALUES ('79ed399c88414d6f744859ec6566a8d8', '下拉项管理', '下拉列表', '增加', '1', '[管理员] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 10:15:11');
INSERT INTO `t_operalog` VALUES ('7a5f5755694641bb57bbda6333c997cf', '资源管理', '菜单树', '增加', '0', '英文名称重复', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-22 14:52:06');
INSERT INTO `t_operalog` VALUES ('7a673f115d54c7493ef5fcf11b441973', '资源管理', '菜单树', '修改', '1', '[新闻管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:50');
INSERT INTO `t_operalog` VALUES ('7ae881f069ffaeb920ecd7cb08234fb6', '资源管理', '菜单树', '修改', '1', '[财务管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-04 16:49:31');
INSERT INTO `t_operalog` VALUES ('7aebfe4a0558e13bd4933f2c13b69ad2', '下拉项管理', '下拉项树', '修改', '1', '[是否] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-04-15 16:00:52');
INSERT INTO `t_operalog` VALUES ('7bae3bb02cc0d9ee1f16665c09287811', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:54:02');
INSERT INTO `t_operalog` VALUES ('7bc93ef98d5905a845a6ded98e58aad7', '下拉项管理', '下拉项树', '修改', '1', '[是否] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-04-15 16:01:48');
INSERT INTO `t_operalog` VALUES ('7bf3bbf7d18d7c5fde1689a89c989ee2', '下拉项管理', '下拉列表', '修改', '1', '[手动取消] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-04-15 15:39:57');
INSERT INTO `t_operalog` VALUES ('7c9337b8de84805eaf8e934cdda5b97f', '下拉项管理', '下拉列表', '修改', '1', '[投资] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-03-25 16:55:48');
INSERT INTO `t_operalog` VALUES ('7cce8549fdadc32be2ca8e5a55567b90', '密保问题', '问题列表', '增加', '1', '[啊啊] 密保问题信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'addParameterQuestion', 'QuestionList_add', '超级管理员', '2014-04-16 10:13:52');
INSERT INTO `t_operalog` VALUES ('7d24d80aeb93cff5459209ceba24b2eb', '会员信用', '信用列表', '增加', '1', '[地方] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-02-18 16:38:49');
INSERT INTO `t_operalog` VALUES ('7dffe4594f0609ae6ed5dd980581172e', '资源管理', '菜单树', '修改', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:14:57');
INSERT INTO `t_operalog` VALUES ('7e52ac75cd05c9b3c76c9355b8535bb0', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:34:57');
INSERT INTO `t_operalog` VALUES ('7e6bca7fadda5c162a064af5d7b345a7', '下拉项管理', '下拉列表', '增加', '1', '[审核中] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 13:26:32');
INSERT INTO `t_operalog` VALUES ('7eac8adb93af4283392b62dd1b16ae6f', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 是,否 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-04-15 15:59:37');
INSERT INTO `t_operalog` VALUES ('7f6cf7d142655fe5d02e4e52b386d1ad', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-17 15:56:59');
INSERT INTO `t_operalog` VALUES ('7f754c1e539af35928ace3b9d71ecd78', '资源管理', '菜单树', '增加', '1', '[提现记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-05-05 10:11:04');
INSERT INTO `t_operalog` VALUES ('7fb72e983ab7ac99aec904c75c752021', '会员信用', '信用列表', '修改', '1', '[四级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:17:41');
INSERT INTO `t_operalog` VALUES ('7ffba5000686344ca69216780856d511', '新闻管理', '新闻列表', '修改', '1', '[冷空气降临中国，中国将面对一周的低气温] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-03-14 10:24:11');
INSERT INTO `t_operalog` VALUES ('80a204bafe729e3c5a752499f8a8e4b9', '充值设置', '充值设置列表', '删除', '1', '成功删除了[ ggggjjjj,kkkkkkk,sadfs ]会员充值设置记录', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'delRechargeSet', 'RechargeSetList_del', '超级管理员', '2014-05-05 17:06:29');
INSERT INTO `t_operalog` VALUES ('810f02b2457c67d45b738b27426f22d2', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-04 16:43:07');
INSERT INTO `t_operalog` VALUES ('8119f284014e5e19b59648d928287348', '资源管理', '菜单树', '增加', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-10 15:15:20');
INSERT INTO `t_operalog` VALUES ('819db0c0015b8f3d2336bd38588d76f2', '下拉项管理', '下拉项树', '修改', '0', '下拉项名称重复', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-05-06 10:46:42');
INSERT INTO `t_operalog` VALUES ('823417158dbc16f1f11939500f8436e2', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:34:07');
INSERT INTO `t_operalog` VALUES ('8249d31467f4117acf08b2cf504692d2', '下拉项管理', '下拉项树', '增加', '1', '[婚姻状况] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-21 10:47:02');
INSERT INTO `t_operalog` VALUES ('825fe00d4bb68219313a2dada26c8812', '下拉项管理', '下拉项树', '增加', '1', '[是否购房] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-24 17:36:41');
INSERT INTO `t_operalog` VALUES ('827f626ceb783e0a75567d092921beee', '下拉项管理', '下拉项树', '增加', '1', '[住房条件] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-24 17:39:25');
INSERT INTO `t_operalog` VALUES ('82b1c9aaa57b6be7bb7e79e99b2bc31e', '下拉项管理', '下拉项树', '增加', '1', '[帮助中心] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-18 10:57:41');
INSERT INTO `t_operalog` VALUES ('82c69229ca4aba0be86fa43f789da50d', '还款方式', '还款方式列表', '增加', '1', '[一次性还款] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:37:28');
INSERT INTO `t_operalog` VALUES ('82cd7f98d69420b6b91b1a7f41c2652f', '资源管理', '菜单树', '修改', '1', '[满标借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-24 09:51:01');
INSERT INTO `t_operalog` VALUES ('82d3765e67edbad65a7296133d8dacf5', '会员信用', '信用列表', '修改', '1', '[四级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:18:29');
INSERT INTO `t_operalog` VALUES ('830a7bb4c9fa78e9710423111f01c31e', '下拉项管理', '下拉项树', '增加', '1', '[初审审核状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-18 10:08:24');
INSERT INTO `t_operalog` VALUES ('8339990f799edc4d8e1bbd91b9aca032', '下拉项管理', '下拉项树', '删除', '1', '[网站管理] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:50');
INSERT INTO `t_operalog` VALUES ('8345c7eb4fdb30798abc10cee2ca879a', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-06 13:42:34');
INSERT INTO `t_operalog` VALUES ('837da12d1a43b0d2e1caa65e3ee1270e', '资源管理', '面板列表', '修改', '1', '[满标借款列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-04-24 09:51:09');
INSERT INTO `t_operalog` VALUES ('83b9207dc52e727b62a2062ddb512431', '资源管理', '面板列表', '修改', '1', '[初审借款列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-04-18 13:11:21');
INSERT INTO `t_operalog` VALUES ('83f73196f8212b07fcd3c4b41df0d71f', '资源管理', '面板列表', '增加', '1', '[投标记录列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-05-06 13:41:53');
INSERT INTO `t_operalog` VALUES ('842abcbda1bd252a6fcd251e0c91aa2c', '资源管理', '操作列表', '增加', '1', '[新增] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-03-26 15:53:30');
INSERT INTO `t_operalog` VALUES ('844df907705dd336c62f26824ec47e13', '友情链接', '友情列表', '增加', '1', '[冰川软件] 友情链接信息已保存', 'com.glacier.netloan.service.website.WebsiteLinkService', 'addLink', 'LinkList_add', '超级管理员', '2014-02-22 09:31:02');
INSERT INTO `t_operalog` VALUES ('845e939d85b74629c5ff714b7952b8b6', '资源管理', '菜单树', '修改', '1', '[操作日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:50:32');
INSERT INTO `t_operalog` VALUES ('84922e3ecc255b530226ceb1bfb969f4', '下拉项管理', '下拉列表', '增加', '1', '[还款中] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:07:08');
INSERT INTO `t_operalog` VALUES ('8580486c518975f9463d621c2e8734ab', '下拉项管理', '下拉列表', '增加', '1', '[身份证认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:34:13');
INSERT INTO `t_operalog` VALUES ('85bb7e086258949d2d693ff1bd0f58b1', '会员积分', '积分列表', '删除', '1', '成功删除了[ 水电费 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'delIntegral', 'IntegralList_del', '超级管理员', '2014-02-22 09:16:55');
INSERT INTO `t_operalog` VALUES ('85c423d33e41346d47abe46b1bd775a6', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-25 09:08:15');
INSERT INTO `t_operalog` VALUES ('864e772f3aa4256dc19c19fbeb7a907e', '资源管理', '菜单树', '修改', '1', '[逾期借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-29 16:13:01');
INSERT INTO `t_operalog` VALUES ('86be699db942e872b26528d9cbd1de4f', '角色管理', '角色列表', '修改', '1', '[角色测试] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('86c08392373c885786bdb8c6361abde1', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:31');
INSERT INTO `t_operalog` VALUES ('8800bd48128e703abc9bcda3eefcf5ab', '资源管理', '面板列表', '增加', '1', '[初审借款列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-18 13:05:15');
INSERT INTO `t_operalog` VALUES ('888e577a828669a20ee016d138d1b126', '会员积分', '积分列表', '修改', '1', '[三级积分] 会员积分级别信息已修改保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'editParameterIntegral', 'IntegralList_edit', '超级管理员', '2014-02-19 10:35:55');
INSERT INTO `t_operalog` VALUES ('893964c7281886c27e08a0e5e1ab723e', '还款方式', '还款方式列表', '修改', '1', '[按月付息，到期还本] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-24 14:05:10');
INSERT INTO `t_operalog` VALUES ('894bcc3b2c810998ed1297f1dd6fa4f0', '信用类别', '信用类别列表', '增加', '1', '[23] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 16:26:07');
INSERT INTO `t_operalog` VALUES ('896986f213f68bac65782ff31d3113bb', '资源管理', '菜单树', '修改', '1', '[会员财务] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-24 17:09:45');
INSERT INTO `t_operalog` VALUES ('89aeebce393f3b8f41846bf82e8fb0d9', '下拉项管理', '下拉列表', '增加', '1', '[初审中] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:05:44');
INSERT INTO `t_operalog` VALUES ('89cd136da44b8c039094c0c271968308', '资源管理', '菜单树', '修改', '1', '[会员管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-21 10:14:26');
INSERT INTO `t_operalog` VALUES ('89ffe55518e2b1bece8a054355f695b5', '下拉项管理', '下拉列表', '增加', '1', '[不通过] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 13:27:22');
INSERT INTO `t_operalog` VALUES ('8a07cf3962c0ef93bd2108aae15b00c7', '资源管理', '菜单树', '修改', '1', '[信用类别] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-03-26 16:22:28');
INSERT INTO `t_operalog` VALUES ('8a2920a06ca32bd3c67f40cbec6e1da1', '会员信用', '信用列表', '修改', '1', '[三级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:17:26');
INSERT INTO `t_operalog` VALUES ('8a3663c9d78e349b60f029f710656ab2', '下拉项管理', '下拉项树', '增加', '1', '[系统变量] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-17 16:18:18');
INSERT INTO `t_operalog` VALUES ('8a90cce4fc6310b7b138eb79b303c56d', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-21 10:17:58');
INSERT INTO `t_operalog` VALUES ('8aec1cff32aa34369f957fc83b09629f', '公告管理', '公告列表', '增加', '1', '[1000000] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-04-23 15:40:43');
INSERT INTO `t_operalog` VALUES ('8b0c5963b21073ddcd05bbb441b526c1', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-18 10:56:03');
INSERT INTO `t_operalog` VALUES ('8b2016a37312258a004fad342f5f5e3f', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:32:01');
INSERT INTO `t_operalog` VALUES ('8b49639bafcbfc288a70aa61fcebc12f', '资源管理', '面板列表', '增加', '1', '[信用类别] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-03-26 15:46:58');
INSERT INTO `t_operalog` VALUES ('8bcccfd9842a358428e5507f5110be67', '还款方式', '还款方式列表', '修改', '1', '[等额本息] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-24 14:04:42');
INSERT INTO `t_operalog` VALUES ('8c51e39ab262ff3b7267743b41c57a06', '充值设置', '充值设置列表', '审核', '1', '[sdfasf] 会员充值设置信息记录审核操作成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-06 11:08:51');
INSERT INTO `t_operalog` VALUES ('8ccc42617c852563b6589e53e805967b', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-16 09:38:27');
INSERT INTO `t_operalog` VALUES ('8cda466c1148c368531f6d5a0503af78', '资源管理', '菜单树', '修改', '1', '[所有借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:33:18');
INSERT INTO `t_operalog` VALUES ('8cfb63d4c1bc7519198556e1210bd00d', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-21 16:38:56');
INSERT INTO `t_operalog` VALUES ('8d8e08a00c9433658029eb7fbfae3ab5', '客服服务', '客服列表', '删除', '1', '成功删除了[ asdf ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-02-19 13:51:11');
INSERT INTO `t_operalog` VALUES ('8d9cdb4a7853898b3ccd1ee42633066f', '会员信用', '信用列表', '修改', '1', '[三级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:10:49');
INSERT INTO `t_operalog` VALUES ('8db34e5fc81caa1755b443a3f3189dd9', '会员信用', '信用列表', '修改', '1', '[六级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-31 10:25:39');
INSERT INTO `t_operalog` VALUES ('8e01493f46fe5d789510d66a45082b55', '还款方式', '还款方式列表', '增加', '1', '[cfdf] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:53:24');
INSERT INTO `t_operalog` VALUES ('8e9a8292bd4ac2e6c15c3a164f555bab', '资源管理', '菜单树', '修改', '1', '[收款还款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-29 16:10:33');
INSERT INTO `t_operalog` VALUES ('8f1bc3b55340c9b34cca5de48ce91e66', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-25 15:48:44');
INSERT INTO `t_operalog` VALUES ('8f2c662f7c4bed97d622e0cc21149999', '客服服务', '客服列表', '增加', '1', '[asdf] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-19 09:35:59');
INSERT INTO `t_operalog` VALUES ('8f4ced3f3ed01334c9e3724630e50853', '还款方式', '还款方式列表', '修改', '1', '[一次性还款] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-24 14:05:27');
INSERT INTO `t_operalog` VALUES ('8fc386157004b8c5919e4703095ed7d7', '充值设置', '充值设置列表', '增加', '1', '[支付宝] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addRechargeSet', 'RechargeSetList_add', '超级管理员', '2014-05-05 17:07:02');
INSERT INTO `t_operalog` VALUES ('8fc702484957c87b7c1ae4e70ea98ec3', '资源管理', '菜单树', '增加', '1', '[逾期借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-29 16:12:53');
INSERT INTO `t_operalog` VALUES ('90295b238f25c0133191b0a937b51a1a', '资源管理', '菜单树', '修改', '1', '[标种类型] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:56:52');
INSERT INTO `t_operalog` VALUES ('9088f6fdf711a42431cffa987d089820', '资源管理', '菜单树', '增加', '1', '[复审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-18 10:45:35');
INSERT INTO `t_operalog` VALUES ('91404e792115a5edb30bf1f5267df7aa', '还款方式', '还款方式列表', '增加', '1', '[vvv] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:28:09');
INSERT INTO `t_operalog` VALUES ('914410a792fe5d1c0d9cc19353d3915a', '还款方式', '还款方式列表', '修改', '1', '[按月付息，到期还本] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-24 14:06:01');
INSERT INTO `t_operalog` VALUES ('92801f06214096df445ee98c8aa3c311', '公告管理', '公告列表', '增加', '1', '[【关于暂时关闭宝付充值通道公告】] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:38:45');
INSERT INTO `t_operalog` VALUES ('92f17d01631ac52d8345a35607fc395d', '下拉项管理', '下拉项树', '增加', '1', '[取费方式] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-05-05 13:35:30');
INSERT INTO `t_operalog` VALUES ('92fad054e6a6fa6af6f01fa351d40071', '客服服务', '客服列表', '修改', '1', '[小夏] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-03-14 10:45:18');
INSERT INTO `t_operalog` VALUES ('93002b4cf93ab5382f71969391207f0b', '会员银行卡', '银行卡列表', '审核', '1', '会员银行卡审核成功', 'com.glacier.netloan.service.finance.FinanceBankCardService', 'auditApplyAmount', 'bankCardList_audit', '超级管理员', '2014-04-08 17:50:32');
INSERT INTO `t_operalog` VALUES ('9305a0cec2ca38693a960a509c472bf9', '还款方式', '还款方式列表', '修改', '1', '[一次性还款] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-23 15:18:13');
INSERT INTO `t_operalog` VALUES ('9340f84945e6a2ec3a639b2bd0ab2426', '下拉项管理', '下拉项树', '增加', '0', '下拉项名称重复', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-14 16:43:16');
INSERT INTO `t_operalog` VALUES ('938c6bdbce37297fa2e902c1b066d42d', '公告管理', '公告列表', '增加', '1', '[yyyy] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-02-22 09:07:34');
INSERT INTO `t_operalog` VALUES ('9392d0053797d2be93bbae229735f3c5', '下拉项管理', '下拉列表', '增加', '1', '[是] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:40:59');
INSERT INTO `t_operalog` VALUES ('94a7f8561f30cbe6744bcfca2bf20838', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-17 08:52:18');
INSERT INTO `t_operalog` VALUES ('94cac18c940cd37978532a783ae22423', '下拉项管理', '下拉列表', '增加', '1', '[企业认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:33:22');
INSERT INTO `t_operalog` VALUES ('9512f049c060973217581f0eff21280f', '信用类别', '信用类别列表', '增加', '1', '[vipAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:04:41');
INSERT INTO `t_operalog` VALUES ('959303a0c42f89c1d29c32a6206874a7', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-24 16:12:34');
INSERT INTO `t_operalog` VALUES ('96132fb1c5a3ef70aac7c4ae74bbfb52', '会员信用', '信用列表', '增加', '1', '[阿萨德] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-03-26 15:43:53');
INSERT INTO `t_operalog` VALUES ('965657708bbde1b5dbf381839835dbe9', '资源管理', '菜单树', '修改', '1', '[会员管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-19 16:20:21');
INSERT INTO `t_operalog` VALUES ('976909f4c8e34a7a5250c6423385cfbf', '充值设置', '充值设置列表', '增加', '1', '[ffff] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addNews', 'RechargeSetList_add', '超级管理员', '2014-05-05 14:46:38');
INSERT INTO `t_operalog` VALUES ('97c1aebd027ffd5d65362578e6e1f3f0', '广告管理', '广告列表', '增加', '1', '[ffff] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-04-14 15:56:21');
INSERT INTO `t_operalog` VALUES ('9a538c99104c221ab5c492cd1ea9115c', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 13:45:32');
INSERT INTO `t_operalog` VALUES ('9a54ae45a66cbbbad75b1d001af88242', '下拉项管理', '下拉列表', '增加', '1', '[朋友] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 11:04:15');
INSERT INTO `t_operalog` VALUES ('9af3136debbc035f460030e39472b210', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:36:01');
INSERT INTO `t_operalog` VALUES ('9af600af3f3d2c08c5e840605014a74a', '下拉项管理', '下拉列表', '增加', '1', '[否] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:41:22');
INSERT INTO `t_operalog` VALUES ('9aff3572df58b0e4083190e4d16b3515', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 审核成功 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-05-06 10:53:00');
INSERT INTO `t_operalog` VALUES ('9b43b92a5b5acc973a793570700a13dd', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-24 13:48:28');
INSERT INTO `t_operalog` VALUES ('9c044c7fe721ff739031a23c72b8eb7f', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-30 10:47:42');
INSERT INTO `t_operalog` VALUES ('9cc80e3e434b22d07d1470c5a886b564', '下拉项管理', '下拉列表', '增加', '1', '[信用认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:32:50');
INSERT INTO `t_operalog` VALUES ('9d4fa6b61f2ff7bea76206d3ddc9b8c3', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:42:28');
INSERT INTO `t_operalog` VALUES ('9df2d18df6c6c475939e463b4045c8f5', '公告管理', '公告列表', '删除', '1', '成功删除了[ 999999 ]公告', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'delAnnouncement', 'AnnouncementList_del', '超级管理员', '2014-04-23 16:16:07');
INSERT INTO `t_operalog` VALUES ('9e6aac6815b31bdefc14696a1f232e51', '充值设置', '充值设置列表', '修改', '1', '[支付宝] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '超级管理员', '2014-05-06 11:07:50');
INSERT INTO `t_operalog` VALUES ('9e90d9778b31b40cdbe6c8c6eacf433b', '公告管理', '公告列表', '增加', '1', '[关于1月11日凌晨零点临时维护公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:40:11');
INSERT INTO `t_operalog` VALUES ('9ee8193c4e0849885d7956ba017f387c', '下拉项管理', '下拉列表', '修改', '1', '[禁用] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 14:42:50');
INSERT INTO `t_operalog` VALUES ('9f3638051ba2659023915ee8834afb55', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-05-05 10:27:09');
INSERT INTO `t_operalog` VALUES ('9f5bacfebe997b07a7882997238e8bda', '下拉项管理', '下拉列表', '增加', '1', '[未购车] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 17:54:36');
INSERT INTO `t_operalog` VALUES ('a009210ad29efe7bca9eddfbb39c138c', '帮助中心', '帮助列表', '增加', '1', '[个人借款需提供的资料有哪些？] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-03-14 10:52:24');
INSERT INTO `t_operalog` VALUES ('a03a7d442857a7cdf4ea9691969478cc', '招聘信息', '招聘列表', '修改', '0', '招聘管理名称重复', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-19 13:53:25');
INSERT INTO `t_operalog` VALUES ('a04e3e8b2e9bbbfa7215254802487e7b', '招聘信息', '招聘列表', '增加', '1', '[ddd] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-18 14:58:17');
INSERT INTO `t_operalog` VALUES ('a053db184c91f34104fd173e19f3ae3c', '帮助中心', '帮助列表', '修改', '1', '[eeeddd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 11:04:08');
INSERT INTO `t_operalog` VALUES ('a10cd2aa3ea2b7009122707eb2e79f5c', '下拉项管理', '下拉列表', '增加', '1', '[购买完成] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 10:50:34');
INSERT INTO `t_operalog` VALUES ('a11b6bd3d900cf171b5feb01896d5ed1', '资源管理', '菜单树', '修改', '1', '[会员管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-19 16:28:10');
INSERT INTO `t_operalog` VALUES ('a1515d527a74cc3685483e7ce58086e2', '新闻管理', '新闻列表', '修改', '1', '[十五年一遇的双情人节，大家准备好了吗？] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-03-14 10:24:24');
INSERT INTO `t_operalog` VALUES ('a1d06e619434e35e7118988c44db65d4', '广告管理', '广告列表', '增加', '1', '[8] 广告信息已保存', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-02-22 09:11:45');
INSERT INTO `t_operalog` VALUES ('a2af44875f908b54a1999580874f0cd9', '资源管理', '菜单树', '修改', '1', '[友情链接] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:56');
INSERT INTO `t_operalog` VALUES ('a38cc4ae16fce2d72c04ce79b305d50d', '还款方式', '还款方式列表', '增加', '1', '[dd] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:26:03');
INSERT INTO `t_operalog` VALUES ('a3a9c8bff32b5a2da448cecfa95a6857', '密保问题', '问题列表', '增加', '1', '[您中学学校校名？] 密保问题信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterQuestionService', 'addParameterQuestion', 'QuestionList_add', '超级管理员', '2014-04-16 10:20:11');
INSERT INTO `t_operalog` VALUES ('a3c9981f501b0d72aaa8b2c646da43fb', '新闻管理', '新闻列表', '修改', '1', '[冷空气] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-02-22 09:28:05');
INSERT INTO `t_operalog` VALUES ('a3d37b00482a9c2b6d1c8f1a546b0755', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:45:23');
INSERT INTO `t_operalog` VALUES ('a3f67a23e55a74a920583d30f7d53399', '导航信息', '导航树', '修改', '1', '[我要登录] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:56');
INSERT INTO `t_operalog` VALUES ('a46c1d5c8e5b8f75e4b086c68a77e8bc', '会员信用', '信用列表', '增加', '1', '[地方] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-03-26 15:44:09');
INSERT INTO `t_operalog` VALUES ('a46d41294b3deb7e181fcaa753aad05b', '资源管理', '操作列表', '增加', '1', '[分配角色] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:41:31');
INSERT INTO `t_operalog` VALUES ('a4948cc6f5869d1e67fbae67a0ee85a4', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:35:33');
INSERT INTO `t_operalog` VALUES ('a5525d5c0fdf5b4e68ce42df6f428217', '资源管理', '菜单树', '修改', '1', '[会员财务] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-24 17:06:21');
INSERT INTO `t_operalog` VALUES ('a573f44570b9367b91c869577767ed93', '充值设置', '充值设置列表', '修改', '1', '[kkkkkkk] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '超级管理员', '2014-05-05 16:34:37');
INSERT INTO `t_operalog` VALUES ('a60ee31289df72af21e8d81f36860701', '下拉项管理', '下拉项树', '修改', '1', '[审核状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-05-06 10:54:12');
INSERT INTO `t_operalog` VALUES ('a63d5683dea2db0e1d3fd049b769deb1', '下拉项管理', '下拉列表', '修改', '1', '[启用] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 14:42:47');
INSERT INTO `t_operalog` VALUES ('a64b5839b1b8d6726d3586d6948de9b3', '帮助中心', '帮助列表', '删除', '1', '成功删除了[ as ]操作', 'com.glacier.netloan.service.website.WebsiteHelpService', 'delWebsiteHelp', 'HelpList_del', '超级管理员', '2014-02-19 13:52:30');
INSERT INTO `t_operalog` VALUES ('a6d508f6570a1ba753dce9bcdbde4dd5', '客服服务', '客服列表', '修改', '1', '[ccc] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-15 14:48:38');
INSERT INTO `t_operalog` VALUES ('a6f8166f7595dcdf1609924ddad7daf0', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-16 09:42:05');
INSERT INTO `t_operalog` VALUES ('a6fa5b99fbee19112c68cd8080a7da97', '下拉项管理', '下拉项树', '增加', '1', '[帮助中心状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:33:47');
INSERT INTO `t_operalog` VALUES ('a75a559ae4f97e088b5a4efb481964e9', '下拉项管理', '下拉项树', '删除', '0', '该下拉项存在所属下拉值，如需删除请先删除所属下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-04-15 15:59:45');
INSERT INTO `t_operalog` VALUES ('a780bd95fdcbea074e3a22088ba6b3cd', '下拉项管理', '下拉项树', '增加', '1', '[信用积分类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-24 10:55:29');
INSERT INTO `t_operalog` VALUES ('a834aeae19f26d94eb0e1bb1cb9535d7', '下拉项管理', '下拉列表', '修改', '1', '[待审核] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-04-02 16:29:01');
INSERT INTO `t_operalog` VALUES ('a8d78e2b1ab61c150bd7b4b6c62581db', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-16 09:51:36');
INSERT INTO `t_operalog` VALUES ('a903f9661c4d0abf3228245d18a37f2a', '招聘信息', '招聘列表', '删除', '1', '成功删除了[ asdddddddddddd ]操作', 'com.glacier.netloan.service.website.WebsiteHiringService', 'delWebsiteHiring', 'HiringList_del', '超级管理员', '2014-02-18 16:43:13');
INSERT INTO `t_operalog` VALUES ('a919dd68ab3b50b47e25a7d2005e338b', '下拉项管理', '下拉项树', '增加', '1', '[公用下拉项] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 16:29:29');
INSERT INTO `t_operalog` VALUES ('a925b4e1e5cf17df9f16ec21a59422b4', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 13:44:49');
INSERT INTO `t_operalog` VALUES ('a973dfdfbed6fe9299833453e9312cd7', '下拉项管理', '下拉项树', '增加', '1', '[审核状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-05-05 16:27:59');
INSERT INTO `t_operalog` VALUES ('a9767162ecc6a21d6de235b136dc1224', '下拉项管理', '下拉项树', '增加', '1', '[流标原因] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-15 15:34:22');
INSERT INTO `t_operalog` VALUES ('a980f9f2a783d75750909b41da1720a2', '资源管理', '菜单树', '修改', '1', '[还款方式] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-29 16:10:26');
INSERT INTO `t_operalog` VALUES ('aa2fe7e4b3ce517cddde584d475b4720', '信用类别', '信用类别列表', '删除', '1', '成功删除了[ idCardAuth ]信用积分类型', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'delCreditTypes', 'CreditTypeList_del', '超级管理员', '2014-03-26 17:54:23');
INSERT INTO `t_operalog` VALUES ('aa6b65279604181bd2bda175badec914', '标种类型', '标种类型列表', '删除', '1', '成功删除了[ 时代发生的 ]标种类型', 'com.glacier.netloan.service.borrow.LoanTenderService', 'delLoanTender', 'LoanTenderList_del', '超级管理员', '2014-04-23 15:11:41');
INSERT INTO `t_operalog` VALUES ('ab0cc4fca63e1159556b0b8f293ddca2', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:45:07');
INSERT INTO `t_operalog` VALUES ('ab1d87dcfa920bcee3a78c7c4e7c5515', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:34:47');
INSERT INTO `t_operalog` VALUES ('ab72c0ec2f2e993d807304c74d6484a7', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-24 14:22:44');
INSERT INTO `t_operalog` VALUES ('abdf7d4289d9f03c08b9c8956e1e3fd0', '下拉项管理', '下拉项树', '增加', '1', '[我要借款] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-14 16:42:28');
INSERT INTO `t_operalog` VALUES ('ac060dd14e83a51dc67219d7ae782e5d', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-21 10:17:42');
INSERT INTO `t_operalog` VALUES ('ac3fb5b3de1647861abaf45ac5656d3c', '下拉项管理', '下拉列表', '增加', '1', '[输入框] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:53:45');
INSERT INTO `t_operalog` VALUES ('ac53e8d401709d696942a6ff5ad4dacd', '下拉项管理', '下拉列表', '增加', '1', '[是] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:41:51');
INSERT INTO `t_operalog` VALUES ('ac8797bf52b616f9ecbffc7330addd9c', '下拉项管理', '下拉列表', '修改', '1', '[内置] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:42:00');
INSERT INTO `t_operalog` VALUES ('acdcde7ef37e5bafb46070ba4abb08f7', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:42:52');
INSERT INTO `t_operalog` VALUES ('ad34b8faa0d54274fb1dc1c9cd716eeb', '下拉项管理', '下拉项树', '增加', '1', '[改变类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-24 10:57:24');
INSERT INTO `t_operalog` VALUES ('ae6149ba8a9e2249c3192fb5a6974752', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:55:40');
INSERT INTO `t_operalog` VALUES ('ae975cdbda342b4065c873ad2811731b', '下拉项管理', '下拉列表', '增加', '1', '[投资] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-18 11:02:01');
INSERT INTO `t_operalog` VALUES ('aec2a96406671713cd8360d423d04042', '广告管理', '广告列表', '增加', '1', '[2013年人民币汇率41次创新高 2014年或仍将升值】] 广告信息已保存', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-03-14 10:42:32');
INSERT INTO `t_operalog` VALUES ('aedffc68b86a63f730335b233b36dd4a', '下拉项管理', '下拉项树', '增加', '1', '[银行卡认证] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-08 17:46:57');
INSERT INTO `t_operalog` VALUES ('af1abf8f39d47cda1d0b61f9a3d9b734', '公告管理', '公告列表', '增加', '1', '[周六加班] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-02-22 09:21:34');
INSERT INTO `t_operalog` VALUES ('af8b3c2b80257fadb70e1d14841794a3', '信用类别', '信用类别列表', '增加', '1', '[workAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:06:30');
INSERT INTO `t_operalog` VALUES ('afc3be264da32377908d535dabbcf00b', '公告管理', '公告列表', '增加', '1', '[关于“积分金冠”活动土豪金奖品获奖名单公布] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:37:42');
INSERT INTO `t_operalog` VALUES ('b0521d97e94ac2600ad854985b4a3170', '会员信用', '信用列表', '修改', '1', '[七级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-31 10:25:45');
INSERT INTO `t_operalog` VALUES ('b05f11843531ddd845daf347410699cd', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 17:59:56');
INSERT INTO `t_operalog` VALUES ('b06c4125da64ee6d58081b5dafa96fc8', '充值设置', '充值设置列表', '审核', '1', '[ggggjjjj] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:53:56');
INSERT INTO `t_operalog` VALUES ('b089c082da7f2fe6c3c4a27bb5f499d0', '资源管理', '菜单树', '增加', '1', '[会员财务] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-24 16:11:59');
INSERT INTO `t_operalog` VALUES ('b12652f8b616bc4ed577ccdf1f39c5bc', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-04 17:36:46');
INSERT INTO `t_operalog` VALUES ('b154c74a452f6ba93ef3b2632cbeac09', '下拉项管理', '下拉列表', '增加', '1', '[邮箱认证信用积分] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-03-25 16:58:57');
INSERT INTO `t_operalog` VALUES ('b22427852df0ef7c4e58fc1a143ee037', '招聘信息', '招聘列表', '修改', '1', '[招聘信贷经理/信贷助理/信贷秘书2名 ] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-03-14 10:47:56');
INSERT INTO `t_operalog` VALUES ('b27777aa4037b035eb00cf480845a9fe', '信用类别', '信用类别列表', '增加', '1', '[realNameAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:06:13');
INSERT INTO `t_operalog` VALUES ('b282036ce67eb0ddc7ff82d7dadfe085', '下拉项管理', '下拉项树', '增加', '1', '[是否内置] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 10:06:27');
INSERT INTO `t_operalog` VALUES ('b2d0c49621d068d66856bfc982affb64', '资源管理', '菜单树', '增加', '1', '[财务管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-04 16:37:23');
INSERT INTO `t_operalog` VALUES ('b2f7f0b45d46119aa0bf1b7f4fa7065d', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 17:59:30');
INSERT INTO `t_operalog` VALUES ('b31e31367788f942948db95b898e05ea', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-05 10:20:24');
INSERT INTO `t_operalog` VALUES ('b32d20cde044e1753879a82aecf46f80', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-09 14:17:05');
INSERT INTO `t_operalog` VALUES ('b345baaffd7cf83230cedfa6ed919c79', '下拉项管理', '下拉列表', '增加', '1', '[3] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:25:29');
INSERT INTO `t_operalog` VALUES ('b371c49315e80bc4fb40988643b5e5e7', '帮助中心', '帮助列表', '增加', '1', '[视频认证、借款成功?] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-03-14 10:53:17');
INSERT INTO `t_operalog` VALUES ('b435479e7a87b2a2c6d9719f7859d82b', '还款方式', '还款方式列表', '增加', '1', '[等额本息] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 15:18:03');
INSERT INTO `t_operalog` VALUES ('b43abf5efe29cfabff976b3ca4134345', '公告管理', '公告列表', '删除', '1', '成功删除了[ DFD,yyyy ]公告', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'delAnnouncement', 'AnnouncementList_del', '超级管理员', '2014-02-22 09:20:38');
INSERT INTO `t_operalog` VALUES ('b482275c19b4d35fba144bef835f2c6b', '导航信息', '导航树', '修改', '1', '[我要借款] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:22');
INSERT INTO `t_operalog` VALUES ('b50e324501001c2740f5012830ff8bbf', '下拉项管理', '下拉项树', '增加', '1', '[信件状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-09 14:09:56');
INSERT INTO `t_operalog` VALUES ('b54656fa9cef7a96e27c43b9213a5a30', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 15:48:12');
INSERT INTO `t_operalog` VALUES ('b6a681540afcf6440b665a12672efa48', '下拉项管理', '下拉项树', '修改', '1', '[状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-15 16:37:23');
INSERT INTO `t_operalog` VALUES ('b6d7c3b6de2edbe3bc01da2c3d23d8ae', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-05-04 17:37:38');
INSERT INTO `t_operalog` VALUES ('b6f0f54f35f2e534c37808bf501f8d9f', '资源管理', '面板列表', '增加', '1', '[信息通知列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-09 14:14:15');
INSERT INTO `t_operalog` VALUES ('b703c8546e16db4003fd0a7aac8625ab', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 是,否 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-04-15 16:00:08');
INSERT INTO `t_operalog` VALUES ('b70ada53e687114320056fd4dc877b70', '下拉项管理', '下拉项树', '增加', '1', '[复审审核状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-18 10:09:46');
INSERT INTO `t_operalog` VALUES ('b729b6a4b356500738b855e5d6a3d69b', '下拉项管理', '下拉项树', '修改', '1', '[是否购车] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 17:57:40');
INSERT INTO `t_operalog` VALUES ('b7876a84c10502ff5ef91e07162d5553', '资源管理', '菜单树', '修改', '1', '[还款方式] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 10:56:44');
INSERT INTO `t_operalog` VALUES ('b7d2f262496b98e41a9c100a2a6bff96', '下拉项管理', '下拉列表', '增加', '1', '[全部会员] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-05-05 13:35:00');
INSERT INTO `t_operalog` VALUES ('b84535b1142f39f75bbb7fcaabedb8c8', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-25 14:07:43');
INSERT INTO `t_operalog` VALUES ('b84c82c7b117059d60013b9dd48b9a78', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:34:31');
INSERT INTO `t_operalog` VALUES ('b84e56d00e2fba955575f223dce85969', '下拉项管理', '下拉列表', '增加', '1', '[VIP会员] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-05-05 13:34:39');
INSERT INTO `t_operalog` VALUES ('b8afce0a50007cc4b8b4e36a88f2cf0e', '资源管理', '菜单树', '增加', '1', '[会员银行卡] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-04 16:40:52');
INSERT INTO `t_operalog` VALUES ('baab5874ebf17c1adb5416b0045114ca', '下拉项管理', '下拉列表', '增加', '1', '[身份认证信用积分] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-03-25 17:21:41');
INSERT INTO `t_operalog` VALUES ('bab0de858f1491789cc73605042a2aaa', '公告管理', '公告列表', '增加', '1', '[关于国付宝充值接口升级相关公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:37:56');
INSERT INTO `t_operalog` VALUES ('bafcbf1e5e2f33669fd32530554ce06f', '下拉项管理', '下拉列表', '增加', '1', '[已结婚] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:47:49');
INSERT INTO `t_operalog` VALUES ('bc04b927eebe249dd5c67a440dcd85e6', '信用类别', '信用类别列表', '修改', '1', '[idCardAuth] 信用积分类型信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'editCreditType', 'CreditTypeList_edit', '超级管理员', '2014-03-26 17:01:52');
INSERT INTO `t_operalog` VALUES ('bc4d2b381881b0cffea4aad81320223d', '下拉项管理', '下拉项树', '删除', '1', '[置为天标] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-04-15 16:00:11');
INSERT INTO `t_operalog` VALUES ('bc807514d4e3b52eb833925bf6614f45', '会员信用', '信用列表', '增加', '1', '[六级] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-03-19 09:19:01');
INSERT INTO `t_operalog` VALUES ('bc81790f63829349c72e40c8aa4da0e9', '资源管理', '面板列表', '增加', '1', '[认证列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-24 13:17:29');
INSERT INTO `t_operalog` VALUES ('bd1b19e1391afda3f7bf8c8197ee3f62', '下拉项管理', '下拉列表', '增加', '1', '[商业伙伴] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 11:04:39');
INSERT INTO `t_operalog` VALUES ('be02867adc54dcba86060352dbcdc82f', '资源管理', '菜单树', '修改', '1', '[操作日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:50:47');
INSERT INTO `t_operalog` VALUES ('be1a493a9b8ec726904194c1ef1b2c35', '下拉项管理', '下拉项树', '增加', '1', '[会员管理] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-21 10:23:11');
INSERT INTO `t_operalog` VALUES ('be6961db852df0906d5eec11d71bcbf5', '下拉项管理', '下拉项树', '增加', '1', '[置为天标] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-15 15:35:00');
INSERT INTO `t_operalog` VALUES ('beb27fc8a5717fd8adca2261607971a6', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-04 17:35:16');
INSERT INTO `t_operalog` VALUES ('bf947cfa6e0e484b441a3a3328d485bf', '信用类别', '信用类别列表', '增加', '1', '[mobileAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:05:19');
INSERT INTO `t_operalog` VALUES ('bfc27e6d7b4e9d49ddff0255b48e0665', '资源管理', '菜单树', '增加', '1', '[系统参数] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-17 15:01:12');
INSERT INTO `t_operalog` VALUES ('bfccfc6d934d6c48fcefe18a132d4092', '会员信用', '信用列表', '修改', '1', '[二级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-31 10:25:08');
INSERT INTO `t_operalog` VALUES ('bfe916d60e9d85597ed300d7c00306fb', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 审核失败 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-05-06 10:53:58');
INSERT INTO `t_operalog` VALUES ('bfeb871d2696c425d30cb312366c5073', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-19 16:30:36');
INSERT INTO `t_operalog` VALUES ('c04da16db80321c8dc2250d33376a7f2', '下拉项管理', '下拉项树', '修改', '1', '[是否购车] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 17:54:43');
INSERT INTO `t_operalog` VALUES ('c07c4afd8f645a285432afec9a0f0c0d', '下拉项管理', '下拉列表', '修改', '1', '[已还完] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-04-24 09:49:21');
INSERT INTO `t_operalog` VALUES ('c0a2705925a0d4044ed0a24cb2376f84', '客服服务', '客服列表', '增加', '1', '[asf] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:47:25');
INSERT INTO `t_operalog` VALUES ('c160e94eb5df74cd9ee170308f93ca9b', '帮助中心', '帮助列表', '增加', '1', '[借款期限、利率和还款方式?] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-03-14 10:51:38');
INSERT INTO `t_operalog` VALUES ('c1828fdbd8c349533c6ebefecd35fcad', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:12');
INSERT INTO `t_operalog` VALUES ('c2a9fd3e8308cd67d32347368131b1fd', '资源管理', '菜单树', '修改', '1', '[系统参数] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 15:01:46');
INSERT INTO `t_operalog` VALUES ('c2aeb80134c5805c497e7e6404e76782', '资源管理', '面板列表', '修改', '1', '[会员财务列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-24 16:50:11');
INSERT INTO `t_operalog` VALUES ('c30cc6fd00eb5b2ab8c355a87f14a0f2', '信用类别', '信用类别列表', '增加', '1', '[CancelworkAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:07:06');
INSERT INTO `t_operalog` VALUES ('c31cc57af39f8eed483d974b015d388c', '客服服务', '客服列表', '删除', '1', '成功删除了[ sd,dsd ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-02-15 14:51:38');
INSERT INTO `t_operalog` VALUES ('c3455dea8aa02d36b2f1f01599d5453f', '信用类别', '信用类别列表', '增加', '1', '[companyAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:06:03');
INSERT INTO `t_operalog` VALUES ('c379a9525a5ecac86a7a756d32305704', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-18 10:17:51');
INSERT INTO `t_operalog` VALUES ('c3a371f9c523f522840fdcdd7459f840', '下拉项管理', '下拉项树', '删除', '1', '[帮助中心状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:35');
INSERT INTO `t_operalog` VALUES ('c3d34f905e0e734c90d1af2415d8e38e', '广告管理', '广告列表', '增加', '1', '[移动支付国家标准2014年5月1日起实施 亮点解读] 广告信息已保存', 'com.glacier.netloan.service.website.WebsiteAdvertisementService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-03-14 10:42:17');
INSERT INTO `t_operalog` VALUES ('c3f56fa23ca808a59f61010c4920b4e4', '导航信息', '导航树', '修改', '0', '禁止选择该导航本身以及子导航作为上级导航', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-18 16:40:26');
INSERT INTO `t_operalog` VALUES ('c46a02f4149d6b6ff2632947481e3d0c', '客服服务', '客服列表', '增加', '1', '[sd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:49:38');
INSERT INTO `t_operalog` VALUES ('c57153f98c2daa8ba5bc71b005cfae8f', '标种类型', '标种类型列表', '增加', '1', '[抵押标] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addLoanTender', 'LoanTenderList_add', '超级管理员', '2014-04-23 15:13:03');
INSERT INTO `t_operalog` VALUES ('c5b11ee585efe33125aee3921a3e89ec', '导航信息', '导航树', '修改', '1', '[发布信用标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:34');
INSERT INTO `t_operalog` VALUES ('c7506853b7d5a37c6426e07af3558645', '会员积分', '积分列表', '修改', '1', '[三级积分] 会员积分级别信息已修改保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'editParameterIntegral', 'IntegralList_edit', '超级管理员', '2014-02-19 10:38:58');
INSERT INTO `t_operalog` VALUES ('c770961d7d23de79e78cbf2747078d82', '下拉项管理', '下拉项树', '删除', '1', '[招聘管理状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:39');
INSERT INTO `t_operalog` VALUES ('c78b2320638fe85b4c13fd0ec4725d9b', '还款方式', '还款方式列表', '删除', '1', '成功删除了[ cfdf,ddd,dd,dsf ]还款方式', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'delRepaymentType', 'RepaymentTypeList_del', '超级管理员', '2014-04-23 13:53:30');
INSERT INTO `t_operalog` VALUES ('c7a80a1704f365f5b26f79d78057cd31', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:26');
INSERT INTO `t_operalog` VALUES ('c7ea91f8fcf1c91f73359b7a45644d2d', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-16 09:47:53');
INSERT INTO `t_operalog` VALUES ('c7ee5398cd2cba9329c55ebbf49d3002', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:28');
INSERT INTO `t_operalog` VALUES ('c88e3168e584c1a05a91919351fc116c', '招聘信息', '招聘列表', '修改', '1', '[招聘投资/理财顾问10名 ] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-03-14 10:48:10');
INSERT INTO `t_operalog` VALUES ('c8977cb59000a9c1807de59c18986aab', '帮助中心', '帮助列表', '增加', '0', '帮助中心名称重复', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:40:25');
INSERT INTO `t_operalog` VALUES ('c8f42a5faa9c03b63988533c313f94b5', '资源管理', '菜单树', '增加', '1', '[充值设置] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-05-05 10:08:03');
INSERT INTO `t_operalog` VALUES ('c96a9104c486ef7b90f4921712468f2d', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-18 10:54:00');
INSERT INTO `t_operalog` VALUES ('c99a013b7208f1f12abf1c76126661dc', '标种类型', '标种类型列表', '增加', '1', '[332423] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'LoanTenderList_add', '超级管理员', '2014-04-15 15:54:22');
INSERT INTO `t_operalog` VALUES ('c9bd7eb814ff33295426aeb9445828b7', '会员积分', '积分列表', '增加', '1', '[三级积分] 会员积分级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'addParameterIntegral', 'IntegralList_add', '超级管理员', '2014-02-19 10:35:39');
INSERT INTO `t_operalog` VALUES ('c9cd2e08b318aa8c126094fc2fced4cb', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-30 14:11:00');
INSERT INTO `t_operalog` VALUES ('caeba250f78389e2a9d3cd298106210c', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 内置,不内置 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:33:54');
INSERT INTO `t_operalog` VALUES ('cb32ae304ed1c7fa681890a637de916f', '下拉项管理', '下拉列表', '增加', '0', '下拉值代码重复', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:26:11');
INSERT INTO `t_operalog` VALUES ('cc326d534ded864c37406eb36bd30d41', '新闻管理', '新闻列表', '增加', '1', '[祝冰川贷第一期积分土豪奖品活动圆满结束] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-14 10:43:01');
INSERT INTO `t_operalog` VALUES ('cd1972d21af7565213ff6aace08349dd', '招聘信息', '招聘列表', '删除', '1', '成功删除了[ sfd ]操作', 'com.glacier.netloan.service.website.WebsiteHiringService', 'delWebsiteHiring', 'HiringList_del', '超级管理员', '2014-02-19 13:57:01');
INSERT INTO `t_operalog` VALUES ('cdaeae67c582f12dcf3b19c798885a1c', '标种类型', '标种类型列表', '修改', '1', '[dfhfdhbbbb] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 10:53:19');
INSERT INTO `t_operalog` VALUES ('cdb3dc5d17b03769d41808fcce2c3039', '充值设置', '充值设置列表', '增加', '1', '[4535] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addNews', 'RechargeSetList_add', '超级管理员', '2014-05-05 13:48:13');
INSERT INTO `t_operalog` VALUES ('cdf57bb1d35c2b25885384c910da439b', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 14:09:37');
INSERT INTO `t_operalog` VALUES ('ce8f8116ff264dca44a05af954a83c49', '标种类型', '标种类型列表', '删除', '1', '成功删除了[ b cb ]标种类型', 'com.glacier.netloan.service.borrow.LoanTenderService', 'delLoanTender', 'LoanTenderList_del', '超级管理员', '2014-04-23 10:53:15');
INSERT INTO `t_operalog` VALUES ('cee0d448bf96231b3374aa430b9c3aac', '下拉项管理', '下拉项树', '修改', '0', '下拉项名称重复', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-05-06 10:46:37');
INSERT INTO `t_operalog` VALUES ('cf1d8d3b8f660e135c4796f29f394cd5', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 16:30:21');
INSERT INTO `t_operalog` VALUES ('cf268b4f224bd3ea7349e7552540f51d', '资源管理', '菜单树', '修改', '1', '[复审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 13:07:13');
INSERT INTO `t_operalog` VALUES ('cf85ffebd7b9673b233c5a99a053d64c', '会员信用', '信用列表', '修改', '1', '[啊的的] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-19 10:23:03');
INSERT INTO `t_operalog` VALUES ('cf8d8f78df71db72fc1a0ec3b3fdd14a', '友情链接', '友情列表', '增加', '1', '[百度一下] 友情链接信息已保存', 'com.glacier.netloan.service.website.WebsiteLinkService', 'addLink', 'LinkList_add', '超级管理员', '2014-02-22 09:32:21');
INSERT INTO `t_operalog` VALUES ('cfa23fc6f833a722a82e811218208e72', '客服服务', '客服列表', '增加', '1', '[小东] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-03-14 10:46:08');
INSERT INTO `t_operalog` VALUES ('d01738354e5eae05ba7400042b2417e1', '下拉项管理', '下拉项树', '修改', '1', '[婚姻状况] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 11:13:31');
INSERT INTO `t_operalog` VALUES ('d03cea94cc728f3188595717b0fe6e9b', '还款方式', '还款方式列表', '增加', '1', '[按月付息，到期还本] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 15:18:27');
INSERT INTO `t_operalog` VALUES ('d03d8d2145984af580ba3cbdc7549c5d', '下拉项管理', '下拉项树', '增加', '1', '[内置] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 16:34:53');
INSERT INTO `t_operalog` VALUES ('d04046e4f7ac5bd6a944d1070ec7ae9c', '信用类别', '信用类别列表', '修改', '1', '[idCardAuth] 信用积分类型信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'editCreditType', 'CreditTypeList_edit', '超级管理员', '2014-03-26 16:24:44');
INSERT INTO `t_operalog` VALUES ('d12a7df2db55c5beb836b70a72ed0975', '下拉项管理', '下拉项树', '修改', '1', '[类型] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 11:08:32');
INSERT INTO `t_operalog` VALUES ('d188b30283e6180d22548b1ffe884951', '新闻管理', '新闻列表', '增加', '1', '[冰川贷李欣贺入选2013年“世界500强人”大奖] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-14 10:23:24');
INSERT INTO `t_operalog` VALUES ('d1ae0bc692b8f20eced255331d86bc9e', '下拉项管理', '下拉列表', '增加', '1', '[审核成功] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-05-05 16:28:52');
INSERT INTO `t_operalog` VALUES ('d1d3c04a7cb793994c49a0d67ce2f18c', '资源管理', '面板列表', '修改', '1', '[充值设置列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-05-05 10:25:14');
INSERT INTO `t_operalog` VALUES ('d1e105ab0fc02069b6afc441b285ba4d', '下拉项管理', '下拉列表', '增加', '1', '[删除] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-09 14:11:19');
INSERT INTO `t_operalog` VALUES ('d1e6637a07fb459a5966fc63c5d575af', '招聘信息', '招聘列表', '修改', '1', '[招聘金融信贷专员5名 ] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-03-14 10:48:31');
INSERT INTO `t_operalog` VALUES ('d1eca48086dbbb011e944624bfdc2cbe', '下拉项管理', '下拉项树', '增加', '1', '[是否有投标奖励] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-15 15:35:29');
INSERT INTO `t_operalog` VALUES ('d20a71f49ef49290ff4e22632980c090', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-05 10:21:46');
INSERT INTO `t_operalog` VALUES ('d330958e345474c023d331fbba5ad28f', '帮助中心', '帮助列表', '增加', '1', '[eee] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:39:38');
INSERT INTO `t_operalog` VALUES ('d33d592336166bbaf2869ed19ba7b4ff', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-05-05 14:49:31');
INSERT INTO `t_operalog` VALUES ('d34a78cacd5d89e0a3a6d533feeeb7d1', '资源管理', '面板列表', '修改', '1', '[申请额度列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-24 15:47:28');
INSERT INTO `t_operalog` VALUES ('d42b99f442c2da209f02de303b451572', '资源管理', '菜单树', '修改', '1', '[公告管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:39');
INSERT INTO `t_operalog` VALUES ('d4606504940c8e6628d1a5e18d7c48ae', '帮助中心', '帮助列表', '修改', '1', '[dd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 13:52:10');
INSERT INTO `t_operalog` VALUES ('d46ba1ca01706b4f1c5f320860de1208', '资源管理', '菜单树', '增加', '1', '[借款留言] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-05-04 17:33:33');
INSERT INTO `t_operalog` VALUES ('d4cde5f0bae01489e6884b6742695bd2', '新闻管理', '新闻列表', '增加', '1', '[冰川贷李欣贺受邀出席中国财富管理50人论坛 ] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-14 10:22:42');
INSERT INTO `t_operalog` VALUES ('d4da0cd8439db6f2fcc9edce2ac49acd', '友情链接', '友情列表', '增加', '1', '[迅付信息科技有限公司] 友情链接信息已保存', 'com.glacier.netloan.service.website.WebsiteLinkService', 'addLink', 'LinkList_add', '超级管理员', '2014-03-14 10:44:37');
INSERT INTO `t_operalog` VALUES ('d51b9bbe7230c94558e774b3013a4b0c', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-22 15:17:24');
INSERT INTO `t_operalog` VALUES ('d53edc6e506da02998b4a4036a412a31', '管理员设置', '管理员列表', '增加', '1', '[sdf]用户信息已保存', 'com.glacier.netloan.service.system.UserService', 'addUser', 'UserList_add', '超级管理员', '2014-02-17 14:43:31');
INSERT INTO `t_operalog` VALUES ('d5af85403a214e5f69c9fcc988a8442e', '下拉项管理', '下拉项树', '修改', '1', '[是否购车] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-25 09:06:27');
INSERT INTO `t_operalog` VALUES ('d6547dd4f76d2abc3f744f88fc48b777', '还款方式', '还款方式列表', '增加', '0', '还款方式编号重复', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:26:07');
INSERT INTO `t_operalog` VALUES ('d6f6bc8ee032cf9641cc29a83bea5ea8', '下拉项管理', '下拉项树', '增加', '1', '[客服状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:31:10');
INSERT INTO `t_operalog` VALUES ('d7a0a8cbbd0fada82f1e29e7e42bec25', '资源管理', '菜单树', '增加', '1', '[还款方式] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-18 10:50:39');
INSERT INTO `t_operalog` VALUES ('d7c235a7b925c519e5869e774b15633c', '下拉项管理', '下拉列表', '增加', '1', '[会员] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:32:30');
INSERT INTO `t_operalog` VALUES ('d821a1447e35e6aa7f260860dde1bb82', '下拉项管理', '下拉列表', '增加', '1', '[增加] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 10:57:58');
INSERT INTO `t_operalog` VALUES ('d82ffebe93ea7e5f93fbf5b765837523', '下拉项管理', '下拉列表', '增加', '1', '[否] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:42:09');
INSERT INTO `t_operalog` VALUES ('d864c5320693a72390c9e06b29f805b4', '资源管理', '面板列表', '增加', '1', '[银行卡列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-04-04 16:42:10');
INSERT INTO `t_operalog` VALUES ('d869aff4f1d1dfc8561d79781d7d0b91', '下拉项管理', '下拉列表', '增加', '1', '[手机认证信用积分] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-03-25 16:59:32');
INSERT INTO `t_operalog` VALUES ('d8a95a1e0120728a7e251a50d2a0da25', '资源管理', '操作列表', '编辑', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-05-06 08:59:03');
INSERT INTO `t_operalog` VALUES ('d8f02894587457aef6b13b72c81a4b16', '资源管理', '菜单树', '增加', '1', '[充值记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-05-05 10:09:37');
INSERT INTO `t_operalog` VALUES ('d91a5912b2f60302a96dbe0ff63faa51', '资源管理', '面板列表', '增加', '1', '[借款留言列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-05-04 17:34:23');
INSERT INTO `t_operalog` VALUES ('d96413917992abc05588a555ea5aad2b', '下拉项管理', '下拉列表', '增加', '1', '[手机认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:32:31');
INSERT INTO `t_operalog` VALUES ('d965126021d5548a79093b0f219248e1', '资源管理', '操作列表', '编辑', '1', '[分配还款方式] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-24 09:47:23');
INSERT INTO `t_operalog` VALUES ('d96882464906d09498df48e3582b695c', '帮助中心', '帮助列表', '增加', '1', '[机构借款需提供哪些资料？] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-03-14 10:52:36');
INSERT INTO `t_operalog` VALUES ('d97c3900b34891e142a4df18a7ba48ef', '资源管理', '操作列表', '增加', '1', '[授权] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-24 15:52:51');
INSERT INTO `t_operalog` VALUES ('d9997eac223c35b88e06271505a5ab4b', '新闻管理', '新闻列表', '增加', '1', '[dd] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-25 15:15:17');
INSERT INTO `t_operalog` VALUES ('da314e16d9576ee15e9705f2cb590ad8', '投标记录', '投标记录列表', '删除', '1', '成功删除了投标记录信息', 'com.glacier.netloan.service.borrow.TenderNotesService', 'delTenderNotes', 'TenderNotesList_del', '超级管理员', '2014-05-06 13:45:37');
INSERT INTO `t_operalog` VALUES ('da8f7db041d57efed492e1e97047e281', '资源管理', '菜单树', '修改', '1', '[网站管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:14');
INSERT INTO `t_operalog` VALUES ('daa393c3488b5faed0c357c1ad8f3e65', '会员信用', '信用列表', '增加', '1', '[都是] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-02-18 16:11:50');
INSERT INTO `t_operalog` VALUES ('dace1dfdad7e1acffe4f913991019ea6', '还款方式', '还款方式列表', '删除', '1', '成功删除了[ vvv ]还款方式', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'delRepaymentType', 'RepaymentTypeList_del', '超级管理员', '2014-04-23 15:15:32');
INSERT INTO `t_operalog` VALUES ('dafbfa5bf66f3593f9813d4e3590cc43', '下拉项管理', '下拉列表', '修改', '1', '[管理员] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:41:48');
INSERT INTO `t_operalog` VALUES ('db6204a1852f8151efe32dc1461e899c', '还款方式', '还款方式列表', '增加', '1', '[ddd] 还款方式信息已保存', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'addRepaymentType', 'RepaymentTypeList_add', '超级管理员', '2014-04-23 13:20:31');
INSERT INTO `t_operalog` VALUES ('dbd38e152ddd17962784702f49d39e35', '下拉项管理', '下拉列表', '修改', '1', '[审核失败] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-05-06 10:52:23');
INSERT INTO `t_operalog` VALUES ('dbe399bd1cb3fc050a61cd7517df150a', '还款方式', '还款方式列表', '删除', '1', '成功删除了[ sdf ]还款方式', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'delRepaymentType', 'RepaymentTypeList_del', '超级管理员', '2014-04-23 15:15:28');
INSERT INTO `t_operalog` VALUES ('dc158466943a32523508498d83d5d60f', '公告管理', '公告列表', '增加', '1', '[关于汇潮支付全面恢复各银行充值公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:38:17');
INSERT INTO `t_operalog` VALUES ('dc21f52da8c479a9531e0c4a8668bcc1', '下拉项管理', '下拉列表', '修改', '1', '[VIP认证信用积分] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-03-25 16:57:20');
INSERT INTO `t_operalog` VALUES ('dcca6e26af6fee005ca915af1007ac71', '充值设置', '充值设置列表', '删除', '1', '成功删除了[ fdg,4535,sdf ]会员充值设置', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'delNews', 'RechargeSetList_del', '超级管理员', '2014-05-05 14:42:56');
INSERT INTO `t_operalog` VALUES ('dd633789b351ca7647f1e5c3fda00536', '标种类型', '标种类型列表', '修改', '1', '[净值标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-24 14:40:26');
INSERT INTO `t_operalog` VALUES ('dda1128a634e12089a6e04ad153db563', '下拉项管理', '下拉列表', '增加', '1', '[真实姓名认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:33:41');
INSERT INTO `t_operalog` VALUES ('ddb23d79f5cc97cd2be81f7ee3e596ac', '导航信息', '导航树', '增加', '1', '[dfsa] 导航信息已保存', 'com.glacier.netloan.service.website.WebsiteNavService', 'addNav', 'NavTree_add', '超级管理员', '2014-02-19 14:26:32');
INSERT INTO `t_operalog` VALUES ('ddda4b38275b5a3724cdc957420eb522', '资源管理', '菜单树', '增加', '1', '[初审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-18 10:35:27');
INSERT INTO `t_operalog` VALUES ('de97814a4d97c8f43e4710d097acfda5', '下拉项管理', '下拉列表', '增加', '1', '[手动取消] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 09:52:15');
INSERT INTO `t_operalog` VALUES ('defb296327f1e3eaf4ff50b9ff158e49', '资源管理', '菜单树', '增加', '1', '[积分记录] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-22 15:02:31');
INSERT INTO `t_operalog` VALUES ('df25760e3bfa4bedb16467ef0fe8fc8e', '公告管理', '公告列表', '增加', '1', '[关于中国工商银行系统维护的公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:39:58');
INSERT INTO `t_operalog` VALUES ('df367c2e10c224b7009b9772d3ef935d', '资源管理', '菜单树', '修改', '1', '[广告管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:43');
INSERT INTO `t_operalog` VALUES ('df38bcbdd8a84d583cc6a4ed538cc441', '标种类型', '标种类型列表', '修改', '1', '[dfdf] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editAdvertisement', 'LoanTenderList_edit', '超级管理员', '2014-04-15 16:05:43');
INSERT INTO `t_operalog` VALUES ('df72bff6a50707e24eaa9c6bb39fd1c3', '下拉项管理', '下拉项树', '删除', '1', '[是否有投标待收限制] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-04-15 15:59:52');
INSERT INTO `t_operalog` VALUES ('df8f677b8eff358a0501283f07e9ecb7', '会员信用', '信用列表', '修改', '1', '[一级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-03-19 09:18:14');
INSERT INTO `t_operalog` VALUES ('df9b84864e29f5c28575cd2728147830', '下拉项管理', '下拉项树', '增加', '1', '[申请类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-24 17:01:50');
INSERT INTO `t_operalog` VALUES ('dfd3266ba392a4dfaabe28d4210cf140', '充值设置', '充值设置列表', '修改', '1', '[kkkkkkk] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editNews', 'RechargeSetList_edit', '超级管理员', '2014-05-05 14:18:12');
INSERT INTO `t_operalog` VALUES ('e018a03bd7d9d8fa9bd9c558ee8e5e95', '客服服务', '客服列表', '增加', '1', '[小夏] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-03-14 10:45:04');
INSERT INTO `t_operalog` VALUES ('e196df290dc5f455550fc3150917a1f0', '新闻管理', '新闻列表', '修改', '1', '[情人节主题] 新闻信息已修改', 'com.glacier.netloan.service.website.WebsiteNewsService', 'editNews', 'NewsList_edit', '超级管理员', '2014-02-22 09:29:54');
INSERT INTO `t_operalog` VALUES ('e1bb7be2911d591d5c0350726403a2a1', '招聘信息', '招聘列表', '增加', '1', '[招聘系统开发/维护10名 ] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-03-14 10:48:44');
INSERT INTO `t_operalog` VALUES ('e1c45c82bb98fafaea5334f62dec5771', '下拉项管理', '下拉列表', '增加', '1', '[VIP认证] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-25 14:31:54');
INSERT INTO `t_operalog` VALUES ('e1d65cf9a2eb9f28636da6dfbab29674', '下拉项管理', '下拉列表', '增加', '1', '[已还成] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:07:30');
INSERT INTO `t_operalog` VALUES ('e1e1c741f10df2d001cf1719579d2138', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-30 10:08:33');
INSERT INTO `t_operalog` VALUES ('e22bb51aa7b18ef66e897f0c0039ac69', '下拉项管理', '下拉列表', '修改', '1', '[内置] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-15 16:35:07');
INSERT INTO `t_operalog` VALUES ('e29077c8548107e6645bb76b2fd4e4c4', '下拉项管理', '下拉项树', '增加', '1', '[是否设置投标密码] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-15 15:37:05');
INSERT INTO `t_operalog` VALUES ('e40c03bf2cdbd4ce5c7327079538d3b6', '资源管理', '面板列表', '增加', '1', '[asdf] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-03-26 15:47:46');
INSERT INTO `t_operalog` VALUES ('e4270b631583a908f34269d3de96c2e3', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 16:29:56');
INSERT INTO `t_operalog` VALUES ('e433da6a83a4d8d1f292b17ffc4f03e2', '下拉项管理', '下拉列表', '增加', '1', '[初审通过] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:08:54');
INSERT INTO `t_operalog` VALUES ('e43e83c7113ae00c7ec47429c10eaa47', '下拉项管理', '下拉列表', '修改', '1', '[自定义] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:42:04');
INSERT INTO `t_operalog` VALUES ('e452fd06942065eeaf7d34aaca1dbf33', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:12');
INSERT INTO `t_operalog` VALUES ('e47ef598f7865fc6ef00bd7ee05d0c89', '资源管理', '面板列表', '修改', '1', '[客服列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-15 14:37:22');
INSERT INTO `t_operalog` VALUES ('e4829cfc50849d622df1aece6a23f251', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-16 09:39:34');
INSERT INTO `t_operalog` VALUES ('e539548f97f9b9392e0adc26e92f6e5a', '下拉项管理', '下拉列表', '增加', '1', '[已购车] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 17:54:08');
INSERT INTO `t_operalog` VALUES ('e5648d6c1d84c51dce5e463990b5f921', '客服服务', '客服列表', '修改', '1', '[ccce] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-18 16:42:14');
INSERT INTO `t_operalog` VALUES ('e5b9f3acab1488ba07e6a8688701893a', '会员积分', '积分列表', '增加', '1', '[的萨芬] 会员积分级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'addParameterIntegral', 'IntegralList_add', '超级管理员', '2014-02-18 16:39:45');
INSERT INTO `t_operalog` VALUES ('e68c76a293ff253f508befcacb2ff058', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-16 09:41:03');
INSERT INTO `t_operalog` VALUES ('e6f9fb708312c6a6a54a60d1f47f2452', '下拉项管理', '下拉列表', '修改', '1', '[审核失败] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-05-05 16:33:47');
INSERT INTO `t_operalog` VALUES ('e7e3b789fca1a0a5cd2850474d844aee', '资源管理', '菜单树', '增加', '1', '[信用类别] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-03-26 15:49:20');
INSERT INTO `t_operalog` VALUES ('e7f0f690bb824cc3da047323c00f0e5f', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-22 15:17:01');
INSERT INTO `t_operalog` VALUES ('e7f86be8bd62379a2088b83484c6d7f0', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-09 14:16:28');
INSERT INTO `t_operalog` VALUES ('e945b9452612a9aaf0ca8a065fb1652b', '下拉项管理', '下拉项树', '修改', '1', '[供款状况] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 11:02:50');
INSERT INTO `t_operalog` VALUES ('e95210358d6b641d8c9e452e44e8947a', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-04-04 16:45:01');
INSERT INTO `t_operalog` VALUES ('e98c8a4a9a6ee5cb3db7012f4004a346', '下拉项管理', '下拉项树', '修改', '1', '[认证状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 13:24:34');
INSERT INTO `t_operalog` VALUES ('e9b56b6789f6550788d9dc1f3053d737', '还款方式', '还款方式列表', '修改', '1', '[等额本息] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-24 14:06:09');
INSERT INTO `t_operalog` VALUES ('e9e2afbf2f912a574be89a02b0622080', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-04-16 09:44:58');
INSERT INTO `t_operalog` VALUES ('e9f19590bcc19da42a329a7f50253af0', '充值设置', '充值设置列表', '审核', '1', '[kkkkkkk] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:55:27');
INSERT INTO `t_operalog` VALUES ('e9f41d480f49ed1cd4b65ebbbd718174', '下拉项管理', '下拉项树', '删除', '1', '[是否内置] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:33:57');
INSERT INTO `t_operalog` VALUES ('ea0eb02749af8511bba99736a3c2d1dd', '资源管理', '操作列表', '编辑', '1', '[分配角色] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:51:47');
INSERT INTO `t_operalog` VALUES ('eae5afc42fe4b5d3cca7d0d012f7d974', '资源管理', '菜单树', '增加', '1', '[申请额度] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-19 17:58:08');
INSERT INTO `t_operalog` VALUES ('ebbd189e7d9f8b5ac2140a12b2a775a2', '帮助中心', '帮助列表', '修改', '1', '[eeeddd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 10:03:45');
INSERT INTO `t_operalog` VALUES ('ebee8a19ef0600231334c3e55a9df0d8', '客服服务', '客服列表', '修改', '1', '[aaa] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-15 14:48:27');
INSERT INTO `t_operalog` VALUES ('ec1505400df539f24883271e1fb5ea4c', '充值设置', '充值设置列表', '修改', '1', '[ggggjjjj] 会员充值设置信息已修改', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'editRechargeSet', 'RechargeSetList_edit', '超级管理员', '2014-05-05 16:51:26');
INSERT INTO `t_operalog` VALUES ('ec2dd19f89918f35509612f601e1ec79', '充值设置', '充值设置列表', '增加', '1', '[gggg] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addRechargeSet', 'RechargeSetList_add', '超级管理员', '2014-05-05 16:51:19');
INSERT INTO `t_operalog` VALUES ('ec95809d68a3738928571a840f3c2831', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 13:45:07');
INSERT INTO `t_operalog` VALUES ('ecd4c43537b3eb3a3952e521e71fe0f5', '标种类型', '标种类型列表', '删除', '1', '成功删除了[ dfhfdhbbbb ]标种类型', 'com.glacier.netloan.service.borrow.LoanTenderService', 'delLoanTender', 'LoanTenderList_del', '超级管理员', '2014-04-23 15:11:38');
INSERT INTO `t_operalog` VALUES ('ecebbe85383ca5253e77b05beb5c3ac7', '下拉项管理', '下拉列表', '增加', '1', '[直接收费] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-05-05 13:37:11');
INSERT INTO `t_operalog` VALUES ('ecfeef0f86bfd4ac80a4a784e8ad71f1', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:35:16');
INSERT INTO `t_operalog` VALUES ('ed5e9e3a17c6e472f4f07e89233e8964', '下拉项管理', '下拉项树', '增加', '1', '[联系人关系] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-21 11:03:24');
INSERT INTO `t_operalog` VALUES ('ed6a6177eae48cc05f38357a34dca6ed', '下拉项管理', '下拉列表', '增加', '1', '[流标] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:07:50');
INSERT INTO `t_operalog` VALUES ('eda33aed757b386a6486eadf8e43a818', '下拉项管理', '下拉列表', '增加', '1', '[打算] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:53:11');
INSERT INTO `t_operalog` VALUES ('ee3bc97d356080b7969e3cec1a2204b1', '标种类型', '标种类型列表', '修改', '1', '[信用标] 标种类型信息已修改', 'com.glacier.netloan.service.borrow.LoanTenderService', 'editLoanTender', 'LoanTenderList_edit', '超级管理员', '2014-04-23 14:42:20');
INSERT INTO `t_operalog` VALUES ('ee659b3fa357359b0b1f563042e038a7', '资源管理', '操作列表', '编辑', '1', '[审核] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 13:23:04');
INSERT INTO `t_operalog` VALUES ('eea891eb6a57bf3a28ee6bd10bff9aaf', '资源管理', '面板列表', '修改', '1', '[银行卡列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-19 16:27:59');
INSERT INTO `t_operalog` VALUES ('ef83b4120509cbaeaf5839c1471fc638', '招聘信息', '招聘列表', '增加', '1', '[sfd] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-19 13:56:54');
INSERT INTO `t_operalog` VALUES ('f0bf36503b44145f82ee508c9f6c3887', '资源管理', '菜单树', '修改', '1', '[申请额度] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-24 15:44:46');
INSERT INTO `t_operalog` VALUES ('f0c221d492b239b0b85bb4a9ad537dab', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-10 15:22:01');
INSERT INTO `t_operalog` VALUES ('f0d1be0210b2da236496bfda605d2101', '下拉项管理', '下拉列表', '增加', '1', '[否] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:43:25');
INSERT INTO `t_operalog` VALUES ('f1510fa1f8d3fbdca84edfbba542432e', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-03-26 15:56:24');
INSERT INTO `t_operalog` VALUES ('f154e65f1b237f643393e4785028d690', '下拉项管理', '下拉项树', '修改', '1', '[是否有投标待收限制] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-04-15 15:36:00');
INSERT INTO `t_operalog` VALUES ('f1ae87517720b2e443fb37538bfc7ed9', '下拉项管理', '下拉列表', '增加', '1', '[其它] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-15 15:40:36');
INSERT INTO `t_operalog` VALUES ('f1fc15acefc5954ea27f2304dd2e03fb', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-05-04 17:35:55');
INSERT INTO `t_operalog` VALUES ('f21469ee698be2506dd9ca1d9b896c83', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-05-04 17:37:15');
INSERT INTO `t_operalog` VALUES ('f21de18ab02e23e000f49f52bc602942', '充值设置', '充值设置列表', '审核', '1', '[ggggjjjj] 会员充值设置信息审核成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-05 16:52:27');
INSERT INTO `t_operalog` VALUES ('f22efb76a6d5e63ab4250ec001b2f7c1', '帮助中心', '帮助列表', '增加', '1', '[冰川贷公司斩获2013中关村十大评选两项大奖 ] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-03-14 10:35:36');
INSERT INTO `t_operalog` VALUES ('f2466cd3094e4f93af1f340f825d983e', '下拉项管理', '下拉列表', '修改', '1', '[审核成功] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-05-05 16:33:42');
INSERT INTO `t_operalog` VALUES ('f34661325e483563efcf1ce6f4672bd5', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-21 10:17:18');
INSERT INTO `t_operalog` VALUES ('f34ff8233b3e19c28393ae969e8d3b8d', '资源管理', '菜单树', '修改', '1', '[复审借款] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-04-18 11:05:21');
INSERT INTO `t_operalog` VALUES ('f38d19e762a076ca440ca230edae944f', '招聘信息', '招聘列表', '删除', '1', '成功删除了[ tyu ]操作', 'com.glacier.netloan.service.website.WebsiteHiringService', 'delWebsiteHiring', 'HiringList_del', '超级管理员', '2014-04-21 11:25:11');
INSERT INTO `t_operalog` VALUES ('f40aa886f7864bc6e95085da3e7c512e', '信用类别', '信用类别列表', '修改', '1', '[CancelCompanyAuth] 信用积分类型信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'editCreditType', 'CreditTypeList_edit', '超级管理员', '2014-03-26 17:10:49');
INSERT INTO `t_operalog` VALUES ('f56c550b3c5cd94ebddbf398537e81f0', '下拉项管理', '下拉项树', '删除', '1', '[公告状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:45');
INSERT INTO `t_operalog` VALUES ('f57704d435ea61ade909ca8f86f1cc23', '新闻管理', '新闻列表', '增加', '1', '[冰川贷李欣贺参加2013互联网金融年度论坛] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-14 10:22:08');
INSERT INTO `t_operalog` VALUES ('f57c547a60c09788d948deb0d7a30f11', '资源管理', '菜单树', '增加', '0', '英文名称重复', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-18 10:38:17');
INSERT INTO `t_operalog` VALUES ('f5861fec28117a251fd3bb12e165857a', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-10 15:22:49');
INSERT INTO `t_operalog` VALUES ('f5b06b01d3d4d35c9113eebadc5394aa', '标种类型', '标种类型列表', '增加', '1', '[dfhfdh] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addLoanTender', 'LoanTenderList_add', '超级管理员', '2014-04-23 10:52:57');
INSERT INTO `t_operalog` VALUES ('f5bd3a141b11356d9e522b9026ec9006', '信用类别', '信用类别列表', '增加', '1', '[CancelMobileAuth] 信用积分类型信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditTypeService', 'addCreditType', 'CreditTypeList_add', '超级管理员', '2014-03-26 17:09:04');
INSERT INTO `t_operalog` VALUES ('f62d1c5bfb22bd13d514afdcdad01102', '下拉项管理', '下拉列表', '增加', '1', '[单身] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-21 10:48:15');
INSERT INTO `t_operalog` VALUES ('f646b8a1d92ef556bb920f0621499f86', '下拉项管理', '下拉项树', '删除', '1', '[新闻状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:47');
INSERT INTO `t_operalog` VALUES ('f6d0a4877c65da5468eb13036dd5c086', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-25 15:47:57');
INSERT INTO `t_operalog` VALUES ('f6dc1b767cf22851414b053cd2721da3', '下拉项管理', '下拉列表', '增加', '1', '[不通过] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-08 17:47:58');
INSERT INTO `t_operalog` VALUES ('f803e5b82bb3f6fb5894c8b0177cebe7', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改 ]操作!', 'com.glacier.netloan.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-05-06 08:58:56');
INSERT INTO `t_operalog` VALUES ('f82f3acbe23793e4ebd3e65177f7ac97', '会员信用', '信用列表', '修改', '1', '[地方] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:39:11');
INSERT INTO `t_operalog` VALUES ('f8cff7038bb5671dece789941d7222d7', '客服服务', '客服列表', '增加', '1', '[aa] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-18 16:41:02');
INSERT INTO `t_operalog` VALUES ('f91b05b7ba74bb9d2861e1c4c6b3dfda', '招聘信息', '招聘列表', '修改', '1', '[招聘投资/理财主管2名 ] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-03-14 10:48:53');
INSERT INTO `t_operalog` VALUES ('f9520c4169c049299ce96333ee5db05d', '下拉项管理', '下拉列表', '增加', '1', '[未购房] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 17:38:39');
INSERT INTO `t_operalog` VALUES ('f958d253a5dc8a29a8105e6d913bcba8', '下拉项管理', '下拉项树', '修改', '1', '[联系人关系] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-24 11:13:23');
INSERT INTO `t_operalog` VALUES ('f9b6b76048d27c2860b17f77e7434bdd', '还款方式', '还款方式列表', '修改', '1', '[一次性还款] 还款方式信息已修改', 'com.glacier.netloan.service.borrow.RepaymentTypeService', 'editRepaymentType', 'RepaymentTypeList_edit', '超级管理员', '2014-04-24 14:05:57');
INSERT INTO `t_operalog` VALUES ('f9edca9490f673213c4166d947cac33f', '资源管理', '菜单树', '修改', '1', '[客服服务] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:02');
INSERT INTO `t_operalog` VALUES ('f9efc2a6efd89191f50a5553ce2d5836', '新闻管理', '新闻列表', '增加', '1', '[tyu] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-02-22 09:08:18');
INSERT INTO `t_operalog` VALUES ('fa3c9603010c642291a5174dcd0ddf3c', '导航信息', '导航树', '删除', '1', '[是否] 导航信息已删除', 'com.glacier.netloan.service.website.WebsiteNavService', 'delNav', 'NavTree_del', '超级管理员', '2014-02-18 16:40:35');
INSERT INTO `t_operalog` VALUES ('fa878ac23830f8b9c3fdcce6ea43aaf2', '资源管理', '操作列表', '编辑', '1', '[初审] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-04-18 13:28:29');
INSERT INTO `t_operalog` VALUES ('faa710b56d4261fd61d085ca2f173d85', '下拉项管理', '下拉项树', '增加', '1', '[会员信息] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-21 10:23:33');
INSERT INTO `t_operalog` VALUES ('fb044db34860cbbbd6cf0ee80ea48fda', '下拉项管理', '下拉列表', '增加', '1', '[企业认证信用积分] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-03-25 17:01:53');
INSERT INTO `t_operalog` VALUES ('fb1f0a4541bfd1d5753491bf96f4059f', '标种类型', '标种类型列表', '分配还款方式', '1', '分配还款方式成功', 'com.glacier.netloan.service.borrow.LoanTenderService', 'saveTenderAndRepayment', 'LoanTenderList_assign', '超级管理员', '2014-04-24 13:45:11');
INSERT INTO `t_operalog` VALUES ('fb2a6c01fbd2f26f9c6ecc70bbb18f14', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-21 10:16:09');
INSERT INTO `t_operalog` VALUES ('fb3c59078e1aba362001cc571339eaa7', '资源管理', '面板列表', '修改', '1', '[银行卡列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-19 16:28:43');
INSERT INTO `t_operalog` VALUES ('fb41c808bb0d63b1e5f9e35b9fa19ea7', '客服服务', '客服列表', '删除', '1', '成功删除了[ ccce ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-02-18 16:42:22');
INSERT INTO `t_operalog` VALUES ('fb52a343997700a1caba9d8a6e5d807a', '下拉项管理', '下拉列表', '增加', '1', '[变更中] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-08 17:48:32');
INSERT INTO `t_operalog` VALUES ('fb631ae0babd638461d2c561a8a13a65', '会员信用', '信用列表', '修改', '1', '[地方的] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:39:17');
INSERT INTO `t_operalog` VALUES ('fbe407fe5e08f2bb1975549316da111e', '下拉项管理', '下拉项树', '增加', '1', '[是否有投标待收限制] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-04-15 15:35:54');
INSERT INTO `t_operalog` VALUES ('fc51eb8816680ba48d72cfa745e85cb1', '资源管理', '面板列表', '增加', '1', '[信用类别列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-03-26 15:50:43');
INSERT INTO `t_operalog` VALUES ('fc85dfd2c10ed9873da381a5718af3d8', '广告管理', '广告列表', '增加', '1', '[rtrt] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-04-14 15:40:00');
INSERT INTO `t_operalog` VALUES ('fcd501836d4f3058a1ad15c11fa7f57e', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:55:07');
INSERT INTO `t_operalog` VALUES ('fcf9c9ffeec6f2207bf17b748779de97', '资源管理', '操作列表', '编辑', '1', '[授权] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-24 15:54:11');
INSERT INTO `t_operalog` VALUES ('fdbb092f4b9d307d8ad66ea9155b267e', '下拉项管理', '下拉列表', '增加', '1', '[复审失败] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-18 10:10:59');
INSERT INTO `t_operalog` VALUES ('fdd753b4bfff82592a222a44077ee7df', '资源管理', '菜单树', '增加', '1', '[密保问题] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-04-16 09:36:32');
INSERT INTO `t_operalog` VALUES ('fe0fabd1fe3ffaac5a2e49af3593dbb8', '下拉项管理', '下拉列表', '增加', '1', '[失败] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-04-02 15:17:11');
INSERT INTO `t_operalog` VALUES ('fe1e8dfbb7d0a784552f296aca690c12', '下拉项管理', '下拉列表', '增加', '1', '[投资] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-24 10:56:43');
INSERT INTO `t_operalog` VALUES ('fe9046f92b498b09ecc555bec320bf07', '充值设置', '充值设置列表', '审核', '1', '[sdfasf] 会员充值设置信息记录审核操作成功', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'auditRechargeSet', 'RechargeSetList_audit', '超级管理员', '2014-05-06 11:08:56');
INSERT INTO `t_operalog` VALUES ('feb85a36dc63531b8762b350ba4a8754', '新闻管理', '新闻列表', '增加', '1', '[冰川贷公司斩获2013中关村十大评选两项大奖] 新闻信息已保存', 'com.glacier.netloan.service.website.WebsiteNewsService', 'addNews', 'NewsList_add', '超级管理员', '2014-03-14 10:22:25');
INSERT INTO `t_operalog` VALUES ('fecb003992fa9fd3c279f18f502ab655', '广告管理', '广告列表', '增加', '1', '[sertewr] 标种类型信息已保存', 'com.glacier.netloan.service.borrow.LoanTenderService', 'addAdvertisement', 'AdvertisementList_add', '超级管理员', '2014-04-14 15:39:37');
INSERT INTO `t_operalog` VALUES ('ff3e29e4f82d68d137102e48bbd756d3', '公告管理', '公告列表', '增加', '1', '[关于近期网站访问速度慢等不稳定原因公告] 公告信息已保存', 'com.glacier.netloan.service.website.WebsiteAnnouncementService', 'addAnnouncement', 'AnnouncementList_add', '超级管理员', '2014-03-14 10:38:32');
INSERT INTO `t_operalog` VALUES ('ff8188e87803ba876255e6551b9bc242', '充值设置', '充值设置列表', '增加', '1', '[sadfs] 会员充值设置信息已保存', 'com.glacier.netloan.service.finance.FinanceRechargeSetService', 'addRechargeSet', 'RechargeSetList_add', '超级管理员', '2014-05-05 17:06:11');
INSERT INTO `t_operalog` VALUES ('ffe571f3412c10c256eff0f8772dee7a', '下拉项管理', '下拉列表', '修改', '1', '[自定义] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-15 16:35:11');

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
INSERT INTO `t_panel` VALUES ('0ff45a0906e1ec4b169953b2c177db3e', '8b442566ffbc9531ee5e3aef7c41d740', '认证列表', 'MemberAuthList', '1');
INSERT INTO `t_panel` VALUES ('20814591aaa67351ab28198ec8531c80', '5b6eaabb2c3a020c4d85ab50d11ffd85', '友情列表', 'LinkList', '1');
INSERT INTO `t_panel` VALUES ('21gfdg1rgrh1dfhsjdfh124564sdf21d', 't110147c5e6c1e94ee70cc833aa7f5d3', '年龄列表', 'AgeList', '2');
INSERT INTO `t_panel` VALUES ('22bb4909b6184fadfdb5bc5566a911ae', 'f15eee7156a6e9821ad60ea9747b6878', '房产列表', 'EstateList', '1');
INSERT INTO `t_panel` VALUES ('28fe18d693742ae7db094fc750715c46', '54d652799e07bb8be54483301a89ff90', '帮助列表', 'HelpList', '1');
INSERT INTO `t_panel` VALUES ('2fe59d827540532df7f7ad86364d88aa', '6460c4e2cb89b498712c96e9b4d1acce', '借款列表', 'BorrowingLoanList', '1');
INSERT INTO `t_panel` VALUES ('3454dcbd02994a182203bf0f99bc4a63', '10a7f2fd8253d90b8672d4096f8f9ed4', '标种类型列表', 'LoanTenderList', '1');
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '6');
INSERT INTO `t_panel` VALUES ('34eg454c5e6c1e94ee70cc833asd87', 'sdeg454c5e6c1e94ee70cc833asd142', '积分列表', 'IntegralList', '5');
INSERT INTO `t_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_panel` VALUES ('3fae5276226498a6cb1b5cf466793cd6', '14sdf54157cf483a790f4eea35dsf6f6', '信用类别', 'creditType', '27');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '5');
INSERT INTO `t_panel` VALUES ('529749f08cebb1f2291f1aee740b6505', '079cecd38fb5df02ed6e4d84446d072e', '会员财务列表', 'MemberFinanceList', '1');
INSERT INTO `t_panel` VALUES ('557cf8b2740e6792f517138703afb407', 'ac892df07f9087fb1c89ac968bb5f555', '操作日志列表', 'OperalogList', '1');
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('5a5b45f5c22bb597247bf1ba380f8968', '9dc3357651c9ecbb9b7c51005be28d18', '密保列表', 'secretSecurityList', '1');
INSERT INTO `t_panel` VALUES ('5cd4cb6d36559b7d7e3a022e53a3bd71', 'a652d3fe69c067cb94b73361351b8378', '新闻列表', 'NewsList', '1');
INSERT INTO `t_panel` VALUES ('60ef5b40e8753bdc2909a2413a379091', '14sdf54157cf483a790f4eea35dsf6f6', 'asdf', 'adf', '1');
INSERT INTO `t_panel` VALUES ('6e8859d95d4d4874c378f80f642740df', '5db451044c71b4eb5448a4291d538241', '银行卡列表', 'bankCardList', '1');
INSERT INTO `t_panel` VALUES ('780a15a12d2fc981cccb418dafce08b2', '4f1b6666b70be892469b6e93c1eb30ce', '导航树', 'NavTree', '1');
INSERT INTO `t_panel` VALUES ('7b6390143d9a9c234890391f475ef7c9', 'ae024ce004991607d5ae9e725d67cce8', '申请额度列表', 'ApplyAmountList', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('86d2ccad701f94c9e80d71557b1c62e6', '88ee044d59911b3b1a67ba4cdd0ee90d', '公告列表', 'AnnouncementList', '1');
INSERT INTO `t_panel` VALUES ('87gfdg1rgrh1dfhsjdfh124564sderbg', 'v465654c5e6c1e94ee70cc833asd142', '信用列表', 'CreditList', '3');
INSERT INTO `t_panel` VALUES ('8a63e66cba37b7a9f7e99ff684791264', '389f33c7b34582376d4d99282faa03b9', '还款方式列表', 'RepaymentTypeList', '1');
INSERT INTO `t_panel` VALUES ('8e6e60bd7b85314ab9555e64bc6e5d08', '31a605c2a2a777c738a09103b9915615', '满标借款列表', 'BorrowingLoanSecAuditList', '1');
INSERT INTO `t_panel` VALUES ('93fc21dd1e7d69dd439c77c9e94e25af', 'e75a41ba4a2bc299e3b50a15580a103b', '客服列表', 'ServiceList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('98954ee69de34d2515468cbc031376ec', '33f5e9959e821a58696e2d2fb5c322fc', '问题列表', 'QuestionList', '1');
INSERT INTO `t_panel` VALUES ('a1d130de95607ffc00fb455c749cf1a1', 'ab01dd2ac38d920f691bbc65b7a4bfb2', '招聘列表', 'HiringList', '1');
INSERT INTO `t_panel` VALUES ('a6776188d6b27af2659a71f77ff71e02', '054464fdb73c76b5cfd4efa16fcaa8e1', '信用类别列表', 'CreditTypeList', '1');
INSERT INTO `t_panel` VALUES ('ad2e8abecde386abbd1738707beccfee', '185b00f80aaa910fa99d9abc99c84d58', '借款留言列表', 'LoanReviewList', '1');
INSERT INTO `t_panel` VALUES ('b10c70408381896f937bfe688daf8c25', '703a3f819925f89a9c370c0324d784a0', '信息通知列表', 'MessageNoticeList', '1');
INSERT INTO `t_panel` VALUES ('b8a03efe50a44d460983badb4be96eea', 'b34761b59816e63743643c6f179683a4', '广告列表', 'AdvertisementList', '1');
INSERT INTO `t_panel` VALUES ('bcc05279c70cd8a320ad70bd7cd0b12d', '3f029e72ef13db56e8b65866984da722', '提现记录列表', 'Withdraw', '1');
INSERT INTO `t_panel` VALUES ('cc479685206a45181c5965a09b72ffc5', 'a99477bf949bcae7143004e369d31d6c', '充值设置列表', 'RechargeSetList', '1');
INSERT INTO `t_panel` VALUES ('e6784ccad10e3414b99b77b303a338c7', '93f0fcfa7cdff069d929723062b53211', '变量列表', 'VariablesList', '1');
INSERT INTO `t_panel` VALUES ('ea7a850b7fe4c05f180e28e6e7fa76fa', '6b44218344d328305de2bcdf82cb8741', '投标记录列表', 'TenderNotesList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_panel` VALUES ('f02605440920e2e2f7ed260f81674410', 'c5cbf9f0961aa8249322d9ac20ba996e', '初审借款列表', 'BorrowingLoanFirstAuditList', '1');
INSERT INTO `t_panel` VALUES ('f769a64bb571aa0c7ac269b807af4782', 'e42b98561176563f930d82c80b041ed8', '登录日志列表', 'LoginlogList', '1');
INSERT INTO `t_panel` VALUES ('fc5113080081ca9c40d5fc0a7b66da8b', '4c654b11b08eecbf6eb4e6688ea83b7d', '会员信息列表', 'MemberList', '1');
INSERT INTO `t_panel` VALUES ('swdf697aea23532eb8162f5ba1818c6f', 'de34654c5e6c1e94ee70cc833asd142', '地区树', 'AreaTree', '3');

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
INSERT INTO `t_parameter_area` VALUES ('8740884c5e6c1e94ee70cc833aa1c123', '2580884c5e6c1e94ee70cc833aa1c247', '深圳', 'subsite1', '0755', '12', '0755', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('cd092470b03f7cad7a45dad4c9f6876b', '2580884c5e6c1e94ee70cc833aa1c247', '珠海', null, '0756', '14', '0756', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('f6d7ea91dc3255d4d5efac64bb4923bd', 'cd092470b03f7cad7a45dad4c9f6876b', '香洲区', null, '0756', '141', '0756', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('sdf2s2df1s2dg1ager521ger1ge2r1g', null, '广西', 'subsite1', '0358', '2', '0358', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('sdf3dsf3sd3g25s3dg2sdgsdg', 'sdf2s2df1s2dg1ager521ger1ge2r1g', '南宁', 'subsite1', '0354', '21', '0358', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');
INSERT INTO `t_parameter_area` VALUES ('sdw0884c5e6c1e94ee70cc833aa1c2sd', '2580884c5e6c1e94ee70cc833aa1c247', '广州', 'subsite1', '020', '13', '020', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54');

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
  `update_time` datetime NOT NULL default '0000-00-00 00:00:00',
  PRIMARY KEY  (`credit_type_id`,`update_time`)
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
INSERT INTO `t_parameter_optgroup` VALUES ('0157da7199bb6160b4e22f127688c418', null, 'borrow', '我要借款', null, null, '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:42:28', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:42:28');
INSERT INTO `t_parameter_optgroup` VALUES ('0af82d4dabd9cb2b809f01578965e028', '524a5f048b92584ff849a206f3c53076', 'help', '帮助中心', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:57:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('0b6919d96ff46e91471d9714bd1d205f', '113afb2ecac88fe851ad501c53b7d82b', 'auditState', '审核状态', null, null, '28', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:15:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:54:12');
INSERT INTO `t_parameter_optgroup` VALUES ('113afb2ecac88fe851ad501c53b7d82b', null, 'common', '公用下拉项', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:29:29', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('163d9c2f8c189e64658e79e4e78aef73', '70f3280adc4b70b24d945e247909adbc', 'ageExpenses', '供款状况', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:08', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:02:50');
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', '113afb2ecac88fe851ad501c53b7d82b', 'status', '状态', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:37:23');
INSERT INTO `t_parameter_optgroup` VALUES ('270360ceaa6ad462229f98b356909829', '70f3280adc4b70b24d945e247909adbc', 'letterstatus', '信件状态', null, null, '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:09:56', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:09:56');
INSERT INTO `t_parameter_optgroup` VALUES ('28ee70d89cd44ab3e8f6a54929a47952', '0af82d4dabd9cb2b809f01578965e028', 'webHelpType', '帮助中心类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:59:38', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('2rtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:05:27');
INSERT INTO `t_parameter_optgroup` VALUES ('35a594e3165ef413550cfd413fc33642', '70f3280adc4b70b24d945e247909adbc', 'bankCardAuths', '银行卡认证', null, null, '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:46:57', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:46:57');
INSERT INTO `t_parameter_optgroup` VALUES ('3be6f556f18b7763c74eb3e6fd992785', '70f3280adc4b70b24d945e247909adbc', 'applyType', '申请类型', null, null, '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:01:50', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:01:50');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('4776fe7b0e02b3467b4ea41c7e237223', '70f3280adc4b70b24d945e247909adbc', 'buyCar', '是否购车', null, null, '12', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:39:25', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 09:06:27');
INSERT INTO `t_parameter_optgroup` VALUES ('524a5f048b92584ff849a206f3c53076', null, 'website', '网站管理', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:56:19', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('676531ee865ec4ed5f3c3ca029596293', '70f3280adc4b70b24d945e247909adbc', 'type', '类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:24:04', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:08:32');
INSERT INTO `t_parameter_optgroup` VALUES ('70f3280adc4b70b24d945e247909adbc', null, 'memberMgr', '会员管理', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:23:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '311', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('7224e23dff0a3b71faa0a2739bd03341', '70f3280adc4b70b24d945e247909adbc', 'changeType', '改变类型', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:24', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:02:58');
INSERT INTO `t_parameter_optgroup` VALUES ('723e02be061a63f73629257804c75f46', '70f3280adc4b70b24d945e247909adbc', 'auths', '认证状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:24:24', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:24:34');
INSERT INTO `t_parameter_optgroup` VALUES ('79be87300c0df2a803dd75221f9ca0b0', '70f3280adc4b70b24d945e247909adbc', 'integralType', '信用积分类型', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:55:29', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:03:05');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', '113afb2ecac88fe851ad501c53b7d82b', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:52:39');
INSERT INTO `t_parameter_optgroup` VALUES ('888d760dec0ad6dfb91e8cab99091d8e', 'f48441e0a58646544deb0f4c5d8f8451', 'memberType', '有效会员等级', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:33:41', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:33:41');
INSERT INTO `t_parameter_optgroup` VALUES ('9fa0f7f7ce49cd65efae5f4e6e2f3888', '0157da7199bb6160b4e22f127688c418', 'secondAuditState', '复审审核状态', null, null, '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:09:46', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:09:46');
INSERT INTO `t_parameter_optgroup` VALUES ('a8bef69c1a0844c12750920724d858e6', '0157da7199bb6160b4e22f127688c418', 'state', '开启关闭', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-14 16:43:30', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 16:02:17');
INSERT INTO `t_parameter_optgroup` VALUES ('aa2fe4d8f0b757d1329ba54745721d23', '70f3280adc4b70b24d945e247909adbc', 'authType', '认证类型', null, null, '15', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:30:00', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:30:00');
INSERT INTO `t_parameter_optgroup` VALUES ('ab01266e39b5c3949d5111ec53ec2b89', '0157da7199bb6160b4e22f127688c418', 'yesOrNo', '是否', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:37:05', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 16:01:48');
INSERT INTO `t_parameter_optgroup` VALUES ('b5ac6ebbc227b3a2cfe5b75ae48d81ca', '70f3280adc4b70b24d945e247909adbc', 'contactRelation', '联系人关系', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:03:24', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:13:23');
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '31', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
INSERT INTO `t_parameter_optgroup` VALUES ('ed362e9f461f6216a26f960377266e2d', '0157da7199bb6160b4e22f127688c418', 'firstAuditState', '初审审核状态', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:08:24', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:08:24');
INSERT INTO `t_parameter_optgroup` VALUES ('f162bad386611ea6705db86adce95fc7', '70f3280adc4b70b24d945e247909adbc', 'maritalStatus', '婚姻状况', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:02', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:13:31');
INSERT INTO `t_parameter_optgroup` VALUES ('f2cbc02d97c7bdefcb7947ef6d1c9839', '70f3280adc4b70b24d945e247909adbc', 'buyEstate', '是否购房', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:36:41', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:36:41');
INSERT INTO `t_parameter_optgroup` VALUES ('f48441e0a58646544deb0f4c5d8f8451', null, 'finance', '财务管理', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:33:03', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:33:03');
INSERT INTO `t_parameter_optgroup` VALUES ('f7b381dfb53d6af2848e31907a1d9a87', '0157da7199bb6160b4e22f127688c418', 'loanState', '借款状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:59:17', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:59:17');
INSERT INTO `t_parameter_optgroup` VALUES ('f803df8a981b670e9f41e43c7c146dc5', '0157da7199bb6160b4e22f127688c418', 'failedReason', '流标原因', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:51:49', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:51:49');
INSERT INTO `t_parameter_optgroup` VALUES ('fdf78bcc980b29a21a65131eab1c1b38', '113afb2ecac88fe851ad501c53b7d82b', 'builtin', '内置', null, null, '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53');
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
INSERT INTO `t_parameter_optgroup_value` VALUES ('12f7ad68fe9be3c47fed2e9d92ddaa99', '011af2cdbc88a79786c23c8e1e940ba5', 'proportion', '比例收费', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:36:16', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:36:16');
INSERT INTO `t_parameter_optgroup_value` VALUES ('13ede9705189fd37fc29f20f9c993da1', '723e02be061a63f73629257804c75f46', 'noapply', '未申请', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:25:53', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:25:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('17d110a7a8d03cefa063597749609eb4', 'f7b381dfb53d6af2848e31907a1d9a87', 'bids', '流标', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:50', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('19c24a40147510aa21c7f28e72dd8d05', '79be87300c0df2a803dd75221f9ca0b0', 'emailAuth', '邮箱认证信用积分', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:58:57', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:58:57');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1a41da9325b5db271741f2245055095b', '28ee70d89cd44ab3e8f6a54929a47952', 'borrow', '借款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:01:18', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1a539fceddc26eaed2b43d0606cfe990', '9fa0f7f7ce49cd65efae5f4e6e2f3888', 'secondFailure', '复审失败', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:10:59', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:10:59');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1b6a3d921eccdf2c1852a7a5b7df608a', 'f162bad386611ea6705db86adce95fc7', 'married', '已结婚', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:49', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:47:49');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1bcd51b7c71fc1c1f3100d378e99d5dd', 'ab01266e39b5c3949d5111ec53ec2b89', 'no', '否', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:42:09', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:42:09');
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('233cd9f2502854bc1769282d4690bf3f', '79be87300c0df2a803dd75221f9ca0b0', 'idCardAuth', '身份认证信用积分', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:21:41', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:21:41');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('25d256039589f8fbf89a4da80b941b36', '79be87300c0df2a803dd75221f9ca0b0', 'creditAuth', '信用认证信用积分', 'enable', '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:28', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('26c518f522dbbd5654a7ac77eabc79fe', 'f803df8a981b670e9f41e43c7c146dc5', 'other', '其它', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:43', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:43');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2a9acb4226dcaa290ec1741101e6b101', 'f803df8a981b670e9f41e43c7c146dc5', 'manually', '手动取消', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:15', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 09:52:15');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('38def58eb2727ac6f7dd1032a5d9e434', '270360ceaa6ad462229f98b356909829', 'unread', '未读', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:34', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:34');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3f536b628f1d014dd731e7f0bc6a63e7', '3be6f556f18b7763c74eb3e6fd992785', 'phone', '电话', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3f5df7acbf734a1f96365c5624ca97bc', 'f7b381dfb53d6af2848e31907a1d9a87', 'secondAuditor', '满标', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:06:34', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 09:48:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('40d86ed33a48a1aa128fd2defaaeebea', 'aa2fe4d8f0b757d1329ba54745721d23', 'idCardAuth', '身份证认证', 'enable', '8', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41fe1d97989449699e90f7f2858d45e9', 'f7b381dfb53d6af2848e31907a1d9a87', 'completed', '已还完', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:07:30', '8b25651c2d896297530b64e4b80ec503', '2014-04-24 09:49:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('42b0cbbb83cadb318ca8e134f69909d4', '35a594e3165ef413550cfd413fc33642', 'authstr', '待审核', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:13', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:13');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4346c17adc9f4b126baa6e593dfb1219', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:54:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('44cd3de201fd64dd1efd5d72e2b31e97', 'f7b381dfb53d6af2848e31907a1d9a87', 'firstAudit', '初审中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:05:44', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:05:44');
INSERT INTO `t_parameter_optgroup_value` VALUES ('45ed46f38b64e660713c065abcf2be95', '79be87300c0df2a803dd75221f9ca0b0', 'companyAuth', '企业认证信用积分', 'enable', '7', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:53', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:01:53');
INSERT INTO `t_parameter_optgroup_value` VALUES ('46a48351bed57b07b599a565234823f8', 'a8bef69c1a0844c12750920724d858e6', 'open', '开启', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:32:20', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:32:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('47859bb01516af361ef1b61ed5d41ba6', 'ed362e9f461f6216a26f960377266e2d', 'firstFailure', '初审失败', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:09:16', '8b25651c2d896297530b64e4b80ec503', '2014-04-18 10:09:16');
INSERT INTO `t_parameter_optgroup_value` VALUES ('48219c94dc94c86116997c48c910500e', '676531ee865ec4ed5f3c3ca029596293', 'vip', 'vip会员', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:32:30', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('4dc1fd5f1ac24e8807f59254139b0912', '79be87300c0df2a803dd75221f9ca0b0', 'infoAuth', '基本信息认证信用积分', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:56:43', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:56:36');
INSERT INTO `t_parameter_optgroup_value` VALUES ('5122f4929b14499ebd97f7f99552d5c7', '28ee70d89cd44ab3e8f6a54929a47952', 'fund', '基金', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:27', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('538c0911b50592e0546800ddffd1fc5b', 'f2cbc02d97c7bdefcb7947ef6d1c9839', 'havehouse', '已购房', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:38:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('55cef926490517adcbccb54c867bd176', '888d760dec0ad6dfb91e8cab99091d8e', 'all', '全部会员', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:35:00', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:35:00');
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
INSERT INTO `t_parameter_optgroup_value` VALUES ('85787fcf128bb21708c82c6473bcefb3', '011af2cdbc88a79786c23c8e1e940ba5', 'directcost', '直接收费', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:37:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:37:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('87a985c358ab80393887772dd78aca15', '676531ee865ec4ed5f3c3ca029596293', 'login', '登录', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:06:00', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:06:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88059e49f722a35f308078da1c5713d1', '676531ee865ec4ed5f3c3ca029596293', 'general', '普通会员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:25:07', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88b3276bf8a64a68b2bea24bfaa55c8a', 'aa2fe4d8f0b757d1329ba54745721d23', 'infoAuth', '基础资料认证', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:06', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:06');
INSERT INTO `t_parameter_optgroup_value` VALUES ('88d2f9676c58e8c8503fd8341188d22c', '3be6f556f18b7763c74eb3e6fd992785', 'scene', '现场', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:55', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:02:55');
INSERT INTO `t_parameter_optgroup_value` VALUES ('8bd22429b25a09ae88dfca998475c9f0', '270360ceaa6ad462229f98b356909829', 'delete', '删除', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:11:19', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:11:19');
INSERT INTO `t_parameter_optgroup_value` VALUES ('8ec85c8e13abad5110a27d7daeff7861', '7224e23dff0a3b71faa0a2739bd03341', 'reduction', '减少', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:58:20', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:58:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('92585169762ebad8a4fc2d28bf7865dd', '35a594e3165ef413550cfd413fc33642', 'changing', '变更中', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:48:32');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9800aa3a72ecf3a0a3ba7008e4e5804b', 'aa2fe4d8f0b757d1329ba54745721d23', 'vipAuth', 'VIP认证', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:54', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:31:54');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9826ce475f1f4958f71d3f8374be1e02', 'ab01266e39b5c3949d5111ec53ec2b89', 'yes', '是', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:41:51', '8b25651c2d896297530b64e4b80ec503', '2014-04-15 15:41:51');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9e1cf045b48daf41b02b2e1cd6b5d271', 'aa2fe4d8f0b757d1329ba54745721d23', 'creditAuth', '信用认证', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:50', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('9f82df6d34e2a30b6d739abc1c173188', 'f162bad386611ea6705db86adce95fc7', 'single', '单身', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:48:15', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:48:15');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a046211d69ac7de678e2e1cbcedf5c7c', '7224e23dff0a3b71faa0a2739bd03341', 'increase', '增加', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:58', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:57:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a122c35c0ba1595d20a157293c801211', '676531ee865ec4ed5f3c3ca029596293', 'invest', '投资', 'enable', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:06:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:06:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a125b18d3e4af3551f20934c49b88c39', 'aa2fe4d8f0b757d1329ba54745721d23', 'workAuth', '工作认证', 'enable', '9', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:28', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:34:28');
INSERT INTO `t_parameter_optgroup_value` VALUES ('a7a015d101c9c15598874faaab0c3292', '723e02be061a63f73629257804c75f46', 'pass', '通过', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:58', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:58');
INSERT INTO `t_parameter_optgroup_value` VALUES ('aa64b3148747c20abb499a752ab16858', '79be87300c0df2a803dd75221f9ca0b0', 'workAuth', '工作认证信用积分', 'enable', '10', '', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:23:02', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 17:23:02');
INSERT INTO `t_parameter_optgroup_value` VALUES ('adf5a85fc6937d07f65484014cc2ce76', '0b6919d96ff46e91471d9714bd1d205f', 'failure', '审核失败', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:17:11', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:23');
INSERT INTO `t_parameter_optgroup_value` VALUES ('b3cae9a622e4727d3ce63bea18849fb6', '35a594e3165ef413550cfd413fc33642', 'pass', '通过', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:37', '8b25651c2d896297530b64e4b80ec503', '2014-04-08 17:47:37');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ba125aeae408f4bb9da13fb0ea2ac67e', 'aa2fe4d8f0b757d1329ba54745721d23', 'mobileAuth', '手机认证', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:31', '8b25651c2d896297530b64e4b80ec503', '2014-02-25 14:32:31');
INSERT INTO `t_parameter_optgroup_value` VALUES ('c0c9665a005791fd2f9550d97fe3aeb5', '79be87300c0df2a803dd75221f9ca0b0', 'vipAuth', 'VIP认证信用积分', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:55:58', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 16:57:20');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cc1db2e08263755408d0ab7c8a0bdaef', '4776fe7b0e02b3467b4ea41c7e237223', 'havecar', '已购车', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:08', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 17:54:49');
INSERT INTO `t_parameter_optgroup_value` VALUES ('cef639d80ab89a98df7301fc8b084d32', '28ee70d89cd44ab3e8f6a54929a47952', 'invest', '投资', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11');
INSERT INTO `t_parameter_optgroup_value` VALUES ('d19be93476640d86b05a60cc8a16f7af', '270360ceaa6ad462229f98b356909829', 'read', '已读', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:56', '8b25651c2d896297530b64e4b80ec503', '2014-04-09 14:10:56');
INSERT INTO `t_parameter_optgroup_value` VALUES ('dc3c29fcfe59463259909304f8fe28c5', 'b5ac6ebbc227b3a2cfe5b75ae48d81ca', 'business', '商业伙伴', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:39', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 11:04:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('deb838911730fd2ae91a3d86740b6ca5', '163d9c2f8c189e64658e79e4e78aef73', 'mortgage', '抵押贷款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:45', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 10:49:45');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e5b76e49ef32f7636d377e5bda82c27e', '888d760dec0ad6dfb91e8cab99091d8e', 'vip', 'VIP会员', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:34:39', '8b25651c2d896297530b64e4b80ec503', '2014-05-05 13:34:39');
INSERT INTO `t_parameter_optgroup_value` VALUES ('e60a0f1adebf1b828640fbb338316eb8', '0b6919d96ff46e91471d9714bd1d205f', 'authstr', '审核中', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:10');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ead9c20f4d1457b1d436e8333aeb9a13', '723e02be061a63f73629257804c75f46', 'authstr', '待审核', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 13:26:32', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 16:29:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('ecefc7db8ad84949efb3aeaeacbef2de', 'f162bad386611ea6705db86adce95fc7', 'secret', '保密', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:49:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:49:21');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f081962b0b8f3b28b727c60b821dbee2', '87e805fcf0c779b8f57fde22d819e2db', 'woman', '女', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01', '8b25651c2d896297530b64e4b80ec503', '2014-02-21 10:55:01');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f1498ee9de5b4e78fe4654ae3b3175bb', '0b6919d96ff46e91471d9714bd1d205f', 'pass', '审核通过', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-04-02 15:16:43', '8b25651c2d896297530b64e4b80ec503', '2014-05-06 10:52:17');
INSERT INTO `t_parameter_optgroup_value` VALUES ('f908c0abe90abd59eba8a7d93485cb3d', '676531ee865ec4ed5f3c3ca029596293', 'borrow', '借款', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:06:23', '8b25651c2d896297530b64e4b80ec503', '2014-02-24 11:06:23');
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
INSERT INTO `t_parameter_question` VALUES ('7b09183b272b0e14496048c46a687624', '你家里人知道吗', '2', '啊啊', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:13:52', '8b25651c2d896297530b64e4b80ec503', '2014-04-16 10:16:40');
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
  `receivables_total` float default NULL,
  `should_rece_money` float default NULL,
  `alr_rece_money` float default NULL,
  `not_rece_money` float default NULL,
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

-- ----------------------------
-- Table structure for `t_receivables_notes_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_receivables_notes_detail`;
CREATE TABLE `t_receivables_notes_detail` (
  `rece_notes_detail_id` varchar(32) NOT NULL,
  `rece_notes_id` varchar(32) default NULL,
  `alr_rece_money` float default NULL,
  `number_period` varchar(32) default NULL,
  `should_pay_date` datetime default NULL,
  `actual_pay_date` datetime default NULL,
  `current_rece_moeny` float default NULL,
  `current_rece_principal` float default NULL,
  `current_rece_interest` float default NULL,
  `surplus_principal` float default NULL,
  `interest_mana_fee` float default NULL,
  `is_overdue` enum('no','yes') default NULL,
  `overdue_interest` float default NULL,
  `alr_pay_money` float default NULL,
  `income` float default NULL,
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

-- ----------------------------
-- Table structure for `t_repayment_notes`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_notes`;
CREATE TABLE `t_repayment_notes` (
  `repay_notes_id` varchar(32) NOT NULL,
  `loan_id` varchar(32) default NULL,
  `repayment_total` float default NULL,
  `should_pay_money` float default NULL,
  `alr_pay_money` float default NULL,
  `not_pay_money` float default NULL,
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

-- ----------------------------
-- Table structure for `t_repayment_notes_detail`
-- ----------------------------
DROP TABLE IF EXISTS `t_repayment_notes_detail`;
CREATE TABLE `t_repayment_notes_detail` (
  `repay_notes_detail_id` varchar(32) NOT NULL,
  `repay_notes_id` varchar(32) default NULL,
  `number_period` float default NULL,
  `should_pay_date` datetime default NULL,
  `actual_pay_date` datetime default NULL,
  `current_pay_moeny` float default NULL,
  `current_pay_principal` float default NULL,
  `current_pay_interest` float default NULL,
  `actual_pay_money` float default NULL,
  `also_need_money` float default NULL,
  `overdue_interest` float default NULL,
  `overdue_urge_fee` float default NULL,
  `overdue_mana_fee` float default NULL,
  `overdue_days` datetime default NULL,
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
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'test', '测试角色', 'custom', '看看', '8b25651c2d896297530b64e4b80ec503', '2014-02-10 00:00:00');
INSERT INTO `t_role` VALUES ('96b0c94ab19afbf40b57e7b91bfed673', 'wer', '角色测试666', 'custom', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-10 00:00:00');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'admin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16 00:00:00');

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
INSERT INTO `t_tender_notes` VALUES ('asdfds', '4535fsdfaf9f2c9bc59bbc6df4523s34', '0d06ae74d5a50659c4c40d4ee980a748', '2', null, null, '0d06ae74d5a50659c4c40d4ee980a748', '2014-05-06 13:44:42', null, '2014-05-06 13:44:44');
INSERT INTO `t_tender_notes` VALUES ('eeww', '5627fc801ee0205417d66b1daec10423', '225b8f6a7863d52f947b265f869e48be', null, '1000', null, '225b8f6a7863d52f947b265f869e48be', '2014-05-06 13:45:22', null, '2014-05-06 13:45:26');

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
INSERT INTO `t_tender_repayment` VALUES ('60d13359890d7edfe536ce87af02d6e5', '9788195653f335695256551b82fcbac6');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', '1c362eac7ec315aa47ab84360d4e390d');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', '2587bd0ecc859e35f2874f2aff0d4852');
INSERT INTO `t_tender_repayment` VALUES ('e444483d3b503b99d7572d2008e5b099', '9788195653f335695256551b82fcbac6');

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
INSERT INTO `t_user` VALUES ('21da4f6ca70201996e77aa7fda80db3d', 's', 's', 's', null, 'enable', 'custom', 's', null, 's', '2014-02-12 17:35:02', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('50a3309800345a2984f12279515e001b', 'd', 'd', 'd', null, 'enable', 'custom', 'd', null, 'd', '2014-02-12 17:35:06', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('5b7fd153d75b63ad21fdf11bd233f684', 'sdf', 'w', '6bc37158d9839e1c75fac0a00ed55120c3e4beb3', 'f75071ba2c27d397', 'enable', 'custom', 'wer', null, 'wer', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 00:00:00');
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2014-05-06 14:09:51', '0:0:0:0:0:0:0:1[本地]', '382', '8b25651c2d896297530b64e4b80ec503', '2014-01-16 00:00:00');
INSERT INTO `t_user` VALUES ('af', 'qqqqqqqqqqq', 'afdddd', 'adf', 'asfd', 'enable', 'custom', 'ddd', null, 'dd', '2014-02-12 16:55:54', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('ca1c01ab0f77133531b891cba8bd2670', 'dd', 'dd', 'dd', null, 'enable', 'custom', 'dd', null, 'dd', '2014-02-12 17:49:48', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');

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
INSERT INTO `t_website_announcement` VALUES ('14520144e702535a35fda3f8f30ec76c', '关于汇潮支付全面恢复各银行充值公告', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=356\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于汇潮支付全面恢复各银行充值公告关于汇潮支付全面恢复各银行充值公告关于汇潮支付全面恢复各银行充值公告关于汇潮支付全面恢复各银行充值公告</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=356\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\"></a>', 'enable', '0', null, '3', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:17', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:17');
INSERT INTO `t_website_announcement` VALUES ('2065976b3f62e22135d703c6d6e5f8d4', '中国人民银行关于2014年支付清算系统维护安排通知', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=329\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">中国人民银行关于2014年支付清算系统维护安排通知】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=329\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">中国人民银行关于2014年支付清算系统维护安排通知】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=329\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">中国人民银行关于2014年支付清算系统维护安排通知】</a>', 'enable', '0', null, '11', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:38', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:38');
INSERT INTO `t_website_announcement` VALUES ('26705f2a4b31115c866a02eaa57eac60', '关于暂时关闭宝付充值通道公告', '					<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=350\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于暂时关闭宝付充值通道公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=350\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于暂时关闭宝付充值通道公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=350\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于暂时关闭宝付充值通道公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=350\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于暂时关闭宝付充值通道公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&id=350\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于暂时关闭宝付充值通道公告】</a>\r\n				', 'enable', '0', null, '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:45', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:03');
INSERT INTO `t_website_announcement` VALUES ('275bbd0ecc859e35f2874f2aff056671', '关于“积分金冠”活动土豪金奖品获奖名单公布', '关于“积分金冠”活动土豪金奖品获奖名单公布关于“积分金冠”活动土豪金奖品获奖名单公布关于“积分金冠”活动土豪金奖品获奖名单公布关于“积分金冠”活动土豪金奖品获奖名单公布', 'enable', '0', null, '1', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:42', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:42');
INSERT INTO `t_website_announcement` VALUES ('2f8fb008b129488fefbbb96808cc46dd', '关于2014春节期间业务受理及值班公告', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=330\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于2014春节期间业务受理及值班公告】</a>', 'enable', '0', null, '7', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:28', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:28');
INSERT INTO `t_website_announcement` VALUES ('3a0e6fb0045f2ad1507d206952faf980', '关于DNS服务器维护相关公告', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=347\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于DNS服务器维护相关公告】</a>', 'enable', '0', null, '6', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:58', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:58');
INSERT INTO `t_website_announcement` VALUES ('480ba7dc83bbd37fded2533446262793', '关于国付宝充值接口升级相关公告', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=357\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于国付宝充值接口升级相关公告】</a>', 'enable', '0', null, '2', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:56', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:37:56');
INSERT INTO `t_website_announcement` VALUES ('6deb238f5c69836026451fe5547cec7f', '关于净值借款入帐款禁止投标、提现公告说明', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=338\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于净值借款入帐款禁止投标、提现公告说明】</a>', 'enable', '0', null, '8', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:44', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:44');
INSERT INTO `t_website_announcement` VALUES ('6f4364db610a43e36927f0c55d903631', '关于1月11日凌晨零点临时维护公告', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=331\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">关于1月11日凌晨零点临时维护公告】</a>', 'enable', '0', null, '10', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:11', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:11');
INSERT INTO `t_website_announcement` VALUES ('9d7da5657873c1acfc2a1c6cfa6fa27c', '关于中国工商银行系统维护的公告', '关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告关于中国工商银行系统维护的公告', 'enable', '0', null, '9', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:58', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:39:58');
INSERT INTO `t_website_announcement` VALUES ('c05f492783b005eafafc84672b6fdde2', '关于近期网站访问速度慢等不稳定原因公告', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=358\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于近期网站访问速度慢等不稳定原因公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=358\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于近期网站访问速度慢等不稳定原因公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=358\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于近期网站访问速度慢等不稳定原因公告】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=192&amp;id=358\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">【关于近期网站访问速度慢等不稳定原因公告】</a>', 'enable', '0', null, '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:32', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:38:32');
INSERT INTO `t_website_announcement` VALUES ('e0b3bac808430cdca6257324bb1c90e7', '冰川贷1月9日23:00到次日凌晨3:00系统版本升级公告', '冰川贷1月9日23:00到次日凌晨3:00系统版本升级公告冰川贷1月9日23:00到次日凌晨3:00系统版本升级公告冰川贷1月9日23:00到次日凌晨3:00系统版本升级公告冰川贷1月9日23:00到次日凌晨3:00系统版本升级公告', 'enable', '0', null, '12', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:58', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:40:58');

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
INSERT INTO `t_website_help` VALUES ('165f89c9b030fe9c2726e1f6ce2e57bb', '冰川贷公司斩获2013中关村十大评选两项大奖 ', '4', 'borrow', 'enable', '', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:35:36', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:35:36');
INSERT INTO `t_website_help` VALUES ('343d2f62064b0fa55703d31f29c55b24', '个人借款需提供的资料有哪些？', '<a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss18\">个人借款需提供的资料有哪些？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss18\">个人借款需提供的资料有哪些？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss18\">个人借款需提供的资料有哪些？</span></a>', 'borrow', 'enable', '', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:24', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:24');
INSERT INTO `t_website_help` VALUES ('5a6c7cb818603650f5ac75894744d8af', '机构借款需提供哪些资料？', '<a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss21\">机构借款需提供哪些资料？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss21\">机构借款需提供哪些资料？</span></a><a id=\"qs\" style=\"text-decoration:underline;vertical-align:baseline;color:#333333;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:12px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:32px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;background-color:#FFFFFF;\"><span id=\"qss21\">机构借款需提供哪些资料？</span></a>', 'borrow', 'enable', '', '5', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:36', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:52:36');
INSERT INTO `t_website_help` VALUES ('673a31387a479d6bf97cb54de8662218', '借款期限、利率和还款方式?', '借款期限、利率和还款方式?借款期限、利率和还款方式?借款期限、利率和还款方式?', 'borrow', 'enable', '', '3', null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:51:38', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:51:38');
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
INSERT INTO `t_website_hiring` VALUES ('34561fa9f66ac61df8e98ea2391341e6', '招聘投资/理财顾问10名 ', '招聘投资/理财顾问10名', 'enable', 'asdf', '3', 'sf', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:25:29', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:48:10');
INSERT INTO `t_website_hiring` VALUES ('7777a1a9f65a86675dcc82ca4f574f7b', '招聘信贷经理/信贷助理/信贷秘书2名 ', '招聘信贷经理/信贷助理/信贷秘书2名 <br />', 'enable', 'asdf', '2', 'asdasdf', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:53:13', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:47:56');
INSERT INTO `t_website_hiring` VALUES ('7bacad18f86870b6c6ae4f1d94ec8902', '招聘金融信贷专员5名 ', '招聘金融信贷专员5名招聘金融信贷专员5名', 'enable', '', '4', null, '8b25651c2d896297530b64e4b80ec503', '2014-02-24 15:29:33', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:48:31');
INSERT INTO `t_website_hiring` VALUES ('86d2cabfc0253442feb472f3917f745d', '招聘投资/理财主管2名 ', '					招聘投资/理财主管2名 <br />\r\n				', 'enable', 'dd', '1', 'dd', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 14:58:17', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:48:53');
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
INSERT INTO `t_website_link` VALUES ('4fc1c2b44ceb087b3fc4faf4831a9f20', '中移电子商务有限公司', 'zhongyidianzi.com', 'f', 'enable', null, '3', '中移电子商务有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:55', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:55');
INSERT INTO `t_website_link` VALUES ('63070b421c95338eedbca0127e8b382d', '百度一下', 'baidu.com', 'c://photo', 'enable', null, '2', '百度一下', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:32:21', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:32:21');
INSERT INTO `t_website_link` VALUES ('cc4342755eb8ee1d5d106188a44745a3', '宝付网络科技（上海）有限公司', 'zhifubao.com', 's', 'enable', null, '4', '宝付网络科技（上海）有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:16', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:16');
INSERT INTO `t_website_link` VALUES ('cf384296b4cc0904afd6f152752362eb', '冰川软件', 'gracier.com', 'C://photo', 'enable', null, '1', '冰川软件', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:31:02', '8b25651c2d896297530b64e4b80ec503', '2014-02-22 09:31:02');
INSERT INTO `t_website_link` VALUES ('e13efd6adffe6fa43b589c1f07779bd1', '迅付信息科技有限公司', 'xufuxinxi.com', 'd', 'enable', null, '5', '迅付信息科技有限公司', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:37', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:44:37');

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
INSERT INTO `t_website_nav` VALUES ('0e68817baeba1109fbcfd53c837dbc66', '533321196059fa5805661651134a58fe', '联系我们', null, null, '52', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:51', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:26:37');
INSERT INTO `t_website_nav` VALUES ('133ccad08d70daf73b77fb8fb1bcee0c', null, '首页', 'sad', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:43:48', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 14:26:53');
INSERT INTO `t_website_nav` VALUES ('1c865835cff6982b8dc9f6dd206f28e5', '30380ae8e3ecd0d1a34e41f92a8eadaa', '发布信用标', 'sd', 'enable', '31', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:47:55', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 14:27:34');
INSERT INTO `t_website_nav` VALUES ('1d33d5a8b6d5a2fe73eb78b7c8439624', '533321196059fa5805661651134a58fe', '公司简介', null, null, '51', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:36', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:26:39');
INSERT INTO `t_website_nav` VALUES ('29a56a83d3b22d8bf211ac68a0db0d01', null, '我要投资', 'sdf', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:26', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 14:27:15');
INSERT INTO `t_website_nav` VALUES ('30380ae8e3ecd0d1a34e41f92a8eadaa', null, '我要借款', 'asdf', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:38', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 14:27:22');
INSERT INTO `t_website_nav` VALUES ('42bdcfbb624c975eea75c7d06b943853', '533321196059fa5805661651134a58fe', '招聘信息', null, null, '53', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:50:02', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:26:48');
INSERT INTO `t_website_nav` VALUES ('4edb2ec67480c21811ddb0b16f0e5218', null, '我的账号', 'asdf', 'enable', '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:34', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 14:27:50');
INSERT INTO `t_website_nav` VALUES ('533321196059fa5805661651134a58fe', null, '关于我们', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:12', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:26:45');
INSERT INTO `t_website_nav` VALUES ('5f76cc51c5d787932f09c4425350a79a', '4edb2ec67480c21811ddb0b16f0e5218', '我要登录', 'asfd', 'enable', '41', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:46', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 14:27:56');
INSERT INTO `t_website_nav` VALUES ('6c0cb4c77e2cc5a3bfa47d79023c5254', null, '帮助中心', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:59', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:47:10');
INSERT INTO `t_website_nav` VALUES ('9ab845b68ca01934138c22ba6729cd75', '30380ae8e3ecd0d1a34e41f92a8eadaa', '发布担保标', 'asfd', 'enable', '32', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:17', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 14:27:42');
INSERT INTO `t_website_nav` VALUES ('b45b9148c7cd2b5f7ec1d53a3d6ec99f', '4edb2ec67480c21811ddb0b16f0e5218', '我要注册', null, null, '42', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:59', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:26:42');

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
INSERT INTO `t_website_news` VALUES ('141269ce77484634f9ba72157c346414', 'dd', '<img src=\"/netloan/image/20140325/20140325151510_481.jpg\" alt=\"\" />', 'enable', '23', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-25 15:15:17', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 15:15:17');
INSERT INTO `t_website_news` VALUES ('32266efe968c9af524380c699f3d778c', '冰川贷李欣贺入选2014年“中国商业创新50人”大奖 ', '冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖', 'enable', '3', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:21:45', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:21:45');
INSERT INTO `t_website_news` VALUES ('47c34c5c79793dab521a354d496db38b', '冰川贷李欣贺受邀出席中国财富管理50人论坛 ', '冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛冰川贷李欣贺受邀出席中国财富管理50人论坛', 'enable', '5', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:42', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:42');
INSERT INTO `t_website_news` VALUES ('56d0a51816e4e3362c59569e4ffa38e2', '冰川贷李欣贺入选2013年“世界500强人”大奖', '冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖冰川贷李欣贺入选2014年“中国商业创新50人”大奖', 'enable', '7', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:23:24', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:23:24');
INSERT INTO `t_website_news` VALUES ('5efac60a4cfb103e5210ea0d5010d3c7', '冰川贷李欣贺参加2013互联网金融年度论坛', '冰川贷李欣贺参加2013互联网金融年度论坛冰川贷李欣贺参加2013互联网金融年度论坛冰川贷李欣贺参加2013互联网金融年度论坛冰川贷李欣贺参加2013互联网金融年度论坛', 'enable', '4', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:08', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:08');
INSERT INTO `t_website_news` VALUES ('be1e10183e38beca099ba9694128bab6', '冰川贷公司斩获2013中关村十大评选两项大奖', '冰川贷公司斩获2013中关村十大评选两项大奖冰川贷公司斩获2013中关村十大评选两项大奖冰川贷公司斩获2013中关村十大评选两项大奖冰川贷公司斩获2013中关村十大评选两项大奖', 'enable', '5', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:25', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:22:25');
INSERT INTO `t_website_news` VALUES ('c7a4cfee09886b6b4662ea8b9d5c861e', '祝冰川贷第一期积分土豪奖品活动圆满结束', '<a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&amp;id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&amp;id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&amp;id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a><a href=\"https://www.jinshangdai.com/article/detail.html?catalog=148&amp;id=335\" style=\"text-decoration:none;color:#00A8E8;font-family:微软雅黑, Arial, Helvetica, sans-serif;font-size:16px;font-style:normal;font-variant:normal;font-weight:normal;letter-spacing:normal;line-height:40px;orphans:auto;text-align:left;text-indent:0px;text-transform:none;white-space:normal;widows:auto;word-spacing:0px;-webkit-text-stroke-width:0px;\">祝晋商贷第一期积分土豪奖品活动圆满结束】</a>', 'enable', '8', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:01', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:43:01');
INSERT INTO `t_website_news` VALUES ('c7b04e5bb2c91cd2f31598e65c38359e', '冷空气降临中国，中国将面对一周的低气温', '					今年最大寒流进入广东，最低温度3度。<img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/9.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/93.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/64.gif\" alt=\"\" border=\"0\" />\r\n				', 'enable', '4', '4', '4', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:54', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:24:11');
INSERT INTO `t_website_news` VALUES ('d2321b66d4cdde4bb7f961bbcec9dfc6', '十五年一遇的双情人节，大家准备好了吗？', '十五年一遇的双情人节，大家准备好了吗？<img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/28.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/63.gif\" alt=\"\" border=\"0\" /><img src=\"http://localhost:8080/netloan/resources/js/kindeditor/plugins/emoticons/images/65.gif\" alt=\"\" border=\"0\" />', 'enable', '3', '3', '3', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:40', '8b25651c2d896297530b64e4b80ec503', '2014-03-14 10:24:24');
INSERT INTO `t_website_news` VALUES ('e3f3c5aff822a9001ab652c120688258', 'cccccc', '					dfsrgegerg<strong>erdfgdfg<img src=\"/netloan/image/20140321/20140321175801_432.jpg\" alt=\"\" /></strong><strong></strong>\r\n				', 'enable', '4', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-03-21 17:58:04', '8b25651c2d896297530b64e4b80ec503', '2014-03-25 15:13:39');

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
