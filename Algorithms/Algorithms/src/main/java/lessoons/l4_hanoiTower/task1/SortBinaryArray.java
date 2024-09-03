package lessoons.l4_hanoiTower.task1;

import java.util.Arrays;

public class SortBinaryArray {
   public static void main(String[] args) {
      int[] arr = {0, 1, 1, 0, 1, 1, 0, 0, 0};
      sort(arr);

      System.out.println(Arrays.toString(arr));
   }


   public static void sort(int[] arr) {

      int count = 0;

      for (int i : arr) {
         if (i == 0) count++;
      }
      for (int i = 0; i < arr.length; i++) {
         if (i < count) arr[i] = 0;
         else arr[i] = 1;
      }
   }
}