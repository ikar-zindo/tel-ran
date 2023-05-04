//! Добавление тегов в HTML Способ 1
// const title = document.createElement("h1");
// title.innerHTML = "Project 13";

// console.log(title);

// const main = document.querySelector("main");
// main.appendChild(title);
 
//! Добавление тегов в HTML Способ 1
// const main = document.querySelector("main"); // Сюда будем добавлять наш контент
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
// const products = [
//    {
//        name: "Iphone 14",
//        price: 70000
//    },
//    {
//        name: "Iphone 13",
//        price: 60000
//    },
//    {
//        name: "Samsung S30",
//        price: 65000
//    }
// ]

// for(let i = 0; i < products.length; i++) {
//    main.innerHTML += `<div class="product">
//                            <h5>${products[i].name}</h5>
//                            <p>${products[i].price}</p>
//                      </div>`;
// }             

// let sum_cost = 0;
// for (let i = 0; i < products.length; i++) {
//     sum_cost += products[i].price;
// }
// main.innerHTML += `<h2>Общая стоимость: ${sum_cost}</h2>`;

/*
   <section class="product">
      <h5>Product name</h5>
      <p>Product price</p>
   </section>
*/

//TODO: Exercise 7
const users = [ // Объявляем массив
    {
        email: "test@mail.com",
        login: "Test"
    },
    {
        email: "start@mail.com",
        login: "Start"
    },
    {
        email: "admin@mail.com",
        login: "Admin"
    }
]

const usersConmtanier = document.querySelector(".users-contanier");
for(let i = 0; i < users.length; i++) {
    usersConmtanier.innerHTML += `<div class="user">
                                    <h5>${users[i].email}</h5>
                                    <p>${users[i].login}</p>
                                </div>`;
} 


//TODO: Exercise 8
const posts = [ // Объявляем массив
    {
        title: "My first title",
        descr: "My descr",
        author: "Test"
    },
    {
        title: "My second title",
        descr: "My second descr",
        author: "Admin"
    },
    {
        title: "My third title",
        descr: "My third descr",
        author: "Starta University"
    }
]

const postsContanier = document.querySelector(".posts-contanier");
for(let i = 0; i < users.length; i++) {
    postsContanier.innerHTML += `
        <div class="post">
            <h6>${posts[i].title}</h6>
            <p>${posts[i].author}</p>
            <p>${posts[i].descr}</p>
        </div>
    `;
}

//TODO: Exercise 8.1
posts.forEach(function(post, index) {
    if(index > 0 ) {
    postsContanier.innerHTML += `
        <div class="post">
            <h6>${post.title}</h6>
            <p>${post.author}</p>
            <p>${post.descr}</p>
        </div>
    `
    }
})

//TODO: Exercise 9
const numbers = [10, 30, 25, 60, 13]; // Объявляем массив
numbers.forEach(function(int) {
    console.log(int);
});

//TODO: Exercise 9.1
const arrayNames = ["Ivan", "Maja", "Bartek", "Monika"] // Объявляем массив
const names = document.querySelector(".names");
arrayNames.forEach(function(name) {
    names.innerHTML += `
    <p>Hello, ${name}</p>
    `
});

//TODO: Exercise 10
const usersConmtanier1 = document.querySelector(".users-contanier1");
users.forEach(function(user) { // Вывод posts с помощью forEach
    usersConmtanier1.innerHTML += `<div class="user">
                                    <h5>${user.email}</h5>
                                    <p>${user.login}</p>
                                </div>`;
});


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