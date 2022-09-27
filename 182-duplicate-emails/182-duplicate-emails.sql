# Write your MySQL query statement below

select email 
from Person
group by Person.email
having count(*) > 1