package prctice_07_08_2023;

import java.util.NoSuchElementException;

public class ObjectLinkedStack {

   private Node first;
   private int size;

   public ObjectLinkedStack() {
      this.size = 0;
   }

   public void push(String element) {
      if (first == null) {
         first = new Node(element, null);
      } else {
         Node node = new Node(element, first);
         this.first = node;
      }
      size++;
   }

   public String pop() {
      if (first == null) {
         throw new NoSuchElementException();
      }
      Node result = first;
      this.first = result.next;
      size--;
      return result.element;
   }

   public int size() {
      return size;
   }


   public class Node {
      String element;
      Node next;

      public Node(String element, Node next) {
         this.element = element;
         this.next = next;
      }
   }
}
