import java.util.Scanner;

public class ch8_3_1 {
    public static String validatePassword(String password) {
        // Write your code here
        if (password.length() >= 8) {
            if (password.length() <= 20) {
                if (password.matches("[a-z]+")) {
                    if (password.matches("[A-Z]+")) {
                        if (password.matches("[0-9]+")) {     
                            if (password.matches("[@#$%^&+=]+")) {
                                // find if it contains space
                                String split[] = password.split(" ");
                                if (split.length == 0) {
                                    return "Valid";
                                }
                                
                                return "Contains space";
                                
                            }
                            else {
                                return "No special character";
                            }
                        }
                        else {
                            return "No digit";
                        }
                    }
                    else {
                        return "No uppercase";
                    }
                }
                else {
                    return "No lowercase";
                }
            }
            else {
                return "Too long";
            }
        }
        else {
            return "Too short";
        }
    }
        
    public static String getPasswordStrength(String password) {
        // Write your code here
        return "return";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        
        if (password.equals("null")) password = null;
        
        String validation = validatePassword(password);
        System.out.println(validation);
        
        if (validation.equals("Valid")) {
            System.out.println(getPasswordStrength(password));
        }
    }
}