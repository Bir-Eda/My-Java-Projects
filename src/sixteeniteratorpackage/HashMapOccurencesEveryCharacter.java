package sixteeniteratorpackage;

import java.util.HashMap;

public class HashMapOccurencesEveryCharacter {
    public static void main(String[] args) {
        String test=("Java");
        character(test);
    }
    public static void character(String arr) {
        HashMap<Character, Integer> word = new HashMap<>();
        char key;
        int value;
        for (int i=0; i<arr.length(); i++) {
            key=arr.charAt(i);
            if (word.containsKey(key)){
                value=word.get(key);
                word.put(key, value+1);
            } else {
                word.put(key,1);
            }
        }
        System.out.println(word);
    }
}
