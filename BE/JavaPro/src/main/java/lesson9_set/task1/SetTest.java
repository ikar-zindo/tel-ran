package lesson9_set.task1;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class SetTest {
   public static void main(String[] args) {

      List<Integer> list = new LinkedList<>();

      // Создаём отсортированный сет
      SortedSet<String> set = new TreeSet<>();

      // Добавляем элементы
      set.add("AAA");
      set.add("DDD");
      set.add("BBB");
      set.add("CCC");
      set.add("BBBBB");

      // Попытаемся добавить дубликат значения в наш сет
      set.add("AAA");

      // TreeSet не может содержать null
//        set.add(null);

      // Элементы в консоль будут выведены в отсортированном порядке
      // При этом дублирующиеся элементы выведены не будут,
      // т.к. особенность сета в том, что он не может содержать дубликаты
      System.out.println(set);

      // Метод add возвращает нам boolean результат, в зависимости от того,
      // был ли реально добавлен наш элемент в сет
      boolean result = set.add("EEE");

      // И далее в коде мы можем работать с этим результатом
      if (result) {
         System.out.println("Элемент был добавлен");
      } else {
         System.out.println("Элемент НЕ был добавлен");
      }

      System.out.println(set);

      result = set.add("BBB");
      System.out.println("Был ли добавлен элемент? - " + result);
      System.out.println(set);

      // Выведем все элементы в консоль
      for (String current : set) {
         System.out.println(current);
      }

      // Метод contains возвращает true, если такой элемент присутствует в сете
      result = set.contains("CCC");
      System.out.println("Содержит ли сет значение ССС? - " + result);
      result = set.contains("ZZZ");
      System.out.println("Содержит ли сет значение ZZZ? - " + result);

      // Методы first и last возвращают первое и последнее значение сета
      System.out.println("Первый элемент сета - " + set.first());
      System.out.println("Последний элемент сета - " + set.last());

      // Получаем итератор у сета
      Iterator<String> iterator = set.iterator();

      System.out.println("Итерируем сет при помощи итератора:");
      while (iterator.hasNext()) {
         String current = iterator.next();
         // Если длина текущего элемента равна пяти, то мы этот элемент удаляем из сета
         if (current.length() == 5) {
            iterator.remove();
         }
         System.out.println(current);
      }
      System.out.println("Сет после удаления элемента длиной 5 - " + set);

      // Удаление элемента
      result = set.remove("DDD");
      System.out.println("Был ли удалён элемент DDD? - " + result);
      System.out.println("Сет после удаления элемента DDD - " + set);
      result = set.remove("BBBBB");
      System.out.println("Был ли удалён элемент ВВВВВ? - " + result);

      Set<Integer> set1 = new ConcurrentSkipListSet<>();
      set1.add(45);
      set1.add(12);
      set1.add(58);
      set1.add(123);
      set1.add(0);

      for (Integer current : set1) {
         System.out.print(current + " ");
      }
   }
}
