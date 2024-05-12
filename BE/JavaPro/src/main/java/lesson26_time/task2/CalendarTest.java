package lesson26_time.task2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
   public static void main(String[] args) {

      Calendar calendar = Calendar.getInstance();
      Calendar calendar1 = new GregorianCalendar();

      System.out.println(calendar);
      System.out.println(calendar1);

      System.out.println(calendar.get(0));
      System.out.println(calendar.get(Calendar.YEAR));
      System.out.println(calendar.get(Calendar.MONTH));
      System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
      System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));

      calendar.set(Calendar.MONTH, Calendar.APRIL);
      System.out.println(calendar.get(Calendar.MONTH));

      calendar.add(Calendar.YEAR, 10);
      System.out.println(calendar.get(Calendar.YEAR));

      // 13/03/2024
      SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
      String formatterDate = formatter.format(calendar.getTime());
      System.out.println("Отформатированная дата - " + formatterDate);

      // 2023-09-27 10:24
      formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");
      System.out.println(formatter.format(calendar.getTime()));
   }
}
