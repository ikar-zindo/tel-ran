package lesson5.seaBattleLesson;

public class Ship {

   private int decks;
   public boolean isVertical;

   public Ship(int decks) {
      this.decks = decks;
   }

   public int getDecks() {
      return decks;
   }

   public boolean isVertical() {
      return isVertical;
   }

   public void setVertical(boolean vertical) {
      isVertical = vertical;
   }
}
