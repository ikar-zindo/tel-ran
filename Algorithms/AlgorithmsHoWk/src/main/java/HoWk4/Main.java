package HoWk4;

public class Main {
   public static void main(String[] args) {
      int[][] grid = {
              {1, 3, 5, 8},
              {4, 2, 1, 7},
              {4, 3, 2, 3}
      };

      int minCost = findMinCost(grid);
      System.out.println("Минимальная стоимость пути: " + minCost);
   }

   static int findMinCost(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;

      int[][] dp = new int[m][n];
      dp[0][0] = grid[0][0];

      // Инициализация первой строки и первого столбца
      for (int i = 1; i < m; i++) {
         dp[i][0] = dp[i - 1][0] + grid[i][0];
      }
      for (int j = 1; j < n; j++) {
         dp[0][j] = dp[0][j - 1] + grid[0][j];
      }

      // Заполнение остальных значений
      for (int i = 1; i < m; i++) {
         for (int j = 1; j < n; j++) {
            dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
         }
      }

      return dp[m - 1][n - 1];
   }
}
