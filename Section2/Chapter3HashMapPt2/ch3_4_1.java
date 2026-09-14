import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class ch3_4_1 {
    public static void printMostExpensiveProducts(HashMap<String, HashMap<String, Integer>> inventory) {
        // Write your code here
        if (inventory.isEmpty()) {
            System.out.println("No categories in inventory.");
        }
        else {
            String productMaxName = " ";
            int productMaxPrice = 0;
            for (Map.Entry<String, HashMap<String, Integer>> cat : inventory.entrySet()) {
                //print category
                System.out.println("Category: " + cat.getKey());

                // products
                HashMap<String, Integer> products = cat.getValue();

                if (products.isEmpty()) {
                    System.out.println("  No products available.");
                }
                else {
                    // check which product is max
                    // set productMax back to 0
                    productMaxPrice = 0;
                    for (String productName : products.keySet()) {
                        int price = products.get(productName);
                        // this actually works :) // int price = cat.getValue().get(productName);
                        if (price > productMaxPrice) {
                            productMaxPrice = price;
                            productMaxName = productName;
                        }
                    }
                    System.out.println("  Most Expensive Product: " + productMaxName + ", Price: " + productMaxPrice);
                    
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

        printMostExpensiveProducts(inventory);
    }
}
