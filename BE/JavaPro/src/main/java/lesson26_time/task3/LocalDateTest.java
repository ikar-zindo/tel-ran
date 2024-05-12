package lesson26_time.task3;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest {
   public static void main(String[] args) {

      LocalDate date = LocalDate.now();
      System.out.println(date);

      LocalDate date1 = LocalDate.of(2020, Month.APRIL, 14);
      System.out.println(date1);

      System.out.println(date1.getYear());
      System.out.println(date1.getMonthValue());
      System.out.println(date1.getMonth());
      System.out.println(date1.getDayOfWeek());

      date1 = date1.plusYears(5);
      System.out.println(date1);

      date1 = date1.plusYears(-3).minusDays(3).plusWeeks(1);
      System.out.println(date1);
   }
}
