package de.telran.g_280323_m_be_shop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * Андрей, сделал всё аналогично, как для класса JpaProductService.*(..),
 * в JpaProductService.*(..) всё логируется согласно заданию,
 * но здесь для целого пекеджа LOGGER не выводится.
 * Учёл что, они могут пересекаться, но это ничего не изменило.
 */
@Aspect
@Component
public class AspectLoggingService {

   private final Logger LOGGER = LoggerFactory.getLogger(AspectLoggingService.class);

   /**
    * Logger for package Service
    */
   @Pointcut("execution(* de.telran.g_280323_m_be_shop._3service..*.*(..))")
   public void packageServiceMethods() {}

   /**
    * before calling methods of package service..*(..)
    */
   @Before("packageServiceMethods()")
   public void beforePackageServiceMethods(JoinPoint joinPoint) {
      packageServiceMethodsExecution(joinPoint, "начал работу");
   }

   /**
    * after calling methods of package service..*(..)
    */
   @After("packageServiceMethods()")
   public void afterPackageServiceMethods(JoinPoint joinPoint) {
      packageServiceMethodsExecution(joinPoint, "завершил работу");
   }

   /**
    * method returned value of package service..*(..)
    */
   @AfterReturning("packageServiceMethods()")
   public void afterReturningPackageServiceMethods(JoinPoint joinPoint) {
      packageServiceMethodsExecution(joinPoint, "вернул значение");
   }

   /**
    * the method threw an exception of package service..*(..)
    */
   @AfterThrowing("packageServiceMethods()")
   public void afterThrowingReturningPackageServiceMethods(JoinPoint joinPoint) {
      packageServiceMethodsExecution(joinPoint, "выбросил исключение");
   }

   /**
    * Logger action
    * @param action method execution queue
    */
   public void packageServiceMethodsExecution(JoinPoint joinPoint, String action) {
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

      String LOGGER_PREFIX = "MyLogger for service..*(..):";

//      if (args.length != 0) {
//         LOGGER.info("{} метод {} класса {} с параметром {} {}", LOGGER_PREFIX, methodMan, className, args, action);
//      } else if ("выбросил исключение".equals(action)) {
//         LOGGER.info("{} метод {} класса {} с параметром {} {}", LOGGER_PREFIX, methodMan, className, args, action);
//      } else {
//         LOGGER.info("{} метод {} класса {} {}.", LOGGER_PREFIX, className, methodMan, action);
//      }
   }
}
