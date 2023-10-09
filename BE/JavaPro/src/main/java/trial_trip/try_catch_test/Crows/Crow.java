package trial_trip.try_catch_test.Crows;

import java.io.Serializable;

public class Crow implements Serializable {

   private String name;
   private int age;
   private double weight;

   public Crow(String name, int age, double weight) {
      this.name = name;
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
      return String.format("Ворон: имя: %s возраст - %d, вес - %.2f", name, age, weight);
   }
}
