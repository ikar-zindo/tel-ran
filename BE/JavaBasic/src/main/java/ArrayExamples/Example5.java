package ArrayExamples;

import java.util.Arrays;

// пример рабоьы с copyOfRange()
public class Example5 {
   public static void main(String[] args) {
      int[] a = {1,2,3,4,5,6,7};
      double[] b = {1.5, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7};

      addAndMult(b, 5, 10);

      addAndMult(Arrays.copyOfRange(b, 2, 10), 5, 10);

      double[] c = {1,2,3,4};
      addAndMult(new double[]{1,2,3,4}, 5, 10);
      System.out.println("after 1st time of method = " + Arrays.toString(b));
      addAndMult(Arrays.copyOfRange(b, 2, 10), 5, 10);
      System.out.println("after 2nd time of method = " + Arrays.toString(b));

      // весьма простой случай
//      int[] ints1 = Arrays.copyOfRange(a, 2,5);
//      int[] ints2 = Arrays.copyOfRange(a, 2,15);
//
//      System.out.println(Arrays.toString(ints2));
   }

   public static void addAndMult(double[] input, double x, double y) {
      for (int i = 0; i < input.length; i++) {
         input[i] += x;
         input[i] *= y;
      }

      System.out.println(Arrays.toString(input));
   }
}
