import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class ch10_4 {
    public static String calculateDifference(String start, String end, String unit, String format) {
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            LocalDateTime startDate = LocalDateTime.parse(start, formatter);
            LocalDateTime endDate = LocalDateTime.parse(end, formatter);
            
            switch (unit.toLowerCase()) {
                case "period":
                    Period period = Period.between(startDate.toLocalDate(), endDate.toLocalDate());
                    if (format.equals("full")) {
                        return String.format("Years: %d, Months: %d, Days: %d",
                            period.getYears(), period.getMonths(), period.getDays());
                    } else if (format.equals("simple")) {
                        return String.format("%dy%dm%dd",
                            period.getYears(), period.getMonths(), period.getDays());
                    }
                    break;
                    
                case "duration":
                    Duration duration = Duration.between(startDate, endDate);
                    long hours = duration.toHours();
                    long minutes = duration.toMinutesPart();
                    if (format.equals("full")) {
                        return String.format("Hours: %d, Minutes: %d", hours, minutes);
                    } else if (format.equals("simple")) {
                        return String.format("%dh%dm", hours, minutes);
                    }
                    break;
                    
                default:
                    return "Invalid unit";
            }
            
            return "Invalid format";
            
        } catch (DateTimeParseException e) {
            return "Invalid date format";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String start = scanner.nextLine();
        String end = scanner.nextLine();
        String unit = scanner.nextLine();
        String format = scanner.nextLine();
        
        System.out.println(calculateDifference(start, end, unit, format));

        scanner.close();
    }
}