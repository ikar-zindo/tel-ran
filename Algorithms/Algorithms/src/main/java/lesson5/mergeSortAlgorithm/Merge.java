package lesson5.mergeSortAlgorithm;

import java.util.Arrays;

public class Merge {
   public static void main(String[] args) {

      int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

      System.out.println(Arrays.toString(mergeSort(arr)));
   }

   public static int[] merge(int[] arr1, int[] arr2) {
      int i = 0;
      int j = 0;
      int m = 0;
      int[] result = new int[arr1.length + arr2.length];

      while (i < arr1.length && j < arr2.length) {
         if (arr1[i] < arr2[j]) {
            result[m++] = arr1[i++];
         } else {
            result[m++] = arr2[j++];
         }
      }

      while (i < arr1.length) result[m++] = arr1[i++];
      while (j < arr2.length) result[m++] = arr2[j++];
      return result;
   }

   public static int[] mergeSort(int[] arr) {
      if (arr.length <= 1) return arr;
      int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
      int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

      return merge(mergeSort(left), mergeSort(right));
   }
}
