import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a string");
        String text = scanner.nextLine();

        System.out.println("Input an Integer");
        int number = Integer.valueOf(scanner.nextLine());

        System.out.println("Input a double");
        double decimal = Double.valueOf(scanner.nextLine());

        System.out.println("Input a boolean");
        boolean value = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your text is: " + text);
        System.out.println("Your integer value is: " + number);
        System.out.println("Your double value is " + decimal);
        System.out.println("Your boolean value is: " + value);

        scanner.close();

    }

}
