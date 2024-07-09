import java.util.HashSet;
import java.util.Set;

public class Day20 {

    public static void main(String[] args) {
        // Initialize a Set of String values and add items to it
        Set<String> stringSet = new HashSet<>();
        stringSet.add("Apple");
        stringSet.add("Banana");
        stringSet.add("Cherry");
        stringSet.add("Date");
        stringSet.add("Elderberry");

        // Check if a value exists in the Set
        String valueToCheck = "Cherry";
        if (stringSet.contains(valueToCheck)) {
            System.out.println(valueToCheck + " exists in the Set.");
        } else {
            System.out.println(valueToCheck + " does not exist in the Set.");
        }

        // Remove a value from the Set
        String valueToRemove = "Date";
        if (stringSet.remove(valueToRemove)) {
            System.out.println(valueToRemove + " was removed from the Set.");
        } else {
            System.out.println(valueToRemove + " was not found in the Set.");
        }

        // Print the number of values (size) in the Set
        System.out.println("Number of values in the Set: " + stringSet.size());

        // Print all the values one by one by looping through the Set
        System.out.println("Values in the Set:");
        for (String value : stringSet) {
            System.out.println(value);
        }

        // Remove all values from the Set
        stringSet.clear();
        System.out.println("All values removed from the Set. Set size: " + stringSet.size());
    }
}
