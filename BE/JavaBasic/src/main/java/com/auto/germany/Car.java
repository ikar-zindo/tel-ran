package com.auto.germany;

public class Car {

   private double power;
   private int year;
   private String fabric;

   // конструкторы
   public Car(double power, int year, String fabric) {
      this(power, year);
      this.fabric = fabric;
      print(3);
   }
   public Car(double power, int year) {
      this(power);
      this.year = year;
      this.fabric = "VM";
      print(2);
   }
   public Car(double power) {
      this.power = power;
      this.year = 2010;
      this.fabric = "VM";
      print(1);
   }
   public Car() {
      this.power = 99;
      this.year = 2010;
      this.fabric = "VM";
      print(0);
   }

   private void print(int q) {
      System.out.println("Completed german Car(" + q + " args)");
   }

   public void printCarProperties() {
      System.out.println(power);
      System.out.println(year);
      System.out.println(fabric.toUpperCase());
   }

   // getters
   public double getPower() {
      return power;
   }

   public int getYear() {
      return year;
   }

   public String getFabric() {
      return fabric;
   }

   // setters
   public void setPower(double power) {
      this.power = power;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public void setFabric(String fabric) {
      this.fabric = fabric;
   }
}