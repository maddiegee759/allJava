import java.util.Scanner;

public class numberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // validation
        if (n % 2 == 0){
            System.out.println("Invalid input. Must be an odd number");
            System.exit(0);
        }
        else if (n < 1 || n > 1000){
            System.out.println("Invalid input. Must be between 1 and 1000");
            System.exit(0);
        }

        // * loop
        for (int i = 1; i <= n; i += 2){
            String str = new String(new char[i]).replace("\0", "*");
            System.out.println(str);
        }

        scanner.close();
    }
}
