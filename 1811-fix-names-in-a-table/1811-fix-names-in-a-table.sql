# Write your MySQL query statement below
select Users.user_id, concat(upper(substr(users.name,1,1)), lower(substr(users.name,2))) as name from users
order by user_id