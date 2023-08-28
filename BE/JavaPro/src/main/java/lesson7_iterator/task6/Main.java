package lesson7_iterator.task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      // Существует список чисел
      // Реализовать итератор, который из переданого списка возвращает
      // только чётные числа

      List<Integer> numbers = new ArrayList<>();

      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      numbers.add(4);
      numbers.add(5);
      numbers.add(6);
      numbers.add(7);

      Iterator<Integer> iterator = new MyIterator(numbers);

      while (iterator.hasNext()) {
         System.out.print(iterator.next() + " "); // 2 4 6
      }
   }
}
