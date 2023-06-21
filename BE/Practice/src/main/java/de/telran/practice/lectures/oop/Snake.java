package de.telran.practice.lectures.oop;

public class Snake extends Animal{
   public Snake(String name, String color) {
      super(name, color, "snake");
   }

   @Override
   public void voice() {
      System.out.printf("%s snake shshshshhsshshshh%n", color, name);
   }

   @Override
   public void move() {
      System.out.println("");
   }
}
