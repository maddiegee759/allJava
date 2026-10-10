import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class project {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        
        String[] sentences = text.split("\\.");
        String[][] textArray = new String[sentences.length][];
        
        // Write your code here
        String word;
        int totalWords = 0;
        String stat;    
        double percent;
        TreeMap<String, Integer> sortedStats = new TreeMap<>();

        for (int i = 0; i < sentences.length; i++) {
            textArray[i] = sentences[i].trim().split(" ");
        }

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < textArray[i].length; j++) {
                // Remove punctuation and convert to lowercase
                word = textArray[i][j].replaceAll("[^a-zA-Z ]", "").toLowerCase();
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);

                totalWords += 1;
            }
        }

        System.out.println("Total words: " + totalWords);
        System.out.println("Unique words: " + wordCount.size());
        System.out.println("Word statistics:");
        
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            sortedStats.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> entry : sortedStats.entrySet()) {
            percent = entry.getValue();
            percent /= totalWords;
            percent *= 100;
            System.out.printf("%s: %d (%.2f%%)\n", entry.getKey(), entry.getValue(), percent);
        }


    }
}