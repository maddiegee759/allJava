import java.util.Scanner;

public class ch10_3 {
    public static double bigger(double arg1, double arg2) {
        // Complete the method
        if (arg1 >= arg2){
            return arg1;
        }
        else {
            return arg2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iterations = scanner.nextInt();
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        for (int i = 0; i < iterations; i++) {
            // Write your code below
            if (num1 < 2 || num2 < 2){
                break;
            }
            double num = bigger(num1, num2);
            if (num == num1){
                num1 /= 2;
                System.out.println(num1);
            }
            else {
                num2 /= 2;
                System.out.println(num2);
            }
        }
        
        scanner.close();
    }
}
