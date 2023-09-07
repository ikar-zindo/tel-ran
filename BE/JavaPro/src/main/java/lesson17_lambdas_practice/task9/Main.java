package lesson17_lambdas_practice.task9;

import java.util.function.Predicate;

public class Main {

   // todo: Используя функциональный интерфейс, написать функцию
   //  которая проверяет, имеет ли входящая строка чётную длину.
   public static void main(String[] args) {

      Predicate<String> predicate = x -> x.length() % 2 == 0;

      String s = "Hello, World!";

      System.out.println(predicate.test(s));
   }
}
