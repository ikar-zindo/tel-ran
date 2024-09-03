package HoWk_before_02_06_23;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        Scanner sc = new Scanner(System.in);
        int day;

        while (true) {
            System.out.print("Введите число от 1 до 7 (номер для недели): ");
            day = sc.nextInt();

            if (day >= 1 && day <= 7) {
                System.out.println(days[day - 1]);
                break;
            } else {
                System.out.println("Число не входит в диапазон.");
            }
        }
        sc.close();
    }
}
