package _2023_09_18.fruits;

public class Fruit {

   protected double weight;

   public Fruit(double weight) {
      this.weight = weight;
   }

   public double getWeight() {
      return weight;
   }

   public void print() {
      System.out.println("Fruit := " + this.getClass().getSimpleName() + "; weight := " + this.weight);
   }
}
