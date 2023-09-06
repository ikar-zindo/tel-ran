package lesson17_lambdas_practice.task4;

import java.util.function.Function;

public class Main {
   public static void main(String[] args) {

      // 1. Есть функция, на вход которой подаётся строка.
      // 2. Строку преобразуем в число.
      // 3. Полученное число округляем.
      // 4. Полученный результат округления возводим в квадрат.

      Function<String, Long> function = x-> {
         // "4.56" -> 4.56
         double result1 = Double.parseDouble(x);
         long result2 = Math.round(result1);
         long result3 = (long) Math.pow(result2, 2);
         return result3;
      };

      System.out.println(function.apply("4.56"));

      Function<String, Long> function1 = x -> (long) Math.pow(Math.round(Double.parseDouble(x)), 2);

      System.out.println(function1.apply("4.56"));

      Function<String, Double> func1 = Double::parseDouble;
      Function<Double, Long> func2 = Math::round;
      Function<Long, Long> func3 = x -> (long) Math.pow(x, 2);

      Function<String, Long> totalFunction = func1.andThen(func2).andThen(func3);
      System.out.println(totalFunction.apply("4.56"));

      System.out.println(func3.apply(func2.apply(func1.apply("4.56"))));

      Function<String, Long> totalFunction2 = func2.andThen(func3).compose(func1);
      System.out.println(totalFunction2.apply("4.56"));
   }
}
