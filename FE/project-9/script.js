//! Объект
const laptop = {
   RAM: 4,
   country: "China",
   price: 1500,
   currency: "$",
   color: ["BLACK", "GREY", "WHITE"],
   additionalInfo: {
      warrantly: "24 month",
      class: "ordinary"
   }
};


// console.log(`${laptop.price} ${laptop.currency}`);

// console.log(laptop.additionalInfo.warrantly);

//TODO: Exercise 1
// console.log(laptop.color);

// for (let i = 0; i < laptop.color.length; i++) {
//    console.log(laptop.color[i]);
// }

//TODO: Exercise 2
// const product = {
//    price: 15000,
//    name: "Tesla"
// }

// console.log(product.price);
// console.log(product.name);

//! Массив объектов
// const products = [
//    {
//       name: "Iphone 14",
//       price: 50000
//    },
//    {
//       name: "Iphone 13",
//       price: 40000
//    },
//    {
//       name: "Samsung S22+",
//       price: 45000
//    },
// ]

//TODO:  Exercise 3
// for (let i = 0; i < products.length; i++) {
//    console.log(`Название: ${products[i].name}. Цена: ${products[i].price}`)
// }

//! Cумма
// let sum = products[0].price + products[1].price + products[2].price;
// console.log(sum);

// let sum = 0;
// for (let i = 0; i < products.length; i++) {
//    sum += products[i].price;
// }
// console.log(sum);

//! Фильтрация и сортиповка
// for (let i = 0; i < products.length; i++) {
//    if (40000 < products[i].price) {
//       console.log(products[i].name)
//    }
// }

//TODO:  Exercise 4
const products = [
   {
      title: "TV Samsung",
      category: "TV",
      price: 40000
   },
   {
      title: "TV Xiamo",
      category: "TV",
      price: 42000
   },
   {
      title: "Samsung S22+",
      category: "phone",
      price: 45000
   },
   {
      title: "HP 1065",
      category: "laptop",
      price: 70000
   },
    {
      title: "ACER G575",
      category: "laptop",
      price: 63000
   }
]

// for (let i = 0; i < products.length; i++) {
//    console.log(`Название товара: ${products[i].title} и его категория ${products[i].category}`);
// }

// for (let i = 0; i < products.length; i++) {
//    if (45000 < products[i].price) {
//       console.log(products[i].title);
//    }
// }

// for (let i = 0; i < products.length; i++) {
//    if (products[i].category == "laptop") {
//       console.log(`Название товара: ${products[i].title}, цена: ${products[i].price}`)
//    }
// }

//TODO:  Exercise 5
// for (let i = 0; i < products.length; i++) {
//    if (products[i].price > 45000) {
//       discountPrice = products[i].price * .9;
//       console.log(`Название товара: ${products[i].title}, цена со скидкой: ${discountPrice}`);
//    } else {
//       console.log(`Название товара: ${products[i].title}, цена: ${products[i].price}`);
//    }
// }
//TODO:  Exercise 6
const names = ["arsen", "ivan", "maria"];
const newNames = [];

for (let i = 0; i < names.length; i++) {
   newNames.push(names[i].toUpperCase());
}

console.log(newNames);