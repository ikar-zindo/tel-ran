package lesson6.HoWk;

import java.util.Arrays;

public class Merge {

   public static void main(String[] args) {

      int[] arr1 = {1, 3, 5, 7, 8};
      int[] arr2 = {2, 4, 6, 9, 12, 15};
      int[] arr3 = {2, 4, 6, 9, 12, 15, 1, 3, 5, 7, 8};

      System.out.println(Arrays.toString(merge(arr1, arr2)));
      System.out.println(Arrays.toString(mergeSort(arr3)));
   }

   public static int[] merge(int[] arr1, int [] arr2) {
      int i = 0;
      int j = 0;
      int m = 0;
      int[] arr = new int[arr1.length + arr2.length];

      while (i < arr1.length && j < arr2.length) {
         if (arr1[i] < arr2[j]) {
            arr[m++] = arr1[i++];
         } else {
            arr[m++] = arr2[j++];
         }
      }

      while (i < arr1.length) {
         arr[m++] = arr1[i++];
      }

      while (j < arr2.length) {
         arr[m++] = arr2[j++];
      }

      return arr;
   }

   public static int[] mergeSort(int[] arr) {

      if (arr.length <= 1) {
         return arr;
      }

      int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
      int[] right = Arrays.copyOfRange(arr, arr.length / 2, arr.length);

      return merge(mergeSort(left), mergeSort(right));
   }
}
