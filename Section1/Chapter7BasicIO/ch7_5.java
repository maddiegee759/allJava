import java.util.Scanner;

public class ch7_5 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        String input = scanner.next();
        String output = "F";

        if (input.equals("1")) {
            output = "T";
        }

        System.out.print(output);        

        scanner.close();
    }
}
