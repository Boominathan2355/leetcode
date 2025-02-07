# Write your MySQL query statement below
select products.product_name, sum(orders.unit) as unit from orders
join products on orders.product_id = products.product_id 
where orders.order_date like "2020-02%"
group by orders.product_id 
having unit>=100