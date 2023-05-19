package SS_19_05_23;

import java.util.Locale;

public class Main {
   public static void main(String[] args) {
       int y = 6;
       byte age = 32;
       long youtubeViews = 3_000_000_000L; // L - явно указываем, что это long
       float youtubeViewsD = 3_000_000.3F; // F - явно указываем, что это float

       String name = new String("Ivan");
       String username = "Kasia";

      System.out.println(y);
      System.out.println("Hello, World!");
      System.out.println("Your age: " + age);
      System.out.println(youtubeViews);

      System.out.println("My name is " + name);
      System.out.println(name.length()); // длинна строки
      System.out.println(name.replace('v', 'b').toUpperCase()); // меняем символ.в верхний регистр
      System.out.println("Username is" + username);
   }
}