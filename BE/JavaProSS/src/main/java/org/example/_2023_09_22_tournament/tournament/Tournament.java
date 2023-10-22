package org.example._2023_09_22_tournament.tournament;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tournament {

   // объявляем генератор команд
   private final TeamGenerator teamGenerator = new TeamGenerator();
   // Результаты игр
   protected final Map<String, Integer> resultsBoard = new HashMap<>();

   public Tournament() {
      // Команды Adults
      System.out.println("------------------- Adults -------------------");
      // Инициализация команд
      Team<? extends Participant> adultTeam1 = teamGenerator.teamGenerate(TypeParticipant.ADULT);
      System.out.println("===========================");
      Team<? extends Participant> adultTeam2 = teamGenerator.teamGenerate(TypeParticipant.ADULT);
      System.out.println("===========================");
      Team<? extends Participant> adultTeam3 = teamGenerator.teamGenerate(TypeParticipant.ADULT);


      // Команды Students
      System.out.println("------------------- Students -------------------");
      Team<? extends Participant> studentTeam1 = teamGenerator.teamGenerate(TypeParticipant.STUDENT);
      System.out.println("===========================");
      Team<? extends Participant> studentTeam2 = teamGenerator.teamGenerate(TypeParticipant.STUDENT);
      System.out.println("===========================");
      Team<? extends Participant> studentTeam3 = teamGenerator.teamGenerate(TypeParticipant.STUDENT);


      // Команды Pupils
      System.out.println("------------------- Pupils -------------------");
      Team<? extends Participant> pupilTeam1 = teamGenerator.teamGenerate(TypeParticipant.PUPIL);
      System.out.println("===========================");
      Team<? extends Participant> pupilTeam2 = teamGenerator.teamGenerate(TypeParticipant.PUPIL);
      System.out.println("===========================");
      Team<? extends Participant> pupilTeam3 = teamGenerator.teamGenerate(TypeParticipant.PUPIL);
   }

   // Метод вызова списка команд
   public List<Team> listOfTeams() {
      return teamGenerator.getListOfTeams();
   }

   // Проведение игр каждой команды с каждой командой
   public void games() {
      List<Team> listOfTeams = listOfTeams();

      for (int i = 0; i < listOfTeams.size(); i++) {
         for (int j = i + 1; j < listOfTeams.size(); j++) {
            Team teamA = listOfTeams.get(i);
            Team teamB = listOfTeams.get(j);

            addToResultsBoard(teamA.playWith(teamB));
         }
      }
   }

   // todo: реализовать реванш, если в top3() есть команды с одинаковым количеством очков
   public void revenge() {

   }

   // Метод добавления победителя на доску результатов
   private void addToResultsBoard(String winnerName) {
      int countWins = resultsBoard.getOrDefault(winnerName, 0);

      resultsBoard.put(winnerName, countWins + 1);
   }

   // Выводит доску результатов в отсортированном виде
   public void showResultsBoard() {
      Map<String, Integer> sortedResultsBoard = resultsBoard.entrySet()
              .stream()
              .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

      for (Map.Entry<String, Integer> winner : sortedResultsBoard.entrySet()) {
         System.out.println(winner.getKey() + ": " + winner.getValue());
      }
   }

   // Показать топ 3 команды
   public void showTop3() {
      Map<String, Integer> sortedResultsBoard = resultsBoard.entrySet()
              .stream()
              .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
              .limit(3)
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

      System.out.println("TOP 3:");
      for (Map.Entry<String, Integer> winner : sortedResultsBoard.entrySet()) {
         System.out.println(winner.getKey() + ": " + winner.getValue());
      }
   }
}
