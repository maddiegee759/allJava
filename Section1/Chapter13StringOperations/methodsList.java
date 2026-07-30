import java.util.Arrays;

public class methodsList {
    public static void main(String[] args){
        String message = "Hello, World!";
        int length = message.length();
        char firstChar = message.charAt(0);
        String sub = message.substring(7);
        String sub2 = message.substring(7, 12);
        int index = message.indexOf("World");
        boolean starts = message.startsWith("Hello");
        String lower = message.toLowerCase();

        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + sub);
        System.out.println("Substring 2: " + sub2);
        System.out.println("Index of 'World': " + index);
        System.out.println("Starts with 'Hello': " + starts);
        System.out.println("Lowercase: " + lower);


        String text = "apple banana cherry";
        String[] fruits = text.split(" ");
        System.out.println(Arrays.toString(fruits));
        // ["apple", "banana", "cherry"]


        String[] words = {"Hello", "World", "Java"};
        String text2 = String.join(" ", words);
        System.out.println(text2);
        // "Hello World Java"



        String str1 = "hello";
        String str2 = "hello";
        String str3 = "HELLO";
        String str4 = "world";

        boolean eq1 = str1.equals(str2); // true
        boolean eq2 = str1.equals(str3); // false
        boolean eq3 = str1.equalsIgnoreCase(str3); // true

        int cmp1 = str1.compareTo(str2); // 0
        int cmp2 = str1.compareTo(str4); // negative value
        int cmp3 = str4.compareTo(str1); // positive value
        int cmp4 = str1.compareToIgnoreCase(str3); // 0
    }
}
