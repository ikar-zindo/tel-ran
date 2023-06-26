package lesson3.task1;

public class Main {
   public static void main(String[] args) {

      Document document = new Document("Read");

      if (document.getStatus().equals("Sent")) {
         System.out.println("Документ отправлен");
      } else if (document.getStatus().equals("Delivered")) {
         System.out.println("Документ доставлен");
      } else if (document.getStatus().equals("Read")) {
         System.out.println("Документ прочитан");
      }
   }
}
