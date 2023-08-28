package org.example._2023_08_25;

public class MR {
   public static void main(String[] args) {

   }

   public static void m1(R r) {
      System.out.println("####");
      r.get();
   }
}

@FunctionalInterface
interface R {
   void get();
}