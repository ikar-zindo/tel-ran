// butt.onclick = function () {
//    var val = document.getElementById("elem1").value;
//    document.getElementById("str").innerHTML = val;
// };
// const int1 = 20;
// const int2 = 50;
// console.log(`Переменная 1:`, int1);
// console.log(`Переменная 2:`, int2);
// console.log(`Сумма:`, int1 + int2);

// const int3 = 34;
// const int4 = 66;
// console.log(`Переменная 3:`, int3);
// console.log(`Переменная 4:`, int4);
// console.log(`Сумма:`, int3 + int4);

// function showVariablesSum1() {
//    const int1 = 20;
//    const int2 = 50;
//    console.log(`Переменная 1:`, int1);
//    console.log(`Переменная 2:`, int2);
//    console.log(`Сумма:`, int1 + int2);
// }

// function showVariablesSum2(int3, int4) {
//    console.log(`Переменная 3:`, int3);
//    console.log(`Переменная 4:`, int4);
//    console.log(`Сумма:`, int3 + int4);
// }

// showVariablesSum1();
// showVariablesSum2(12, 45);
// showVariablesSum2(14, 88);

// function mathAction(x, y) {
//    console.log(x + y);
//    console.log(x - y);
//    console.log(x * y);
//    console.log(x / y);
//    console.log(x ** y);
// }

// mathAction(100, 10);
// mathAction(8, 4);

//TODO: Exercise 1
// function calcRoomSquare(a, b) {
//    const s = a * b;
//    console.log(`Длина комнаты = ${a}, ширина = ${b}.Площадь: ${s}`);
// }
// calcRoomSquare(14, 88);

// function calcRoomSquare(a, b) {
//    const s = a * b;
//    console.log(`Длина комнаты = ${a}, ширина = ${b}.Площадь: ${s}`);
// }

// const length = +prompt("Введите ширину");
// const width = +prompt("Введите ширину");
// calcRoomSquare(length, width);

//TODO: Exercise 2
// function showNameUpperCase() {
//    const username = prompt("Введите имя");
//    console.log(username.toUpperCase());
// }
// showNameUpperCase();

//TODO: Exercise 3
// function showNameUpperCase(name) {
//    console.log(name.toUpperCase());
// }

// const username = prompt("Введите имя");
// showNameUpperCase(username);

//! Function and Cycle
// function showCount(limit) {
//    for (let i = 0; i <= limit; ++i) {
//       console.log(i);
//    }
// }

// const limit = +prompt("Введите число");
// showCount(limit);

//TODO: Exercise 4
// function showArray(array) {
//    for (let i = 0; i < array.length; i++) {
//       console.log(array[i]);
//    }
// }
// const num1 = [1, 2, 3, 4];
// const num2 = [5, 6, 7, 8, 9, 10];
// showArray(num1);
// showArray(num2);
// showArray(["Apple", "Banane", "Orange"]);
// showArray([{name: "Ivan"}, {name: "Maria"}])



// function showArray(array) {
//    for (let i = 0; i < array.length; i++) {
//       console.log(array[i]);
//    }
// }

//TODO: Exercise 5
// function showUsername(name, surname) {
//    console.log(`${name} ${surname}`);
// }
// const userName = prompt("Введите имя")
// const userSurname = prompt("Введите фамилию");
// showUsername(userName, userSurname);

//TODO: Exercise 6
// function calc(number) {
//    const result = (number * 2) ** 3 - number;
//    return result;
// }
// const j = calc(10);
// console.log(j);

function calc(int1, int2) {
   const result = int1 ** 2 + int2 ** 2; 
   return result;
}
const j = calc(2, 4);
console.log(j);