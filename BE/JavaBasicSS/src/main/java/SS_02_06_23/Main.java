package SS_02_06_23;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculator(12, 6, '/'));

        calculator1(20, 0, '*');
    }

    public static int calculator(int a, int b, char c) {
        int result = 0;

         if (c == '+') {
             result = a + b;
         } else if (c == '-') {
             result = a - b;
         } else if (c == '*') {
             result = a * b;
         } else if (c == '/') {
             result = a / b;
         } else {
             System.out.println("Error");
         }

        return result;
    }

    public static void calculator1(int a, int b, char c) {

        switch (c) {
            case '+':
                System.out.println(a + b);
                break;

            case '-':
                System.out.println(a - b);
                break;

            case '*':
                System.out.println(a * b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Нельзя делить на 0");
                } else {
                    System.out.println(a / b);
                }
                break;

            default:
                System.out.println("Error");
        }
    }
}
