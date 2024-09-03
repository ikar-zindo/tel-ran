package SS_09_06_23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {
   public static void main(String[] args) {
      int[] array = {5,1,2,3,4};

      for (int i = 0; i < array.length-1; i++){
         boolean checked = false;
         for (int j = 0; j < array.length - 1 - i; j++){
            if (array[j] > array[j + 1]){
               int temp = array[j];
               array[j] = array[j + 1];
               array[j + 1] = temp;
               checked = true;
            }
         }
         if (!checked)
            break;
      }

      System.out.println(Arrays.toString(array));
   }
}
