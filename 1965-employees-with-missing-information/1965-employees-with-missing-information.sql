# Write your MySQL query statement below
select e.employee_id
    from Employees e
    left join Salaries s
    using(employee_id)
    where salary is null
union all
select s.employee_id
    from Employees e
    right join Salaries s
    using(employee_id)
    where name is null
order by employee_id;