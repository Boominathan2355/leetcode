# Write your MySQL query statement below
SELECT 
    employee_id,
    CASE
    when employee_id % 2 = 0 or name like 'm%' then 0
    else salary
    END as bonus
from Employees
order by employee_id