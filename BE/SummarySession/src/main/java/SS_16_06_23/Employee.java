package SS_16_06_23;

public class Employee {
   private int salary;
   private int hourlyRate;
   private int extraHour;

   public Employee(int salary, int hourlyRate, int extraHour) {
      this.salary = salary;
      this.hourlyRate = hourlyRate;
      this.extraHour = extraHour;
   }

   public void setSalary(int value) {
      salary = value;
   }

   public void setHourlyRate(int value) {
      hourlyRate = value;
   }

   public void setExtraHour(int value) {
      extraHour = value;
   }

   public int calculateSalary() {
      return salary + hourlyRate * extraHour;
   }
}
