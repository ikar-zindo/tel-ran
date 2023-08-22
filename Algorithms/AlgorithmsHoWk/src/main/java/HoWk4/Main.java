package HoWk4;

public class Main {
   public static void main(String[] args) {
      int[] arr1 = {100, 112, 256, 349, 770};
      int[] arr2 = {72, 86, 113, 119, 265, 445, 892};
      int k = 7;

      int result = findElement(arr1, arr2, k);
      System.out.println("K-й элемент: " + result);
   }

   static int findElement(int[] arr1, int[] arr2, int k) {
      int m = arr1.length;
      int n = arr2.length;
      int i = 0, j = 0;

      while (i < m && j < n) {
         if (arr1[i] < arr2[j]) {
            if (--k == 0) {
               return arr1[i];
            }
            i++;
         } else {
            if (--k == 0) {
               return arr2[j];
            }
            j++;
         }
      }

      while (i < m) {
         if (--k == 0) {
            return arr1[i];
         }
         i++;
      }

      while (j < n) {
         if (--k == 0) {
            return arr2[j];
         }
         j++;
      }

      return -1; // Невозможно дойти до этой строки, если k корректно задан.
   }
}
