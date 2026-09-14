import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch3_3_1 {
    public static void printMostStockedProduct(HashMap<String, Integer> inventory) {
        // Write your code here using entrySet()
        String maxProduct = " ";
        int maxQty = 0;
        if (inventory.size() == 0) {
            System.out.println("No products in inventory.");
        }
        else {
            for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                if (entry.getValue() > maxQty) {
                    maxProduct = entry.getKey();
                    maxQty = entry.getValue();
                }
            }
            System.out.println("Most Stocked Product: " + maxProduct + ", Quantity: " + maxQty);
        
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read JSON string input representing the inventory HashMap
        String inventoryString = scanner.nextLine();

        // Convert JSON string to HashMap<String, Integer>
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> inventory = new Gson().fromJson(inventoryString, mapType);

        printMostStockedProduct(inventory);
    }
}
