package lesson6.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
   public static void main(String[] args) {

      List<String> list = new ArrayList<>();
      System.out.println("Лист := " + list);

      List<Integer> intList = new ArrayList<>();

      // Добавляем элементы в список
      list.add("AAA");
      list.add("BBB");
      list.add("CCC");

      System.out.println("Лист := " + list);

      list.add(1, "DDD");

      System.out.println("Лист := " + list);

      // Создание листа с определённым размером внутреннего массива
      List<String> words = new ArrayList<>(5);

      words.add("XXX");
      words.add("YYY");
      words.add("ZZZ");

      // Добавляем в лист всех элементов другого листа
      list.addAll(words);
      System.out.println(list);

      // Добавляем в лист всех элементов другого листа по указаному индексу
      list.addAll(2, words);
      System.out.println(list);

      String[] str ={"K", "L", "M", "N"};

      // Добавляем все элементы в массив при помощи цикла
      for (int i = 0; i < str.length; i++)
         list.add(str[i]);
      System.out.println("Лист := " + list);

      // Добавляем все элементы в массив при помощи статичемкого метода asList
      list.addAll(Arrays.asList(str));
      System.out.println("Лист := " + list);

      // Заменяем уже существуюший элемент другим элементом
      list.set(3, "_Y_");
      System.out.println("Лист := " + list);

      // Удаление элеменов по индексу
      list.remove(5);
      System.out.println("Лист := " + list);

      // Удаление конкетного элеменов
      list.remove("XXX");
      System.out.println("Лист := " + list);

      // Удалит коллекцию words из коллекции list
      list.removeAll(words);
      System.out.println("Лист := " + list);

      // Удалит из list все элементы К и L
      list.removeAll(List.of("K", "L"));
      System.out.println("Лист := " + list);

      // Разница между методами set и add
      list.set(1, "OOO");
      System.out.println("После метода set:");
      System.out.println("Лист := " + list);
      list.add(1, "OOO");
      System.out.println("После метода add:");
      System.out.println("Лист := " + list);

   }
}
