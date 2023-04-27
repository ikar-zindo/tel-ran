// const title = document.querySelector("h1");
// console.log(title);

// const text = document.querySelector(".description");
// console.log(text);

// const text1 = document.querySelector("section p");
// console.log(text1);

// const googleLink = document.querySelector("#google-link");
// console.log(googleLink);

//TODO: Exercise 0
// const section = document.querySelector(".container");
// const text = document.querySelector(".container .text");
// const h2 = document.querySelector(".container h2");
// const link = document.querySelector(".container .link");
// console.log(section);
// console.log(text);
// console.log(h2);
// console.log(link);

//TODO: Exercise 1
// const p = document.querySelectorAll("p");
// console.log(p);

// const description = document.querySelectorAll(".description");
// console.log(description);

//! Изменение текста в селекторе
const title = document.querySelector("h1");
console.log(title.innerText);

title.innerText = "Привет, Мир!";
console.log(title.innerText);

const googleLink = document.querySelector("#google-link");
googleLink.innerText = "Ссылка на гугл";

//! Найти все <р> и поменять везде текст
const texts = document.querySelectorAll("p");
console.log(texts[0]);
console.log(texts[0].innerText);

for (let i = 0; i < texts.length; i++) {
   texts[i].innerText = "Мой текст";
}

//TODO: Exercise 2
const links = document.querySelectorAll("a");
for (let i = 0; i < links.length; i++) {
   links[i].innerText = "Link";
}

//! .getAttribute() .setAttribute()
const link = document.querySelector("#google-link");
const href = link.getAttribute("href");
console.log(href);


//TODO: Exercise 3
const img = document.querySelector("img");
const src = img.getAttribute("src");
console.log(src);

const imgs = document.querySelectorAll("img");
for (let i = 0; i < imgs.length; i++) {
   console.log(imgs[i].getAttribute("src"));
}
