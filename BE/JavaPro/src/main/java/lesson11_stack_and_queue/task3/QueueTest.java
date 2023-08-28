package lesson11_stack_and_queue.task3;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest {
   public static void main(String[] args) {

      Queue<Integer> queue = new PriorityQueue<>();

      queue.add(1);
      queue.add(2);
      queue.add(3);
      queue.add(4);
      queue.add(5);

      System.out.println(queue);

      // Метод peek получает первый элемент из очереди,
      // при этом удаления из очереди этого элемента не происходит.
      Integer current = queue.peek();
      System.out.println("Текущий элемнт := " + current);
      System.out.println(queue);

      // Метод poll в отличие от метода peek удаляет полученный элемент из очереди.
      current = queue.poll();
      System.out.println("Текущий элемнт := " + current);
      System.out.println(queue);

      // Метод isEmpty() преверяет, пустая ли очередь ? ture : false
      System.out.println("Пустая ли очередь" + queue.isEmpty());
   }
}
