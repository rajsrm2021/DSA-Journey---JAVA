(select name from Customer where referee_id is null)
UNION ALL
(select name from Customer where referee_id != 2);
