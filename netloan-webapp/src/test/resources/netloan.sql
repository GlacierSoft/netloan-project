/*
Navicat MySQL Data Transfer

Source Server         : 本地MySql
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-01-20 15:18:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_action`
-- ----------------------------
DROP TABLE IF EXISTS `t_action`;
CREATE TABLE `t_action` (
  `action_id` varchar(32) NOT NULL COMMENT '��������Id',
  `menu_id` varchar(32) default NULL COMMENT '�������ڲ˵����',
  `panel_id` varchar(32) default NULL,
  `action_cn_name` varchar(30) NOT NULL COMMENT '������������',
  `action_en_name` varchar(30) NOT NULL COMMENT '����Ӣ������',
  `icon_cls` varchar(30) default NULL COMMENT '������ʽ',
  `type` enum('Link','Button') default 'Button' COMMENT '�������ͣ���ť/������',
  `disabled` enum('Enabled','Disabled') default NULL COMMENT 'Ĭ�ϴ��Ƿ����',
  `method` varchar(100) default NULL COMMENT '��������ǰ̨JS����',
  `order_num` int(10) unsigned default NULL COMMENT '����',
  `remark` varchar(50) default NULL COMMENT '��ע',
  PRIMARY KEY  (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_action
-- ----------------------------
INSERT INTO `t_action` VALUES ('18060139f0e736a796d5ac4bdd78eadc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.permissions_mgr.role_mgr.role.editRole();', '2', '');
INSERT INTO `t_action` VALUES ('429f54b614db46af58598c8d9a47a36f', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.permissions_mgr.res_mgr.res.delPanel();', '4', '');
INSERT INTO `t_action` VALUES ('5db796929f23e991708fd0af99b3b4bc', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.permissions_mgr.role_mgr.role.addRole();', '1', '');
INSERT INTO `t_action` VALUES ('6838d18fa1e582d4dc28404a80445c88', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.permissions_mgr.res_mgr.res.addMenu();', '2', '');
INSERT INTO `t_action` VALUES ('6c0bc1e009b3742af24d7bdc94adec3c', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.permissions_mgr.res_mgr.res.addPanel();', '2', '');
INSERT INTO `t_action` VALUES ('6e1027dd7e57195d06dd2fac811f8ebf', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.permissions_mgr.res_mgr.res.editMenu();', '3', '');
INSERT INTO `t_action` VALUES ('8eb3b50d119f05c30127c3359e4a5d2a', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.permissions_mgr.role_mgr.role.delRole();', '3', '');
INSERT INTO `t_action` VALUES ('9320f5b0199abd8d53990eef7cdcd745', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '编辑', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.permissions_mgr.res_mgr.res.editAction();', '3', '');
INSERT INTO `t_action` VALUES ('b0f605139653554aa66cf38a78fe42ba', '54eb754157cf483a790f4eea35200118', 'eb07f8ec54989seb66e4e8a1a0f21604', '列表', 'list', '', 'Button', 'Disabled', '', '1', '');
INSERT INTO `t_action` VALUES ('b34352268cb171aee1f8e2110657beab', 'e550884c5e6c1e94ee70cc833aa1c2b9', '83bbeed02a85549ae84cde8d98bcd8c1', '权限维护', 'actionAuth', 'icon-standard-key-go', 'Button', 'Enabled', 'glacier.permissions_mgr.role_mgr.role.actionAuth();', '5', '');
INSERT INTO `t_action` VALUES ('b5852fac0798a25a13b87e8532c60440', '54eb754157cf483a790f4eea35200118', '5731697aea23532eb8162f5ba1818c6f', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.permissions_mgr.res_mgr.res.delMenu();', '4', '');
INSERT INTO `t_action` VALUES ('dad8f671986722837f7eecb2b77c284b', '54eb754157cf483a790f4eea35200118', '961d2e73b3fa93a9f125fb731e0a9529', '修改', 'edit', 'icon-standard-pencil-go', 'Button', 'Disabled', 'glacier.permissions_mgr.res_mgr.res.editPanel();', '3', '');
INSERT INTO `t_action` VALUES ('e550884c5e6c1e94a970cc833aa1c2b9', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '增加', 'add', 'icon-standard-pencil-add', 'Button', 'Enabled', 'glacier.permissions_mgr.res_mgr.res.addAction();', '2', '');
INSERT INTO `t_action` VALUES ('f4b5eca05e616d411f1aeef044346664', '54eb754157cf483a790f4eea35200118', 'eb2a84c4b7bd11632135e4992ade286e', '删除', 'del', 'icon-standard-pencil-delete', 'Button', 'Disabled', 'glacier.permissions_mgr.res_mgr.res.delAction();', '4', '');

-- ----------------------------
-- Table structure for `t_authority`
-- ----------------------------
DROP TABLE IF EXISTS `t_authority`;
CREATE TABLE `t_authority` (
  `role_id` varchar(32) NOT NULL COMMENT '������Ψһ',
  `menu_id` varchar(32) NOT NULL COMMENT '�˵�����Id',
  `actions` varchar(21779) default NULL COMMENT '�������',
  PRIMARY KEY  (`role_id`,`menu_id`),
  KEY `FK_t_authority2` (`menu_id`),
  CONSTRAINT `FK_auth_menu_menu_id` FOREIGN KEY (`menu_id`) REFERENCES `t_menu` (`menu_id`),
  CONSTRAINT `FK_auth_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ȩ��_�˵���ɫ�м��';

-- ----------------------------
-- Records of t_authority
-- ----------------------------
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '16ac1df11de350c61722dc7b98cecca7', null);
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', '54eb754157cf483a790f4eea35200118', 'MenuTree_add,MenuTree_edit,MenuTree_del,PanelList_add,PanelList_edit,PanelList_del,ActionList_add,ActionList_edit,ActionList_del');
INSERT INTO `t_authority` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'e550884c5e6c1e94ee70cc833aa1c2b9', 'RoleList_add,RoleList_edit,RoleList_del');

-- ----------------------------
-- Table structure for `t_loginlog`
-- ----------------------------
DROP TABLE IF EXISTS `t_loginlog`;
CREATE TABLE `t_loginlog` (
  `loginlog_id` varchar(32) NOT NULL,
  `user_id` varchar(32) default NULL COMMENT '������ΨһID',
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
  `menu_id` varchar(32) NOT NULL COMMENT '�˵�����Id',
  `pid` varchar(32) default NULL COMMENT '�����˵�Id',
  `menu_en_name` varchar(30) default NULL COMMENT '�˵�Ӣ������',
  `menu_cn_name` varchar(30) default NULL COMMENT 'Ӣ����������',
  `icon_cls` varchar(50) default NULL COMMENT '�˵�ͼ����ʽ',
  `url` varchar(100) default NULL COMMENT '�˵�����URL',
  `order_num` int(10) unsigned default NULL COMMENT '����',
  `remark` varchar(255) default NULL COMMENT '��ע',
  PRIMARY KEY  (`menu_id`),
  KEY `FK_menu2parent1N` (`pid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ȩ��_�˵�';

-- ----------------------------
-- Records of t_menu
-- ----------------------------
INSERT INTO `t_menu` VALUES ('16ac1df11de350c61722dc7b98cecca7', null, 'syssetting', '系统设置', null, null, '1', null);
INSERT INTO `t_menu` VALUES ('54eb754157cf483a790f4eea35200118', '16ac1df11de350c61722dc7b98cecca7', 'resmgr', '资源管理', 'icon-cologne-featured', '/do/res/index.htm', '12', null);
INSERT INTO `t_menu` VALUES ('e550884c5e6c1e94ee70cc833aa1c2b9', '16ac1df11de350c61722dc7b98cecca7', 'rolemgr', '角色管理', 'icon-standard-status-online', '/do/role/index.htm', '11', null);

-- ----------------------------
-- Table structure for `t_operalog`
-- ----------------------------
DROP TABLE IF EXISTS `t_operalog`;
CREATE TABLE `t_operalog` (
  `operalog_id` varchar(32) NOT NULL,
  `action_id` varchar(32) default NULL,
  `user_id` varchar(32) default NULL COMMENT '������ΨһID',
  `opera_desc` varchar(255) default NULL,
  `opera_id` varchar(32) default NULL,
  `opera_time` date default NULL,
  PRIMARY KEY  (`operalog_id`),
  KEY `FK_loginlog_user_operalog_id` (`user_id`),
  KEY `FK_operalog_action_action_id` (`action_id`),
  CONSTRAINT `FK_loginlog_user_operalog_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`),
  CONSTRAINT `FK_operalog_action_action_id` FOREIGN KEY (`action_id`) REFERENCES `t_action` (`action_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_operalog
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
INSERT INTO `t_panel` VALUES ('5731697aea23532eb8162f5ba1818c6f', '54eb754157cf483a790f4eea35200118', '菜单树', 'MenuTree', '1');
INSERT INTO `t_panel` VALUES ('83bbeed02a85549ae84cde8d98bcd8c1', 'e550884c5e6c1e94ee70cc833aa1c2b9', '角色列表', 'RoleList', '1');
INSERT INTO `t_panel` VALUES ('961d2e73b3fa93a9f125fb731e0a9529', '54eb754157cf483a790f4eea35200118', '面板列表', 'PanelList', '2');
INSERT INTO `t_panel` VALUES ('eb2a84c4b7bd11632135e4992ade286e', '54eb754157cf483a790f4eea35200118', '操作列表', 'ActionList', '3');

-- ----------------------------
-- Table structure for `t_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role` (
  `role_id` varchar(32) NOT NULL COMMENT '������Ψһ',
  `role_en_name` varchar(25) NOT NULL COMMENT '��ɫӢ����(��д)',
  `role_cn_name` varchar(25) default NULL COMMENT '��ɫ������',
  `builtin` varchar(10) default NULL COMMENT 'ö�٣�����(BUILTIN)��������(NONINTRINSIC)',
  `remark` varchar(255) default NULL COMMENT '��ע',
  `creater` varchar(32) default NULL,
  `create_time` date default NULL,
  PRIMARY KEY  (`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ȩ��_��ɫ';

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES ('c87dd7161dbf8777c41b8cbfaa985db4', 'ADMIN', '超级管理员', 'builtin', null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16');

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` varchar(32) NOT NULL COMMENT '������ΨһID',
  `username` varchar(20) NOT NULL COMMENT '�û���',
  `user_cn_name` varchar(50) default NULL,
  `password` varchar(64) NOT NULL COMMENT '���룬MD5����',
  `salt` varchar(50) default NULL COMMENT '��ȫ���룬��Ϊ�û�����ֵ��������',
  `status` varchar(20) NOT NULL COMMENT '�û�״̬���������ã����أ����ᣬ����',
  `builtin` varchar(10) NOT NULL COMMENT 'ö�٣�����(BUILTIN)��������(NONINTRINSIC)',
  `email` varchar(50) default NULL COMMENT '�����ʼ�',
  `user_image` varchar(50) default NULL COMMENT '�û�ͷ�����ڴ���·��',
  `remark` varchar(255) default NULL COMMENT '��ע',
  `last_login_time` datetime default NULL COMMENT '����¼ʱ��',
  `last_login_ip_address` varchar(15) default NULL COMMENT '����¼IP��ַ',
  `login_count` int(10) default NULL,
  `creater` varchar(32) default NULL,
  `create_time` date default NULL,
  PRIMARY KEY  (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ȩ��_�û�';

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('8b25651c2d896297530b64e4b80ec503', 'admin', '超级管理员', '5dc10e7826e648ec6f136974c38f81d0e5e1d0ae', 'e03b1b95ceff4db6', 'enable', 'builtin', 'admin@glacier.cn', null, null, '2014-01-16 10:40:47', null, null, '8b25651c2d896297530b64e4b80ec503', '2014-01-16');

-- ----------------------------
-- Table structure for `t_user_role`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role` (
  `user_id` varchar(32) NOT NULL COMMENT '������ΨһID',
  `role_id` varchar(32) NOT NULL COMMENT '������Ψһ',
  PRIMARY KEY  (`user_id`,`role_id`),
  KEY `FK_t_user_role2` (`role_id`),
  CONSTRAINT `FK_t_user_role_role_id` FOREIGN KEY (`role_id`) REFERENCES `t_role` (`role_id`),
  CONSTRAINT `FK_t_user_role_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ȩ��_�û���ɫ�м��';

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES ('8b25651c2d896297530b64e4b80ec503', 'c87dd7161dbf8777c41b8cbfaa985db4');

-- ----------------------------
-- Table structure for `t_user_setting`
-- ----------------------------
DROP TABLE IF EXISTS `t_user_setting`;
CREATE TABLE `t_user_setting` (
  `user_id` varchar(32) NOT NULL COMMENT '������ΨһID',
  `set_key` varchar(50) default NULL COMMENT 'Ӣ����',
  `set_name` varchar(50) default NULL,
  `set_value` varchar(255) default NULL COMMENT '��ʵ����',
  `set_description` varchar(255) default NULL,
  PRIMARY KEY  (`user_id`),
  CONSTRAINT `FK_user_user_setting_user_id` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Ȩ��_�û���չ';

-- ----------------------------
-- Records of t_user_setting
-- ----------------------------
