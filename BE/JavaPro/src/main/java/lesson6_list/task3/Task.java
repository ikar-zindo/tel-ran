package lesson6_list.task3;

import java.util.ArrayList;
import java.util.List;

public class Task {

   public static void main(String[] args) {

      List<String> first = new ArrayList<>();
      List<String> second = new ArrayList<>();

      first.add("A");
      first.add("B");
      first.add("C");
      first.add("D");
      first.add("E");

      second.add("D");
      second.add("E");
      second.add("F");
      second.add("G");

      System.out.println("first := " + first);
      System.out.println("second := " + second);

      // 1. Объединение - A B C D E D E F G
         List<String> third = new ArrayList<>();

         third.addAll(first);
         third.addAll(second);

      System.out.println("third := " + third);

      // 2. Объединение без дубликатов - A B C D E F G
      List<String> fourth = new ArrayList<>();

      fourth.addAll(first);
      for (int i = 0; i < second.size(); i++) {
         if (!fourth.contains(second.get(i))) {
            fourth.add(second.get(i));
         }
      }
      System.out.println("fourth := " + fourth);

      // 3. Пересечение - D E D E
      List<String> fifth = new ArrayList<>();

      for (int i = 0; i < first.size(); i++) {
         if (second.contains(first.get(i))) {
            fifth.add(first.get(i));
         }
      }

      for (int i = 0; i < second.size(); i++) {
         if (first.contains(second.get(i))) {
            fifth.add(second.get(i));
         }
      }

      System.out.println("fifth := " + fifth);

      // 4. Пересечение без дубликатов - D E
      List<String> sixth = new ArrayList<>();

      for (int i = 0; i < second.size(); i++) {
         if (first.contains(second.get(i))){
            sixth.add(second.get(i));
         }
      }

      System.out.println("sixth := " + sixth);

      // 5. Разность - A B C F G
      List<String> eighth = new ArrayList<>(third);

      eighth.removeAll(fifth);

      System.out.println("eighth := " + eighth);
   }
}
