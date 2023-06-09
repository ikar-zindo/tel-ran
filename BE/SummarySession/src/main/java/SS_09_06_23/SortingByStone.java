package SS_09_06_23;

import java.util.Arrays;

public class SortingByStone {
   public static void main(String[] args) {
      int[] array = {5,4,3,2,1};

      for (int i = 0; i < array.length-1; i++){
         boolean checked = false;
         for (int j = array.length - 2; j >= i; j--){
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
