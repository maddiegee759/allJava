public class ch10_4_1 {
    // Write your calculateArea methods here
    public static void calculateArea(int l){
        System.out.println("Square area with side " + l + ": " + l*l);
    }

    public static void calculateArea(int l, int b){
        System.out.println("Rectangle area with length " + l + " and width " + b + ": " + l*b);
    }

    public static void calculateArea(double r){
        System.out.println("Circle area with radius " + r + ": " + 3.14*r*r);
    }
    
    public static void main(String[] args) {
        // Test your methods with these exact values
        calculateArea(5);          // square
        calculateArea(4, 6);       // rectangle
        calculateArea(2.5);        // circle
    }
}
