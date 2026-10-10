import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ch8_4_0 {
    public static String findWords(String text, String word) {
        // Write your code here
        if (text == null || word == null) {return "Invalid input";}
        
        Pattern pattern = Pattern.compile(word);
        Matcher matcher = pattern.matcher(text);

        StringBuilder locations = new StringBuilder();

        while (matcher.find()) {
            locations.append(matcher.start() + " ");
        }

        if (locations.length() == 0) {return "Not found";}
        return locations.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String word = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (word.equals("null")) word = null;
        
        System.out.println(findWords(text, word));
    }
}