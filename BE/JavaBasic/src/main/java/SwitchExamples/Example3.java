package SwitchExamples;

import java.util.Scanner;

public class Example3 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter pls year of education [1..2]: ");
      int year = sc.nextInt();

      sc.nextLine();

      System.out.print("Enter pls your branch [Berlin, Tel-Aviv, New-York]");
      String branch = sc.nextLine();
      sc.close();

      switch (year) {
         case 1:

            switch (branch) {
               case "Berlin":
                  System.out.println("Branch Berlin, year 1");
                  break;

               case "Tel-Aviv":
                  System.out.println("Branch Tel-Aviv, year 1");
                  break;

               case "New-York":
                  System.out.println("Branch New-York, year 1");
                  break;

               default:
                  System.out.println("Selected branch is wrong");
            }

            break;

         case 2:
            switch (branch) {
               case "Berlin":
                  System.out.println("Branch Berlin, year 2");
                  break;

               case "Tel-Aviv":
                  System.out.println("Branch Tel-Aviv, year 2");
                  break;

               case "New-York":
                  System.out.println("Branch New-York, year 2");
                  break;

               default:
                  System.out.println("Selected branch is wrong");
            }

            break;

         default:
            System.out.println("Year of education is wrong");
      }
   }
}
