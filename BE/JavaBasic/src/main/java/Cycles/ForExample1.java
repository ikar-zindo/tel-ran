package Cycles;

public class ForExample1 {
   public static void main(String[] args) {

      // Условие инициализации
      // classic
      for (int i = 0; i < 3; i++) {
         System.out.println("Hello, Java! " + i);
      }

      System.out.println();

      // non-classic
      int i = 0;
      for ( ; i < 3; i++) {
         System.out.println("Hello, Java! " + i);
      }
      System.out.println(i);

      for (int j = 0; j < 100; j += 2) {
         System.out.print(j + " ");
      }
   }

   public static void getExample1() {
      // прямой перебор чисел
      for (int i = 0; i < 3; i++) {
         System.out.println("Hello, Java! " + (i + 1));
      }

      System.out.println();

      // обратный перебор чисел
      for (int i = 2; i >= 0; i--) {
         System.out.println("Hello, Java! " + (i + 1));
      }
   }
}
