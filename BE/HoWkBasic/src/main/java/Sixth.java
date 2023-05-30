import java.util.Random;

public class Sixth {
   public static void main(String[] args) {
      Random r = new Random();
      int n = r.nextInt(28801);

      int hour = n / 3600;

      System.out.println("До конца смены осталось: " + n + " секунд.");

      endTimeInHours(n);
   }

   public static void endTimeInHours(int hour) {
      System.out.println(getTime(hour));
   }
   
   public static String getTime(int hour) {
      if (hour < 1) {
         return "До конца смены осталось меньше часа.";
      } else if (hour <= 4 && hour >= 2) {
         return "До конца смены осталось: " + hour + " часа.";
      } else if (hour >= 5 && hour <= 8) {
         return "До конца смены осталось: " + hour + " часов.";
      } else {
         return "До конца смены остался: " + hour + " час.";
      }
   }
}