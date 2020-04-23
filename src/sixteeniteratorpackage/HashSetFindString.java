package sixteeniteratorpackage;
import java.util.HashMap;
import java.util.HashSet;
public class HashSetFindString {
    public static void main(String[] args) {
        System.out.println(findUnique("abcde"));

    }
    public static boolean findUnique(String word) {
        boolean result = false;
        HashSet<Character> mySet = new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            mySet.add(word.charAt(i));
        }
        if (mySet.size() == word.length()) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}