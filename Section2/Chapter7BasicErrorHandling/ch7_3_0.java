import java.util.Scanner;

public class ch7_3_0 {
    public static String validateAge(int age, boolean strict) {
        // Write your code here
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        } else if (age > 150) {
            throw new IllegalArgumentException("Age cannot be greater than 150");
        } else if (strict && age == 0) {
            throw new IllegalArgumentException("Age cannot be zero in strict mode");
        } else {
            return "" + age;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        boolean strict = Boolean.parseBoolean(scanner.nextLine());
        
        try {
            System.out.println(validateAge(age, strict));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}