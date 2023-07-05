package lessons6.task1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
   public static void main(String[] args) {

      String[] arr = {"March", "April", "May"};

      ArrayIterator iter = new ArrayIterator(arr);

      while (iter.hasNext()) {
         System.out.println(iter.next());
      }

   }

   private static void method() {
      System.out.println("");
   }
   static class ArrayIterator<T> implements Iterator<String> {

      private final String[] array;
      private int pointer = -1;

      public ArrayIterator(String[] array) {
         this.array = array;
      }

      @Override
      public boolean hasNext() {
         return pointer + 1 < array.length;
      }

      @Override
      public String next() {
         if (!hasNext())
            throw new NoSuchElementException();

         return array[++pointer];
      }
   }
}
