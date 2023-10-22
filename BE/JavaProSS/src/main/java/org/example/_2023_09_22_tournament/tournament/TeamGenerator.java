package org.example._2023_09_22_tournament.tournament;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TeamGenerator {
   private static final Faker faker = new Faker();
   private static final Random random = new Random();
   private static int age = 0;
   private final List<Team> listOfTeams = new ArrayList<>();

   public <T extends Participant> Team<? extends Participant> teamGenerate(TypeParticipant typeParticipant) {
      Team listTeam = new Team(faker.team().name());

      switch (typeParticipant) {
         // Генератор команд Adult
         case ADULT -> {
            for (int i = 0; i < 4; i++) {
               age = random.nextInt(21) + 30;
               listTeam.addNewParticipant(new Adult(faker.superhero().name(), age));
            }
         }

         // Генератор команд Student
         case STUDENT -> {
            for (int i = 0; i < 4; i++) {
               age = random.nextInt(21) + 30;
               listTeam.addNewParticipant(new Student(faker.superhero().name(), age));
            }
         }

         // Генератор команд Pupil
         case PUPIL -> {
            for (int i = 0; i < 4; i++) {
               age = random.nextInt(21) + 30;
               listTeam.addNewParticipant(new Pupil(faker.superhero().name(), age));
            }
         }
      }

      // Добавляем команду в список всех участников турнира
      addToListOfTeams(listTeam);

      return listTeam;
   }

   // Метод, который добавляет команду в список участников турнира
   private void addToListOfTeams(Team<? extends Participant> listTeam) {
      listOfTeams.add(listTeam);
   }

   public List<Team> getListOfTeams() {
      return listOfTeams;
   }
}
