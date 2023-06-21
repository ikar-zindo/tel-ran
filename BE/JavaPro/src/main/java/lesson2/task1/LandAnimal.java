package lesson2.task1;

public abstract class LandAnimal extends Animal {

    public LandAnimal(double weight) {
        super(weight);
        System.out.println("Вызван конструктор LandAnimal");
    }

    public abstract void voice();

    public void printInfo() {
        System.out.println("Это класс сухопутных животных");
    }
}
