import java.util.Random;

public class Day19_2 {
    public static void main(String[] args) {
        int min = 10;  
        int max = 20;  
        Random random = new Random();

        int randomNum = random.nextInt(max - min + 1) + min;
        //The +1 ensures that the upper bound is inclusive.
        //we add min to shift the range.This ensures that the final random number (randomNum) falls within the range.

        System.out.println("Random number between " + min + " and " + max + ": " + randomNum);
    }
}
