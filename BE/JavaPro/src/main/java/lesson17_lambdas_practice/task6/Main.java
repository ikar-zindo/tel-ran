package lesson17_lambdas_practice.task6;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {
   public static void main(String[] args) {

      // Написать метод, который принимает массив и функцию.
      // Метод должен каждый элемент массива обработать при помощи этой функции
      // и вернуть сет результатов.

      String[] array = {"AAA", "BBB", "CCCCC", "BBB"};

      // Обработать массив так, чтобы к каждой строке был добавлен пробел
      // и длина этой строки

      Function<String, String> function = x -> String.format("%s %d", x, x.length());

      Set<String> result = getSetFromArray(array, function);
      System.out.println(result);

      // Используя этот же метод получить сет никак не изменённых элементов массива

      Set<String> result2 = getSetFromArray(array, Function.identity());
      System.out.println(result2);
   }

   public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {
      Set<String> result = new HashSet<>();

      for (String currentWord : array) {
         String processedWord = function.apply(currentWord);
         result.add(processedWord);
      }

      return result;
   }
}
