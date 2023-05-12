// const count_score = document.querySelector("#count_score");

function start_game() {
   object.classList.toggle('start');
}

function hit(event) {
   const count_score = document.querySelector("#count_score");
   score++;
   count_score.innerText = `${score}`;
}

function miss(event) {
   if (event.target.id == "area") {
      console.log("miss");
   }
}

let score = 0;
let object = document.querySelector('#object');
