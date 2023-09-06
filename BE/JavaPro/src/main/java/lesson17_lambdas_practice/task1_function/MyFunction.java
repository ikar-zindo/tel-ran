package lesson17_lambdas_practice.task1_function;

import java.util.function.Function;

public class MyFunction implements Function<Double, Long> {

   @Override
   public Long apply(Double valueToRound) {
      return Math.round(valueToRound);
   }
}
