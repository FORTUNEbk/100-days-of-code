import java.util.Scanner;

public class Day10_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                continue; 
            }
            sum += i;
        }

        System.out.println("Sum of even integers from 1 to " + number + ": " + sum);
    }
}
