package org.example._2023_09_22_turnir.participants;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Tournament {

   // Инициализация команд
   private final Team<Adult> adultTeam1;
   private final Team<Adult> adultTeam2;
   private final Team<Adult> adultTeam3;
   private final Team<Student> studentTeam1;
   private final Team<Student> studentTeam2;
   private final Team<Student> studentTeam3;
   private final Team<Pupil> pupilTeam1;
   private final Team<Pupil> pupilTeam2;
   private final Team<Pupil> pupilTeam3;

   // Результаты игр
   protected final Map<String, Integer> resultsBoard = new HashMap<>();

   public Tournament() {
      // Объявляем генератор команд
      TeamGenerator teamGenerator = new TeamGenerator();

      // Команды Adults
      System.out.println("------------------- Adults -------------------");
      adultTeam1 = teamGenerator.listTeamAdultGenerate();
      System.out.println("===========================");
      adultTeam2 = teamGenerator.listTeamAdultGenerate();
      System.out.println("===========================");
      adultTeam3 = teamGenerator.listTeamAdultGenerate();


      // Команды Students
      System.out.println("------------------- Students -------------------");
      studentTeam1 = teamGenerator.listTeamStudentGenerate();
      System.out.println("===========================");
      studentTeam2 = teamGenerator.listTeamStudentGenerate();
      System.out.println("===========================");
      studentTeam3 = teamGenerator.listTeamStudentGenerate();


      // Команды Pupils
      System.out.println("------------------- Pupils -------------------");
      pupilTeam1 = teamGenerator.listTeamPupilGenerate();
      System.out.println("===========================");
      pupilTeam2 = teamGenerator.listTeamPupilGenerate();
      System.out.println("===========================");
      pupilTeam3 = teamGenerator.listTeamPupilGenerate();
   }

   public void listWinners() {
      // Выводом победителя игры на экран и добавляем его на доску результатов
      addToResultsBoard(adultTeam1.playWith(adultTeam2));
      addToResultsBoard(adultTeam1.playWith(adultTeam3));
      addToResultsBoard(adultTeam2.playWith(adultTeam3));

      addToResultsBoard(studentTeam1.playWith(studentTeam2));
      addToResultsBoard(studentTeam1.playWith(studentTeam3));
      addToResultsBoard(studentTeam2.playWith(studentTeam3));

      addToResultsBoard(pupilTeam1.playWith(pupilTeam2));
      addToResultsBoard(pupilTeam1.playWith(pupilTeam3));
      addToResultsBoard(pupilTeam2.playWith(pupilTeam3));
   }

   private void addToResultsBoard(String winnerName) {

      int countWins = resultsBoard.getOrDefault(winnerName, 0);

      resultsBoard.put(winnerName, countWins + 1);
   }

   public void showResultsBoard() {
      // Выводит доску результатов в отсортированном виде
      Map<String, Integer> sortedResultsBoard = resultsBoard.entrySet()
              .stream()
              .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

      for (Map.Entry<String, Integer> winner : sortedResultsBoard.entrySet()) {
         System.out.println(winner.getKey() + ": " + winner.getValue());
      }
   }

   public void showTop3() {
      // Показать топ 3 команды
      Map<String, Integer> sortedResultsBoard = resultsBoard.entrySet()
              .stream()
              .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
              .limit(3)
              .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

      System.out.println("Top 3:");
      for (Map.Entry<String, Integer> winner : sortedResultsBoard.entrySet()) {
         System.out.println(winner.getKey() + ": " + winner.getValue());
      }
   }
}
