import java.util.Scanner;

public class ch10_2 {
    // Method declaration
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // Call the method with a and b as arguments
        multiply(a, b);
        scanner.close();
    }
}
