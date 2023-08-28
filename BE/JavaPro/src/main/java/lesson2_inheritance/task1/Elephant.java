package lesson2_inheritance.task1;

public class Elephant extends LandAnimal {

    public Elephant(double weight) {
        super(weight);
    }

    @Override
    public void voice() {
        System.out.println("Слон трубит");
    }
}