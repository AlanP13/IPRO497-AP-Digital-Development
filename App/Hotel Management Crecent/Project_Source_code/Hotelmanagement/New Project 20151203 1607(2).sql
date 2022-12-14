-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.27-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema hotelmanagement
--

CREATE DATABASE IF NOT EXISTS hotelmanagement;
USE hotelmanagement;

--
-- Definition of table `admin`
--

DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `adminid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `fathersname` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `contactno` varchar(45) NOT NULL,
  `maritalstatus` varchar(45) NOT NULL,
  `emailid` varchar(45) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  `state` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `address` varchar(45) NOT NULL,
  `idproof` varchar(45) NOT NULL,
  `idno` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`adminid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `admin`
--

/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` (`adminid`,`title`,`firstname`,`lastname`,`fathersname`,`gender`,`dob`,`contactno`,`maritalstatus`,`emailid`,`nationality`,`state`,`city`,`address`,`idproof`,`idno`,`password`) VALUES 
 (1,'Mr.','Prashant','Soni','P.N Soni','Male','07-08-1991','9981058108','Single','prashant572','India','Madhya Pradesh','Bhopal','189 Sector-C Indrapuri','Driving Licence','FKC3200BV','54321');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;


--
-- Definition of table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `customerid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `fathersname` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `contactno` varchar(45) NOT NULL,
  `maritalstatus` varchar(45) NOT NULL,
  `emailid` varchar(45) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `idproof` varchar(45) NOT NULL,
  `idno` varchar(45) NOT NULL,
  PRIMARY KEY (`customerid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `customer`
--

/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` (`customerid`,`title`,`firstname`,`lastname`,`fathersname`,`gender`,`dob`,`contactno`,`maritalstatus`,`emailid`,`nationality`,`state`,`city`,`address`,`idproof`,`idno`) VALUES 
 (1,'Mr.','Anshul','Garg','A K Gupta','Male','27-10-1991','8103019592','Single','anshul.garg079@gmail.com','India','Uttar Pradesh','Jhansi','Jhansi','Aadhar Card','sdnufhiusdhfs'),
 (2,'Mr.','Anil','Patel','R A Patel','Male','18/01/1993','11234567890','Single','sdhjsd','India','Madhya Pradesh','Bhopal','bhopal','Aadhar Card','shdfukdsj');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


--
-- Definition of table `employee`
--

DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `employeeid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(45) NOT NULL,
  `firstname` varchar(45) NOT NULL,
  `lastname` varchar(45) NOT NULL,
  `fathersname` varchar(45) NOT NULL,
  `gender` varchar(45) NOT NULL,
  `dob` varchar(45) NOT NULL,
  `contactno` varchar(45) NOT NULL,
  `maritalstatus` varchar(45) NOT NULL,
  `emailid` varchar(45) NOT NULL,
  `nationality` varchar(45) NOT NULL,
  `state` varchar(45) NOT NULL,
  `city` varchar(45) NOT NULL,
  `address` varchar(45) NOT NULL,
  `idproof` varchar(45) NOT NULL,
  `idno` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`employeeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `employee`
--

/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;


--
-- Definition of table `roomdetail`
--

DROP TABLE IF EXISTS `roomdetail`;
CREATE TABLE `roomdetail` (
  `roomdetailid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `totalroom` int(10) unsigned NOT NULL,
  `checkin` varchar(45) NOT NULL,
  `checkout` varchar(45) NOT NULL,
  `date` varchar(45) NOT NULL,
  `paymentoption` varchar(45) NOT NULL,
  `amount` int(10) unsigned NOT NULL,
  `customerid` int(10) unsigned NOT NULL,
  `customername` varchar(45) NOT NULL,
  `roomtype1` varchar(45) NOT NULL,
  `roomtype2` varchar(45) DEFAULT NULL,
  `roomno1` int(10) unsigned NOT NULL,
  `roomno2` int(10) unsigned DEFAULT NULL,
  PRIMARY KEY (`roomdetailid`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `roomdetail`
--

/*!40000 ALTER TABLE `roomdetail` DISABLE KEYS */;
INSERT INTO `roomdetail` (`roomdetailid`,`totalroom`,`checkin`,`checkout`,`date`,`paymentoption`,`amount`,`customerid`,`customername`,`roomtype1`,`roomtype2`,`roomno1`,`roomno2`) VALUES 
 (1,0,'11-11-2015','19-11-2015','19-11-2015','Cash',3523,1,'Anshul','null','null',0,0),
 (2,2,'19-11-2015','27-11-2015','28-11-2015','Debit Card',16000,2,'Anil','Delux','Single',105,102),
 (3,1,'11-11-2015','19-11-2015','19-11-2015','Cash',3523,1,'Anshul','Single','No',101,0),
 (4,1,'11-11-2015','19-11-2015','19-11-2015','Cash',3523,1,'Anshul','Single','No',101,0),
 (5,1,'11-11-2015','19-11-2015','19-11-2015','Cash',3523,1,'Anshul','Single','No',101,0),
 (6,2,'11-11-2015','19-11-2015','19-11-2015','Cash',3523,1,'Anshul','Single','Single',101,102),
 (7,2,'11-11-2015','19-11-2015','19-11-2015','Cash',3523,1,'Anshul','Single','Single',101,102),
 (8,2,'25-12-2015','null','null','null',800,2,'Anil','Single','No',101,0),
 (9,2,'31-12-2015','null','null','null',800,1,'Anshul','Single','No',101,0),
 (10,1,'01-12-2015','null','null','null',800,1,'Anshul','Single','No',101,0),
 (11,1,'02-12-2015','null','null','null',2300,1,'Anshul','Single','Delux',101,104);
/*!40000 ALTER TABLE `roomdetail` ENABLE KEYS */;


--
-- Definition of table `roominsert`
--

DROP TABLE IF EXISTS `roominsert`;
CREATE TABLE `roominsert` (
  `roominsertid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `roomno` int(10) unsigned NOT NULL,
  `roomtype` varchar(45) NOT NULL,
  `roomprice` int(10) unsigned NOT NULL,
  `availability` varchar(45) NOT NULL,
  PRIMARY KEY (`roominsertid`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `roominsert`
--

/*!40000 ALTER TABLE `roominsert` DISABLE KEYS */;
INSERT INTO `roominsert` (`roominsertid`,`roomno`,`roomtype`,`roomprice`,`availability`) VALUES 
 (1,101,'Single',800,'NA'),
 (2,102,'Single',800,'NA'),
 (3,103,'Single',800,'A'),
 (4,104,'Delux',1500,'NA'),
 (5,105,'Delux',1500,'A'),
 (6,106,'Delux',1500,'A'),
 (7,107,'Gold',1800,'A'),
 (8,108,'Platinum',2500,'A'),
 (9,109,'Platinum',2500,'A'),
 (10,110,'Gold',1800,'A');
/*!40000 ALTER TABLE `roominsert` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
