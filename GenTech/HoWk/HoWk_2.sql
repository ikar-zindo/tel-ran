-- 1. Вывести телефоны всех поставщиков, кроме тех, что из Germany и France.

SELECT Phone
FROM Suppliers
WHERE NOT Country IN ('Germany', 'France');

-- 2. Добавить два произвольных товара.

INSERT INTO Products(ProductName, SupplierID, CategoryID, Unit, Price)
VALUES
	('Yaki Sushi Nori Gold', '6', '8', '10 boxes x 100 pkgs.', 329.9),
	('Chotkal', '4', '2', '30 bottles', 360);

-- 3. Удалить поставщиков из USA и Germany.

DELETE FROM Suppliers
WHERE Country IN ('Germany', 'USA');

-- 4. Вывести все товары до 20 EUR из категорий 3 и 6 по убыванию цены.

SELECT * 
FROM Products
WHERE
	CategoryID IN (3, 6)
	AND
	Price < 20 
ORDER BY Price DESC

-- 5. Вывести номера трех последних заказов.

SELECT OrderID
FROM Orders
ORDER BY OrderID DESC
LIMIT 3