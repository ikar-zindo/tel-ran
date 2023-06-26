package lesson3.task2;

public class Main {
   public static void main(String[] args) {

      Document document = Document.READ;

      //Не можем создать документ таким образом,
      // т.к. конструктор приватный
//      Document document = new Document();

      if (document.equals(Document.SENT)) {
         System.out.println("Документ отправлен");
      } else if (document.equals(Document.DELIVERED)) {
         System.out.println("Документ доставлен");
      } else if (document.equals(Document.READ)) {
         System.out.println("Документ прочитан");
      }
   }
}
