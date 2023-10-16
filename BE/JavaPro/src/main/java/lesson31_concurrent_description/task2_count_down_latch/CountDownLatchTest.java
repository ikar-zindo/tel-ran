package lesson31_concurrent_description.task2_count_down_latch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
   public static void main(String[] args) {

      CountDownLatch latch = new CountDownLatch(5);

      new Passenger("Ivan", latch);
      new Passenger("Naomi", latch);
      new Passenger("Bartek", latch);
      new Passenger("Magdalena", latch);
      new Passenger("Monika", latch);


   }
}
