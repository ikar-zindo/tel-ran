package SS_09_06_23;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.print("Enter the height: ");
      int h = sc.nextInt();

      System.out.print("Enter the elevation: ");
      int n = sc.nextInt();

      System.out.print("Enter the drop: ");
      int m = sc.nextInt();

      sc.close();

      int number = h/(n-m)+1;

      System.out.println("The amount of cycles is: "+ number);
   }
}
