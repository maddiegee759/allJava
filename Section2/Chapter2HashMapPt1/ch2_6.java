// --- Modules to convert string of hashmap to hashmap ---
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
// -----------------------------
import java.util.HashMap;
import java.util.Scanner;

public class ch2_6 {
    public static HashMap<String, Integer> processHashMap(HashMap<String, Integer> data, String[] operations) {
        // Write your code here
        for (int i = 0; i < operations.length; i++) {
            String[] op_key = operations[i].split(" ");
            if (op_key[0].contains("GET")){
                //System.out.println("get");
                if (data.containsKey(op_key[1])) {
                    System.out.println(data.get(op_key[1]));
                }
                else {
                    System.out.println("Not found");
                }
            }
            else if (op_key[0].contains("CHECK")) {
                if (data.containsKey(op_key[1])) {
                    System.out.println("Exists");
                }
                else {
                    System.out.println("Not found");
                }
            }
            else {
                String key = op_key[1];
                Integer targetValue = Integer.parseInt(op_key[2]);
                if (data.containsKey(key)) {
                    if (data.get(key).equals(targetValue)) {
                        targetValue++;
                        data.replace(key, targetValue);
                    }
                    else {
                        data.remove(key);
                    }
                }
                else {
                    data.put(key, targetValue);
                }
                
            }
        }

        return data;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String hashMapString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert String of HashMap to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> data = new Gson().fromJson(hashMapString, mapType);

        // Convert String of Array to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        HashMap<String, Integer> result = processHashMap(data, operations);
        System.out.println(new Gson().toJson(result));
    }
}
