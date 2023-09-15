package org.example._2023_09_15.task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Найдите все слова, которые начинаются с заглавной буквы.
 */
public class Main {
   public static void main(String[] args) {

      String text = "This is a Sample text with Capitalized Words like Java, Python, and JavaScript.";

      findWordsStartCapitalLetter(text);
   }

   public static void findWordsStartCapitalLetter(String text) {

      // Регулярное выражение для поиска слов, начинающихся с заглавной буквы
      String regex = "\\b[A-Z][a-zA-Z]*\\b";

      // Создаем Pattern объект
      Pattern pattern = Pattern.compile(regex);
      // Создаем Matcher объект для текста
      Matcher matcher = pattern.matcher(text);

      // Ищем и выводим все совпадени
      while (matcher.find()) {
         String capitalizedWord = matcher.group();
         System.out.println(capitalizedWord);
      }

   }
}
