package lesson9_set.task3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOfListsTest {
   public static void main(String[] args) {

      List<String> list1 = new ArrayList<>();
      List<String> list2 = new ArrayList<>();

      list1.add("AAA");
      list1.add("BBB");
//        list1.add("CCC");

      list2.add("AAA");
      list2.add("BBB");
      list2.add("CCC");

      // Сет, который содержит листы стрингов
      Set<List<String>> setOfLists = new HashSet<>();
      setOfLists.add(list1);
      boolean result = setOfLists.add(list2);
      System.out.println("Произошло ли добавление в сет второго листа? - " + result);

      // Добавление второго листа в сет не произошло, т.к. второй лист является
      // дубликатом первого листа (они одинаковые). Сет не может содержать дубликатов.
      System.out.println(setOfLists);

      System.out.println("Хэш-коды листов до удаления элемента ССС");
      System.out.println(list1.hashCode());
      System.out.println(list2.hashCode());

      list2.remove("CCC");

      System.out.println("Хэш-коды листов после удаления элемента ССС");
      System.out.println(list1.hashCode());
      System.out.println(list2.hashCode());

      System.out.println();

      System.out.println(setOfLists);

      setOfLists.add(list2);
      System.out.println(setOfLists);

      Set<List<String>> setAfterCheck = new HashSet<>(setOfLists);
      System.out.println(setAfterCheck);
   }
}