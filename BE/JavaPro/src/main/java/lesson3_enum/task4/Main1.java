package lesson3_enum.task4;

import lesson2_inheritance.task1.Cat;

public class Main1 {
   public static void main(String[] args) {

      System.out.println("До обращения к классу Day");
      Day day = Day.FRIDAY;
      System.out.println("После обращения к классу Day");

      Cat cat = new Cat(3.14);

//      Day day1 = new Day("Понедельник");

      System.out.println("Выводим все возможные названия пятницы");
      System.out.println(day);
      System.out.println(day.getRussianName());
      System.out.println(day.getShortName());

      System.out.println("Вызван неабстрактный метод");
      day.printInfo();

      day.printInfoRus();

      System.out.println("Вызываем абстрактный метод");
      //
      day.printOrderOfDay();

      Day day1 = Day.MONDAY;
      day1.printOrderOfDay();

      Day day2 = Day.TUESDAY;
      day2.printOrderOfDay();
   }
}
