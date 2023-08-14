package org.example._2023_08_11.task1;

import java.util.List;

public class Sum {
   public static void main(String[] args) {

//      List<Integer> list = List.of(1, 2, 3, 4 ,5);

      System.out.println(new Sum().getSum(List.of(1, 2, 3, 4, 5)));
   }

   public int getSum(List<Integer> list) {
      int sum = 0;

      for (Integer integer : list) {
         sum += integer;
      }

      return sum;
   }
}
