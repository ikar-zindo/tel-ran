package lesson8.task2;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {

   private int size = 0;
   private Node first;

   /**
    * Добавление элемента в начало списка
    * @param value добавляем значение
    */
   public void addFirst(String value) {

      Node node = new Node(value, first);
      first = node;
      size++;
   }

   /**
    * Добавление элемента в конец списка
    * @param value добавляем значение
    */
   public void addLast(String value) {

      if (size == 0) {
         addFirst(value);
         return;
      }

      Node current = first;

      while (current.getNext() != null)
         current = current.getNext();

      Node last =  new Node(value);
      current.setNext(last);
      size++;
   }

   @Override
   public String toString() {

      if (size == 0)
         return "[]";

      StringBuilder builder = new StringBuilder("[");

      Node current = first;

      while (current != null) {
         builder.append(current.getValue()).append(", ");
         current = current.getNext();
      }

      builder.setLength(builder.length() - 2);
      builder.append("]");

      return builder.toString();
   }

   @Override
   public Iterator<String> iterator() {
      return new MyIterator(first);
   }
}
