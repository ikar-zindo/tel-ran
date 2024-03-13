package lesson25_testing.task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ServiceTest {

   private Service service;

   @Before
   public void init() {
      service = new Service();

      OuterService outerService = Mockito.mock(OuterService.class);
      Mockito.when(outerService.getNumber()).thenReturn(5);

      service.setOuterService(outerService);
   }

   @Test
   public void checkSum() {
      int actual = service.calculate(9);
      // Если внешний сервис вернёт 0 -> 7
      // Если внешний сервис вернёт 5 -> 9

      int expected = 14;
      Assert.assertEquals(expected, actual);
   }
}