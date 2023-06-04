package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        Map<String, Integer> wordOccurrences = new HashMap<>();
        String[] words = st.toLowerCase().split(" ");

        int totalLength = 0;
        int wordCount = 0;

        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]+", ""); // Remove non-alphabetic characters
            if (word.length() > 0) {
                wordCount++;
                totalLength += word.length();

                if (wordOccurrences.containsKey(word)) {
                    int count = wordOccurrences.get(word);
                    wordOccurrences.put(word, count + 1);
                } else {
                    wordOccurrences.put(word, 1);
                }
            }
        }

        double averageLength = (double) totalLength / wordCount;

        System.out.println("Duplicate Words and Occurrences:");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            if (count > 1) {
                System.out.println(word + ": " + count);
            }
        }

        System.out.println("Average Length of Words: " + averageLength);
    }
}

