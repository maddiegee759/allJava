public class ch1_4 {
    // Write your code only inside the class. Do not write main() or any code outside this class.
    public static int[] processMatrix(int[][] matrix) {
        // Write your code here
        int sum = 0;
        int max = matrix[0][0];
        int countEven = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Outer loop iterates over rows
            for (int j = 0; j < matrix[i].length; j++) {
                // sum
                sum += matrix[i][j];
                // max
                if (max < matrix[i][j]){
                    max = matrix[i][j];
                }
                // countEven
                if (matrix[i][j] % 2 == 0){
                    countEven += 1;
                }
            }
        }
            int[] all = {sum, max, countEven};
            return all;
    }

    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };

        int [] stats = processMatrix(matrix);
        
        for (int stat : stats) {
            System.out.println(stat);
        }

        System.exit(0);
    }
}
