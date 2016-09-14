#Write a SQL query to find for each department and for each job title the total number of employees. 

SELECT 
    D.department_name AS 'Department',
    J.job_title AS 'Title',
    COUNT(E.employee_id) AS 'Employees'
FROM
    departments D
        JOIN
    employees E ON (D.department_id = E.department_id)
        JOIN
    jobs J ON (E.job_id = J.job_id)
GROUP BY Department, Title;