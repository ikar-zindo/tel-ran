package test;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
   private T[] array;
   private int currentIndex;

   public ArrayIterator(T[] array) {
      this.array = array;
      this.currentIndex = 0;
   }

   @Override
   public boolean hasNext() {
      return currentIndex < array.length;
   }

   @Override
   public T next() {
      if (!hasNext()) {
         throw new java.util.NoSuchElementException();
      }
      T item = array[currentIndex];
      currentIndex++;
      return item;
   }

   @Override
   public void remove() {
      throw new UnsupportedOperationException();
   }

   public static void main(String[] args) {
      Integer[] intArray = {1, 2, 3, 4, 5};
      ArrayIterator<Integer> iterator = new ArrayIterator<>(intArray);

      while (iterator.hasNext()) {
         System.out.println(iterator.next());
      }
   }
}
