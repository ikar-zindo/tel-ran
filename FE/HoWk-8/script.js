/*
      !Модуль 4. Домашнее задание 2.
   //TODO: Exrcise 0
*Написать цикл, который создает множество параграфов с каждым десятым числом в промежутке от 100 до 50 (т.е. 100, 90, 80, 70, 60, 50). Добавить созданные параграфы в div с классом numbers.
   //TODO: Exrcise 1
*Написать цикл, который проходится по массиву строк, для каждой строки создает параграф и добавляет его в div с классом strings_container. Строки взять произвольные.
   //TODO: Exrcise 2
*Написать цикл, который проходится по массиву с объектами - у объектов свойства first_name, last_name и  age (данные взять произвольные) - и создает карточки только для совершеннолетних пользователей. Карточка должна содержать информацию об имени, фамилии и возрасте пользователя. Добавить все карточки в div с классом users_container.
*/

//! Exrcise 0
const numbers = document.querySelector(".numbers"); // Ищем элемент по классу

for (let i = 100; i >= 50; i -= 10) {  // Объявление цикл для добавления <p>
   numbers.innerHTML += `<p>${i}</p>`;
}

//! Exrcise 1
const array_string = ["Ivan", "Monika", "Bartek", "Magda"]; // Массив имён
const strings_container = document.querySelector(".strings-container"); // Ищем элемент по классу

for (let i = 0; i < array_string.length; i++) {  // Объявлем цикл для добавления элементов массива на HTML
   strings_container.innerHTML += `<p>${array_string[i]}</p>`;
}

//! Exrcise 2
const users = [  // Массив элементов 
   {
      first_name: "Woodrow",
      last_name: "Wilson",
      age: 68
   }, 
   {
      first_name: "Temple",
      last_name: "Grandin",
      age: 75
   }, 
   {
      first_name: "Maria",
      last_name: "Skłodowska-Curie",
      age: 67
   }, 
   {
      first_name: "Fritz",
      last_name: "Haber",
      age: 65
   },
   {
      first_name: "Monika",
      last_name: "Kowalska",
      age: 10
   }
]
const users_container = document.querySelector(".users_container"); // Ищем элемент по классу

for (let i = 0; i < users.length; i++) {  // Объявление цикл
   if(18 < users[i].age) { // Выводим элемнты age > 18 лет
      users_container.innerHTML += `
      <div class="user-card">
         <p><span class="user-card-title">First name:</span> ${users[i].first_name}</p>
         <p><span class="user-card-title">Last name:</span> ${users[i].last_name}</p>
         <p><span class="user-card-title">Age:</span> ${users[i].age}</p>
      </div>
      `;
   }
}