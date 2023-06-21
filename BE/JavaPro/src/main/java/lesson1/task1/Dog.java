package lesson1.task1;

import java.util.Date;

public class Dog {

    int age;
    String color;
    Date date;

    // Конструктор по умолчанию, который будет добавлен в наш класс
    // автоматически компилятором, если мы его не напишем сами.
    public Dog() {
        System.out.println("Вызван конструктор класса Dog.");
    }

    // Конструктор с входящим параметром
    // Создаёт собаку сразу с каким-то определённым возрастом
    public Dog(int age) {
        this.age = age;
    }

    public Dog(String color) {
        this.color = color;
    }

    public Dog(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public void sleep() {
        System.out.println("Собака спит");
    }

    public void bark() {
        System.out.println("Гав-гав!");
    }

    public void test() {
        sleep();
    }
}