package lesson2.task2;

import lesson2.task1.*;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        String[] words = new String[5];

//        numbers[2] = "Hello";
//        words[2] = 7;

        words[2] = "Hello";
        numbers[2] = 7;

        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];

        cats[2] = new Cat(3);
//        cats[3] = new Dog(5);

        LandAnimal[] animals = new LandAnimal[5];
        animals[0] = new Cat(3);
        animals[1] = new Dog(7);
        animals[2] = new Cow(200);
        animals[3] = new Elephant(3000);
        animals[4] = new Cat(5);

        for (LandAnimal currentAnimal : animals) {
            // Полиморфизм времени выполнения
            // Для каждого объекта вызывается своя собственная
            // реализация метода voice()
            // В момент написания кода мы не знаем,
            // у какого именно объекта будет вызван метод,
            // т.к. в массиве могут находиться разные объекты
            currentAnimal.voice();
        }

        System.out.println("----------------------");

        // Полиморфизм времени компиляции
        // В момент написания кода мы знаем,
        // какой именно метод будет вызван
        Cat cat = new Cat(5);
        cat.voice();
        cat.voice(3);
        cat.voice(5);
    }
}
