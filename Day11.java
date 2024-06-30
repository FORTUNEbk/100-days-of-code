public class Day11 {

    public static int stringLength(String text) {
        return text.length();
    }

    public static String stringConcatenation(String s1, String s2) {
        return s1 + s2;
    }

    public static boolean stringComparison(String s1, String s2) {
        return s1.equals(s2);
    }

    public static String stringToUppercase(String text) {
        return text.toUpperCase();
    }

    public static String stringToLowercase(String text) {
        return text.toLowerCase();
    }

    public static String stringTrimming(String text) {
        return text.trim();
    }

    public static String substringExtraction(String text, int start, int end) {
        return text.substring(start, end);
    }

    public static String[] stringSplitting(String text, String delimiter) {
        return text.split(delimiter);
    }

    public static String stringReversal(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static boolean stringSearching(String text, String substring) {
        return text.contains(substring);
    }

    public static void main(String[] args) {
        String str1 = " Hello, World! ";
        String str2 = "Java";
        String str3 = "hello";
        String str4 = "HELLO";

        System.out.println("String Length: " + stringLength(str1));

        System.out.println("String Concatenation: " + stringConcatenation(str1, str2));

        System.out.println("String Comparison (str1 vs str2): " + stringComparison(str1, str2));
        System.out.println("String Comparison (str3 vs str4): " + stringComparison(str3.toLowerCase(), str4.toLowerCase()));

        System.out.println("String to Uppercase: " + stringToUppercase(str1));
        System.out.println("String to Lowercase: " + stringToLowercase(str1));

        System.out.println("String Trimming: " + stringTrimming(str1));

        System.out.println("Substring Extraction: " + substringExtraction(str1, 1, 6));

        String[] splitStrings = stringSplitting(str1, ",");
        System.out.print("String Splitting: ");
        for (String splitString : splitStrings) {
            System.out.print(splitString + " ");
        }
        System.out.println();

        System.out.println("String Reversal: " + stringReversal(str1));

        System.out.println("String Searching ('World' in str1): " + stringSearching(str1, "World"));
        System.out.println("String Searching ('Java' in str1): " + stringSearching(str1, "Java"));
    }
}
