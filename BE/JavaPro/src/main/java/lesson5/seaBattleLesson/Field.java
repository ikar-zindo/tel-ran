package lesson5.seaBattleLesson;

import java.util.ArrayList;
import java.util.List;

public class Field {

   private char[][] field;
   private char emptyCell = '.';
   private char shipCell = 'O';
   private char destroyedShip = 'X';
   private char missedShotCell = '*';
   private List<Ship> ships = new ArrayList<>();
//   private Ship[] ships = new Ship[10];

   public Field() {
      field = new char[10][10];
      init();

   }

   // Инициализация поля
   private void init() {

      for (int i = 0; i < field.length; i++) {
         for (int j = 0; j < field.length; j++) {
            field[i][j] = emptyCell;
         }
      }
   }

   // Вывод поля в консоль
   public void repaint(boolean forOpponent) {
      /*
      TODO переледать поле для себя и для противника
      если forOpponent - ture, нужно отображаьб поле без неподбитых кораблей
      если forOpponent - false, нужно отображать все символы
       */

      for (char[] row : field) {
         for (char cell : row)
            System.out.print(cell + " ");
         System.out.println();
      }
   }
}
