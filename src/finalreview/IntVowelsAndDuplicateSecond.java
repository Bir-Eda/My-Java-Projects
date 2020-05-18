package finalreview;
import java.util.Arrays;
import java.util.List;
public class IntVowelsAndDuplicateSecond {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("i am healthy...");
        //  String str= sb.toString ();
        Character vowels[] = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> ar = Arrays.asList(vowels);
        for (int i = 0; i < sb.length(); i++) {
            if (ar.contains(sb.charAt(i))) {
                sb.replace(i, i + 1, " ");
            }
        }
        String str = null;
        str = String.valueOf(sb);
        str = str.replaceAll(" ", "");
        System.out.println(str.toUpperCase());

    }
}
