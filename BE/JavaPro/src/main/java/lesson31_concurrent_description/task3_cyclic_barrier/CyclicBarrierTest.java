package lesson31_concurrent_description.task3_cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
   public static void main(String[] args) {

      CyclicBarrier barrier = new CyclicBarrier(2, new FerryBoat());

      new Truck("Man", barrier);
      new Truck("Scania", barrier);
      new Truck("Volvo", barrier);
      new Truck("Iveco", barrier);
      new Truck("Mack", barrier);
      new Truck("Peterbilе", barrier);
      new Truck("Kenworth", barrier);
      new Truck("Mercedes", barrier);
      new Truck("Nissan", barrier);
   }
}
