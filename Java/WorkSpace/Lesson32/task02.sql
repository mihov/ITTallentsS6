#Write a SQL query to find the number of employees in
#the "Sales" department. Use the "Sales" department. Use COUNT(*) COUNT(*)

SELECT 
    COUNT(*) AS 'Sales Employees Count'
FROM
    employees E
        JOIN
    departments D ON (E.department_id = D.department_id)
WHERE
    (D.department_name = 'Sales');

