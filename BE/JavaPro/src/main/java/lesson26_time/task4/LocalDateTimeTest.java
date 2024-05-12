package lesson26_time.task4;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest {
   public static void main(String[] args) {

      LocalDateTime date = LocalDateTime.now();
      System.out.println(date);

      LocalDateTime date1 =
              LocalDateTime.of(2020, Month.FEBRUARY, 12, 10, 15, 43);

      date1 = date1.plusDays(5).minusYears(2).plusHours(4).minusNanos(1);
      System.out.println(date1);
   }
}
