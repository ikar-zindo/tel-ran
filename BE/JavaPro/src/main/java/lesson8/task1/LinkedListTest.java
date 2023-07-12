package lesson8.task1;

import java.util.*;

public class LinkedListTest {
   public static void main(String[] args) {

      LinkedList<String> list = new LinkedList<>();

      list.add("Banana");
      list.add("Apple");
      list.add("Cherry");

      list.remove(0);

      System.out.println(list.peekFirst());

      System.out.println(list.get(0));

      // Добавляем элементы в список
      list.addFirst("Lemon");
      list.addFirst("Potato");
      System.out.println(list);

      // Получаем элементы из списка
      System.out.println(list.getFirst());
      System.out.println(list.getLast());
      System.out.println(list.get(2));

      // Заменяем один элемент листа на новый
      list.set(1, "Peach");
      System.out.println(list);

      // Проверяем существут ли элемент в списке
      System.out.println("Есть ли в списке яблоко" + list.contains("Apple"));
      System.out.println("Есть ли в списке лимон" + list.contains("Lemon"));

      // Методы, удаляюшие объекты из списка
      String deletedElement = list.poll(); // удаление первого элемента
      System.out.println("Первый удалённый элемент := " + deletedElement);
      System.out.println(list);

      String deletedLastElement = list.pollLast();
      System.out.println("Последний удалённый элемент" + deletedLastElement);
      System.out.println(list);

      list.add("Peach");
      list.add("Tomato");
      list.add("Lemon");
      list.add("Peach");

      System.out.println(list);

      list.removeFirstOccurrence("Peach");
      list.removeLastOccurrence("Peach");

      System.out.println(list);
   }
}
