package de.telran.practice.lectures.oop.base;

public class Bird extends Animal{

   public Bird(String name, String color) {
      super(name, color, "bird");
      this.name = name;
      this.color = color;
   }

   @Override
   public void voice() {
      System.out.printf("%s bird %s chik cheerick%n", color, name);
   }
}
