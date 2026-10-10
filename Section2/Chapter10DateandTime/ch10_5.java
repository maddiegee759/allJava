import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class ch10_5 {
    public static String formatDate(String dateStr, String inputPattern, String outputPattern) {
        // Write your code here
        LocalDate date;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        if (inputPattern.equals("basic")) {
            //above
        }
        else if (inputPattern.equals("long")) {
            formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        }
        else if (inputPattern.equals("short")) {
            formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        }
        else if (inputPattern.equals("custom")) {
            formatter = DateTimeFormatter.ofPattern(inputPattern);
        }
        else {
            return "Invalid pattern";
        }


        try {
            date = LocalDate.parse(dateStr, formatter);
        }
        catch (DateTimeParseException e) {
            return "Invalid date format";
        }


        if (outputPattern.equals("basic")) {
            formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        }
        else if (outputPattern.equals("long")) {
            formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        }
        else if (outputPattern.equals("short")) {
            formatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        }
        else {
            formatter = DateTimeFormatter.ofPattern(outputPattern);
        }

        String formatted = date.format(formatter);
        return formatted;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        String inputPattern = scanner.nextLine();
        String outputPattern = scanner.nextLine();
        
        System.out.println(formatDate(dateStr, inputPattern, outputPattern));

        scanner.close();
    }
}