package lesson11_stack_and_queue.task4;

public class Main {
   public static void main(String[] args) {

      MyDeque deque = new MyArrayDeque();

      deque.addToHead(77);
      deque.addToHead(66);

      deque.addToTail(88);
      deque.addToTail(99);

      System.out.println(deque.removeHead());
      System.out.println(deque);

      System.out.println(deque.removeTail());
      System.out.println(deque);

      System.out.println(deque.peekHead());
      System.out.println(deque.peekTail());

      System.out.println(deque.isEmpty());

      System.out.println(deque.getByIndex(-2));

      System.out.println(deque.contains(88));

      System.out.println(deque.size());
   }
}
