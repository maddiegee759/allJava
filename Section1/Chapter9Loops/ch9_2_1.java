public class ch9_2_1 {
    public static void main(String[] args) {
        // Initialize variables
        double balance = 1000.00;
        double yearlyDeposit = 500.00;
        double interestRate = 0.05;
        double targetAmount = 5000.00;
        int years = 1;
        
        // Write your while loop here
        while (balance < targetAmount) {
            balance += yearlyDeposit;
            balance += (balance * interestRate);
            System.out.printf("Year %d: $%.2f\n", years, balance);
            years += 1;
        }
        
        // Don't modify the code below
        System.out.println("------------------------");
        System.out.println("Goal reached in " + (years-1) + " years!");
        System.out.printf("Final balance: $%.2f", balance);
    }
}
