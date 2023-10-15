package lesson22_regex.task6;

import java.util.regex.Pattern;

public class RegexTEst {
   public static void main(String[] args) {

      System.out.println(checkString("A"));
      System.out.println(checkString(""));
      System.out.println(checkString("B"));
      System.out.println(checkString("C"));
      System.out.println(checkString("ABC"));
      System.out.println(checkString("CBA"));
      System.out.println(checkString("CAAAAAAABBBBBBBBCCCA"));
      System.out.println(checkString("CAAAAAAABBBBBBDBBCCCA"));
      System.out.println(checkString("EOPQ"));
      System.out.println(checkString("EOPQLJGLWKslgk"));
      System.out.println(checkString("abc"));
      System.out.println(checkString("abc!@#$%^&*()_+!@#$%^&*()_+!@#$%^&*()_+"));
      System.out.println(checkString("QGBAKJDGSBALSK"));
      System.out.println(checkString("QGBAKJDGSBALSKyz"));
      System.out.println(checkString("QGBAKJDGSBALSKas78645"));
   }

   public static boolean checkString(String source) {

//      String regex = "[ABC]+";
//      String regex = "[^ABC]+";
//      String regex = "[A-Z]+";
//      String regex = "[A-Xa-x]+";
      String regex = "[A-Xa-x3-8]+";

      Pattern pattern = Pattern.compile(regex);
      System.out.print("Проверяемая строка := " + source + ": " );

      return pattern.matcher(source).matches();
   }
}
