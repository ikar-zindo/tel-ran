package RandomExamples;

import java.util.Scanner;

public class Example5 {
   public static void main(String[] args) {
      // Exercise 3
      // Напишите программу на Java, чтобы поменять местами значения,
      // хранящиеся в двух переменных, без использования третьей переменной

      Scanner sc = new Scanner(System.in);

      System.out.print("Enter 1st var: ");
      int a = sc.nextInt();

      System.out.print("Enter 2nd var: ");
      int b = sc.nextInt();

      System.out.println("Var a = " + a + ", var b = " + b);

      // logic
      a = a + b;
      b = a - b;
      a = a - b;

      System.out.println("Var a = " + a + ", var b = " + b);
      sc.close();
   }
}