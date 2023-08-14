package org.example._2023_08_11.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DeleteDuplicate {
   public static void main(String[] args) {

      List<Integer> list = new ArrayList<>();
      list.add(1);
      list.add(2);
      list.add(1);
      list.add(1);
      list.add(3);
      list.add(3);
      list.add(2);
      list.add(4);
      list.add(4);


      System.out.println(new DeleteDuplicate().removeDuplicate(list));
      System.out.println(new DeleteDuplicate().removeDuplicate1(list));
      System.out.println(new DeleteDuplicate().removeDuplicate2(list));

   }

   public List<Integer> removeDuplicate(List<Integer> list) {
      // 2, 2, 4, 5, 1, 1, 1, 6, 0, 8 ,8, 6

      for (int i = 0; i < list.size(); i++) {
         for (int j = i + 1; j < list.size(); j++) {
            if (Objects.equals(list.get(i), list.get(j))) {
               list.remove(j);
               j--;
            }
         }
      }

      return list;
   }

   public List<Integer> removeDuplicate1(List<Integer> list) {

      for (int i = 0, j = i + 1; i < list.size(); i++) {
         if (list.get(i) == list.get(j)) {
            j++;
            list.remove(j);
            j--;
         }
      }

      return list;
   }

   public List<Integer> removeDuplicate2(List<Integer> list) {

      int i = 0;
      while (i < list.size()) {
         int value = list.get(i);
         int j = i + 1;

         while (j < list.size()) {
            if (list.get(i) == value) {
               list.remove(j);
            } else {
               j++;
            }
         }
         i++;
      }

      return list;
   }

}
