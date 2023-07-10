package lesson7.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<String> list = new ArrayList<>();

      list.add("Orange");
      list.add("Banana");
      list.add("Kiwi");
      list.add("Apple");
      list.add("Apricot");
      list.add("Pineapple");

      System.out.println(list);

//      for (int i = 0; i < list.size(); i++) {
//         String tmp = list.get(i);
//
//         if (tmp.startsWith("A")) {
//            list.remove(tmp);
//         }
//      }

      Iterator<String> iterator = list.iterator();

      while (iterator.hasNext()) {
         if (iterator.next().startsWith("A")) {
            iterator.remove();
         }
      }

      System.out.println(list);

   }
}
