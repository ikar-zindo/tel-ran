package test.les_1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertFalse;

@ExtendWith(MockitoExtension.class)
public class MyTest {

   public void start() {

   }

   public static boolean isStringLong(String input) {
      return input.length() > 5;
   }

   @Test
   public void test() {
      boolean result = isStringLong("abc");
      assertFalse(result);

   }
}
