package last;

public class Main {
   public static void main(String[] args) {

      int[] arr = {1, 2, 3, 4, 5, 6};

      System.out.println(sum(6));
      System.out.println(sumRecursion(2));
      System.out.println(fibonacci(5));
   }

   public static int sum(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
         sum += i;
      }
      return sum;
   }

   public static int sumRecursion(int n) {
      if (n <= 0) throw new Error("NO");
      if (n == 1) return 1;
      return n + sumRecursion(n - 1);
   }

   public static int fibonacci(int n) {
      if (n == 0) return 0;
      if (n == 1) return 1;

      return  fibonacci(n - 1) + fibonacci(n - 2);
   }
}
