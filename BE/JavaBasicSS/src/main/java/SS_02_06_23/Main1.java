package SS_02_06_23;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        if (number < 0 ) {
            System.out.print("negative");
        } else if (number > 0) {
            System.out.print("positive and ");
            if (number % 2 == 0) {
                System.out.print("even");
            } else {
                System.out.print("odd");
            }
        } else {
            System.out.print("zero");
        }
    }
}
