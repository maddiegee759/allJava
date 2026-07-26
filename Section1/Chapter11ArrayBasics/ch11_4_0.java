import java.util.Arrays;
import java.util.Scanner;

public class ch11_4_0 {
    public static String[] merge(String[] arr1, String[] arr2) {
        // Write code here
        // length of arrays needed for creating new array and copying correctly
        int arrayLength1 = arr1.length;
        int arrayLength2 = arr2.length;
        int mergedArrayLength = arrayLength1 + arrayLength2;

        String[] mergedArray = new String[mergedArrayLength];
        
        // System.arraycopy(sourceArray, sourceStartPosition, destinationArray, destinationStartPosition, length)
        System.arraycopy(arr1, 0, mergedArray, 0, arrayLength1);
        System.arraycopy(arr2, 0, mergedArray, arrayLength1, arrayLength2);

        Arrays.sort(mergedArray);

        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArr1 = scanner.nextLine();
        String textArr2 = scanner.nextLine();
        String[] arr1 = textArr1.split(",");
        String[] arr2 = textArr2.split(",");

        String[] mergedArray = merge(arr1, arr2);
        System.out.println(Arrays.toString(mergedArray));
    
        scanner.close();
    }
}
