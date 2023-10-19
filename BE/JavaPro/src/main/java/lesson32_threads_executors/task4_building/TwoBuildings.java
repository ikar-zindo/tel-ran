package lesson32_threads_executors.task4_building;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TwoBuildings {
   public static void main(String[] args) {

      // Компания располагает техникой для строительства двух объектов

      String[] stages = {"1. Проектная деятельность",
              "2. Начало строительных работ",
              "3. Окончание строительных работ",
              "4. Отделочные работы",
              "5 Сдача объекта"};

      ExecutorService service = Executors.newFixedThreadPool(2);

      service.execute(new Building("Berlin", stages, false));
      service.execute(new Building("Warsaw", stages, false));
      service.execute(new Building("Dublin", stages, false));
      service.execute(new Building("London", stages, false));

      service.shutdown();
   }
}
