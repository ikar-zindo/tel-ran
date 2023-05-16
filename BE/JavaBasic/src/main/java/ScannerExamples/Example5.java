package ScannerExamples;

import java.util.Scanner;

public class Example5 {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      System.out.print("Age: ");
      byte age = sc.nextByte();

      sc.nextLine();

      System.out.print("Country: ");
      String country = sc.nextLine();

      System.out.print("Name: ");
      String name = sc.nextLine();
      sc.close();

      System.out.println("Name: " + name + ". Country: " + country + ". Age: " + age +'.');
   }
}