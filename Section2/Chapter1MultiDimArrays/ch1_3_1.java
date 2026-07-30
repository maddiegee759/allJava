public class ch1_3_1 {
    public static void printSum(int[][] array) {
        // Write your code here
        int sum = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
            }
            System.out.println("Row " + row + " sum: " + sum);
            sum = 0;
        }
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String arrayString = scanner.nextLine();
        
        //Type arrayType = new TypeToken<int[][]>(){}.getType();
        // int[][] array = new Gson().fromJson(arrayString, arrayType);
        
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        printSum(array);
    }
}