package SeaBattle;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Player {

   private String name;
   private Field field;
   private List<Ship> ships = new ArrayList<>();

   // Player конструктор
   protected Player(String name, Field field) {
      this.name = name;
      this.field = field;
      shipInit();
   }

   // все возможные корабли
   private void shipInit() {

      ships.add(new Ship(4));

      ships.add(new Ship(3));
      ships.add(new Ship(3));

      ships.add(new Ship(2));
      ships.add(new Ship(2));
      ships.add(new Ship(2));

      ships.add(new Ship(1));
      ships.add(new Ship(1));
      ships.add(new Ship(1));
      ships.add(new Ship(1));
   }

   @Override
   public String toString() {
      return name;
   }
}
