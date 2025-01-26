# Write your MySQL query statement below
SELECT Y1.Id
FROM Weather as Y1 , Weather as T2
WHERE Y1.temperature >T2.temperature  and datediff(Y1.recordDate,T2.recordDate)=1