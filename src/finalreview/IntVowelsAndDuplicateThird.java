package finalreview;
import java.util.HashSet;
public class IntVowelsAndDuplicateThird {
    public static void main(String[] args) {
        String str = "I am healty";
        removeVowel(str);
    }

    public static void removeVowel(String str) {
        HashSet<Character> hs = new HashSet();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
                    && str.charAt(i) != 'o' && str.charAt(i) != 'u') {
                if (hs.add(str.charAt(i))) {
                    String string = "";
                    string += str.charAt(i);
                    System.out.print(string);
                }
            }
        }
    }
}