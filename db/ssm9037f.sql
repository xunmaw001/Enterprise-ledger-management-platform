-- MySQL dump 10.13  Distrib 5.7.31, for Linux (x86_64)
--
-- Host: localhost    Database: ssm9037f
-- ------------------------------------------------------
-- Server version	5.7.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `config`
--

DROP TABLE IF EXISTS `config`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '配置参数名称',
  `value` varchar(100) DEFAULT NULL COMMENT '配置参数值',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='配置文件';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `config`
--

LOCK TABLES `config` WRITE;
/*!40000 ALTER TABLE `config` DISABLE KEYS */;
INSERT INTO `config` VALUES (1,'picture1','http://localhost:8080/ssm9037f/upload/picture1.jpg'),(2,'picture2','http://localhost:8080/ssm9037f/upload/picture2.jpg'),(3,'picture3','http://localhost:8080/ssm9037f/upload/picture3.jpg'),(6,'homepage','http://localhost:8080/ssm9037f/upload/1609310665208.jpg');
/*!40000 ALTER TABLE `config` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `gongzi`
--

DROP TABLE IF EXISTS `gongzi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `gongzi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `biaoti` varchar(200) DEFAULT NULL COMMENT '标题',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `jibengongzi` int(11) DEFAULT NULL COMMENT '基本工资',
  `jiabanxinzi` int(11) DEFAULT NULL COMMENT '加班薪资',
  `queqinxinzi` int(11) DEFAULT NULL COMMENT '缺勤薪资',
  `gaowenbutie` int(11) DEFAULT NULL COMMENT '高温补贴',
  `gonglingjiang` int(11) DEFAULT NULL COMMENT '工龄奖',
  `shifagongzi` int(11) DEFAULT NULL COMMENT '实发工资',
  `dengjishijian` date DEFAULT NULL COMMENT '登记时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310617533 DEFAULT CHARSET=utf8 COMMENT='工资';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `gongzi`
--

LOCK TABLES `gongzi` WRITE;
/*!40000 ALTER TABLE `gongzi` DISABLE KEYS */;
INSERT INTO `gongzi` VALUES (21,'2020-12-30 06:34:54','标题1','员工工号1','员工姓名1',1,1,1,1,1,1,'2020-12-30'),(22,'2020-12-30 06:34:54','标题2','员工工号2','员工姓名2',2,2,2,2,2,2,'2020-12-30'),(23,'2020-12-30 06:34:54','标题3','员工工号3','员工姓名3',3,3,3,3,3,3,'2020-12-30'),(24,'2020-12-30 06:34:54','标题4','员工工号4','员工姓名4',4,4,4,4,4,4,'2020-12-30'),(25,'2020-12-30 06:34:54','标题5','员工工号5','员工姓名5',5,5,5,5,5,5,'2020-12-30'),(26,'2020-12-30 06:34:54','标题6','员工工号6','员工姓名6',6,6,6,6,6,6,'2020-12-30'),(1609310617532,'2020-12-30 06:43:36','2020年12月工资','123','胡月',2000,200,100,100,500,2700,'2020-12-30');
/*!40000 ALTER TABLE `gongzi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `userid` bigint(20) NOT NULL COMMENT '留言人id',
  `username` varchar(200) DEFAULT NULL COMMENT '用户名',
  `content` longtext NOT NULL COMMENT '留言内容',
  `reply` longtext COMMENT '回复内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310773318 DEFAULT CHARSET=utf8 COMMENT='留言板';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (81,'2020-12-30 06:34:54',1,'用户名1','留言内容1','回复内容1'),(82,'2020-12-30 06:34:54',2,'用户名2','留言内容2','回复内容2'),(83,'2020-12-30 06:34:54',3,'用户名3','留言内容3','回复内容3'),(84,'2020-12-30 06:34:54',4,'用户名4','留言内容4','回复内容4'),(85,'2020-12-30 06:34:54',5,'用户名5','留言内容5','回复内容5'),(86,'2020-12-30 06:34:54',6,'用户名6','留言内容6','回复内容6'),(1609310773317,'2020-12-30 06:46:12',1609310582377,'123','2632566','11');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `news`
--

DROP TABLE IF EXISTS `news`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `news` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `title` varchar(200) NOT NULL COMMENT '标题',
  `picture` varchar(200) NOT NULL COMMENT '图片',
  `content` longtext NOT NULL COMMENT '内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310690539 DEFAULT CHARSET=utf8 COMMENT='公司公告';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `news`
--

LOCK TABLES `news` WRITE;
/*!40000 ALTER TABLE `news` DISABLE KEYS */;
INSERT INTO `news` VALUES (71,'2020-12-30 06:34:54','标题1','http://localhost:8080/ssm9037f/upload/news_picture1.jpg','内容1'),(72,'2020-12-30 06:34:54','标题2','http://localhost:8080/ssm9037f/upload/news_picture2.jpg','内容2'),(73,'2020-12-30 06:34:54','标题3','http://localhost:8080/ssm9037f/upload/news_picture3.jpg','内容3'),(74,'2020-12-30 06:34:54','标题4','http://localhost:8080/ssm9037f/upload/news_picture4.jpg','内容4'),(75,'2020-12-30 06:34:54','标题5','http://localhost:8080/ssm9037f/upload/news_picture5.jpg','内容5'),(76,'2020-12-30 06:34:54','标题6','http://localhost:8080/ssm9037f/upload/news_picture6.jpg','内容6'),(1609310690538,'2020-12-30 06:44:49','最新资讯','http://localhost:8080/ssm9037f/upload/1609310681651.jpg','<p>范德萨范德萨反对凯撒就分开了打开拉萨卡发来的撒了房贷范德萨<img src=\"http://localhost:8080/ssm9037f/upload/1609310689008.jpg\"></p>');
/*!40000 ALTER TABLE `news` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `qingjiaxinxi`
--

DROP TABLE IF EXISTS `qingjiaxinxi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `qingjiaxinxi` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `qingjiayuanyin` longtext COMMENT '请假原因',
  `qingjiashijian` date DEFAULT NULL COMMENT '请假时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310821029 DEFAULT CHARSET=utf8 COMMENT='请假信息';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `qingjiaxinxi`
--

LOCK TABLES `qingjiaxinxi` WRITE;
/*!40000 ALTER TABLE `qingjiaxinxi` DISABLE KEYS */;
INSERT INTO `qingjiaxinxi` VALUES (61,'2020-12-30 06:34:54','员工工号1','员工姓名1','部门1','请假原因1','2020-12-30','否',''),(62,'2020-12-30 06:34:54','员工工号2','员工姓名2','部门2','请假原因2','2020-12-30','否',''),(63,'2020-12-30 06:34:54','员工工号3','员工姓名3','部门3','请假原因3','2020-12-30','否',''),(64,'2020-12-30 06:34:54','员工工号4','员工姓名4','部门4','请假原因4','2020-12-30','否',''),(65,'2020-12-30 06:34:54','员工工号5','员工姓名5','部门5','请假原因5','2020-12-30','否',''),(66,'2020-12-30 06:34:54','员工工号6','员工姓名6','部门6','请假原因6','2020-12-30','否',''),(1609310821028,'2020-12-30 06:47:00','123','胡月','人事部','<p>幅度萨芬都市范德萨范德萨范德萨</p>','2020-12-30','是','11');
/*!40000 ALTER TABLE `qingjiaxinxi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `token`
--

DROP TABLE IF EXISTS `token`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `token` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `userid` bigint(20) NOT NULL COMMENT '用户id',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `tablename` varchar(100) DEFAULT NULL COMMENT '表名',
  `role` varchar(100) DEFAULT NULL COMMENT '角色',
  `token` varchar(200) NOT NULL COMMENT '密码',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  `expiratedtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '过期时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='token表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `token`
--

LOCK TABLES `token` WRITE;
/*!40000 ALTER TABLE `token` DISABLE KEYS */;
INSERT INTO `token` VALUES (1,1,'abo','users','管理员','yksncl3piithxpgb94p5rmxctu8hdvy9','2020-12-30 06:41:47','2020-12-30 07:47:10'),(2,1609310582377,'123','yuangong','员工','52is3juzkc52ra5nae5aw7eyl59zmweu','2020-12-30 06:45:11','2020-12-30 07:48:05');
/*!40000 ALTER TABLE `token` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(100) NOT NULL COMMENT '用户名',
  `password` varchar(100) NOT NULL COMMENT '密码',
  `role` varchar(100) DEFAULT '管理员' COMMENT '角色',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '新增时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='用户表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'abo','abo','管理员','2020-12-30 06:34:54');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wupinku`
--

DROP TABLE IF EXISTS `wupinku`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wupinku` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinbianhao` varchar(200) DEFAULT NULL COMMENT '物品编号',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `weizhi` varchar(200) DEFAULT NULL COMMENT '位置',
  `guige` varchar(200) DEFAULT NULL COMMENT '规格',
  `xiangqing` longtext COMMENT '详情',
  PRIMARY KEY (`id`),
  UNIQUE KEY `wupinbianhao` (`wupinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310650432 DEFAULT CHARSET=utf8 COMMENT='物品库';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wupinku`
--

LOCK TABLES `wupinku` WRITE;
/*!40000 ALTER TABLE `wupinku` DISABLE KEYS */;
INSERT INTO `wupinku` VALUES (31,'2020-12-30 06:34:54','物品编号1','物品名称1','http://localhost:8080/ssm9037f/upload/wupinku_tupian1.jpg',1,'位置1','规格1','详情1'),(32,'2020-12-30 06:34:54','物品编号2','物品名称2','http://localhost:8080/ssm9037f/upload/wupinku_tupian2.jpg',2,'位置2','规格2','详情2'),(33,'2020-12-30 06:34:54','物品编号3','物品名称3','http://localhost:8080/ssm9037f/upload/wupinku_tupian3.jpg',3,'位置3','规格3','详情3'),(34,'2020-12-30 06:34:54','物品编号4','物品名称4','http://localhost:8080/ssm9037f/upload/wupinku_tupian4.jpg',4,'位置4','规格4','详情4'),(35,'2020-12-30 06:34:54','物品编号5','物品名称5','http://localhost:8080/ssm9037f/upload/wupinku_tupian5.jpg',5,'位置5','规格5','详情5'),(36,'2020-12-30 06:34:54','物品编号6','物品名称6','http://localhost:8080/ssm9037f/upload/wupinku_tupian6.jpg',6,'位置6','规格6','详情6'),(1609310650431,'2020-12-30 06:44:09','1609310989057','文件夹','http://localhost:8080/ssm9037f/upload/1609310627148.jpg',100,'一号仓库','中号','<p>发数据来看发的卡拉撒开发了的撒考虑房地产撒范德萨的<img src=\"http://localhost:8080/ssm9037f/upload/1609310648828.jpg\"></p>');
/*!40000 ALTER TABLE `wupinku` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wupinshangbao`
--

DROP TABLE IF EXISTS `wupinshangbao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wupinshangbao` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `tupian` varchar(200) DEFAULT NULL COMMENT '图片',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `neirong` longtext COMMENT '内容',
  `shenqingshijian` date DEFAULT NULL COMMENT '申请时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310812755 DEFAULT CHARSET=utf8 COMMENT='物品上报';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wupinshangbao`
--

LOCK TABLES `wupinshangbao` WRITE;
/*!40000 ALTER TABLE `wupinshangbao` DISABLE KEYS */;
INSERT INTO `wupinshangbao` VALUES (51,'2020-12-30 06:34:54','物品名称1',1,'http://localhost:8080/ssm9037f/upload/wupinshangbao_tupian1.jpg','员工工号1','员工姓名1','部门1','内容1','2020-12-30','否',''),(52,'2020-12-30 06:34:54','物品名称2',2,'http://localhost:8080/ssm9037f/upload/wupinshangbao_tupian2.jpg','员工工号2','员工姓名2','部门2','内容2','2020-12-30','否',''),(53,'2020-12-30 06:34:54','物品名称3',3,'http://localhost:8080/ssm9037f/upload/wupinshangbao_tupian3.jpg','员工工号3','员工姓名3','部门3','内容3','2020-12-30','否',''),(54,'2020-12-30 06:34:54','物品名称4',4,'http://localhost:8080/ssm9037f/upload/wupinshangbao_tupian4.jpg','员工工号4','员工姓名4','部门4','内容4','2020-12-30','否',''),(55,'2020-12-30 06:34:54','物品名称5',5,'http://localhost:8080/ssm9037f/upload/wupinshangbao_tupian5.jpg','员工工号5','员工姓名5','部门5','内容5','2020-12-30','否',''),(56,'2020-12-30 06:34:54','物品名称6',6,'http://localhost:8080/ssm9037f/upload/wupinshangbao_tupian6.jpg','员工工号6','员工姓名6','部门6','内容6','2020-12-30','否',''),(1609310812754,'2020-12-30 06:46:52','笔',50,'http://localhost:8080/ssm9037f/upload/1609310808935.jpg','123','胡月','人事部','<p>非常的撒啊范德萨房贷</p>','2020-12-30','是','11');
/*!40000 ALTER TABLE `wupinshangbao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wupinshenqing`
--

DROP TABLE IF EXISTS `wupinshenqing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wupinshenqing` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `wupinbianhao` varchar(200) DEFAULT NULL COMMENT '物品编号',
  `wupinmingcheng` varchar(200) DEFAULT NULL COMMENT '物品名称',
  `shuliang` int(11) DEFAULT NULL COMMENT '数量',
  `shenqingneirong` longtext COMMENT '申请内容',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `shenqingshijian` date DEFAULT NULL COMMENT '申请时间',
  `sfsh` varchar(200) DEFAULT '否' COMMENT '是否审核',
  `shhf` longtext COMMENT '审核回复',
  PRIMARY KEY (`id`),
  UNIQUE KEY `wupinbianhao` (`wupinbianhao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310758952 DEFAULT CHARSET=utf8 COMMENT='物品申请';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wupinshenqing`
--

LOCK TABLES `wupinshenqing` WRITE;
/*!40000 ALTER TABLE `wupinshenqing` DISABLE KEYS */;
INSERT INTO `wupinshenqing` VALUES (41,'2020-12-30 06:34:54','物品编号1','物品名称1',1,'申请内容1','员工工号1','员工姓名1','部门1','2020-12-30','否',''),(42,'2020-12-30 06:34:54','物品编号2','物品名称2',2,'申请内容2','员工工号2','员工姓名2','部门2','2020-12-30','否',''),(43,'2020-12-30 06:34:54','物品编号3','物品名称3',3,'申请内容3','员工工号3','员工姓名3','部门3','2020-12-30','否',''),(44,'2020-12-30 06:34:54','物品编号4','物品名称4',4,'申请内容4','员工工号4','员工姓名4','部门4','2020-12-30','否',''),(45,'2020-12-30 06:34:54','物品编号5','物品名称5',5,'申请内容5','员工工号5','员工姓名5','部门5','2020-12-30','否',''),(46,'2020-12-30 06:34:54','物品编号6','物品名称6',6,'申请内容6','员工工号6','员工姓名6','部门6','2020-12-30','否',''),(1609310758951,'2020-12-30 06:45:58','1609310989057','文件夹',20,'<p>kfdsl;ak fldsk alfdlsa lfdksal fkldsdsa fdsa fkdasj kfdjask fdsa lfdsk lfdsl kla kfldsa klfkdlsakfld skalfkdlsa kfldkslfkdls kfd&nbsp;</p>','123','胡月','人事部','2020-12-30','是','11');
/*!40000 ALTER TABLE `wupinshenqing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `yuangong`
--

DROP TABLE IF EXISTS `yuangong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `yuangong` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `yuangonggonghao` varchar(200) DEFAULT NULL COMMENT '员工工号',
  `yuangongxingming` varchar(200) DEFAULT NULL COMMENT '员工姓名',
  `mima` varchar(200) DEFAULT NULL COMMENT '密码',
  `bumen` varchar(200) DEFAULT NULL COMMENT '部门',
  `xingbie` varchar(200) DEFAULT NULL COMMENT '性别',
  `lianxidianhua` varchar(200) DEFAULT NULL COMMENT '联系电话',
  `youxiang` varchar(200) DEFAULT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(200) DEFAULT NULL COMMENT '身份证',
  `jiatingzhuzhi` varchar(200) DEFAULT NULL COMMENT '家庭住址',
  PRIMARY KEY (`id`),
  UNIQUE KEY `yuangonggonghao` (`yuangonggonghao`)
) ENGINE=InnoDB AUTO_INCREMENT=1609310582378 DEFAULT CHARSET=utf8 COMMENT='员工';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `yuangong`
--

LOCK TABLES `yuangong` WRITE;
/*!40000 ALTER TABLE `yuangong` DISABLE KEYS */;
INSERT INTO `yuangong` VALUES (11,'2020-12-30 06:34:54','员工1','员工姓名1','123456','部门1','男','13823888881','773890001@qq.com','440300199101010001','家庭住址1'),(12,'2020-12-30 06:34:54','员工2','员工姓名2','123456','部门2','男','13823888882','773890002@qq.com','440300199202020002','家庭住址2'),(13,'2020-12-30 06:34:54','员工3','员工姓名3','123456','部门3','男','13823888883','773890003@qq.com','440300199303030003','家庭住址3'),(14,'2020-12-30 06:34:54','员工4','员工姓名4','123456','部门4','男','13823888884','773890004@qq.com','440300199404040004','家庭住址4'),(15,'2020-12-30 06:34:54','员工5','员工姓名5','123456','部门5','男','13823888885','773890005@qq.com','440300199505050005','家庭住址5'),(16,'2020-12-30 06:34:54','员工6','员工姓名6','123456','部门6','男','13823888886','773890006@qq.com','440300199606060006','家庭住址6'),(1609310582377,'2020-12-30 06:43:02','123','胡月','123','人事部','男','13513513525','56566@qq.com','123456789789456','阳光花园');
/*!40000 ALTER TABLE `yuangong` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-30 18:05:56
