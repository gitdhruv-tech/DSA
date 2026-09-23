# Write your MySQL query statement
SELECT D.name as Department, E.name as Employee, E.salary as Salary 
from Employee as E 
join Department as D 
on E.departmentId = D.id 
where E.salary = (
    select max(salary)
    from Employee
    where departmentId = E.departmentId
);