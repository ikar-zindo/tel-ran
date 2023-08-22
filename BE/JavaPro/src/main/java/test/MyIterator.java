package test;

import java.util.Iterator;
import java.util.List;

public class MyIterator implements Iterator<Integer> {

   private Iterator<Integer> iterator;
   private Integer next;

   public MyIterator(List<Integer> list) {
      iterator = list.iterator();
      moveToNext();
   }

   @Override
   public boolean hasNext() {
      return next != null;
   }

   @Override
   public Integer next() {
      moveToNext();
      return next;
   }

   private void moveToNext() {

      while (iterator.hasNext()) {
         Integer current = iterator.next();

         if (current % 2 == 0) {
            next = current;
            return;
         }
      }
      next = null;
   }
}
