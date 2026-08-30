public class ch13_2_1 {
    // Write your methods here
    public static String formatCourseInfo(String courseInfo) {
        String[] split = courseInfo.split(":");
        String output = "Course Code: " + split[0] + "\nCourse Name: " + split[1] + "\nDays: " + split[2] + "\nTime: " + split[3];
        return output;
    }

    public static String createCourseList(String[] courseCodes) {
        String list = String.join(", ",courseCodes);
        String output = "Available Courses: " + list;
        return output;
    }
    
    public static String formatSchedule(String days) {
        String[] splitInput = days.split(",");
        String output = String.join(" | ",splitInput);
        return output;
    }
    
    public static void main(String[] args) {
        // Test data
        String courseInfo = "MATH101:Algebra:Monday,Wednesday:9AM";
        String[] courseCodes = {"MATH101", "ENG202", "HIST101"};
        String days = "Monday,Wednesday,Friday";
        
        // Test your methods
        System.out.println("Course Information:");
        System.out.println(formatCourseInfo(courseInfo));
        
        System.out.println("\nCourse List:");
        System.out.println(createCourseList(courseCodes));
        
        System.out.println("\nSchedule Format:");
        System.out.println(formatSchedule(days));
    }
}
