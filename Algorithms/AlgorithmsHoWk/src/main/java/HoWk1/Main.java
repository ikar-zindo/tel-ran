package HoWk1;

/**
 * Дан отсортированный массив, в котором все элементы
 * встречаются дважды (один за другим),
 * а один элемент появляется только один раз.
 * Написать метод для нахождения этого элемента.
 * Определить асимптотическую сложность алгоритма.
 */

public class Main {
   public static void main(String[] args) {

      int[] arr = {5, 5, 6, 7, 7, 8, 8, 10, 10, 11, 11, 18, 18};

      System.out.println(searchUnpairedElementMeth1(arr));
   }

   private static int searchUnpairedElementMeth1 (int[] arr) {
      // Использую инсрументы задоженныв Java - побитовые операции
      int x = 0;
      for (int i : arr) {
         x = x ^ i;
      }
      return x;
   }

   /**
    * асимптотическую сложность алгоритма = О(n)
    */
}
