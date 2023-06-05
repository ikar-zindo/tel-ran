package TernaryExamples;

import java.util.Scanner;

public class Example1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter pls a value for A: ");
      int a = sc.nextInt();

      System.out.print("Enter pls a value for B: ");
      int b = sc.nextInt();

      sc.close();

      System.out.println("A = " + a + ". B = " + b);

      // classic if-else way
//      if (a > b)
//         System.out.println("A > B");
//      else if (a < b)
//         System.out.println("B > A");
//      else
//         System.out.println("A = B");

      // ternary operator
      String result = (a > b) ? "A > B" : ((a < b ) ? "A < B" : "A = B");
      System.out.print(result);

      // non-classic way (if-else + ternary)
//      String result = "";
//      if (a > b)
//         result = (a > 10) ? "A (>10) B" : "A (<10) > B";
//      else if (a < b)
//         result = "B > A";
//      else
//         result = "A = B";
//      System.out.println(result);
   }
}
