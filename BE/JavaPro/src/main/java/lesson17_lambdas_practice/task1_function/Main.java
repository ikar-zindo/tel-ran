package lesson17_lambdas_practice.task1_function;

import java.util.function.Function;

public class Main {
   public static void main(String[] args) {

      MyFunction function = new MyFunction();
      long result = function.apply(3.54);

      System.out.println("Результат округления := " + result);

      System.out.println("Результат округления := " + function.apply(5.12));

      Function<Double, Long> function1 = x -> {
         System.out.println("Переданное значение := " + x);
        return Math.round(x);
      };

      System.out.println("Результат округления := " + function1.apply(8.82));

      Function<Double, Long> function2 = Math::round;

      System.out.println("Результат округления := " + function2.apply(12.63));
   }
}
