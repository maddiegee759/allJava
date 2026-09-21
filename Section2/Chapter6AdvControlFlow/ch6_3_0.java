import java.util.Scanner;

public class ch6_3_0 {
    public static String processValue(Object value) {
        // TODO: Use pattern matching with instanceof to process the value
        if (value instanceof Integer i) {
            return "Number: " + (i * 2);
        }
        else if (value instanceof String s) {
            return "Text: " + (s.toUpperCase());
        }
        else if (value instanceof Boolean b) {
            return"Boolean: " + (!b);
        }
        else {
            return "Unknown";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        String inputValue = scanner.nextLine();
        
        Object value = switch(type) {
            case "Integer" -> Integer.parseInt(inputValue);
            case "String" -> inputValue;
            case "Boolean" -> Boolean.parseBoolean(inputValue);
            default -> inputValue;
        };
        
        System.out.println(processValue(value));
    }
}