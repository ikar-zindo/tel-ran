//Обработка событий
// При клике в консоле отразить контент

const button1 = document.querySelector(".btm-1");
const button2 = document.querySelector(".btm-2");
const title = document.querySelector("h2");

// button.addEventListener("click", function() {
//     console.log("Hello");
// });

//TODO: Exercise 0
let counter = 0;
button1.addEventListener("click", function() {
    counter++;
    title.innerText = counter;
});

button2.addEventListener("click", function() {
    counter--;
    title.innerText = counter;
});

//TODO: Exercise 1
//! Меняем цвет фона по нажатию на кнопку

// Заносим все значения полей HTML в переменные JS
const body = document.body;
//* body.style.backgroundColor = "rgb(231, 76, 60)";
const colors = document.querySelector(".colors"); // main class=colors

const red = document.querySelector("#red"); // Заносим значение id=red в переменную
const blue = document.querySelector("#blue"); // Заносим значение id=blue в переменную
const green = document.querySelector("#green"); // Заносим значение id=green в переменную
const yellow = document.querySelector("#yellow"); // Заносим значение id=yellow в переменную
const img = document.querySelector("#img"); // Заносим значение id=img в переменную

const array_colors = [ // Объявляем массив цветов
    {
        nameColor: "red",
        rgb: "rgb(231, 76, 60)",
        img: null
    },
    {
        nameColor: "blue",
        rgb: "rgb(41, 128, 185)",
        img: null
    },
    {
        nameColor: "green",
        rgb: "rgb(39, 174, 96)",
        img: null
    },
    {
        nameColor: "yellow",
        rgb: "rgb(241, 196, 15)",
        img: null
    },
    {
        nameColor: "img",
        rgb: "rgb(243, 156, 18)",
        img: "url(../project-2/img/space-10.jpg)"
    }
];

//! Способ 1: в упор
// red.addEventListener("click", function() { // нажатие на red
//     colors.style.backgroundColor = "rgb(231, 76, 60)"; // Смена фона
//     colors.style.boxShadow = "0px 0px 20px 20px rgb(231, 76, 60)"; // Смена тени
//     colors.style.backgroundImage = null; // Убираем картинку
//     red.style.color = "rgb(231, 76, 60)"; // Меняем цвет кнопки
//     blue.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     green.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     yellow.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
// });

// blue.addEventListener("click", function() { // нажатие на blue
//     colors.style.backgroundColor = "rgb(41, 128, 185)"; // Смена фона
//     colors.style.boxShadow = "0px 0px 20px 20px rgb(41, 128, 185)"; // Смена тени
//     colors.style.backgroundImage = null; // Убираем картинку
//     red.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     blue.style.color = "rgb(41, 128, 185)"; // Меняем цвет кнопки
//     green.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     yellow.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки

// });

// green.addEventListener("click", function() { // нажатие на green
//     colors.style.backgroundColor = "rgb(39, 174, 96)"; // Смена фона
//     colors.style.boxShadow = "0px 0px 20px 20px rgb(39, 174, 96)"; // Смена тени
//     colors.style.backgroundImage = null; // Убираем картинку
//     red.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     blue.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     green.style.color = "rgb(39, 174, 96)"; // Меняем цвет кнопки
//     yellow.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
// });

// yellow.addEventListener("click", function() { // нажатие на yellow
//     colors.style.backgroundColor = "rgb(241, 196, 15)"; // Смена фона
//     colors.style.boxShadow = "0px 0px 20px 20px rgb(241, 196, 15)";
//     colors.style.backgroundImage = null; // Убираем картинку
//     red.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     blue.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     green.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     yellow.style.color = "rgb(241, 196, 15)"; // Меняем цвет кнопки
// });

// img.addEventListener("click", function() { // нажатие на red
//     colors.style.background = "url(../project-2/img/space-14.jpg)"; // Смена фона
//     colors.style.boxShadow = "0px 0px 20px 20px rgb(243, 156, 18)"; // Смена тени

//     red.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     blue.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     green.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
//     yellow.style.color = "rgb(22, 160, 133)"; // Возвращаяем цвет кнопки
// });

//! Способ 2 с циклом 
// const buttons = document.querySelectorAll(".colors-btm") // Массив с кнопками

// for (let i = 0; i < buttons.length; i++) {    
//     buttons[i].addEventListener("click", function(event) {
//         if(event.target.id == "img") {
//             colors.style.backgroundImage = "url(../project-2/img/space-10.jpg)"; // Смена фона 
//         } else {
//             console.log(event.target.id);
//             const color = event.target.id; // Заносим в переменную значение id
//             colors.style.backgroundColor = color; // Смена цвета color=id  
//             colors.style.backgroundImage = null; // Убираем картинку с фона
//         }   
//     })
// }

//! Способ 3 с циклом из массива цветов из массива кнопок
const buttons = document.querySelectorAll(".colors-btm") // Массив с кнопками

for(let i = 0; i < buttons.length; i++) {
    buttons[i].addEventListener("click", function(event) {
        for(let j = 0; j < array_colors.length; j++) {
            if(event.target.id == array_colors[j].nameColor) {
                colors.style.backgroundColor = array_colors[j].rgb;
                colors.style.backgroundImage = array_colors[j].img;
                colors.style.boxShadow = `0px 0px 20px 20px ${array_colors[j].rgb}`;
            } 
        }
    })
}

// red rgb(231, 76, 60)
// blue rgb(41, 128, 185)
// green: rgb(39, 174, 96)
// yellow rgb(241, 196, 15)