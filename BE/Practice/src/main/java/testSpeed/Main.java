package testSpeed;

public class Main {
   public static void main(String[] args) {

      String s = "Hello world!";

      long start = System.currentTimeMillis();
      for (int i = 0; i < 300_000; i++) {
         s += i;
      }
      long end = System.currentTimeMillis();
      System.out.println("Resulting string length: " + s.length());
      System.out.println("Concatenation time: " + (end - start));

      StringBuilder sb = new StringBuilder("Hello world!");

      long startSb = System.currentTimeMillis();
      for (int i = 0; i < 300_000; i++) {
         sb.append(i);
      }
      long endSb = System.currentTimeMillis();

      System.out.println("Resulting string length: " + sb.length());
      System.out.println("Concatenation time: " + (endSb - startSb));

      System.out.println("\nResult are equal: " + s.contentEquals(sb));
   }
}
