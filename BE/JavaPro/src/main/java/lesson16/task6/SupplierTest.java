package lesson16.task6;

import lesson15.task3.Satellite;

import java.util.function.Supplier;

public class SupplierTest {
   public static void main(String[] args) {

      Supplier<Integer> supplier = () -> (int) (Math.random() * 5) + 5;

      System.out.println(supplier.get());
      System.out.println(supplier.get());
      System.out.println(supplier.get());
      System.out.println(supplier.get());
      System.out.println(supplier.get());
      System.out.println(supplier.get());
      System.out.println(supplier.get());
      System.out.println(supplier.get());
   }
}
