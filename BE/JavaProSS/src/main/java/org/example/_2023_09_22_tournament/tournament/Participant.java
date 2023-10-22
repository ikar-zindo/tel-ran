package org.example._2023_09_22_tournament.tournament;

import java.util.Objects;

public abstract class Participant {

   private String name;
   private int age;

   public Participant(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getAge() {
      return age;
   }

   public void setAge(int age) {
      this.age = age;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Participant that = (Participant) o;
      return age == that.age && Objects.equals(name, that.name);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, age);
   }

   @Override
   public String toString() {
      return getClass().getSimpleName() + "{" +
              "name='" + name + '\'' +
              ", age=" + age +
              '}';
   }
}
