import java.util.Scanner;

public class ch6_4_1 {
    public static String validateUsername(String username) {
        // Write your code here using guard clauses
        if (username == null) return "Username cannot be null";
        if (username.isEmpty()) return "Username cannot be empty";
        for (int i = 0; i < username.length(); i++) {
            if (!Character.isLetterOrDigit(username.charAt(i))) {
                return "Username cannot contain special characters";
            }
        }
        
        if (username.length() < 8) return "Username must be at least 8 characters";
        return "Valid username";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        if (username.equals("null")) {
            username = null;
        }
        System.out.println(validateUsername(username));
    }
}
