package com.auto.finland;

public class Car {

   // переменные экземпляра класса
   public double power;
   public int year = 2021;
   public String fabric = "audi";


   // статическая переменная
   public static int histYear = 1993;

   public void printParameters() {
      // инициализация = декларация + аллокация
      int year2; // декларация
      year2 = 1993; // аллокация

      // пример локальной переменной
      String result = "Our auto is " + fabric + ", year = " + year;
      System.out.println(result);
   }
}