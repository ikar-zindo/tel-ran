package lesson29_sync_atomic.task4_sync_meth;

public class MyThread extends Thread {

   @Override
   public void run() {
      for (int i = 0; i < 10_000; i++) {
         Main.increment();
      }
   }
}
