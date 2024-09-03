package SS_16_06_23;

public class findSumNumbers {
   public static void main(String[] args) {
      int[] array = {2, 1, 5, 9, 6, 8, 7, 6, 1, 10, 0, 20, -1};

      sumOf3Elements(array, 10);

   }

   public static void sumOf3Elements(int[] array, int sum) {

      for (int i = 0; i < array.length - 2; i++) {
         for (int j = i + 1; j < array.length - 1; j++) {
            for (int k = j + 1; k < array.length; k++) {
               if (array[i] + array[j] + array[k] == sum) {
                  System.out.println(array[i] + " + " + array[j] + " + " + array[k] + " = " + sum);
               }
            }
         }
      }
   }
}
