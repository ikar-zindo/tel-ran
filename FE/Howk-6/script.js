/*
      !Решить следующие задачи:
   //TODO: Exercise 0
Напишите цикл for, который выводит консоль каждое второе число от 0 до 10
   //TODO: Exercise 1
Напишите цикл for, который выводит в консоль  все числа от 55 до 20
   //TODO: Exercise 2
Дан массив numbers. Вывести в консоль все числа из массива 
const numbers = [3, 5, 11, 2, 8, 1, 6];
Сформировать новый массив numbers_squared и передать в него все элементы из массива numbers, возведенные в квадрат
   //TODO: Exercise 3
Создать переменную last_elem и передать в нее последний элемент из сформированного массива numbers_squared (обратиться к элементу массива по индексу)
   //TODO: Exercise 4
Дан объект user. Используя данные из объекта, сформировать строку в формате: ‘User’s name is <FIRST_NAME> <LAST_NAME>. He is <AGE> years old’
const user = {
first_name: 'Ivan', 
last_name: 'Ivanov', 
age: 20, 
salary: 500
}
*/

//! Exercise 0
for (let i = 1; i <= 10; i = i + 2) {
   console.log(i);
}

//! Exercise 1
// for (let i = 55; i >= 20; i--) {
//    console.log(i);
// }

//! Exercise 2
// const numbers = [3, 5, 11, 2, 8, 1, 6];
// for (let i = 0; i < numbers.length; i++) {
//    console.log(numbers[i]);
// }

// const numbers_squared = [];
// for (let i = 0; i < numbers.length; i++) {
//    let squared = numbers[i] ** 2;
//    numbers_squared.push(squared);
//}

// //! Exercise 3
// // const last_elem = numbers_squared[numbers_squared.length - 1]; //*access the last element of the array
// const last_elem = numbers_squared[6];

// //! Exercise 4
const user = {
   first_name: "Ivan",
   last_name: "Bukrieiev",
   age: 29,
   salary: 3500,
};

console.log(`User's name is ${user.first_name} ${user.last_name}. He is ${user.age} years old.`);