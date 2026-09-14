import java.util.HashMap;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch3_2_1 {
    public static void printFilteredInventoryKeySet(HashMap<String, Integer> inventory) {
        // Write your code here using keySet()
        int itemMoreTwenty = 0;
        
        for (String product : inventory.keySet()) {
            if (inventory.get(product) > 20) {
                System.out.println("Product: " + product + ", Quantity: " + inventory.get(product));
                itemMoreTwenty++;
            }
        }

        if (itemMoreTwenty == 0) {
            System.out.println("No products with quantity greater than 20.");
        }
        }
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printFilteredInventoryKeySet(inventory);
    }
}