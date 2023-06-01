package SwitchExamples;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls year of education [1..2]: ");
        int year = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter pls your branch [Berlin, Tel-Aviv, New-York]: ");
        String branch = sc.nextLine();
        sc.close();

        switch (branch) {
            case "Berlin":
                System.out.print("Branch Berlin");
                break;
            case "Tel-Aviv":
                System.out.print("Branch Tel-Aviv");
                break;
            case "New-York":
                System.out.print("Branch New-York");
                break;
            default:
                System.out.print("Select branch is wrong, ");
        }

        switch (year) {
            case 1:
                System.out.print(", year 1.");
                break;
            case 2:
                System.out.print(", year 2.");
                break;
            default:
                System.out.print("year of education is wrong.");

        }
    }
}
