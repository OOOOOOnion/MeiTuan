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

 Date: 12/06/2018 11:01:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
