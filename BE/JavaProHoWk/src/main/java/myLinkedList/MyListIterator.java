package myLinkedList;

import java.util.Iterator;

public class MyListIterator implements Iterator<String> {

   private Node current;

   public MyListIterator(Node current) {
      this.current = current;
   }
   @Override
   public boolean hasNext() {
      return current != null;
   }

   @Override
   public String next() {
      String value = current.getValue();
      current = current.getNext();
      return value;
   }


}
