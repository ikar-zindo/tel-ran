package lesson2.task1;

public class Dog extends LandAnimal {

    public Dog(double weight) {
        super(weight);
        System.out.println("Вызван конструктор Dog");
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав!");
    }
}
