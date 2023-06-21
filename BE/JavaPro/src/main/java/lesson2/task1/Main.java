package lesson2.task1;

public class Main {

    public static void main(String[] args) {

        System.out.println("Создаём кошку");
        Cat cat = new Cat(3);
//        cat.weight = 3;

        System.out.println("Создаём вторую кошку");
        Cat cat1 = new Cat(4);
//        cat1.weight = 4;

        System.out.println("Создаём собаку");
        Dog dog = new Dog(7);
//        dog.weight = 7;

        System.out.println("Вес кошки - " + cat.weight + ", а вес собаки - " + dog.weight +
                ", а вес второй кошки - " + cat1.weight);

        test();

        cat.voice();
        dog.voice();

        cat.printInfo();

        Bird bird = new Bird(1);
        Airplane airplane = new Airplane();

        bird.fly();
        airplane.fly();

        bird.landing();
        airplane.landing();

        System.out.println(Flyable.INFO);
    }

    public static void test() {
        System.out.println("Создаём корову");
        Cow cow = new Cow(150);
//        cow.weight = 150;
        System.out.println("Вес коровы (в методе test) - " + cow.weight);
    }
}
