# Write your MySQL query statement below

Select product_id, round(COALESCE(sum(total)/sum(units),0),2) as average_price from 
    (
    Select Prices.product_id ,UnitsSold.units,Prices.price * UnitsSold.units as total
    from Prices left join UnitsSold on Prices.product_id = UnitsSold.product_id
    and UnitsSold.purchase_date between Prices.start_date and Prices.end_date
    ) as t
group by product_id;






