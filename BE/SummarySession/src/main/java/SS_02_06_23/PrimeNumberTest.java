package SS_02_06_23;

public class PrimeNumberTest {
    public static void main(String[] args) {

        int a = 20;

        calculatePrimeNumbers(300);
    }

    public static void calculatePrimeNumbers(int a) {
        for (int i = 1; i <= a; i++) {
            boolean check = false;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    check = true;
                    break;
                }
            }

            if (!check)
                System.out.println(i);
        }
    }
}
