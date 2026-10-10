import java.util.Scanner;

public class ch8_5_0 {
    public static String tokenizeText(String text, String delimiter) {
        // Write your code here
        if (text == null) {return "Invalid text";}
        if (delimiter == null) {delimiter = " ";}
        String textSplit[] = text.split(delimiter);

        StringBuilder tokenSummary = new StringBuilder("Token count: " + textSplit.length);

        for (int i = 0; i < textSplit.length; i++) {
            tokenSummary.append("\nToken: " + textSplit[i]);
        }
        return tokenSummary.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (delimiter.equals("null")) delimiter = null;
        
        System.out.println(tokenizeText(text, delimiter));
    }
}