package SS_09_06_23;

import java.util.Arrays;

public class FindNumber {
   public static void main(String[] args) {

      int[] numbers = {1,0,10,5,4,6,7,3};

      findNumber(numbers, 9);
   }

   public static void findNumber(int[] array, int sum) {
      // David method
      Arrays.sort(array);

      int i = 0;
      int j = array.length - 1;

      while (j > i){
         if (array[i] + array[j] > sum) {
            j--;
         } else if (array[i] + array[j] < sum) {
            i++;
         } else {
            System.out.println(array[i] + ", " + array[j]);
            j--;
            i++;
         }
      }

      // my method
//      for (int i = 0; i < array.length - 1; i++) {
//         for (int j = array.length - 1; j > i; j--) {
//            if (array[i] + array[j] == sum){
//               System.out.println(array[i] + ", " + array[j]);
//            }
//         }
//      }
   }
}