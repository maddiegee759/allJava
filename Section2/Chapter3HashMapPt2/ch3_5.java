import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch3_5 {
    public static void manageWarehouse(HashMap<String, Integer> warehouse, String[] operations) {
        // Write your code here
        int newQty;
        for (int i = 0; i < operations.length; i++) {
            String[] all = operations[i].split(" ");

            if (all[0].equals("ADD")) {
                //System.out.println("add");
                newQty = Integer.valueOf(all[2]);
                
                if (warehouse.containsKey(all[1])) {
                    //add to existing qty
                    newQty += warehouse.get(all[1]);
                    // check: System.out.println("output: " + all[1] + " " + newQty);
                }
                
                //update new quantity
                warehouse.put(all[1], newQty);
                
            }
            else if (all[0].equals("REMOVE")) {
                //System.out.println("remove");
                newQty = Integer.valueOf(all[2]);
                newQty = warehouse.get(all[1]) - newQty;

                // if 0 or negative remove 
                if (newQty <= 0) {
                    warehouse.remove(all[1]);
                }
                // else update
                else {
                    warehouse.put(all[1], newQty);
                }
                
                //System.out.println("output: " + all[1] + " " + newQty);
                
            }
            else if (all[0].equals("CHECK")) {
                //System.out.println("check");

                if (warehouse.containsKey(all[1])) {
                    System.out.println(true);
                }
                else {
                    System.out.println(false);
                }
            }
            else {
                //System.out.println("print");
                for (String product : warehouse.keySet()) {
                    System.out.println("Product: " + product + ", Quantity: " + warehouse.get(product));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String warehouseString = scanner.nextLine();
        String operationsString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Integer>>(){}.getType();
        HashMap<String, Integer> warehouse = new Gson().fromJson(warehouseString, mapType);

        // Convert JSON string to Array
        String[] operations = new Gson().fromJson(operationsString, String[].class);

        manageWarehouse(warehouse, operations);
    }
}