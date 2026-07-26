import java.util.Scanner;

public class ch9_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        int numOfInputs = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < numOfInputs; i++){
            int tempInput = scanner.nextInt();
            sum += tempInput;
        }
        System.out.println(sum);
        scanner.close();
    }
}
