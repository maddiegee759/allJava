public class ch9_1_1 {
    public static void main(String[] args) {
        // Initialize variables
        int number = 7;
        int sum = 0;
        
        System.out.println("Multiplication Table for " + number);
        System.out.println("---------------------------");
        
        // Write your for loop here
        for (int i = 1; i <= 12; i++) {
            int multiple = i * number;
            sum += multiple;
            System.out.println(number + " x " + i + " = " + multiple);
        }
        
        
        System.out.println("---------------------------");
        System.out.println("Sum of all results: " + sum);
    }
}
