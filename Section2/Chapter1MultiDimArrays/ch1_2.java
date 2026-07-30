public class ch1_2 {
    // Write your code only inside the class. Do not write main() or any code outside this class.
    public static int getElement(int[][] matrix, int rowIndex, int colIndex) {
        // Write your code here
        int element = -1;
        if (rowIndex >= 0 && rowIndex < matrix.length && 
            colIndex >= 0 && colIndex < matrix[0].length) {
            // Safe to access matrix[rowIndex][colIndex]
            element = matrix[rowIndex][colIndex];
        }

        return element;
    }

    public static void main(String[] args) {
        System.out.println("HELLO WORLD JAVA");
        int[][] matrix = {
            {1,2,3},
            {1,3,5}
        };

        int rowIndex = 1;
        int colIndex = 1;

        int element = -1;
        if (rowIndex >= 0 && rowIndex < matrix.length && 
            colIndex >= 0 && colIndex < matrix[0].length) {
            // Safe to access matrix[rowIndex][colIndex]
            element = matrix[rowIndex][colIndex];
        }

        element = getElement(matrix, rowIndex, colIndex);
        System.out.println(element);
    }
}