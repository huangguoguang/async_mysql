CREATE DATABASE IF NOT EXISTS huangguang DEFAULT CHARSET=utf8 COLLATE utf8_bin;
DROP TABLE IF EXISTS t_student;
CREATE TABLE `t_student` (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `name` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '姓名',
  `sex` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '性别',
	 birth VARCHAR(10) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '出生年份',
	 department VARCHAR(20) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '院系',
	 address VARCHAR(50) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '家庭住址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS t_score;
CREATE TABLE `t_score` (
  `id` varchar(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
   stu_id VARCHAR(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '学号',
	 c_name VARCHAR(32) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '课程名',
	 `grade` int(10) NOT NULL DEFAULT '0' COMMENT '分数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO t_student VALUES( 901,'张老大', '男',1985,'计算机系', '北京市海淀区');
INSERT INTO t_student VALUES( 902,'张老二', '男',1986,'中文系', '北京市昌平区');
INSERT INTO t_student VALUES( 903,'张三', '女',1990,'中文系', '湖南省永州市');
INSERT INTO t_student VALUES( 904,'李四', '男',1990,'英语系', '辽宁省阜新市');
INSERT INTO t_student VALUES( 905,'王五', '女',1991,'英语系', '福建省厦门市');
INSERT INTO t_student VALUES( 906,'王六', '男',1988,'计算机系', '湖南省衡阳市');


INSERT INTO t_score VALUES('1101',901, '计算机',98);
INSERT INTO t_score VALUES('1102',901, '英语', 80);
INSERT INTO t_score VALUES('1103',902, '计算机',65);
INSERT INTO t_score VALUES('1104',902, '中文',88);
INSERT INTO t_score VALUES('1105',903, '中文',95);
INSERT INTO t_score VALUES('1106',904, '计算机',70);
INSERT INTO t_score VALUES('1107',904, '英语',92);
INSERT INTO t_score VALUES('1108',905, '英语',94);
INSERT INTO t_score VALUES('1109',906, '计算机',90);
INSERT INTO t_score VALUES('1110',906, '英语',85);

select * from t_student;
select * from t_score;