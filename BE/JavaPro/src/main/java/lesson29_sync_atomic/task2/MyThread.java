package lesson29_sync_atomic.task2;

public class MyThread extends Thread {

   @Override
   public void run() {
      for (int i = 0; i < 100; i++) {
         FileService.writeToFile(String.format("<%s>: value := [%d]%n",
                 getName(), i));
      }
   }
}
