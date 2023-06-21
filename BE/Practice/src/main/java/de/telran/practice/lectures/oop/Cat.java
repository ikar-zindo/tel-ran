package de.telran.practice.lectures.oop;

public class Cat extends Animal{
   public Cat(String name, String color) {
      super(name, color, "cat");
      System.out.println("Cat born");
   }


   @Override
   public void voice() {
      System.out.printf("%s bird %s mow%n", color, type, name);
   }
}
