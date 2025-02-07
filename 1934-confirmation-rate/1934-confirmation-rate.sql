# Write your MySQL query statement below
select Signups.user_id , round(ifnull(avg(action='confirmed'),0),2) AS confirmation_rate
from Signups
left join Confirmations
on Signups.user_id=Confirmations.user_id
group by Signups.user_id;