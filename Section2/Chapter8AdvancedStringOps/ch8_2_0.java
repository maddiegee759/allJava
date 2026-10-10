import java.util.Scanner;

public class ch8_2_0 {
    public static String modifyText(String text, String target, String replacement) {
        // Write your code here
        if (text == null || target == null || replacement == null) {
            return "Invalid input";
        }

        StringBuffer output = new StringBuffer(text);

        int index1 = output.indexOf(target);
        // if not in phrase return original plus a !
        if (index1 < 0) {
            return output.append("!").toString();
        }
        int index2 = index1 + target.length();
        output.replace(index1, index2, replacement);
        output.append("!");

        return output.toString();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String target = scanner.nextLine();
        String replacement = scanner.nextLine();
        
        if (text.equals("null")) text = null;
        if (target.equals("null")) target = null;
        if (replacement.equals("null")) replacement = null;
        
        System.out.println(modifyText(text, target, replacement));
    }
}