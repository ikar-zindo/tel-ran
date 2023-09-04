package lesson19_flat_map.task5;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {

      String[][] words = {{"Hello", "World", "Java"},
                        {"Java", "Python", "C#", "C++"},
                        {"Hello", "Java"}};

      // 1. Подсчитать количество слов
      // 2. Подсчитать количество уникальных слов

      long countWords = Arrays.stream(words) // Получаем поток одномерных массивов String[]
              .flatMap(x -> Arrays.stream(x)) // Берём стрим из каждого массива и преобразуем в один стрим
              .count(); // Подсчитываем количество элементов стрима

      System.out.println("Колличество слов:");
      System.out.println(countWords);

      countWords = Arrays.stream(words) // Получаем поток одномерных массивов String[]
              .flatMap(x -> Arrays.stream(x)) // Берём стрим из каждого массива и преобразуем в один стрим
              .distinct() // Убираем повторяющиеся значения
              .count(); // Подсчитываем количество элементов стрима

      System.out.println("Колличество уникальных слов:");
      System.out.println(countWords);
   }
}
