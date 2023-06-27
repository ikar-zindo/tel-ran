package lesson3.task4;

public enum Day {

   MONDAY("Понедельник", "Пн") {

      private String current = "Тест";
      @Override
      public void printOrderOfDay() {
         System.out.println("Первый день недели");
      }
   },
   TUESDAY("Вторник", "Вт") {
      @Override
      public void printOrderOfDay() {
         System.out.println("Второй день недели");
      }
   },
   WEDNESDAY("Среда", "Ср") {
      @Override
      public void printOrderOfDay() {
         System.out.println("Третий день недели");
      }
   },
   THURSDAY("Четверг", "Чт") {
      @Override
      public void printOrderOfDay() {
         System.out.println("Четвёртый день недели");
      }
   },
   FRIDAY("Пятница", "Пт") {
      @Override
      public void printOrderOfDay() {
         System.out.println("Пятый день недели");
      }
   },
   SATURDAY("Суббота", "Сб") {
      @Override
      public void printOrderOfDay() {
         System.out.println("Шестой день недели");
      }
   },
   SUNDAY("Воскресенье", "Вс") {
      @Override
      public void printOrderOfDay() {
         System.out.println("Седьмой день недели");
      }
   };

   private String russianName;
   private String shortName;

   Day() {
      System.out.println("Вызван конструктор Day");
   }

   Day(String russianName, String shortName) {
      System.out.println("Вызван конструктор Day с параметрами " + russianName + " " + shortName);
      this.russianName = russianName;
      this.shortName = shortName;
   }

   public String getRussianName() {
      return russianName;
   }

   public String getShortName() {
      return shortName;
   }

   public void printInfo() {
      System.out.println("Today is " + this.toString().toLowerCase());
   }

   public void printInfoRus() {
      System.out.println("Сегодня " + russianName.toString().toUpperCase());
   }

   public abstract void printOrderOfDay();
}
