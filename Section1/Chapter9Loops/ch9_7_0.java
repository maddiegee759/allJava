import java.util.Scanner;

public class ch9_7_0 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        // Write your code below
        for (int i = 1; i <= height; i++){
            for (int j = 1; j <= width; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        scanner.close();
    }
}
