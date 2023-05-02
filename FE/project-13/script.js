//! Добавление тегов в HTML Способ 1
// const title = document.createElement("h1");
// title.innerHTML = "Project 13";

// console.log(title);

// const main = document.querySelector("main");
// main.appendChild(title);
 
//! Добавление тегов в HTML Способ 1
const main = document.querySelector("main");
// main.innerHTML += `<section>
//                      <h2>Добавление тегов в HTML</h2>
//                   </section>`;

//TODO: Exercise 1 && 2 && 3
// const main = document.querySelector("main");
// for (let i = 0; i < 100; i++) {
//    main.innerHTML += `<p>Hello ${i + 1}</p>`; // Вывод Hello 100 раз
// }

//TODO: Exercise 1 && 2 && 3
// const names = ["Ivan", "Maria", "Monika", "Bartek"]
// for (let i = 0; i < names.length; i++) {
//    main.innerHTML += `<p>${names[i]}</p>`; // Вывод массива в HTML
// }


// Вывод массива в HTML в 1 <p></p>
// let name
// for(let i = 0; i < names.length; i++) {
//    let name = "," + names[i];
// }


//TODO: Exercise 4
// const images = ["https://i.pinimg.com/736x/34/0f/37/340f37ae4f36826f3571a2f9c64544ec.jpg", 
// "https://img1.akspic.ru/previews/7/4/7/9/6/169747/169747-ikanvas-art-pechat_na_holste-poster-oblako-500x.jpg", 
// "https://s1.1zoom.ru/big0/52/Love_Sunrises_and_sunsets_Fingers_Hands_Heart_Sun_532758_1280x897.jpg"];
// for (let i = 0; i < images.length; i++) {
//    main.innerHTML += `<img src=${images[i]}>`;
// }

//TODO: Exercise 5

// const links = [
//    {
//        name: "Google",
//        link: "https://google.com"
//    },
//    {
//        name: "Facebook",
//        link: "https://facebook.com"
//    },
//    {
//        name: "Instagram",
//        link: "https://instagram.com"
//    }
// ]

// for(let i = 0; i < links.length; i++) {
//    main.innerHTML += `<a href="${links[i].link}">${links[i].name}</a><br>`;
// }

//TODO: Exercise 6
const products = [
   {
       name: "Iphone 14",
       price: 70000
   },
   {
       name: "Iphone 13",
       price: 60000
   },
   {
       name: "Samsung S30",
       price: 65000
   }
]

for(let i = 0; i < products.length; i++) {
   main.innerHTML += `<div class="product">
                           <h5>${products[i].name}</h5>
                           <p>${products[i].price}</p>
                     </div>`;
}                       

/*
   <section class="product">
      <h5>Product name</h5>
      <p>Product price</p>
   </section>
*/


//*Конспект
// main.innerHTML += `<p>${names.join(", ")}</p>`;  //* Вывод с помощью метода join();

// main.innerHTML = main.innerHTML + `<section></section>`

// let number = 10
//      number = number + 20 // number = 10 + 20; number = 30
//     number += 20 // number = number + 20

/*
   let number = 10
      number = 20


    main = {
        innerHTML: "<h1>Hello</h1>"
    }
    main.innerHTML = "<section></section>"

   innerHTML - свойство, которое позволяет получить или назначить html содержимое тега
    1. Поиск элемента, куда хотим поместить тег
    2. Добавляем тег с помощью innerHTML

   document.createElement принимает аргументом строчное название тега
    element.innerText позволяет получить или назначить текст тега

    1. Создание элемента. createElement("h1")
    2. Добавление текста в тег. innerText
    3. Поиск элемента, куда хотим поместить тег
    4. Добавление созданного тега в найденные элемент. appendChild()
*/