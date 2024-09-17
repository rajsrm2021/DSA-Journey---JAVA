select name from customer 
where referee_id != 2
union all
select name from customer 
where referee_id is null