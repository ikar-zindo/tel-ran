package lesson29_sync_atomic.task5_sync_block_code;

public class MyThread extends Thread {

   @Override
   public void run() {
      for (int i = 0; i < 10_000; i++) {

         synchronized (Monitors.MONITOR) {
            Main.increment();
         }
      }
   }
}
