import java.util.Random;

public class Day10_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int number;

        while (true) {
            number = random.nextInt(100) + 1; 
            System.out.println("Generated number: " + number);
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println("Found a number divisible by both 5 and 7: " + number);
                break; // Exit the loop
            }
        }
    }
}
