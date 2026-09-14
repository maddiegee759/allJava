import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch3_3_0 {
    public static void printInventoryEntrySet(HashMap<String, Integer> inventory) {
        // Write your code here using entrySet()
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Product: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printInventoryEntrySet(inventory);
    }
}