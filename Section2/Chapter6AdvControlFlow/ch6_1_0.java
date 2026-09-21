import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch6_1_0 {
    public static void findNumber(int[][] grid, int target, boolean breakEarly) {
        // Write your code here
        outer: for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == target) {
                    System.out.println("Found at: " + i + "," + j);
                    if (breakEarly) {
                        break outer;
                    }
                }
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing a 2D array
        String gridString = scanner.nextLine();
        // Read the target number
        int target = Integer.parseInt(scanner.nextLine());
        // Read the breakEarly flag
        boolean breakEarly = Boolean.parseBoolean(scanner.nextLine());
        
        Type gridType = new TypeToken<int[][]>(){}.getType();
        int[][] grid = new Gson().fromJson(gridString, gridType);
        
        findNumber(grid, target, breakEarly);
    }
}