// function getArray(number) {
//    const numbers = [];
//    for(let i = 0; i < number; i++) {
//       numbers.push(i);
//    } 
//    return numbers;
// }


// console.log(getArray(6));

//TODO: Exercise 0
// function getArray(number1, number2) {
//    const numbers = [];
//    for(let i = number1; i <= number2; i++) {
//       numbers.push(i);
//    } 
//    return numbers;
// }
// console.log(getArray(6, 7));
// let int1 = +prompt("Введи число 1:");
// let int2 = +prompt("Введи число 2:");
// console.log(getArray(int1, int2));

//TODO: Exercise 1
// function getArray(number1, number2) {
//    const numbers = [];
//    if (number1 < number2) {
//       for(let i = number1; i <= number2; i++) {
//       numbers.push(i);
//       }
//    } else {
//       for(let i = number2; i <= number1; i++) {
//       numbers.push(i);
//       }
//    }
//    return numbers;
// }

// let int1 = +prompt("Введи число 1:");
// let int2 = +prompt("Введи число 2:");

// console.log(getArray(3, 7));
// console.log(getArray(7, 3));

//! Остаток от деления
const numbers = [1, 2, 3, 4, 5, 6, 7]
for(let i = 0; i < numbers.length; i++) {
   if (numbers[i] % 2 == 0) {
      console.log(numbers[i]);
   }
}