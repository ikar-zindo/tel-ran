package SS_02_06_23;

public class Employee3 {
    private final int baseSalary;
    private final int extraHours;
    private final int hourlyRate;

    public Employee3(int baseSalary, int extraHours, int hourlyRate) {
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourlyRate = hourlyRate;
    }

    public int calculateTax() {
        return baseSalary + extraHours * hourlyRate;
    }
}
