package org.example._2023_09_08_tasks_stream.task2;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {

//      System.out.println(generateWordsWithDigits());

      Map<String, Map<Boolean, List<String>>> myMap = divideIntoVowelsAndConsonants(generateWordsWithDigits());
      myMap.forEach((word, map) -> {
         System.out.println("Select word: " + word + ": " + map);
      });
   }

   public static List<String> generateWordsWithDigits() {

      List<String> testList = new ArrayList<>();
      Random random = new Random();

      testList.add("OnlyLETTERS");
      testList.add("has1digit");
      testList.add("Ocapshere");
      testList.add("MyBirthdayIsDec16");
      testList.add("Today is Tuesday");
      testList.add("Mikhail`s cat is awesome");
      testList.add("JustLettersHere");
      testList.add("Goodbye code readability");
      testList.add("I am 29 years old");

      int numDuplicates = random.nextInt(2) + 1;

      for (int i = 0; i < numDuplicates; i++) {
         testList.add(testList.get(random.nextInt(testList.size())));
      }

      return testList;
   }

   // todo:
   //  Дан список слов. Небходимо отфильтолвать слова, стостоящие только из букв,
   //  разделить их на гласные и согласные, и вывести результат.

   public static Map<Boolean, List<String>> convertWordToMap(String word) {
      return Arrays.stream(word.split(""))
              .collect(Collectors.partitioningBy(
                      Main::isVowel,
                      Collectors.toList()
              ));
   }

   public static Boolean isVowel(String myString) {
      if ("aeoiuy".contains(myString.toLowerCase())) return true;

      return false;
   }

   public static Map<String, Map<Boolean, List<String>>> divideIntoVowelsAndConsonants(List<String> words) {

      List<String> shortList = words.stream()
              .filter(word -> word.chars().allMatch(Character::isLetter)) // isLetter - проверка на буквенность
              .toList();

      System.out.println(shortList);

      return shortList.stream()
              .collect(Collectors.toMap(
                      word -> word,
                      Main::convertWordToMap
              ));
   }
}
