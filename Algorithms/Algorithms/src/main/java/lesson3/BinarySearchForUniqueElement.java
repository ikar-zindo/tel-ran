package lesson3;

public class BinarySearchForUniqueElement {

   public static void main(String[] args) {
      int[] array = new int[]{1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

      System.out.println("findBinary := " + find(array));

      System.out.println("findBinaryRecursion := " + findRecursion(array));
   }

   public static int find(int[] array) {
      int start = 0;
      int end = array.length - 1;

      while (start != end) {
         int middle = (end - start) / 2 + start;
         if (array[middle] != array[middle - 1] && array[middle] != array[middle + 1]) return array[middle];

         int leftCount;
         boolean isDoubleLetterToLeft = array[middle] == array[middle - 1];
         if (isDoubleLetterToLeft) {
            leftCount = middle - 1 - start;
         } else {
            leftCount = middle - start;
         }

         if (leftCount % 2 == 1) {
            end = isDoubleLetterToLeft ? middle - 2 : middle - 1;
         } else {
            start = isDoubleLetterToLeft ? middle + 1 : middle + 2;
         }
      }
      return array[start];
   }

   public static int findRecursion(int[] array) {
      return innerRecursion(array, 0, array.length - 1);
   }

   public static int innerRecursion(int[] array, int start, int end) {
      if (start == end) return array[start]; // base condition

      int middle = (end - start) / 2 + start;
      if (array[middle] != array[middle - 1] && array[middle] != array[middle + 1]) return array[middle];

      int leftCount;
      boolean isDoubleLetterToLeft = array[middle] == array[middle - 1];
      if (isDoubleLetterToLeft) {
         leftCount = middle - 1 - start;
      } else {
         leftCount = middle - start;
      }

      if (leftCount % 2 == 1) {
         end = isDoubleLetterToLeft ? middle - 2 : middle - 1;
      } else {
         start = isDoubleLetterToLeft ? middle + 1 : middle + 2;
      }

      return innerRecursion(array, start, end);
   }
}
