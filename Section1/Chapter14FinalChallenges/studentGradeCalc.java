import java.util.Scanner;

public class studentGradeCalc {
    public static double calculateAverageGrade(int[] grades) {
        double sum = 0;
        for (double grade : grades){
            sum += grade;
        }
        double averageGrade = sum / grades.length;

        return averageGrade;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] stringArr = text.split(",");
        int[] studentGrades = new int[stringArr.length];
        for (int i = 0; i < stringArr.length; i++) {
           studentGrades[i] = Integer.parseInt(stringArr[i]);
        }
        double averageGrade = calculateAverageGrade(studentGrades);
        System.out.printf("Average grade: %.2f", averageGrade);

        scanner.close();
        System.exit(0);
    }
}
