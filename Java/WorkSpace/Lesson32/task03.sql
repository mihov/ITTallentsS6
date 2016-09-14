#Write a SQL query to find the number of all locations Write a SQL query to find the number of all locations
#where the company has an office. where the company has an office.
SELECT 
    COUNT(DISTINCT location_id) AS 'Locations count'
FROM
    departments
