import java.util.Scanner;

public class Day10_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();

        int sumFor = 0;
        for (int i = 1; i <= n; i++) {
            sumFor += i;
        }
        System.out.println("Sum using for loop: " + sumFor);

        int sumWhile = 0;
        int i = 1;
        while (i <= n) {
            sumWhile += i;
            i++;
        }
        System.out.println("Sum using while loop: " + sumWhile);

        int sumDoWhile = 0;
        i = 1;
        do {
            sumDoWhile += i;
            i++;
        } while (i <= n);
        System.out.println("Sum using do-while loop: " + sumDoWhile);
    }
}
