package lesson17_lambdas_practice.task5;

import java.util.function.Function;

public class IdentityTest {
   public static void main(String[] args) {

      Function<String, String> function = x -> x;
      System.out.println(function.apply("Hello"));

      Function<String, String> function1 = Function.identity();
      System.out.println(function.apply("Hello"));

      System.out.println("Hello");

      String java = "Java";
      String result = function.apply(java);

      System.out.println(java);
      System.out.println(result);

      System.out.println(java.hashCode());
      System.out.println(result.hashCode());

      System.out.println(java.equals(result));
   }
}
