const button = document.querySelector("#btm"); // Ищем btm
const main = document.querySelector("main"); // Ищем main
const section = document.querySelector("section");
const btm = document.querySelector(".btm-add-all");

// TODO: Exercise 0
const names = ["Ivan", "Alen", "Maria", "Magda"]; // Масив имён

// for (let i = 0; i < names.length; i++) { // Вывод массива с помощью for
//    console.log(names[i]);
// }

function callNames() { // Объявляем функцию вывода массива
   names.forEach(function (item) {  // Вывод массива с помощью forEach
      // console.log(item);
   });
}
callNames(); // Вызов функции

// TODO: Exercise 1
const numbers = [10, 3, 13, 4, 100, 15]; // Массив цифр

numbers.forEach(function (num) {
   // console.log(num ** 2);
});

// TODO: Exercise 2
const titles = ["Мой первый заголовок", "Lorem Ipsum", "Технологии Web"];

titles.forEach(function (title) {
   // console.log(title);
});

titles.forEach(function (title) {
   main.innerHTML += `
      <h3>${title}</h3>
   `;
});

// TODO: Exercise 3
const texts = [ // Массив заголовок-описание
   {
      title: "Мой первый заголовок",
      descr: "Мое первое описание",
   },
   {
      title: "Lorem Ipsum",
      descr: "Lorem Ipsum dolor sit amet.",
   },
   {
      title: "Технологии WEB-разработки",
      descr: "HTML, CSS, JS, PYTHON, PHP",
   },
];

function on_click() { // Вывод массива по клику
   texts.forEach(function (text, index) {
      main.innerHTML += `
         <div class="item">
            <h3>${text.title}</h3>
            <p>${text.descr}</p>
         <div>
      `;
   });
}

// TODO: Exercise 4
const words = [ // Массив слов eng-ru
   {
      eng: "event",
      ru: "событие",
   },
   {
      eng: "variable",
      ru: "переменная",
   },
   {
      eng: "title",
      ru: "заголовок",
   },
   {
      eng: "description",
      ru: "описание",
   },
];

words.forEach(function (word) { // Вывод массива
   main.innerHTML += `
      <div>
         <p>${word.eng}</p>
         <p>${word.ru}</p>
      </div>
   `;
});

// TODO: Exercise 4
const todos = [ // Массив TODO
   "Вынести мусор",
   "Закончить создание проекта",
   "Загрузить картинки",
   "Пойти на тренировку",
   "Убраться",
];

// Функция карточек списка дел
function showTodos() {
   todos.forEach(function (todo) { // Вывод массива
      section.innerHTML += `
         <div class = "todo">
            <h3>${todo}</h3>
         </div>
      `;
   });
}

showTodos(); // Вызов функции карточек дел

// Вешаем слушатель событий по нажати на элемент
const todoList = document.querySelectorAll(".todo");

console.log(todoList);

todoList.forEach(function (todo) {
   todo.addEventListener("click", function() {
      todo.classList.toggle("done");
   });
});

// TODO: Exercise 5
btm.addEventListener("click", function () {
   todoList.forEach(function (todo) {
      todo.classList.toggle("done");
   });
});