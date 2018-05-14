/*
Navicat MySQL Data Transfer

Source Server         : Localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : meituan

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-08 15:43:38
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `shops`
-- ----------------------------
DROP TABLE IF EXISTS `shops`;
CREATE TABLE `shops` (
  `sid` int(11) NOT NULL AUTO_INCREMENT,
  `sname` varchar(20) NOT NULL,
  `saccount` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `spic` varchar(50) DEFAULT '0',
  `phone` varchar(11) NOT NULL,
  `address` varchar(50) NOT NULL,
  `staringprice` double NOT NULL DEFAULT '0',
  `Deliveryfee` double NOT NULL DEFAULT '0',
  `DeliveryTime` time NOT NULL DEFAULT '00:00:00',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of shops
-- ----------------------------
INSERT INTO `shops` VALUES ('1', '72街', '72jie', '123', '123', '123', '江南大道', '20', '5', '00:00:00');
INSERT INTO `shops` VALUES ('2', '真功夫', 'zgf', '123', '2', '123', '海印名店城', '5', '6', '00:00:00');
INSERT INTO `shops` VALUES ('3', '尊宝披萨', 'zbps', '123', '3', '123', '江湾', '30', '5', '00:00:00');
INSERT INTO `shops` VALUES ('4', '麦当劳', 'mdl', '123', '4', '123', '广州百里华庭餐厅', '0', '9', '00:00:00');
INSERT INTO `shops` VALUES ('5', '绿茵阁', 'lyg', '123', '5', '123', '江南西', '20', '6', '00:00:00');
INSERT INTO `shops` VALUES ('6', '肯德基', 'kfc', '123', '6', '123', '万国广场', '0', '9', '00:00:00');
INSERT INTO `shops` VALUES ('7', '九龙冰室', 'jlbs', '123', '7', '123', '江南新地', '20', '6', '00:00:00');
INSERT INTO `shops` VALUES ('8', '红辣椒1996川菜馆', 'ccg', '123', '8', '123', '海珠区南村路1、3号', '20', '5', '00:00:50');
INSERT INTO `shops` VALUES ('9', '西贝莜面村', 'cbymc', '123', '9', '123', '广州万国广场', '20', '5', '00:00:50');
INSERT INTO `shops` VALUES ('10', '九毛九山西手工面', 'jmjsxsgm', '123', '10', '123', '广州万国广场', '20', '5', '00:00:50');
INSERT INTO `shops` VALUES ('11', '大家乐', 'djl1', '123', '11', '123', '江南新地', '30', '6', '00:00:50');
INSERT INTO `shops` VALUES ('12', '大家乐', 'djl2', '123', '12', '123', '广州富景店', '30', '6', '00:00:50');
INSERT INTO `shops` VALUES ('13', '华记美食', 'hjms', '123', '13', '123', '基立道', '0', '8', '00:00:45');
INSERT INTO `shops` VALUES ('14', '卡朋西餐', 'kpcc', '123', '14', '123', '江南新地', '27', '6', '00:00:50');
INSERT INTO `shops` VALUES ('15', '乐凯撒比萨', 'lksbs', '123', '15', '123', '广州万国广场', '0', '5', '00:00:38');
INSERT INTO `shops` VALUES ('16', '大快活', 'dkh', '123', '16', '123', '江南西名城店', '30', '6', '00:00:47');
INSERT INTO `shops` VALUES ('17', '凤记美食', 'fjms', '123', '17', '123', '海联店', '25', '5', '00:00:30');
INSERT INTO `shops` VALUES ('18', '惠食佳', 'hsj', '123', '18', '123', '滨江路店', '20', '7', '00:00:50');
INSERT INTO `shops` VALUES ('19', '唐宴酒家', 'thjj', '123', '19', '123', '江南大道', '20', '6', '00:00:50');
INSERT INTO `shops` VALUES ('20', '骨头饭黄焖鸡米饭', 'gtf', '123', '20', '123', '前进路', '20', '4', '00:00:45');
INSERT INTO `shops` VALUES ('21', '银记肠粉店', 'yjcfd', '123', '21', '123', '市二宫', '20', '5', '00:00:38');
