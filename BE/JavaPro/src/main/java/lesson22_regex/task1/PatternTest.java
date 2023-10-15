package lesson22_regex.task1;

import java.util.regex.Pattern;

public class PatternTest {
   public static void main(String[] args) {

      //Содержит ли строка последовательность символов 'www'

      System.out.println(checkString("https://www.example.com"));
      System.out.println(checkString("www.example.com"));
      System.out.println(checkString("https://www"));
      System.out.println(checkString("www"));
      System.out.println(checkString("https://ww.example.com"));
      System.out.println(checkString("https://wwww.example.com"));
   }

   public static boolean checkString(String source) {

      System.out.println("Проверяемая строка := " + source);

      // Пишем регулярное выражение
      String regex = "[^w]*w{3}[.].*";

      // Компилируем регулярное выражение в объект шаблона
      Pattern pattern = Pattern.compile(regex);

      // Проверяем соответствует ли переданная в метод строка нашему шаблонуэ
      boolean result = pattern.matcher(source).matches();

      // Возвращяем результат
      return result;
   }
}
