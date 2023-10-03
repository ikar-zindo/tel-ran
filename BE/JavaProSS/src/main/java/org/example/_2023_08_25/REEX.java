package org.example._2023_08_25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REEX {

   public static void main(String[] args) {

      String s = "War es ein Doppelgänger und Wagner-Chef Jewgeni Prigoschin " +
              "ist doch nicht@mail.ru tot? Oder saß er in dem zweiten Flugzeug, " +
              "das ebenfalls von Moskau nach St. Petersburg flog? " +
              "Wurde der Jet abgeschossen oder@gmail.com stürzte er wegen Defekten " +
              "oder menschlichem Versagen@yahoo.com in die Tiefe? Die Gerüchte um " +
              "die Absturzursache des Privatjets von Prigoschin häufen sich." +
              " Mittlerweile kursieren die verrücktesten Theorien.";

      String pat = "\\w+@\\w+\\.(com|ru)";
      Pattern pattern = Pattern.compile(pat);
      Matcher matcher = pattern.matcher(s);

      while (matcher.find()) {
         System.out.println(matcher.group());
      }

      System.out.println(getEmail(s));
   }

   public static List<String> getEmail (String s) {
      List<String> list = Arrays.asList(s.split(" "));
      List<String> list1 = new ArrayList<>();

      for (int i = 0; i < list.size(); i++) {
         if (list.get(i).contains("@") && list.get(i).contains(".")) {
            list1.add(list.get(i));
         }
      }

      return list1;
   }
}
