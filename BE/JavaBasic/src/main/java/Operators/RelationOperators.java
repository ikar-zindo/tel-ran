package Operators;


import java.util.Random;

public class RelationOperators {
   public static void main(String[] args) {
      int q = 10;

      // <
      int temp1 = getRandomValue(5, 15);
      System.out.println("q < " + temp1 + " = " + ((q < temp1) ? "ПРАВДА" : "ЛОЖЬ"));

      // >
      int temp2 = getRandomValue(5, 15);
      System.out.println("q > " + temp2 + " = " + ((q > temp2) ? "ПРАВДА" : "ЛОЖЬ"));

      // >=
      int temp3 = getRandomValue(5, 15);
      System.out.println("q >= " + temp3 + " = " + ((q >= temp3) ? "ПРАВДА" : "ЛОЖЬ"));

      // >=
      int temp4 = getRandomValue(5, 15);
      System.out.println("q >= " + temp4 + " = " + ((q >= temp4) ? "ПРАВДА" : "ЛОЖЬ"));

      // ==
      int temp5 = getRandomValue(5, 15);
      System.out.println("q == " + temp5 + " = " + ((q == temp5) ? "ПРАВДА" : "ЛОЖЬ"));

      // !=
      int temp6 = getRandomValue(5, 15);
      System.out.println("q != " + temp6 + " = " + ((q != temp6) ? "ПРАВДА" : "ЛОЖЬ"));
   }

   public static int getRandomValue(int min, int max) {
      Random r = new Random();
      return r.nextInt(min, max + 1);
   }

   public static void example() {
      int q = 10;
      int w = 20;

      System.out.println("q = " + q + ", w = " + w);
      boolean result1 = q < w;
      System.out.println("q < w = " + result1);

      boolean result2 = q > w;
      System.out.println("q > w = " + result2);

      System.out.println("q <= w = " + (q <= w));
      System.out.println("q >= w = " + (q >= w));

      System.out.println("q == w = " + (q == w));
      System.out.println("q != w = " + (q != w));
   }
}