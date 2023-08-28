package lesson4_Autoboxing.task7;

import java.util.Objects;

public class Author {

   private String name;
   private int yearOfBirth;

   public Author(Author author) {
      this.name = author.getName();
      this.yearOfBirth = author.getYearOfBirth();
   }
   public Author(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getYearOfBirth() {
      return yearOfBirth;
   }

   public void setYearOfBirth(int yearOfBirth) {
      this.yearOfBirth = yearOfBirth;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Author author = (Author) o;
      return yearOfBirth == author.yearOfBirth && Objects.equals(name, author.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, yearOfBirth);
   }
}
