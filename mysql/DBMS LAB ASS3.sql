use core;
CREATE TABLE EMPLOYEE (
	EMPLOYEE_ID int(6) NOT NULL PRIMARY KEY ,
	LAST_NAME Varchar(25),
	JOB_ID Varchar(10),
	SALARY decimal (6,2),
	COMM_PCT decimal (6,2),
	MGR_ID  int(6),
    DEPARTMENT_ID int(4));
    
SELECT * FROM core.employee;

describe employee;
insert into employee values(198,'Connell','SH_CLERK',2600,2.5,124,50);
insert into employee values(199,'Grant','SH_CLERK',2600,2.2,124,50);
insert into employee values(200,'Whalen','AD_ASST',4400,1.3,101,10);
insert into employee values(201,'Hartstein','IT_PROG',6000,null,100,20);
insert into employee values(202,'Fay','AC_MGR',6500,null,210,20);
insert into employee values(203,'Mavris','AD_VP',7500,null,101,40);
insert into employee values(204,'Baer','AD_PRES',3500,1.5,101,90);
insert into employee values(205,'Higgins','AC_MGR',2300,null,101,60);
insert into employee values(206,'Gitz','IT_PROG',5000,null,103,60);
insert into employee values(100,'King','AD_ASST',8956,0.3,108,100);
insert into employee values(101,'Kochar','SH_CLERK',3400,1.3,118,30);

select LAST_NAME,JOB_ID,EMPLOYEE_ID from EMPLOYEE;

select * from EMPLOYEE where DEPARTMENT_ID=60;

select * from EMPLOYEE where LAST_NAME='King';
select distinct JOB_ID from EMPLOYEE;
Select last_name, (salary+300) As increased_salary from employee;

select EMPLOYEE_ID,DEPARTMENT_ID,SALARY from employee where SALARY>5000;
select EMPLOYEE_ID,SALARY from employee where SALARY between 5000 and 7000;
select * from EMPLOYEE where salary in(6000,6500,7000);
select * from EMPLOYEE where DEPARTMENT_ID in(10,20,30,50);
select * from EMPLOYEE where salary !=5000;
select * from EMPLOYEE where JOB_ID='SH_CLERK';

update EMPLOYEE set JOB_ID='Grade_A' where SALARY>5000.00;
select * from EMPLOYEE where JOB_ID in ('SH_CLERK','IT_PROG','AD_ASST');
select * from EMPLOYEE where JOB_ID = 'SH_CLERK' or SALARY<3000.00;
select LAST_NAME,MGR_ID from EMPLOYEE where SALARY>3000;