/*
Navicat MySQL Data Transfer

Source Server         : yuzexu
Source Server Version : 50513
Source Host           : localhost:3306
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50513
File Encoding         : 65001

Date: 2014-02-20 15:01:13
*/

SET FOREIGN_KEY_CHECKS=0;

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
INSERT INTO `t_action` VALUES ('00373dc94a1610aab1a50b060bb17e88', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '分配角色', 'assign', 'icon-standard-key-go', 'Button', 'disable', 'glacier.system_mgr.user_mgr.user.roleAssign();', '4', '');
INSERT INTO `t_action` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.editNews();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.editRole();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eads', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.addAge();', '2', null);
INSERT INTO `t_action` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', '');
INSERT INTO `t_action` VALUES ('2213139f0e736a796d5ac4bdd78332', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.delIntegral();', '3', null);
INSERT INTO `t_action` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action` VALUES ('25860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.addCredit();', '1', null);
INSERT INTO `t_action` VALUES ('28060139f0e736a796d5ac4bdd78dawx', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.editAge();', '3', null);
INSERT INTO `t_action` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', '');
INSERT INTO `t_action` VALUES ('297c9bdbf0377b73ae49f82e348b49ba', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.member_mgr.amount_mgr.amount.editAmount();', '2', '');
INSERT INTO `t_action` VALUES ('2c5058d555dc3dae55c1dbaeec39fd4c', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.member_mgr.amount_mgr.amount.delAmount();', '3', '');
INSERT INTO `t_action` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.editLink();', '2', '');
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', '');
INSERT INTO `t_action` VALUES ('34560139f0e736a796d5ac4bdd78344', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.addIntegral();', '1', null);
INSERT INTO `t_action` VALUES ('35860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.editCredit();', '2', null);
INSERT INTO `t_action` VALUES ('38060139f0e736a796d5ac4bdd78escs', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.age_mgr.age.delAge();', '4', null);
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delPanel();', '4', '');
INSERT INTO `t_action` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action` VALUES ('4586054157cf483a790f4eea35dsf6f6', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.credit_mgr.credit.delCredit();', '3', null);
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', '');
INSERT INTO `t_action` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.addService();', '1', '');
INSERT INTO `t_action` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', '');
INSERT INTO `t_action` VALUES ('56890139f0e736a796d5ac4bdd78211', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.integral_mgr.integral.editIntegral();', '2', null);
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', '');
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.editUser();', '2', '');
INSERT INTO `t_action` VALUES ('58c66ce489e1ee8588e881a1abe9de56', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.editVariables();', '2', '');
INSERT INTO `t_action` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.editService();', '2', '');
INSERT INTO `t_action` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.delLink();', '3', '');
INSERT INTO `t_action` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.addRole();', '1', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addMenu();', '2', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addPanel();', '2', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editMenu();', '3', '');
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', '');
INSERT INTO `t_action` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', '');
INSERT INTO `t_action` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.addNews();', '1', '');
INSERT INTO `t_action` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', '');
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.addUser();', '1', '');
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.role_mgr.role.delRole();', '3', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editAction();', '3', '');
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', '');
INSERT INTO `t_action` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', '');
INSERT INTO `t_action` VALUES ('9cdc7b08f06304c42f1e6c408f170fcb', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.addVariables();', '1', '');
INSERT INTO `t_action` VALUES ('9f2bde7246ca2ad13dc64bbc5f4efb3d', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.system_mgr.user_mgr.user.delUser();', '3', '');
INSERT INTO `t_action` VALUES ('a27471575ce1f86d15e43a163b2195dd', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.link_mgr.link.addLink();', '1', '');
INSERT INTO `t_action` VALUES ('a34eddbd653c462a87afe23eab0c6391', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement();', '1', '');
INSERT INTO `t_action` VALUES ('ad2388e634c5e313d1c71eecdc849cb6', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.delAnnouncement();', '3', '');
INSERT INTO `t_action` VALUES ('b0648b51ebbf9831702a3f616a75ca3a', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.news_mgr.news.delNews();', '3', '');
INSERT INTO `t_action` VALUES ('b0f605139653554aa66cf38a78fe42ba', '54eb754157cf483a790f4eea35200118', 'eb07f8ec54989seb66e4e8a1a0f21604', '列表', 'list', '', 'Button', 'disable', '', '1', '');
INSERT INTO `t_action` VALUES ('b45e5f92ebc8a419ba85dfc59cbeda50', 'ae024ce004991607d5ae9e725d67cce8', '7b6390143d9a9c234890391f475ef7c9', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.member_mgr.amount_mgr.amount.addAmount();', '1', '');
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delMenu();', '4', '');
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('ba99418ca949feedcedfa04396235827', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.service_mgr.service.delService();', '3', '');
INSERT INTO `t_action` VALUES ('c50c979b621ff41f0677cdf02e29648b', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.editHiring();', '2', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.editPanel();', '3', '');
INSERT INTO `t_action` VALUES ('e1e5268cff61dc4231932ae1484caf97', '93f0fcfa7cdff069d929723062b53211', 'e6784ccad10e3414b99b77b303a338c7', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.variables_mgr.variables.delVariables();', '3', '');
INSERT INTO `t_action` VALUES ('e450b55ffaeca413fdd6551591993893', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.website_mgr.announcement_mgr.announcement.addAnnouncement();', '1', '');
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'enable', 'glacier.system_mgr.res_mgr.res.addAction();', '2', '');
INSERT INTO `t_action` VALUES ('e637975493d65070499ebfb8b15b37f6', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.help_mgr.help.editHelp();', '2', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'disable', 'glacier.system_mgr.res_mgr.res.delAction();', '4', '');
INSERT INTO `t_action` VALUES ('fbbda7cc81811077445c4bc94c53ce08', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'enable', 'glacier.website_mgr.nav_mgr.nav.editNav();', '2', '');
INSERT INTO `t_action` VALUES ('fbfded9986f0ad39d43d789b7594463d', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.website_mgr.hiring_mgr.hiring.delHiring();', '3', '');
INSERT INTO `t_action` VALUES ('sd54fsd4fsd2sg45r4hrtj2fg1j2g1', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'enable', 'glacier.basicdatas_mgr.area_mgr.area.delArea();', '3', null);

-- ----------------------------
-- Table structure for `t_application_amount`
-- ----------------------------
DROP TABLE IF EXISTS `t_application_amount`;
CREATE TABLE `t_application_amount` (
  `app_amount_id` varchar(32) NOT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `app_type` enum('phone') DEFAULT NULL,
  `original_amount` float DEFAULT NULL,
  `app_money` float DEFAULT NULL,
  `app_explanation` varchar(500) DEFAULT NULL,
  `authorized_amount` varchar(32) DEFAULT NULL,
  `audit_state` enum('sucess','failure') DEFAULT NULL,
  `process_explanation` varchar(500) DEFAULT NULL,
  `app_date` datetime DEFAULT NULL,
  `auditor_id` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`app_amount_id`),
  KEY `FK_t_application_amount_t_member_member_id` (`member_id`),
  CONSTRAINT `t_application_amount_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_application_amount
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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f1b6666b70be892469b6e93c1eb30ce', 'NavTree_add,NavTree_edit,NavTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '88ee044d59911b3b1a67ba4cdd0ee90d', 'AnnouncementList_add,AnnouncementList_edit,AnnouncementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_del,UserList_assign');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '93f0fcfa7cdff069d929723062b53211', 'VariablesList_add,VariablesList_edit,VariablesList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ae024ce004991607d5ae9e725d67cce8', 'AmountList_add,AmountList_edit,AmountList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd503136bdab7bbdc8d09f3bbb28fa979', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'de34654c5e6c1e94ee70cc833asd142', 'AreaTree_add,AreaTree_edit,AreaTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e75a41ba4a2bc299e3b50a15580a103b', 'ServiceList_add,ServiceList_edit,ServiceList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'fefe8e9ee335dadbace082923415e023', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdeg454c5e6c1e94ee70cc833asd142', 'IntegralList_add,IntegralList_edit,IntegralList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdsfeg4157cf483a790f4eea35ds5675', 'OptgroupValueList_add,OptgroupValueList_edit,OptgroupValueList_del,OptgroupTree_add,OptgroupTree_edit,OptgroupTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 't110147c5e6c1e94ee70cc833aa7f5d3', 'AgeList_add,AgeList_edit,AgeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'v465654c5e6c1e94ee70cc833asd142', 'CreditList_add,CreditList_edit,CreditList_del');

-- ----------------------------
-- Table structure for `t_borrow_data_audit`
-- ----------------------------
DROP TABLE IF EXISTS `t_borrow_data_audit`;
CREATE TABLE `t_borrow_data_audit` (
  `borrow_data_audit_id` varchar(32) NOT NULL,
  `member_id` varchar(32) DEFAULT NULL COMMENT '���ID',
  `audit_status` enum('yes','no') DEFAULT NULL COMMENT '�������',
  `review_status` enum('yes','no') DEFAULT NULL COMMENT '�������ID',
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `audit` varchar(32) DEFAULT NULL,
  `audit_time` datetime DEFAULT NULL,
  PRIMARY KEY (`borrow_data_audit_id`),
  KEY `FK_t_borrow_data_audit_t_member_member_id` (`member_id`),
  CONSTRAINT `t_borrow_data_audit_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_borrow_data_audit
-- ----------------------------

-- ----------------------------
-- Table structure for `t_credit_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_credit_integral`;
CREATE TABLE `t_credit_integral` (
  `credit_integral_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_id` varchar(32) DEFAULT NULL COMMENT '��ⵥ��',
  `integral_type` varchar(32) DEFAULT NULL COMMENT '�ֿ�ID',
  `remark` varchar(255) DEFAULT NULL COMMENT '�������',
  `change_type` enum('increase','reduction') DEFAULT NULL,
  `change_value` int(11) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`credit_integral_id`),
  KEY `FK_t_credit_integral_t_member_member_id` (`member_id`),
  CONSTRAINT `t_credit_integral_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_credit_integral
-- ----------------------------

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
  `status` enum('audit1','audit0') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`bank_card_id`),
  KEY `FK_t_bank_t_member_member_id` (`member_id`),
  CONSTRAINT `t_finance_bank_card_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����Ļ�Ա���п����';

-- ----------------------------
-- Records of t_finance_bank_card
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_member`;
CREATE TABLE `t_finance_member` (
  `finance_member_id` varchar(32) NOT NULL,
  `bank_card_id` varchar(32) DEFAULT NULL,
  `member_id` varchar(32) DEFAULT NULL,
  `usable_money` float DEFAULT NULL,
  `frozen_money` float DEFAULT NULL,
  `collecting_money` float DEFAULT NULL,
  `refund_money` float DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `recharge_month_times` float DEFAULT NULL,
  `recharge_times` float DEFAULT NULL,
  `recharge_money` float DEFAULT NULL,
  `withdraw_month_times` float DEFAULT NULL,
  `withdraw_times` float DEFAULT NULL,
  `withdraw_money` float DEFAULT NULL,
  `borrower_credit` float DEFAULT NULL,
  `available_credit` float DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_member_id`),
  KEY `FK_t_bank_t_member_money_bank_id` (`bank_card_id`),
  KEY `FK_t_member_money_t_member_member_id` (`member_id`),
  CONSTRAINT `t_finance_member_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`),
  CONSTRAINT `t_finance_member_ibfk_2` FOREIGN KEY (`bank_card_id`) REFERENCES `t_finance_bank_card` (`bank_card_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����Ļ�Ա�ʽ���Ϣ���';

-- ----------------------------
-- Records of t_finance_member
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_member_transaction`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_member_transaction`;
CREATE TABLE `t_finance_member_transaction` (
  `member_transaction_id` varchar(32) NOT NULL,
  `finance_member_id` varchar(32) NOT NULL,
  `member_name` varchar(20) DEFAULT NULL,
  `transaction_target` varchar(32) DEFAULT NULL,
  `transaction_type` varchar(100) DEFAULT NULL,
  `earning_money` float DEFAULT NULL,
  `expend_money` float DEFAULT NULL,
  `usable_money` float DEFAULT NULL,
  `frozen_money` float DEFAULT NULL,
  `collecting_money` float DEFAULT NULL,
  `refund_money` float DEFAULT NULL,
  `amount` float DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`member_transaction_id`),
  KEY `FK_t_transaction_t_finance_member _finance_member_id` (`finance_member_id`),
  CONSTRAINT `t_finance_member_transaction_ibfk_1` FOREIGN KEY (`finance_member_id`) REFERENCES `t_finance_member` (`finance_member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����Ļ�Ա�ʽ�����ϸ���';

-- ----------------------------
-- Records of t_finance_member_transaction
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_recharge`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge`;
CREATE TABLE `t_finance_recharge` (
  `finance_recharge_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `finance_recharge_set_id` varchar(32) NOT NULL,
  `recharge_amount` float DEFAULT NULL,
  `handling_charge` float DEFAULT NULL,
  `recharge_rate` float DEFAULT NULL,
  `arrive_money` float DEFAULT NULL,
  `status` enum('audit1','audit0') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_recharge_id`),
  KEY `FK_t_finance_recharge_t_set_finance_recharge_set_id` (`finance_recharge_set_id`),
  KEY `FK_t_finance_recharge_t_member_member_id` (`member_id`),
  CONSTRAINT `t_finance_recharge_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`),
  CONSTRAINT `t_finance_recharge_ibfk_2` FOREIGN KEY (`finance_recharge_set_id`) REFERENCES `t_finance_recharge_set` (`finance_recharge_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����Ļ�Ա��ֵ��¼���';

-- ----------------------------
-- Records of t_finance_recharge
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_recharge_set`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_recharge_set`;
CREATE TABLE `t_finance_recharge_set` (
  `finance_recharge_set_id` varchar(32) NOT NULL,
  `finance_recharge_set_name` varchar(32) DEFAULT NULL,
  `recharge_rate` float DEFAULT NULL,
  `member_type` enum('general','vip','all') DEFAULT NULL,
  `value` float DEFAULT NULL,
  `fee_way` enum('proportion','direct_cost') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_recharge_set_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����Ļ�Ա��ֵ���ñ��';

-- ----------------------------
-- Records of t_finance_recharge_set
-- ----------------------------

-- ----------------------------
-- Table structure for `t_finance_withdraw`
-- ----------------------------
DROP TABLE IF EXISTS `t_finance_withdraw`;
CREATE TABLE `t_finance_withdraw` (
  `finance_withdraw_id` varchar(32) NOT NULL,
  `member_id` varchar(32) NOT NULL,
  `opening_bank` varchar(50) DEFAULT NULL,
  `subbranch` varchar(50) DEFAULT NULL,
  `card_name` varchar(20) DEFAULT NULL,
  `card_number` varchar(20) DEFAULT NULL,
  `withdraw_amount` float DEFAULT NULL,
  `arrive_money` float DEFAULT NULL,
  `handling_charge` float DEFAULT NULL,
  `withdraw_rate` float DEFAULT NULL,
  `status` enum('audit1','audit0') DEFAULT NULL,
  `auditor` varchar(32) DEFAULT NULL,
  `audit_date` datetime DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`finance_withdraw_id`),
  KEY `FK_t_finance_withdraw_t_member_member_id` (`member_id`),
  CONSTRAINT `t_finance_withdraw_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='����Ļ�Ա���ּ�¼���';

-- ----------------------------
-- Records of t_finance_withdraw
-- ----------------------------

-- ----------------------------
-- Table structure for `t_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_loginlog`;
CREATE TABLE `t_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) DEFAULT NULL,
  `login_user` varchar(32) DEFAULT NULL,
  `login_time` date DEFAULT NULL,
  `login_ip` varchar(20) DEFAULT NULL,
  `browser_version` varchar(20) DEFAULT NULL,
  `screen_size` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`loginlog_id`),
  KEY `FK_loginlog_user_loginlog_id` (`user_id`),
  CONSTRAINT `FK_loginlog_user_loginlog_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_loginlog
-- ----------------------------
INSERT INTO `t_loginlog` VALUES ('015b2e8d03fbfb018eda0cf157370547', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('02016b337a28989cccecebf11207b10b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('122ca4a42e0f22e3373240d1d133e939', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('17ef436587e853aa70759f96da43cb87', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1d045ccdfbfadad533c5baba20e0bf7c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('1e21373677465cb68db073db191d7748', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2164cbdaedb62ff6f6b507e698c3a400', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2b7965c0e532630b07905644b181c495', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2e78987eca033cef0ca2fae280da31d7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('319ffef6ac61815d0225745473e641bc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3212d5335a262256c78aa39e7f23927e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3360d23285f673451b8d4534a2758b18', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3409a841a3c8bfacbf67ea1bab09eb2e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('359b2092fd0d945f54f6a5bf5720faa6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('36b51074e65b5e24039ad1d69671894f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('38be21bd5f89805851649ed1672c004d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('39c4af666fbe27588ce64896b278ba77', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a330b9cca174548faf70abfa472f82a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a817edf5b002004b6a485475e23b096', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a8692b9575c844cc9fa0235d58665fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3adf06531d1d983b9baf1f39f954a83c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3f385f0449f625fba46a6ddf61463a3c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('413c3629b40d8d9f00ea1e57a82e8a39', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4a6c38c98f8a04c92d0f9aac6ef9cb0b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('4fa7a5ffd24da1be554fd269e2339cc4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('52431b1ee3ec85fd8993ac87186af6ef', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5962f01fffda05b6dbc85a19f7cb6374', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('598a7bd87764e534a8c647b057fea31c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5b4706631bc867492d26aabe857cdaac', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5b99f24109a92020ff2bcfa2257761c7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5e53a76c737e61b0bbf2cb8542338317', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5eafc8209557defd7aa0fce9ca1972a7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5f386ca066b45cd497c322c57fcebfd7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5f611f1e726d5f6ad1ec95f26f4edeb5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5fdca8929212dcc9a4a3d09516dba5f6', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('622ab3bf3da4fa055b0a6697b7fb903a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6880b6c85c31834d370a6cd2e920ef33', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('69af2c83bde4dae6edef94550953589b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6d27c77f299383460a719f72bffdf6da', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6d76807bf09266831bdfa3220d4a466b', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('70593c7e6f808fa37b583ec5c17901c1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('722fc1dbc52c5bed1f486e034911e3e5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7561784bc574f2ca26590e37120fb3f5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('761576b47fad2de50ba2e722167139e0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7620e7776eb67e93ae6ed01e6f535aae', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('764906320813de001041994e21cd3259', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7a46ab663e5154e452df2bb8cdc0bce0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7c05b0bc9861dcb82e728674dcdee483', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('81a274ddbebf27364d5aaff8a572f40d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('81deeedf62470041d1bcf0918f71f6a2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('85a8700e24ee11d815fe95e4c4122f74', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('882b2846421f2a7b5106dd915f55c5a4', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('88b02fed626344a9666895e42fbf22b9', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8afccf892629f957fa8ca385778f8498', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8bc78abcacf5fc31b8b55926b30e73db', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('95e7982af0738c1676e754f7d7359141', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b2a071325c710997ba4d3ac4d4fe6eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b52f0928e9ae98006f1a4f0bcf59f44', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a1e427d1231da6e1117bc5ace4b85762', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a32cc4588a0d4cca40a187f17fdf82e5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a4b80e8956adf9362590cb38b64877eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a5fb4e9004edfa815c6f471c4c1f101e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('a7103936c710e2cf05a0edd5dec6bf9f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('aab21b0d2b6a5925a128ed3e94c05790', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('aca1a887e836926a3b2221d313ad4dc3', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('asfdasdf', '8b25651c2d896297530b64e4b80ec503', 'asdf', '2014-02-12', 'afd', 'fd', 'adfs');
INSERT INTO `t_loginlog` VALUES ('b1b98e1b7f62bdc4ca3bf7a72cb3cb19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('b535f0fb8bf1999c43fb2cb64270fe8c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ba74229738c5e2aa64679fcedee637fa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bb8b197075705e6e908ceb0d6d9c3e87', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bd822c5c3fd8c875d22b8c7de5e75694', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bdcda0dd9f577e2de2dc0e5e1be9e313', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bdf6e4c2b430b8a5495c1e3cc00fa6e8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c0dfe2d152a82a1b7843eb55fda82f36', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c237551dbded74ee1780d240cdac85dc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c4650a348b8778e51de50b4bfaa362f2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c62a18e3c823c9fd574b461237b76a50', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cdd6d49fc805c3ca218c56a842a40705', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d206150343af6501fa99301f7e1b4337', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('d3a36e6dbffb9f77a4422600c4daaaee', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('da4f67ded4052636058e1b4166991c36', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('da926083e03a4831be30889d5f3aa375', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-18', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ddfdfasd', '8b25651c2d896297530b64e4b80ec503', 'adsf', '2014-02-12', 'adsf', 'fd', 'adsf');
INSERT INTO `t_loginlog` VALUES ('de88b1152dde86d1b9ee26870295be19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('deb25377d234afb2055b50e304f86253', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e088bbed7cf37b0f41f673fc6549c087', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e16e95784d2b509609e95f5a18f44b16', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e1bbe58344013f18651885db6ac348dc', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e1d01b9d054f6d79f8941726ca2b88ac', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e84c12dfc104bd19948cc2183a57cba2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('eb5e74c65c8f23d89df83690eca61709', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('eff1988239c4ab3cadb38063eb081942', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-20', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f512ee7475ce73275369b5c6714d936f', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f8442e87c0cc3de96d99f65502cde5ca', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f9eb726c12e4168f40cf3b9a231c17ae', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fb59b7f4a2d165a4fb6ab8bbd4257b96', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fdbd65fe418262eecc1798e8e1dd6899', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fe6caf01d07c49fc43d31d41bd0b354a', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('fe989c962250e8960952c5bb72acf3b5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-19', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ff44e803d0ef2bebc29471d88bed5638', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-17', '127.0.0.1[本地]', null, null);

-- ----------------------------
-- Table structure for `t_member`
-- ----------------------------
DROP TABLE IF EXISTS `t_member`;
CREATE TABLE `t_member` (
  `member_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_name` varchar(20) DEFAULT NULL COMMENT '�ֿ�ID',
  `member_password` varchar(20) DEFAULT NULL COMMENT '�������',
  `member_real_name` varchar(20) DEFAULT NULL COMMENT '�������ID',
  `member_age` int(5) DEFAULT NULL COMMENT '��ƷID',
  `mobile_number` varchar(20) DEFAULT NULL COMMENT '��Ӧ��ID',
  `sex` enum('man','woman') DEFAULT NULL COMMENT '��ϵ�绰',
  `marital_status` varchar(10) DEFAULT NULL COMMENT '��ע',
  `card_id` varchar(20) DEFAULT NULL COMMENT '������',
  `email` varchar(32) DEFAULT NULL COMMENT '���첿��',
  `email_auth` enum('audit1','audit0') DEFAULT NULL COMMENT 'ö�٣�(����1/����0)',
  `credit` varchar(32) DEFAULT NULL,
  `mobile_auth` enum('audit1','audit0') DEFAULT NULL COMMENT '�����',
  `company_auth` enum('audit1','audit0') DEFAULT NULL COMMENT '�������',
  `real_name_auth` enum('audit1','audit0') DEFAULT NULL COMMENT '���״̬',
  `id_auth` enum('audit1','audit0') DEFAULT NULL COMMENT '������',
  `work_auth` enum('audit1','audit0') DEFAULT NULL COMMENT '������',
  `vip_auth` enum('audit1','audit0') DEFAULT NULL COMMENT '¼��ʱ��',
  `member_profile_audit` enum('audit1','audit0') DEFAULT NULL,
  `registration_time` datetime DEFAULT NULL,
  `member_type` varchar(32) DEFAULT NULL,
  `valid_vip_time` datetime DEFAULT NULL COMMENT '����޸�ʱ��',
  `expire_vip_time` datetime DEFAULT NULL,
  `attachment` varchar(255) DEFAULT NULL,
  `educational_background` varchar(32) DEFAULT NULL,
  `salary` float DEFAULT NULL,
  `personal_description` varchar(255) DEFAULT NULL,
  `hometown` varchar(20) DEFAULT NULL,
  `live_address` varchar(100) DEFAULT NULL,
  `home_phone` varchar(20) DEFAULT NULL,
  `first_contact` varchar(10) DEFAULT NULL,
  `first_contact_relation` enum('family_members','friend','business_partners') DEFAULT NULL,
  `first_contact_phone` varchar(20) DEFAULT NULL,
  `first_contact_address` varchar(100) DEFAULT NULL,
  `second_contact` varchar(10) DEFAULT NULL,
  `second_contact_relation` enum('family_members','friend','business_partners') DEFAULT NULL,
  `second_contact_phone` varchar(20) DEFAULT NULL,
  `second_contact_address` varchar(100) DEFAULT NULL,
  `unit_name` varchar(50) DEFAULT NULL,
  `unit_phone` varchar(50) DEFAULT NULL,
  `unit_adress` varchar(20) DEFAULT NULL,
  `work_age` int(2) DEFAULT NULL,
  `proof_person` varchar(20) DEFAULT NULL,
  `proof_person_phone` varchar(20) DEFAULT NULL,
  `freeze` enum('usable','forbidden') DEFAULT NULL,
  `customer_type` enum('general_customers','vip_customers') DEFAULT NULL,
  `customer_service` varchar(32) DEFAULT NULL,
  `investment_credits` int(11) DEFAULT NULL,
  `bank_id` varchar(32) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='��Ա���ϱ�';

-- ----------------------------
-- Records of t_member
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_estate`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_estate`;
CREATE TABLE `t_member_estate` (
  `member_estate_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_id` varchar(32) DEFAULT NULL COMMENT '��ⵥ��',
  `home_address` varchar(32) DEFAULT NULL COMMENT '�ֿ�ID',
  `gfa` int(11) DEFAULT NULL COMMENT '�������',
  `year_built` datetime DEFAULT NULL COMMENT '�������ID',
  `age_expenses_description` enum('mortgage','finished') DEFAULT NULL COMMENT '��ƷID',
  `first_owner` varchar(32) DEFAULT NULL COMMENT '��Ӧ��ID',
  `second_owner` varchar(32) DEFAULT NULL COMMENT '��ϵ�绰',
  `loan_period` datetime DEFAULT NULL COMMENT '��ע',
  `month_contributions` float DEFAULT NULL COMMENT '������',
  `outstand_balances` float DEFAULT NULL COMMENT '���첿��',
  `mortgage_bank` varchar(32) DEFAULT NULL COMMENT 'ö�٣�(����1/����0)',
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`member_estate_id`),
  KEY `FK_t_member_estate_t_member_member_id` (`member_id`),
  CONSTRAINT `t_member_estate_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_estate
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_finance`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_finance`;
CREATE TABLE `t_member_finance` (
  `member_finance_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_estate_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_id` varchar(32) DEFAULT NULL COMMENT '��ⵥ��',
  `ave_income` float DEFAULT NULL COMMENT '�ֿ�ID',
  `ave_income_description` varchar(32) DEFAULT NULL COMMENT '�������',
  `ave_expenses` float DEFAULT NULL COMMENT '�������ID',
  `age_expenses_description` varchar(32) DEFAULT NULL COMMENT '��ƷID',
  `buy_estate` enum('have_cat','no_cat') DEFAULT NULL COMMENT '��ע',
  `housing_conditions` enum('have_room','no_room') DEFAULT NULL COMMENT '��Ӧ��ID',
  `estate_value` float DEFAULT NULL COMMENT '��ϵ�绰',
  `buy_cat` enum('have_cat','no_cat') DEFAULT NULL COMMENT '��ע',
  `cat_value` float DEFAULT NULL COMMENT '������',
  `cat_auth` enum('yes','no') DEFAULT NULL,
  `company_name` varchar(32) DEFAULT NULL COMMENT '���첿��',
  `companies_capital_con` varchar(32) DEFAULT NULL COMMENT 'ö�٣�(����1/����0)',
  `other_assets_described` varchar(32) DEFAULT NULL COMMENT '�����',
  `first_united` varchar(10) DEFAULT NULL COMMENT '�������',
  `first_united_contact` enum('family_members','friend','business_partners') DEFAULT NULL COMMENT '���״̬',
  `first_united_phone` int(11) DEFAULT NULL COMMENT '������',
  `second_united` varchar(10) DEFAULT NULL COMMENT '¼��ʱ��',
  `second_contact` enum('family_members','friend','business_partners') DEFAULT NULL COMMENT '����޸���',
  `second_phone` int(11) DEFAULT NULL COMMENT '����޸�ʱ��',
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `estate_auth` enum('yes','no') DEFAULT NULL,
  PRIMARY KEY (`member_finance_id`),
  KEY `FK_t_member_finance_t_member_estate_member_estate_id` (`member_estate_id`),
  KEY `FK_t_member_finance_t_member_member_id` (`member_id`),
  CONSTRAINT `t_member_finance_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`),
  CONSTRAINT `t_member_finance_ibfk_2` FOREIGN KEY (`member_estate_id`) REFERENCES `t_member_estate` (`member_estate_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_finance
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_integral`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_integral`;
CREATE TABLE `t_member_integral` (
  `member_integral_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_id` varchar(32) NOT NULL COMMENT '��ⵥ��',
  `integral_type` varchar(32) DEFAULT NULL COMMENT '�ֿ�ID',
  `remark` varchar(255) DEFAULT NULL COMMENT '�������',
  `change_type` enum('increase','reduction') DEFAULT NULL,
  `change_value` int(11) DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`member_integral_id`),
  KEY `FK_t_member_integral_t_member_member_id` (`member_id`),
  CONSTRAINT `t_member_integral_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_integral
-- ----------------------------

-- ----------------------------
-- Table structure for `t_member_investment`
-- ----------------------------
DROP TABLE IF EXISTS `t_member_investment`;
CREATE TABLE `t_member_investment` (
  `lend_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_id` varchar(32) DEFAULT NULL COMMENT '��ⵥ��',
  `total_borrowings` float DEFAULT NULL COMMENT '�ֿ�ID',
  `cumulative_loss_profit` float DEFAULT NULL COMMENT '�������',
  `already_total` float DEFAULT NULL COMMENT '�������ID',
  `wait_also_total` float DEFAULT NULL COMMENT '��ƷID',
  `borrow_success` int(11) DEFAULT NULL COMMENT '��Ӧ��ID',
  `normal_repayment` int(11) DEFAULT NULL COMMENT '��ϵ�绰',
  `advance_repayment` int(11) DEFAULT NULL COMMENT '��ע',
  `late_repayment` int(11) DEFAULT NULL COMMENT '������',
  `late` int(11) DEFAULT NULL COMMENT '���첿��',
  `website_substitute` int(11) DEFAULT NULL COMMENT 'ö�٣�(����1/����0)',
  `investment_total` float DEFAULT NULL COMMENT '�����',
  `tender_awards` float DEFAULT NULL COMMENT '�������',
  `already_income_total` float DEFAULT NULL COMMENT '���״̬',
  `wait_income_total` float DEFAULT NULL COMMENT '������',
  `promotion_awards` float DEFAULT NULL COMMENT '¼��ʱ��',
  `upline_delta_awards` float DEFAULT NULL COMMENT '����޸���',
  `continue_awards` float DEFAULT NULL COMMENT '����޸�ʱ��',
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`lend_id`),
  KEY `FK_t_member_investment_t_member_member_id` (`member_id`),
  CONSTRAINT `t_member_investment_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_member_investment
-- ----------------------------

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
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('4f1b6666b70be892469b6e93c1eb30ce', 'a60cca184eff20fdce88b3f1ab5a9cce', 'nav', '导航信息', 'icon-standard-application-view-list', '/do/nav/index.htm', '31', '');
INSERT INTO `t_menu` VALUES ('54d652799e07bb8be54483301a89ff90', 'a60cca184eff20fdce88b3f1ab5a9cce', 'help', '帮助中心', 'icon-hamburg-config', '/do/help/index.htm', '37', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '12', null);
INSERT INTO `t_menu` VALUES ('5b6eaabb2c3a020c4d85ab50d11ffd85', 'a60cca184eff20fdce88b3f1ab5a9cce', 'link', '友情链接', 'icon-hamburg-world', '/do/link/index.htm', '35', '');
INSERT INTO `t_menu` VALUES ('88ee044d59911b3b1a67ba4cdd0ee90d', 'a60cca184eff20fdce88b3f1ab5a9cce', 'announcement', '公告管理', 'icon-standard-feed', '/do/announcement/index.htm', '32', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-standard-user-orange', '/do/user/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('93f0fcfa7cdff069d929723062b53211', '14sdf54157cf483a790f4eea35dsf6f6', 'variables', '系统变量', 'icon-standard-layout-content', '/do/variables/index.htm', '26', '');
INSERT INTO `t_menu` VALUES ('a60cca184eff20fdce88b3f1ab5a9cce', null, 'website', '网站管理', 'icon-standard-color-wheel', '', '3', '');
INSERT INTO `t_menu` VALUES ('a652d3fe69c067cb94b73361351b8378', 'a60cca184eff20fdce88b3f1ab5a9cce', 'news', '新闻管理', 'icon-standard-monitor', '/do/news/index.htm', '34', '');
INSERT INTO `t_menu` VALUES ('ab01dd2ac38d920f691bbc65b7a4bfb2', 'a60cca184eff20fdce88b3f1ab5a9cce', 'hiring', '招聘信息', 'icon-hamburg-customers', '/do/hiring/index.htm', '38', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-application-view-detail', '/do/operalog/index.htm', '14', '');
INSERT INTO `t_menu` VALUES ('ae024ce004991607d5ae9e725d67cce8', 'fefe8e9ee335dadbace082923415e023', 'amount', '申请额度', 'icon-standard-star', '/do/amount', '1', '');
INSERT INTO `t_menu` VALUES ('b34761b59816e63743643c6f179683a4', 'a60cca184eff20fdce88b3f1ab5a9cce', 'advertisement', '广告管理', 'icon-standard-bell', '/do/advertisement/index.htm', '33', '');
INSERT INTO `t_menu` VALUES ('d503136bdab7bbdc8d09f3bbb28fa979', null, 'info', '信息管理', 'icon-standard-application-view-tile', '', '4', '');
INSERT INTO `t_menu` VALUES ('de34654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'area', '地区管理', 'icon-hamburg-link', '/do/area/index.htm', '23', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-application-view-list', '/do/loginlog/index.htm', '13', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-standard-status-online', '/do/role/index.htm', '11', null);
INSERT INTO `t_menu` VALUES ('e75a41ba4a2bc299e3b50a15580a103b', 'a60cca184eff20fdce88b3f1ab5a9cce', 'service', '客服服务', 'icon-cologne-customers', '/do/service/index.htm', '36', '');
INSERT INTO `t_menu` VALUES ('fefe8e9ee335dadbace082923415e023', null, 'member', '会员管理', 'icon-standard-group', '', '10', '');
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
  `opera_menu` varchar(255) DEFAULT NULL COMMENT '操作菜单',
  `opera_penal` varchar(255) DEFAULT NULL COMMENT '操作面板',
  `opera_method` varchar(255) DEFAULT NULL COMMENT '操作方法',
  `opera_result` varchar(255) DEFAULT NULL COMMENT '操作结果',
  `opera_desc` varchar(255) DEFAULT NULL COMMENT '返回内容',
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
INSERT INTO `t_operalog` VALUES ('03b00188bde8a83cf30778e9159c7007', '会员信用', '信用列表', '修改', '1', '[二级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 15:25:55');
INSERT INTO `t_operalog` VALUES ('058b6112a0276e84a249a4996d0a1de0', '下拉项管理', '下拉列表', '增加', '1', '[内置] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 16:31:13');
INSERT INTO `t_operalog` VALUES ('0591859706d9cfac2274207ff739135c', '资源管理', '操作列表', '删除', '1', '成功删除了[ 增加,修改,删除 ]操作!', 'com.glacier.netloan.service.system.ActionService', 'delActions', 'ActionList_del', '超级管理员', '2014-02-19 17:56:04');
INSERT INTO `t_operalog` VALUES ('0597579bd3057033db4c56467ec19581', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 18:00:19');
INSERT INTO `t_operalog` VALUES ('05e93db92c2533184902b7c9c7b3cfdd', '角色管理', '角色列表', '修改', '0', '英文名称重复，请重新填写!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('0775eb508d76f4536753ac2bbd7b1848', '资源管理', '菜单树', '修改', '1', '[登录日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:50:40');
INSERT INTO `t_operalog` VALUES ('080f3452f6a8148af507fe21fab84f8d', '下拉项管理', '下拉项树', '增加', '1', '[帮助中心类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-18 10:59:38');
INSERT INTO `t_operalog` VALUES ('08d364211d496152c13dd9c572f9e635', '会员信用', '信用列表', '增加', '1', '[啊的] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-02-19 10:18:37');
INSERT INTO `t_operalog` VALUES ('08fb8d135ad9bf9b490532c35ad07f39', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:16');
INSERT INTO `t_operalog` VALUES ('0b4529dea580c32905c8eaaf24bd19b0', '会员积分', '积分列表', '修改', '1', '[的萨芬] 会员积分级别信息已修改保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'editParameterIntegral', 'IntegralList_edit', '超级管理员', '2014-02-18 16:39:54');
INSERT INTO `t_operalog` VALUES ('0d80706cc5263b573a097fea23f3ecd5', '下拉项管理', '下拉项树', '增加', '1', '[表单类型] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-17 16:19:08');
INSERT INTO `t_operalog` VALUES ('0e0a7eed1cc843c3ae59dd5686e9ec28', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:32:27');
INSERT INTO `t_operalog` VALUES ('10fa3553d1fe605663a958d8be50f6cf', '资源管理', '菜单树', '删除', '1', '成功删除名称为：[ 银行卡管理 ]菜单', 'com.glacier.netloan.service.system.MenuService', 'delMenu', 'MenuTree_del', '超级管理员', '2014-02-19 17:56:11');
INSERT INTO `t_operalog` VALUES ('115848c4e07856bd91874d4f05a348b5', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-17 15:43:41');
INSERT INTO `t_operalog` VALUES ('11c328d950a0e3363bb465cf86edf9f1', '下拉项管理', '下拉列表', '修改', '1', '[管理员] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:15:34');
INSERT INTO `t_operalog` VALUES ('12ef55463be3bec8b5e3803eb62d4a1f', '资源管理', '菜单树', '修改', '1', '[信息管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:24');
INSERT INTO `t_operalog` VALUES ('13ad4ee4478a840d62d4068766f87fc3', '角色管理', '角色列表', '修改', '1', '[角色测试666] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('141cd61d07cba0005f2c782413958448', '帮助中心', '帮助列表', '增加', '1', '[as] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:40:14');
INSERT INTO `t_operalog` VALUES ('14b98ddf270dd66201bc046f96de4dc0', '招聘信息', '招聘列表', '修改', '1', '[asdfs] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 14:58:04');
INSERT INTO `t_operalog` VALUES ('1660a224be1a30c91962b684eae17b72', '招聘信息', '招聘列表', '删除', '1', '成功删除了[ asfd,sadf ]操作', 'com.glacier.netloan.service.website.WebsiteHiringService', 'delWebsiteHiring', 'HiringList_del', '超级管理员', '2014-02-18 14:58:32');
INSERT INTO `t_operalog` VALUES ('167ee38b8285a299f5186cb2ad1336cb', '客服服务', '客服列表', '增加', '1', '[dsd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:49:28');
INSERT INTO `t_operalog` VALUES ('1988921321b14bb27d06e89440043d9f', '下拉项管理', '下拉项树', '增加', '1', '[招聘管理状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:34:22');
INSERT INTO `t_operalog` VALUES ('19f59b37f218b8d6d48ce9d23a0d37a9', '招聘信息', '招聘列表', '修改', '1', '[dddee] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 14:58:25');
INSERT INTO `t_operalog` VALUES ('1c42954abb73e38d16df2b34c36c2973', '会员信用', '信用列表', '删除', '1', '成功删除了[ 地方的 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'delCredit', 'CreditList_del', '超级管理员', '2014-02-18 16:39:22');
INSERT INTO `t_operalog` VALUES ('20a1429de13f9e052bc90da0176790eb', '下拉项管理', '下拉项树', '增加', '1', '[网站管理] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-18 10:56:19');
INSERT INTO `t_operalog` VALUES ('20c225d8836b7b6d55be6d47502ea1db', '导航信息', '导航树', '删除', '1', '[爱的色放] 导航信息已删除', 'com.glacier.netloan.service.website.WebsiteNavService', 'delNav', 'NavTree_del', '超级管理员', '2014-02-19 10:57:08');
INSERT INTO `t_operalog` VALUES ('20dc307e1aed7c62b471704d3d17dc8d', '导航信息', '导航树', '修改', '1', '[是否] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-18 16:40:30');
INSERT INTO `t_operalog` VALUES ('211c06f3e3d477e6db0ef9803668cb19', '资源管理', '面板列表', '增加', '1', '[银行卡列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-19 16:25:42');
INSERT INTO `t_operalog` VALUES ('253d4cf44d92411018930a4a5e6203c4', '资源管理', '菜单树', '增加', '1', '[银行卡管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-19 16:23:36');
INSERT INTO `t_operalog` VALUES ('25dadcf4e9b37fefdd88b54193778e68', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 15:56:37');
INSERT INTO `t_operalog` VALUES ('264bc807e2e5591cb333ab18eb474442', '帮助中心', '帮助列表', '增加', '1', '[sfew] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:40:43');
INSERT INTO `t_operalog` VALUES ('2665b8a132b979cfdfd3b461b2d92059', '下拉项管理', '下拉列表', '增加', '1', '[借款] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-18 11:01:18');
INSERT INTO `t_operalog` VALUES ('293eb52004765edbcd489fc4e45a8908', '资源管理', '面板列表', '增加', '1', '[申请额度列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-19 17:58:30');
INSERT INTO `t_operalog` VALUES ('299bc366fd2dc3ee5b4b33639d2bd009', '资源管理', '操作列表', '编辑', '1', '[分配角色] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:42:37');
INSERT INTO `t_operalog` VALUES ('2a9c3044581a19bff9563a2d2681bb57', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-15 14:40:48');
INSERT INTO `t_operalog` VALUES ('2ab0553041fa90190930d99ebbd3f188', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:22');
INSERT INTO `t_operalog` VALUES ('2acc3d059f1873832653a08f0762819a', '下拉项管理', '下拉项树', '修改', '1', '[是否内置] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-15 10:26:11');
INSERT INTO `t_operalog` VALUES ('2b03bc2d345ff6c673ee1fede3a24e25', '帮助中心', '帮助列表', '增加', '1', '[ad] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 16:42:38');
INSERT INTO `t_operalog` VALUES ('2be66b4082f534e7a9943a6f0700234a', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:55:03');
INSERT INTO `t_operalog` VALUES ('2d8bfa6c31befee549da5e4a5ba56d2b', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-19 16:29:05');
INSERT INTO `t_operalog` VALUES ('2da72ba0438fcef88dc3d1f875295b07', '招聘信息', '招聘列表', '修改', '0', '招聘管理名称重复', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 14:57:49');
INSERT INTO `t_operalog` VALUES ('2e7343f769ad6d38c97631192f5bd114', '下拉项管理', '下拉项树', '删除', '1', '[参数管理] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:37:55');
INSERT INTO `t_operalog` VALUES ('2ed2d26ac883b67c57d5506a95acff15', '资源管理', '面板列表', '增加', '1', '[变量列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'addPanel', 'PanelList_add', '超级管理员', '2014-02-17 15:53:16');
INSERT INTO `t_operalog` VALUES ('3050146322d4b2f66459f24671287eb3', '招聘信息', '招聘列表', '修改', '1', '[dsa] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-19 13:56:29');
INSERT INTO `t_operalog` VALUES ('312741870b15cb5895829976c4e1a4f3', '导航信息', '导航树', '修改', '1', '[发布担保标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:42');
INSERT INTO `t_operalog` VALUES ('347b393d72c4590dfa2eb2e4780b6a5e', '帮助中心', '帮助列表', '增加', '1', '[dd] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-19 13:52:05');
INSERT INTO `t_operalog` VALUES ('37df8b9feed9a8a64888e43d9cbd7bef', '帮助中心', '帮助列表', '删除', '1', '成功删除了[ afd,sdf ]操作', 'com.glacier.netloan.service.website.WebsiteHelpService', 'delWebsiteHelp', 'HelpList_del', '超级管理员', '2014-02-18 13:40:50');
INSERT INTO `t_operalog` VALUES ('3969cc00a4182efc3f9739f6519f8ab7', '导航信息', '导航树', '修改', '1', '[我要投资] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:15');
INSERT INTO `t_operalog` VALUES ('3a68492252a77a2af2311c5af01a1f27', '下拉项管理', '下拉列表', '增加', '1', '[基金] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-18 11:02:27');
INSERT INTO `t_operalog` VALUES ('3b26e45a81a4e7f8e1aec24538b910a1', '导航信息', '导航树', '增加', '1', '[爱的色放] 导航信息已保存', 'com.glacier.netloan.service.website.WebsiteNavService', 'addNav', 'NavTree_add', '超级管理员', '2014-02-19 10:56:54');
INSERT INTO `t_operalog` VALUES ('3bd449fa890427bf4e4a111600a192cb', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-19 18:00:42');
INSERT INTO `t_operalog` VALUES ('3c1a014a79c1f392da8d6ad0612adac1', '会员信用', '信用列表', '修改', '1', '[一级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:10:36');
INSERT INTO `t_operalog` VALUES ('3e1a450eb91b124998d47edc829c54eb', '导航信息', '导航树', '增加', '1', '[是否] 导航信息已保存', 'com.glacier.netloan.service.website.WebsiteNavService', 'addNav', 'NavTree_add', '超级管理员', '2014-02-18 16:40:16');
INSERT INTO `t_operalog` VALUES ('3f3ebe72165fd6b0dfc3dd86faad89ff', '资源管理', '菜单树', '修改', '1', '[帮助中心] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:08');
INSERT INTO `t_operalog` VALUES ('45599bb8e7c2cf07b693022de63d7dcd', '资源管理', '菜单树', '修改', '1', '[系统变量] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 15:52:54');
INSERT INTO `t_operalog` VALUES ('4688d27f2dbfdb01aadbbdaf66d391b2', '招聘信息', '招聘列表', '增加', '1', '[asd] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-18 16:42:59');
INSERT INTO `t_operalog` VALUES ('49659aed80347f557e955d850cd3be82', '下拉项管理', '下拉列表', '增加', '1', '[3333] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:26:20');
INSERT INTO `t_operalog` VALUES ('505cc29fd4abee087c7a2f39a1f3133c', '下拉项管理', '下拉项树', '删除', '0', '该下拉项存在所属下拉值，如需删除请先删除所属下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:30:11');
INSERT INTO `t_operalog` VALUES ('50f01029c83f12c65b9262f4bfcb689e', '会员信用', '信用列表', '修改', '1', '[啊的的] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-19 10:40:00');
INSERT INTO `t_operalog` VALUES ('5152b0fce22c2c5fd68ea2cb371b5e53', '下拉项管理', '下拉列表', '增加', '1', '[文本框] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:54:06');
INSERT INTO `t_operalog` VALUES ('519bd6ad7c779ff862cc5aede5a38786', '客服服务', '客服列表', '修改', '1', '[dddeee] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-19 13:48:25');
INSERT INTO `t_operalog` VALUES ('52bc38baa0c4b406b9c604d5c1af7e8c', '导航信息', '导航树', '删除', '1', '[dfsa] 导航信息已删除', 'com.glacier.netloan.service.website.WebsiteNavService', 'delNav', 'NavTree_del', '超级管理员', '2014-02-19 14:26:57');
INSERT INTO `t_operalog` VALUES ('553be45a6253340bd6f7cc2f15dcc2e3', '客服服务', '客服列表', '增加', '1', '[fs] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-19 13:50:11');
INSERT INTO `t_operalog` VALUES ('57aa583a1418f3e09b8da921def230a7', '会员信用', '信用列表', '修改', '1', '[四级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:10:58');
INSERT INTO `t_operalog` VALUES ('588491e42c4bf87d174d0f5561281071', '下拉项管理', '下拉列表', '增加', '1', '[自定义] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 16:31:33');
INSERT INTO `t_operalog` VALUES ('58f54cc5746fcdc4e8c9ccdd2adcb88e', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 16:27:50');
INSERT INTO `t_operalog` VALUES ('590ad5657cb4d3e0beeeadc3b81135cd', '下拉项管理', '下拉项树', '增加', '1', '[参数管理] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-17 16:15:47');
INSERT INTO `t_operalog` VALUES ('5918494d834f32e3ded787ea4ed828cf', '导航信息', '导航树', '修改', '1', '[我的账号] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:50');
INSERT INTO `t_operalog` VALUES ('59284cbffd57866c08498079dd192119', '会员积分', '积分列表', '删除', '1', '成功删除了[ 的萨芬 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'delIntegral', 'IntegralList_del', '超级管理员', '2014-02-18 16:39:58');
INSERT INTO `t_operalog` VALUES ('5a7760de7693d8373fba71b19fd60b2e', '资源管理', '操作列表', '编辑', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:55:46');
INSERT INTO `t_operalog` VALUES ('6012350c31b65b0107f134b17163f8d7', '下拉项管理', '下拉项树', '删除', '1', '[客服状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:42');
INSERT INTO `t_operalog` VALUES ('608d5ed7d1ca925ffac640c120182ef0', '导航信息', '导航树', '修改', '1', '[发布信用标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 10:48:31');
INSERT INTO `t_operalog` VALUES ('622394c607f92bc566d43a62355fc9b9', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:34:48');
INSERT INTO `t_operalog` VALUES ('62b08ab35835c9c2f0eb4a8f1c029225', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:54:36');
INSERT INTO `t_operalog` VALUES ('62b6ec85db8d52aed20ab43b69140f3b', '资源管理', '菜单树', '修改', '1', '[招聘信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:14');
INSERT INTO `t_operalog` VALUES ('62ee8108c3fbe30ab18bd6f28ca8c44e', '帮助中心', '帮助列表', '修改', '1', '[adad] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-18 16:42:44');
INSERT INTO `t_operalog` VALUES ('66a763826d75752a656e04c0a49dab9b', '导航信息', '导航树', '修改', '1', '[首页] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:26:53');
INSERT INTO `t_operalog` VALUES ('681c31aaf6a5914052043be3bf02798c', '资源管理', '菜单树', '增加', '1', '[会员管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-19 16:18:57');
INSERT INTO `t_operalog` VALUES ('68391d28c3f259ad47d556cf8b25736d', '资源管理', '菜单树', '修改', '1', '[银行卡管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-19 16:23:47');
INSERT INTO `t_operalog` VALUES ('68ca319425187ce2f5fa375328f51c63', '下拉项管理', '下拉列表', '修改', '1', '[禁用] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-15 16:37:46');
INSERT INTO `t_operalog` VALUES ('6c3cb73389fa070123484a76e5d2de4a', '招聘信息', '招聘列表', '增加', '1', '[dsa] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-19 13:53:13');
INSERT INTO `t_operalog` VALUES ('6c3db1897709cca96955530cb5c0d879', '客服服务', '客服列表', '增加', '1', '[ddd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:45:23');
INSERT INTO `t_operalog` VALUES ('6f6fccf692e120b84e725fdae846ed8a', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:52');
INSERT INTO `t_operalog` VALUES ('7038cd3c063b21e96d333dc8f9f04c8b', '会员信用', '信用列表', '删除', '1', '成功删除了[ 都是 ]操作', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'delCredit', 'CreditList_del', '超级管理员', '2014-02-18 16:12:09');
INSERT INTO `t_operalog` VALUES ('708ecc0e8fbd1441586cd17a63ef7b50', '资源管理', '面板列表', '删除', '1', '成功删除名称为：[ 银行卡列表 ]mianban ', 'com.glacier.netloan.service.system.PanelService', 'delPanel', 'PanelList_del', '超级管理员', '2014-02-19 17:56:08');
INSERT INTO `t_operalog` VALUES ('70b3bdc84357b0c48d0c68f88d737b56', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-17 15:02:09');
INSERT INTO `t_operalog` VALUES ('70e3f8640fb4b939a7f481c22b08747a', '帮助中心', '帮助列表', '删除', '1', '成功删除了[ adad ]操作', 'com.glacier.netloan.service.website.WebsiteHelpService', 'delWebsiteHelp', 'HelpList_del', '超级管理员', '2014-02-18 16:42:47');
INSERT INTO `t_operalog` VALUES ('71293b1fbb8f230176cd78b6a4e795f7', '帮助中心', '帮助列表', '修改', '1', '[eeeddd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-18 13:39:50');
INSERT INTO `t_operalog` VALUES ('7424052f962824b3fe4e67737d10003a', '帮助中心', '帮助列表', '修改', '1', '[dd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 13:52:24');
INSERT INTO `t_operalog` VALUES ('79662e83d97759e07db47c8f612e5a4f', '资源管理', '菜单树', '修改', '1', '[导航信息] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:28');
INSERT INTO `t_operalog` VALUES ('79c64cf5474d1d6a27c2ed4cd10d9d34', '招聘信息', '招聘列表', '修改', '1', '[asdddddddddddd] 招聘管理信息已修改', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-18 16:43:09');
INSERT INTO `t_operalog` VALUES ('79ed399c88414d6f744859ec6566a8d8', '下拉项管理', '下拉列表', '增加', '1', '[管理员] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 10:15:11');
INSERT INTO `t_operalog` VALUES ('7a673f115d54c7493ef5fcf11b441973', '资源管理', '菜单树', '修改', '1', '[新闻管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:50');
INSERT INTO `t_operalog` VALUES ('7bae3bb02cc0d9ee1f16665c09287811', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:54:02');
INSERT INTO `t_operalog` VALUES ('7d24d80aeb93cff5459209ceba24b2eb', '会员信用', '信用列表', '增加', '1', '[地方] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-02-18 16:38:49');
INSERT INTO `t_operalog` VALUES ('7f6cf7d142655fe5d02e4e52b386d1ad', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-17 15:56:59');
INSERT INTO `t_operalog` VALUES ('82b1c9aaa57b6be7bb7e79e99b2bc31e', '下拉项管理', '下拉项树', '增加', '1', '[帮助中心] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-18 10:57:41');
INSERT INTO `t_operalog` VALUES ('8339990f799edc4d8e1bbd91b9aca032', '下拉项管理', '下拉项树', '删除', '1', '[网站管理] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:50');
INSERT INTO `t_operalog` VALUES ('845e939d85b74629c5ff714b7952b8b6', '资源管理', '菜单树', '修改', '1', '[操作日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:50:32');
INSERT INTO `t_operalog` VALUES ('86be699db942e872b26528d9cbd1de4f', '角色管理', '角色列表', '修改', '1', '[角色测试] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('86c08392373c885786bdb8c6361abde1', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:31');
INSERT INTO `t_operalog` VALUES ('888e577a828669a20ee016d138d1b126', '会员积分', '积分列表', '修改', '1', '[三级积分] 会员积分级别信息已修改保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'editParameterIntegral', 'IntegralList_edit', '超级管理员', '2014-02-19 10:35:55');
INSERT INTO `t_operalog` VALUES ('8a3663c9d78e349b60f029f710656ab2', '下拉项管理', '下拉项树', '增加', '1', '[系统变量] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-17 16:18:18');
INSERT INTO `t_operalog` VALUES ('8b2016a37312258a004fad342f5f5e3f', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:32:01');
INSERT INTO `t_operalog` VALUES ('8d8e08a00c9433658029eb7fbfae3ab5', '客服服务', '客服列表', '删除', '1', '成功删除了[ asdf ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-02-19 13:51:11');
INSERT INTO `t_operalog` VALUES ('8d9cdb4a7853898b3ccd1ee42633066f', '会员信用', '信用列表', '修改', '1', '[三级] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:10:49');
INSERT INTO `t_operalog` VALUES ('8f2c662f7c4bed97d622e0cc21149999', '客服服务', '客服列表', '增加', '1', '[asdf] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-19 09:35:59');
INSERT INTO `t_operalog` VALUES ('965657708bbde1b5dbf381839835dbe9', '资源管理', '菜单树', '修改', '1', '[会员管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-19 16:20:21');
INSERT INTO `t_operalog` VALUES ('9ee8193c4e0849885d7956ba017f387c', '下拉项管理', '下拉列表', '修改', '1', '[禁用] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 14:42:50');
INSERT INTO `t_operalog` VALUES ('a03a7d442857a7cdf4ea9691969478cc', '招聘信息', '招聘列表', '修改', '0', '招聘管理名称重复', 'com.glacier.netloan.service.website.WebsiteHiringService', 'editWebsiteHiring', 'HiringList_edit', '超级管理员', '2014-02-19 13:53:25');
INSERT INTO `t_operalog` VALUES ('a04e3e8b2e9bbbfa7215254802487e7b', '招聘信息', '招聘列表', '增加', '1', '[ddd] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-18 14:58:17');
INSERT INTO `t_operalog` VALUES ('a053db184c91f34104fd173e19f3ae3c', '帮助中心', '帮助列表', '修改', '1', '[eeeddd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 11:04:08');
INSERT INTO `t_operalog` VALUES ('a11b6bd3d900cf171b5feb01896d5ed1', '资源管理', '菜单树', '修改', '1', '[会员管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-19 16:28:10');
INSERT INTO `t_operalog` VALUES ('a2af44875f908b54a1999580874f0cd9', '资源管理', '菜单树', '修改', '1', '[友情链接] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:56');
INSERT INTO `t_operalog` VALUES ('a3f67a23e55a74a920583d30f7d53399', '导航信息', '导航树', '修改', '1', '[我要登录] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:56');
INSERT INTO `t_operalog` VALUES ('a46d41294b3deb7e181fcaa753aad05b', '资源管理', '操作列表', '增加', '1', '[分配角色] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:41:31');
INSERT INTO `t_operalog` VALUES ('a63d5683dea2db0e1d3fd049b769deb1', '下拉项管理', '下拉列表', '修改', '1', '[启用] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 14:42:47');
INSERT INTO `t_operalog` VALUES ('a64b5839b1b8d6726d3586d6948de9b3', '帮助中心', '帮助列表', '删除', '1', '成功删除了[ as ]操作', 'com.glacier.netloan.service.website.WebsiteHelpService', 'delWebsiteHelp', 'HelpList_del', '超级管理员', '2014-02-19 13:52:30');
INSERT INTO `t_operalog` VALUES ('a6d508f6570a1ba753dce9bcdbde4dd5', '客服服务', '客服列表', '修改', '1', '[ccc] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-15 14:48:38');
INSERT INTO `t_operalog` VALUES ('a6fa5b99fbee19112c68cd8080a7da97', '下拉项管理', '下拉项树', '增加', '1', '[帮助中心状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:33:47');
INSERT INTO `t_operalog` VALUES ('a903f9661c4d0abf3228245d18a37f2a', '招聘信息', '招聘列表', '删除', '1', '成功删除了[ asdddddddddddd ]操作', 'com.glacier.netloan.service.website.WebsiteHiringService', 'delWebsiteHiring', 'HiringList_del', '超级管理员', '2014-02-18 16:43:13');
INSERT INTO `t_operalog` VALUES ('a919dd68ab3b50b47e25a7d2005e338b', '下拉项管理', '下拉项树', '增加', '1', '[公用下拉项] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 16:29:29');
INSERT INTO `t_operalog` VALUES ('ac3fb5b3de1647861abaf45ac5656d3c', '下拉项管理', '下拉列表', '增加', '1', '[输入框] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:53:45');
INSERT INTO `t_operalog` VALUES ('ac8797bf52b616f9ecbffc7330addd9c', '下拉项管理', '下拉列表', '修改', '1', '[内置] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:42:00');
INSERT INTO `t_operalog` VALUES ('ae6149ba8a9e2249c3192fb5a6974752', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-17 15:55:40');
INSERT INTO `t_operalog` VALUES ('ae975cdbda342b4065c873ad2811731b', '下拉项管理', '下拉列表', '增加', '1', '[投资] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-18 11:02:01');
INSERT INTO `t_operalog` VALUES ('b05f11843531ddd845daf347410699cd', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 17:59:56');
INSERT INTO `t_operalog` VALUES ('b282036ce67eb0ddc7ff82d7dadfe085', '下拉项管理', '下拉项树', '增加', '1', '[是否内置] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 10:06:27');
INSERT INTO `t_operalog` VALUES ('b2f7f0b45d46119aa0bf1b7f4fa7065d', '资源管理', '操作列表', '增加', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 17:59:30');
INSERT INTO `t_operalog` VALUES ('b345baaffd7cf83230cedfa6ed919c79', '下拉项管理', '下拉列表', '增加', '1', '[3] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:25:29');
INSERT INTO `t_operalog` VALUES ('b482275c19b4d35fba144bef835f2c6b', '导航信息', '导航树', '修改', '1', '[我要借款] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:22');
INSERT INTO `t_operalog` VALUES ('b6a681540afcf6440b665a12672efa48', '下拉项管理', '下拉项树', '修改', '1', '[状态] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-15 16:37:23');
INSERT INTO `t_operalog` VALUES ('be02867adc54dcba86060352dbcdc82f', '资源管理', '菜单树', '修改', '1', '[操作日志] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:50:47');
INSERT INTO `t_operalog` VALUES ('bfc27e6d7b4e9d49ddff0255b48e0665', '资源管理', '菜单树', '增加', '1', '[系统参数] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-17 15:01:12');
INSERT INTO `t_operalog` VALUES ('bfeb871d2696c425d30cb312366c5073', '角色管理', '角色列表', '授权', '1', '权限信息已保存', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-19 16:30:36');
INSERT INTO `t_operalog` VALUES ('c0a2705925a0d4044ed0a24cb2376f84', '客服服务', '客服列表', '增加', '1', '[asf] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:47:25');
INSERT INTO `t_operalog` VALUES ('c1828fdbd8c349533c6ebefecd35fcad', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:12');
INSERT INTO `t_operalog` VALUES ('c2a9fd3e8308cd67d32347368131b1fd', '资源管理', '菜单树', '修改', '1', '[系统参数] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 15:01:46');
INSERT INTO `t_operalog` VALUES ('c31cc57af39f8eed483d974b015d388c', '客服服务', '客服列表', '删除', '1', '成功删除了[ sd,dsd ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-02-15 14:51:38');
INSERT INTO `t_operalog` VALUES ('c3a371f9c523f522840fdcdd7459f840', '下拉项管理', '下拉项树', '删除', '1', '[帮助中心状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:35');
INSERT INTO `t_operalog` VALUES ('c3f56fa23ca808a59f61010c4920b4e4', '导航信息', '导航树', '修改', '0', '禁止选择该导航本身以及子导航作为上级导航', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-18 16:40:26');
INSERT INTO `t_operalog` VALUES ('c46a02f4149d6b6ff2632947481e3d0c', '客服服务', '客服列表', '增加', '1', '[sd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:49:38');
INSERT INTO `t_operalog` VALUES ('c5b11ee585efe33125aee3921a3e89ec', '导航信息', '导航树', '修改', '1', '[发布信用标] 导航信息已修改', 'com.glacier.netloan.service.website.WebsiteNavService', 'editNav', 'NavTree_edit', '超级管理员', '2014-02-19 14:27:34');
INSERT INTO `t_operalog` VALUES ('c7506853b7d5a37c6426e07af3558645', '会员积分', '积分列表', '修改', '1', '[三级积分] 会员积分级别信息已修改保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'editParameterIntegral', 'IntegralList_edit', '超级管理员', '2014-02-19 10:38:58');
INSERT INTO `t_operalog` VALUES ('c770961d7d23de79e78cbf2747078d82', '下拉项管理', '下拉项树', '删除', '1', '[招聘管理状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:39');
INSERT INTO `t_operalog` VALUES ('c7a80a1704f365f5b26f79d78057cd31', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:26');
INSERT INTO `t_operalog` VALUES ('c7ee5398cd2cba9329c55ebbf49d3002', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:28');
INSERT INTO `t_operalog` VALUES ('c8977cb59000a9c1807de59c18986aab', '帮助中心', '帮助列表', '增加', '0', '帮助中心名称重复', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:40:25');
INSERT INTO `t_operalog` VALUES ('c9bd7eb814ff33295426aeb9445828b7', '会员积分', '积分列表', '增加', '1', '[三级积分] 会员积分级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'addParameterIntegral', 'IntegralList_add', '超级管理员', '2014-02-19 10:35:39');
INSERT INTO `t_operalog` VALUES ('caeba250f78389e2a9d3cd298106210c', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 内置,不内置 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:33:54');
INSERT INTO `t_operalog` VALUES ('cb32ae304ed1c7fa681890a637de916f', '下拉项管理', '下拉列表', '增加', '0', '下拉值代码重复', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-17 16:26:11');
INSERT INTO `t_operalog` VALUES ('cd1972d21af7565213ff6aace08349dd', '招聘信息', '招聘列表', '删除', '1', '成功删除了[ sfd ]操作', 'com.glacier.netloan.service.website.WebsiteHiringService', 'delWebsiteHiring', 'HiringList_del', '超级管理员', '2014-02-19 13:57:01');
INSERT INTO `t_operalog` VALUES ('cf1d8d3b8f660e135c4796f29f394cd5', '资源管理', '操作列表', '增加', '1', '[删除] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 16:30:21');
INSERT INTO `t_operalog` VALUES ('cf85ffebd7b9673b233c5a99a053d64c', '会员信用', '信用列表', '修改', '1', '[啊的的] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-19 10:23:03');
INSERT INTO `t_operalog` VALUES ('d03d8d2145984af580ba3cbdc7549c5d', '下拉项管理', '下拉项树', '增加', '1', '[内置] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 16:34:53');
INSERT INTO `t_operalog` VALUES ('d330958e345474c023d331fbba5ad28f', '帮助中心', '帮助列表', '增加', '1', '[eee] 帮助中心信息已保存', 'com.glacier.netloan.service.website.WebsiteHelpService', 'addWebsiteHelp', 'HelpList_add', '超级管理员', '2014-02-18 13:39:38');
INSERT INTO `t_operalog` VALUES ('d42b99f442c2da209f02de303b451572', '资源管理', '菜单树', '修改', '1', '[公告管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:39');
INSERT INTO `t_operalog` VALUES ('d4606504940c8e6628d1a5e18d7c48ae', '帮助中心', '帮助列表', '修改', '1', '[dd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 13:52:10');
INSERT INTO `t_operalog` VALUES ('d53edc6e506da02998b4a4036a412a31', '管理员设置', '管理员列表', '增加', '1', '[sdf]用户信息已保存', 'com.glacier.netloan.service.system.UserService', 'addUser', 'UserList_add', '超级管理员', '2014-02-17 14:43:31');
INSERT INTO `t_operalog` VALUES ('d6f6bc8ee032cf9641cc29a83bea5ea8', '下拉项管理', '下拉项树', '增加', '1', '[客服状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:31:10');
INSERT INTO `t_operalog` VALUES ('da8f7db041d57efed492e1e97047e281', '资源管理', '菜单树', '修改', '1', '[网站管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:14');
INSERT INTO `t_operalog` VALUES ('daa393c3488b5faed0c357c1ad8f3e65', '会员信用', '信用列表', '增加', '1', '[都是] 会员信用级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'addParameterCredit', 'CreditList_add', '超级管理员', '2014-02-18 16:11:50');
INSERT INTO `t_operalog` VALUES ('dafbfa5bf66f3593f9813d4e3590cc43', '下拉项管理', '下拉列表', '修改', '1', '[管理员] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:41:48');
INSERT INTO `t_operalog` VALUES ('ddb23d79f5cc97cd2be81f7ee3e596ac', '导航信息', '导航树', '增加', '1', '[dfsa] 导航信息已保存', 'com.glacier.netloan.service.website.WebsiteNavService', 'addNav', 'NavTree_add', '超级管理员', '2014-02-19 14:26:32');
INSERT INTO `t_operalog` VALUES ('df367c2e10c224b7009b9772d3ef935d', '资源管理', '菜单树', '修改', '1', '[广告管理] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:56:43');
INSERT INTO `t_operalog` VALUES ('e22bb51aa7b18ef66e897f0c0039ac69', '下拉项管理', '下拉列表', '修改', '1', '[内置] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-15 16:35:07');
INSERT INTO `t_operalog` VALUES ('e4270b631583a908f34269d3de96c2e3', '资源管理', '操作列表', '增加', '1', '[修改] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'addAction', 'ActionList_add', '超级管理员', '2014-02-19 16:29:56');
INSERT INTO `t_operalog` VALUES ('e43e83c7113ae00c7ec47429c10eaa47', '下拉项管理', '下拉列表', '修改', '1', '[自定义] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-17 10:42:04');
INSERT INTO `t_operalog` VALUES ('e452fd06942065eeaf7d34aaca1dbf33', '下拉项管理', '下拉列表', '删除', '1', '成功删除了[ 启用,关闭 ]下拉值', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'delOptgroupValue', 'OptgroupValueList_del', '超级管理员', '2014-02-15 16:38:12');
INSERT INTO `t_operalog` VALUES ('e47ef598f7865fc6ef00bd7ee05d0c89', '资源管理', '面板列表', '修改', '1', '[客服列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-15 14:37:22');
INSERT INTO `t_operalog` VALUES ('e5648d6c1d84c51dce5e463990b5f921', '客服服务', '客服列表', '修改', '1', '[ccce] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-18 16:42:14');
INSERT INTO `t_operalog` VALUES ('e5b9f3acab1488ba07e6a8688701893a', '会员积分', '积分列表', '增加', '1', '[的萨芬] 会员积分级别信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterIntegralService', 'addParameterIntegral', 'IntegralList_add', '超级管理员', '2014-02-18 16:39:45');
INSERT INTO `t_operalog` VALUES ('e9f41d480f49ed1cd4b65ebbbd718174', '下拉项管理', '下拉项树', '删除', '1', '[是否内置] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:33:57');
INSERT INTO `t_operalog` VALUES ('ea0eb02749af8511bba99736a3c2d1dd', '资源管理', '操作列表', '编辑', '1', '[分配角色] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:51:47');
INSERT INTO `t_operalog` VALUES ('eae5afc42fe4b5d3cca7d0d012f7d974', '资源管理', '菜单树', '增加', '1', '[申请额度] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'addMenu', 'MenuTree_add', '超级管理员', '2014-02-19 17:58:08');
INSERT INTO `t_operalog` VALUES ('ebbd189e7d9f8b5ac2140a12b2a775a2', '帮助中心', '帮助列表', '修改', '1', '[eeeddd] 帮助中心信息已修改', 'com.glacier.netloan.service.website.WebsiteHelpService', 'editWebsiteHelp', 'HelpList_edit', '超级管理员', '2014-02-19 10:03:45');
INSERT INTO `t_operalog` VALUES ('ebee8a19ef0600231334c3e55a9df0d8', '客服服务', '客服列表', '修改', '1', '[aaa] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-15 14:48:27');
INSERT INTO `t_operalog` VALUES ('eea891eb6a57bf3a28ee6bd10bff9aaf', '资源管理', '面板列表', '修改', '1', '[银行卡列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-19 16:27:59');
INSERT INTO `t_operalog` VALUES ('ef83b4120509cbaeaf5839c1471fc638', '招聘信息', '招聘列表', '增加', '1', '[sfd] 招聘管理信息已保存', 'com.glacier.netloan.service.website.WebsiteHiringService', 'addWebsiteHiring', 'HiringList_add', '超级管理员', '2014-02-19 13:56:54');
INSERT INTO `t_operalog` VALUES ('f56c550b3c5cd94ebddbf398537e81f0', '下拉项管理', '下拉项树', '删除', '1', '[公告状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:45');
INSERT INTO `t_operalog` VALUES ('f646b8a1d92ef556bb920f0621499f86', '下拉项管理', '下拉项树', '删除', '1', '[新闻状态] 下拉项信息已删除', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'delOptgroup', 'OptgroupTree_del', '超级管理员', '2014-02-15 16:38:47');
INSERT INTO `t_operalog` VALUES ('f82f3acbe23793e4ebd3e65177f7ac97', '会员信用', '信用列表', '修改', '1', '[地方] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:39:11');
INSERT INTO `t_operalog` VALUES ('f8cff7038bb5671dece789941d7222d7', '客服服务', '客服列表', '增加', '1', '[aa] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-18 16:41:02');
INSERT INTO `t_operalog` VALUES ('f9edca9490f673213c4166d947cac33f', '资源管理', '菜单树', '修改', '1', '[客服服务] 菜单信息已保存', 'com.glacier.netloan.service.system.MenuService', 'editMenu', 'MenuTree_edit', '超级管理员', '2014-02-17 14:57:02');
INSERT INTO `t_operalog` VALUES ('fa3c9603010c642291a5174dcd0ddf3c', '导航信息', '导航树', '删除', '1', '[是否] 导航信息已删除', 'com.glacier.netloan.service.website.WebsiteNavService', 'delNav', 'NavTree_del', '超级管理员', '2014-02-18 16:40:35');
INSERT INTO `t_operalog` VALUES ('fb3c59078e1aba362001cc571339eaa7', '资源管理', '面板列表', '修改', '1', '[银行卡列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-19 16:28:43');
INSERT INTO `t_operalog` VALUES ('fb41c808bb0d63b1e5f9e35b9fa19ea7', '客服服务', '客服列表', '删除', '1', '成功删除了[ ccce ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-02-18 16:42:22');
INSERT INTO `t_operalog` VALUES ('fb631ae0babd638461d2c561a8a13a65', '会员信用', '信用列表', '修改', '1', '[地方的] 会员信用级别信息已变更', 'com.glacier.netloan.service.basicdatas.ParameterCreditService', 'editParameterCredit', 'CreditList_edit', '超级管理员', '2014-02-18 16:39:17');
INSERT INTO `t_operalog` VALUES ('fcd501836d4f3058a1ad15c11fa7f57e', '资源管理', '操作列表', '编辑', '1', '[增加] 操作信息已保存', 'com.glacier.netloan.service.system.ActionService', 'editAction', 'ActionList_edit', '超级管理员', '2014-02-17 15:55:07');
INSERT INTO `t_operalog` VALUES ('ffe571f3412c10c256eff0f8772dee7a', '下拉项管理', '下拉列表', '修改', '1', '[自定义] 下拉项值信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'editOptgroupValue', 'OptgroupValueList_edit', '超级管理员', '2014-02-15 16:35:11');

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
INSERT INTO `t_panel` VALUES ('20814591aaa67351ab28198ec8531c80', '5b6eaabb2c3a020c4d85ab50d11ffd85', '友情列表', 'LinkList', '1');
INSERT INTO `t_panel` VALUES ('21gfdg1rgrh1dfhsjdfh124564sdf21d', 't110147c5e6c1e94ee70cc833aa7f5d3', '年龄列表', 'AgeList', '2');
INSERT INTO `t_panel` VALUES ('28fe18d693742ae7db094fc750715c46', '54d652799e07bb8be54483301a89ff90', '帮助列表', 'HelpList', '1');
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '6');
INSERT INTO `t_panel` VALUES ('34eg454c5e6c1e94ee70cc833asd87', 'sdeg454c5e6c1e94ee70cc833asd142', '积分列表', 'IntegralList', '5');
INSERT INTO `t_panel` VALUES ('37011217016636a0723462dbc81bf887', '91ca1b4b197688f21b68a72f69e09a8d', '管理员列表', 'UserList', '1');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '5');
INSERT INTO `t_panel` VALUES ('557cf8b2740e6792f517138703afb407', 'ac892df07f9087fb1c89ac968bb5f555', '操作日志列表', 'OperalogList', '1');
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('5cd4cb6d36559b7d7e3a022e53a3bd71', 'a652d3fe69c067cb94b73361351b8378', '新闻列表', 'NewsList', '1');
INSERT INTO `t_panel` VALUES ('780a15a12d2fc981cccb418dafce08b2', '4f1b6666b70be892469b6e93c1eb30ce', '导航树', 'NavTree', '1');
INSERT INTO `t_panel` VALUES ('7b6390143d9a9c234890391f475ef7c9', 'ae024ce004991607d5ae9e725d67cce8', '申请额度列表', 'AmountList', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('86d2ccad701f94c9e80d71557b1c62e6', '88ee044d59911b3b1a67ba4cdd0ee90d', '公告列表', 'AnnouncementList', '1');
INSERT INTO `t_panel` VALUES ('87gfdg1rgrh1dfhsjdfh124564sderbg', 'v465654c5e6c1e94ee70cc833asd142', '信用列表', 'CreditList', '3');
INSERT INTO `t_panel` VALUES ('93fc21dd1e7d69dd439c77c9e94e25af', 'e75a41ba4a2bc299e3b50a15580a103b', '客服列表', 'ServiceList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('a1d130de95607ffc00fb455c749cf1a1', 'ab01dd2ac38d920f691bbc65b7a4bfb2', '招聘列表', 'HiringList', '1');
INSERT INTO `t_panel` VALUES ('b8a03efe50a44d460983badb4be96eea', 'b34761b59816e63743643c6f179683a4', '广告列表', 'AdvertisementList', '1');
INSERT INTO `t_panel` VALUES ('e6784ccad10e3414b99b77b303a338c7', '93f0fcfa7cdff069d929723062b53211', '变量列表', 'VariablesList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
INSERT INTO `t_panel` VALUES ('f769a64bb571aa0c7ac269b807af4782', 'e42b98561176563f930d82c80b041ed8', '登录日志列表', 'LoginlogList', '1');
INSERT INTO `t_panel` VALUES ('swdf697aea23532eb8162f5ba1818c6f', 'de34654c5e6c1e94ee70cc833asd142', '地区树', 'AreaTree', '3');

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
INSERT INTO `t_parameter_age` VALUES ('25gtr54157cf483a790f4eea3der25', '创业期', '1', '29', null, null, null, null, '2014-01-21 15:13:28', null, null);
INSERT INTO `t_parameter_age` VALUES ('3f2sa343dg54f65fh54fh67h5sf4h5', '黄金岁月', '30', '40', null, null, null, null, '2014-01-21 15:13:26', null, null);
INSERT INTO `t_parameter_age` VALUES ('45dfdsf554f5sd4fsdf4s5df4sd5f4s', '成功人士', '41', '59', null, null, null, null, '2014-01-21 15:13:24', null, null);

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
INSERT INTO `t_parameter_area` VALUES ('2580884c5e6c1e94ee70cc833aa1c247', null, '广东', 'subsite1', null, '1', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('8740884c5e6c1e94ee70cc833aa1c123', '2580884c5e6c1e94ee70cc833aa1c247', '深圳', 'subsite1', null, '12', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('cd092470b03f7cad7a45dad4c9f6876b', '2580884c5e6c1e94ee70cc833aa1c247', '珠海', null, null, '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:21', null, null);
INSERT INTO `t_parameter_area` VALUES ('f6d7ea91dc3255d4d5efac64bb4923bd', 'cd092470b03f7cad7a45dad4c9f6876b', '香洲区', null, null, '141', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:19:54', null, null);
INSERT INTO `t_parameter_area` VALUES ('sdf2s2df1s2dg1ager521ger1ge2r1g', null, '广西', 'subsite1', null, '2', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('sdf3dsf3sd3g25s3dg2sdgsdg', 'sdf2s2df1s2dg1ager521ger1ge2r1g', '南宁', 'subsite1', null, '21', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('sdw0884c5e6c1e94ee70cc833aa1c2sd', '2580884c5e6c1e94ee70cc833aa1c247', '广州', 'subsite1', null, '13', null, null, null, null, null);

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
INSERT INTO `t_parameter_credit` VALUES ('125s754157cf483a790f4eea35200118', '一级', '1', '50', 'maque001.gif', null, null, '', null, null, null, null);
INSERT INTO `t_parameter_credit` VALUES ('2545745dsfsd4gsd5gs5dg8gsd54gyt', '二级', '51', '70', 'maque002.gif', null, null, '', null, null, null, null);
INSERT INTO `t_parameter_credit` VALUES ('354sdf454dsg54j5ytktku4y5u5ege5r', '三级', '71', '100', 'maque003.gif', null, null, '', null, null, null, null);
INSERT INTO `t_parameter_credit` VALUES ('457df5a5hrstj4tyk5je54g6er4g64g5', '四级', '101', '150', 'maque004.gif', null, null, '', null, null, null, null);
INSERT INTO `t_parameter_credit` VALUES ('9074203d753243f8be823ac411f6adc0', '啊的的', '33', '33', null, null, '33', '33似的', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 10:18:37', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 10:40:00');

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
INSERT INTO `t_parameter_integral` VALUES ('dcf785c13dabfeac6dc6ee0c610607b0', '三级积分', '101', '500', null, '2', '阿道夫的', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 10:35:39', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 10:38:58');
INSERT INTO `t_parameter_integral` VALUES ('er80884c5e6c1e94ee70cc833aa1c587', '一级积分', '0', '50', null, '1', null, null, null, null, null);
INSERT INTO `t_parameter_integral` VALUES ('gfd0884c5e6c1e94ee70cc833aa1c277', '二级积分', '51', '100', null, '2', null, null, null, null, null);

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
INSERT INTO `t_parameter_optgroup` VALUES ('0af82d4dabd9cb2b809f01578965e028', '524a5f048b92584ff849a206f3c53076', 'help', '帮助中心', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:57:41', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('113afb2ecac88fe851ad501c53b7d82b', null, 'common', '公用下拉项', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:29:29', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', '113afb2ecac88fe851ad501c53b7d82b', 'status', '状态', null, null, '1', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:37:23');
INSERT INTO `t_parameter_optgroup` VALUES ('28ee70d89cd44ab3e8f6a54929a47952', '0af82d4dabd9cb2b809f01578965e028', 'webHelpType', '帮助中心类型', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:59:38', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('2rtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:05:27');
INSERT INTO `t_parameter_optgroup` VALUES ('3de467b04ce8984ae48ba243eb25ffb2', null, 'basicdatas', '参数管理', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:15:47', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('524a5f048b92584ff849a206f3c53076', null, 'website', '网站管理', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 10:56:19', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('7114c42efa5349f4c8874787fde91633', 'bd88aee43efe41a6ebd10b263fa29ed1', 'formType', '表单类型', null, null, '311', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:19:08', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', 'ss34g1rgrh1dfhsjdfh124564sdf21d', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('bd88aee43efe41a6ebd10b263fa29ed1', '3de467b04ce8984ae48ba243eb25ffb2', 'variables', '系统变量', null, null, '31', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:18:18', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('fdf78bcc980b29a21a65131eab1c1b38', '113afb2ecac88fe851ad501c53b7d82b', 'builtin', '内置', null, null, '11', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:34:53', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('ss34g1rgrh1dfhsjdfh124564sdf21d', '2rtfdg1rgrh1dfhsjdfh124564sdf21d', 'user', '用户设置', null, null, '1', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:25');

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
INSERT INTO `t_parameter_optgroup_value` VALUES ('174cea1013644ae5a4a78fe749203f99', '87e805fcf0c779b8f57fde22d819e2db', '3333', '3333', null, '3', '3', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:26:20', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('1a41da9325b5db271741f2245055095b', '28ee70d89cd44ab3e8f6a54929a47952', 'borrow', '借款', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:01:18', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('1ed2d672131c69ea00a61b0edd2d5358', 'fdf78bcc980b29a21a65131eab1c1b38', 'builtin', '内置', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:00');
INSERT INTO `t_parameter_optgroup_value` VALUES ('239294f5e95b8d95911c4227eb2473e4', 'fdf78bcc980b29a21a65131eab1c1b38', 'custom', '自定义', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 16:31:32', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:42:04');
INSERT INTO `t_parameter_optgroup_value` VALUES ('2c663921507de7b121d37b460d65b5c4', 'fdf78bcc980b29a21a65131eab1c1b38', 'admin', '管理员', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:15:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 10:41:48');
INSERT INTO `t_parameter_optgroup_value` VALUES ('3sfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'enable', '启用', 'enable', '1', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:47');
INSERT INTO `t_parameter_optgroup_value` VALUES ('41ad6336a2e35dd9d67ed0ece74ad155', '7114c42efa5349f4c8874787fde91633', 'input', '输入框', 'enable', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:53:45', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('4adsadsafasf3215s4d5g456fd8df45', '87e805fcf0c779b8f57fde22d819e2db', 'women', '女', 'enable', '1', '', null, null, null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('5122f4929b14499ebd97f7f99552d5c7', '28ee70d89cd44ab3e8f6a54929a47952', 'fund', '基金', 'enable', '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:27', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('5dfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'disable', '禁用', 'enable', '2', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-17 14:42:50');
INSERT INTO `t_parameter_optgroup_value` VALUES ('6dsdsdg1rgrh1dfhsjdfh1245df21d25', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'enable', '2', '', null, null, null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('85db75ec028f7cbbb412331e8c035470', '7114c42efa5349f4c8874787fde91633', 'textarea', '文本框', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:54:06', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('a99e2b138ca844778977da4e68afec36', '87e805fcf0c779b8f57fde22d819e2db', '3', '3', null, null, '3', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:25:29', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('cef639d80ab89a98df7301fc8b084d32', '28ee70d89cd44ab3e8f6a54929a47952', 'invest', '投资', 'enable', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 11:02:01', null, null);

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
INSERT INTO `t_parameter_system_variables` VALUES ('25cc3adf85ff3db2971ad5d93325162b', '4', '4', '4', '4', 'input', '4', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:13:40', null, null);
INSERT INTO `t_parameter_system_variables` VALUES ('49d0e68d902952f1caa4669829455790', '34', '343', '34', '34', 'input', '34', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 16:22:26', null, null);
INSERT INTO `t_parameter_system_variables` VALUES ('4css921507de7b121d37b460d65b5g', '参数说明', '输入提示', '参数值', '变量名', 'input', '测试数据', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 15:22:26', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 15:22:28');

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
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'test', '测试角色', 'custom', '看看', '8b25651c2d896297530b64e4b80ec503', '2014-02-10 00:00:00');
INSERT INTO `t_role` VALUES ('96b0c94ab19afbf40b57e7b91bfed673', 'wer', '角色测试666', 'custom', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-10 00:00:00');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'admin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16 00:00:00');

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
INSERT INTO `t_user` VALUES ('21da4f6ca70201996e77aa7fda80db3d', 's', 's', 's', null, 'enable', 'custom', 's', null, 's', '2014-02-12 17:35:02', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('50a3309800345a2984f12279515e001b', 'd', 'd', 'd', null, 'enable', 'custom', 'd', null, 'd', '2014-02-12 17:35:06', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('5b7fd153d75b63ad21fdf11bd233f684', 'sdf', 'w', '6bc37158d9839e1c75fac0a00ed55120c3e4beb3', 'f75071ba2c27d397', 'enable', 'custom', 'wer', null, 'wer', null, null, '0', '8b25651c2d896297530b64e4b80ec503', '2014-02-17 00:00:00');
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'admin', 'admin@glacier.cn', null, null, '2014-02-20 14:57:40', '127.0.0.1[本地]', '102', '8b25651c2d896297530b64e4b80ec503', '2014-01-16 00:00:00');
INSERT INTO `t_user` VALUES ('af', 'qqqqqqqqqqq', 'afdddd', 'adf', 'asfd', 'enable', 'custom', 'ddd', null, 'dd', '2014-02-12 16:55:54', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('ca1c01ab0f77133531b891cba8bd2670', 'dd', 'dd', 'dd', null, 'enable', 'custom', 'dd', null, 'dd', '2014-02-12 17:49:48', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');

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
-- Table structure for `t_vip`
-- ----------------------------
DROP TABLE IF EXISTS `t_vip`;
CREATE TABLE `t_vip` (
  `vip_id` varchar(32) NOT NULL COMMENT '���ID',
  `member_id` varchar(32) NOT NULL COMMENT '��ⵥ��',
  `vip_level` int(11) DEFAULT NULL COMMENT '�ֿ�ID',
  `vip_integral` float DEFAULT NULL COMMENT '�������',
  `vip_start` datetime DEFAULT NULL,
  `vip_end` datetime DEFAULT NULL,
  `creater` varchar(32) DEFAULT NULL,
  `creater_time` datetime DEFAULT NULL,
  `updater` varchar(32) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`vip_id`),
  KEY `FK_t_vip_t_member_member_id` (`member_id`),
  CONSTRAINT `t_vip_ibfk_1` FOREIGN KEY (`member_id`) REFERENCES `t_member` (`member_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_vip
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
INSERT INTO `t_website_announcement` VALUES ('a742a6d623877125f6f0bc68d616d111', '元宵节快乐', '聚餐去', 'enable', '3', '3', null, '聚餐可以带家属~', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:41:24', null, null);
INSERT INTO `t_website_announcement` VALUES ('e5757e62589e9c86d5d754f787670cf3', '情人节快乐', '提前两个小时下班。', 'enable', '3', '3', null, '大家情人节快乐。', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:21:16', null, null);
INSERT INTO `t_website_announcement` VALUES ('sd5f4sd5f454sd4f5sdf45sd4f', '元旦快乐', '元旦到了 大家新年快乐', 'enable', '1', null, '1', '1', null, null, null, null);

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
INSERT INTO `t_website_help` VALUES ('24976b23bc71038f4af232a795acb401', 'eeeddd', 'eeedd大师傅撒爱上飞的萨芬撒地方的萨芬的萨芬的', 'borrow', 'enable', 'eeedd', '23', 'eeedd的', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 13:39:37', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 11:04:08');
INSERT INTO `t_website_help` VALUES ('4dce26c18a0440a54ad378290078f1e2', 'sfew', 'sdf', 'borrow', 'disable', 'sd', '23', 'as', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 13:40:43', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:18:11');
INSERT INTO `t_website_help` VALUES ('f1c92869822317dd7a62d528307eb503', 'dd', 'a', 'invest', 'enable', '', '32', 'sadf', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:52:05', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:52:24');

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
INSERT INTO `t_website_hiring` VALUES ('7777a1a9f65a86675dcc82ca4f574f7b', 'dsa', 'ds', 'enable', 'asdf', '23', 'asdasdf', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:53:13', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:56:29');
INSERT INTO `t_website_hiring` VALUES ('86d2cabfc0253442feb472f3917f745d', 'dddee', 'dddee', 'disable', 'dd', '32', 'dd', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 14:58:17', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 14:58:25');
INSERT INTO `t_website_hiring` VALUES ('sf', 'asdfs', 'asfds', 'enable', 'asdf', '32', 'sf', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:25:29', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 14:58:04');

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
INSERT INTO `t_website_news` VALUES ('c7b04e5bb2c91cd2f31598e65c38359e', '冷空气', null, 'enable', '4', '4', '4', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:54', null, null);
INSERT INTO `t_website_news` VALUES ('d2321b66d4cdde4bb7f961bbcec9dfc6', '情人节主题', null, 'enable', '3', '3', '3', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:40', null, null);

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
INSERT INTO `t_website_service` VALUES ('0fdd526f809b5733dd7741749583e38a', 'aa', 'aa', null, 'enable', 'asdf', '3', 'asdf', '8b25651c2d896297530b64e4b80ec503', '2014-02-18 16:41:02', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:25:52');
INSERT INTO `t_website_service` VALUES ('4c7b801aa8aab3f79e5b91dcd503b8dd', 'aaa', 'aaa', null, 'enable', 'aaa', '44', 'aaa', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:47:25', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:25:55');
INSERT INTO `t_website_service` VALUES ('5af9bb6e683b71bbcf4cf596de52459d', 'fs', '2342334', null, 'enable', 'dfs', '13', 'sdf', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:50:11', '8b25651c2d896297530b64e4b80ec503', '2014-02-20 14:25:57');
INSERT INTO `t_website_service` VALUES ('85b930a8593d12999a2562577fd38fc1', 'dddeee', '84154545', null, 'enable', 'dd', '99', 'dd', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:45:23', '8b25651c2d896297530b64e4b80ec503', '2014-02-19 13:48:25');
