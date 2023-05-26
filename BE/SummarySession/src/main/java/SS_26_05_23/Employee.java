package SS_26_05_23;

public class Employee {
   private int baseSalary;
   private int hourlyRate;
   private int extraHours;

   public Employee (int b, int h, int e) {
      this.baseSalary = baseSalary;
      this.hourlyRate = hourlyRate;
      this.extraHours = extraHours;
   }

   public int calculateSalary() {
      return baseSalary + hourlyRate * extraHours;
   }
}