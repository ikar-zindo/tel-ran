package Cycles;

public class WhileExample1 {
   public static void main(String[] args) {

      // самый базовый пример
//      int q = 0;
//      while (q < 5) {
//         System.out.println("Hello, Java " + (q + 10) + "!");
//         q++;
//      }

      // while + array
      int[] a = {5,4,3,1,9,6,8,2};
      // idx     0 1 2 3 4 5 6 7

//      int q = 0;
//      while (q < a.length) {
//         System.out.print(a[q] + " ");
//         q++;
//      }

      // max element
//      int max = a[0];
//      int q = 1;
//
//      while (q < a.length) {
//         if (a[q] > max)
//            max = a[q];

//         q++;
//      }
//
//      System.out.println(max);


      // mean
      double sum = 0;
      int q = 0;

      while (q < a.length) {
         sum += a[q];
         q++;
      }

      System.out.println(sum / a.length);
   }
}