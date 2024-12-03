CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare offset int;
set offset =N-1;
    RETURN (
        SELECT salary
        FROM (
            SELECT DISTINCT salary
            FROM employee
            ORDER BY salary DESC
        ) AS getNthHighestSalary
        LIMIT 1 OFFSET offset
    );
END