package org.example._2023_09_22_turnir.participants;

import com.github.javafaker.Faker;

import java.util.Random;

public class TeamGenerator {
      private static final Faker faker = new Faker();
      private static final Random random = new Random();
      private static int age = 0;

   public Team<Adult> listTeamAdultGenerate() {
      age = random.nextInt(21) + 30;

      Team<Adult> listTeam = new Team<>(faker.team().name());

      for (int i = 0; i < 4; i++) {
         listTeam.addNewParticipant(new Adult(faker.superhero().name(), age));
      }

      return listTeam;
   }

   public Team<Student> listTeamStudentGenerate() {
      age = random.nextInt(21) + 10;

      Team<Student> listTeam = new Team<>(faker.team().name());

      for (int i = 0; i < 4; i++) {
         listTeam.addNewParticipant(new Student(faker.funnyName().name(), age));
      }

      return listTeam;
   }

   public Team<Pupil> listTeamPupilGenerate() {
      age = random.nextInt(15) + 6;

      Team<Pupil> listTeam = new Team<>(faker.team().name());

      for (int i = 0; i < 4; i++) {
         listTeam.addNewParticipant(new Pupil(faker.pokemon().name(), age));
      }

      return listTeam;
   }
}
