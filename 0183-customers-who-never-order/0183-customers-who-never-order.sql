# Write your MySQL query statement below
select c.name as Customers from Customers c where c.id not in (select c.id as Customers from Customers c 
inner join Orders o on c.id= o.customerId)

