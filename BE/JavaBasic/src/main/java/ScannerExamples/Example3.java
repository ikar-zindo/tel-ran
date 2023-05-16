package ScannerExamples;

import java.util.Scanner;

public class Example3 {
   public static void main(String[] args) {
      System.out.print("Enter pls your name: ");

      Scanner sc = new Scanner(System.in);
      String name = sc.next();
      sc.close();

      System.out.println("Hello, " + name);
   }
}