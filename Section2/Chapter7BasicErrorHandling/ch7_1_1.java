import java.util.Scanner;

public class ch7_1_1 {
    public static String multiplyNumbers(String num1, String num2, int index) {
        // Write your code here using try-catch
        int arr[] = new int[3];
        try {
            int num1AsInt = Integer.parseInt(num1);
            int num2AsInt = Integer.parseInt(num2);

            int multiplication = num1AsInt * num2AsInt;
            try {
                arr[index] = multiplication;
                return "" + multiplication;
            } catch (ArrayIndexOutOfBoundsException e) {
                return "Error: Invalid array index";
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

        System.out.println(multiplyNumbers(num1, num2, index));
    }
}
