package lesson20_IO_API.task2_scanner;

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      System.out.printf("Сумма 2х чисел := %d", x + y);
   }
}
