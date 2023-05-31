package BreakContinueReturn;

public class BreakExample {
   public static void main(String[] args) {

      int[] a = {5,8,2,0,3,9};
      //         0 1 2 3 4 5

      for (int i = 0; i < a.length; i++) {

         if (a[i] == 3)
            break;

         System.out.println(a[i]);
      }

      System.out.println("last line");

//      for (int i = 0; i < a.length; i++) {
//         if (a[i] % 2 == 0) { // a[i] % 2 != 1
//            System.out.println(a[i] + " чётное");
//            break; // выйдет из цикла когла встретит 1е чётное число в массиве
//         } else {
//            System.out.println(a[i] + " несчётное");
//         }
//      }
   }
}