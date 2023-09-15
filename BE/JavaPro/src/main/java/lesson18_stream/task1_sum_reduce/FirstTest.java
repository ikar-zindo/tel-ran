package lesson18_stream.task1_sum_reduce;

import java.util.Arrays;
import java.util.List;

public class FirstTest {
   public static void main(String[] args) {

      List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

      long sum = list.stream().reduce((x, y) -> x + y).orElse(0);
      System.out.println(sum);
   }
}
