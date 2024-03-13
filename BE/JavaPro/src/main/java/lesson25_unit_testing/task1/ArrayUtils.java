package lesson25_unit_testing.task1;

public class ArrayUtils {

   // 5 -> [1, 2, 3, 4, 5]

   public static int[] getArrayBySize(int size) {

      if (size < 0) {
         throw new RuntimeException("Размер массива не может быть отрицательным");
      }

      int[] arr = new int[size];

      for (int i = 0; i < arr.length; i++) {
         arr[i] = i + 1;
      }

      return arr;
   }
}
