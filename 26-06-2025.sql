create table employees(
emp_id INT primary key,
name varchar(50),
department varchar(50),
salary int
);
insert into employees(emp_id, name, department, salary) values 
(1, 'Brahmaiah', 'java Developer', 30000),
(2, 'Madhavi', 'java Testing', 35000),
(3, 'Hari', 'Cloud', 36000),
(4, 'Mahesh', 'SAP', 33000),
(5, 'Ajith', 'UXUI', 29000);
select * from employees;
select department, sum(salary) as total_salary
from employees
Group By department;
select department, count(*) as employee_count
from employees
Group By department;
select department, count(*) as employee_count
from employees
Group By department
Having count(*) > 2;
select *from employee
where name like 'B%';