package SigmoidExamples;

public class SigmoidTwo {
   // S(x) = 1 / (1 + e^(-x))
   // рабочий код, но не стоит использовать в prod

   private double resultNeg, resultPow, resultSum, resultFinal;
   private double X;

   public SigmoidTwo(double x) {
      X = x;

      neg();
      pow();
      sum();
      div();

      System.out.println(resultFinal);
   }

   public double neg() {
      resultNeg = X * (-1);
      return resultNeg;
   }

   public double pow() {
      resultPow = Math.pow(Math.E, resultNeg);
      return resultPow;
   }

   public double sum() {
      resultSum = 1 + resultPow;
      return resultSum;
   }

   public double div() {
      resultFinal = 1 / resultSum;
      return resultFinal;
   }
}