package org.example._2023_08_25;

import java.util.Arrays;

public class CubeRotate {
   public static void rotate(int[][] matrix) {
      int M = matrix.length;

      for (int i = 0; i < M; i++) {
         for (int j = i; j < M; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
         }
      }

      for (int i = 0; i < M; i++) {
         for (int j = 0; j < M / 2; j++) {
            int temp = matrix[i][j];
            matrix[i][j] = matrix[i][M - 1 - j];
            matrix[i][M - 1 - j] = temp;
         }
      }
      System.out.println(Arrays.deepToString(matrix));
   }

   private static int oneCounter(int a) {
      int result = 0; // & | ^ ~
      while (a != 0) {
         a = a & (a - 1); // a = 255 & (255 - 1)
         result++;
      }

      return result;
   }

   public static void main(String[] args) {
      int[][] arr = {{1, 2, 3},
              {4, 5, 6},
              {7, 8, 9}};

      rotate(arr);

      int a = 255; // 1111 1111
      int ab = 0b11111111;
      int ah = 0x777;

      System.out.println(oneCounter(a));
   }
}
