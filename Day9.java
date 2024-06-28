import java.util.Scanner;

public class Day9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your percentage: ");
        int percentage = scanner.nextInt();

        char grade;
        int gradeRange = percentage / 10;

        switch (gradeRange) {
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }

        System.out.println("Your grade is: " + grade);

    }
}
