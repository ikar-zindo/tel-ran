package ScannerExamples;

import java.util.Scanner;
public class Example1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter pls 3 number (day, month, year)");

      System.out.print("Day: "); // Ввод даты
      byte day = sc.nextByte();

      System.out.print("Month: "); // Ввод месяца
      byte month = sc.nextByte();

      System.out.print("Year: "); // Ввод года
      short year = sc.nextShort();

      if(month < 10) {
         System.out.println("Today is " + day + ".0" + month + "." + year);
      } else {
         System.out.println("Today is " + day + "." + month + "." + year);
      }

      sc.close();
   }
}