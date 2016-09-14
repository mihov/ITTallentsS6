#Write a SQL query to find the total number of employees for each region.

SELECT 
    R.region_name AS 'Region', COUNT(E.employee_id) AS 'Employees'
FROM
    employees E
        JOIN
    departments D ON (E.department_id = D.department_id)
        JOIN
    locations L ON (D.location_id = L.location_id)
        JOIN
    countries C ON (L.country_id = C.country_id)
        JOIN
    regions R ON (C.region_id = R.region_id)
GROUP BY R.region_name;