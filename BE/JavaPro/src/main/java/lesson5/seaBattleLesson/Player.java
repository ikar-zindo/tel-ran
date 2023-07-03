package lesson5.seaBattleLesson;

public class Player {

   private String name;
   private Field field;

   public Player(String name, Field field) {
      this.name = name;
      this.field = field;
   }

   public String getName() {
      return name;
   }

   public Field getField() {
      return field;
   }
}
