package lesson26_time.task1;

import java.util.Date;

public class Main2 {
   public static void main(String[] args) throws InterruptedException {

      Thread.sleep(3_000);
      Date date = new Date();
      Date date1 = new Date();

      System.out.println(date);
      System.out.println(date1);

      System.out.println("Вторая дата позже? - " + date1.after(date));
      System.out.println("Вторая дата раньше? - " + date1.before(date));

      System.out.println("Сравнение двух дат - " + date.compareTo(date1));
      System.out.println(date.getTime());
      System.out.println(date1.getTime());
      System.out.println("Эквивалентны ли даты - " + date.equals(date1));
   }
}
