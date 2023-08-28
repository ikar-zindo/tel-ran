package lesson4_Autoboxing.task7;

public class Main {
   public static void main(String[] args) throws CloneNotSupportedException {

      Author author = new Author("Gerbert Shildt");
      Book book1 = new Book("Java", author);

//      Book book2 = (Book) book1.clone();
      Book book2 = new Book(book1);

      book2.setName("Clean code");
      System.out.println(book1.getName());
      System.out.println(book2.getName());

      book2.getAuthor().setName("Robert Martin");
      System.out.println(book1.getAuthor().getName());
      System.out.println(book2.getAuthor().getName());
   }
}
