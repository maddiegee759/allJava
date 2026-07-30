public class ch1_5_1 {
    public static int[][] matrixOperation(int[][] matrix1, int[][] matrix2, String operator) {
        // Write your code here
        int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
        if (operator.equals("add")){
            for (int row = 0; row < matrix1.length; row++){
                for (int col = 0; col < matrix1[row].length; col++) {
                    newMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
                }
            }
        }
        else if (operator.equals("subtract")){
            for (int row = 0; row < matrix1.length; row++){
                for (int col = 0; col < matrix1[row].length; col++) {
                    newMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
                }
            }
        }
        else {
            System.out.println("error");
        }

        return newMatrix;
    }

    public static void main(String[] args) {
        int[][] m1 = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][] m2 = {
            {9,8,7},
            {6,5,4},
            {3,2,1}
        };

        String op = "add";

        int[][] res = matrixOperation(m1, m2, op);
        // enhanced loop is it?
        for (int[] x: res) {
            for (int elem: x){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}