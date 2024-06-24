import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Blank is not accepted");
            scanner.close();
            return;
        }

        int age = Integer.parseInt(input);

        if (age < 150) {
            System.out.println("You are " + age + " years old!");
        } else {
            System.out.println("Impossible");
            scanner.close();
            return;
        }

        age++;  
        System.out.println("This is an increment of your age: " + age);

        age--;
        long factorial = 1;
        for (int i = 1; i <= age; i++) {
            factorial *= i;
        }

        int sum = 0;
        int subtraction = 0;
        for (int k = 1; k <= age; k++) {
            sum += k;
            subtraction -= k;
        }

        double average = (double) sum / age;

        String text = "";
        if (age % 2 == 0) {
            text = "Your age  is an even number";
        }else{
            text = "Your age is an odd number";
        }

        System.out.println("The factorial of " + age + " is: " + factorial);
        System.out.println("The sum of values below and equal to your age is: " + sum);
        System.out.println("The subtraction of values below and equal to your age is: " + subtraction);
        System.out.println("The average of values below and equal to your age is: " + average);
        System.out.println(text);

        scanner.close();
    }
}
