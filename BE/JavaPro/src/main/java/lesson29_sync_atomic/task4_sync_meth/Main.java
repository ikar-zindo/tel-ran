package lesson29_sync_atomic.task4_sync_meth;

public class Main {

   private static int counter;

   public static synchronized void increment() {
      counter++;
   }

   public static void main(String[] args) {

      MyThread thread1 = new MyThread();
      MyThread thread2 = new MyThread();

      thread1.start();
      thread2.start();

      try {
         thread1.join();
         thread2.join();
      } catch (InterruptedException e) {
         throw new RuntimeException(e);
      }

      System.out.println("Counter value := " + counter);
   }
}
