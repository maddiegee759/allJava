import java.util.Scanner;

public class ch8_1_0 {
    public static String buildPhrase(String start, String middle, String end) {
        // Write your code here
        if (start == null || middle == null || end == null) {
            return "Invalid input";
        }
        StringBuilder phrase = new StringBuilder(start);
        phrase.append(" ");
        phrase.append(middle);
        phrase.append(" ");
        phrase.append(end);
        phrase.append("!");

        return phrase.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String middle = scanner.nextLine();
        String end = scanner.nextLine();
        
        if (start.equals("null")) start = null;
        if (middle.equals("null")) middle = null;
        if (end.equals("null")) end = null;
        
        System.out.println(buildPhrase(start, middle, end));
    }
}