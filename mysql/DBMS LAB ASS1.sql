use core;
CREATE TABLE CUSTOMER (
	Cust_id Varchar (5) NOT NULL PRIMARY KEY ,
	Fname Varchar(15),
	Lname Varchar(15),
	Area Char (2),
	Phone Varchar (10),
	DOB  Date,
    Payment decimal(6,2)
);
describe customer;
insert into customer values('A01','Ivan','Ross','SA','6125467','1986-01-15',800.50);
insert into customer values('A02','Vandana','Ray','MU','5560379','1987-12-20',1000.75);
insert into customer values('A03','Pramada','Jauguste','DA','4560389','1967-06-25',500.00);
insert into customer values('A04','Basu','Navindi','BA','6125401','1956-02-29',860.00);
insert into customer values('A05','Ravi','Shridhar','NA','null','1989-02-15',500.50);
insert into customer values('A06','Rukmini','Aiyer','GH','5125274','1987-06-23',1500.50);

SELECT * FROM customer;
select sysdate();
SELECT DOB FROM customer;
update customer set phone='123456' where Cust_id='A02';
update customer set phone='654321' where Cust_id='A04';

update customer set DOB='1997-01-24' where Cust_id='A03';
update customer set DOB='1997-11-23' where Cust_id='A05';

delete from customer where Cust_id='A01' ;
delete from customer where Cust_id='A05' ;
TRUNCATE TABLE customer;

insert into customer values('A01','Ivan','Ross','SA','6125467','1986-01-15',800.50);
insert into customer values('A02','Vandana','Ray','MU','5560379','1987-12-20',1000.75);
insert into customer values('A03','Pramada','Jauguste','DA','4560389','1967-06-25',500.00);
insert into customer values('A04','Basu','Navindi','BA','6125401','1956-02-29',860.00);
insert into customer values('A05','Ravi','Shridhar','NA','null','1989-02-15',500.50);
update customer set Fname='koushik' where Cust_id='A01';
delete from customer  where Cust_id='A05';

