package lesson1.task1;

public class Main {

    public static void main(String[] args) {

        // 1. Создание переменной (объект ещё не создаётся)
        Dog dog;

        // 2. Создаётся объект собаки, под него выделяется память,
        // и ссылка на этот объект записывается в переменную dog
        System.out.println("Создаём объект собаки.");
        dog = new Dog();
        System.out.println("Объект собаки создан.");

        dog.age = 7;
        dog.color = "Чёрный";

        System.out.println("Возраст - " + dog.age);
        System.out.println("Цвет - " + dog.color);

        dog.bark();
        dog.sleep();

        Dog secondDog = new Dog(5);
        System.out.println("Возраст второй собаки - " + secondDog.age);

        Dog thirdDog = new Dog(9);
        System.out.println("Возраст третьей собаки - " + thirdDog.age);

        Dog fourthDog = new Dog(3, "Белый");

        secondDog.sleep();
        thirdDog.sleep();
        fourthDog.bark();
    }
}
