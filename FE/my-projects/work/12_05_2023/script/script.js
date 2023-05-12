
const count_score = document.querySelector("#count_score");

function start_game() {
   object.classList.toggle('start');
   score = 0; // обнуление очков
   count_score.innerText = `0`;
}

function hit() { // дойствие при попадании
   score++; 
   count_score.innerText = `${score}`; // Счёичик очков

   object.classList.remove('start');
   void object.offsetWidth; // перекомпоновка DOM (API)
   object.classList.add('start');

   // Случайное появление Луны
   let random_offset = Math.floor(Math.random() * 400);
   object.style.left = `${random_offset}px`;

}

function miss(event) { // дойствие при промахивание
   if (event.target.id == "area") {
      score--; 
      count_score.innerText = `${score}`;
   }

}

let score = 0; // очки
let object = document.querySelector('#object'); // Ищем объект Луна
