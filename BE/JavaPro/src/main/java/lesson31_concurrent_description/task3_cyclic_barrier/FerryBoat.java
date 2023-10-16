package lesson31_concurrent_description.task3_cyclic_barrier;

public class FerryBoat implements Runnable {

   private long time = System.currentTimeMillis();
   @Override
   public void run() {
      try {
         System.out.println("Паром отошёл от берега.");
         Thread.sleep(3_000);
         System.out.printf("Паром выгрузил автомобили, прошло времени := %dс.%n",
                 (System.currentTimeMillis() - time) / 1_000);

      } catch (Exception e) {
         System.err.println("Error!");
      }
   }
}
