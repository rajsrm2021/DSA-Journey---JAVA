# Write your MySQL query statement below
SELECT product_name,price,year
FROM Sales
INNER JOIN Product
on Sales.product_id = Product.product_id;