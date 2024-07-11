import java.util.Stack;

public class Day22 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("apple");
        stack.push("banana");
        stack.push("orange");

        String removedItem = stack.pop();
        System.out.println("Removed item: " + removedItem);

        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        String valueToCheck = "banana";
        if (stack.contains(valueToCheck)) {
            System.out.println(valueToCheck + " is in the stack");
        } else {
            System.out.println(valueToCheck + " is not in the stack");
        }

        System.out.println("Stack size: " + stack.size());

        stack.clear();
        System.out.println("Stack is now empty: " + stack.isEmpty());
    }
}
