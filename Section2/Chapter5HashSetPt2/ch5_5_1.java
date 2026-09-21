import java.util.HashSet;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class ch5_5_1 {
    public static void checkProperSubsetSuperset(HashSet<String> setA, HashSet<String> setB) {
        // Write your code here
        boolean check1, check2, check3, check4;
        check1 = check2 = check3 = check4 = false;
        if (setB.containsAll(setA)) {
            check1 = true;
        }
        System.out.println("setA is a subset of setB: " + check1);

        if (setA.containsAll(setB)) {
            check2 = true;
        }
        System.out.println("setA is a superset of setB: " + check2);

        if (check1 && setB.size() > setA.size()) {
            check3 = true;
        }
        System.out.println("setA is a proper subset of setB: " + check3);

        if (check2 && setA.size() > setB.size()) {
            check4 = true;
        }
        System.out.println("setA is a proper superset of setB: " + check4);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String setAString = scanner.nextLine();
        String setBString = scanner.nextLine();
        
        Type setType = new TypeToken<HashSet<String>>(){}.getType();
        HashSet<String> setA = new Gson().fromJson(setAString, setType);
        HashSet<String> setB = new Gson().fromJson(setBString, setType);
        
        checkProperSubsetSuperset(setA, setB);
    }
}
