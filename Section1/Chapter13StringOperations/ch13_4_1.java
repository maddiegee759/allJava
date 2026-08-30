public class ch13_4_1 {
    // Create a method that checks if passwords match exactly
    // Should return a String in format: "Password match (exact): true/false"
    public static String checkExactMatch(String stored, String attempt) {
        // Your code here
        // Use the equals() method to compare strings
        boolean passMatch = false;
        if (attempt.equals(stored)) {
            passMatch = true;
        }
        return "Password match (exact): " + passMatch;
    }
    
    // Create a method that checks if passwords match when ignoring case
    // Should return a String in format: "Password match (ignore case): true/false"
    public static String checkIgnoreCase(String stored, String attempt) {
        // Your code here
        // Use the equalsIgnoreCase() method
        boolean passMatch = false;
        if (attempt.equalsIgnoreCase(stored)) {
            passMatch = true;
        }
        return "Password match (ignore case): " + passMatch;
        
    }
    
    // Create a method that compares passwords alphabetically
    // Should return a String in format: "Password comparison: Before/After/Exact match"
    public static String comparePasswords(String stored, String attempt) {
        // Your code here
        // Use the compareTo() method
        int comp = attempt.compareTo(stored);
        String msg;
        // If compareTo returns:
        if (comp < 0) {
            //   negative -> "Before"
            msg = "Before";
        }
        
        else if (comp > 0){
            //   positive -> "After"
            msg = "After";
        }
        
        else {
            //   zero -> "Exact match"
            msg = "Exact match";
        }
        
        return "Password comparison: " + msg;
    }
    
    public static void main(String[] args) {
        // Initialize passwords - don't modify these!
        String storedPassword = "SecurePass123";
        String userAttempt1 = "securepass123";
        String userAttempt2 = "SecurePass123";
        String userAttempt3 = "SecurePass12";
        String[] commonPasswords = {"password123", "12345678", "qwerty123"};
        
        // Create your validation methods
        String exactCheck = checkExactMatch(storedPassword, userAttempt1);
        String caseCheck = checkIgnoreCase(storedPassword, userAttempt1);
        String comparison = comparePasswords(storedPassword, userAttempt3);
        
        // Don't modify the code below
        System.out.println("Password Validation Results:");
        System.out.println("---------------------------");
        System.out.println(exactCheck);
        System.out.println(caseCheck);
        System.out.println(comparison);
    }
}
