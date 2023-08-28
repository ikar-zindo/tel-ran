package lesson9_set.task2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {
   public static void main(String[] args) {

      Set<String> set = new HashSet<>();

      set.add("AAA");
      set.add("BBB");
      set.add("CCC");
      set.add("DDD");
      set.add("EEE");
      set.add("BBB");

      // Особенности хэш-сета видны при выводе в консоль:
      // 1. Элементы выводятся в произвольном порядке (порядок добавления не гарантируется)
      // 2. Хэш-сет не содержит дубликаты, как и любой другой сет
      System.out.println("Выведем в консоль HashSet");
      System.out.println(set);

      Set<String> linkedSet = new LinkedHashSet<>();

      linkedSet.add("DDD");
      linkedSet.add("CCC");
      linkedSet.add("EEE");
      linkedSet.add("BBB");
      linkedSet.add("AAA");
      linkedSet.add("EEE");

      System.out.println("Выведем в консоль LinkedHashSet");
      // Особенность LinkedHashSet в том, что он хранит элементы в порядке добавления
      System.out.println(linkedSet);
   }
}
