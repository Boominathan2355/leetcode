# Write your MySQL query statement below
SELECT person_name
FROM (SELECT person_name, SUM(weight) OVER (ORDER BY turn) AS weight
FROM Queue) AS subquery WHERE weight <= 1000
ORDER BY weight DESC
LIMIT 1