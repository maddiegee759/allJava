import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ch10_1 {
    public static String processDate(String dateStr, int days, String operation) {
        // Write your code here
        try {
            LocalDate date = LocalDate.parse(dateStr);
            LocalDate newDate;
            if (operation.equals("add")) {
                newDate = date.plusDays(days);
            }
            else if (operation.equals("subtract")) {
                newDate = date.minusDays(days);
            }
            else {
                return "Invalid operation";
            }

            return "Original: " + date + ", New: " + newDate + ", Day of week: " + newDate.getDayOfWeek().toString();
        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }
    
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateStr = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        String operation = scanner.nextLine();
        
        System.out.println(processDate(dateStr, days, operation));

        scanner.close();
    }
}