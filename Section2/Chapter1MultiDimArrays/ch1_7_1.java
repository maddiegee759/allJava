public class ch1_7_1 {
        public static String create3DGameBoard(int levels, int rows, int cols) {
        // Check for valid dimensions
        if (levels <= 0 || rows <= 0 || cols <= 0) {
            return "";
        }
        
        // Create and fill 3D array
        int[][][] board = new int[levels][rows][cols];
        
        // Fill the array with calculated values
        // Calculate base value (level + row + col)
        for (int d = 0; d < levels; d++) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    board[d][r][c] = (d + 1) + (r + 1) + (c + 1);
                }
            }
        }
        // Multiply by 10 if cell is on any edge
        for (int d = 0; d < levels; d++) {
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (d == 0 || d == levels-1) {
                        board[d][r][c] *= 10;
                    }
                    else if (r == 0 || r == rows-1) {
                        board[d][r][c] *= 10;
                    }
                    else if (c == 0 || c == cols-1) {
                        board[d][r][c] *= 10;
                    }
                }
            }
        }
        
        
        // Create output string using this exact format:
        String result = "";
        for (int l = 0; l < levels; l++) {
            result += "Level " + l + ":\n";
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    result += board[l][r][c];
                    if (c < cols - 1) result += " ";
                }
                result += "\n";
            }
            if (l < levels - 1) result += "\n";
        }
        
        return result;
    }

    public static void main(String[] args) {
        int levels = 2;
        int rows = 3;
        int cols = 2;
        System.out.println(create3DGameBoard(levels, rows, cols));
    }
}
