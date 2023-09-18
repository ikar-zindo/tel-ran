package lesson23_generics_PECS.task1;

import lesson17_lambdas_practice.task2.Cat;
import lesson2_inheritance.task1.Elephant;

public class Main {
   public static void main(String[] args) {

//      Cat cat = new Cat(5.2);
//      LandAnimal landAnimal = new Cat(6.5);
//      Animal animal = new Cat(4.8);
//
//      Object obj = new Cat(3.9);
//      Object obj1 = "Hello, World!";
//      Object obj2 = 2;

      Box box = new Box();

      box.putItem(new Cat(5, "BLACK", 6.23));
      box.putItem("Hello!");
      box.putItem(7);
      box.putItem(false);
      box.putItem(new Elephant(1500));

      Cat cat = (Cat) box.getItem();

      System.out.println("Цвет кота := " + cat.getColor());

//      Cat cat1 = (Cat) box.getItem();

      Object obj = box.getItem();

      if (obj instanceof Cat) {
         System.out.println("Цвет кота := " + ((Cat) obj).getColor());
      }

      if (obj instanceof String) {
         System.out.println("Длина слова := " + ((String) obj).length());
      }
   }
}
