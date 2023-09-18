package lesson18_stream.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlatMapTest {
   public static void main(String[] args) {

      List<String> list1 = Arrays.asList("A", "B", "C");
      List<String> list2 = Arrays.asList("D", "E", "F");
      List<String> list3 = Arrays.asList("G", "H", "I");

      List<List<String>> lostOfLists = new ArrayList<>();
      lostOfLists.add(list1);
      lostOfLists.add(list2);
      lostOfLists.add(list3);

      System.out.println(lostOfLists);

      // todo Преобразовать лист листов в обычный лист, содержащий все элементы
      List<String> resultList = lostOfLists.stream()
              .flatMap(x -> x.stream())
              .toList();

      System.out.println("Результирующий лист := " + resultList);
   }
}
