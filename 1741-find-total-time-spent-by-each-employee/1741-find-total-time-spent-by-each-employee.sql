# Write your MySQL query statement below
Select * from 
(
Select event_day as day,emp_id, sum(out_time - in_time) as total_time
from Employees
Group by emp_id,day
) as t;