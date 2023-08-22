package lesson15.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Star {

   private String name;
   private List<Planet> planets = new ArrayList<>();
   private List<Asteroid> asteroids = new ArrayList<>();
   private static Star sun;

   private Star(String name) {
      this.name = name;
   }

   public static Star getInstance() {
      if (sun == null) {
         sun = new Star("Sun");
      }
      return sun;
   }
   public String getName() {
      return name;
   }

   public void addPlanet(Planet planet) {
      planets.add(planet);
   }

   public void addAsteroid(Asteroid asteroid) {
      asteroids.add(asteroid);
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Star star = (Star) o;
      return Objects.equals(name, star.name) && Objects.equals(planets, star.planets) && Objects.equals(asteroids, star.asteroids);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, planets, asteroids);
   }
}
