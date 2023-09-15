package org.example._2023_09_15.refactor_code.dryKissYagni;


public class CircleQ {
   private double radius;

   public double calculateArea() {
      double PIRADIUS = Math.PI * radius;

      return PIRADIUS * radius;
   }

   public double calculateCircumference() {
      return 2 * Math.PI * radius;
   }
}

class CircleQRefactor {

   public double calculateArea(int radius) {
      return Math.PI * radius * radius;
   }

   public double calculateCircumference(int radius) {
      return 2 * Math.PI * radius;
   }
}
