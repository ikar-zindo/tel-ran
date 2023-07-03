package lesson5.task3;

public class Array3DTest {
   public static void main(String[] args) {

      int[][][] numbers = new int[3][4][5];

      for (int i = 0; i < numbers.length; i++) {
         for (int j = 0; j < numbers[i].length; j++) {
            for (int k = 0; k < numbers[i][j].length; k++) {
               numbers[i][j][k] = i * j * k;
            }
         }
      }

      for (int[][] arr2D : numbers) {
         for (int[] row : arr2D) {
            for (int call : row) {
               System.out.print(call + "  ");
            }
            System.out.println();
         }
         System.out.println();
      }
   }
}
