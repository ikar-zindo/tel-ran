package org.example._2023_09_15.refactor_code.dryKissYagni;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Division by zero");
        }
    }
}

class CalculatorRefactor {

   int a, b;

   public int add() {
      return a + b;
   }

   public int subtract() {
      return a - b;
   }

   public int multiply() {
      return a * b;
   }

   public int divide() {
      if (b != 0) {
         return a / b;
      } else {
         throw new ArithmeticException("Division by zero");
      }
   }
}