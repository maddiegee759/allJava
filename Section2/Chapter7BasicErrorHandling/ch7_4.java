import java.util.Scanner;

class EmailException extends Exception {
    public EmailException(String message) {
        super(message);
    }
}

public class ch7_4 {
    public static String validateEmail(String email) throws EmailException {
        // Write your code here
        if (email == null) {
            throw new EmailException("Email cannot be null");
        }
        if (email.isEmpty()) {
            throw new EmailException("Email cannot be empty");
        }
        if (!email.contains("@")) {
            throw new EmailException("Email must contain @");
        }
        if (email.charAt(0) == '@') {
            throw new EmailException("Email must have a local part");
        }
        
        return "Valid email";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();
        if (email.equals("null")) {
            email = null;
        }
        
        try {
            System.out.println(validateEmail(email));
        } catch (EmailException e) {
            System.out.println(e.getMessage());
        }
    }
}