import java.util.Scanner;

public class ch6_2_0 {
    public static String getDayType(int day, boolean abbreviated) {
        // Write your code here
        String output = switch(day) {
            case 1,2,3,4,5 -> (abbreviated) ? "WKD" : "WORKDAY";
            case 6,7 -> (abbreviated) ? "WKND" : "WEEKEND";
            default -> (abbreviated) ? "INV" : "INVALID";
        };

        return output;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = Integer.parseInt(scanner.nextLine());
        boolean abbreviated = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(getDayType(day, abbreviated));
    }
}