package org.example._2023_10_13.task2;

public class Taski {


   private static boolean isAtPoint(String s) {
      int heightStep = 0;
      int lengthStep = 0;

      char[] arr = s.toUpperCase().toCharArray();

      for (int i = 0; i < arr.length; i++) {
         if (arr[i] == 'U') {
            heightStep++;
         }
         if (arr[i] == 'D') {
            heightStep--;
         }
         if (arr[i] == 'R') {
            lengthStep++;
         }
         if (arr[i] == 'L') {
            lengthStep--;
         }
      }

      return lengthStep == 0 && heightStep == 0;
   }

   private static int getQ(int[][] king, int[][] queens) {

      return 0;
   }

   public static void main(String[] args) {

      String s = "UDUDD";
      System.out.println(isAtPoint(s));

      int[][] king = {
              {2, 5}
      };

      int[][] queens = {
              {1, 1},
              {5, 2},
              {6, 6},
              {1, 7}
      };


      System.out.println(getQ(king, queens));
   }
}
