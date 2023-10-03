package org.example._2023_08_03.task1;

public class Cat implements Comparable<Cat> {

   private String name;
   private int age;
   private String color;
   private boolean isHungry;

   public Cat(String name, int age, String colour, boolean isHungry) {
      this.name = name;
      this.age = age;
      this.color = colour;
      this.isHungry = isHungry;
   }

   public String getName() {
      return name;
   }

   public int getAge() {
      return age;
   }

   public String getColor() {
      return color;
   }

   public boolean isHungry() {
      return isHungry;
   }

   @Override
   public String toString() {
      return name +
              ", age = " + age +
              ", colour = " + color +
              ", isHungry = " + isHungry;
   }

   @Override
   public int compareTo(Cat o) {
      return this.name.compareTo(o.name);
   }
}
