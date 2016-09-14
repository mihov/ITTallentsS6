#Write a SQL query to find the number of 
#departments that has manager.

SELECT 
    COUNT(manager_id) AS 'Departments with manager'
FROM
    departments
