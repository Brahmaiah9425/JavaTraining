create table departments (
	dept_id int primary key,
    dept_name varchar(50)
    );
create table employees (
	emp_id int primary key,
    emp_name varchar(50),
    salary decimal(10, 2),
    dept_id int,
    foreign key(dept_id) references departments(dept_id)
    );
    insert into departments (dept_id, dept_name) values 
    (1,'HR'),
    (2,'IT'),
    (3,'DEVOPS');
    insert into employee (emp_id, emp_name,salary, dept_id) value
    (101, 'Brahmaiah', 60000, 2),
    (102,'Mahash',50000,3),
    (103,'anil',40000,4),
    (104,'Gopi', 30000,1);
    select emp_name, salary
    from employees
    where salary > (select avg (salary) from employees);
    select
    e.emp_name as name,
    e.salary as Salary,
    d.dept_name as Department
    from employees e
    join departments d on e.dept_id = d.dept_id;
    
    