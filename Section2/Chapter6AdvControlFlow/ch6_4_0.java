import java.util.Scanner;

public class ch6_4_0 {
    public static String validatePassword(String password) {
        // Write your code here
        if (password == null) return "Password cannot be null";
        if (password.isEmpty()) return "Password cannot be empty";
        if (password.length() < 8) return "Password must be at least 8 characters";
        String[] psplit = password.split(" ");
        if (psplit.length != 1) return "Password cannot contain spaces";
        return "Valid password";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("null")) {
            password = null;
        }
        System.out.println(validatePassword(password));
    }
}