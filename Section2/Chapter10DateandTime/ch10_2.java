import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ch10_2 {
    public static String processTime(String timeStr, int amount, String unit, String operation) {
        // Write your code here
        LocalTime time;
        try {
            time = LocalTime.parse(timeStr);
        }
        catch (DateTimeParseException e) {
            return "Invalid time format";
        }
        
        LocalTime newTime;

        if (operation.equals("add")) {
            if (unit.equals("hours")){
                newTime = time.plusHours(amount);
            }
            else if (unit.equals("minutes")) {
                newTime = time.plusMinutes(amount);
            }
            else {
                return "Invalid unit";
            }
        }
        else if (operation.equals("subtract")) {
            if (unit.equals("hours")){
                newTime = time.minusHours(amount);
            }
            else if (unit.equals("minutes")) {
                newTime = time.minusMinutes(amount);
            }
            else {
                return "Invalid unit";
            }
        }
        else {
            return "Invalid operation";
        }


        return "Original: " + time + ", New: " + newTime;
    }

    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String timeStr = scanner.nextLine();
        int amount = Integer.parseInt(scanner.nextLine());
        String unit = scanner.nextLine();
        String operation = scanner.nextLine();
        
        System.out.println(processTime(timeStr, amount, unit, operation));

        scanner.close();
    }
}