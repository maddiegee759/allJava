import java.util.Scanner;

public class ch9_2_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num = scanner.nextDouble();
        while (num >= 3.5){
            num = num / 2;
        }
        System.out.print(num);

        scanner.close();
    }
    
}
