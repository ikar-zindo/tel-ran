package com.auto.germany;

public class Car {

   public double power;
   public int year;
   public String fabric;


   // конструкторы
   public Car(double power, int year, String fabric) {
      this(power, year);
      this.fabric = fabric;
      System.out.println("Finish Car(3 args)");
   }
   public Car(double power, int year) {
      this(power);
      this.year = year;
      this.fabric = "VM";
      System.out.println("Finish Car(2 args)");

   }
   public Car(double power) {
      this.power = power;
      this.year = 2010;
      this.fabric = "VM";
      System.out.println("Finish Car(1 args)");
   }
   public Car() {
      this.power = 99;
      this.year = 2010;
      this.fabric = "VM";
      System.out.println("Finish Car(0 args)");
   }
}