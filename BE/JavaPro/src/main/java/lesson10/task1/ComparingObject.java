package lesson10.task1;

public class ComparingObject {
   public static void main(String[] args) {

      Cat cat1 = new Cat("BLACK", 5, 4.5);
      Cat cat2 = new Cat("BLACK", 5, 4.5);

      boolean result = cat1 == cat2;
      System.out.println("Равны ли коты? := " + result);

      Cat cat3 = cat2;
      result = cat2 == cat3;
      System.out.println("Равны ли коты 2 и 3? := " + result);

      result = cat1.equals(cat2);
      System.out.println("Равны ли коты 1 и 2 (.equals)? := " + result);

      Cat cat4 = new Cat();
      Cat cat5 = new Cat();

      result = cat4.equals(cat5);
      System.out.println("Равны ли коты 4 и 5? := " + result);
   }
}
