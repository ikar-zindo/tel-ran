package org.example._2023_09_15.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void main(String[] args) {

      String date = "Today is 15/09/2023, tomorrow is 16/09/2023";

      findDate(date);


   }

   public static void findDate(String text) {

      String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";

      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(text);

      while (matcher.find()) {
         String date = matcher.group();
         System.out.println(date);
      }
   }
}
