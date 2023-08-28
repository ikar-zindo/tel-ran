package lesson4_Autoboxing.task1;

import java.util.Objects;

public class Cat {

   private int age;
   private String color;

   public Cat() {
   }

   public Cat(int age, String color) {
      this.age = age;
      this.color = color;
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

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Cat cat = (Cat) o;
      return age == cat.age && Objects.equals(color, cat.color);
   }

   @Override
   public int hashCode() {
      return Objects.hash(age, color);
   }

   public void test() {
      int value = 7;
      Cat cat = new Cat();
   }
}
