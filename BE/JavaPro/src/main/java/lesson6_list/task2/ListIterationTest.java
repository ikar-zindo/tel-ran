package lesson6_list.task2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ListIterationTest {
   public static void main(String[] args) {

      List<String> words = new ArrayList<>();

      words.add("Banana");
      words.add("Orange");
      words.add("Apple");
      words.add("Peach");
      words.add("Pineapple");
      words.add("Watermelon");

      System.out.println(words);

      // Вывести в консоль слово и его длину
      for (String current : words) {
         System.out.println(current + " " + current.length());
      }

      // Вывести в консоль все фпукты, при этом пронумировать строки
      for (int i = 0; i < words.size(); i++) {
         // words[i] - array; words.get(i) - list
         System.out.println((i + 1) + ". " + words.get(i));
      }

      // Размер листа
      System.out.println("Размер листа := " + words.size());

      String deletedElement = words.remove(3);
      System.out.println("Лист после удаления := " + words);
      System.out.println("Улалённый элемент := " + deletedElement);

      words.add(3, deletedElement);
      System.out.println("Лист := " + words);

      // Поиск элемента
      System.out.println("Индекс ананаса := " + words.indexOf("Pineapple"));
      System.out.println("Индекс лемона := " + words.indexOf("Lemon"));

      // Пуст ли список
      System.out.println("Пуст ли список := " + words.isEmpty());

      // Соделжит ли список элемент
      System.out.println("Соделжит ли список апельсин" + words.contains("Orange"));
      System.out.println("Соделжит ли список вишню" + words.contains("Cherry"));

      // A B C D E F -> containsAll(C D E) = true
      System.out.println(words.containsAll(List.of("Orange", "Pineapple")));
      System.out.println(words.containsAll(List.of("Orange", "Pineapple", "Lemon")));

      // Очищаем список
      words.clear();
      System.out.println("Лист := " + words);
      System.out.println("Размер листа := " + words.size());

      // A B C D E F -> containsAll(C D E) = true
      System.out.println(new HashSet<>(words).containsAll(List.of("Orange", "Pineapple")));
   }
}
