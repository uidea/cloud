/*
SQLyog Enterprise v12.09 (32 bit)
MySQL - 5.6.21-log : Database - cloud
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cloud` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `cloud`;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` varchar(225) NOT NULL,
  `name` varchar(225) DEFAULT NULL,
  `age` varchar(225) DEFAULT NULL,
  `sex` varchar(225) DEFAULT NULL,
  `idNo` varchar(225) DEFAULT NULL,
  `address` varchar(225) DEFAULT NULL,
  `edu` float DEFAULT NULL,
  `dept` float DEFAULT NULL,
  `telNo` varchar(225) DEFAULT NULL,
  `lastModifyDate` varchar(225) DEFAULT NULL,
  `lastModifyUser` varchar(225) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`age`,`sex`,`idNo`,`address`,`edu`,`dept`,`telNo`,`lastModifyDate`,`lastModifyUser`) values ('1','dsfg','sdfg','sdf','asd','asd',1,1,'1','1','1'),('2','asdf','asd','2','2','2',2,2,'2','2','2'),('3','fh','3','4','3','45',567,7,'78','67',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
