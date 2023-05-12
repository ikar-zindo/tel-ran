
const count_score = document.querySelector("#count_score");

function start_game() {
   object.classList.toggle('start');
   score = 0;
   count_score.innerText = `0`;

}

function hit(event) {
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
