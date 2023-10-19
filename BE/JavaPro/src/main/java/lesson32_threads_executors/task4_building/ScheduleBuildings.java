package lesson32_threads_executors.task4_building;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleBuildings {
   public static void main(String[] args) {

      // Компания располагает техникой для строительства всех объектов одновременно.
      // Строительство должно начинаться в запланированное время.

      String[] stages = {"1. Проектная деятельность",
              "2. Начало строительных работ",
              "3. Окончание строительных работ",
              "4. Отделочные работы",
              "5. Сдача объекта"};

//        ExecutorService service = Executors.newCachedThreadPool();

      ScheduledExecutorService service = Executors.newScheduledThreadPool(4);

      // Метод execute нам не подходит, т.к. мы хотим запускать задачи в запланированное время
//        service.execute(new Building("Berlin", stages, false));
//        service.execute(new Building("Dusseldorf", stages, false));
//        service.execute(new Building("Essen", stages, false));
//        service.execute(new Building("Dortmund", stages, false));

      System.out.println(new Date());

      service.schedule(new Building("Berlin", stages, true), 3, TimeUnit.SECONDS);
      service.schedule(new Building("Dusseldorf", stages, true), 4, TimeUnit.SECONDS);
      service.schedule(new Building("Essen", stages, true), 5, TimeUnit.SECONDS);
      service.schedule(new Building("Dortmund", stages, true), 9, TimeUnit.SECONDS);

      service.shutdown();
   }
}
