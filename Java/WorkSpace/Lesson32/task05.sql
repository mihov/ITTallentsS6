#Write a SQL query to find the number of all 
#departments that has no manager.

SELECT 
    COUNT(department_id)
FROM
    departments
WHERE
    manager_id IS NULL