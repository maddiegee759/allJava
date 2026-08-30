public class ch4_2_1 {
    public static void main(String[] args) {
        int points = 105;
        // Your code here
        // Calculate modulo values
        int luckySeven = points % 14;
        int tripleBonus = points % 3;
        int fivePower = points % 5;
        int doubleCheck = points % 2;
        
        // Calculate final score
        int finalScore = points + (luckySeven * 20) - (tripleBonus * 15) + (fivePower * 10) - (doubleCheck * 25);
        System.out.println("Starting points: " + points);
        System.out.println("Lucky seven remainder: " + luckySeven);
        System.out.println("Triple bonus remainder: " + tripleBonus);
        System.out.println("Five power remainder: " + fivePower);
        System.out.println("Double check remainder: " + doubleCheck);
        System.out.println("Final score: " + finalScore);
    }
}
