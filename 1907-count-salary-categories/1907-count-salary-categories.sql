# Write your MySQL query statement below
SELECT 'High Salary' AS category, 
       COUNT(CASE WHEN income > 50000 THEN 1 END) AS accounts_count
FROM Accounts

UNION ALL

SELECT 'Low Salary' AS category, 
       COUNT(CASE WHEN income < 20000 THEN 1 END) AS accounts_count
FROM Accounts

UNION ALL

SELECT 'Average Salary' AS category, 
       COUNT(CASE WHEN income BETWEEN 20000 AND 50000 THEN 1 END) AS accounts_count
FROM Accounts

ORDER BY FIELD(category, 'High Salary', 'Low Salary', 'Average Salary');