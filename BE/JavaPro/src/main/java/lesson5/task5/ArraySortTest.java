package lesson5.task5;

import java.util.Arrays;

public class ArraySortTest {
   public static void main(String[] args) {

      int[] numbers = {8, 2, 5, 9, 2, 7 ,9, 2, 1, 5};

      System.out.println("Исходный массив -       " + Arrays.toString(numbers));
      Arrays.sort(numbers);
      System.out.println("Отсортированый массив - " + Arrays.toString(numbers));

   }
}
