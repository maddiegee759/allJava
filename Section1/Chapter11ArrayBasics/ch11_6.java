import java.util.Scanner;
import java.util.Arrays;

public class ch11_6 {
    public static int[] reverse(int[] arr) {
        // Write your code below
        int arrayLength = arr.length;
        int[] reversedArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++){
            reversedArray[i] = arr[(arrayLength-1)-i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] arr = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
            arr[i] = Integer.parseInt(stringArr[i]);
        }
        
        int[] result = reverse(arr);
        System.out.println("The reversed array is: " + Arrays.toString(result));
    
        scanner.close();
    }
}
