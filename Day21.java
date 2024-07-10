import java.util.HashMap;
import java.util.Map;

public class Day21 {

    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        students.put(1, "Fortune");
        students.put(2, "Bob");
        students.put(3, "Kimtai");
        students.put(4, "David");
        students.put(5, "Eva");

        System.out.println("Name of student with roll number 3: " + students.get(3));

        int rollNumberToCheck = 4;
        if (students.containsKey(rollNumberToCheck)) {
            System.out.println("Roll number " + rollNumberToCheck + " exists in the HashMap.");
        } else {
            System.out.println("Roll number " + rollNumberToCheck + " does not exist in the HashMap.");
        }

        students.remove(2);
        System.out.println("Removed student with roll number 2.");

        System.out.println("Number of students in the HashMap: " + students.size());

        System.out.println("Student names using keySet:");
        for (Integer rollNumber : students.keySet()) {
            System.out.println("Roll number " + rollNumber + ": " + students.get(rollNumber));
        }

        System.out.println("Student names using entrySet:");
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Roll number " + entry.getKey() + ": " + entry.getValue());
        }
    }
}
