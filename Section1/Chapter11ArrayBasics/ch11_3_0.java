import java.util.Scanner;

public class ch11_3_0 {
    public static String[] changeElement(String[] arr, int index, String newElement) {
        // Write code here
        arr[index] = newElement;
        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String textArray = scanner.nextLine();
        int index = scanner.nextInt();
        scanner.nextLine();
        String newElement = scanner.nextLine();
        String[] arr = textArray.split(",");
        String[] modifiedArr = changeElement(arr, index, newElement);
        for (int i = 0; i < modifiedArr.length; i++) {
            System.out.print(modifiedArr[i] + " ");
        }

        scanner.close();
    }
}
