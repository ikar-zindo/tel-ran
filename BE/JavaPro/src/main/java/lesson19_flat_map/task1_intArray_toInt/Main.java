package lesson19_flat_map.task1_intArray_toInt;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {

      // Преобразовать двухмерный массив в одномереый

      int[][] source = {{9, 2, 7},
                        {6, 1, 8, 3},
                        {5, 4}};

      int[] result = Arrays.stream(source)         // Поток одномерныйх массовов (int[][] -> stream int[]
              .flatMapToInt(x -> Arrays.stream(x))
              // Из кажлого элементв потока получаем поток интов (3 элемента int[] -> 3 потока int)
              // метод flatMap объедененяем в массив int[]
              .toArray(); // поток int преобразуем в массив int[]
      System.out.println(Arrays.toString(result));
   }
}
