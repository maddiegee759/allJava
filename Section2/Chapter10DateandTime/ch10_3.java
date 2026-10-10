import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ch10_3 {
    public static String processDateTime(String dateTimeStr, int amount, String unit, String operation) {
        // Write your code here
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime;
        try {
            dateTime = LocalDateTime.parse(dateTimeStr, formatter);
        }
        catch (DateTimeParseException e) {
            return "Invalid date time format";
        }
        
        LocalDateTime newDateTime = dateTime;

        if (operation.equals("add")) {
            if (unit.equals("hours")){
                newDateTime = dateTime.plusHours(amount);
            }
            else if (unit.equals("days")) {
                newDateTime = dateTime.plusDays(amount);
            }
            else if (unit.equals("months")) {
                newDateTime = dateTime.plusMonths(amount);
            }
            else {
                return "Invalid unit";
            }
        }
        else if (operation.equals("subtract")) {
            if (unit.equals("hours")){
                newDateTime = dateTime.minusHours(amount);
            }
            else if (unit.equals("days")) {
                newDateTime = dateTime.minusDays(amount);
            }
            else if (unit.equals("months")) {
                newDateTime = dateTime.minusMonths(amount);
            }
            else {
                return "Invalid unit";
            }
        }
        else {
            return "Invalid operation";
        }


        String orgFormatted = dateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        String newFormatted = newDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        String dayOfWeekNew = newDateTime.getDayOfWeek().toString();
        return "Original: " + orgFormatted + ", New: " + newFormatted + ", Day: " + dayOfWeekNew;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTimeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();
        
        System.out.println(processDateTime(dateTimeStr, amount, unit, operation));

        scanner.close();
    }
}