import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch5_3_1 {
    public static void twoWaySetDifference(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here
        boolean isDiff = false;
        HashSet<Integer> diffOne = new HashSet<>(set1);
        diffOne.removeAll(set2);

        if (!diffOne.isEmpty()) {
            System.out.println("Difference (Set 1 - Set 2): " + diffOne);
            isDiff = true;
        }
        
        HashSet<Integer> diffTwo = new HashSet<>(set2);
        diffTwo.removeAll(set1);

        if (!diffTwo.isEmpty()) {
            System.out.println("Difference (Set 2 - Set 1): " + diffTwo);
            isDiff = true;
        }
        
        if (!isDiff) {
            System.out.println("No difference between sets.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing the first set (e.g., [1,2,3])
        String set1String = scanner.nextLine();
        // Read JSON string representing the second set (e.g., [2,3,4])
        String set2String = scanner.nextLine();

        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);

        twoWaySetDifference(set1, set2);
    }
}
