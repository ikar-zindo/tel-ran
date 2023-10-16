package lesson31_concurrent_description.task2_count_down_latch;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Passenger extends Thread {

   private CountDownLatch latch;
   public Passenger(String name, CountDownLatch latch) {
      this.latch = latch;
      setName(name);
      start();
   }

   @Override
   public void run() {
      try {
         long time = System.currentTimeMillis();

         Random random = new Random();
         int millis = random.nextInt(6_000) + 2_000;

         Thread.sleep(millis);
         System.out.printf("%s вошёл в аэропорт. ':%d'%n",
                 getName(), (System.currentTimeMillis() - time) / 1_000);

         Thread.sleep(millis);
         System.out.printf("%s сдал багаж и зарегистрировался. ':%d'%n",
                 getName(), (System.currentTimeMillis() - time) / 1_000);

         Thread.sleep(millis);
         System.out.printf("%s прошёл паспортный контроль. ':%d'%n",
                 getName(), (System.currentTimeMillis() - time) / 1_000);

         Thread.sleep(millis);
         System.out.printf("%s совершил посадку в самолёт. ':%d'%n",
                 getName(), (System.currentTimeMillis() - time) / 1_000);

         Thread.sleep(millis);
         latch.countDown();
         latch.await();
         System.out.printf("%s вылетел, время вылета := %d.%n",
                 getName(), (System.currentTimeMillis() - time) / 1_000);

      } catch (Exception e) {
         System.err.println("Error!");
      }
   }
}
