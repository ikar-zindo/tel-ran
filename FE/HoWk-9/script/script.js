/*
		!Модуль 5. Домашнее задание 1.
	//TODO: Exrcise 0
*Создать кнопку и красный квадрат с размерами 200х200px. При клике на кнопку менять у квадрата цвет заднего фона на зеленый и уменьшать его до размеров 100х100px.
	//TODO: Exrcise 1
*Создать кнопку и розовый квадрат с размерами 200х200px. При клике на кнопку менять цвет на синий и выводить в консоль обновленный цвет квадрата.
	//TODO: Exrcise 2
*Создать кнопку и квадрат с размерами 150х150px. При клике на кнопку увеличивать высоту и ширину квадрата на 20px.
	//TODO: Exrcise 3
*Создать кнопку и div с классом root. При клике на кнопку в div создается параграф синего цвета. Текст параграфа произвольный.
	//TODO: Exrcise 4
*Создать кнопку и div с классом root. При клике на кнопку в div создаются по очереди параграфы синего и зеленого цветов. Первый цвет синий.
*/

//! Exrcise 0
const redSquareBtm = document.querySelector(".red-square-btm"); // Поиск кнопки по классу для красного квадрата
const redSquare = document.querySelector(".red-square"); // Поиск красного квадрата по классу

let redSquareWidtg = redSquare.style.width = "200px"
redSquareBtm.addEventListener("click", function() { // Функция смены размера квадрата
	if (redSquare.style.width == "200px") { // Уменьшаем квадрат
		redSquare.style.backgroundColor = "rgb(39, 174, 96)";
		redSquare.style.width = "100px";
	} else {  // Увеличеваем квадрат
		redSquare.style.backgroundColor = "rgb(231, 76, 60)";
		redSquare.style.width = "200px";
	}
});

//! Exrcise 1
const pinkSquareBtm = document.querySelector(".pink-square-btm"); // Поиск кнопки по классу для розового квадрата
const pinkSquare = document.querySelector(".pink-square"); // Поиск розового квадрата по классу

pinkSquareBtm.addEventListener("click", function() {
	pinkSquare.style.backgroundColor = "rgb(41, 128, 185)";
	console.log(pinkSquare.style.backgroundColor);
});

//! Exrcise 2
const squareBtm = document.querySelector(".square-btm"); // Поиск кнопки по классу для квадрата
const square = document.querySelector(".square"); // Поиск квадрата по классу

let squarewidth = 150; // Первоначальный размер квадрата
square.style.width = `${squarewidth}px`;

squareBtm.addEventListener("click", function() {
	squarewidth -= 20; // Уменьшаем размер с каждым кликом
	square.style.width = `${squarewidth}px`;
});

//! Exrcise 3
const rootBtm1 = document.querySelector(".root-btm1"); // Поиск кнопки по классу для root
const root1 = document.querySelector(".root1"); // Поиск блока root для появления текста
 
rootBtm1.addEventListener("click", function() {
	root1.innerHTML = `
		<p>Lorem ipsum dolor sit amet consectetur, 
			adipisicing elit. 
			Quisquam placeat expedita dignissimos.
		</p>
	`;
});

//! Exrcise 4
const rootBtm2 = document.querySelector(".root-btm2"); // Поиск кнопки по классу для root
const root2 = document.querySelector(".root2"); // Поиск блока root для появления текста

let i = 0; // Объявляем переменную-счётчик для цикла
rootBtm2.addEventListener("click", function() { // Слушатель событий по клику
	while (i <= 1) { // Входим в цикл
		if (i == 0) { // Если i == 0
			root2.innerHTML += ` 
				<p style="color:rgb(41, 128, 185);" class="text">Lorem ipsum dolor sit amet consectetur, 
					adipisicing elit. 
					Quisquam placeat expedita dignissimos.
				</p>
			`; // Добавляем синий текст
		i++; // Инкриминируем счётчик
		break; // Выходим их цикла

		} else if (i == 1) { // Если i == 1
			root2.innerHTML += `
				<p style="color:rgb(39, 174, 96);" class="text">Lorem ipsum dolor sit amet consectetur, 
					adipisicing elit. 
					Quisquam placeat expedita dignissimos.
				</p>
			`; // Добавляем зелёный текст
		i--; // Дискриминируем счётчик
		break; // Выходим их цикла
		}
	}	
});