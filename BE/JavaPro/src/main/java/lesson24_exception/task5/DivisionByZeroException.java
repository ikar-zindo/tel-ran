package lesson24_exception.task5;

public class DivisionByZeroException extends Exception {
   public DivisionByZeroException(String message) {
      super(message);
   }
}
