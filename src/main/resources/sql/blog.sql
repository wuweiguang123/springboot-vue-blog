/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-02-19 16:44:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_article`
-- ----------------------------
DROP TABLE IF EXISTS `t_article`;
CREATE TABLE `t_article` (
  `article_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '文章编号',
  `article_title` varchar(50) CHARACTER SET utf32 NOT NULL COMMENT '文章标题',
  `article_summary` varchar(100) DEFAULT NULL COMMENT '文章摘要',
  `article_content` text NOT NULL COMMENT '文章内容',
  `article_pic` varchar(1000) DEFAULT NULL COMMENT '文章插图',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `article_mark` varchar(2) NOT NULL COMMENT '文章标识',
  `article_read_num` int(11) NOT NULL DEFAULT '0' COMMENT '阅读量',
  `article_likes` int(11) NOT NULL DEFAULT '0' COMMENT '点赞数',
  `article_status` varchar(2) DEFAULT NULL COMMENT '文章状态',
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_article
-- ----------------------------

-- ----------------------------
-- Table structure for `t_category`
-- ----------------------------
DROP TABLE IF EXISTS `t_category`;
CREATE TABLE `t_category` (
  `category_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '分类编号',
  `category_name` varchar(20) NOT NULL COMMENT '分类名称',
  `category_alias` varchar(10) DEFAULT NULL COMMENT '分类别名',
  `category_marks` varchar(2) NOT NULL DEFAULT '0' COMMENT '分类标识：0文章的分类 1文章的标签',
  `category_description` varchar(500) DEFAULT NULL COMMENT '分类描述',
  `category_status` varchar(2) DEFAULT NULL COMMENT '分类状态',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_category
-- ----------------------------

-- ----------------------------
-- Table structure for `t_message`
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `message_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言编号',
  `message_content` text NOT NULL COMMENT '留言内容',
  `message_name` varchar(20) NOT NULL COMMENT '留言者姓名',
  `message_email` varchar(50) NOT NULL COMMENT '联系邮箱',
  `message_time` datetime NOT NULL COMMENT '留言时间',
  `read_mark` varchar(1) DEFAULT '' COMMENT '是否已读（0 未读，1 已读）',
  `message_mark` varchar(2) DEFAULT NULL COMMENT '留言标记（-1审核没通过，0未审核，1审核通过）',
  PRIMARY KEY (`message_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_message
-- ----------------------------

-- ----------------------------
-- Table structure for `t_user`
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户编号',
  `user_name` varchar(20) NOT NULL COMMENT '用户名',
  `user_email` varchar(50) NOT NULL COMMENT '用户邮箱',
  `user_phone` varchar(11) DEFAULT NULL COMMENT '电话号码',
  `user_account` varchar(20) NOT NULL COMMENT '登录账号',
  `user_password` varchar(20) NOT NULL COMMENT '用户密码',
  `create_time` datetime DEFAULT NULL COMMENT '创建时间',
  `user_status` varchar(2) NOT NULL DEFAULT '1' COMMENT '用户状态：-1无效 1有效（默认有效）',
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_acc` (`user_account`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '管理员', '123@test.com', '13623230000', 'sdfgh', '123456', '2018-12-31 23:56:35', '1');
INSERT INTO `t_user` VALUES ('2', '西瓜', '123@test.com', '15124680346', 'xg', '123456', '2019-01-25 11:12:37', '1');
INSERT INTO `t_user` VALUES ('3', '柠檬', '123@test.com', '15232108258', 'nm', '123456', '2019-01-25 11:13:35', '1');
INSERT INTO `t_user` VALUES ('4', '还硅胶', 'dfh@er.bn', '1321545645', 'jlkhjk', '1111111111', '2019-02-01 22:36:27', '1');
INSERT INTO `t_user` VALUES ('5', 'hghgj', '1212@df.nm', '132115', '1212313', '454545454545', '2019-02-01 22:40:03', '1');
INSERT INTO `t_user` VALUES ('6', 'sdsaa', 'sdas@a.com', 'sds', 'adsd', 'aaa', '2019-02-06 20:12:01', '1');
INSERT INTO `t_user` VALUES ('8', 'ddd', '123@test.com', '12345567777', 'admmm', '123123', '2019-02-19 08:40:02', '1');
