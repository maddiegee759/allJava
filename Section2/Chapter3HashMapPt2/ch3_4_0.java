import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ch3_4_0 {
    public static void printNestedInventory(HashMap<String, HashMap<String, Integer>> inventory) {
        // Iterate over each category in the outer HashMap
        // For each category, print "Category: <name>"
        // If the inner map is empty, print "  (No products)"
        // Otherwise, iterate over each product and print "  Product: <name>, Price: <price>"
        // Write your code here    
        for (Map.Entry<String, HashMap<String, Integer>> entry : inventory.entrySet()) {
            System.out.println("Category: " + entry.getKey());

            // to access products within categories:
            HashMap<String, Integer> products = entry.getValue();

            if (products.isEmpty()) {
                System.out.println("  (No products)");
            }
            else {
                for (String productName : products.keySet()) {
                    int price = products.get(productName);
                    System.out.println("  Product: " + productName + ", Price: " + price);
                }
            } 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inventoryString = scanner.nextLine();

        // Convert JSON string to Nested HashMap
        Type inventoryType = new TypeToken<HashMap<String, HashMap<String, Integer>>>(){}.getType();
        HashMap<String, HashMap<String, Integer>> inventory = new Gson().fromJson(inventoryString, inventoryType);

        printNestedInventory(inventory);
    }
}