package org.example._2023_09_15.task3;

import java.lang.reflect.Member;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void main(String[] args) {

      String text = "Сайт example.com очень популярен, также есть сайты на sub.example.com и example2.net.";

      findDomain(text);
   }

   public static void findDomain(String text) {

      String regex = "\\b[\\w.-]+\\.[a-zA-Z]{2,}\\b";

      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(text);

      while (matcher.find()) {
         String domain = matcher.group();
         System.out.println(domain);
      }
   }
}
