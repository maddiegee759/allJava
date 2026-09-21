import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch5_6_1 {
    public static void printSetWithCount(HashSet<String> set) {
        // Write your code here using a for-each loop
        for (String elem: set) {
            System.out.println(elem);
        }
        System.out.println("Total elements: " + set.size());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Read a JSON string representing a HashSet of strings, see the instructions for an example
        String setString = scanner.nextLine();

        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> mySet = new Gson().fromJson(setString, setType);

        printSetWithCount(mySet);
    }
}
