package interview_questions;

import java.util.HashMap;

public class StringHello {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String(s1);
        System.out.println((s1==s2)+ " " +(s1.equals(s2)));

        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(null, null);
        map.put(null, null);
        map.put(1, null);
        map.put(2, null);
        map.put(1,2);
        map.put(null, 1);
        System.out.println(map);

    }
}
