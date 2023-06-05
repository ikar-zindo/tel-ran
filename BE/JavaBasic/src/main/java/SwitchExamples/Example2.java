package SwitchExamples;

import java.util.Scanner;

public class Example2 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter pls number by string of day in week [one..seven]: ");

      // day String
      String day = sc.next();
      sc.close();

      switch (day) {

         case "one":
            System.out.println("MO");
            break;

         case "two":
            System.out.println("TU");
            break;

         case "three":
            System.out.println("WE");
            break;

         case "four":
            System.out.println("TH");
            break;

         case "five":
            System.out.println("FR");
            break;

         case "six":
            System.out.println("SA");
            break;

         case "seven":
            System.out.println("SU");
            break;

         default:
            System.out.println("Error in day");
      }
   }
}
