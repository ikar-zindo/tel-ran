package de.telran.practice.lectures.oop;

public class Parrot extends Bird{

   public Parrot(String name, String color) {
      super(name, color);
      System.out.println("Bird born");
   }

   public void speak() {
      System.out.printf("%s bird %s: 'Piastros'%n", color, name);
   }

   public void fly() {
      System.out.printf("%s bird %s flying%n", color, name);
   }
}
