package lesson17_lambdas_practice.task7_supplier;

import java.util.function.Supplier;

public class SupplierTest {
   public static void main(String[] args) {

      // Написать метод, который в качестве параметра принимает supplier
      // и 10 раз выводит в консоль то значение, которое supplier возвращает.

      Supplier<Integer> supplier = () -> 7;

      print(supplier);

      // Используя готовый метод, вывести 10 раз в консоль случайные числа от 5 до 20.

      Supplier<Integer> supplier1 = () -> (int) (Math.random() * 16) + 5;

      print(supplier1);
   }

   public static void print(Supplier<Integer> supplier) {

      for (int i = 0; i < 10; i++) {
         System.out.print(supplier.get() + "  ");
      }
      System.out.println();
   }
}
