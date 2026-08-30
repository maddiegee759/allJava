import java.util.Arrays;

public class ch1_9 {
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        
        int sum = 0;
        int max = matrix[0][0];
        int[] rowSums = new int[matrix.length];

        for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sum += matrix[i][j];
                    if (matrix[i][j] > max) {
                        max = matrix[i][j];
                    }
                    rowSums[i] += matrix[i][j];
                }
        }

        
        
        System.out.println("Sum: " + sum);
        System.out.println("Maximum: " + max);
        System.out.println("Row Sums: " + Arrays.toString(rowSums));
    }
}
