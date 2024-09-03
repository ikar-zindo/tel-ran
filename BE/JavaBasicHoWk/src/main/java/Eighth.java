import java.util.Scanner;

public class Eighth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Choose a button (1-espresso, 2-americano, 3-cappuccino, 4-tea): ");
        int button = sc.nextInt();

        sc.close();

        switch (button) {

            case 1:
                System.out.println("Your selection espresso");
                System.out.println(getEspresso() + "\n" + drinkIsReady());
                break;

            case 2:
                System.out.println("Your selection americano");
                System.out.println(getAmericano());
                break;

            case 3:
                System.out.println("Your selection cappuccino");
                System.out.println(getCappuccino());
                break;

            case 4:
                System.out.println("Your selection tea");
                System.out.println(getTea());
                break;
                
            default:
                System.out.println("Error");
        }
    }

    public static String getEspresso() {
        return "\tespresso in process";
    }

    public static String getAmericano() {
        String result = getEspresso();
        result += "\n";
        result += getWater();
        result += "\n";
        result += drinkIsReady();

        return result;
    }

    public static String getCappuccino() {
        String result = getEspresso();
        result += "\n";
        result += "\tadding some foam milk";
        result += "\n";
        result += drinkIsReady();

        return result;
    }

    public static String getTea() {
        String result = "\tadding package";
        result += "\n";
        result += getWater();
        result += "\n";
        result += drinkIsReady();

        return result;
    }

    public static String getWater() {
        return "\tadding some water";
    }

    public static String drinkIsReady() {
        return "Your drink is ready";
    }
}
