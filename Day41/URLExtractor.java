import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class URLExtractor {
    private static final String URL_REGEX = 
        "\\b((?:https?|ftp):\\/\\/[^\\s/$.?#].[^\\s]*)";
    private static final Pattern URL_PATTERN = Pattern.compile(URL_REGEX);

    public static List<String> extractURLs(String text) {
        List<String> urls = new ArrayList<>();
        if (text == null) {
            return urls;
        }
        Matcher matcher = URL_PATTERN.matcher(text);
        while (matcher.find()) {
            urls.add(matcher.group());
        }
        return urls;
    }

    public static void main(String[] args) {
        String text = "Visit https://www.example.com or contact us at http://contact.example.com for more info.";
        List<String> urls = extractURLs(text);
        for (String url : urls) {
            System.out.println(url);
        }
        
}
