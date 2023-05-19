package SS_19_05_23;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExample {
   public static void main(String[] args) {
      int [] numbers = new int [5];
      int [][] numberss = {{1,2,3},{4,5,6}};
      int [][][] numbersss = {{{1,2,3},{4,5,6},{7,8,9}},{{1,2,3,},{4,5,6},{7,8,9}}};

      System.out.println(numbers);
      System.out.println(Arrays.deepToString(numberss));
      System.out.println(Arrays.deepToString(numbersss));
   }
}