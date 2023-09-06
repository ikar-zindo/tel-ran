package lesson17_lambdas_practice.task8;

public class Request {

   private String message;
   private int id;

   public Request(String text, int id) {
      this.message = text;
      this.id = id;
   }

   public String getMessage() {
      return message;
   }

   public int getId() {
      return id;
   }
}
