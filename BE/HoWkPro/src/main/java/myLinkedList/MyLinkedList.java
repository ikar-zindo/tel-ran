package myLinkedList;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {

   private int size = 0;
   private Node first;
   private Node last;

   /**
    * Добавление элементы в начало списка
    * @param value добавляеимое значение
    */
   public void addFirst(String value) {

      Node node = new Node(value);

      if (size == 0) {
         first = node;
         last = node;
      } else {
         node.setNext(first);
         first.setPrevious(node);
         first = node;
      }
      size++;
   }

   /**
    * Добавление элемента в конец списка
    * @param value добавляемое значение
    */
   public void addLast(String value) {

      Node node = new Node(value);

      if (size == 0) {
         first = node;
         last = node;
      } else {
         node.setPrevious(last);
         last.setNext(node);
         last = node;
      }
      size++;
   }

   @Override
   public String toString() {
      if (size == 0) {
         return "[]";
      }
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
      return new MyListIterator(first);
   }
}
