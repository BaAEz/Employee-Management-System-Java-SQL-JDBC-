create database employeeDB;
use employeeDB;
create table employee (
	id int primary key,
    name varchar(50),
    salary int,
    age int);
select * from employee;
truncate table employee;