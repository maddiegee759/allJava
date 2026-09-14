import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class ch4_7 {
    public static String processHashSet(HashSet<Object> set, Object input, String operation) {
        // Write your code here
        if (set == null) {
            return "Invalid set";
        }


        if (operation.equals("add")) {
            if (set.contains(input)) {
                return "Element already exists";
            }
            else {
                set.add(input);
                return "Added successfully";
            }
        }
        else if (operation.equals("remove")) {
            if (set.contains(input)) {
                set.remove(input);
                return "Removed successfully";
            }
            else {
                return "Element not found";
            }
        }
        else if (operation.equals("find")) {
            if (input == null) {
                return "Cannot find null";
            }
            else {
                int index = 0;
                for (int i = 0; i < set.size(); i++) {
                    if (input.equals(set.contains(i))) {
                        index = i;
                    }
                }
                return "Found at index: " + index;
            }
        }
        else if (operation.equals("count")) {
            return "Number of elements: " + set.size();
        }
        else {
            return "Invalid operation";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the initial set
        String[] items = scanner.nextLine().split(",");
        HashSet<Object> set = new HashSet<>();
        if (!items[0].equals("empty")) {
            for (String item : items) {
                // Try to parse as integer first
                try {
                    set.add(Integer.parseInt(item));
                } catch (NumberFormatException e) {
                    set.add(item);
                }
            }
        }
        
        // Read input
        String inputStr = scanner.nextLine();
        Object input;
        try {
            input = Integer.parseInt(inputStr);
        } catch (NumberFormatException e) {
            input = inputStr;
        }
        
        // Read operation
        String operation = scanner.nextLine();
        
        System.out.println(processHashSet(set, input, operation));
    }
}