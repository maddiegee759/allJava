import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch5_2_1 {
    public static void intersectionWithSubsetCheck(HashSet<Integer> set1, HashSet<Integer> set2) {
        // Write your code here
        HashSet<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        System.out.println("Intersection: " + intersection);
        if (intersection.isEmpty()) {
            System.out.println("No common elements.");
        }
        else if (intersection.containsAll(set1)) {
            System.out.println("Set 1 is fully contained in Set 2");
        }
        else if (intersection.containsAll(set2)) {
            System.out.println("Set 2 is fully contained in Set 1");
        }
        else {
            System.out.println("Partial intersection");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string for the first set (e.g., [1,2])
        String set1String = scanner.nextLine();
        // Read JSON string for the second set (e.g., [2,3])
        String set2String = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<Integer>>(){}.getType();
        HashSet<Integer> set1 = new Gson().fromJson(set1String, setType);
        HashSet<Integer> set2 = new Gson().fromJson(set2String, setType);
        
        intersectionWithSubsetCheck(set1, set2);
    }
}
