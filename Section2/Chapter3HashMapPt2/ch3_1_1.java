// --- Modules to convert string of hashmap to hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class ch3_1_1 {
    public static void modifyAndResetHashMap(HashMap<String, Integer> data) {
        // Write your code here
        System.out.println("Is empty: " + data.isEmpty());
        System.out.println("Size: " + data.size());

        if (!data.containsKey("Reset")) {
            data.put("Reset", 0);
        }
        System.out.println("Size after modification: " + data.size());

        data.clear();
        System.out.println("Is empty after clear: " + data.isEmpty());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        modifyAndResetHashMap(data);
    }
}