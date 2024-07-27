public class DivisionCalculator {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = divide(num1, num2);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}
