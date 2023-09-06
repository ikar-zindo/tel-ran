package lesson17_lambdas_practice.task3;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
   public static void main(String[] args) {

      List<Cheetah> cheetahs = new ArrayList<>();

      cheetahs.add(new Cheetah());
      cheetahs.add(new Cheetah());
      cheetahs.add(new Cheetah());

      List<Cow> cows = new ArrayList<>();

      cows.add(new Cow());
      cows.add(new Cow());
      cows.add(new Cow());

      List<Animal> animals = new ArrayList<>();

      Utils utils =(x, y) -> y.addAll(x);

      utils.copy(cows, animals);
      utils.copy(cheetahs, animals);

      for (Animal animal : animals) {
         animal.voice();
      }
   }
}
