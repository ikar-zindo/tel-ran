//! Обработка отправки формы
const form = document.querySelector(".form");
const productName = document.querySelector(".product-name");
const productPrice = document.querySelector(".product-price");
const productsContainer = document.querySelector(".products-container");


//* Массив объектов товаров
const products = [ // Массив данных, наша БД
	{
		name: "Велосипед",
		price: 40000
	},
	{
		name: "Самокат",
		price: 15000
	}
	// },
	// {
	//    name: "Лыжи",
	//    price: 20000
	// },
	// {
	//    name: "Сноуборд",
	//    price: 25000
	// }
]

//* Отроавка формы по нажатию на кнопку
form.addEventListener("submit", function(event) {
	event.preventDefault(); // Отменяет действия по умолчанию

	// Объявляем пустой массив
	const newProduct = {
		name: productName.value, // Данные введённые в inout Name
		price: Number(productPrice.value) // Данные введённые в inout Price
	}
	// Добавляем новый элемент в массив товаров
	products.push(newProduct);

	showProducts(); // Вызов функции продуктов после добавления продукта
	clearInputs(); // Вызов функция отчистки полей ввода
	showNotoficatinAdd(); // Вызов уведомления
});

function clearInputs() { // Функция отчистки полей ввода
	productName.value = "";
	productPrice.value = "";   
}

// Рендер (отображение) продуктов в HTML
function showProducts() {
	productsContainer.innerHTML = "";
	products.forEach(function (product, index) {
		productsContainer.innerHTML += `
			<div class="product">
				<p class="product-card-name">${product.name}</p>
				<p class="product-card-price">${product.price}</p>
				<button class="product-card-btn" id=${index}> X </button>
			</div>
		`;
	});
	onHover(); // Вызов функции появления Х
	deleteProduct(); // Вызов функции Х (удаление эл)
}
showProducts(); // Вызов функции продуктов

// Функция появдения X при наведении
function onHover() {
	const productsCards = document.querySelectorAll(".product");
	productsCards.forEach(function (card) {
		card.addEventListener("mouseover", function () { // Появления крестика при наведении
			const button = card.querySelector(".product-card-btn");
			button.style.display = "block";
		});

		card.addEventListener("mouseout", function () {  // Исчезание крестика при отсутствии кресика
			const button = card.querySelector(".product-card-btn");
			button.style.display = "none";
		});
	});   
}

// Удаление элемента списка по нажатию на Х
function deleteProduct() {
	const deleteButton = document.querySelectorAll(".product-card-btn");
	deleteButton.forEach(function (btm) {
		btm.addEventListener("click", function () {
			const id = btm.id; // Получаем id эл
			products.splice(id, 1); // Удаление эл по индексу
			showProducts(); // Рендер продуцтов после удаления
			showNotoficatinDelete();// Появдение уведомления
		});
	});   
}

// Появдение уведомления о добвлении продукта
function showNotoficatinAdd() {
	const notification = document.querySelector(".notification-add");
	notification.style.display = "block";
	setTimeout(function () {
		notification.style.display = "none";
	}, 2000);
}
// Появдение уведомления о удалении продукта
function showNotoficatinDelete() {
	const notification = document.querySelector(".notification-delete");
	notification.style.display = "block";
	setTimeout(function () {
		notification.style.display = "none";
	}, 2000);
}
// showNotoficatinAdd();
// showNotoficatinDelete();