package org.example._2023_09_01.task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {

      List<String> list = new ArrayList<>();
      list.add("apple");
      list.add("banana");
      list.add("cherry");
      list.add("date");
      list.add("elderberry");
      list.add("fig");
      list.add("grape");
      list.add("honeydew");
      list.add("kiwi");
      list.add("lemon");
      list.add("mango");
      list.add("nectarine");
      list.add("orange");
      list.add("papaya");
      list.add("quince");
      list.add("raspberry");
      list.add("strawberry");
      list.add("tangerine");
      list.add("uva");
      list.add("watermelon");
      list.add("xigua");
      list.add("yellow");
      list.add("zucchini");

      List<String> tmp = new ArrayList<>();
      tmp.add("Mama");

     divideIntoVowelsAndConsonants(tmp);
   }

   // todo: Дан список слов. Необходимо отфильтровать слова, состоящие только из букв, разделить их на гласные и согласные, и вывести результат.
   public static void divideIntoVowelsAndConsonants(List<String> words) {
      List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
      List<Character> consonants = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'w', 'z');

      List<String> lowercaseString = new ArrayList<>();
      for (String s : words) {
         lowercaseString.add(s.toLowerCase());
      }

      Predicate<Character> isVowel = x -> vowels.contains(x);
      Predicate<Character> isConsonants = x -> consonants.contains(x);
//
//      Map<Boolean, List<String>> myMap = lowercaseString.stream().filter(word -> word.chars().allMatch(Character::isLetter))
//              .flatMapToInt(CharSequence::chars)
//              .mapToObj(ch -> (char) ch).
//              .collect(Collectors.partitioningBy(word -> Arrays.asList('a', 'e', 'i', 'o', 'u').contains(word.charAt(0))));


      Map<Boolean, String> dividedByLetters = words.stream()
              .filter(word -> word.chars().allMatch(Character::isLetter))
              .collect(Collectors.partitioningBy(
                      word -> Arrays.asList('a', 'e', 'i', 'o', 'u').contains(word.charAt(0)),
                      Collectors.flatMapping(
                              word -> word.chars().boxed(),
                              Collectors.partitioningBy(
                                      c -> "aeiou".contains(Character.toString((char) c.intValue()))
                              )
                      )
              ))
              .entrySet().stream()
              .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      entry -> entry.getValue().get(true).stream()
                              .map(c -> Character.toString((char) c.intValue()))
                              .collect(Collectors.joining())
              ));

      System.out.println(dividedByLetters.get(true));
      System.out.println(dividedByLetters.get(false));
   }

   // todo: Дан список слов. Необходимо проверить,
   //  содержат ли они одинаковые символы (являются ли анаграммами)
   //  и вывести результат.
   public static void checkForAnagrams(List<String> words) {

      List<String> list = new ArrayList<>();

      for (int i = 0; i < words.size(); i++) {
         if (words.get(i).length() == words.get(i + 1).length()) list.add(words.get(i));
      }
   }
}
