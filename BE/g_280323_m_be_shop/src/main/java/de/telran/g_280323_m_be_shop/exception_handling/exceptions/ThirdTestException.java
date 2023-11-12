package de.telran.g_280323_m_be_shop.exception_handling.exceptions;

import de.telran.g_280323_m_be_shop.exception_handling.Response;
import org.springframework.http.ResponseEntity;

public class ThirdTestException extends RuntimeException {
   public ThirdTestException(String message) {
      super(message);
   }
}
