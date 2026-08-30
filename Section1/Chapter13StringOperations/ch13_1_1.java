public class ch13_1_1 {
    // Write your methods here
    public static String checkLength(String username) {
        System.out.println("Username length: " + username.length());
        boolean check = false;
        if (username.length() >= 6) {
            check = true;
        }

       return "Long enough: " + check;
    }
    
    public static String checkStart(String username) {
        boolean chkUser, chkAdmin;
        chkUser = chkAdmin = false;

        if (username.startsWith("user_")) {
            chkUser = true;
        }

        if (username.startsWith("admin_")) {
            chkAdmin = true;
        }

        return "Starts with user_: " + chkUser + "\nStarts with admin_: " + chkAdmin;
        
    }
    
    public static String modifyUsername(String username) {
        String firstFive = username.substring(0, 5);

        String upperFive = firstFive.toUpperCase();

        return "First 5 chars: " + firstFive + "\nUppercase: " + upperFive;
    }
    
    public static void main(String[] args) {
        // Test with this username
        String username = "user_123admin";
        
        System.out.println("Length Check:");
        System.out.println(checkLength(username));
        
        System.out.println("\nPrefix Check:");
        System.out.println(checkStart(username));
        
        System.out.println("\nModified Username:");
        System.out.println(modifyUsername(username));
    }
}
