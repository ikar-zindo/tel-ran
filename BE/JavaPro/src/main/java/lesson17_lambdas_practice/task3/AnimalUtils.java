package lesson17_lambdas_practice.task3;

import java.util.List;

public class AnimalUtils {

   // PECS -> Producer Extends Consumer Super
   public static void copy(List<? extends LandAnimal> source, List<? super LandAnimal> destination) {
      destination.addAll(source);
   }
}
