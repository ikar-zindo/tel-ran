import java.util.Scanner;

public class Seventh {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Введите число от 1 до 7 (номер для недели): ");
      int date = sc.nextInt();
      sc.close();

      if (date == 1) {
         System.out.println("Monday");
      } else if (date == 2) {
         System.out.println("Tuesday");
      } else if (date == 3) {
         System.out.println("Wednesday");
      } else if (date == 4) {
         System.out.println("Thursday");
      } else if (date == 5) {
         System.out.println("Friday");
      } else if (date == 6) {
         System.out.println("Saturday");
      } else if (date == 7) {
         System.out.println("Sunday");
      } else {
         System.out.println("Число не входит в диапазон.");
      }
   }
}