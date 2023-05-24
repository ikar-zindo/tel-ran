package SigmoidExample;

public class SigmoidOne {
   // S(x) = 1 / (1 + e^(-x))

   private double resultNeg, resultPow, resultSum, resultFinal;
   private final double X;

   public SigmoidOne(double x) {
      X = x;

      neg();
      pow();
      sum();
      div();

      printResult();
   }

   public void neg() {
      resultNeg = X * (-1);
   }
   public void pow() {
      resultPow = Math.pow(Math.E, resultNeg);
   }
   public void sum() {
      resultSum = 1 + resultPow;
   }
   public void div() {
      resultFinal = 1 / resultSum;
   }

   public double getResultFinal() {
      return resultFinal;
   }

   public void printResult() {
      System.out.println(getClass().getName() + " = " + resultFinal);
   }
}