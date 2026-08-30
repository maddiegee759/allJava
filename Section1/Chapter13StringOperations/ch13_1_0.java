import java.util.Scanner;

public class ch13_1_0 {
    public static void analyzeString(String str) {
        // Write your code here
        // length
        System.out.println("Length: " + str.length());
        // char index 4
        System.out.println("Char at 4: " + str.charAt(4));
        // substring 7 - end
        System.out.println("Substring: " + str.substring(7));
        //substring 3 - 6
        System.out.println("Substring 2: " + str.substring(3,6));
        // end with dot
        System.out.println("Ends with dot: " + str.endsWith("."));
        // uppercase
        System.out.println("Uppercase: " + str.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        analyzeString(message);

        scanner.close();
    }
}
