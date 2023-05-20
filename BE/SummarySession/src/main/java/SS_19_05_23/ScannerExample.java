package SS_19_05_23;

import java.util.Scanner;

public class ScannerExample {
   public static void main(String[] args) {
      System.out.print("Enter your age: ");

      Scanner sc = new Scanner(System.in);
      short age = sc.nextShort();
      sc.close();

      System.out.println("You are " + age + " years old.");
   }
}