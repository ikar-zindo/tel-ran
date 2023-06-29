package lesson4.task7;

import java.util.Objects;

public class Book implements Cloneable{

   private String name;
   private Author author;

   public Book(Book book) {
      this.name = book.getName();
      this.author = new Author(book.getAuthor());
   }

   public Book(String name, Author author) {
      this.name = name;
      this.author = author;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Author getAuthor() {
      return author;
   }

   public void setAuthor(Author author) {
      this.author = author;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Book book = (Book) o;
      return Objects.equals(name, book.name) && Objects.equals(author, book.author);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, author);
   }

   @Override
   protected Object clone() throws CloneNotSupportedException {
      return super.clone();
   }
}
