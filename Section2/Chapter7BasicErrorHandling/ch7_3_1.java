import java.util.Scanner;

public class ch7_3_1 {
    public static String validateSalary(int salary, boolean strict) {
        // Write your code here
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        } else if (salary > 1000000) {
            throw new IllegalArgumentException("Salary cannot be greater than 1000000");
        } else if (strict && salary == 0) {
            throw new IllegalArgumentException("Salary cannot be zero in strict mode");
        } else {
            return "" + salary;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int salary = Integer.parseInt(scanner.nextLine());
        boolean strict = Boolean.parseBoolean(scanner.nextLine());
        
        try {
            System.out.println(validateSalary(salary, strict));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
