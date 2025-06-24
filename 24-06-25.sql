Create table employees (
id int,
name varchar(50),
department varchar(50),
salary int,
bonus int
);
insert into employees values(
1,'Brahmaiah','HR',40000,5000), 
(
1,'Mahesh','Tester',40000,5000),
(
1,'Hari','DevopsEngineer',40000,5000),
(
1,'Mamatha','Developer',40000,5000),
(
1,'Krishana','ProjectManager',40000,5000);
select * from employees
order by salary ASC;
select * from employees
order by salary DESC
LIMIT 3;
select * From employees
where name like '%B';
select * from employees
where department in ('Developer','HR');
select *from employees
where department not in ('HR');
select *from employees
where bouns is null;
select * from employees
where bonus is not null;



