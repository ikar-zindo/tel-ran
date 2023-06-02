package SS_02_06_23;

public class Main2 {
    public static void main(String[] args) {
        Employee3 employee = new Employee3();
        employee.setBaseSalary(50000);
        employee.setExtraHours(20);
        employee.setHourlyRate(10);

        System.out.println(employee.getBaseSalary());
        System.out.println(employee.getExtraHours());
        System.out.println(employee.getHourlyRate());
    }
}
