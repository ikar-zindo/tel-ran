//! Exercise 0
// alert(`Со скидкой ${prompt("Введите сумму:") * .85}`);

//! Exercise 1
// let j = 0;
// for (let i = 0; i <= 100; i++) {
//    j += i;
// }
// console.log(j);

//! Exercise 3
// let j = 0;
// for (let i = 2; i <= 100; i += 2) {
//    j += i;
//    console.log(j);
// }
// console.log(j);

//! Exercise 4
// const array  = [10, 20, 30];
// let j = 0;
// for (let i = 0; i < array.length; i++) {
//    j += array[i];
// }
// const int = j / array.length;
// console.log(int);


//! Exercise 5
// let int = +prompt("Введите число:");

// if (int < 100) {
//    alert("Число меньше 100");
// } else if (int > 100) {
//    alert("Число больше 100");
// } else {
//    alert("Число равно 100");
// }

// let username = prompt("Введите Ваше имя: ");
// let userAge = prompt("Введите Ваш возраст:");
// let currentYear = new Date().getFullYear();

// if (userAge < (currentYear - (currentYear - 18))) {
//    console.log(`Hi, ${username}`);
// } else {
//    console.log(`Hello, ${username}`)
// }

// const user = {
//    firstName: "Ivan",
//    lastName: "Bukrieiev",
//    age: 29,
//    emails: [
//       "ivan@mail.com", 
//       "bukrieiev@mail.com", 
//       "ivan29@mail.com"
//    ]
// }

// console.log(`Name is ${user.firstName} ${user.lastName}. He is ${user.age} years old.`);

// console.log(`
//    User's name ${user.firstName} ${user.lastName}. Secons email ${user.emails[1]}.
// `);


// const users = [
//    {
//       age: 100,
//       salary: 10000,
//       email: 'user1@mail.com'
//    },
//    {
//       age: 700,
//       salary: 70000,
//       email: 'user2@mail.com'
//    }
// ]

// console.log(users[users.length - 1].age);

// const players = [
//    {
//       playerName: "Player 1",
//       damage: 100
//    },
//    {
//       playerName: "Player 2",
//       damage: 200
//    }
// ]

// if (players[0].damage > players[1].damage) {
//    alert(`${players[0].playerName} win.`);
// } else if (players[0].damage < players[1].damage) {
//    alert(`${players[1].playerName} win.`);
// } else {
//    alert(`Draw`);
// }

// const i = +prompt("Number");

// if (i % 10 == 8) {
//    console.log("Число заканчивается на 8");
// }


// let username = prompt("Введите Ваше имя: ");
// let userAge = prompt("Введите Ваш возраст:");
// let currentYear = new Date().getFullYear();

// if (userAge < (currentYear - (currentYear - 18))) {
//    console.log(`Hi, ${username}`);
// } else {
//    console.log(`Hello, ${username}`);
// }

let flightStart = +prompt("")
let flightTime = +prompt(`Время полёта`);
let returnTime = (flightTime * 2) % 24;
let returnDays = Math.trunc((flightTime * 2) / 24);
console.log(`Самолёт вернётся в ${returnTime}:00 через ${returnDays} дней`);