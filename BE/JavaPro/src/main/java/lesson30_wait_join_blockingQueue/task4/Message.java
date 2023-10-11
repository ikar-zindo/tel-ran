package lesson30_wait_join_blockingQueue.task4;

public class Message {

   private int id;
   private String content;

   public Message(int id, String content) {
      this.id = id;
      this.content = content;
   }

   public int getId() {
      return id;
   }

   public String getContent() {
      return content;
   }
}
