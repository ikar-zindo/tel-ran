package lesson1;

import java.util.Arrays;
import java.util.Random;

public class SortAlgs {
   public static void main(String[] args) {
//
//      int[] ints = {0, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31, 1, 3, 7, 0, 3, 2, 11, 31};
//
//      long start = System.nanoTime();
//      sortBruteForce(ints);
//      long end = System.nanoTime();
//
//      System.out.println("Time elapsed := " + (end - start));
//      System.out.println(Arrays.toString(ints));

      int n = 1000;
      int[] testData = generateTestData(n);

      long start = System.nanoTime();
      sortBruteForce(testData);
      long end = System.nanoTime();

      System.out.println("Time elapsed := " + (end - start));

      start = System.nanoTime();
      Arrays.sort(testData);
      end = System.nanoTime();

      System.out.println("Time elapsed := " + (end - start));
   }

   private static int[] generateTestData(int n) {
      Random random = new Random();
      int[] ints = new int[n];
      for (int i = 0; i < ints.length; i++) {
         ints[i] = random.nextInt(0, 100);
      }

      return ints;
   }

   // Selection sort
   private static void sortBruteForce(int[] ints) {

      for (int i = 0; i < ints.length; i++) {
         int min = ints[i];
         int indMin = i;
         for (int j = i + 1; j < ints.length; j++) {
            if (ints[j] < min) {
               indMin = j;
               min = ints[j];
            }
         }
         int tmp = ints[i];
         ints[i] = ints[indMin];
         ints[indMin] = tmp;
      }
   }
}
