public class StringReplacer {
    public static String replacePattern(String input, String pattern, String replacement) {
        if (input == null || pattern == null || replacement == null) {
            return input;
        }
        return input.replaceAll(pattern, replacement);
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog.";
        String pattern = "\\bfox\\b";
        String replacement = "cat";
        System.out.println(replacePattern(input, pattern, replacement)); 
    }
}
