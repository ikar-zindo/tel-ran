package org.example._2023_08_25;

public class MR2 {
   public static void main(String[] args) {
      m2(MR2::mr);
   }

   public static void m2(R2 r2) {
      System.out.println("####");
      r2.get2();
   }

   public static void mr() {
      System.out.println("/////");
      System.out.println("-----");
   }
}

@FunctionalInterface
interface R2{
   void get2();
}