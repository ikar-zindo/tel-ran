package org.example._2023_07_14;

import java.util.Arrays;

public class Exam {
   /**
    * && and &
    * || or |
    * ^ XOR
    * ~ Inversion
    *
    */

   public static void main(String[] args) {

      int[] arr1 = {5, 5, 6, 7, 7, 8, 8, 10, 10, 11, 11, 18, 18};
      int[] arr2 = {7, 5, 3, 23, 3, 6, 9};

      System.out.println(searchUnpairedElementMeth1(arr1));
      System.out.println(searchUnpairedElementMeth2(arr2));
      System.out.println(55 ^ 5);

      //0000 1000
      //0000 0111
      System.out.println(8 ^ 7);

      int w = 0b0000_1000;
      int r = 0b0000_0111;

      int x = 0xF7F;
      int q = 0x96A;

      System.out.println(x & q);
   }

   private static int searchUnpairedElementMeth1(int[] arr) {
      // Использую инсрумент заложенный в сам язык Java - XOR (взаимоисключающее ИЛИ)
      int x = 0;
      for (int i : arr) {
         x = x ^ i;
      }
      return x;
   }

   private static int searchUnpairedElementMeth2(int[] arr) {
      return Arrays.stream(arr).reduce(0, (a, b) -> a ^b);
   }
}
