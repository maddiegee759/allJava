public class ch11_3_1 {
    // Write your methods here
    public static void improveGrade(int[] gs, int index){
        gs[index] += + 5;
        if (gs[index] > 100){
            gs[index] = 100;
        }
    }

    public static void replaceFailingGrade(int[] gs){
        for (int i = 0; i < gs.length; i++){
            if (gs[i] < 60){
                gs[i] = 60;
            }
        }
    }

    public static void addBonusPoints(int[] gs){
        for (int i = 0; i < gs.length; i++){
            gs[i] += 2;
        }
    }
    
    public static void main(String[] args) {
        // Test your methods with these values
        int[] grades = {70, 85, 55};
        
        improveGrade(grades, 0);
        System.out.print("After improving grade: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
         
        replaceFailingGrade(grades);
        System.out.print("After replacing failing: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
        addBonusPoints(grades);
        System.out.print("After adding bonus: [");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) System.out.print(", ");
        }
        System.out.println("]");
        
    }
}
