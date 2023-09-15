package org.example._2023_09_15.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Разберитесь с
 * HTML-кодом и извлеките все ссылки (теги <a>) с их атрибутами href.
 */
public class Main {

   public static void main(String[] args) {

      String html = "<a href='https://example.com'>Ссылка 1</a> <a href=\"https://example2.com\">Ссылка 2</a>";

      List<String> list = parseXML(html);

      for (String s : list) {
         System.out.println(s);
      }

   }

   public static List<String> parseXML(String html) {

      List<String> list = new ArrayList<>();
      String regex = "<a\\s+[^>]*?href\\s*=\\s*\"([^\"])\"[^>]*>";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(html);

      while (matcher.find()) {
         String str = matcher.group();
         list.add(str);
      }

      return list;
   }
}
