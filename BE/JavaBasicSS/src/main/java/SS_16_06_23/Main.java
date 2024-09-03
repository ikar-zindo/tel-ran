package SS_16_06_23;

public class Main {
   public static void main(String[] args) {

      var employee = new Employee(50000, 20, 10);

      employee.setExtraHour(50);
      employee.setHourlyRate(100);

      System.out.println(employee.calculateSalary());
   }
}
