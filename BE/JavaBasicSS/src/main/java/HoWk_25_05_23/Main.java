package HoWk_25_05_23;

public class Main {
   public static void main(String[] args) {
      int caloriesRate = 40;
      System.out.println(calculateCaloriesDifference(28, 24, caloriesRate));
   }

   public static double calculateCaloriesDifference(int a, int b, int calories) {
      return Math.PI * (a* a - b * b) * calories / 4;
   }
}
