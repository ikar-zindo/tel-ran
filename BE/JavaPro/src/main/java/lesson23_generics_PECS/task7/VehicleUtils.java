package lesson23_generics_PECS.task7;

import java.util.List;

public class VehicleUtils {

   // PECS - Producer extends Consumer super
   public static void move(List<? extends Car> from, List<? super Car> to) {
      to.addAll(from);
      from.clear();
   }
}
