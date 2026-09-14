import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch4_5_0 {
    public static void checkSet(HashSet<String> set) {
        // Write your code here
        System.out.println("Empty: " + set.isEmpty());
        System.out.println("Size: " + set.size());
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string representing a HashSet (e.g., ["Apple","Banana"])
        String setString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> set = new Gson().fromJson(setString, setType);
        
        checkSet(set);
    }
}