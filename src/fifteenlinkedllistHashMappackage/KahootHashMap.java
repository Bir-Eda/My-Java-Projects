package fifteenlinkedllistHashMappackage;
//import java.util.Arrays;
import java.util.HashMap;

public class KahootHashMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        String a="aaabbb";
        for(int i=0; i<a.length(); i++){
            freq.put((int)a.charAt(i),i);
        }
        System.out.println(freq);
    }
}