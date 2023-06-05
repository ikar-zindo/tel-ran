package SwitchExamples;

import java.util.Scanner;

public class Example1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter pls number of day in week [1..7]: ");
      int day = sc.nextInt();
      sc.close();

//        if (day == 1) {
//            System.out.println("MO");
//        } else if (day == 2) {
//            System.out.println("TU");
//        } else if (day == 3) {
//            System.out.println("WE");
//        } else if (day == 4) {
//            System.out.println("TH");
//        } else if (day == 5) {
//            System.out.println("FR");
//        } else if (day == 6) {
//            System.out.println("SA");
//        } else if (day == 7) {
//            System.out.println("SU");
//        } else {
//            System.out.println("Error in day");
//        }


      switch (day) {

         case 1:
            System.out.println("MO");
            break;

         case 2:
            System.out.println("TU");
            break;

         case 3:
            System.out.println("WE");
            break;

         case 4:
            System.out.println("TH");
            break;

         case 5:
            System.out.println("FR");
            break;

         case 6:
            System.out.println("SA");
            break;

         case 7:
            System.out.println("SU");
            break;

         default:
            System.out.println("Error in day");
      }
   }
}
