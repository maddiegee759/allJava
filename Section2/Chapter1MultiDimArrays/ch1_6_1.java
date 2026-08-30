public class ch1_6_1 {
    public static void processGrades(int numStudents, int[] subjectsPerStudent) {
        int[][] newMatrix = new int[numStudents][];

        for (int i = 0; i < numStudents; i++){
            newMatrix[i] = new int[subjectsPerStudent[i]];
            for (int j = 0; j < subjectsPerStudent[i]; j++){
                newMatrix[i][j] = (i + 1) * 10 + (j + 1);
            }
        }

        
        for (int[] x: newMatrix) {
            for (int elem: x){
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int x = 2;
        int[] y = {3,3};
        processGrades(x, y);
    }
}
