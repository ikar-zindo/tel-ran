package org.example._2023_09_15.refactor_code.dryKissYagni;

import java.util.Arrays;
import java.util.List;

public class D1 {
   public double getAVG(List<Integer> list) {
      double sum = 0;
      for (double currentValue : list) {
         sum += currentValue;
      }
      return sum / list.size();
   }
}

class D1Refactor {
   public static double calAVG(List<Integer> list) {

      return list.stream()
              .mapToDouble(Integer::doubleValue)
              .average()
              .orElse(-1);
   }
   public static void main(String[] args) {

      List<Integer> list = Arrays.asList(1, 2, 3);
//      System.out.println(calAVG(list));

      System.out.println(new D1().getAVG(list));
   }

}
