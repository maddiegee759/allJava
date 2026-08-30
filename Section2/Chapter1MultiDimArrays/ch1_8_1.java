import java.util.ArrayList;
import java.util.Arrays;

public class ch1_8_1 {
    public static void printAdvancedPatterns(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        //DIAGONALS
        int[] mainDiagonal = new int[m];
        int[] antiDiagonal = new int[m];

        int i;
        int[] arr2;
        // main diagonal
        for (i = 0; i < m; i++) {
            mainDiagonal[i] = matrix[i][i];
        }

        // anti diagonal
        for (i = 0; i < m; i++) {
            antiDiagonal[i] = matrix[i][m - 1 - i];
        }

        if (m % 2 != 0) {
            arr2 = new int[antiDiagonal.length - 1];
            // remove centre index at len/2
            int index = antiDiagonal.length/2;

            for (int x = 0, y = 0; x < antiDiagonal.length; x++) {
			if (x == index)
                continue;
			
            arr2[y++] = antiDiagonal[x];
            }
        }
        else {
            arr2 = antiDiagonal;
        }

        int[] bothDiagonal = new int[mainDiagonal.length + arr2.length];

        for (i = 0; i < mainDiagonal.length; i++) {
            bothDiagonal[i] = mainDiagonal[i];
        }

        for (i = 0; i < arr2.length; i++) {
            bothDiagonal[mainDiagonal.length + i] = arr2[i];
        }

        System.out.print("Both Diagonals:");
        for (int elem : bothDiagonal) {
            System.out.print(" " + elem);
        }
        System.out.println();


        //SPIRAL - https://www.geeksforgeeks.org/dsa/print-a-given-matrix-in-spiral-form/

        ArrayList<Integer> res = new ArrayList<>();
        boolean[][] passedThrough = new boolean[m][n];

        // Change in row index for each direction
        int[] dr = { 0, 1, 0, -1 };

        // Change in column index for each direction
        int[] dc = { 1, 0, -1, 0 };

        // Initial position in the matrix
        int r = 0, c = 0;


        // Initial direction index (0 corresponds to
        // 'right')
        int idx = 0;

        for (i = 0; i < m * n; ++i) {

            // Add current element to result list
            res.add(matrix[r][c]);

            // Mark current cell as visited
            passedThrough[r][c] = true;

            // Calculate the next cell coordinates based on
            // current direction
            int newR = r + dr[idx];
            int newC = c + dc[idx];

            // Check if the next cell is within bounds and
            // not visited
            if (0 <= newR && newR < m && 0 <= newC
                && newC < n && !passedThrough[newR][newC]) {

                // Move to the next row
                r = newR;

                // Move to the next column
                c = newC;
            }
            else {

                // Change direction (turn clockwise)
                idx = (idx + 1) % 4;

                // Move to the next row according to new
                // direction
                r += dr[idx];

                // Move to the next column according to new
                // direction
                c += dc[idx];
            }
        }

        //matrix[rowIndex][colIndex]
        //right until colIndex = matrix.length-1
        //down until rowIndex = [0].length-1
        //left until colIndex = 0
        //up until rowIndex = 0+1
        //repeat
        //System.out.println(res);
        System.out.print("Spiral Order: ");
        for (int elem : res) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        int[][] input = {{1,2},{3,4}};
        printAdvancedPatterns(input);
    }
}
