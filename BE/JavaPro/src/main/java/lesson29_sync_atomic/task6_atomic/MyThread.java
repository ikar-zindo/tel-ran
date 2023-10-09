package lesson29_sync_atomic.task6_atomic;

public class MyThread extends Thread {

   @Override
   public void run() {
      for (int i = 0; i < 10_000; i++) {
         Main.counter.incrementAndGet();
      }
   }
}
