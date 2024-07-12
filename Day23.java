import java.util.LinkedList;
import java.util.Queue;

public class Day23 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.add("Andreah");
        queue.add("Evelyn");
        queue.add("Tatiana");

        System.out.println("Queue: " + queue);

        String removedElement = queue.poll();
        System.out.println("Removed element: " + removedElement);

        System.out.println("Queue after removal: " + queue);

        String headElement = queue.peek();
        System.out.println("Head element (without removal): " + headElement);

        String valueToCheck = "Andreah";
        boolean containsValue = queue.contains(valueToCheck);
        System.out.println("Does the Queue contain \"" + valueToCheck + "\": " + containsValue);

        int queueSize = queue.size();
        System.out.println("Number of elements in the Queue: " + queueSize);

        queue.clear();
        System.out.println("Queue after removing all elements: " + queue);
    }
}
