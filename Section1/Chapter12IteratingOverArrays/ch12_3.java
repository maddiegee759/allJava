import java.util.Scanner;

public class ch12_3 {
    public static double[] calculateStats(int[] arr) {
        double[] stats = new double[4];

        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        stats[0] = sum;

        stats[1] = sum / arr.length;

        int max = arr[0];

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        stats[2] = max;
        stats[3] = min;
        return stats;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] arrString = text.split(",");
        int[] numbers = new int[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
           numbers[i] = Integer.parseInt(arrString[i]);
        }
        double[] stats = calculateStats(numbers);
        System.out.println("Sum: " + stats[0]);
        System.out.println("Average: " + stats[1]);
        System.out.println("Maximum: " + stats[2]);
        System.out.println("Minimum: " + stats[3]);
 
        scanner.close();
    }
}
