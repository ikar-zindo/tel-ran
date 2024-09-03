package SS_19_05_23;

public class Сondition {
   public static void main(String[] args) {
      int x = -5;

      if (x > 0 && x < 2_000) {
         System.out.println("x is between 0 and 2000");
      } else if (x > 2_000) {
         System.out.println("x is greater 2000");
      } else {
         System.out.println("x is negative");
      }
   }
}
