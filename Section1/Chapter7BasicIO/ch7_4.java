import java.util.Scanner;

public class ch7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your code below
        int age;
        age = scanner.nextInt();
        System.out.println((120 - age) + " years till 120");
        scanner.close();
    }
}
