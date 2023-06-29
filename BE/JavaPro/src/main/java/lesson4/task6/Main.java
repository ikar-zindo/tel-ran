package lesson4.task6;

public class Main {
   public static void main(String[] args) {

      Book book1 = new Book("Java", "Gerbert Shildt");
      Book book2 = book1;

      book2.setName("Clean code");
      System.out.println(book1.getName());
   }
}
