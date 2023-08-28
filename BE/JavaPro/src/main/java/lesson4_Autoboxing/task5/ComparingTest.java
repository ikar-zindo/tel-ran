package lesson4_Autoboxing.task5;

import lesson4_Autoboxing.task1.Cat;

public class ComparingTest {
   public static void main(String[] args) {

      int x = 7;
      int y = 7;
      Integer integerX = 7;
      Integer integerY = new Integer(7);

      boolean compare = x == y;

      System.out.println("Сравнение х и у: " + compare);

      Cat cat1 = new Cat(3, "BLACK");
      Cat cat2 = new Cat();
      cat2.setColor("BLACK");
      cat2.setAge(3);

      compare = cat1 == cat2;
      System.out.println("Сравнение двух котов: " + compare);

      compare = cat1.equals(cat2);
      System.out.println("Сравнение х и у: " + compare);

      compare = x == integerX;
      System.out.println("Сравнение int и Integer: " + compare);

      compare = integerX == integerY;
      System.out.println("Сравнение двух Integer: " + compare);

      compare = cat1.equals(cat2);
      System.out.println("Сравнение двух котов: " + compare);

      int a = 50;
      char ch = 'D';

   }
}
