# Write your MySQL query statement below
WITH QualityCalc AS (
    SELECT 
        query_name,
        ROUND(AVG(rating * 1.0 / position), 2) AS quality
    FROM Queries
    GROUP BY query_name
),
PoorQueryCalc AS (
    SELECT 
        query_name,
        ROUND(COUNT(CASE WHEN rating <= 2 THEN 1 END) * 1.0 / COUNT(*) * 100, 2) AS poor_query_percentage
    FROM Queries
    GROUP BY query_name
)
SELECT 
    qc.query_name,
    qc.quality,
    pcc.poor_query_percentage
FROM QualityCalc qc
JOIN PoorQueryCalc pcc
ON qc.query_name = pcc.query_name;