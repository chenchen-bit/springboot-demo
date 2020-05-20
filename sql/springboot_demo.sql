/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : 127.0.0.1:3306
 Source Schema         : springboot_demo

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 20/05/2020 16:54:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for blog
-- ----------------------------
DROP TABLE IF EXISTS `blog`;
CREATE TABLE `blog`  (
  `id` int(11) NOT NULL COMMENT 'id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `blog_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 博客名称',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户博客' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of blog
-- ----------------------------
INSERT INTO `blog` VALUES (1, 22, '风清扬的博客');
INSERT INTO `blog` VALUES (2, 23, '喀什的博客');

-- ----------------------------
-- Table structure for post
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post`  (
  `id` int(11) NOT NULL COMMENT 'id',
  `user_id` int(11) NULL DEFAULT NULL COMMENT '用户id',
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标题',
  `content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT ' 内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '文章' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES (1, 1, 'fl赔付金额破', '发生的故事广泛大锅饭大概');
INSERT INTO `post` VALUES (2, 1, '古典风格', '高热量好久哦恩反馈进度了');
INSERT INTO `post` VALUES (3, 23, 'fl赔付金额破', '发生的故事广泛大锅饭大概');
INSERT INTO `post` VALUES (4, 23, '古典风格', '高热量好久哦恩反馈进度了');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 104 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'chenchen', 'chenchen123');
INSERT INTO `user` VALUES (2, 'user1', '123456');
INSERT INTO `user` VALUES (3, 'user2', '123456');
INSERT INTO `user` VALUES (4, 'user3', '123456');
INSERT INTO `user` VALUES (5, 'user4', '123456');
INSERT INTO `user` VALUES (6, 'user5', '123456');
INSERT INTO `user` VALUES (7, 'user6', '123456');
INSERT INTO `user` VALUES (8, 'user7', '123456');
INSERT INTO `user` VALUES (9, 'user8', '123456');
INSERT INTO `user` VALUES (10, 'user9', '123456');
INSERT INTO `user` VALUES (11, 'user10', '123456');
INSERT INTO `user` VALUES (12, 'user11', '123456');
INSERT INTO `user` VALUES (13, 'user12', '123456');
INSERT INTO `user` VALUES (14, 'user13', '123456');
INSERT INTO `user` VALUES (15, 'user14', '123456');
INSERT INTO `user` VALUES (16, 'user15', '123456');
INSERT INTO `user` VALUES (17, 'user16', '123456');
INSERT INTO `user` VALUES (18, 'user17', '123456');
INSERT INTO `user` VALUES (19, 'user18', '123456');
INSERT INTO `user` VALUES (20, 'user19', '123456');
INSERT INTO `user` VALUES (21, 'user20', '123456');
INSERT INTO `user` VALUES (22, 'user21', '123456');
INSERT INTO `user` VALUES (23, 'user22', '123456');
INSERT INTO `user` VALUES (24, 'user23', '123456');
INSERT INTO `user` VALUES (25, 'user24', '123456');
INSERT INTO `user` VALUES (26, 'user25', '123456');
INSERT INTO `user` VALUES (27, 'user26', '123456');
INSERT INTO `user` VALUES (28, 'user27', '123456');
INSERT INTO `user` VALUES (29, 'user28', '123456');
INSERT INTO `user` VALUES (30, 'user29', '123456');
INSERT INTO `user` VALUES (31, 'user30', '123456');
INSERT INTO `user` VALUES (32, 'user31', '123456');
INSERT INTO `user` VALUES (33, 'user32', '123456');
INSERT INTO `user` VALUES (34, 'user33', '123456');
INSERT INTO `user` VALUES (35, 'user34', '123456');
INSERT INTO `user` VALUES (36, 'user35', '123456');
INSERT INTO `user` VALUES (37, 'user36', '123456');
INSERT INTO `user` VALUES (38, 'user37', '123456');
INSERT INTO `user` VALUES (39, 'user38', '123456');
INSERT INTO `user` VALUES (40, 'user39', '123456');
INSERT INTO `user` VALUES (41, 'user40', '123456');
INSERT INTO `user` VALUES (42, 'user41', '123456');
INSERT INTO `user` VALUES (43, 'user42', '123456');
INSERT INTO `user` VALUES (44, 'user43', '123456');
INSERT INTO `user` VALUES (45, 'user44', '123456');
INSERT INTO `user` VALUES (46, 'user45', '123456');
INSERT INTO `user` VALUES (47, 'user46', '123456');
INSERT INTO `user` VALUES (48, 'user47', '123456');
INSERT INTO `user` VALUES (49, 'user48', '123456');
INSERT INTO `user` VALUES (50, 'user49', '123456');
INSERT INTO `user` VALUES (51, 'user50', '123456');
INSERT INTO `user` VALUES (52, 'user51', '123456');
INSERT INTO `user` VALUES (53, 'user52', '123456');
INSERT INTO `user` VALUES (54, 'user53', '123456');
INSERT INTO `user` VALUES (55, 'user54', '123456');
INSERT INTO `user` VALUES (56, 'user55', '123456');
INSERT INTO `user` VALUES (57, 'user56', '123456');
INSERT INTO `user` VALUES (58, 'user57', '123456');
INSERT INTO `user` VALUES (59, 'user58', '123456');
INSERT INTO `user` VALUES (60, 'user59', '123456');
INSERT INTO `user` VALUES (61, 'user60', '123456');
INSERT INTO `user` VALUES (62, 'user61', '123456');
INSERT INTO `user` VALUES (63, 'user62', '123456');
INSERT INTO `user` VALUES (64, 'user63', '123456');
INSERT INTO `user` VALUES (65, 'user64', '123456');
INSERT INTO `user` VALUES (66, 'user65', '123456');
INSERT INTO `user` VALUES (67, 'user66', '123456');
INSERT INTO `user` VALUES (68, 'user67', '123456');
INSERT INTO `user` VALUES (69, 'user68', '123456');
INSERT INTO `user` VALUES (70, 'user69', '123456');
INSERT INTO `user` VALUES (71, 'user70', '123456');
INSERT INTO `user` VALUES (72, 'user71', '123456');
INSERT INTO `user` VALUES (73, 'user72', '123456');
INSERT INTO `user` VALUES (74, 'user73', '123456');
INSERT INTO `user` VALUES (75, 'user74', '123456');
INSERT INTO `user` VALUES (76, 'user75', '123456');
INSERT INTO `user` VALUES (77, 'user76', '123456');
INSERT INTO `user` VALUES (78, 'user77', '123456');
INSERT INTO `user` VALUES (79, 'user78', '123456');
INSERT INTO `user` VALUES (80, 'user79', '123456');
INSERT INTO `user` VALUES (81, 'user80', '123456');
INSERT INTO `user` VALUES (82, 'user81', '123456');
INSERT INTO `user` VALUES (83, 'user82', '123456');
INSERT INTO `user` VALUES (84, 'user83', '123456');
INSERT INTO `user` VALUES (85, 'user84', '123456');
INSERT INTO `user` VALUES (86, 'user85', '123456');
INSERT INTO `user` VALUES (87, 'user86', '123456');
INSERT INTO `user` VALUES (88, 'user87', '123456');
INSERT INTO `user` VALUES (89, 'user88', '123456');
INSERT INTO `user` VALUES (90, 'user89', '123456');
INSERT INTO `user` VALUES (91, 'user90', '123456');
INSERT INTO `user` VALUES (92, 'user91', '123456');
INSERT INTO `user` VALUES (93, 'user92', '123456');
INSERT INTO `user` VALUES (94, 'user93', '123456');
INSERT INTO `user` VALUES (95, 'user94', '123456');
INSERT INTO `user` VALUES (96, 'user95', '123456');
INSERT INTO `user` VALUES (97, 'user96', '123456');
INSERT INTO `user` VALUES (98, 'user97', '123456');
INSERT INTO `user` VALUES (99, 'user98', '123456');
INSERT INTO `user` VALUES (100, 'user99', '123456');
INSERT INTO `user` VALUES (101, 'bili1', '123456');
INSERT INTO `user` VALUES (102, 'bili2', '123456');
INSERT INTO `user` VALUES (103, 'bili3', '123456');

SET FOREIGN_KEY_CHECKS = 1;
