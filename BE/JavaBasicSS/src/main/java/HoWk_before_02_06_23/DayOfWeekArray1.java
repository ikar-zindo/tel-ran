package HoWk_before_02_06_23;

import java.util.Scanner;

public class DayOfWeekArray1 {
    public static void main(String[] args) {
        String[] days_of_week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner sc = new Scanner(System.in);
        int input;
        while (true) {
            System.out.print("Please enter your number [1-7]: ");
            input = sc.nextInt();
            if ((input - 1) >= 0 && (input - 1) <= 6) {
                System.out.println(days_of_week[input - 1]);
                break;
            } else System.out.println("Incorrect input. Try again.");
        }
        sc.close();
    }
}
