public class ch3_45 {
    public static void main(String args[]){
        /*Type Casting Part 1
        In Java, we can convert integers to doubles, doubles to integers, and more. There are two types of casting: implicit (automatic) and explicit (manual) casting.

        For example integer to double: */

        //Implicit (automatic) casting:

        int number = 5;
        double decimal = number; //automatically becomes 5.0
        System.out.println("decimal: " + decimal);

        //with calculation
        int x = 7;
        double result = x / 2.0; //result is 3.5
        System.out.println("result: " + result);



        /* Type Casting Part 2
        It is also possible to convert number and booleans to string and vice versa. To convert a value to string we can use the String.valueOf() function: */
        int number1 = 789;
        double number2 = 789;
        boolean isValid = true;
        String text1 = String.valueOf(number1); // becomes "789"
        String text2 = String.valueOf(number2); // becomes "789.0"
        String text3 = String.valueOf(isValid); // becomes "true"
        System.out.println("text1: " + text1);
        System.out.println("text2: " + text2);
        System.out.println("text3: " + text3);


        // To convert a string to a different type is a bit more complicated:

        // String to Integer:

        String numberText = "123";
        int num = Integer.parseInt(numberText);    // becomes 123
        System.out.println("num: " + num);

        // String to Double:

        String decimalText = "45.67";
        double dec = Double.parseDouble(decimalText);    // becomes 45.67
        System.out.println("dec: " + dec);
        // String to Boolean:

        String boolText = "true";
        boolean bool = Boolean.parseBoolean(boolText); // becomes true
        System.out.println("bool: " + bool);
        // parseBoolean will convert any case-insensitive string that has the value “true”. For example True, tRue, TRUE will all become true

        // Trying to convert a string to an invalid type will result in an error:
        // String invalidNumber = "abc";
        // int newNum = Integer.parseInt(invalidNumber); // This will cause a NumberFormatException
    }
}
