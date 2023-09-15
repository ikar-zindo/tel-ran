package org.example._2023_09_15.refactor_code.dryKissYagni;

import java.util.List;

public class DAta {
    public double calculateAverage(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        double average = sum / numbers.size();

        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        double standardDeviation = Math.sqrt(variance / numbers.size());

        return standardDeviation;
    }
}

class DAtaRefactor {

   public  double getAVG(List<Double> numbers) {

      return numbers.stream()
              .mapToDouble(Double::doubleValue)
              .average()
              .orElse(-1);
   }

   public double f(List<Double> numbers) {

      double variance = 0;

      for (double num : numbers) {
         variance += Math.pow(num - getAVG(numbers), 2);
      }

      return Math.sqrt(variance / numbers.size());
   }
}