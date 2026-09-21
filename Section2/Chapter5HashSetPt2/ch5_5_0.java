import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch5_5_0 {
    public static void checkSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        // Write your code here
        boolean check = false;
        if (setB.containsAll(setA)) {
            check = true;
        }

        System.out.println("setA is a subset of setB: " + check);
        System.out.println("setB is a superset of setA: " + check);
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string for setA (e.g., ["apple","banana"])
        String setAString = scanner.nextLine();
        // Read JSON string for setB (e.g., ["apple","banana","cherry"])
        String setBString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> setA = new Gson().fromJson(setAString, setType);
        HashSet<String> setB = new Gson().fromJson(setBString, setType);
        
        checkSubsetSuperset(setA, setB);
    }
}