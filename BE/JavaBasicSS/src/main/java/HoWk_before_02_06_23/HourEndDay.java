package HoWk_before_02_06_23;

import java.util.Random;

public class HourEndDay {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(28801);

        int hour = n / 3600;

        switch (n) {
            case 1:
                System.out.println("Before the end of the workday 1 second remaining \n");
                break;
            default:
                System.out.println("Before the end of the workday " + n + " seconds remaining \n");
        }

        switch (hour) {
            case 7:
                System.out.println("7 hours");
                break;
            case 6:
                System.out.println("6 hours");
                break;
            case 5:
                System.out.println("5 hours");
                break;
            case 4:
                System.out.println("4 hours");
                break;
            case 3:
                System.out.println("3 hours");
                break;
            case 2:
                System.out.println("2 hours");
                break;
            case 1:
                System.out.println("1 hours");
                break;
            default:
                System.out.println("less than 1 hour");
                break;
        }
    }
}
