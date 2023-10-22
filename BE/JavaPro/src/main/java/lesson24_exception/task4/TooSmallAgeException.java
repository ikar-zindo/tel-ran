package lesson24_exception.task4;

public class TooSmallAgeException extends RuntimeException {
   public TooSmallAgeException(String message) {
      super(message);
   }
}
