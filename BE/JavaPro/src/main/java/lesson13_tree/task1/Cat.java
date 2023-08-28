package lesson13_tree.task1;

import java.util.Objects;

public class Cat implements Comparable<Cat> {

   private int age;
   private String color;
   private double weight;

   public Cat(int age, String color, double weight) {
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
      return "Cat{" +
              "age=" + age +
              ", color='" + color + '\'' +
              ", weight=" + weight +
              '}';
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Cat cat = (Cat) o;
      return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color);
   }

   @Override
   public int hashCode() {
      return Objects.hash(age, color, weight);
   }

   @Override
   public int compareTo(Cat cat) {
      if (age != cat.age) {
         return age - cat.age;
      }

      return Double.compare(weight, cat.weight);
   }
}
