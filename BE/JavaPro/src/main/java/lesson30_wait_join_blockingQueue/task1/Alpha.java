package lesson30_wait_join_blockingQueue.task1;

public class Alpha extends Thread {

   private CommonUtils utils;

   public Alpha(CommonUtils utils) {
      this.utils = utils;
      setName("Alpha");
      start();
   }

   @Override
   public void run() {
      utils.methodA();
   }
}
