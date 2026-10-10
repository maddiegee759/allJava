import java.util.Scanner;

public class ch8_3_0 {
    public static String validateInput(String text, String type) {
        // Write your code here
        if (text == null) {return "Invalid input";}
        boolean isValid = false;
        if (type.equals("number")){
            isValid = text.matches("[0-9]+");
        } else if (type.equals("word")){
            isValid = text.matches("[a-zA-Z]+");
        } else if (type.equals("email")) {
            isValid = text.matches("[@]+");
        } else if (type.equals("phone")){
            if (text.length() == 10 && text.matches("[0-9]+")) {
                isValid = true;
            }

        } else {
            return "Invalid type";
        }

        if (isValid == true) {return "Valid";} else {return "Invalid";}
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String type = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        System.out.println(validateInput(text, type));
    }
}