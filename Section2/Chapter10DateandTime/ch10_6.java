import java.util.Scanner;
import java.time.*;
import java.time.format.*;

public class ch10_6 {
    public static String convertTime(String dateTimeStr, String sourceZone, 
                                   String targetZone, boolean showOffset) {
        // Write your code here
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            
            LocalDateTime localDT = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
            ZonedDateTime src = localDT.atZone(ZoneId.of(sourceZone));
            ZonedDateTime target = src.withZoneSameInstant(ZoneId.of(targetZone));
        
            if (showOffset) {
                formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm xxx");
            }

            return "Source: " + src.format(formatter) + ", Target: " + target.format(formatter);
        }
        catch (DateTimeParseException e) {
            return "Invalid datetime format";
        } 
        catch (DateTimeException e) {
            return "Invalid time zone";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dateTimeStr = scanner.nextLine();
        String sourceZone = scanner.nextLine();
        String targetZone = scanner.nextLine();
        boolean showOffset = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(convertTime(dateTimeStr, sourceZone, targetZone, showOffset));

        scanner.close();
    }
}