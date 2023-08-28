package lesson5_messivs.task2;

import java.util.Arrays;

public class ArrayTest {
   public static void main(String[] args) {

      double[] doubles = {2.8, 4.5, 3.14, 2.17, 0, 15.68, 874.2};

      // Вывод массива в консоль
      System.out.println(Arrays.toString(doubles));

      // Вывод каждого элемнта массива в консоль с новой строки
      for (int index = 0; index < doubles.length; index++) {
         System.out.println("index " + index + " - " + doubles[index]);
      }

      System.out.println();

      for (double d : doubles) {
         System.out.println(d + 1);
      }

      System.out.println();

      for (int index = 0; index < doubles.length; index++) {
         System.out.println(doubles[index] + 1);
      }

      double[] doubles1 = doubles.clone();

      System.out.println(Arrays.toString(doubles1));
   }
}
