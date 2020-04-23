package fifteenlinkedllistHashMappackage;

import java.util.HashMap;

public class KahootFirst {
    public static void main(String[] args) {
        HashMap<Character, Integer> freq = new HashMap<>();
        String a="aabb";
        char x;
        for(int i=0; i<a.length(); i++){
            x=a.charAt(i);
            x+=i;
            freq.put(x,i);
        }
        System.out.println(freq);
    }
}
