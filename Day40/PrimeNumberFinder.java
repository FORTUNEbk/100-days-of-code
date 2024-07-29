import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PrimeNumberFinder {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        ExecutorService executor = Executors.newFixedThreadPool(4); 

        for (Integer number : numbers) {
            executor.submit(() -> {
                if (isPrime(number)) {
                    System.out.println(number + " is a prime number.");
                }
            });
        }

        executor.shutdown(); 
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
