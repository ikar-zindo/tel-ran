package lesson28_runnable_vs_thread_deamon.task1;

public class Service {

   public static void test(Runnable r) {
      new Thread(r).start();
   }
}
