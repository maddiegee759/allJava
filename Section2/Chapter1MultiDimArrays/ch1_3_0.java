public class ch1_3_0 {
    // Write your code only inside the class. Do not write main() or any code outside this class.
class PrintMatrix {
    public static void printMatrix(int[][] matrix) {
        // Write your code here
        for (int i = 0; i < matrix.length; i++) {
                // Outer loop iterates over rows
                for (int j = 0; j < matrix[i].length; j++) {
                    // Inner loop iterates over columns
                    // Access or modify array[i][j]
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
        }
    }
}
}
