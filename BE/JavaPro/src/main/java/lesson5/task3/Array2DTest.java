package lesson5.task3;

public class Array2DTest {

   public static void main(String[] args) {

      int[][] numbers = new int[5][4];

      for (int i = 0; i < numbers.length; i++) {
         for (int j = 0; j < numbers[i].length; j++) {
            numbers[i][j] = i * j;
         }
      }

      for (int[] row : numbers){
         for (int cell : row) {
            System.out.print(cell + " ");
         }
         System.out.println();
      }

//      for (int i = 0; i < numbers.length; i++) {
//         for (int j = 0; j < numbers[i].length; j++) {
//            System.out.print("[" + i + "]" + "[" + j + "]=" + numbers[i][j] + "; ");
//         }
//         System.out.println();
//      }
   }
}
