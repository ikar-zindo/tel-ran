package SS_26_05_23;

public class Main {
   public static void main(String[] args) {
      checkingSign(-5);
      checkingTime(12);
      checkingNumber(3);

//      for (int i = 0; i <= 10; i++) {
//         if (i % 2 == 0) {
//            System.out.println(i + " is even");
//         } else {
//            System.out.println(i + " is odd");
//         }
//      }


      for (int i = 0; i <= 10; i++) {
         String q = (i % 2 == 0) ? i + " is even" : i + " is odd";
         System.out.println(q);
      }


   }

   public static void checkingSign (int number) {
      if (number > 0) {
         System.out.println("number is positive");
      } else if (number < 0) {
         System.out.println("number is negative");
      } else {
         System.out.println("number is zero");
      }
   }

   // Exercise 0
   public static void checkingTime (int time) {
      if (time >= 0 && time < 12) {
         System.out.println("morning");
      } else if (time >= 12 && time < 18) {
         System.out.println("afternoon");
      } else if (time >= 18 && time < 21) {
         System.out.println("evening");
      } else if (time >= 21 && time <= 24) {
         System.out.println("night");
      } else if (time < 0) {
         System.out.println("number is negative");
      } else {
         System.out.println("wrong number");
      }
   }

   public static void checkingNumber (int num) {
      if (num % 15 == 0) {
         System.out.println("number is divisible by 15, 5, 3");
      } else if (num % 5 == 0) {
         System.out.println("number is divisible by 5");
      } else if (num % 3 == 0) {
         System.out.println("number is divisible by 3");
      } else {
         System.out.println("number is divisible by 3, 5, 15");
      }
   }
}