import java.util.Scanner;

public class ch8_2_1 {
    public static String processText(String text, String target, String replacement, int operations) {
        // Write your code here
        if (text == null || target == null || replacement == null) {return "Invalid input";}
        if (operations < 1 || operations > 3) {return "Invalid operation";}

        StringBuffer output = new StringBuffer(text);

        int index1 = output.indexOf(target);
        if (index1 < 0) {
            //no replacement happens, but the reverse, uppercase and exclamation mark steps still apply 
        } else {
            int index2 = index1 + target.length();
            output.replace(index1, index2, replacement);
        }

        if (operations >= 2) {
            // reverse string
            output.reverse();

            if (operations == 3) {
                String asString = output.toString();
                asString = asString.toUpperCase();
                asString += "!";
                return asString;
            }
        }

        output.append("!");

        return output.toString();


    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();
        int operations = scanner.nextInt();
        
        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;
        
        System.out.println(processText(text, target, replacement, operations));
    }
}