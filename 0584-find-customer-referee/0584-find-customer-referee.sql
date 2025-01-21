# Write your MySQL query statement below
select  name   from customer
where referee_id is null or referee_id <>2
#(select id from customer where referee_id  is null)