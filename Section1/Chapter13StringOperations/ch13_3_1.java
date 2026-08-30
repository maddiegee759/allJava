public class ch13_3_1 {
    public static void main(String[] args) {
        // Initialize variables - don't modify these!
        String studentName = "john smith";
        int studentId = 123;
        double mathGrade = 92.5555;
        double scienceGrade = 88.7777;
        double englishGrade = 95.1111;
        double attendance = 0.8523;

        //headerInfo
        String[] splitInput = studentName.split(" ");
        
        for (int i = 0; i < splitInput.length; i++) {
            char firstLetter = splitInput[i].charAt(0);
            char upperFirst = Character.toUpperCase(firstLetter);
            splitInput[i] = upperFirst + splitInput[i].substring(1);
        }

        String formattedName = String.join(" ",splitInput);

        String formattedID = String.format("%05d", studentId);

        String headerInfo = "Student: " + formattedName + ", ID: " + formattedID;
        String gradesInfo = String.format("Math: %.2f, Science: %.2f, English: %.2f", mathGrade, scienceGrade, englishGrade);
        String attendanceInfo = String.format("Attendance: %.1f%%", attendance*100);
        
        // Don't modify the code below
        System.out.println("STUDENT REPORT CARD");
        System.out.println("------------------");
        System.out.println(headerInfo);
        System.out.println(gradesInfo);
        System.out.println(attendanceInfo);
    }
}
