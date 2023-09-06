package lesson17_lambdas_practice.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
   public static void main(String[] args) {

      // Функуия, которая корирует объкты из одной коллекции в другую коллекцию.

      List<Cheetah> cheetahs = new ArrayList<>();

      cheetahs.add(new Cheetah());
      cheetahs.add(new Cheetah());
      cheetahs.add(new Cheetah());

      List<Cow> cows = new ArrayList<>();

      cows.add(new Cow());
      cows.add(new Cow());
      cows.add(new Cow());

      List<Animal> animals = new ArrayList<>();

      AnimalUtils.copy(cheetahs, animals);
      AnimalUtils.copy(cows, animals);

      for (Animal animal : animals) {
         animal.voice();
      }

//      AnimalUtils.copy(animals, cheetahs);
   }
}
