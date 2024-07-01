public class Day12 {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        stringBuffer.append(" ").append("World");
        System.out.println("StringBuffer: " + stringBuffer);

        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" ").append("World");
        System.out.println("StringBuilder: " + stringBuilder);
    }
}
