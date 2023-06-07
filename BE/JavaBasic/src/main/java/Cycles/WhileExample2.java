package Cycles;

import java.util.Scanner;

public class WhileExample2 {
   public static void main(String[] args) {
      // while + boolean expression

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter number for getting a sum: ");

      int sum = 0;

      while (sc.hasNextInt()) {
         int tmp = sc.nextInt();
         if (tmp == -9999)
            break;

         sum += tmp;
      }

//        for (; sc.hasNextInt();) {
//            int tmp = sc.nextInt();
//            if (tmp == -9999)
//                break;
//
//            sum += tmp;
//        }

      System.out.println("Sum = " + sum);
      sc.close();

   }

   public static void getExample2() {
      // сумма значений, количество которых мы можем задать самостоятельно
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter how many value you will use: ");
      int count = sc.nextInt();

      int sum = 0;

      for (int i = 0; i < count; i++)
         sum += sc.nextInt();

//        int j=0;
//        while (j < count) {
//            sum += sc.nextInt();
//            j++;
//        }

      System.out.println("Sum = " + sum);
      sc.close();
   }

   public static void getExample1() {

      // сумма трех значений
      Scanner sc = new Scanner(System.in);

      int sum = 0;
      for (int i = 0; i < 3; i++) {
         sum += sc.nextInt();
      }
      sc.close();

      System.out.println(sum);
   }
}
