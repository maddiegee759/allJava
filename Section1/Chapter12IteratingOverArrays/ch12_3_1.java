public class ch12_3_1 {
    public static String getClassStats(int[] grades) {
        // Write your code here
        double sum = 0;
        int min = grades[0];
        int max = grades[0];
        int passCount = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            
            if (grades[i] > max) {
                max = grades[i];
            }
            else if (grades[i] < min) {
                min = grades[i];
            }
            
            if (grades[i] >= 60) {
                passCount += 1;
            }
        }

        String output = "Class Average: " + sum/grades.length + "\nHighest Grade: " + max + "\nLowest Grade: " + min + "\nPassing Grades: " + passCount + "/" + grades.length;
        return output;
    }
    
    
    public static String getLetterGrades(int[] grades) {
        // Write your code here
        int countA, countB, countC, countD, countF;
        countA = countB = countC = countD = countF = 0;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 90) {
                countA += 1;
            }
            else if (grades[i] >= 80) {
                countB += 1;
            }
            else if (grades[i] >= 70) {
                countC += 1;
            }
            else if (grades[i] >= 60) {
                countD += 1;
            }
            else {
                countF += 1;
            }
        }

        String output = "A (90-100): " + countA + "\nB (80-89): " + countB + "\nC (70-79): " + countC + "\nD (60-69): " + countD + "\nF (0-59): " + countF;
        return output;
    }
    
    public static String getImprovement(int[] start, int[] end) {
        // Write your code here
        int maxDiff = end[0] - start[0];
        int tempDiff;
        double sum = 0;
        int arrayLength = start.length;
        int improved = arrayLength;
        for (int i = 0; i < arrayLength; i++) {
            tempDiff = end[i] - start[i];

            sum += tempDiff;

            if (tempDiff <= 0) {
                improved -= 1;
            }
            else {
                if (tempDiff > maxDiff) {
                    maxDiff =  tempDiff;
                }
            }
        }

        String output = "Average Improvement: " + sum/arrayLength + " points\nMost Improved: " + maxDiff + " points\nStudents Improved: " + improved + "/" + arrayLength;
        return output;
    }
    
    public static void main(String[] args) {
        // Test data
        int[] grades = {85, 92, 78, 65, 88, 72, 89, 98, 93, 77};
        int[] startGrades = {72, 85, 68, 90, 77};
        int[] endGrades = {84, 90, 75, 92, 80};
        
        // Test getClassStats
        System.out.println("Class Statistics:");
        System.out.println(getClassStats(grades));
        
        // Test getLetterGrades
        System.out.println("\nGrade Distribution:");
        System.out.println(getLetterGrades(grades));
        
        // Test getImprovement
        System.out.println("\nImprovement Analysis:");
        System.out.println(getImprovement(startGrades, endGrades));
    }
}
