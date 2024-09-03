package SeaBattle;

import lombok.AllArgsConstructor;

import java.util.Scanner;

public class Game {

   private String name;
   private final Player[] players;

   public Game(String name) {
      this.name = name;
      players = new Player[2];

      System.out.println("Игра для двух человек: " + name);




   }

   // add 2 new players
   private void addPlayers() {

//      Scanner scanner = new Scanner(System.in);

//      System.out.print("Игрок №1, имя: ");
      players[0] = new Player("pl_1", new Field());

//      System.out.print("Игрок №2, имя: ");
      players[1] = new Player("pl_2", new Field());

      System.out.println("Играет " + players[0] + " против " + players[1]);
   }

   // инициализация поля
   private void fieldInitiation() {

      System.out.println("Поле игрока" + players[0]);
      players[0].getField().showField();

      System.out.println("Поле игрока" + players[1]);
      players[1].getField().showField();
   }



   // играй
   protected void playing() {
      addPlayers();
      fieldInitiation();
   }
}
