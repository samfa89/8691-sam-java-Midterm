package string_problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {

    public static void main(String[] args) {
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        // Print the map
        for (Map.Entry<Integer, String> entry : wordNLength.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Integer, String> findTheLargestWord(String sentence) {
        Map<Integer, String> map = new HashMap<>();

        String[] words = sentence.split(" ");

        int maxLength = 0;
        String longestWord = "";

        for (String word : words) {
            int length = word.length();
            if (length > maxLength) {
                maxLength = length;
                longestWord = word;
            }
        }

        map.put(maxLength, longestWord);

        return map;
    }
}
