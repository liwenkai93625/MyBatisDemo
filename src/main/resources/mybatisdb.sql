CREATE database mybatisdb;
use mybatisdb;

DROP TABLE if EXISTS student;
create table student(
  sid int(10) not null ,
  name varchar(10) ,
  sex varchar(10),
  tid int(10),
  PRIMARY key (sid)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

drop table if EXISTS teacher;
create table teacher(
  tid int(10) not null,
  name varchar(10),
  sex varchar(10),
  cla varchar(10),
  PRIMARY KEY (tid)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;