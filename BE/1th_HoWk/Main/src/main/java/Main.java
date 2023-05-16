import java.util.Scanner;
/*
   1 уровень сложности: Разработайте алгоритм, используя сканнер,
   который принимал бы любое целое число и выводил на экран его десятичную,
   восьмеричную, двоичную и шестнадцатеричную версию
*/
public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); // Запускаем Scanner

      System.out.print("Enter decimal number: ");
      int num = sc.nextInt(); // Заносим в переменную число из консоли
      sc.close(); // закрываем Scanner

      System.out.println("Decimal:  " + num); // 10
      System.out.println("Binary:  " + Integer.toBinaryString(num)); // 10 -> 2
      System.out.println("Octal:  " + Integer.toOctalString(num)); // 10 -> 8
      System.out.println("Hexadecimal:  " + Integer.toHexString(num)); // 10 -> 16
   }
}