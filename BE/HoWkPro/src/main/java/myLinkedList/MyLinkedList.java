package myLinkedList;

public class MyLinkedList {

   private int size = 0;
   private Node first;
   private Node last;

   /**
    * Добавление элементы в начало списка
    * @param value добавляеимое значение
    */
   public void addFirst(String value) {
      Node current = new Node(value, first, last);
      first = current;
      size++;
   }

   /**
    * Добавление элемента в конец списка
    * @param value добавляемое значение
    */
   public void addLast(String value) {
      if (size == 0) {
         addFirst(value);
         return;
      }

      Node current = last;
      while ()

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
}
