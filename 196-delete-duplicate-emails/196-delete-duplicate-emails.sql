# Please write a DELETE statement and DO NOT write a SELECT statement.
# Write your MySQL query statement below

DELETE FROM Person
WHERE id NOT IN (
    SELECT sub.min_id
    FROM (
        SELECT email, MIN(Id) min_id
        FROM person
        GROUP BY email
    ) sub
) 