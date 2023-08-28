package lesson4_Autoboxing.task2;

import lesson4_Autoboxing.task1.Cat;

public class Main {
   public static void main(String[] args) {

      int value = 5;
      Cat cat = new Cat();
      cat.setAge(3);

      System.out.println("Значения до вызова метода:");
      System.out.println("Значение int - " + value);
      System.out.println("Зничение возраста кота - " + cat.getAge());

      changValue(value);
      changValue(cat);

      System.out.println("Значения после вызова метода:");
      System.out.println("Значение int - " + value);
      System.out.println("Зничение возраста кота - " + cat.getAge());
   }

   public static void changValue(int value) {
      value++;
   }

   public static void changValue(Cat cat) {
      cat.setAge(cat.getAge() + 1);
   }
}
