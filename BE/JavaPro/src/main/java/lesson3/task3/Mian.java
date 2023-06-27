package lesson3.task3;

public class Mian {
   public static void main(String[] args) {

      Document document = Document.SENT;

//      if (document.equals(Document.SENT)) {
//         System.out.println("Документ отправлен");
//      } else if (document.equals(Document.DELIVERED)) {
//         System.out.println("Документ доставлен");
//      } else if (document.equals(document.READ)) {
//         System.out.println("Документ прочитан");
//      }

      switch (document) {
         case SENT -> System.out.println("Документ отправлен");

         case DELIVERED -> System.out.println("Документ доставлен");

         case READ -> System.out.println("Документ прочитан");

         case DELETED -> System.out.println("Документ удалён");
      }

      System.out.println("Работа метода toString()");
      System.out.println(document);
   }
}
