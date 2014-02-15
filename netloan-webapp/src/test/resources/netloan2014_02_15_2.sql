/*
Navicat MySQL Data Transfer

Source Server         : yuzexu
Source Server Version : 50513
Source Host           : localhost:3306
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50513
File Encoding         : 65001

Date: 2014-02-15 14:53:44
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
  `disabled` enum('Enabled','Disabled') DEFAULT NULL,
  `method` varchar(100) DEFAULT NULL,
  `order_num` int(10) unsigned DEFAULT NULL,
  `remark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.news_mgr.news.editNews();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.system_mgr.role_mgr.role.editRole();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eads', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.age_mgr.age.addAge();', '2', null);
INSERT INTO `t_action` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', '');
INSERT INTO `t_action` VALUES ('2213139f0e736a796d5ac4bdd78332', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.integral_mgr.integral.delIntegral();', '3', null);
INSERT INTO `t_action` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action` VALUES ('25860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.credit_mgr.credit.addCredit();', '1', null);
INSERT INTO `t_action` VALUES ('28060139f0e736a796d5ac4bdd78dawx', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.age_mgr.age.editAge();', '3', null);
INSERT INTO `t_action` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', '');
INSERT INTO `t_action` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.link_mgr.link.editLink();', '2', '');
INSERT INTO `t_action` VALUES ('32740020a8816f83b38564a64eee4278', 'e42b98561176563f930d82c80b041ed8', 'f769a64bb571aa0c7ac269b807af4782', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.system_mgr.loginlog_mgr.loginlog.delLoginlog();', '1', '');
INSERT INTO `t_action` VALUES ('34560139f0e736a796d5ac4bdd78344', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.integral_mgr.integral.addIntegral();', '1', null);
INSERT INTO `t_action` VALUES ('35860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.credit_mgr.credit.editCredit();', '2', null);
INSERT INTO `t_action` VALUES ('38060139f0e736a796d5ac4bdd78escs', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.age_mgr.age.delAge();', '4', null);
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.delPanel();', '4', '');
INSERT INTO `t_action` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action` VALUES ('4586054157cf483a790f4eea35dsf6f6', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.credit_mgr.credit.delCredit();', '3', null);
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroupValue();', '2', '');
INSERT INTO `t_action` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.service_mgr.service.addService();', '1', '');
INSERT INTO `t_action` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', '');
INSERT INTO `t_action` VALUES ('56890139f0e736a796d5ac4bdd78211', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.integral_mgr.integral.editIntegral();', '2', null);
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroupValue();', '3', '');
INSERT INTO `t_action` VALUES ('58660bccb69289b1f0299d9a664931d3', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.system_mgr.user_mgr.user.editUser();', '2', '');
INSERT INTO `t_action` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.service_mgr.service.editService();', '2', '');
INSERT INTO `t_action` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.link_mgr.link.delLink();', '3', '');
INSERT INTO `t_action` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.role_mgr.role.addRole();', '1', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.res_mgr.res.addMenu();', '2', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.res_mgr.res.addPanel();', '2', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.editMenu();', '3', '');
INSERT INTO `t_action` VALUES ('6ebb0c66afb41e8cf0d890ea46ab54ca', 'ac892df07f9087fb1c89ac968bb5f555', '557cf8b2740e6792f517138703afb407', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.system_mgr.operalog_mgr.operalog.delOperalog();', '1', '');
INSERT INTO `t_action` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', '');
INSERT INTO `t_action` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.news_mgr.news.addNews();', '1', '');
INSERT INTO `t_action` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', '');
INSERT INTO `t_action` VALUES ('84fd30c2b03282a32dd9e0d552130442', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.user_mgr.user.addUser();', '1', '');
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.system_mgr.role_mgr.role.delRole();', '3', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.editAction();', '3', '');
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroupValue();', '1', '');
INSERT INTO `t_action` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', '');
INSERT INTO `t_action` VALUES ('9f2bde7246ca2ad13dc64bbc5f4efb3d', '91ca1b4b197688f21b68a72f69e09a8d', '37011217016636a0723462dbc81bf887', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.system_mgr.user_mgr.user.delUser();', '3', '');
INSERT INTO `t_action` VALUES ('a27471575ce1f86d15e43a163b2195dd', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.link_mgr.link.addLink();', '1', '');
INSERT INTO `t_action` VALUES ('a34eddbd653c462a87afe23eab0c6391', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.advertisement_mgr.advertisement.addAdvertisement();', '1', '');
INSERT INTO `t_action` VALUES ('ad2388e634c5e313d1c71eecdc849cb6', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.announcement_mgr.announcement.delAnnouncement();', '3', '');
INSERT INTO `t_action` VALUES ('b0648b51ebbf9831702a3f616a75ca3a', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.news_mgr.news.delNews();', '3', '');
INSERT INTO `t_action` VALUES ('b0f605139653554aa66cf38a78fe42ba', '54eb754157cf483a790f4eea35200118', 'eb07f8ec54989seb66e4e8a1a0f21604', '列表', 'list', '', 'Button', 'Disabled', '', '1', '');
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.delMenu();', '4', '');
INSERT INTO `t_action` VALUES ('b7e88da8c1dec3668ca66340dabee03f', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '授权', 'auth', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.role_mgr.role.actionAuth();', '4', null);
INSERT INTO `t_action` VALUES ('ba99418ca949feedcedfa04396235827', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.service_mgr.service.delService();', '3', '');
INSERT INTO `t_action` VALUES ('c50c979b621ff41f0677cdf02e29648b', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.hiring_mgr.hiring.editHiring();', '2', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.editPanel();', '3', '');
INSERT INTO `t_action` VALUES ('e450b55ffaeca413fdd6551591993893', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.announcement_mgr.announcement.addAnnouncement();', '1', '');
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.res_mgr.res.addAction();', '2', '');
INSERT INTO `t_action` VALUES ('e637975493d65070499ebfb8b15b37f6', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.help_mgr.help.editHelp();', '2', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.delAction();', '4', '');
INSERT INTO `t_action` VALUES ('fbbda7cc81811077445c4bc94c53ce08', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.nav_mgr.nav.editNav();', '2', '');
INSERT INTO `t_action` VALUES ('fbfded9986f0ad39d43d789b7594463d', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.hiring_mgr.hiring.delHiring();', '3', '');
INSERT INTO `t_action` VALUES ('sd54fsd4fsd2sg45r4hrtj2fg1j2g1', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.area_mgr.area.delArea();', '3', null);

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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '91ca1b4b197688f21b68a72f69e09a8d', 'UserList_add,UserList_edit,UserList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ac892df07f9087fb1c89ac968bb5f555', 'OperalogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd503136bdab7bbdc8d09f3bbb28fa979', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'de34654c5e6c1e94ee70cc833asd142', 'AreaTree_add,AreaTree_edit,AreaTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e42b98561176563f930d82c80b041ed8', 'LoginlogList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e75a41ba4a2bc299e3b50a15580a103b', 'ServiceList_add,ServiceList_edit,ServiceList_del');
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
INSERT INTO `t_loginlog` VALUES ('1d045ccdfbfadad533c5baba20e0bf7c', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('2e78987eca033cef0ca2fae280da31d7', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3212d5335a262256c78aa39e7f23927e', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('3a8692b9575c844cc9fa0235d58665fd', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('413c3629b40d8d9f00ea1e57a82e8a39', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('5e53a76c737e61b0bbf2cb8542338317', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('6880b6c85c31834d370a6cd2e920ef33', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('70593c7e6f808fa37b583ec5c17901c1', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7561784bc574f2ca26590e37120fb3f5', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('7a46ab663e5154e452df2bb8cdc0bce0', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('81a274ddbebf27364d5aaff8a572f40d', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('81deeedf62470041d1bcf0918f71f6a2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('8bc78abcacf5fc31b8b55926b30e73db', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b2a071325c710997ba4d3ac4d4fe6eb', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('9b52f0928e9ae98006f1a4f0bcf59f44', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('asfdasdf', '8b25651c2d896297530b64e4b80ec503', 'asdf', '2014-02-12', 'afd', 'fd', 'adfs');
INSERT INTO `t_loginlog` VALUES ('ba74229738c5e2aa64679fcedee637fa', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('bdf6e4c2b430b8a5495c1e3cc00fa6e8', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-13', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('c4650a348b8778e51de50b4bfaa362f2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('cdd6d49fc805c3ca218c56a842a40705', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('da4f67ded4052636058e1b4166991c36', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('ddfdfasd', '8b25651c2d896297530b64e4b80ec503', 'adsf', '2014-02-12', 'adsf', 'fd', 'adsf');
INSERT INTO `t_loginlog` VALUES ('de88b1152dde86d1b9ee26870295be19', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('e84c12dfc104bd19948cc2183a57cba2', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-15', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f8442e87c0cc3de96d99f65502cde5ca', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);
INSERT INTO `t_loginlog` VALUES ('f9eb726c12e4168f40cf3b9a231c17ae', '8b25651c2d896297530b64e4b80ec503', '超级管理员', '2014-02-12', '127.0.0.1[本地]', null, null);

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
INSERT INTO `t_menu` VALUES ('4f1b6666b70be892469b6e93c1eb30ce', 'a60cca184eff20fdce88b3f1ab5a9cce', 'nav', '导航信息', 'icon-standard-application-view-list', '/do/nav/index.htm', '9', '');
INSERT INTO `t_menu` VALUES ('54d652799e07bb8be54483301a89ff90', 'a60cca184eff20fdce88b3f1ab5a9cce', 'help', '帮助中心', 'icon-hamburg-config', '/do/help/index.htm', '16', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '12', null);
INSERT INTO `t_menu` VALUES ('5b6eaabb2c3a020c4d85ab50d11ffd85', 'a60cca184eff20fdce88b3f1ab5a9cce', 'link', '友情链接', 'icon-hamburg-world', '/do/link/index.htm', '13', '');
INSERT INTO `t_menu` VALUES ('88ee044d59911b3b1a67ba4cdd0ee90d', 'a60cca184eff20fdce88b3f1ab5a9cce', 'announcement', '公告管理', 'icon-standard-feed', '/do/announcement/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('91ca1b4b197688f21b68a72f69e09a8d', '16ac1df11de350c61722dc7b98cecca7', 'user', '管理员设置', 'icon-standard-user-orange', '/do/user/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('a60cca184eff20fdce88b3f1ab5a9cce', null, 'website', '网站管理', 'icon-standard-color-wheel', '', '10', '');
INSERT INTO `t_menu` VALUES ('a652d3fe69c067cb94b73361351b8378', 'a60cca184eff20fdce88b3f1ab5a9cce', 'news', '新闻管理', 'icon-standard-monitor', '/do/news/index.htm', '12', '');
INSERT INTO `t_menu` VALUES ('ab01dd2ac38d920f691bbc65b7a4bfb2', 'a60cca184eff20fdce88b3f1ab5a9cce', 'hiring', '招聘信息', 'icon-hamburg-customers', '/do/hiring/index.htm', '17', '');
INSERT INTO `t_menu` VALUES ('ac892df07f9087fb1c89ac968bb5f555', '16ac1df11de350c61722dc7b98cecca7', 'operalog', '操作日志', 'icon-standard-application-view-detail', '/do/operalog/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('b34761b59816e63743643c6f179683a4', 'a60cca184eff20fdce88b3f1ab5a9cce', 'advertisement', '广告管理', 'icon-standard-bell', '/do/advertisement/index.htm', '11', '');
INSERT INTO `t_menu` VALUES ('d503136bdab7bbdc8d09f3bbb28fa979', null, 'info', '信息管理', 'icon-standard-application-view-tile', '', '10', '');
INSERT INTO `t_menu` VALUES ('de34654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'area', '地区管理', 'icon-hamburg-link', '/do/area/index.htm', '23', '');
INSERT INTO `t_menu` VALUES ('e42b98561176563f930d82c80b041ed8', '16ac1df11de350c61722dc7b98cecca7', 'loginlog', '登录日志', 'icon-standard-application-view-list', '/do/loginlog/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'role', '角色管理', 'icon-standard-status-online', '/do/role/index.htm', '11', null);
INSERT INTO `t_menu` VALUES ('e75a41ba4a2bc299e3b50a15580a103b', 'a60cca184eff20fdce88b3f1ab5a9cce', 'service', '客服服务', 'icon-cologne-customers', '/do/service/index.htm', '15', '');
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
INSERT INTO `t_operalog` VALUES ('05e93db92c2533184902b7c9c7b3cfdd', '角色管理', '角色列表', '修改', '0', '英文名称重复，请重新填写!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('0e0a7eed1cc843c3ae59dd5686e9ec28', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:32:27');
INSERT INTO `t_operalog` VALUES ('13ad4ee4478a840d62d4068766f87fc3', '角色管理', '角色列表', '修改', '1', '[角色测试666] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('167ee38b8285a299f5186cb2ad1336cb', '客服服务', '客服列表', '增加', '1', '[dsd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:49:28');
INSERT INTO `t_operalog` VALUES ('1988921321b14bb27d06e89440043d9f', '下拉项管理', '下拉项树', '增加', '1', '[招聘管理状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:34:22');
INSERT INTO `t_operalog` VALUES ('2a9c3044581a19bff9563a2d2681bb57', '角色管理', '角色列表', '授权', '1', '权限信息已保存!', 'com.glacier.netloan.service.system.AuthorityService', 'saveRoleAuths', 'RoleList_auth', '超级管理员', '2014-02-15 14:40:48');
INSERT INTO `t_operalog` VALUES ('2acc3d059f1873832653a08f0762819a', '下拉项管理', '下拉项树', '修改', '1', '[是否内置] 下拉项信息已修改', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'editOptgroup', 'OptgroupTree_edit', '超级管理员', '2014-02-15 10:26:11');
INSERT INTO `t_operalog` VALUES ('622394c607f92bc566d43a62355fc9b9', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:34:48');
INSERT INTO `t_operalog` VALUES ('6c3db1897709cca96955530cb5c0d879', '客服服务', '客服列表', '增加', '1', '[ddd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:45:23');
INSERT INTO `t_operalog` VALUES ('6f6fccf692e120b84e725fdae846ed8a', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:52');
INSERT INTO `t_operalog` VALUES ('86be699db942e872b26528d9cbd1de4f', '角色管理', '角色列表', '修改', '1', '[角色测试] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10 00:00:00');
INSERT INTO `t_operalog` VALUES ('8b2016a37312258a004fad342f5f5e3f', '下拉项管理', '下拉列表', '增加', '1', '[启用] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:32:01');
INSERT INTO `t_operalog` VALUES ('a6d508f6570a1ba753dce9bcdbde4dd5', '客服服务', '客服列表', '修改', '1', '[ccc] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-15 14:48:38');
INSERT INTO `t_operalog` VALUES ('a6fa5b99fbee19112c68cd8080a7da97', '下拉项管理', '下拉项树', '增加', '1', '[帮助中心状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:33:47');
INSERT INTO `t_operalog` VALUES ('b282036ce67eb0ddc7ff82d7dadfe085', '下拉项管理', '下拉项树', '增加', '1', '[是否内置] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 10:06:27');
INSERT INTO `t_operalog` VALUES ('c0a2705925a0d4044ed0a24cb2376f84', '客服服务', '客服列表', '增加', '1', '[asf] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:47:25');
INSERT INTO `t_operalog` VALUES ('c1828fdbd8c349533c6ebefecd35fcad', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:12');
INSERT INTO `t_operalog` VALUES ('c31cc57af39f8eed483d974b015d388c', '客服服务', '客服列表', '删除', '1', '成功删除了[ sd,dsd ]操作', 'com.glacier.netloan.service.website.WebsiteServiceService', 'delWebsiteService', 'ServiceList_del', '超级管理员', '2014-02-15 14:51:38');
INSERT INTO `t_operalog` VALUES ('c46a02f4149d6b6ff2632947481e3d0c', '客服服务', '客服列表', '增加', '1', '[sd] 客服信息已保存', 'com.glacier.netloan.service.website.WebsiteServiceService', 'addWebsiteService', 'ServiceList_add', '超级管理员', '2014-02-15 14:49:38');
INSERT INTO `t_operalog` VALUES ('c7ee5398cd2cba9329c55ebbf49d3002', '下拉项管理', '下拉列表', '增加', '1', '[关闭] 下拉项值信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupValueService', 'addOptgroupValue', 'OptgroupValueList_add', '超级管理员', '2014-02-15 14:35:28');
INSERT INTO `t_operalog` VALUES ('d6f6bc8ee032cf9641cc29a83bea5ea8', '下拉项管理', '下拉项树', '增加', '1', '[客服状态] 下拉项信息已保存', 'com.glacier.netloan.service.basicdatas.ParameterOptgroupService', 'addOptgroup', 'OptgroupTree_add', '超级管理员', '2014-02-15 14:31:10');
INSERT INTO `t_operalog` VALUES ('e47ef598f7865fc6ef00bd7ee05d0c89', '资源管理', '面板列表', '修改', '1', '[客服列表] 面板信息已保存', 'com.glacier.netloan.service.system.PanelService', 'editPanel', 'PanelList_edit', '超级管理员', '2014-02-15 14:37:22');
INSERT INTO `t_operalog` VALUES ('ebee8a19ef0600231334c3e55a9df0d8', '客服服务', '客服列表', '修改', '1', '[aaa] 客服信息已修改', 'com.glacier.netloan.service.website.WebsiteServiceService', 'editWebsiteService', 'ServiceList_edit', '超级管理员', '2014-02-15 14:48:27');

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
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('86d2ccad701f94c9e80d71557b1c62e6', '88ee044d59911b3b1a67ba4cdd0ee90d', '公告列表', 'AnnouncementList', '1');
INSERT INTO `t_panel` VALUES ('87gfdg1rgrh1dfhsjdfh124564sderbg', 'v465654c5e6c1e94ee70cc833asd142', '信用列表', 'CreditList', '3');
INSERT INTO `t_panel` VALUES ('93fc21dd1e7d69dd439c77c9e94e25af', 'e75a41ba4a2bc299e3b50a15580a103b', '客服列表', 'ServiceList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('a1d130de95607ffc00fb455c749cf1a1', 'ab01dd2ac38d920f691bbc65b7a4bfb2', '招聘列表', 'HiringList', '1');
INSERT INTO `t_panel` VALUES ('b8a03efe50a44d460983badb4be96eea', 'b34761b59816e63743643c6f179683a4', '广告列表', 'AdvertisementList', '1');
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
INSERT INTO `t_parameter_credit` VALUES ('125s754157cf483a790f4eea35200118', '1级', '0', '50', 'maque001.gif', null, null, null, null, null, null, null);
INSERT INTO `t_parameter_credit` VALUES ('2545745dsfsd4gsd5gs5dg8gsd54gyt', '2级', '51', '70', 'maque002.gif', null, null, null, null, null, null, null);
INSERT INTO `t_parameter_credit` VALUES ('354sdf454dsg54j5ytktku4y5u5ege5r', '3级', '71', '100', 'maque003.gif', null, null, null, null, null, null, null);
INSERT INTO `t_parameter_credit` VALUES ('457df5a5hrstj4tyk5je54g6er4g64g5', '4级', '101', '150', 'maque004.gif', null, null, null, null, null, null, null);

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
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac334', '4717e3b3b39913de6ac3c5e22464851a', 'webNewsStatus', '新闻状态', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 13:58:59', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('1bf27bce9c73b22e9822fb85380ac347', 'c809cc2a7ceff46b89da96c88ff148d9', 'status', '下拉值状态', null, null, '1', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:06:14');
INSERT INTO `t_parameter_optgroup` VALUES ('3454g1rgrh1dfhsjdfh124564sefdsf5', '4717e3b3b39913de6ac3c5e22464851a', 'webAnnStatus', '公告状态', null, null, '3', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 14:07:16');
INSERT INTO `t_parameter_optgroup` VALUES ('38a3c72352f2430be0b4cae573056b53', 'ss34g1rgrh1dfhsjdfh124564sdf21d', 'builtin', '是否内置', null, null, '14', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 10:06:27', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 10:26:11');
INSERT INTO `t_parameter_optgroup` VALUES ('46bcdd8e9d5e88d577aa11db1749fbfe', '4717e3b3b39913de6ac3c5e22464851a', 'webServiceStatus', '客服状态', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:31:10', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('4717e3b3b39913de6ac3c5e22464851a', null, 'website', '网站管理', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-12 14:03:36', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:05:45');
INSERT INTO `t_parameter_optgroup` VALUES ('87e805fcf0c779b8f57fde22d819e2db', 'ss34g1rgrh1dfhsjdfh124564sdf21d', 'sex', '性别', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:51', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('c682f5438ce8a04ead5d230fd607c653', '4717e3b3b39913de6ac3c5e22464851a', 'webHiringStatus', '招聘管理状态', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:34:22', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('c7230f30b63bf38de1acdf02d61a72e2', '4717e3b3b39913de6ac3c5e22464851a', 'webHelpStatus', '帮助中心状态', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:33:47', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('c809cc2a7ceff46b89da96c88ff148d9', null, 'basicdatas', '参数管理', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:05:19', null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('frtfdg1rgrh1dfhsjdfh124564sdf21d', null, 'system', '系统设置', null, null, '1', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:05:27');
INSERT INTO `t_parameter_optgroup` VALUES ('ss34g1rgrh1dfhsjdfh124564sdf21d', 'frtfdg1rgrh1dfhsjdfh124564sdf21d', 'user', '用户设置', null, null, '1', '', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:11:25');

-- ----------------------------
-- Table structure for `t_parameter_optgroup_value`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup_value`;
CREATE TABLE `t_parameter_optgroup_value` (
  `optgroup_value_id` varchar(32) NOT NULL,
  `optgroup_id` varchar(32) DEFAULT NULL,
  `optgroup_value_code` varchar(50) DEFAULT NULL,
  `optgroup_value_name` varchar(50) DEFAULT NULL,
  `status` enum('Enabled','Disabled') DEFAULT NULL,
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
INSERT INTO `t_parameter_optgroup_value` VALUES ('0318d7de437b8d7e2beb50813e16f0da', 'c7230f30b63bf38de1acdf02d61a72e2', 'Enabled', '启用', 'Enabled', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:35:52', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('118f1e638d1047dad63c4705e19c2747', '46bcdd8e9d5e88d577aa11db1749fbfe', 'Enabled', '启用', 'Enabled', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:32:01', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('122adce40806818efacf0279e67a3a7b', 'c682f5438ce8a04ead5d230fd607c653', 'Disabled', '关闭', 'Enabled', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:35:12', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('2d6c3ca8060304322a52b2b98c5997da', '3454g1rgrh1dfhsjdfh124564sefdsf5', 'Enabled', '启用', 'Enabled', '1', 'webAnnStatus', '8b25651c2d896297530b64e4b80ec503', '2014-02-12 14:11:53', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('3a739779081c04c9510a4f496fc1226e', '46bcdd8e9d5e88d577aa11db1749fbfe', 'Disabled', '关闭', 'Enabled', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:32:27', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('4ef6f32bd33c5b98f6d1881f956d30f7', 'c7230f30b63bf38de1acdf02d61a72e2', 'Disabled', '关闭', 'Enabled', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:35:28', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('63f27f4b68f056166575db1c249a3645', '3454g1rgrh1dfhsjdfh124564sefdsf5', 'Disabled', '关闭', 'Enabled', '2', 'webAnnStatus', '8b25651c2d896297530b64e4b80ec503', '2014-02-12 14:12:20', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('a084481c979aec9b7d0bf55b741b5f5d', '1bf27bce9c73b22e9822fb85380ac334', 'Enabled', '启用', 'Enabled', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 14:37:51', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('a762d14e3f8eeba3022fab49edcf925d', '38a3c72352f2430be0b4cae573056b53', 'notBuiltin', '不内置', 'Enabled', '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 10:07:44', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('b789e95a2d88130e30e210f129952049', '38a3c72352f2430be0b4cae573056b53', 'builtin', '内置', 'Enabled', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 10:07:16', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('cde574162ea38534501da7138ed2303e', '1bf27bce9c73b22e9822fb85380ac334', 'Disabled', '关闭', 'Enabled', '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 14:38:09', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('dsfsaf1231452112121525as5fsdf454', '1bf27bce9c73b22e9822fb85380ac347', 'Enabled', '启用', 'Enabled', '1', '', null, null, null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('eb7f26e19d45e79d42f5ce29c068deeb', 'c682f5438ce8a04ead5d230fd607c653', 'Enabled', '启用', 'Enabled', '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:34:48', null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('sadsadsafasf3215s4d5g456fd8df45', '87e805fcf0c779b8f57fde22d819e2db', 'women', '女', 'Enabled', '1', '', null, null, null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('sdfs2d1f32sd1f2sd1f2sd1f256565sd', '1bf27bce9c73b22e9822fb85380ac347', 'Disabled', '关闭', 'Enabled', '2', '', null, null, null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('sdsdsdg1rgrh1dfhsjdfh1245df21d25', '87e805fcf0c779b8f57fde22d819e2db', 'man', '男', 'Enabled', '2', '', null, null, null, null);

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
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'test', '测试角色', null, '看看', '8b25651c2d896297530b64e4b80ec503', '2014-02-10 00:00:00');
INSERT INTO `t_role` VALUES ('96b0c94ab19afbf40b57e7b91bfed673', 'wer', '角色测试666', null, '', '8b25651c2d896297530b64e4b80ec503', '2014-02-10 00:00:00');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'builtin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16 00:00:00');

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
  `status` varchar(20) NOT NULL,
  `builtin` varchar(10) NOT NULL,
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
INSERT INTO `t_user` VALUES ('21da4f6ca70201996e77aa7fda80db3d', 's', 's', 's', null, 'able', 'notBuiltin', 's', null, 's', '2014-02-12 17:35:02', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('50a3309800345a2984f12279515e001b', 'd', 'd', 'd', null, 'able', 'notBuiltin', 'd', null, 'd', '2014-02-12 17:35:06', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'builtin', 'admin@glacier.cn', null, null, '2014-02-15 14:51:30', '127.0.0.1[本地]', '28', '8b25651c2d896297530b64e4b80ec503', '2014-01-16 00:00:00');
INSERT INTO `t_user` VALUES ('af', 'qqqqqqqqqqq', 'afdddd', 'adf', 'asfd', 'af', 'af', 'ddd', null, 'dd', '2014-02-12 16:55:54', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');
INSERT INTO `t_user` VALUES ('ca1c01ab0f77133531b891cba8bd2670', 'dd', 'dd', 'dd', null, 'able', 'notBuiltin', 'dd', null, 'dd', '2014-02-12 17:49:48', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-02-12 00:00:00');

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
  `web_adv_status` enum('Enabled','Disabled') DEFAULT NULL COMMENT 'dsafsdafasdfd',
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
  `web_ann_status` enum('Enabled','Disabled') DEFAULT NULL COMMENT 'dsafsdafasdfd',
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
INSERT INTO `t_website_announcement` VALUES ('a742a6d623877125f6f0bc68d616d111', '元宵节快乐', '聚餐去', 'Enabled', '3', '3', null, '聚餐可以带家属~', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:41:24', null, null);
INSERT INTO `t_website_announcement` VALUES ('e5757e62589e9c86d5d754f787670cf3', '情人节快乐', '提前两个小时下班。', 'Enabled', '3', '3', null, '大家情人节快乐。', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:21:16', null, null);
INSERT INTO `t_website_announcement` VALUES ('sd5f4sd5f454sd4f5sdf45sd4f', '元旦快乐', '元旦到了 大家新年快乐', 'Enabled', '1', null, '1', '1', null, null, null, null);

-- ----------------------------
-- Table structure for `t_website_help`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_help`;
CREATE TABLE `t_website_help` (
  `web_help_id` varchar(32) NOT NULL,
  `web_help_theme` varchar(100) DEFAULT NULL,
  `web_help_content` text,
  `web_help_type` enum('borrow','invest','fund') DEFAULT NULL,
  `web_help_status` enum('Enabled','Disabled') DEFAULT NULL,
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

-- ----------------------------
-- Table structure for `t_website_hiring`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_hiring`;
CREATE TABLE `t_website_hiring` (
  `web_hiring_id` varchar(32) NOT NULL,
  `web_hiring_theme` varchar(100) DEFAULT NULL,
  `web_hiring_content` text,
  `web_hiring_status` enum('Enabled','Disabled') DEFAULT NULL,
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

-- ----------------------------
-- Table structure for `t_website_link`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_link`;
CREATE TABLE `t_website_link` (
  `web_link_id` varchar(32) NOT NULL,
  `web_link_name` varchar(100) DEFAULT NULL,
  `web_link_url` varchar(100) DEFAULT NULL,
  `web_link_photo` varchar(100) DEFAULT NULL,
  `web_link_status` enum('Enabled','Disabled') DEFAULT NULL,
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
  `web_nav_status` enum('Enabled','Disabled') DEFAULT NULL,
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
INSERT INTO `t_website_nav` VALUES ('0e68817baeba1109fbcfd53c837dbc66', '533321196059fa5805661651134a58fe', '联系我们', null, null, '52', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:51', null, null);
INSERT INTO `t_website_nav` VALUES ('133ccad08d70daf73b77fb8fb1bcee0c', null, '首页', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:43:48', null, null);
INSERT INTO `t_website_nav` VALUES ('1c865835cff6982b8dc9f6dd206f28e5', '30380ae8e3ecd0d1a34e41f92a8eadaa', '发布信用标', null, null, '31', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:47:55', null, null);
INSERT INTO `t_website_nav` VALUES ('1d33d5a8b6d5a2fe73eb78b7c8439624', '533321196059fa5805661651134a58fe', '公司简介', null, null, '51', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:49:36', null, null);
INSERT INTO `t_website_nav` VALUES ('29a56a83d3b22d8bf211ac68a0db0d01', null, '我要投资', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:26', null, null);
INSERT INTO `t_website_nav` VALUES ('30380ae8e3ecd0d1a34e41f92a8eadaa', null, '我要借款', null, null, '3', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:38', null, null);
INSERT INTO `t_website_nav` VALUES ('42bdcfbb624c975eea75c7d06b943853', '533321196059fa5805661651134a58fe', '招聘信息', null, null, '53', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:50:02', null, null);
INSERT INTO `t_website_nav` VALUES ('4edb2ec67480c21811ddb0b16f0e5218', null, '我的账号', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:34', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:47:04');
INSERT INTO `t_website_nav` VALUES ('533321196059fa5805661651134a58fe', null, '关于我们', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:45:12', null, null);
INSERT INTO `t_website_nav` VALUES ('5f76cc51c5d787932f09c4425350a79a', '4edb2ec67480c21811ddb0b16f0e5218', '我要登录', null, null, '41', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:46', null, null);
INSERT INTO `t_website_nav` VALUES ('6c0cb4c77e2cc5a3bfa47d79023c5254', null, '帮助中心', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:44:59', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:47:10');
INSERT INTO `t_website_nav` VALUES ('9ab845b68ca01934138c22ba6729cd75', '30380ae8e3ecd0d1a34e41f92a8eadaa', '发布担保标', null, null, '32', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:17', null, null);
INSERT INTO `t_website_nav` VALUES ('b45b9148c7cd2b5f7ec1d53a3d6ec99f', '4edb2ec67480c21811ddb0b16f0e5218', '我要注册', null, null, '42', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-14 13:48:59', null, null);

-- ----------------------------
-- Table structure for `t_website_news`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_news`;
CREATE TABLE `t_website_news` (
  `web_news_id` varchar(32) NOT NULL,
  `web_news_theme` varchar(100) DEFAULT NULL,
  `web_news_content` text,
  `web_news_status` enum('Enabled','Disabled') DEFAULT NULL,
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
INSERT INTO `t_website_news` VALUES ('c7b04e5bb2c91cd2f31598e65c38359e', '冷空气', null, 'Enabled', '4', '4', '4', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:54', null, null);
INSERT INTO `t_website_news` VALUES ('d2321b66d4cdde4bb7f961bbcec9dfc6', '情人节主题', null, 'Enabled', '3', '3', '3', '8b25651c2d896297530b64e4b80ec503', '2014-02-13 16:17:40', null, null);

-- ----------------------------
-- Table structure for `t_website_service`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_service`;
CREATE TABLE `t_website_service` (
  `web_service_id` varchar(32) NOT NULL,
  `web_service_name` varchar(100) DEFAULT NULL,
  `web_service_qq` varchar(100) DEFAULT NULL,
  `web_service_photo` varchar(100) DEFAULT NULL,
  `web_service_status` enum('Enabled','Disabled') DEFAULT NULL,
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
INSERT INTO `t_website_service` VALUES ('4c7b801aa8aab3f79e5b91dcd503b8dd', 'aaa', 'aaa', null, 'Enabled', 'aaa', '44', 'aaa', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:47:25', null, null);
INSERT INTO `t_website_service` VALUES ('85b930a8593d12999a2562577fd38fc1', 'ddd', 'dd', null, 'Enabled', 'dd', '332', 'dd', '8b25651c2d896297530b64e4b80ec503', '2014-02-15 14:45:23', null, null);
INSERT INTO `t_website_service` VALUES ('sdf', 'ccc', 'ccc', 'asdf', 'Enabled', 'ccc', '3', 'ccc', null, null, null, null);
