import java.util.Scanner;

public class ch6_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();
        int time = scanner.nextInt();       // 24-hour format
        boolean isHoliday = scanner.nextBoolean();

        // Your code to determine ticket type and price
        String ticketType = "";
        int price = 0;

        // Check age ranges: CHILD (under 13), TEEN (13-17), ADULT (18-59), SENIOR (60+)
        // For ADULT: add $5 on holidays; subtract $3 for matinee (time < 1700)
        // For TEEN: add $3 on holidays
        // For CHILD: add $2 on holidays
        // For SENIOR: subtract $2 for matinee (time < 1700)

        if (age < 13) {
            ticketType = "CHILD";
            price = 8;
            if (isHoliday) {
                price += 2;
            }
        } else if (age < 18) {
            ticketType = "TEEN";
            price = 12;
            if (isHoliday) {
                price += 3;
            }
        } else if (age < 60) {
            ticketType = "ADULT";
            price = 15;
            if (isHoliday) {
                price += 5;
            }
            if (time < 1700) {
                price -= 3;
            }
        } else {
            ticketType = "SENIOR";
            price = 10;
            if (time < 1700) {
                price -= 2;
            }
        }

        // Don't modify the code below
        System.out.println("Customer Age: " + age);
        System.out.println("Show Time: " + time);
        System.out.println("Holiday? " + isHoliday);
        System.out.println("-------------------");
        System.out.println("Ticket Type: " + ticketType);
        System.out.println("Final Price: $" + price);
    }
}
