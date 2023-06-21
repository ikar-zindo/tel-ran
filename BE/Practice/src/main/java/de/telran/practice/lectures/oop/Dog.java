package de.telran.practice.lectures.oop.base;

public class Dog extends Animal{
   public Dog(String name, String color) {
      super(name, color, "dog");
      this.name = name;
      this.color = color;
   }

   @Override
   public void voice() {
      System.out.printf("%s cat %s ", color, name);
   }
}
