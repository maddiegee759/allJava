import java.util.Scanner;

public class ch10_1_0 {
    // Method declaration
    public static void sumNumbers() {
        // Complete Method
        int sum = 0;
        for (int i = 1; i <= 1000; i++){
            sum += i;
        }
        System.out.println(sum);   
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            // Call the method n times
            sumNumbers();
        }
        
        scanner.close();
    }
}
