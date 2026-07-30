import java.util.Scanner;

public class ch13_2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String delimiter = scanner.nextLine();
        // Write your code below
        String[] splitInput = text.split(" ");
        String output = String.join(delimiter,splitInput);
        System.out.println(output);
        scanner.close();
    }
}
