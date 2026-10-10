import java.util.Scanner;

public class ch8_1_1 {
    public static String buildMessage(String greeting, String name, String action, boolean excited) {
        // Write your code here using StringBuilder
        if (greeting == null || name == null || action == null) { return "Invalid input";}
        StringBuilder msg = new StringBuilder(greeting);
        msg.append(", ");
        msg.append(name);
        msg.append(" is ");
        msg.append(action);

        if (excited == true) {
            msg.append("!");
        } 
        else {
            msg.append(".");
        }

        return msg.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String greeting = scanner.nextLine();
        String name = scanner.nextLine();
        String action = scanner.nextLine();
        boolean excited = Boolean.parseBoolean(scanner.nextLine());
        
        if (greeting.equals("null")) greeting = null;
        if (name.equals("null")) name = null;
        if (action.equals("null")) action = null;
        
        System.out.println(buildMessage(greeting, name, action, excited));
    }
}
