package lesson29_sync_atomic.task8;

public class Alpha {

   private Beta beta;

   public void setBeta(Beta beta) {
      this.beta = beta;
   }

   public synchronized void methodA() {
      System.out.printf("Поток %s выполняет метод A класса Alpha%n", Thread.currentThread().getName());

      try {
         Thread.sleep(1_000);
      } catch (Exception e) {
         System.err.println("Error!");
      }
      System.out.printf("Поток %s закончил выполнение метода A класса Alpha%n", Thread.currentThread().getName());

      beta.methodB();
   }

   public synchronized void methodB() {
      System.out.printf("Поток %s выполняет метод B класса Alpha%n", Thread.currentThread().getName());
   }
}
