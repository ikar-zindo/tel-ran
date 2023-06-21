package de.telran.practice.lectures.oop.base;

public class Animal {

   protected String name;
   protected String color;
   protected String type;

   public Animal(String name, String color, String type) {
      this.name = name;
      this.color = color;
      this.type = type;
   }

   private Animal() {
      System.out.println("Animal born");
   }

   public void move() {

   }

   public void voice() {}
}
