package SS_02_06_23;

public class Employee3 {
    private int baseSalary;
    public int extraHours;
    public int hourlyRate;

    public int getBaseSalary(){
        return baseSalary;
    }

    public int getExtraHours() {
        return extraHours;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setBaseSalary(int baseSalary){
        if (baseSalary<=0){System.out.println("wrong number");
            return;}
        this.baseSalary = baseSalary;
    }

    public void setExtraHours(int extraHours) {
        if (extraHours <= 0) {
            System.out.println("wrong number");
        }
        this.extraHours = extraHours;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) {
            System.out.println("wrong number");
        }
        this.hourlyRate = hourlyRate;
    }

    public int calculateTax(){
        return baseSalary+extraHours*hourlyRate;
    }
}
