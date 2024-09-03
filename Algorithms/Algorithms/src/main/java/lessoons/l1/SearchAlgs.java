package lessoons.l1;

import java.util.Arrays;

public class SearchAlgs {

   static Integer[] date = {1, 2, 1, 6, -6, 10, 21, 17, 9};

   public static void main(String[] args) {

      System.out.println(findSequentially(date, 2));
      System.out.println(binarySearch(date, 21));

      Integer i = date[6];
   }

   public static Integer findSequentially(Integer[] data, Integer key) {

      for (int i = 0; i < data.length; i++) {
         if (data[i].equals(key)) return i;
      }

      return null;
   }

   public static Integer binarySearch(Integer[] data, Integer key) {

      Arrays.sort(data);
      System.out.println(Arrays.toString(data));

      int left = 0;
      int right = data.length - 1;
      int middle = left + (right - left) / 2;

      while (left <= right) {
         if (data[middle].equals(key)) return middle;
         else if (data[middle].compareTo(key) > 0) right = middle - 1;
         else if (data[middle].compareTo(key) < 0) left = middle + 1;
         middle = left + (right - left) / 2;
      }
      return null;
   }
}
