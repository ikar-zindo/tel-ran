package SigmoidExample;

public class SigmoidThree {
   //      final 4 stage
   //         tmp4
   //          |
   // S(x) = 1 / tmp3

   //             3 stage
   //              tmp3
   //               |
   // S(x) = 1 / (1 + tmp2)

   //                2 stage
   //                 tmp2
   //                  |
   // S(x) = 1 / (1 + e^(tmp1))

   //                   1 stage
   //                    tmp1
   //                     |
   // S(x) = 1 / (1 + e^(-x))

   private double tmp4;

   public SigmoidThree(double x) {

      //длинный путь
//      double tmp1 = neg(x);
//      double tmp2 = pow(tmp1);
//      double tmp3 = sum(tmp2);
//      tmp4 = div(tmp3);

      //компактный путь
      tmp4 = div(sum(pow(neg(x))));

      printResult();
   }

   // ? = x * (-1)
   private double neg(double x) {
      return x * (-1);
   }

   private double pow(double q) {
      return Math.pow(Math.E, q);
   }

   private double sum(double w) {
      return 1 + w;
   }

   private double div(double e) {
      return 1 / e;
   }

   private String getPrintString() {
      return getClass().getName() + " = ";
   }

   public void printResult() {
      System.out.println(getPrintString() + tmp4);
   }
}