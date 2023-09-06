package lesson17_lambdas_practice.task3;

import java.util.List;

@FunctionalInterface
public interface Utils {
   void copy(List<? extends LandAnimal> source, List<? super LandAnimal> destination);
}
