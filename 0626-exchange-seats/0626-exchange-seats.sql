SELECT 
    CASE 
        WHEN id % 2 = 1 AND id + 1 <= (SELECT MAX(id) from seat) THEN id + 1
        WHEN id % 2 = 0 THEN id - 1
        ELSE id
    END as id,
    student
    FROM Seat
    ORDER BY id;