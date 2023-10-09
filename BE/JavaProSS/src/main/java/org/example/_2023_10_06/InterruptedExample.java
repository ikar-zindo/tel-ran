package org.example._2023_10_06;

public class InterruptedExample {
   public static void main(String[] args) throws InterruptedException {

      System.out.println("Main start");

      InterruptedTest thread = new InterruptedTest();
      thread.start();
      Thread.sleep(1_000);
      thread.interrupt();

      thread.join();
      System.out.println("Main end");
   }
}

class InterruptedTest extends Thread{
   double sqrtSum = 0;

   @Override
   public void run() {
      for (int i = 0; i < 1_000_000; i++) {
         if (isInterrupted()) {
            System.out.println("Поток хотят прервать");
            return;
         }
         sqrtSum += Math.sqrt(i);

         try {
            Thread.sleep(900);
         } catch (InterruptedException e) {
            System.out.println("Поток хотят прервать во время сна");
            return;
         }
      }

      System.out.println(sqrtSum);
   }
}
