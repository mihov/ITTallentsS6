#1. Write a SQL query to find the average salary in the Write a SQL query to find the average salary in the
#"Sales" department. Use "Sales" department. Use AVG().
SELECT 
    FLOOR(AVG(E.salary)) AS 'Average Salary'
FROM
    hr.departments D
        JOIN
    employees E ON (D.department_id = E.department_id)
WHERE
    D.department_name = 'Sales';