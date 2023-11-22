package de.telran.g_280323_m_be_shop.schedule;

import de.telran.g_280323_m_be_shop._1domain.entity.jpa.Task;
import de.telran.g_280323_m_be_shop._3service.jpa.TaskService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.DefaultManagedTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@Component
@EnableScheduling
@EnableAsync
@Aspect
public class ScheduleExecutor {

   // LOGGER
   private static final Logger LOGGER = LoggerFactory.getLogger(ScheduleExecutor.class);

   private TaskService service;

   public ScheduleExecutor(TaskService service) {
      this.service = service;
   }

   /**
    * =================================
    *          Start homework
    * =================================
    */

   // task 1
   /**
    * За основу я взял метод из предыдущего ДЗ, для того чтоб отследить выполняемые задачи.
    * АОП здесь очень даже кстати.
    * Таким образом будет отловлен каждый метод всего проекта.
    */

   //Deque
   private static final Deque<String> completedTasks = new ArrayDeque<>();

   @Pointcut("execution(* de.telran.g_280323_m_be_shop..*.*(..))")
   public void packageServiceMethods() {
   }

   @Before("packageServiceMethods()")
   public void beforePackageServiceMethods(JoinPoint joinPoint) {
      String className = joinPoint.getSignature().getDeclaringType().getName();
      String methodMan = joinPoint.getSignature().getName();
      Object[] args = joinPoint.getArgs();

      /**
       * Output array arguments args[],
       * arguments are array elements
       */
      StringBuilder argsString = new StringBuilder();
      if (args != null && args.length > 0) {
         for (Object arg : args) {
            argsString.append(arg).append(", ");
         }
         argsString.setLength(argsString.length() - 2);
      }

      completedTasks.offer("Call method := [" + methodMan + "] class := [" + className + "] args := [" + argsString + "]");
      if (completedTasks.size() > 5) {
         completedTasks.poll();
      }
   }

   /**
    * Asynchronous method to print the last five completed tasks
    */
   @Async
   public void printLastCompletedTasks() {
      System.out.println("============Last completed tasks:============");
      for (String task : completedTasks) {
         System.out.println(task);
      }
      System.out.println("=============================================");
   }

   /**
    * Displays the last five completed tasks every 30 seconds
    */
   @Scheduled(fixedRate = 30000) // Запуск каждые 30 секунд
   public void schedulePrintLastCompletedTasks() {
      printLastCompletedTasks();
   }

   // task 2

   /**
    * Committing adding a product to the database
    *
    * @param task transmitted message
    */
   public static void commitAddProduct(Task task) {
      TaskScheduler scheduler = new DefaultManagedTaskScheduler();
      scheduler.schedule(() -> LOGGER.info(task.getDescription()),
              new CronTrigger("15,45 * * * * *"));
   }

   /**
    * ==================================
    *             End homework
    * ==================================
    */

//   @Scheduled(fixedDelay = 3_000)
//   public void fixedDelayTask() {
//      Task task = service.createTask("Fixed delay task");
//      LOGGER.info(task.getDescription());
//   }

//   @Scheduled(fixedDelay = 5_000)
//   public void fixedDelayLingTimeTask() {
//
//      try {
//         Thread.sleep(3_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Fixed delay long time task 3_000");
//      LOGGER.info(task.getDescription());
//   }


//   @Scheduled(fixedDelay = 5_000)
//   public void fixedDelayLingTimeTask() {
//
//      try {
//         Thread.sleep(7_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Fixed delay long time task 5_000");
//      LOGGER.info(task.getDescription());
//   }


//   @Scheduled(fixedRate = 5_000)
//   public void fixedRateLingTimeTask() {
//
//      try {
//         Thread.sleep(3_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Fixed rate long time task 3_000");
//      LOGGER.info(task.getDescription());
//   }


//   @Scheduled(fixedRate = 5_000)
//   public void fixedRateLingTimeTask() {
//
//      try {
//         Thread.sleep(7_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Fixed rate long time task 7_000");
//      LOGGER.info(task.getDescription());
//   }


//   @Scheduled(fixedRate = 5_000)
//   @Async
//   public void fixedRateLingTimeAsyncTask() {
//
//      try {
//         Thread.sleep(7_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Fixed rate long time async task 7_000");
//      LOGGER.info(task.getDescription());
//   }


//   @Scheduled(fixedDelay = 5_000, initialDelay = 20_000)
//   public void initialDelayTask() {
//
//      try {
//         Thread.sleep(1_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Initial delay task");
//      LOGGER.info(task.getDescription());
//   }

   // fixedDelay = 2 часа - 7_200_000 -> PT02H
//   @Scheduled(fixedDelayString = "PT03S")
//   public void anotherDelayFormatTask() {
//
//      try {
//         Thread.sleep(1_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Another delay format task");
//      LOGGER.info(task.getDescription());
//   }


//   @Scheduled(fixedDelayString = "${interval}")
//   public void delayInPropertyTask() {
//
//      try {
//         Thread.sleep(1_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Delay in property task");
//      LOGGER.info(task.getDescription());
//   }


   // 0 15 9-17 * * MON-FRI - будет выполниться в 15 минут каждого часа с 9 до 17 с Пн по Пт
   // Задача, которая будет выполниться в 27 и 52 минуты каждого часа
//   @Scheduled(cron = "${cron-interval}")
//   public void cronExpressionTask() {
//
//      try {
//         Thread.sleep(1_000);
//
//      } catch (InterruptedException e) {
//         throw new RuntimeException(e);
//      }
//
//      Task task = service.createTask("Cron expression task");
//      LOGGER.info(task.getDescription());
//   }
   public static void executeScheduledTask(Task task) {
      TaskScheduler scheduler = new DefaultManagedTaskScheduler();

      scheduler.schedule(() -> LOGGER.info(task.getDescription()),
              new CronTrigger("0,10,20,30,40,50 * * * * *"));
   }

   public static void executeScheduledTaskOne(Task task) {
      TaskScheduler scheduler = new DefaultManagedTaskScheduler();
      Instant executionTime = Instant.now().plusSeconds(20);
      scheduler.schedule(() -> LOGGER.info(task.getDescription()),
              executionTime);
   }
}
