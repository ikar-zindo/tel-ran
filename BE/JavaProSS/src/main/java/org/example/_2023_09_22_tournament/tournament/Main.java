package org.example._2023_09_22_tournament.tournament;

public class Main {
   public static void main(String[] args) {

      /**
       * Начинаем турнир
       */
      Tournament tournament = new Tournament();
      System.out.println("*****************************");
      tournament.games();
      System.out.println("*****************************");
      tournament.showResultsBoard();
      System.out.println("*****************************");
      tournament.showTop3();
   }
}
