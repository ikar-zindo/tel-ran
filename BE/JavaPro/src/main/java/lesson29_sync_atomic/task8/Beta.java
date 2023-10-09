package lesson29_sync_atomic.task8;

public class Beta {

   private Alpha alpha;

   public void setAlpha(Alpha alpha) {
      this.alpha = alpha;
   }

   public synchronized void methodA() {
      System.out.printf("Поток %s выполняет метод A класса Beta%n", Thread.currentThread().getName());

      try {
         Thread.sleep(1_000);
      } catch (Exception e) {
         System.err.println("Error!");
      }
      System.out.printf("Поток %s закончил выполнение метода A класса Beta%n", Thread.currentThread().getName());

      alpha.methodB();
   }

   public synchronized void methodB() {
      System.out.printf("Поток %s выполняет метод B класса Beta%n", Thread.currentThread().getName());
   }
}
