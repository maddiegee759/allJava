public class ch10_1_1 {
    // Write your methods here
    public static void printHeader(){
        System.out.println("=================\nEvent Schedule\n=================");
    }

    public static void printEvent() {
        System.out.println(">> Main Event <<\nTime: 7:00 PM\nLocation: Hall A");
    }

    public static void printFooter() {
        System.out.println("=================\nThank You!\n=================");
    }
    
    public static void main(String[] args) {
        // Call the methods in correct order
        printHeader();
        printEvent();
        printEvent();
        printEvent();
        printFooter();
        
    }
}
