import java.util.Random;

public class Day10_3 {
    public static void main(String[] args) {
        Random random = new Random();
        int num;

        while (true) {
            num = random.nextInt(100) + 1; 
            System.out.println("Generated number: " + num);
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println("Found a number divisible by both 5 and 7: " + num);
                break; 
            }
        }
    }
}
