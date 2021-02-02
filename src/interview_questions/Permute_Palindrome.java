package interview_questions;

import java.util.HashMap;
import java.util.Map;

public class Permute_Palindrome {
    public static void main(String[] args) {
        String str="velel";
        System.out.println(canMakePalindrom(str));
    }
    private static boolean canMakePalindrom(String s) {
        Map<Character, Integer> countChars = new HashMap<>();
        // Count the occurrences of each character
        for (char c : s.toCharArray()) {
            Integer count = countChars.get(c);
            if (count == null) {
                count = Integer.valueOf(1);
            } else {
                count = count + 1;
            }
            countChars.put(c, count);
        }

        boolean hasOdd = false;
        for (int count : countChars.values()) {
            if (count % 2 == 1) {
                if (hasOdd) {
                    // Found two chars with odd counts - return false;
                    return false;
                } else {
                    // Found the first char with odd count
                    hasOdd = true;
                }
            }
        }
        // Haven't found more than one char with an odd count
        return true;
    }
}
