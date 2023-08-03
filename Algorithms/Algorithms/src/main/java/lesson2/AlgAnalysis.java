package lesson2;

public class AlgAnalysis {

   // space: a, b, result
   // time:
   // 1 := 'a + b'
   // 1 := '='
   // 1 := 'return'

   // 3 operation = O(3) = O(1)
   public int sum(int a, int b) {
      int result = a + b;
      return result;
   }

   public int sumArray(int[] array) {
      int sum = 0; // 1 operation
      for (int i = 0; i < array.length; i++) { // (3 * (n + 1)) operations
         sum += array[i]; // (2 * n) operations
      }
      return sum; // 1 operation
   }
   // space: sum, i -> O(1)
   // time := 1 + 3 * (n + 1) + 2 * n + 1 = 1 + 3n + 3 + 2n + 1 = 5n + 5
   // O(5n + 5) = O(5n) = O(n)

   public void test1(int n) {
      if (n == 1) // 1
         return; // 1
      for (int i = 0; i <= n; i++) { // 3 * (n + 1)
         for (int j = 0; j <= n; j++) { // 3 * (n + 1)
            System.out.println("*"); // 1
            break; // 1
         }
      }
      // space := i, j -> O(1)
      // time: 1 + 1 + 3 * (n + 1) *( 3 * (n + 1) + 1 + 1) = 2 + (3n + 3) * (3n + 5) = 2 + 9n^2 + 15n + 9n + 15 = 9n^2 + 24n +17
      // O(9n^2 + 24n +17) = O(9n^2) = O(n^2)
   }
   
   public void test2(int n) {
      int a = 0; // 1
      for (int i = 0; i < n; i++) { // 3 * (n + 1)
         for (int j = n; j > i; j--) { // 3 * (n/2 + 1)
            a = a + i + j; // 3
         }
      }
      // space := a, i, j -> O(1)
      // time :=
      // (On^2)
   }

   public void test3(int n) {
      int i, j, a = 0; // 3
      for (i = n / 2; i <= n; i++) { // 3 * (n/2 + 1)
         for (j = 2; j <= n; j = j * 2)  // ~ n
            a = a + n / 2;
      }
      // space :=
      // time :=
      // O
   }

   public void test4(int n) {
      int a = 0, i = n; // 2
      while (i > 0){ // 1
         a += i; // 2
         a /= 2; // 1
      }
   }
   // space :=
   // time :=
   // O()
}
