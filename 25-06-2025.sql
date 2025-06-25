create table departments (
	DeptID INT primary key,
    DeptName varchar(50)
);
create Table Employee(
	EmpID INT primary key,
    EmpName Varchar(50),
    DeptID INT,
    foreign key(DeptID) references Departments(DeptID)
);
insert into departments values (1, 'HR');
insert into departments values (2, 'IT');
insert into departments values (3, 'Finance');

insert into employee value (101, 'John', 1);
insert into employee value (102, 'Alice', 2);
insert into employee value (103, 'Bob', 3);
insert into employee value (104, 'Mike', 2);
select 
	employee.EmpID,
    Employee.EmpName,
    Departments.DeptName
from 
	Employee
Inner Join 
	Departments ON Employee.DeptID = Departments.DeptID;