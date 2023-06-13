package ArrayExamples;

import java.util.Arrays;

/*
Дан массив из значений 2 31 4 5 20 45 12 24 50 53
 */
public class Task4 {
   public static void main(String[] args) {

      int[] a = {2, 31, 4, 5, 20, 45, 12, 24, 50, 53};

      System.out.println(Arrays.toString(spline3(a)));
      System.out.println(Arrays.toString(spline5(a)));

   }

   public static double[] spline3(int[] input) {
      double[] result3 = new double[input.length];

      result3[0] = input[0];
      for (int i = 1; i < input.length - 1; i++) {
         result3[i] = (input[i - 1] + input[i] + input[i + 1]) / 3.0;
      }
      result3[input.length-1] = input[input.length - 1];
      return result3;
   }

   public static double[] spline5(int[] input) {
      double[] result5 = new double[input.length];

      result5[0] = input[0];
      result5[1] = input[1];
      for (int i = 2; i < input.length - 2; i++)
         result5[i] = (input[i - 2] + input[i - 1] + input[i] + input[i + 1] + input[i + 2]) / 5.0;
      result5[input.length-2] = input[input.length - 2];
      result5[input.length-1] = input[input.length - 1];

      return result5;
   }
}
