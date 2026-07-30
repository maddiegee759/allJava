import java.util.Scanner;

public class ch13_3_0 {
    public static String createFormattedString(String productName, int quantity, double unitPrice) {
        // Write your code here
        // convert quantity
        double qty = quantity;
        //Product: [productName], Quantity: [quantity], Unit Price: [unitPrice]
        String formattedString = String.format("Product: %s, Quantity: %.1f, Unit Price: %.5f", productName, qty, unitPrice);        
        return formattedString;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int qty = scanner.nextInt();
        double price = scanner.nextDouble();
        String formattedString = createFormattedString(product, qty, price);
        System.out.println(formattedString);

        scanner.close();
    }
}
