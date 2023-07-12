package lessons6.task2;

import java.util.Iterator;

public class Main {
   public static void main(String[] args) {

      Range range = new Range(-10, 20);

      Iterator<Integer> iter = range.iterator();

      while (iter.hasNext()) {
         System.out.println(iter.next());
      }

      for (Object integer : range) {
         System.out.print(integer + " ");
      }
   }
}
