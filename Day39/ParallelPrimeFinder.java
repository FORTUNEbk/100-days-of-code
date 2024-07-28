import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelPrimeFinder {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);
        List<Integer> primes = numbers.parallelStream()
                .filter(ParallelPrimeFinder::isPrime)
                .collect(Collectors.toList());
        primes.forEach(System.out::println);
    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
