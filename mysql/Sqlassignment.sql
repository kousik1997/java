use org;
SELECT * FROM org.employee;
select FIRST_NAME as EMPLOYEE_NAME from employee;
Select upper(FIRST_NAME) from employee;
Select distinct DEPARTMENT from employee;
Select substring(FIRST_NAME,1,3) from employee;
Select INSTR(FIRST_NAME, BINARY'a') from employee where FIRST_NAME = 'Amitabh';
Select RTRIM(FIRST_NAME) from employee;
Select LTRIM(DEPARTMENT) from employee;
Select distinct length(DEPARTMENT) from employee;
Select REPLACE(FIRST_NAME,'a','A') from employee;
Select CONCAT(FIRST_NAME, ' ', LAST_NAME) AS 'COMPLETE_NAME' from employee;
Select * from employee order by FIRST_NAME asc;
Select * from employee order by FIRST_NAME asc,DEPARTMENT desc;
Select * from employee where FIRST_NAME in ('Vipul','Satish');
Select * from employee where FIRST_NAME not in ('Vipul','Satish');
Select * from employee where DEPARTMENT like 'Admin%';
Select * from employee where FIRST_NAME like '%a%';
Select * from employee where FIRST_NAME like '%a';
Select * from employee where FIRST_NAME like '_____h';
Select * from employee where SALARY between 100000 and 500000;
Select * from employee where year(JOINING_DATE) = 2014 and month(JOINING_DATE) = 2;
SELECT COUNT(*) FROM employee WHERE DEPARTMENT = 'Admin';
SELECT CONCAT(FIRST_NAME, ' ', LAST_NAME) As Employee_Name, Salary
FROM employee 
WHERE WORKER_ID IN 
(SELECT WORKER_ID FROM employee 
WHERE Salary BETWEEN 50000 AND 100000);
SELECT DEPARTMENT, count(WORKER_ID) No_Of_Workers 
FROM employee 
GROUP BY DEPARTMENT 
ORDER BY No_Of_Workers DESC;
SELECT DISTINCT e.FIRST_NAME, T.WORKER_TITLE
FROM employee e
INNER JOIN title T
ON e.WORKER_ID = T.WORKER_REF_ID
AND T.WORKER_TITLE in ('Manager');
SELECT WORKER_TITLE, AFFECTED_FROM, COUNT(*)
FROM title
GROUP BY WORKER_TITLE, AFFECTED_FROM
HAVING COUNT(*) > 1;
SELECT * FROM employee WHERE MOD (WORKER_ID, 2) = 0;
SELECT NOW();
SELECT * FROM employee ORDER BY Salary DESC LIMIT 10;
SELECT * FROM employee ORDER BY Salary DESC LIMIT 3;
