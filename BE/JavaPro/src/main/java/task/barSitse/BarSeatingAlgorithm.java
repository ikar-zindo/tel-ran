package task.barSitse;

public class BarSeatingAlgorithm {
   public static void main(String[] args) {
      int totalSeats = 27;

      // Создаем массив для хранения количества свободных мест для каждой позиции
      int[] maxFreeSeats = new int[totalSeats];

      // Перебираем возможные позиции первого посетителя
      for (int initialPosition = 0; initialPosition < totalSeats; initialPosition++) {
         // Вычисляем количество свободных мест слева и справа от позиции
         int freeSeatsToLeft = initialPosition;
         int freeSeatsToRight = totalSeats - initialPosition - 1;

         // Выбираем минимум из свободных мест слева и справа
         maxFreeSeats[initialPosition] = Math.min(freeSeatsToLeft, freeSeatsToRight);
      }

      // Находим позицию, которая максимизирует количество свободных мест
      int optimalInitialPosition = findMaxIndex(maxFreeSeats) + 1; // Добавляем 1, так как нумерация начинается с 1

      System.out.println("Оптимальное место для первого посетителя: " + optimalInitialPosition);
   }

   // Метод для нахождения индекса максимального значения в массиве
   private static int findMaxIndex(int[] array) {
      int maxIndex = 0;
      for (int i = 1; i < array.length; i++) {
         if (array[i] > array[maxIndex]) {
            maxIndex = i;
         }
      }
      return maxIndex;
   }
}
