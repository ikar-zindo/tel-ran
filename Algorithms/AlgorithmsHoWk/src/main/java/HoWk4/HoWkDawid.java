package HoWk4;

public class HoWkDawid {
   public static void main(String[] args) {

      int[] arr1 = {100, 112, 256, 349, 770};
      int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
      int k = 7;

      System.out.println(marge(arr1, arr2, k));
   }

   public static int marge(int[] arr1, int[] arr2, int k) {
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
      return result[k - 1];
   }
}
