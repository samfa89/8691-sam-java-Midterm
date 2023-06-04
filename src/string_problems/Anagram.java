package string_problems;

import java.util.Arrays;

public class Anagram {

    /**
     * Checks if two strings are anagrams.
     *
     * @param str1 the first string
     * @param str2 the second string
     * @return true if the strings are anagrams, false otherwise
     */
    public static boolean isAnagram(String str1, String str2) {
        // Remove whitespace and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Convert the strings to character arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted character arrays
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        String str1 = "CAT";
        String str2 = "ACT";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram(str1, str2));

        str1 = "ARMY";
        str2 = "MARY";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram(str1, str2));

        str1 = "FART";
        str2 = "RAFT";
        System.out.println("Are '" + str1 + "' and '" + str2 + "' anagrams? " + isAnagram(str1, str2));
    }
}
