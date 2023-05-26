package SS_26_05_23;

import java.util.Scanner;

public class Main1 {
   public static void main(String[] args) {
//      int a = 5;
//      while (a < 0) {
//         System.out.println(a);
//         a++;
//      }

      // Проверка числа из консоли на чётность
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter even number: ");
      int i;

      // Делаем через цикл while
//      while (i % 2 != 0) {
//         System.out.println("Your number is " + i + ". Is not even. Try again.");
//         i = sc.nextInt();
//      }
//      System.out.println("Your number " + i + " is even.");

      //  Делаем через цикл do while
      do {
         i = sc.nextInt();
         if (i % 2 != 0) {
            System.out.print("Your number should be even: ");
         }
      } while (i % 2 != 0);
         System.out.println("Your number " + i + " is even.");

      sc.close(); // закрываем Scanner
   }
}