// --- Modules to convert string of hashmap to hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class ch2_4_0 {
    public static int keyChecker(HashMap<String, Integer> randomValues, String[] keys) {
        // Write your code below
        int numKeys = 0;
        for (int i = 0; i < keys.length; i++) {
            if (randomValues.containsKey(keys[i])) {
                numKeys += 1;
            }
        }
        return numKeys;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String arrayString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> randomValues = new Gson().fromJson(hashMapString, mapType);

        // Convert String of Array to Array
        String[] keys = new Gson().fromJson(arrayString, String[].class);

        int result = keyChecker(randomValues, keys);
        System.out.println(result);
    }
}
