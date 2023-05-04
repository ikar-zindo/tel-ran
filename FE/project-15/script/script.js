//* Обработка отправки формы
const form = document.querySelector(".form");
const productName = document.querySelector(".product-name");
const productPrice = document.querySelector(".product-price");

//* Массив объектов товаров
const products = [
   {
      name: "Велосипед",
      price: 40000
   },
   {
      name: "Самокат",
      price: 15000
   },
   {
      name: "Лыжи",
      price: 20000
   },
   {
      name: "Сноуборд",
      price: 25000
   }
]

//* Отроавка формы по нажатию на кнопку
form.addEventListener("submit", function(event) {
   event.preventDefault(); // Отменяет действия по умолчанию
   // console.log(productName.value); // Собираем информацию из поля input
   // console.log(productPrice.value); // Собираем информацию из поля input

   //* Объявляем пустой массив
   const newProduct = {
      name: productName.value,
      price: Number(productPrice.value)
   }
   //* Добавляем новый элемент в массив товаров
   products.push(newProduct);
});

