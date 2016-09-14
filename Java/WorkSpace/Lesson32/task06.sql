#Write a SQL query to find all departments' names and 
#the average salary for each of them. 

SELECT 
    D.department_name AS 'DName', AVG(E.salary) AS 'AVG Salary'
FROM
    departments D
        JOIN
    employees E ON (D.department_id = E.department_id)
GROUP BY D.department_id;