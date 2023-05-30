package RandomExamples;

import java.util.Scanner;

public class Example4 {
   public static void main(String[] args) {
      // Exercise 2
      // Напишите программу на Java для того, чтобы поменять местами значения,
      // хранящиеся в двух переменных с помощью третьей переменной

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter 1st var: ");
      int a = sc.nextInt();

      System.out.print("Enter 2nd var: ");
      int b = sc.nextInt();

      System.out.println("Var a = " + a + ", var b = " + b);

      int temp = a;
      a = b;
      b = temp;

      System.out.println("Var a = " + a + ", var b = " + b);
      sc.close();
   }
}