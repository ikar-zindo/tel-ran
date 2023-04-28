/*
ТЗ. Вы вводите время вылета в формате (ЧЧ:ММ) и дату вылета, потом вводите время полета в формате (ЧЧ:ММ) плюс время прибывания в минутах. И выводите в консоль: время, дату, день недели возвращения. 24 формат, годом пренебречь

*/
//! Flight

//* Считываем данне пользователя
// Получаем элемент формы и добавляем обработчик события "submit"
const form = document.querySelector("form");
form.addEventListener("submit", function(event) {

   // Получаем значение поля ввода для часов
   const inputFieldHour = document.getElementById("myInputHour");
   const inputHour = inputFieldHour.value;

   // Получаем значение поля ввода для минут
   const inputFieldMinutes = document.getElementById("myInputMinutes");
   const inputMinutes = inputFieldMinutes.value;


   let today = new Date(); // Создаёт объект Date
   let arrivalTime = new Date(); // Создаёт объект Date

   let flightTimeHour = inputHour; //Объюзер вводит время полёта самолёта
   let flightTimeMinutes = inputMinutes; //Объюзер вводит время полёта самолёта
   today.setHours(0, 0, 0); // Обнуляем время
   arrivalTime.setHours(0, 0, 0); // Обнуляем время

   arrivalTime.setHours(arrivalTime.getHours() + flightTimeHour); // Прибавляем время полёта в часах
   arrivalTime.setMinutes(arrivalTime.getMinutes() + flightTimeMinutes); // Прибавляем время полёта в минутах

   let daysGoBy = Math.ceil(Math.abs(today.getTime() - arrivalTime.getTime()) / (1000 * 3600 * 24));

  
   // Выводим значение поля ввода часы дней в полёте
   const outputHours = document.getElementById("outputHours");
   outputHours.innerHTML = arrivalTime.getHours();

   // Выводим значение поля ввода минуты дней в полёте
   const outputMinutes = document.getElementById("outputMinutes");
   outputMinutes.innerHTML = arrivalTime.getMinutes();

   // Выводим значение поля ввода дней в полёте
   const outputDays = document.getElementById("outputDays");
   outputDays.innerHTML = daysGoBy - 1;


//   output.innerHTML = `Самолёт приземлится в ${arrivalTime.getHours()}:${arrivalTime.getMinutes()}0 через ${daysGoBy - 1} дня`;

  event.preventDefault(); // Отменяем отправку формы на сервер
});

// Добавляем обработчик события "keydown" на поле ввода
const inputField = document.getElementById("myInputHour");
inputField.addEventListener("keydown", function(event) {
   // Проверяем, была ли нажата клавиша Enter
   if (event.key === "Enter") {
      // Получаем значение поля ввода для часов
      const inputFieldHour = document.getElementById("myInputHour");
      const inputHour = inputFieldHour.value;
   
      // Получаем значение поля ввода для минут
      const inputFieldMinutes = document.getElementById("myInputMinutes");
      const inputMinutes = inputFieldMinutes.value;
   
   
      let today = new Date(); // Создаёт объект Date
      let arrivalTime = new Date(); // Создаёт объект Date
   
      let flightTimeHour = inputHour; //Объюзер вводит время полёта самолёта
      let flightTimeMinutes = inputMinutes; //Объюзер вводит время полёта самолёта
      today.setHours(0, 0, 0); // Обнуляем время
      arrivalTime.setHours(0, 0, 0); // Обнуляем время
   
      arrivalTime.setHours(arrivalTime.getHours() + flightTimeHour); // Прибавляем время полёта в часах
      arrivalTime.setMinutes(arrivalTime.getMinutes() + flightTimeMinutes); // Прибавляем время полёта в минутах
   
      let daysGoBy = Math.ceil(Math.abs(today.getTime() - arrivalTime.getTime()) / (1000 * 3600 * 24));
   
     
      // Выводим значение поля ввода часы дней в полёте
      const outputHours = document.getElementById("outputHours");
      outputHours.innerHTML = arrivalTime.getHours();
   
      // Выводим значение поля ввода минуты дней в полёте
      const outputMinutes = document.getElementById("outputMinutes");
      outputMinutes.innerHTML = arrivalTime.getMinutes();
   
      // Выводим значение поля ввода дней в полёте
      const outputDays = document.getElementById("outputDays");
      outputDays.innerHTML = daysGoBy - 1;
   
   
   event.preventDefault(); // Отменяем отправку формы на сервер
   }
});

//* Используем Date()
// let today = new Date(); // Создаёт объект Date
// let arrivalTime = new Date(); // Создаёт объект Date

// let flightTime = 25;// +prompt("Время полёта"); //Объюзер вводит время полёта самолёта
// today.setHours(0, 0, 0); // Обнуляем время
// arrivalTime.setHours(0, 0, 0); // Обнуляем время

// arrivalTime.setHours(arrivalTime.getHours() + flightTime); // Прибавляем время полёта

// let daysGoBy = Math.ceil(Math.abs(today.getTime() - arrivalTime.getTime()) / (1000 * 3600 * 24));

// console.log(`Самолёт приземлится в ${arrivalTime.getHours()}:${arrivalTime.getMinutes()}0 через ${daysGoBy - 1} дня`);