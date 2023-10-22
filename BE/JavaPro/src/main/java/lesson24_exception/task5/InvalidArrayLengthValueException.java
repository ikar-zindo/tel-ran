package lesson24_exception.task5;

public class InvalidArrayLengthValueException extends Exception {
   public InvalidArrayLengthValueException(String message) {
      super(message);
   }
}
