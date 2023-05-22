import java.util.Locale;

public class StringExample4 {
   public static void main(String[] args) {
      String input1 = "Hello, Java. It`s 283023m.";

      System.out.println(input1);

      // tiCharArray() метод
      char[] chArray = input1.toCharArray();
      System.out.println(chArray); // Вывод массива

      for (int i = 0; i < input1.length(); i++) { // Вывод массива
         System.out.print(chArray[i]);
      }

      System.out.println();

      // toUpperCase() + toLowerCase()
      System.out.println(input1.toUpperCase());
      System.out.println(input1.toLowerCase());
   }
}