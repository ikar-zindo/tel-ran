package NumericalSystems;

import com.auto.finland.Car;

public class HexExample {
   public static void main(String[] args) {
      int q = 542;

      System.out.println(q / 16); // 33
      System.out.println(q % 16);      // 14 -> e

      System.out.println(33 / 16); // 2
      System.out.println(33 % 16);     // 1

      System.out.println(2 / 16); // 0
      System.out.println(2 % 16);      // 2

      int q16 = 0x21e;
      //          210
      // более короткий 10 -> 16
      System.out.println(Integer.toHexString(q));

      // более короткий 16 -> 10
      double result = 2*Math.pow(16, 2) + 1*Math.pow(16, 1) + 14*Math.pow(16, 0);
      System.out.println(result);

      // более короткий 16 -> 10
      System.out.println(q16);

      System.out.println(new Car());
   }
}