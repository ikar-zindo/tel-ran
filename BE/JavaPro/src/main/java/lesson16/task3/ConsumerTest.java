package lesson16.task3;

import java.util.function.Consumer;

public class ConsumerTest {
   public static void main(String[] args) {

//      Consumer<Integer> consumer = x -> System.out.println(x);
      Consumer<Integer> consumer = System.out::println;

      consumer.accept(5);
      consumer.accept(10);
   }
}
