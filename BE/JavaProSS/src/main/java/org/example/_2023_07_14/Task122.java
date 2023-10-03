package org.example._2023_07_14;

public class Task122 {
   /**
    * Сколько едениц встречается в двоичном числе
    * 0 0 0 0 1 0 1 1 = 11
    */
   private static int bitCounter1(int n) {
      int result = 0;
      String str = Integer.toBinaryString(n);

      for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == '1')
            result++;
      }
      return result;
   }

   private static int bitCounter2(int n) { // 11---1011
      int result = 0;

      while (n != 0) { // 8 --- 1 0 0 0
         n = n & (n - 1); // n = 8 & (8 -1)
         /**
          * 1 0 0 0
          * 0 1 1 1
          * 0 0 0 0
          */
         result++;
      }
      return result;
   }

   public static void main(String[] args) {
      int a = 11;    // 0b00001011
      int b = 255;   // 0b11111111

      System.out.println(Integer.toBinaryString(a));
      System.out.println(bitCounter1(a));

      System.out.println(Integer.toBinaryString(b));
      System.out.println(bitCounter2(b));

      System.out.println(Integer.toBinaryString(10 & 8));
   }
}
