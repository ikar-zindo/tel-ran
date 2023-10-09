package lesson29_sync_atomic.task1;

import java.io.FileWriter;

public class MyThread extends Thread {

   @Override
   public void run() {
      try (FileWriter writer = new FileWriter("test.txt", true)) {
         for (int i = 0; i < 100; i++) {
            // <Thread_name>: value := [5]
            writer.write(String.format("<%s>: value := [%d]%n", getName(), i));
            Thread.sleep(100);
         }
      } catch (Exception e) {
         System.err.println("Ошибка!");
      }
   }
}
