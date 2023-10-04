package lesson28_runnable_vs_thread_deamon.task4;

public class Main {

   public static void main(String[] args) {

      Timer timer = new Timer();
      timer.start();

      Timer timer1 = new Timer();
      timer1.start();

      try {
         Thread.sleep(10_000);
      } catch (InterruptedException ignored) {

      }

      timer.stopTimer();
      timer1.stopTimer();
   }
}
