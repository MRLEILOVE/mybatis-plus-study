/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.21-log : Database - mybatis_plus_study
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mybatis_plus_study` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mybatis_plus_study`;

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(10) NOT NULL COMMENT '名称',
  `staff_num` tinyint(4) NOT NULL COMMENT '员工数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COMMENT='部门';

/*Data for the table `department` */

insert  into `department`(`id`,`name`,`staff_num`) values 
(1,'技术部',10),
(2,'财务部',8);

/*Table structure for table `staff` */

DROP TABLE IF EXISTS `staff`;

CREATE TABLE `staff` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(10) NOT NULL COMMENT '姓名',
  `age` tinyint(4) NOT NULL COMMENT '年龄',
  `work_age` tinyint(4) NOT NULL COMMENT '工龄',
  `wages` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '工资(月)',
  `d_id` bigint(20) NOT NULL COMMENT '部门id',
  `version` int(11) NOT NULL COMMENT '版本，乐观锁',
  PRIMARY KEY (`id`),
  KEY `d_id` (`d_id`),
  CONSTRAINT `staff_ibfk_1` FOREIGN KEY (`d_id`) REFERENCES `department` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='员工';

/*Data for the table `staff` */

insert  into `staff`(`id`,`name`,`age`,`work_age`,`wages`,`d_id`,`version`) values 
(1,'tom',50,2,5000.00,1,4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
