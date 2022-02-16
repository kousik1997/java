create database Koushik;

 use koushik;
 create table student(
 id int not null primary key,
 name varchar (50) not null,
 address varchar (30) not null);
 
 SELECT * FROM koushik.student;
 
 insert into student values(1,'koushik','Dankuni');
