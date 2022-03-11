use core;
CREATE TABLE EMP1 (
	ID int (2) NOT NULL PRIMARY KEY ,
	Name Varchar(10),
	Basic decimal(6,2),	
	Designation Varchar (10),
	Age  int(2));
    
    Alter Table EMP1  Modify column Basic int(10);
Alter Table EMP1  Modify column Name Varchar(15);
CREATE TABLE EMP_trainee (
	Emp_id int (2) NOT NULL PRIMARY KEY ,
	Name Varchar(15),
	Basic int(10),	
	Designation Varchar (10),
	Age  int(2));
    
    insert into EMP1 values(1,'Rohit',6700,'Manager',24);
      insert into EMP1 values(2,'Sunil',6200,'Engineer', 27);
      insert into EMP1 values(3,'Payal',6300,'Engineer',25);
      insert into EMP1 values(4,'Kunal',6700,'Trainee', 28);
      insert into EMP1 values(5,'Sunita',6230,'Trainee',26);
      insert into EMP1 values(6,'Bimal',7000,'Trainee','25');

Insert into emp_trainee  (select * from emp1 where designation = 'trainee');
SELECT * FROM core.emp1;
SELECT * FROM core.emp_trainee;


alter table emp1 add Skills Varchar(10);
alter table emp1 add DOJ date;
update emp1 set skills='java',Doj='1986-01-15' where Id=1;
update emp1 set skills='PHP',Doj='1987-12-20' where Id=2;
update emp1 set skills='HTML',Doj='1986-01-15' where Id=3;
update emp1 set skills='CSS',Doj='1987-12-20' where Id=4;
update emp1 set skills='JS',Doj='1986-01-15' where Id=5;
update emp1 set skills='java',Doj='1987-12-20' where Id=6;

update emp_trainee set Designation='Programmer' where Emp_id=4;
update emp_trainee set Designation='Programmer' where Emp_id=5;
update emp_trainee set Designation='Programmer' where Emp_id=6;

update emp1 set skills='paython',Doj='1997-01-15' where Id=1;

alter table emp1 modify ID varchar(5);
describe emp1;

SELECT * FROM emp1;
SELECT * FROM emp_trainee;

alter table emp1 rename column  Age to Age_in_Years;
 
 delete from EMP1 where Designation='Trainee' ;
 alter table emp_trainee drop column Age;
 
ALTER TABLE emp_trainee DROP column Designation , DROP column  Basic;

alter table emp1 rename EMP_Mgr_Engr  ;

SELECT * FROM core.emp_mgr_engr;
drop table emp_trainee;  
TRUNCATE TABLE emp_mgr_engr;