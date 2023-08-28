package lesson3_enum.task4;

import java.util.Arrays;

public class Main {
   public static void main(String[] args) {

      Day day = Day.THURSDAY;

      int order = day.ordinal();
      System.out.println("Order: " + order);

      Day day1 = getDayOfWeek("Friday");
      System.out.println(day1.ordinal());

      Day[] days = Day.values();
      System.out.println("Названия дней недели");
      System.out.println(Arrays.toString(days));

      for (Day currentDay : days) {
         System.out.print(currentDay + " ");
      }
   }

   public static Day getDayOfWeek(String nameOfDay) {
      Day day = Day.valueOf(nameOfDay.toUpperCase());
      return day;
   }
}
