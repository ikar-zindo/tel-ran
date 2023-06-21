package de.telran.practice.lectures.oop;

public enum DaysOfWeek {

   SUNDAY(10),
   MONDAY(25),
   TUESDAY(-10),
   WEDNESDAY(0),
   THURSDAY(99),
   FRIDAY(14),
   SATURDAY(100);

   private int number;

   DaysOfWeek(int number) {
      this.number = number;
   }

   public int getNumber() {
      return number;
   }
}
