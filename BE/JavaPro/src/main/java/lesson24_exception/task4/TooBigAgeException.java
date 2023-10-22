package lesson24_exception.task4;

public class TooBigAgeException extends Exception {
   public TooBigAgeException(String message) {
      super(message);
   }
}
