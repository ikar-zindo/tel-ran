package org.example._2023_09_15.tt_isIPCorrect;

import java.util.regex.Pattern;

public class RegexTest1 {

   public static boolean isIPCorrect(String ip) {

//      String regex = "[0-2][0-5]?[0-5]?[.][0-2][0-5]?[0-5]?[.][0-2][0-5]?[0-5]?[.][0-2][0-5]?[0-5]?";
//      Pattern pattern = Pattern.compile(regex);
//      Matcher matcher = pattern.matcher(ip);

      String regex = "((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

      return Pattern.matches(regex, ip);
   }

   public static boolean isIPCorr(String ip) {

      String[] numbers = ip.split("\\.");

      for (int i = 0; i < numbers.length; i++) {
         int result = Integer.parseInt(numbers[i]);

         if (result < 0 || result > 255) {
            return false;
         }
      }

      return true;
   }

   public static void main(String[] args) {

      String ip1 = "127.0.98.966";
      String ip2 = "127.0.0.0";
      String ip3 = "000.000.000.000";
      String ip4 = "125.152.251.215";

      System.out.println(isIPCorrect(ip1));
      System.out.println(isIPCorrect(ip2));
      System.out.println(isIPCorrect(ip3));
      System.out.println(isIPCorrect(ip4));

      System.out.println("=======================");

      System.out.println(isIPCorr(ip1));
      System.out.println(isIPCorr(ip2));
      System.out.println(isIPCorr(ip3));
      System.out.println(isIPCorr(ip4));
   }
}
