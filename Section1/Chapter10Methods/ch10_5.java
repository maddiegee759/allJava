import java.util.Scanner;

public class ch10_5 {
    public static int sigma(int n) {
        // Write your code below
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = sigma(n);
        System.out.println(res);

        scanner.close();
    }
}
