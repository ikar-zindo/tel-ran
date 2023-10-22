package org.example._2023_09_22_tournament.tournament;

import java.util.*;

public class Team<T extends Participant> {

   private final String name;
   private final List<T> participantList = new ArrayList<>();

   public Team(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void addNewParticipant(T participant) {
      participantList.add(participant);
      System.out.println("Participant: " + participant + " was added to the team [" + name + "]");
   }

   public String playWith(Team<? extends Participant> team) {
      // Выводит название команды победителя игры и возвращает её имя
      String winnerName;
      Random random = new Random();

      int i = random.nextInt(2);

      if (i == 0) {
         winnerName = this.name;
      } else {
         winnerName = team.name;
      }

//      System.out.println(winnerName);

      return winnerName;
   }
}
