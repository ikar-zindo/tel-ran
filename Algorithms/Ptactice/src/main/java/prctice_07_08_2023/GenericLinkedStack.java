package prctice_07_08_2023;

import java.util.NoSuchElementException;

public class GenericLinkedStack<E> {

   private Node<E> first;
   private int size;

   public GenericLinkedStack() {
      this.size = 0;
   }

   public void push(E element) {
      if (first == null) {
         first = new Node(element, null);
      } else {
         Node<E> node = new Node(element, first);
         this.first = node;
      }
      size++;
   }

   public E pop() {
      if (first == null) {
         throw new NoSuchElementException();
      }
      Node<E> result = first;
      this.first = result.next;
      size--;
      return result.element;
   }

   public int size() {
      return size;
   }


   public class Node<E> {
      E element;
      Node<E> next;

      public Node(E element, Node<E> next) {
         this.element = element;
         this.next = next;
      }
   }
}
