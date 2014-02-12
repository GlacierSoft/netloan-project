/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-02-12 11:01:04
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
  `disabled` enum('Enabled','Disabled') default NULL,
  `method` varchar(100) default NULL,
  `order_num` int(10) unsigned default NULL,
  `remark` varchar(50) default NULL,
  PRIMARY KEY  (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('081b6469db43ca2d09c8c4393b838529', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.news_mgr.news.editNews();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.system_mgr.role_mgr.role.editRole();', '2', '');
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eads', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.age_mgr.age.addAge();', '2', null);
INSERT INTO `t_action` VALUES ('19e69166495bc3e74f11c5cbe3bc5ce5', '88ee044d59911b3b1a67ba4cdd0ee90d', '86d2ccad701f94c9e80d71557b1c62e6', '修改', 'deit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.announcement_mgr.announcement.editAnnouncement();', '2', '');
INSERT INTO `t_action` VALUES ('2213139f0e736a796d5ac4bdd78332', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.integral_mgr.integral.delIntegral();', '3', null);
INSERT INTO `t_action` VALUES ('2353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.area_mgr.area.editArea();', '2', null);
INSERT INTO `t_action` VALUES ('25860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.credit_mgr.credit.addCredit();', '1', null);
INSERT INTO `t_action` VALUES ('28060139f0e736a796d5ac4bdd78dawx', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.age_mgr.age.editAge();', '3', null);
INSERT INTO `t_action` VALUES ('28909d485e495c2c137aca2d669645d3', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.help_mgr.help.addHelp();', '1', '');
INSERT INTO `t_action` VALUES ('2d3cba66f556c98c52a47e4636da3e17', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.link_mgr.link.editLink();', '2', '');
INSERT INTO `t_action` VALUES ('34560139f0e736a796d5ac4bdd78344', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.integral_mgr.integral.addIntegral();', '1', null);
INSERT INTO `t_action` VALUES ('35860139f0e736a796d5ac4bdd78147', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.credit_mgr.credit.editCredit();', '2', null);
INSERT INTO `t_action` VALUES ('38060139f0e736a796d5ac4bdd78escs', 't110147c5e6c1e94ee70cc833aa7f5d3', '21gfdg1rgrh1dfhsjdfh124564sdf21d', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.age_mgr.age.delAge();', '4', null);
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.delPanel();', '4', '');
INSERT INTO `t_action` VALUES ('4353539f0e736a796d5ac4bdd78eadc', 'de34654c5e6c1e94ee70cc833asd142', 'swdf697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.area_mgr.area.addArea();', '1', null);
INSERT INTO `t_action` VALUES ('4586054157cf483a790f4eea35dsf6f6', 'v465654c5e6c1e94ee70cc833asd142', '87gfdg1rgrh1dfhsjdfh124564sderbg', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.credit_mgr.credit.delCredit();', '3', null);
INSERT INTO `t_action` VALUES ('47825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optvalue_mgr.optvalue.editOptgroupValue();', '2', '');
INSERT INTO `t_action` VALUES ('4935ba0942f42d408c8205e92d7266d9', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.service_mgr.service.addService();', '1', '');
INSERT INTO `t_action` VALUES ('4bde011f88760fd616c223d118eab841', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.nav_mgr.nav.addNav();', '1', '');
INSERT INTO `t_action` VALUES ('56890139f0e736a796d5ac4bdd78211', 'sdeg454c5e6c1e94ee70cc833asd142', '34eg454c5e6c1e94ee70cc833asd87', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.integral_mgr.integral.editIntegral();', '2', null);
INSERT INTO `t_action` VALUES ('5825847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optvalue_mgr.optvalue.delOptgroupValue();', '3', '');
INSERT INTO `t_action` VALUES ('5a4171d71d37ecd90cad18fb915b514b', 'e75a41ba4a2bc299e3b50a15580a103b', '93fc21dd1e7d69dd439c77c9e94e25af', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.service_mgr.service.editService();', '2', '');
INSERT INTO `t_action` VALUES ('5c2965033bb62ab747c3d1c74adb72c8', '5b6eaabb2c3a020c4d85ab50d11ffd85', '20814591aaa67351ab28198ec8531c80', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.link_mgr.link.delLink();', '3', '');
INSERT INTO `t_action` VALUES ('5c630948779113b05eba2bee11430518', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.website_mgr.advertisement_mgr.advertisement.editAdvertisement();', '2', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.role_mgr.role.addRole();', '1', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.res_mgr.res.addMenu();', '2', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.system_mgr.res_mgr.res.addPanel();', '2', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.editMenu();', '3', '');
INSERT INTO `t_action` VALUES ('7264da6cb6fbe51c0731119ff4865695', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'a1d130de95607ffc00fb455c749cf1a1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.hiring_mgr.hiring.addHiring();', '1', '');
INSERT INTO `t_action` VALUES ('762515461de7429f5b008585301cdf48', 'a652d3fe69c067cb94b73361351b8378', '5cd4cb6d36559b7d7e3a022e53a3bd71', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.website_mgr.news_mgr.news.addNews();', '1', '');
INSERT INTO `t_action` VALUES ('7fd16b2771ba4b31024e586eb3ca6e6b', '54d652799e07bb8be54483301a89ff90', '28fe18d693742ae7db094fc750715c46', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.help_mgr.help.delHelp();', '3', '');
INSERT INTO `t_action` VALUES ('8530139f0e736a796d5ac4bdd78eadc', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.addOptgroup();', '1', null);
INSERT INTO `t_action` VALUES ('8537147f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.delOptgroup();', '3', null);
INSERT INTO `t_action` VALUES ('8537899f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '4546fgrgrh1dfhsjdfh124564sdf2sag', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optgroup_mgr.optgroup.editOptgroup();', '2', null);
INSERT INTO `t_action` VALUES ('8d107485b9e1aefcd257e0b97fb38023', '4f1b6666b70be892469b6e93c1eb30ce', '780a15a12d2fc981cccb418dafce08b2', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.nav_mgr.nav.delNav();', '3', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.system_mgr.role_mgr.role.delRole();', '3', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.system_mgr.res_mgr.res.editAction();', '3', '');
INSERT INTO `t_action` VALUES ('96325847f0e736a796d5ac4bdd78e123', 'sdsfeg4157cf483a790f4eea35ds5675', '3456eg4157cf483a790f4eea35ds5675', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.basicdatas_mgr.optvalue_mgr.optvalue.addOptgroupValue();', '1', '');
INSERT INTO `t_action` VALUES ('9b230bb84a2df248ad7a4d506d06f28c', 'b34761b59816e63743643c6f179683a4', 'b8a03efe50a44d460983badb4be96eea', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Enabled', 'glacier.website_mgr.advertisement_mgr.advertisement.delAdvertisement();', '3', '');
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
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '14sdf54157cf483a790f4eea35dsf6f6', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '4f1b6666b70be892469b6e93c1eb30ce', 'NavTree_add,NavTree_edit,NavTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54d652799e07bb8be54483301a89ff90', 'HelpList_add,HelpList_edit,HelpList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'ActionList_add,ActionList_edit,ActionList_del,PanelList_add,PanelList_edit,PanelList_del,MenuTree_add,MenuTree_edit,MenuTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '5b6eaabb2c3a020c4d85ab50d11ffd85', 'LinkList_add,LinkList_edit,LinkList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '88ee044d59911b3b1a67ba4cdd0ee90d', 'NavList_add,NavList_deit,NavList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a60cca184eff20fdce88b3f1ab5a9cce', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'a652d3fe69c067cb94b73361351b8378', 'NewsList_add,NewsList_edit,NewsList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ab01dd2ac38d920f691bbc65b7a4bfb2', 'HiringList_add,HiringList_edit,HiringList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'b34761b59816e63743643c6f179683a4', 'AdvertisementList_add,AdvertisementList_edit,AdvertisementList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'd503136bdab7bbdc8d09f3bbb28fa979', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'de34654c5e6c1e94ee70cc833asd142', 'AreaTree_add,AreaTree_edit,AreaTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del,RoleList_auth');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e75a41ba4a2bc299e3b50a15580a103b', 'Service_add,Service_edit,Service_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdeg454c5e6c1e94ee70cc833asd142', 'IntegralList_add,IntegralList_edit,IntegralList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'sdsfeg4157cf483a790f4eea35ds5675', 'OptgroupValueList_add,OptgroupValueList_edit,OptgroupValueList_del,OptgroupTree_add,OptgroupTree_edit,OptgroupTree_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 't110147c5e6c1e94ee70cc833aa7f5d3', 'AgeList_add,AgeList_edit,AgeList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'v465654c5e6c1e94ee70cc833asd142', 'CreditList_add,CreditList_edit,CreditList_del');

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
INSERT INTO `t_menu` VALUES ('14sdf54157cf483a790f4eea35dsf6f6', null, 'basicdatas', '参数管理', 'icon-standard-application-xp-terminal', '', '2', '');
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'system', '系统设置', 'icon-standard-cog', '', '1', '');
INSERT INTO `t_menu` VALUES ('4f1b6666b70be892469b6e93c1eb30ce', 'a60cca184eff20fdce88b3f1ab5a9cce', 'nav', '导航信息', 'icon-standard-application-view-list', '/do/nav/index.htm', '9', '');
INSERT INTO `t_menu` VALUES ('54d652799e07bb8be54483301a89ff90', 'a60cca184eff20fdce88b3f1ab5a9cce', 'help', '帮助中心', 'icon-hamburg-config', '/do/help/index.htm', '16', '');
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'res', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '12', null);
INSERT INTO `t_menu` VALUES ('5b6eaabb2c3a020c4d85ab50d11ffd85', 'a60cca184eff20fdce88b3f1ab5a9cce', 'link', '友情链接', 'icon-hamburg-world', '/do/link/index.htm', '13', '');
INSERT INTO `t_menu` VALUES ('88ee044d59911b3b1a67ba4cdd0ee90d', 'a60cca184eff20fdce88b3f1ab5a9cce', 'announcement', '公告管理', 'icon-standard-feed', '/do/announcement/index.htm', '10', '');
INSERT INTO `t_menu` VALUES ('a60cca184eff20fdce88b3f1ab5a9cce', null, 'website', '网站管理', 'icon-standard-color-wheel', '', '10', '');
INSERT INTO `t_menu` VALUES ('a652d3fe69c067cb94b73361351b8378', 'a60cca184eff20fdce88b3f1ab5a9cce', 'news', '新闻管理', 'icon-standard-monitor', '/do/news/index.htm', '12', '');
INSERT INTO `t_menu` VALUES ('ab01dd2ac38d920f691bbc65b7a4bfb2', 'a60cca184eff20fdce88b3f1ab5a9cce', 'hiring', '招聘信息', 'icon-hamburg-customers', '/do/hiring/index.htm', '17', '');
INSERT INTO `t_menu` VALUES ('b34761b59816e63743643c6f179683a4', 'a60cca184eff20fdce88b3f1ab5a9cce', 'advertisement', '广告管理', 'icon-standard-bell', '/do/advertisement/index.htm', '11', '');
INSERT INTO `t_menu` VALUES ('d503136bdab7bbdc8d09f3bbb28fa979', null, 'info', '信息管理', 'icon-standard-application-view-tile', '', '10', '');
INSERT INTO `t_menu` VALUES ('de34654c5e6c1e94ee70cc833asd142', '14sdf54157cf483a790f4eea35dsf6f6', 'area', '地区管理', 'icon-hamburg-link', '/do/area/index.htm', '23', '');
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
  `opera_menu` varchar(255) default NULL COMMENT '操作菜单',
  `opera_penal` varchar(255) default NULL COMMENT '操作面板',
  `opera_method` varchar(255) default NULL COMMENT '操作方法',
  `opera_result` varchar(255) default NULL COMMENT '操作结果',
  `opera_desc` varchar(255) default NULL COMMENT '返回内容',
  `opera_class` varchar(255) default NULL COMMENT '调用类',
  `opera_md` varchar(255) default NULL COMMENT '调用方法',
  `opera_key` varchar(255) default NULL COMMENT '操作KEY',
  `operator` varchar(32) default NULL COMMENT '操作人',
  `opera_time` date default NULL COMMENT '操作世间',
  PRIMARY KEY  (`operalog_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_operalog
-- ----------------------------
INSERT INTO `t_operalog` VALUES ('05e93db92c2533184902b7c9c7b3cfdd', '角色管理', '角色列表', '修改', '0', '英文名称重复，请重新填写!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10');
INSERT INTO `t_operalog` VALUES ('13ad4ee4478a840d62d4068766f87fc3', '角色管理', '角色列表', '修改', '1', '[角色测试666] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10');
INSERT INTO `t_operalog` VALUES ('86be699db942e872b26528d9cbd1de4f', '角色管理', '角色列表', '修改', '1', '[角色测试] 角色信息已变更!', 'com.glacier.netloan.service.system.RoleService', 'editRole', 'RoleList_edit', '超级管理员', '2014-02-10');

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
INSERT INTO `t_panel` VALUES ('20814591aaa67351ab28198ec8531c80', '5b6eaabb2c3a020c4d85ab50d11ffd85', '友情列表', 'LinkList', '1');
INSERT INTO `t_panel` VALUES ('21gfdg1rgrh1dfhsjdfh124564sdf21d', 't110147c5e6c1e94ee70cc833aa7f5d3', '年龄列表', 'AgeList', '2');
INSERT INTO `t_panel` VALUES ('28fe18d693742ae7db094fc750715c46', '54d652799e07bb8be54483301a89ff90', '帮助列表', 'HelpList', '1');
INSERT INTO `t_panel` VALUES ('3456eg4157cf483a790f4eea35ds5675', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉列表', 'OptgroupValueList', '6');
INSERT INTO `t_panel` VALUES ('34eg454c5e6c1e94ee70cc833asd87', 'sdeg454c5e6c1e94ee70cc833asd142', '积分列表', 'IntegralList', '5');
INSERT INTO `t_panel` VALUES ('4546fgrgrh1dfhsjdfh124564sdf2sag', 'sdsfeg4157cf483a790f4eea35ds5675', '下拉项树', 'OptgroupTree', '5');
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('5cd4cb6d36559b7d7e3a022e53a3bd71', 'a652d3fe69c067cb94b73361351b8378', '新闻列表', 'NewsList', '1');
INSERT INTO `t_panel` VALUES ('780a15a12d2fc981cccb418dafce08b2', '4f1b6666b70be892469b6e93c1eb30ce', '导航树', 'NavTree', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('86d2ccad701f94c9e80d71557b1c62e6', '88ee044d59911b3b1a67ba4cdd0ee90d', '公告列表', 'NavList', '1');
INSERT INTO `t_panel` VALUES ('87gfdg1rgrh1dfhsjdfh124564sderbg', 'v465654c5e6c1e94ee70cc833asd142', '信用列表', 'CreditList', '3');
INSERT INTO `t_panel` VALUES ('93fc21dd1e7d69dd439c77c9e94e25af', 'e75a41ba4a2bc299e3b50a15580a103b', '客服列表', 'Service', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('a1d130de95607ffc00fb455c749cf1a1', 'ab01dd2ac38d920f691bbc65b7a4bfb2', '招聘列表', 'HiringList', '1');
INSERT INTO `t_panel` VALUES ('b8a03efe50a44d460983badb4be96eea', 'b34761b59816e63743643c6f179683a4', '广告列表', 'AdvertisementList', '1');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');
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
INSERT INTO `t_parameter_age` VALUES ('25gtr54157cf483a790f4eea3der25', '创业期', '1', '29', null, null, null, null, '2014-01-21 15:13:28', null, null);
INSERT INTO `t_parameter_age` VALUES ('3f2sa343dg54f65fh54fh67h5sf4h5', '黄金岁月', '30', '40', null, null, null, null, '2014-01-21 15:13:26', null, null);
INSERT INTO `t_parameter_age` VALUES ('45dfdsf554f5sd4fsdf4s5df4sd5f4s', '成功人士', '41', '59', null, null, null, null, '2014-01-21 15:13:24', null, null);

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
INSERT INTO `t_parameter_area` VALUES ('2580884c5e6c1e94ee70cc833aa1c247', null, '广东', 'subsite1', null, '1', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('25f11aa59eeeeefc26610c232e387eb4', 'sdf3dsf3sd3g25s3dg2sdgsdg', '奶牛', null, null, null, '对方答复', '8b25651c2d896297530b64e4b80ec503', '2014-01-23 13:34:38', null, null);
INSERT INTO `t_parameter_area` VALUES ('8740884c5e6c1e94ee70cc833aa1c123', '2580884c5e6c1e94ee70cc833aa1c247', '深圳', 'subsite1', null, '12', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('e0029054286c2c9760c384746fe4358d', '的', '的说法答复', null, null, null, '的 的', '8b25651c2d896297530b64e4b80ec503', '2014-01-23 13:43:28', null, null);
INSERT INTO `t_parameter_area` VALUES ('sdf2s2df1s2dg1ager521ger1ge2r1g', null, '广西', 'subsite1', null, '2', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('sdf3dsf3sd3g25s3dg2sdgsdg', 'sdf2s2df1s2dg1ager521ger1ge2r1g', '南宁', 'subsite1', null, '21', null, null, null, null, null);
INSERT INTO `t_parameter_area` VALUES ('sdw0884c5e6c1e94ee70cc833aa1c2sd', '2580884c5e6c1e94ee70cc833aa1c247', '广州', 'subsite1', null, '13', null, null, null, null, null);

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
INSERT INTO `t_parameter_optgroup` VALUES ('frtfdg1rgrh1dfhsjdfh124564sdf21d', null, '系统设置', '系统设置', null, '/system.htm', null, null, null, null, null, null);
INSERT INTO `t_parameter_optgroup` VALUES ('ss34g1rgrh1dfhsjdfh124564sdf21d', 'frtfdg1rgrh1dfhsjdfh124564sdf21d', '用户设置', '用户设置', null, '/user.htm', null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `t_parameter_optgroup_value`
-- ----------------------------
DROP TABLE IF EXISTS `t_parameter_optgroup_value`;
CREATE TABLE `t_parameter_optgroup_value` (
  `optgroup_value_id` varchar(32) NOT NULL,
  `optgroup_id` varchar(32) default NULL,
  `optgroup_value_code` varchar(50) default NULL,
  `optgroup_value_name` varchar(50) default NULL,
  `status` enum('Enabled','Disabled') default NULL,
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
INSERT INTO `t_parameter_optgroup_value` VALUES ('sadsadsafasf3215s4d5g4', 'ss34g1rgrh1dfhsjdfh124564sdf21d', 'women', '女', null, null, null, null, null, null, null);
INSERT INTO `t_parameter_optgroup_value` VALUES ('sdsdsdg1rgrh1dfhsjdfh1245df21d', 'ss34g1rgrh1dfhsjdfh124564sdf21d', 'man', '男', null, null, null, null, null, null, null);

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
  `create_time` date default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('56078492e2eed9eb33f32c3af54a8e3f', 'test', '测试角色', null, '看看', '8b25651c2d896297530b64e4b80ec503', '2014-02-10');
INSERT INTO `t_role` VALUES ('96b0c94ab19afbf40b57e7b91bfed673', 'wer', '角色测试666', null, '', '8b25651c2d896297530b64e4b80ec503', '2014-02-10');
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'builtin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16');

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
  `status` varchar(20) NOT NULL,
  `builtin` varchar(10) NOT NULL,
  `email` varchar(50) default NULL,
  `user_image` varchar(50) default NULL,
  `remark` varchar(255) default NULL,
  `last_login_time` datetime default NULL,
  `last_login_ip_address` varchar(15) default NULL,
  `login_count` int(10) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` date default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'builtin', 'admin@glacier.cn', null, null, '2014-01-16 10:40:47', null, '1', '8b25651c2d896297530b64e4b80ec503', '2014-01-16');

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
  `web_adv_status` enum('Enabled','Disabled') default NULL COMMENT 'dsafsdafasdfd',
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

-- ----------------------------
-- Table structure for `t_website_announcement`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_announcement`;
CREATE TABLE `t_website_announcement` (
  `web_ann_id` varchar(32) NOT NULL,
  `web_ann_theme` varchar(100) default NULL,
  `web_ann_content` text,
  `web_ann_status` enum('Enabled','Disabled') default NULL COMMENT 'dsafsdafasdfd',
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

-- ----------------------------
-- Table structure for `t_website_help`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_help`;
CREATE TABLE `t_website_help` (
  `web_help_id` varchar(32) NOT NULL,
  `web_help_theme` varchar(100) default NULL,
  `web_help_content` text,
  `web_help_type` enum('borrow','invest','fund') default NULL,
  `web_help_status` enum('Enabled','Disabled') default NULL,
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

-- ----------------------------
-- Table structure for `t_website_hiring`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_hiring`;
CREATE TABLE `t_website_hiring` (
  `web_hiring_id` varchar(32) NOT NULL,
  `web_hiring_theme` varchar(100) default NULL,
  `web_hiring_content` text,
  `web_hiring_status` enum('Enabled','Disabled') default NULL,
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

-- ----------------------------
-- Table structure for `t_website_link`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_link`;
CREATE TABLE `t_website_link` (
  `web_link_id` varchar(32) NOT NULL,
  `web_link_name` varchar(100) default NULL,
  `web_link_url` varchar(100) default NULL,
  `web_link_photo` varchar(100) default NULL,
  `web_link_status` enum('Enabled','Disabled') default NULL,
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

-- ----------------------------
-- Table structure for `t_website_nav`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_nav`;
CREATE TABLE `t_website_nav` (
  `web_nav_id` varchar(32) NOT NULL,
  `web_nav_pid` varchar(32) default NULL,
  `web_nav_name` varchar(100) default NULL,
  `web_nav_url` varchar(100) default NULL,
  `web_nav_status` enum('Enabled','Disabled') default NULL,
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
INSERT INTO `t_website_nav` VALUES ('6029629dc20e51da24d64bc15f9eec37', '7f3d5299b13ff33c84fe43679e64722c', 'rr', null, null, '6', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-11 17:08:20', null, null);
INSERT INTO `t_website_nav` VALUES ('633f002b14689b96b737c02987f56b3d', null, 'aa', null, null, '1', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-11 17:06:59', null, null);
INSERT INTO `t_website_nav` VALUES ('7f3d5299b13ff33c84fe43679e64722c', null, 'bb', null, null, '2', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-11 17:07:41', null, null);
INSERT INTO `t_website_nav` VALUES ('b789c91d940c326eddc821d19426c9e6', null, '66', null, null, '66', '66', '8b25651c2d896297530b64e4b80ec503', '2014-02-12 10:16:38', null, null);
INSERT INTO `t_website_nav` VALUES ('be5351a9120b1f86c88761439250cb04', '633f002b14689b96b737c02987f56b3d', 'dd', null, null, '4', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-11 17:07:59', null, null);
INSERT INTO `t_website_nav` VALUES ('f115003a8321506567b22bf67f43ddff', 'be5351a9120b1f86c88761439250cb04', 'ff', null, null, '5', '', '8b25651c2d896297530b64e4b80ec503', '2014-02-11 17:08:09', null, null);

-- ----------------------------
-- Table structure for `t_website_news`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_news`;
CREATE TABLE `t_website_news` (
  `web_news_id` varchar(32) NOT NULL,
  `web_news_theme` varchar(100) default NULL,
  `web_news_content` text,
  `web_news_status` enum('Enabled','Disabled') default NULL,
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

-- ----------------------------
-- Table structure for `t_website_service`
-- ----------------------------
DROP TABLE IF EXISTS `t_website_service`;
CREATE TABLE `t_website_service` (
  `web_service_id` varchar(32) NOT NULL,
  `web_service_name` varchar(100) default NULL,
  `web_service_qq` varchar(100) default NULL,
  `web_service_photo` varchar(100) default NULL,
  `web_service_status` enum('Enabled','Disabled') default NULL,
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
