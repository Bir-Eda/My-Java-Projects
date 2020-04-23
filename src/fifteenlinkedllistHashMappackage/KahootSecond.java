package fifteenlinkedllistHashMappackage;
//import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;
public class KahootSecond {
    public static void main(String[] args) {
        HashMap<Character, Character> freq = new HashMap<>(10);
        String a = "aabb";
        char x;
        for (int i = 0; i < a.length(); i++) {
            x = a.charAt(i);
            x++;
            freq.put(a.charAt(i), x);


            System.out.println(freq);
        }
    }
}
