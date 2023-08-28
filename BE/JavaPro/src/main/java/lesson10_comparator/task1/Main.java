package lesson10_comparator.task1;

public class Main {
   public static void main(String[] args) {

      int x = 5;
      int y = 10;
      int z = 5;

      // Переменная для хронения результата спавнения
      boolean result = x== y;
      System.out.println("Сравнение х и у == " + result);

      result = x == z;
      System.out.println("Сравнение х и z == " + result);

      result = x != y;
      System.out.println("Сравнение х и у != " + result);

      result = x != z;
      System.out.println("Сравнение х и z != " + result);
   }
}
