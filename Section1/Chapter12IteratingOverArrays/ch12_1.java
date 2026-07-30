import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class ch12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arr = text.split(",");
        // Write your code below
        ArrayList<String> longArr = new ArrayList<String>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i].length() > 5){
                longArr.add(arr[i]);
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(longArr);
    
        scanner.close();
    }
}
