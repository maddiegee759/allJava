public class ch1_8_0 {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
    
        //StringBuilder object
        StringBuilder mainDiagonal = new StringBuilder("Main Diagonal: ");
        StringBuilder antiDiagonal = new StringBuilder("Anti-Diagonal: ");
        StringBuilder topBorder = new StringBuilder("Top Border: ");
        StringBuilder bottomBorder = new StringBuilder("Bottom Border: ");
        StringBuilder leftBorder = new StringBuilder("Left Border: ");
        StringBuilder rightBorder = new StringBuilder("Right Border: ");
        
        
        //main diagonal
        for (int i = 0; i < matrix.length; i++) {
            mainDiagonal.append(matrix[i][i] + " ");
        }

        System.out.println(mainDiagonal);

        // anti diagonal
        for (int i = 0; i < matrix.length; i++) {
            antiDiagonal.append(matrix[i][matrix.length - 1 - i] + " ");
        }

        System.out.println(antiDiagonal);
    

        // top border
        for (int i = 0; i < matrix.length; i++) {
            topBorder.append(matrix[0][i] + " ");
        }

        System.out.println(topBorder);

        // bottom border
        for (int i = 0; i < matrix.length; i++) {
            bottomBorder.append(matrix[matrix.length-1][i] + " ");
        }

        System.out.println(bottomBorder);

        // left border
        for (int i = 0; i < matrix.length; i++) {
            leftBorder.append(matrix[i][0] + " ");
        }

        System.out.println(leftBorder);

        // right border
        for (int i = 0; i < matrix.length; i++) {
            rightBorder.append(matrix[i][matrix.length-1] + " ");
        }

        System.out.println(rightBorder);
    }
}
