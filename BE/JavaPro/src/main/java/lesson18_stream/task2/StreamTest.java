package lesson18_stream.task2;

import java.util.Arrays;
import java.util.List;

public class StreamTest {
   public static void main(String[] args) {

      List<String> list = Arrays.asList("10", "20", "30", "10", "100", "50");

      // Сложить все элементы листа
      String result = list.stream()
              .reduce((x, y) -> x + y)
              .orElse("");

      System.out.println("Результат сложения элементов := " + result);

      // Сложить все элементы как числа
      result = String.valueOf( // Преобразуем к строке итоговый результат 200 -> "200"
              list.stream() // "10", "20", "30", "10", "100", "50"
                      .mapToInt(Integer::parseInt) // "10", "20", "30", "10", "100", "50" -> 10, 20, 30, 10, 100, 50
                      .reduce(Integer::sum) // 10, 20, 30, 10, 100, 50 - > 30, 30, 10, 100, 50 -> 60, 10, 100, 50 -> 70, 100, 50 -> 170, 50 -> 220
                      .orElse(-1)); // Возвращаем результат либо значение по умолчанию

      System.out.println("Результат сложения элементов с преобразованием в числа := " + result);

      // Метод от ученика
      String result2 = "" + list.stream()
              .mapToInt(x -> Integer.parseInt(x))
              .reduce((x, y) -> x + y)
              .orElse(-1);
      System.out.println(result2);
   }
}
