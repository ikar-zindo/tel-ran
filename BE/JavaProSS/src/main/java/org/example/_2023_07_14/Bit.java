package org.example._2023_07_14;

public class Bit {
   /**
    * && and &
    * || or |
    * ^ XOR
    * ~ Inversion
    *
    */
   public static void printBinary(int b) {
      System.out.println("Ob" + Integer.toBinaryString(0b10000000 | (b & 0xff)).substring(1));
   }

   public static String binaryStr(int b) {
      return "0b" + "Ob" + Integer.toBinaryString(0b10000000 | (b & 0xff)).substring(1);
   }

   public static void main(String[] args) {

      // 0 0 0 0 0 0 0 0
      int i = 0b0000_0100;
      System.out.println("Bit right decimal: " + (i >> 1));
      System.out.println("Bit right binary: " + binaryStr(i >> 1));
      System.out.println("******************************************");

      System.out.println("Bit left decimal: " + (i << 1));
      System.out.println("Bit left binary: " + binaryStr(i << 1));
      System.out.println("******************************************");


      int r1 = 0b0000_1001;
      int r2 = 0b0000_1010;

      System.out.println("BIT 'AND' -> (&)");
      printBinary(r1);
      printBinary(r2);
      printBinary(r1 & r2);
      System.out.println("******************************************");

      System.out.println("BIT 'OR' -> (|)");
      printBinary(r1);
      printBinary(r2);
      printBinary(r1 | r2);
      System.out.println("******************************************\n");

      System.out.println("BIT 'XOR' -> (^)");
      printBinary(r1);
      printBinary(r2);
      printBinary(r1 ^ r2);
      System.out.println("******************************************\n");

      System.out.println("BIT 'INVERSION' -> (~)");
      printBinary(r1);
      printBinary(~r1);
      System.out.println("******************************************\n");
   }
}
