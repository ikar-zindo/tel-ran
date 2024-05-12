package lesson26_time.task1;

import java.util.Date;

public class Main {
   public static void main(String[] args) throws InterruptedException {

      Date currentTime = new Date();

      Thread.sleep(200);

      Date date = new Date();

      System.out.println(currentTime);
      System.out.println(currentTime.getTime());
      System.out.println(date);
      System.out.println(date.getTime());

   }
}
