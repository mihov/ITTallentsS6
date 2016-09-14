#Write a SQL query to find the count of all employees 
#in each department. Display the name, location and 
#number of employees for each department.

SELECT 
    D.department_name AS 'Department',
    L.city AS 'City',
    COUNT(E.employee_id) AS 'Employee count'
FROM
    locations L
        JOIN
    departments D ON (D.location_id = L.location_id)
        JOIN
    employees E ON (E.department_id = D.department_id)
GROUP BY D.department_name , L.city;

