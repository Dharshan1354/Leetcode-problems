# Write your MySQL query statement below
select Employee.name, Bonus.bonus
from Employee
left join Bonus
on employee.empID = Bonus.empID
where bonus < 1000 OR bonus is NULL;