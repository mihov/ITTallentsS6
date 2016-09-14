#Write a SQL query to find the names and salaries of the employees that take 
#the minimal salary in the company. Use nested SELECT statement

SELECT 
    CONCAT(first_name, ' ', last_name) AS 'Employees', salary
FROM
    employees
WHERE
    salary = (SELECT 
            MIN(salary) AS 'Salary'
        FROM
            employees)
