package lesson31_concurrent_description.task1_semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {
   public static void main(String[] args) {

      Semaphore semaphore = new Semaphore(2);

      Car car1 = new Car("DeLorean", semaphore);
      Car car2 = new Car("Toyota", semaphore);
      Car car3 = new Car("Kia", semaphore);
      Car car4 = new Car("Ford Model T", semaphore);
   }
}
