CREATE DATABASE `book_admin`;

USE `book_admin`;

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
                        `book_id` int NOT NULL AUTO_INCREMENT,
                        `book_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                        `book_writer` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                        `book_publish` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                        `book_status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
                        PRIMARY KEY (`book_id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;

insert  into `book`(`book_id`,`book_name`,`book_writer`,`book_publish`,`book_status`) values (1,'高等数学','张宇','清华大学出版社','0'),(2,'C语言','郭天祥','北京出版社','1'),(3,'Java2','张跃平','同济大学出版社','0'),(4,'JavaWeb','耿一','同济大学出版社','0'),(5,'鸟哥的Linux私房菜','鸟哥','机械工业出版社','0'),(6,'MySQL必知必会','刘晓霞','人民邮电出版社','0');




CREATE DATABASE `student_manager`;

USE `student_manager`;


DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
                            `id` int NOT NULL AUTO_INCREMENT,
                            `name` varchar(12) DEFAULT NULL,
                            `phone6` varchar(15) DEFAULT NULL,
                            `phone5` varchar(15) DEFAULT NULL,
                            `phone4` varchar(15) DEFAULT NULL,
                            `phone3` varchar(15) DEFAULT NULL,
                            `phone2` varchar(15) DEFAULT NULL,
                            `phone1` varchar(15) DEFAULT NULL,
                            `sex` varchar(23) DEFAULT NULL,
                            `age` int DEFAULT NULL,
                            `tel` varchar(20) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;


