/*
 Navicat Premium Data Transfer

 Source Server         : Localhost
 Source Server Type    : MySQL
 Source Server Version : 50717
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50717
 File Encoding         : 65001

 Date: 21/06/2018 16:55:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dingdan
-- ----------------------------
DROP TABLE IF EXISTS `dingdan`;
CREATE TABLE `dingdan`  (
  `oid` int(11) NOT NULL DEFAULT 0 COMMENT '订单id',
  `sid` int(11) NOT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  `spid` int(11) NOT NULL,
  `spnum` int(11) NULL DEFAULT NULL,
  `spprice` double(11, 2) NULL DEFAULT NULL,
  `totalprice` double(11, 0) NULL DEFAULT NULL,
  `state` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dingdan
-- ----------------------------
INSERT INTO `dingdan` VALUES (1, 1, 1, 1, 1, 25.00, 25, '已完成');
INSERT INTO `dingdan` VALUES (2, 1, 1, 1, 5, 25.00, 125, '待接单');
INSERT INTO `dingdan` VALUES (2, 1, 1, 2, 1, 35.00, 35, '待接单');
INSERT INTO `dingdan` VALUES (3, 1, 1, 1, 6, 25.00, 150, '待接单');
INSERT INTO `dingdan` VALUES (3, 1, 1, 2, 1, 35.00, 35, '待接单');
INSERT INTO `dingdan` VALUES (4, 1, 1, 1, 7, 25.00, 175, '待接单');
INSERT INTO `dingdan` VALUES (4, 1, 1, 2, 1, 35.00, 35, '待接单');

-- ----------------------------
-- Table structure for dingdantexttwo
-- ----------------------------
DROP TABLE IF EXISTS `dingdantexttwo`;
CREATE TABLE `dingdantexttwo`  (
  `ddid` int(11) NULL DEFAULT NULL,
  `ddname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ddprice` int(11) NULL DEFAULT NULL,
  `ddpic` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL,
  `ddnum` int(11) NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for gouwuche
-- ----------------------------
DROP TABLE IF EXISTS `gouwuche`;
CREATE TABLE `gouwuche`  (
  `sid` int(11) NOT NULL,
  `uid` int(11) NULL DEFAULT NULL,
  `spid` int(11) NULL DEFAULT NULL,
  `spname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `spnum` int(11) NULL DEFAULT NULL,
  `price` int(11) NULL DEFAULT NULL,
  INDEX `sid_fk`(`sid`) USING BTREE,
  INDEX `spid_fk`(`spid`) USING BTREE,
  INDEX `uid_fk`(`uid`) USING BTREE,
  CONSTRAINT `sid_fk` FOREIGN KEY (`sid`) REFERENCES `shops` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `spid_fk` FOREIGN KEY (`spid`) REFERENCES `shangpintable` (`spid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gouwuche
-- ----------------------------
INSERT INTO `gouwuche` VALUES (1, 1, 1, '红烧排骨饭', 2, 25);

-- ----------------------------
-- Table structure for shangpintable
-- ----------------------------
DROP TABLE IF EXISTS `shangpintable`;
CREATE TABLE `shangpintable`  (
  `sjid` int(11) NOT NULL COMMENT '商家id',
  `spid` int(11) NOT NULL COMMENT '商品id',
  `spname` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '商品名称',
  `spprice` varchar(10) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '商品价格',
  `sppic` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '商品图片',
  PRIMARY KEY (`spid`) USING BTREE,
  INDEX `sjid`(`sjid`) USING BTREE,
  CONSTRAINT `sjid` FOREIGN KEY (`sjid`) REFERENCES `shops` (`sid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shangpintable
-- ----------------------------
INSERT INTO `shangpintable` VALUES (1, 1, '红烧排骨饭', '25', 'sppic/1.jpg');
INSERT INTO `shangpintable` VALUES (1, 2, '红烧排骨饭套餐', '35', 'sppic/2.jpg');
INSERT INTO `shangpintable` VALUES (1, 3, '台湾卤肉饭', '30', 'sppic/3.jpg');
INSERT INTO `shangpintable` VALUES (1, 4, '卤肉饭套餐', '35', 'sppic/4.jpg');
INSERT INTO `shangpintable` VALUES (1, 5, '回锅肉盖浇饭', '30', 'sppic/5.jpg');
INSERT INTO `shangpintable` VALUES (1, 6, '青菜饭', '20', 'sppic/6.jpg');
INSERT INTO `shangpintable` VALUES (2, 7, '真功夫套餐', '35', 'sppic/7.jpg');
INSERT INTO `shangpintable` VALUES (2, 8, '真功夫可乐套餐', '40', 'sppic/8.jpg');
INSERT INTO `shangpintable` VALUES (2, 9, '真功夫茄子饭', '20', 'sppic/9.jpg');
INSERT INTO `shangpintable` VALUES (2, 10, '真功夫卤肉可乐套餐', '45', 'sppic/10.jpg');
INSERT INTO `shangpintable` VALUES (2, 11, '真功夫卤肉盖浇饭', '35', 'sppic/11.jpg');
INSERT INTO `shangpintable` VALUES (3, 12, '超级苏丹王榴莲披萨', '88', 'sppic/12.png');
INSERT INTO `shangpintable` VALUES (3, 13, '苏丹王榴莲披萨', '66', 'sppic/13.png');
INSERT INTO `shangpintable` VALUES (3, 14, '披萨套餐', '69', 'sppic/14.png');
INSERT INTO `shangpintable` VALUES (3, 15, '黑松露披萨', '99', 'sppic/15.png');
INSERT INTO `shangpintable` VALUES (3, 16, '水果披萨', '88', 'sppic/16.png');
INSERT INTO `shangpintable` VALUES (3, 17, '夏威夷水果披萨', '99', 'sppic/17.png');
INSERT INTO `shangpintable` VALUES (4, 18, '香辣鸡腿汉堡', '15', 'sppic/18.jpg');
INSERT INTO `shangpintable` VALUES (4, 19, '香辣鸡腿汉堡套餐', '25', 'sppic/19.jpg');
INSERT INTO `shangpintable` VALUES (4, 20, '菠萝派', '13', 'sppic/20.jpg');
INSERT INTO `shangpintable` VALUES (4, 21, '水果果汁', '15', 'sppic/21.jpg');
INSERT INTO `shangpintable` VALUES (4, 22, '超级汉堡', '20', 'sppic/22.jpg');
INSERT INTO `shangpintable` VALUES (5, 23, '这是什么粥', '10', 'sppic/23.jpg');
INSERT INTO `shangpintable` VALUES (5, 24, '香菇粥', '11', 'sppic/24.jpg');
INSERT INTO `shangpintable` VALUES (5, 25, '不知道什么粥', '12', 'sppic/25.jpg');
INSERT INTO `shangpintable` VALUES (5, 26, '还是不知道什么粥', '13', 'sppic/26.jpg');
INSERT INTO `shangpintable` VALUES (5, 27, '应该是鸡翅套餐吧', '20', 'sppic/27.jpg');

-- ----------------------------
-- Table structure for shops
-- ----------------------------
DROP TABLE IF EXISTS `shops`;
CREATE TABLE `shops`  (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `saccount` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `spic` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `staringprice` double NOT NULL DEFAULT 0,
  `deliveryfee` double NOT NULL DEFAULT 0,
  `deliverytime` double NULL DEFAULT NULL,
  `opentime` time(0) NULL DEFAULT NULL,
  `closetime` time(0) NULL DEFAULT NULL,
  PRIMARY KEY (`sid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 22 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of shops
-- ----------------------------
INSERT INTO `shops` VALUES (1, '72街（江南大道店）', '72jie', '123', '1', '4000007272', '江南大道中348号柏丽酒店C座一楼自编D109号店铺', 20, 5, 35, '08:00:00', '21:00:00');
INSERT INTO `shops` VALUES (2, '真功夫（海印名店城店）', 'zgf', '123', '2', '123', '', 5, 6, 25, NULL, NULL);
INSERT INTO `shops` VALUES (3, '尊宝披萨（江湾店)', 'zbps', '123', '3', '123', '', 30, 5, 49, NULL, NULL);
INSERT INTO `shops` VALUES (4, '麦当劳(广州百里华庭餐厅)', 'mdl', '123', '4', '123', '', 0, 9, 22, NULL, NULL);
INSERT INTO `shops` VALUES (5, '绿茵阁(江南西店)', 'lyg', '123', '5', '123', '', 20, 6, 55, NULL, NULL);
INSERT INTO `shops` VALUES (6, '肯德基（万国广场店）', 'kfc', '123', '6', '123', '', 0, 9, 15, NULL, NULL);
INSERT INTO `shops` VALUES (7, '九龙冰室（江南新地店）', 'jlbs', '123', '7', '123', '', 20, 6, 35, NULL, NULL);
INSERT INTO `shops` VALUES (8, '红辣椒1996川菜馆', 'ccg', '123', '8', '123', '海珠区南村路1、3号', 20, 5, 35, NULL, NULL);
INSERT INTO `shops` VALUES (9, '西贝莜面村（广州万国广场店）', 'cbymc', '123', '9', '123', '', 20, 5, 35, NULL, NULL);
INSERT INTO `shops` VALUES (10, '九毛九山西手工面（广州万国广场店）', 'jmjsxsgm', '123', '10', '123', '', 20, 5, 35, NULL, NULL);
INSERT INTO `shops` VALUES (11, '大家乐（江南新地店）', 'djl1', '123', '11', '123', '', 30, 6, 35, NULL, NULL);
INSERT INTO `shops` VALUES (12, '大家乐（广州富景店店）', 'djl2', '123', '12', '123', '', 30, 6, 35, NULL, NULL);
INSERT INTO `shops` VALUES (13, '华记美食（基立道店）', 'hjms', '123', '13', '123', '', 0, 8, 35, NULL, NULL);
INSERT INTO `shops` VALUES (14, '卡朋西餐（江南新地店）', 'kpcc', '123', '14', '123', '', 27, 6, 35, NULL, NULL);
INSERT INTO `shops` VALUES (15, '乐凯撒比萨（广州万国广场店）', 'lksbs', '123', '15', '123', '', 0, 5, 35, NULL, NULL);
INSERT INTO `shops` VALUES (16, '大快活（江南西名城店店）', 'dkh', '123', '16', '123', '', 30, 6, 35, NULL, NULL);
INSERT INTO `shops` VALUES (17, '凤记美食（海联店)', 'fjms', '123', '17', '123', '', 25, 5, 53, NULL, NULL);
INSERT INTO `shops` VALUES (18, '惠食佳(滨江路店)', 'hsj', '123', '18', '123', '', 20, 7, 35, NULL, NULL);
INSERT INTO `shops` VALUES (19, '唐宴酒家(江南大道店)', 'thjj', '123', '19', '123', '', 20, 6, 35, NULL, NULL);
INSERT INTO `shops` VALUES (20, '骨头饭黄焖鸡米饭(前进路店', 'gtf', '123', '20', '123', '', 20, 4, 35, NULL, NULL);
INSERT INTO `shops` VALUES (21, '银记肠粉店（市二宫店）', 'yjcfd', '123', '21', '123', '', 20, 5, 53, NULL, NULL);

-- ----------------------------
-- Table structure for tbook
-- ----------------------------
DROP TABLE IF EXISTS `tbook`;
CREATE TABLE `tbook`  (
  `id` int(11) NOT NULL,
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `author` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `publisher` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `price` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of tbook
-- ----------------------------
INSERT INTO `tbook` VALUES (1, '灿烂千阳', '胡赛德', '四川师范大学出版社', 35);
INSERT INTO `tbook` VALUES (2, '世纪旅人', '安德烈斯·纽曼', '湖南师范大学出版社', 45);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'lhc', '123', '2');
INSERT INTO `user` VALUES (2, 'llj', '2', '2');
INSERT INTO `user` VALUES (3, 'lmy', '3', '3');
INSERT INTO `user` VALUES (5, '5', '5', '5');
INSERT INTO `user` VALUES (6, '6', '6', '6');
INSERT INTO `user` VALUES (7, '7', '7', '7');
INSERT INTO `user` VALUES (8, '8', '8', '8');
INSERT INTO `user` VALUES (9, '9', '9', '9');

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users`  (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `uaccount` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `upic` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '0',
  `phone` varchar(11) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  `address` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`uid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES (1, '李慧聪', 'lhc', '12345', '1', '123', '123');
INSERT INTO `users` VALUES (2, '李龙杰', 'llj', '12345', '2', '12345678910', '123');
INSERT INTO `users` VALUES (3, 'aaaaa', 'aaaaa', 'aaaaa', '0', '', '');
INSERT INTO `users` VALUES (4, 'aaaaa', 'aaaaa', 'aaaaa', '0', '', '');

SET FOREIGN_KEY_CHECKS = 1;
