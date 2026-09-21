import java.util.Scanner;

public class ch7_2 {
    public static String processNumber(String number, boolean shouldThrow) {
        // Write your code here
        int result = 0;
        try {
            if (shouldThrow) {
                result = 10 / 0;
            } else {
                int numberAsInt = Integer.parseInt(number);
                result = numberAsInt;
            }
        } catch (NumberFormatException | ArithmeticException e) {
            result = -1;
        } finally {
            result += 100;
        }

        return "" + result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        boolean shouldThrow = Boolean.parseBoolean(scanner.nextLine());
        
        System.out.println(processNumber(number, shouldThrow));
    }
}