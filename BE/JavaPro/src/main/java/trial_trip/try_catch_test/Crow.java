package trial_trip.try_catch_test;

import java.io.Serializable;

public class Crow implements Serializable {

   private int age;
   private double weight;

   public Crow(int age, double weight) {
      this.age = age;
      this.weight = weight;
   }

   public int getAge() {
      return age;
   }

   public double getWeight() {
      return weight;
   }

   @Override
   public String toString() {
      return String.format("Ворон: возраст - %d, вес - %.2f", age, weight);
   }
}
