package BreakContinueReturn;

public class ReturnExample {
   public static void main(String[] args) {

      int[] a = {5,8,2,0,3,9};
      //         0 1 2 3 4 5

      for (int i = 0; i < a.length; i++) {

         if (a[i] == 3)
            return;

         System.out.println(a[i]);
      }

      System.out.println("last line");
   }
}