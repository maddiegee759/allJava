public class ch9_7_1 {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1-5):");
        System.out.println("-------------------------");
        
        // Write your nested loops here
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++){
                System.out.print(i*j);

                //spacing
                if (j == 5) {
                    
                }
                else if (i*j < 10){
                    System.out.print("  ");
                }
                else if (j != 5){
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
        
    }    
}
