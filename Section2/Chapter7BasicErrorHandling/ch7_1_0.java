import java.util.Scanner;

public class ch7_1_0 {
    public static String divideNumbers(String num1, String num2, int index) {
        // Write your code here
        int arr[] = new int[2];
        try {
            int num1AsInt = Integer.parseInt(num1);
            int num2AsInt = Integer.parseInt(num2);

            try {
                int division = num1AsInt / num2AsInt;

                try {
                    arr[index] = division;
                    return "" + division;
                } catch (ArrayIndexOutOfBoundsException e) {
                    return "Error: Invalid array index";
                }
            
            } catch (ArithmeticException a) {
                return "Error: Division by zero";
            }

        } catch (NumberFormatException e) {
            return "Error: Invalid number format";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();
        int index = Integer.parseInt(scanner.nextLine());
        
        System.out.println(divideNumbers(num1, num2, index));
    }
}