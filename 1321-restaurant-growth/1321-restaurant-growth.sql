# Write your MySQL query statement below
select visited_on, amount, ROUND(amount/7, 2) average_amount
from (
   select distinct visited_on, 
    SUM(amount) OVER(order by  visited_on range between INTERVAL 6 DAY   PRECEDING and  CURRENT row) amount, 
    MIN(visited_on) over() 1st_date 
    from Customer
) t
where visited_on>= 1st_date+6;