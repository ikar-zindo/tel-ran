package lesson7.task2;

import java.util.ArrayList;

public class StackTest {
   ArrayList<Integer> items;

   public StackTest() {
      this.items = new ArrayList<>();
   }

   public int push(int element) {
      items.add(element);
      return element;
   }

   public int pop() {

      if (items.size() == 0) {
         System.err.println("The stack is empty");
         return -1;
      } else {
         int last = items.get(items.size() - 1);
         items.remove(items.size() - 1);
         return last;
      }
   }

   public int getMin() {

      if (items.size() == 0) {
         System.err.println("The stack is empty");
         return -1;
      }
      int min = items.get(0);

      for (int i = 0; i < items.size(); i++) {
         if (items.get(i) < min) {
            min = items.get(i);
         }
      }
      return min;
   }

   public int getMax() {

      if (items.size() == 0) {
         System.err.println("The stack is empty");
         return -1;
      }
      int max = items.get(0);

      for (int i = 0; i < items.size(); i++) {
         if (items.get(i) > max) {
            max = items.get(i);
         }
      }
      return max;
   }

   public void clear() {
      items = new ArrayList<>();
   }

   public int getLength() {
      return items.size();
   }

   public int peek() {

      if (items.size() == 0) {
         System.err.println("The stack is empty");
         return -1;
      }

      return items.get(items.size() - 1);
   }

   public void increment() {

      for (int i = 0; i < items.size(); i++) {
         items.set(i, items.get(i) + 1);
      }
   }
}
