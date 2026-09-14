import java.util.HashMap;
public class ch2_2 {
    public static HashMap<String, String> createStringStringMap() {
        // Write your code here
        HashMap<String, String> fruit = new HashMap<>();
        fruit.put("apple", "red");
        fruit.put("banana", "yellow");
        fruit.put("grape", "purple");

        return fruit;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createStringStringMap();
        
        // Print the HashMap
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }
}