package ScannerExamples;

import java.util.Scanner;

public class Example2 {
   public static void main(String[] args) {
      System.out.print("Enter pls a radius: ");
      // S = PI*r^2;
      Scanner sc = new Scanner(System.in);
      float radius = sc.nextFloat(); // open Scanner
      sc.close(); // close Scanner

      double square = Math.PI * Math.pow(radius, 2);
      System.out.println("Area of a circle: " + square);
   }
}