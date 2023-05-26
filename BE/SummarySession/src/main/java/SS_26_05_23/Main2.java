package SS_26_05_23;

public class Main2 {
   public static void main(String[] args) {

      Employee employee1 = new Employee(50_000, 20, 10);
      System.out.println(employee1.calculateSalary());

      Box box = new Box(0, 1, 2);
      System.out.println(box.calculateValue());

   }
}