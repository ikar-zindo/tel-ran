package SigmoidExample;

public class SigmoidThree {
   //         tmp4
   //          |
   // S(x) = 1 / (1 + e^(-x))
   //              tmp3
   //               |
   // S(x) = 1 / (1 + e^(-x))
   //                 tmp2
   //                  |
   // S(x) = 1 / (1 + e^(-x))
   //                    tmp1
   //                     |
   // S(x) = 1 / (1 + e^(-x))
   // рабочий код, но не стоит использовать в prod

   public SigmoidThree(double x) {

      double tmp1 = neg(x);
      double tmp2 = pow(tmp1);
      double tmp3 = sum(tmp2);
      double tmp4 = div(tmp3);

      System.out.println(getClass().getName() + " = " + tmp4);
   }

   // ? = x * (-1)
   public double neg(double x) {
      return x * (-1);
   }

   public double pow(double q) {
      return Math.pow(Math.E, q);
   }

   public double sum(double w) {
      return 1 + w;
   }

   public double div(double e) {
      return 1 / e;
   }
}
