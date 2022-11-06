# Write your MySQL query statement below
UPDATE Salary 
SET 
    sex = CASE sex
        WHEN 'm' then 'f'
        ELSE 'm'
END;