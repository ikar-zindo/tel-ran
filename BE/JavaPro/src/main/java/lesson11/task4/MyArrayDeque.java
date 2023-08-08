package lesson11.task4;

public class MyArrayDeque implements MyDeque {

   private Integer[] elements;
   private int headIndex;
   private int tailIndex;
   private int size;
   private int defaultCapacity = 20;

   public MyArrayDeque() {
      elements = new Integer[defaultCapacity];
      headIndex = elements.length / 2;
      tailIndex = headIndex;
   }

   @Override
   public void addToHead(Integer element) {
      if (element == null) {
         System.err.println("Element cannot by NULL");
         return;
      }
      if (size != 0) {
         headIndex--;
      }
      elements[headIndex] = element;
      size++;
   }

   @Override
   public void addToTail(Integer element) {
      if (element == null) {
         System.err.println("Element cannot by NULL");
         return;
      }
      if (size != 0) {
         tailIndex++;
      }
      elements[tailIndex] = element;
      size++;
   }

   @Override
   public Integer removeHead() {
      int headElement = elements[headIndex];
      headIndex++;
      size--;
      return headElement;
   }

   @Override
   public Integer removeTail() {
      int tailElement = elements[tailIndex];
      tailIndex--;
      size--;
      return tailElement;
   }

   @Override
   public Integer peekHead() {
      return elements[headIndex];
   }

   @Override
   public Integer peekTail() {
      return elements[tailIndex];
   }

   @Override
   public boolean isEmpty() {
      return size == 0;
   }

   @Override
   public Integer getByIndex(int index) {
      if (headIndex + index > tailIndex) {
         System.err.println("you are out of range!".toUpperCase());
         return null;
      }

      return elements[headIndex + index];
   }

   @Override
   public boolean contains(Integer element) {
      for (int i = headIndex; i <= tailIndex; i++) {
         if (elements[i].equals(element)) {
            return true;
         }
      }
      return false;
   }

   @Override
   public int size() {
      return size;
   }

   @Override
   public String toString() {
      if (isEmpty()) {
         return "[]";
      }
      StringBuilder builder = new StringBuilder("[");
      for (int i = headIndex; i <= tailIndex; i++) {
         builder.append(elements[i]).append(", ");
      }
      builder.setLength(builder.length() - 2);
      builder.append("]");
      return builder.toString();
   }
}
