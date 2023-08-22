package myLinkedList;

import java.util.Iterator;

public class MyIterator implements Iterator<String> {

   private Node current;

   public MyIterator(Node current) {
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
