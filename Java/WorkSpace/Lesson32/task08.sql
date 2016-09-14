#Write a SQL query to find for each department and 
#for each manager the count of all corresponding employees.

SELECT 
    D.department_name AS 'Department',
    CONCAT(M.first_name, ' ', M.last_name) AS Manager,
    COUNT(E.manager_id) AS 'Employees count'
FROM
    departments D
        JOIN
    employees M ON (D.manager_id = M.employee_id)
        JOIN
    employees E ON (E.manager_id = M.employee_id)
GROUP BY D.department_name , M.first_name , M.last_name
ORDER BY D.department_name;

