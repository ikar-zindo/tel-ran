package lesson15.task3;

import java.util.ArrayList;
import java.util.List;

public class Planet {

   private String name;
   private List<Satellite> satellites = new ArrayList<>();

   public Planet(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void addSatellite(Satellite satellite) {
      satellites.add(satellite);
   }
}
