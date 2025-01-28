# Write your MySQL query statement below
select e.name from Employee e
join (select managerId, count(*) as rpt from Employee
where managerId is not null 
group by managerId
having count(*)>=5) a on
e.id = a.managerId