package lesson17_lambdas_practice.task2;

public class Dog {
   private int age;
   private String color;
   private double weight;

   public Dog(int age, String color, double weight) {
      this.age = age;
      this.color = color;
      this.weight = weight;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }

   @Override
   public String toString() {
      return String.format("Собака: возрвст - %d, цвет - %s, вес - %.2f", age, color, weight);
   }
}
