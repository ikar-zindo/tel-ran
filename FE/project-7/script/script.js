//* Однострочный коментарий

/* 
   *ctrl + /
   *многострочный коментарий
*/

//! Команды
//* alert("Hello, World") //уведосление
//* console.log("Hello") // отображение в консоли
//* prompt("Как вас зову?") //ввод данных

//! Переменные
//* const username = prompt("Как вас зову?")
//* console.log(username)

//* const userage = prompt("Сколько вам лет?")
//* console.log(userage)

//TODO: exercise
// console.log("Hello")
// console.log("My name Ivan")
// console.log("I am 29")

// alert("Выберите какой-то из вариантов")
// alert("Заполните все поля формы")

// prompt("Сколько вам лет?")

// let number = 50
// number = 100
// console.log(number)

// const number1 = 50
// number1 = 100
// console.log(number1)

//! Конкатенация
//const userName = prompt("Как вас зовут?")
//* console.log("Привет, " + userName)

//TODO: exercise 2
//const userAge = prompt("Сколько тебе лет?")
// console.log("Привет, " + userName + ". Вам " + userAge + " лет.")

//! Итерполяция
//console.log(`Привет, ${userName}. Вам ${userAge} лет.`)

//TODO: exercise 3
// let userAge = prompt("Скалько вам лет?")
// let birthYears = 2023 - userAge
// console.log(`Вы роделись в ${birthYears} году.`)

// const r = 153
// const g = 153
// const b = 153

// console.log(`rgb(${r}, ${g}, ${b})`)

// rgb({ r }, { g }, { b })

// https://doka.guide/js/var-let/

//TODO: exercise 4
// let int = prompt("Введите число");
// console.log(int ** 2);
// alert(Math.pow(int, 3));

// const e = Math.E;
// console.log(e);

// let int1 = prompt("Введите число 1");
// let int2 = prompt("Введите число 2");
// let sum = Number(int1) + Number(int2);
// alert(sum);

/*//! Типы данных

      1. Number - целое число
      2. string 




*/
/*
! Сравнение (if)
//*Операторы спавнения
   >
   <

   */
// let int1 = prompt("Введите число");

// if (int1 > 50) {
//    alert("больше пятидесяти");
// } else if (int1 < 50){
//    alert("Меньше пятидесяти");
// } else {
//    alert("50. Молодец");
// }

//  let int1 = +prompt("Введите число");
// alert(int1 > 50 ? "больше пятидесяти" : "Меньше пятидесяти");
// const result = num > 50 ? "Больше" : num == 50 ? "Равно" : "Меньше"

// let int1 = +prompt("Введите число");
// const result = int1 > 50 ? "Больше" : num == 50 ? "Равно" : "Меньше"

let int1 = +prompt("Введите число");
let int2 = +prompt("Введите число");
// if (int1 > int2) {
//    alert("Первое больше");
// } else if (int1 < int2){
//    alert("Втроре больше");
// } else {
//    alert("Равны");
// }

alert(int1 > int2 ? "Первое больше" : int1 < int2 ? "Втроре больше" : "Равны")



// alert(int1 > int2 ? "Первое больше");
// if (int1 > 50) {
//    alert("больше пятидесяти");
// } else if (int1 == 50) {
//    alert("50. Молодец");
// } else {
//    alert("Меньше пятидесяти");
// }