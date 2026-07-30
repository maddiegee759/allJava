public class ch1_5_0 {
    public static int[][] subMatrices(int[][] matrix1, int[][] matrix2) {
        // Write your code here
        int[][] newMatrix = new int[matrix1.length][matrix1[0].length];
        
        for (int row = 0; row < matrix1.length; row++){
            for (int col = 0; col < matrix1[row].length; col++) {
                //System.out.println("matrix1[i][j]" + matrix1[row][col] + " matrix2[i][j] " + matrix2[col][row]);
                newMatrix[row][col] = matrix1[row][col] - matrix2[row][col];
            }
        }
        return newMatrix;
    }

    public static void main(String[] args){
        int[][] m1 = {
            {10,20,30},
            {40,50,60}
        };

        int[][] m2 = {
            {1,2,3},
            {4,5,6}
        };

        int[][] res = subMatrices(m1, m2);


        // Source - https://stackoverflow.com/q/13383692
        // Posted by uml, modified by community. See post 'Timeline' for change history
        // Retrieved 2026-07-29, License - CC BY-SA 3.0

        // enhanced loop is it?
        for (int[] x: res) {
            for (int elem: x){
                System.out.print(elem + " ");
            }
            System.out.println();
        }

        System.out.println();

        // not for each loop
        for (int row = 0; row < res.length; row++){
            for (int col = 0; col < res[row].length; col++) {
                System.out.print(res[row][col] + " ");
            }
            System.out.println();
        }

    }
}
