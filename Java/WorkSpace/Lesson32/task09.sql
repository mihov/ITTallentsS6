#Write a SQL query to find all managers that have 
#exactly 5 employees. Display their names and the 
#name and location of their department.

SELECT 
    CONCAT(M.first_name, ' ', M.last_name) AS 'Manager',
    D.department_name AS 'Department',
    L.city AS 'City'
FROM
    locations L
        JOIN
    departments D ON (L.location_id = D.location_id)
        JOIN
    employees M ON (D.manager_id = M.employee_id)
        JOIN
    employees E ON (E.manager_id = M.employee_id)
GROUP BY Manager , Department , City
HAVING COUNT(E.employee_id) = 5;