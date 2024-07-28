import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> filteredStrings = strings.stream()
                                              .filter(s -> s.startsWith("b"))
                                              .collect(Collectors.toList());
        filteredStrings.forEach(System.out::println);
    }
}
