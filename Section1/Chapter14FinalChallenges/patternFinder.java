import java.util.Scanner;

public class patternFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arrString1 = scanner.nextLine();
        String arrString2 = scanner.nextLine();
        
        String[] str1 = arrString1.split(",");
        String[] str2 = arrString2.split(",");
        
        String[] window = new String[str2.length];
        boolean found = false;

        for (int start = 0; start <= str1.length - str2.length; start++) {
            boolean windowMatches = true;

            for (int i = 0; i < str2.length; i++) {
                window[i] = str1[start + i];

                if (!str2[i].equals(window[i])) {
                    windowMatches = false;
                    break;
                }
            }

            if (windowMatches) {
                found = true;
                break;
            }
        }

        System.out.println(found);

        scanner.close();
    }
}

