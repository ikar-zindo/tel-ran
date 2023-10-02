-- Вывести топ-3 менеджеров по колличеству заказов

SELECT *,
	COUNT(Orders.OrderID) AS total_orders
	
FROM Employees

JOIN orders USING(EmployeeID)

GROUP BY Employees.EmployeeID

ORDER BY total_orders DESC
LIMIT 3

-- Вывести предпоследний заказ