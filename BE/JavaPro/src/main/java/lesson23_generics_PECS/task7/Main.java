package lesson23_generics_PECS.task7;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      List<Car> commonParking = new ArrayList<>();

      List<Car> hondaGarage = new ArrayList<>();
      hondaGarage.add(new Honda());
      hondaGarage.add(new Honda());
      hondaGarage.add(new Honda());

      List<Car> audiGarage = new ArrayList<>();
      audiGarage.add(new Audi());
      audiGarage.add(new Audi());
      audiGarage.add(new Audi());

      VehicleUtils.move(hondaGarage, commonParking);
      VehicleUtils.move(audiGarage, commonParking);


      List<Opel> opelGarage = new ArrayList<>();
      opelGarage.add(new Opel());
      opelGarage.add(new Opel());
      opelGarage.add(new Opel());

      VehicleUtils.move(opelGarage, commonParking);

      System.out.println(commonParking);

      List<Opel> opelGarage1 = new ArrayList<>();
      opelGarage.add(new Opel());
      opelGarage.add(new Opel());
      opelGarage.add(new Opel());

      List<Vehicle> hangar = new ArrayList<>();

      VehicleUtils.move(opelGarage1, hangar);

      System.out.println(hangar);
   }
}
