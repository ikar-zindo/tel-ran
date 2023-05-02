/*
      !Модуль 4. Домашнее задание 2.
   //TODO: Exrcise 0
Написать цикл, который создает множество параграфов с каждым десятым числом в промежутке от 100 до 50 (т.е. 100, 90, 80, 70, 60, 50). Добавить созданные параграфы в div с классом numbers.
   //TODO: Exrcise 1
Написать цикл, который проходится по массиву строк, для каждой строки создает параграф и добавляет его в div с классом strings_container. Строки взять произвольные.
   TODO: Exrcise 2
Написать цикл, который проходится по массиву с объектами - у объектов свойства first_name, last_name и  age (данные взять произвольные) - и создает карточки только для совершеннолетних пользователей. Карточка должна содержать информацию об имени, фамилии и возрасте пользователя. Добавить все карточки в div с классом users_container.
*/

//! Exrcise 0
const numbers = document.querySelector(".numbers");

for (let i = 100; i >= 50; i -= 10) {
   numbers.innerHTML += `<p>${i}</p>`;
}

//! Exrcise 1
const array_string = ["Ivan", "Monika", "Bartek", "Magda"];
const strings_container = document.querySelector(".strings_container");

for (let i = 0; i < array_string.length; i++) {
   strings_container.innerHTML += `<p>${array_string[i]}</p>`;
}

//! Exrcise 2
const users = [
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
]
const users_container = document.querySelector(".users_container");

for (let i = 0; i < users.length; i++) {
   if(18 < users[i].age) {
      users_container.innerHTML += `<div class="user_card">
                                       <p>First name :${users[i].first_name}</p>
                                       <p>Last name :${users[i].last_name}</p>
                                       <p>Age :${users[i].age}</p>
                                    </div>`;
   }
}