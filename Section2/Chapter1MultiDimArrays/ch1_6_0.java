public class ch1_6_0 {
    public static int[][] createJaggedArray(int n) {
        // Write your code here
        int[][] newMatrix = new int[n][];

        for (int i = 0; i < n; i++){
            newMatrix[i] = new int[i+1];
            for (int j = 0; j <= i; j++){
                newMatrix[i][j] = (i+1)*(j+1);
            }
        }
        return newMatrix;
    }

    public static void main(String[] args) {
        int num = 7;
        int[][] m = createJaggedArray(num);

        for (int[] x: m) {
            for (int elem: x){
                System.out.print(elem + " ");
            }
            System.out.println();
        }

    }
}