package sixteeniteratorpackage;
import java.util.HashSet;
public class HashSetFindStringUniqCharT {
    public static void main(String[] args) {
        String word = "abcdea";
        System.out.println(isAllCharUnique(word));
        System.out.println(isAllCharUnique(word, true));
    }
    public static boolean isAllCharUnique(String word) {
        HashSet<Character> chars = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            chars.add(word.charAt(i));
        }
        // System.out.println(chars);
        String result = chars.toString();
        if (word.length() == chars.size()) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isAllCharUnique(String word, boolean x) {
        HashSet<Character> chars = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            chars.add(word.charAt(i));
        }
        String wordUnique = chars.toString();
        System.out.println(wordUnique);
        if (word.equals(wordUnique)) {
            return true;
        } else {
            return false;
        }
    }
}
