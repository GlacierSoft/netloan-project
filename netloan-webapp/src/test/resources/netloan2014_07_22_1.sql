/*
Navicat MySQL Data Transfer

Source Server         : netloan
Source Server Version : 50067
Source Host           : localhost:3306
Source Database       : netloan

Target Server Type    : MYSQL
Target Server Version : 50067
File Encoding         : 65001

Date: 2014-07-22 14:11:47
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
INSERT INTO `t_account_invest` VALUES ('441b8e330e1c29740af1f07522779101', '12.00', '4560.00', '7890.00', '1100.00', '6789.00', '4560.00', '3467.00', '8b25651c2d896297530b64e4b80ec503', '2014-07-21 17:58:29', '8b25651c2d896297530b64e4b80ec503', '2014-07-21 17:58:29');
INSERT INTO `t_account_invest` VALUES ('b9fa8f740ce5be0eb1cff2fc4c3dc095', '9216.67', '3450.00', '6890.00', '2100.00', '7890.00', '4570.00', '5690.00', '8b25651c2d896297530b64e4b80ec503', '2014-07-22 11:18:12', '8b25651c2d896297530b64e4b80ec503', '2014-07-22 11:18:12');
INSERT INTO `t_account_invest` VALUES ('bd0cf770e209a50e3ec13508e9a74bfd', '7145.00', '3450.00', '4560.00', '6700.00', '3456.00', '2140.00', '8900.00', '8b25651c2d896297530b64e4b80ec503', '2014-07-18 09:47:55', '8b25651c2d896297530b64e4b80ec503', '2014-07-18 09:47:55');
