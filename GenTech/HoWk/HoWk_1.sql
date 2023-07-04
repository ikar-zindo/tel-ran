-- 1. Вывести название и стоимость товаров от 20 до 200 EUR.

SELECT 
	ProductName,
	Price AS Prise_EUR
FROM Products
WHERE
	Price >= 20
  AND
  Price <= 200

-- 2. Вывести товары от поставщиков 2 и 4 в порядке убывания цены.

SELECT *
FROM Products
WHERE
	SupplierID IN (2, 4)
ORDER BY Price DESC


-- 3. Вывести товары, добавив поле "цена *со* скидкой" в 12.5%.

SELECT *,
	Price * .875  Discount_Price
FROM Products
```

-- 4. У поставщиков 3 и 5 изменить тел/номера на произвольные значения.

UPDATE Suppliers
SET Phone='(123) 456 789'
WHERE
	SupplierID IN (3, 5)
	
SELECT *
FROM Suppliers
WHERE 
	SupplierID IN (3, 5)