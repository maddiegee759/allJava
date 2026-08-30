public class ch7_2_1 {
    public static void main(String[] args) {
        // Item information
        String item1 = "T-shirt";
        String item2 = "Jeans";
        String item3 = "Hat";
        double price1 = 19.99;
        double price2 = 45.50;
        double price3 = 12.00;
        
        // Calculate totals
        double subtotal = price1 + price2 + price3;
        double tax = subtotal * 0.08;
        double total = subtotal + tax;
        
        // Create receipt
        System.out.println("STORE RECEIPT");
        System.out.println("-------------");
        System.out.printf("%s: $%.2f\n", item1, price1);
        System.out.printf("%s: $%.2f\n", item2, price2);
        System.out.printf("%s: $%.2f\n", item3, price3);
        System.out.println("-------------");
        System.out.printf("Subtotal: $%.2f\n", subtotal);
        /* System.out.print("Tax (8%): ");
        System.out.printf("$%.2f\n", tax); */
        System.out.printf("Tax (8%%): $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
