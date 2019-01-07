/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50527
Source Host           : localhost:3306
Source Database       : blog

Target Server Type    : MYSQL
Target Server Version : 50527
File Encoding         : 65001

Date: 2019-01-07 16:14:07
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
  `message_mark` varchar(2) DEFAULT NULL COMMENT '留言标记',
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
  `login_time` datetime DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL COMMENT '登录时间',
  `login_location` varchar(20) DEFAULT NULL COMMENT '登录位置',
  `login_ip_address` varchar(100) DEFAULT NULL COMMENT '登录IP',
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('1', '管理员', '123@test.com', '13623230000', 'admin', '123456', '2018-12-31 23:56:35', '1', null, null, null, null);
