package lesson31_concurrent_description.task5_phaser;

import java.util.concurrent.Phaser;

public class PhaserTest {
   public static void main(String[] args) {

      Phaser phaser = new Phaser();

      new Competitor("Иван", 1000, phaser);
      new Competitor("Моника", 1000, phaser);
      new Competitor("Кая", 1000, phaser);
   }
}
