package de.telran.g_280323_m_be_shop.logging;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectLogging {

   private final Logger LOGGER = LoggerFactory.getLogger(AspectLogging.class);

   @Pointcut("execution(* de.telran.g_280323_m_be_shop._3service.jpa.JpaProductService.add(..))")
   public void addProduct() {}

   @Before("addProduct()")
   public void beforeAddProduct(JoinPoint joinPoint) {
      Object[] args = joinPoint.getArgs();
      LOGGER.info("Вызван метод add() класса JpaProductService с параметром {}.", args[0]);
   }

   @After("addProduct()")
   public void afterAddProduct(JoinPoint joinPoint) {
      Object[] args = joinPoint.getArgs();
      LOGGER.info("Метод add() класса JpaProductService завершил работу. {}", args[0]);
   }

   @Pointcut("execution(* de.telran.g_280323_m_be_shop._4controllers.ProductController.add(..))")
   public void addProductInController() {}

   @AfterReturning("addProductInController()")
   public void afterReturnValue() {
      LOGGER.info("Метод add() класса ProductController успешно вернул значение."); // ProductController
   }

   @AfterThrowing("addProductInController()")
   public void afterThrowingException() {
      LOGGER.info("Метод add() класса ProductController выбросил исключение.");
   }

   @Pointcut("execution(* de.telran.g_280323_m_be_shop._3service.jpa.JpaProductService.getCount(..))")
   public void getProductsCount() {}

   @Around("getProductsCount()")
   public Object aroundGetProductsCount(ProceedingJoinPoint joinPoint) {
      LOGGER.info("Вызван метод getCount() класса JpaProductService.");

      try {
         Object result = joinPoint.proceed();
         LOGGER.info("Метод getCount() класса JpaProductService отработал с результатом {}.", result);
         return 777;
      } catch (Throwable e) {
         throw new RuntimeException(e);
      }
   }
}
