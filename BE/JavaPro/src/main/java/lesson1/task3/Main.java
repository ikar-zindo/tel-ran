package lesson1.task3;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat(3, "Чёрный");
        Cat secondCat = new Cat();

        // Обращаться к полю напрямую теперь нельзя,
        // т.к. поле имеет модификатор private
//        secondCat.age = -5;

        // Чтобы обратиться к полю, мы должны
        // использовать сеттер
        secondCat.setAge(5);
        cat.setAge(7);

        System.out.println("Присваиваем возраст минус 9");
        secondCat.setAge(-9);

        System.out.println("Возраст кошки - " + secondCat.getAge());

        System.out.println("Присваиваем возраст 3");
        secondCat.setAge(3);

        System.out.println("Возраст кошки - " + secondCat.getAge());

    }
}
