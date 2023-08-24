package lesson16.task1;

public enum Degree {

   BACHELOR("Бакалавр"),
   MASTER("Магистр");

   private String description;

   Degree(String description) {
      this.description = description;
   }

   public String getDescription() {
      return description;
   }
}
