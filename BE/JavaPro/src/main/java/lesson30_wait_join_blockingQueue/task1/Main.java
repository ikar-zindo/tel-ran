package lesson30_wait_join_blockingQueue.task1;

public class Main {
   public static void main(String[] args) {

      CommonUtils utils = new CommonUtils();

      new Alpha(utils);
      new Beta(utils);
   }
}
