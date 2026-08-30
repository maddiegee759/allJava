import java.util.Scanner;

public class ch13_4_0 {
    public static void compareStrings(String str1, String str2) {
        // Write your code here
        System.out.println(str1 + " equals " + str2 + ": " + str1.equals(str2));
        System.out.println(str1 + " equalsIgnoreCase " + str2 + ": " + str1.equalsIgnoreCase(str2));
        System.out.println(str1 + " compareTo " + str2 + ": " + str1.compareTo(str2));
        System.out.println(str1 + " compareToIgnoreCase " + str2 + ": " + str1.compareToIgnoreCase(str2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        compareStrings(str1, str2);

        scanner.close();
    }
}
