# Write your MySQL query statement below
select  Department.name as Department,Employee.name as Employee, Employee.Salary as Salary from Employee
join Department on Employee.departmentId = Department.id
where Employee.salary = (select max(salary)from Employee where DepartmentId = Department.id)