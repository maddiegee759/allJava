import java.util.Scanner;

public class ch10_7 {
    public static void printNTimes(String message, int n) {
        // Write you code here
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String msg = scanner.nextLine();
        int n = scanner.nextInt();

        printNTimes(msg, n);

        scanner.close();
    }
}
