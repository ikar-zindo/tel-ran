package lesson1;

public class GcdAlgorithm {

   public static int bruteForce(int a, int b) {
      int x = Math.max(a, b);
      int y = Math.min(a, b);

      for (int i = y; i > 0; i--) {
         if (x % i == 0 && y % i == 0)
            return i;
      }
      return 1;
   }

   public static int euclidian(int a, int b) {
      int x = Math.max(a, b);
      int y = Math.min(a, b);

      int tmp = y;
      int result = y;

      while (tmp != 0) {
         tmp = x % y;
         result = y;
         x = y;
         y = tmp;

      }
       return result;
   }


   public static void main(String[] args) {

      long start = System.nanoTime();
      int result = bruteForce(5000, 3000);
      long end = System.nanoTime();
      System.out.println("Time elapse := " + (end - start) + "ns");
      System.out.println(result);


      start = System.nanoTime();
      result = euclidian(5000, 3000);
      end = System.nanoTime();
      System.out.println("Time elapse := " + (end - start) + "ns");
      System.out.println(result);
   }
}
