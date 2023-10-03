package org.example._2023_09_15.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void main(String[] args) {

      String text = "В тексте есть числа 3.14, -0.5, и 42. Вот еще 123.456789.";

      findFloat(text);
   }

   public static void findFloat(String text) {

      String regex = "\\b[-+]?\\d+\\.\\d+\\b";

      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(text);

      while (matcher.find()) {
         String foundFloat = matcher.group();
         System.out.println(foundFloat);
      }
   }
}
