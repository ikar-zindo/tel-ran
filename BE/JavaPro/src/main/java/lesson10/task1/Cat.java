package lesson10.task1;

import java.util.Objects;

public class Cat {

   private String color;
   private int age;
   private double weight;

   public Cat() {
   }

   public Cat(String color, int age, double weight) {
      this.color = color;
      this.age = age;
      this.weight = weight;
   }

   public String getColor() {
      return color;
   }

   public int getAge() {
      return age;
   }

   public double getWeight() {
      return weight;
   }

   // ручной ввод метода .equals
//   @Override
//   public boolean equals(Object obj) {
//      if (this == obj)
//         return true;
//
//      if (obj == null)
//         return false;
//
//      if (obj.getClass() != this.getClass())
//         return false;
//
//      Cat cat = (Cat) obj;
//
//      // this - текущий кот, укоторого вызван метод .equals
//      // cat - это тот кот, который передан в качемтве входящего параметра
//
//      return  this.age == cat.age && Double.compare(this.weight, cat.weight) == 0 && Objects.equals(this.color, cat.color);
//   }

// генерация метода .equals с помощью IDEA
   @Override
   public boolean equals(Object o) {
      if (this == o)
         return true;

      if (o == null || getClass() != o.getClass())
         return false;

      Cat cat = (Cat) o;

      return age == cat.age && Double.compare(cat.weight, weight) == 0 && Objects.equals(color, cat.color);
   }

   @Override
   public int hashCode() {
      return Objects.hash(color, age, weight);
   }
}
