
const count_score = document.querySelector("#count_score");
const body = document.querySelector.body;
const area = document.querySelector('#area');

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
         if (score == -1) {
            finish_game();
         }
   }
}

function finish_game() {
   const gameOver = document.querySelector(".game-over");
   area.classList.add('finish');
   object.classList.remove('start');
   count_score.innerText = `0`;
	gameOver.style.display = "block";
}


let score = 0; // очки
let object = document.querySelector('#object'); // Ищем объект Луна
