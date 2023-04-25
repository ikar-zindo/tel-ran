//! Масивы - коллекция данных

// const numbers = [30, 45, 0, 75, 900];
// const names = ["Ivan", "Robert", "Maria"];

// console.log(numbers[3]);

//TODO: exercise 1
// console.log(names[2]);
// console.log(numbers[0]);

// console.log(numbers.length);
// console.log(names.length);

//! Метод .push() - добавляет элемент в конец масива

//TODO: exercise 2
// const names = [];

// names.push(prompt("Ведите ваше имя"));
// console.log(names);

//! Цикл
// for (let i = 0; i < 10; i++) {
//    console.log(i);
// }

//TODO: exercise 3
// for (let i = 0; i < 100; i++) {
//    console.log("Hello, Wolrd!");
// }

//TODO: exercise 4
// const names = [];
// for (let i = 0; i < 5; i++) {
//    names.push(prompt(`Введите имя ${i + 1}`));
// }
// names.sort();
// console.log(names);

//TODO: exercise 5
// const numbers = [35, 60, 900, 100];
// function sortNumbers(a, b) {
//    if (a > b) {
//       return 1;;
//    } else if (a < b) {
//       return -1;;
//    } else {
//       return 0;
//    }
// }
// numbers.sort(sortNumbers);
// for (let i = 0; i < numbers.length; i++) {
//    console.log("Число №" + (i + 1) + ": " + numbers[i]);
// }

//TODO: exercise 6
// const names = ["Ivan", "Maria", "Magda", "Bartek"];
// names.sort();
// for (let i = 0; i < names.length; i++) {
//    console.log(`Привет, ${names[i]}.`);
// }

//TODO: exercise 7
const int = [10, 4, 15, 67];
for (let i = 0; i < int.length; i++) {
   console.log(Math.pow(int[i], 4));
}

//! let i = 0;
// while (i < 5) {
//    names.push(prompt("Ведите ваше имя " + (i + 1)));
//    i++;
// }
// console.log(names);
 /*
1. let i = 0, 0 < 10 - true, console.log("привет"), i++, i = 0 => i = 1,
   2. i = 1, 1 < 10 - true, console.log("Привет"), i++, i = 1 => i = 2,
   3. i = 2, 2 < 10 - true, console.log("Привет"), i++, i = 2 => i = 3,
   4. i = 3, 3 < 10 - true, console.log("Привет"), i++, i = 3 => i = 4,
   5. i = 4, 4 < 10 - true, console.log("Привет"), i++, i = 4 => i = 5, 
   6. i = 5, 5 < 10 - true, console.log("Привет"), i++, i = 5 => i = 6,
   7. i = 6, 6 < 10 - true, console.log("Привет"), i++, i = 6 => i = 7,
   8. i = 7, 7 < 10 - true, console.log("Привет"), i++, i = 7 => i = 8,
   9. i = 8, 8 < 10 - true, console.log("привет"), i++, i = 8 => i = 9,
   10. i = 9, 9 < 10 - true, console.log("Привет"), i++, i = 9 => i = 10,
   11. i = 10, 10 < 10 - false - Выходим из цикла
*/
