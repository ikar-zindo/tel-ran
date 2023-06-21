package lesson2.task1;

public class Airplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Самолёт летит");
    }

    @Override
    public void landing() {
        System.out.println("Самолёт приземлился");
    }
}
