package de.telran.g_280323_m_be_shop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLoggingProduct {

   private final Logger LOGGER = LoggerFactory.getLogger(AspectLoggingProduct.class);

   /**
    * Logger for JpaProductService.*(..) class
    */
   @Pointcut("execution(* de.telran.g_280323_m_be_shop._3service.jpa.JpaProductService.*(..)) && " +
           "!execution(* de.telran.g_280323_m_be_shop._3service.*.*(..))")
   public void productServiceMethods() {
   }

   /**
    * A
    * before calling methods of class JpaProductService.*(..)
    */
   @Before("productServiceMethods()")
   public void beforeProductServiceMethods(JoinPoint joinPoint) {
      productServiceMethodsExecution(joinPoint, "начал");
   }

   /**
    * B
    * after calling methods of class JpaProductService.*(..)
    */
   @After("productServiceMethods()")
   public void afterProductServiceMethods(JoinPoint joinPoint) {
      productServiceMethodsExecution(joinPoint, "завершил");
   }

   /**
    * Logger action
    * @param action method execution queue
    */
   public void productServiceMethodsExecution(JoinPoint joinPoint, String action) {
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

      String LOGGER_PREFIX = "MyLogger for JpaProductService.*(..):";

      if (args.length != 0) {
         LOGGER.info("{} {} {} с параметром := {}.", LOGGER_PREFIX, methodMan, action, argsString);
      } else {
         LOGGER.info("{} {} метод {} работу.", LOGGER_PREFIX, methodMan, action);
      }
   }
}
