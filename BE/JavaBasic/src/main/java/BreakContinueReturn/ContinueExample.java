package BreakContinueReturn;

public class ContinueExample {
   public static void main(String[] args) {
      int[] a = {5,8,2,4,1,0};


      for (int i = 0; i < a.length; i++) {

         System.out.print(a[i] + " ");

         if (a[i] % 2 == 0) {
            System.out.println("делится без остатка");
            continue;
         }

         System.out.println("не делится без остатка");
      }
   }
}