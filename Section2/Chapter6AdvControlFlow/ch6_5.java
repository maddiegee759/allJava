import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch6_5 {
    public static String processArray(Object[] data, String type) {
        // Write your code here
        if (data == null) return "Invalid input";
        if (type.equals("invalid")) return "Invalid type";

        switch (type) {
            case "sum":
                double sum = 0;
                for (int i = 0; i < data.length; i++) {
                    if (data[i] instanceof Double num) {
                        sum += num;
                    }
                }
                return "Sum: " + sum;
            case "find":
                search: for(int i = 0; i < data.length; i++) {
                    if (data[i] instanceof Double num) {
                        if (num > 100) {
                            return Integer.toString(i);
                        }
                    }
                    else {
                        continue search;
                    }
                }
                return "Not found";
        };
        return "default";
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dataJson = scanner.nextLine();
        String type = scanner.nextLine();
        
        Type arrayType = new TypeToken<Object[]>(){}.getType();
        Object[] data = new Gson().fromJson(dataJson, arrayType);
        
        System.out.println(processArray(data, type));
    }
}