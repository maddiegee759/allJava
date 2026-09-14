import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch3_6 {
    public static HashMap<String, Object> processHashMap(HashMap<String, Double> products) {
        HashMap<String, Object> output = new HashMap<>();
        double maxPrice = 0;
        String max = "";
        
            HashMap<String, Double> filtered = new HashMap<>();


        if (products.isEmpty()) {
            output.put("Average", 0.0);
        }
        else {
            // 1. highest price
            for (Map.Entry<String, Double> entry : products.entrySet()) {
                if (entry.getValue() > maxPrice) {
                    maxPrice = entry.getValue();
                    max = entry.getKey();
                }
            }

            // 2. filter
            for (Map.Entry<String, Double> entry : products.entrySet()) {
                if (entry.getValue() > 50.00) {
                    filtered.put(entry.getKey(), entry.getValue());
                }
            }
            
            // 3. calulate average
            double sum, average;
            sum = average = 0;
            for (Map.Entry<String, Double> entry : products.entrySet()) {
                sum += entry.getValue();
            }
            average = sum / products.size();
            
            
            output.put("Average", average);
            }
            
        output.put("Filtered", filtered);
        output.put("Highest", max);

        return output;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String productsString = scanner.nextLine();

        // Convert JSON string to HashMap
        Type mapType = new TypeToken<HashMap<String, Double>>(){}.getType();
        HashMap<String, Double> products = new Gson().fromJson(productsString, mapType);

        HashMap<String, Object> result = processHashMap(products);

        // Sort the Filtered map to ensure consistent output
        Map<String, Double> filteredMap = (Map<String, Double>) result.get("Filtered");
        if (filteredMap != null && !filteredMap.isEmpty()) {
            Map<String, Double> sortedFiltered = filteredMap.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(
                    Map.Entry::getKey,
                    Map.Entry::getValue,
                    (a, b) -> b,
                    LinkedHashMap::new
                ));
            result.put("Filtered", sortedFiltered);
        }
        
        System.out.println(result);
    }
}