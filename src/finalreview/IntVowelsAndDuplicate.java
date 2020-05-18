package finalreview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntVowelsAndDuplicate {
    public static void main(String[] args) {
        System.out.println(sigilize("i am healthy"));
    }
    public static String sigilize(String desire) {
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < desire.length(); i++) {
            if (!isVowel(desire.charAt(i))) hs.add(desire.charAt(i));
        }
        return hs.toString().toUpperCase();
    }
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return  (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) ;
    }
}