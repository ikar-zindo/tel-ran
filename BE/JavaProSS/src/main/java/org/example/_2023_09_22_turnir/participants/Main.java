package org.example._2023_09_22_turnir.participants;

public class Main {
   public static void main(String[] args) {

      Tournament tournament = new Tournament();
      System.out.println("*****************************");
      tournament.listWinners();
      System.out.println("*****************************");
      tournament.showResultsBoard();
      System.out.println("*****************************");
      tournament.showTop3();
   }
}
