import java.util.Scanner;

public class ch8_6 {
    public static String formatData(String name, double price, int quantity, String format) {
        // Write your code here
        if (name == null || format == null){return "Invalid input";}
        if (format.equals("basic")) {
            return String.format("ITEM: %s, PRICE: $%.2f", name, price);
        }
        else if (format.equals("detailed")) {
            return String.format("PRODUCT: %s\nPRICE: $%.2f\nQUANTITY: %d", name, price, quantity);
        }
        else if (format.equals("total")) {
            return String.format("TOTAL FOR %dx %s: $%.2f", quantity, name, price*quantity);
        }
        else {
            return "Invalid input";
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double price = Double.parseDouble(scanner.nextLine());
        int quantity = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();
        
        if (name.equals("null")) name = null;
        if (format.equals("null")) format = null;
        
        System.out.println(formatData(name, price, quantity, format));
    }
}