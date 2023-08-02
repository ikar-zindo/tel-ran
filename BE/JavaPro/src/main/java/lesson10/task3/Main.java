package lesson10.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<Integer> numbers = new ArrayList<>();

      numbers.add(7);
      numbers.add(1);
      numbers.add(9);
      numbers.add(4);
      numbers.add(5);

      System.out.println(numbers);

      // Сортитуем List
      Collections.sort(numbers);
      System.out.println(numbers);

      List<String> words = new ArrayList<>();

      words.add("Pineapple");
      words.add("Orange");
      words.add("Apple");
      words.add("Cherry");
      words.add("Banana");

      System.out.println(words);

      // Сортитуем List
      Collections.sort(words);
      System.out.println(words);
   }
}
