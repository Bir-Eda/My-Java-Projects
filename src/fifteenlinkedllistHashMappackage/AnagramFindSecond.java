package fifteenlinkedllistHashMappackage;

import java.util.HashMap;

public class AnagramFindSecond {
    public static void main(String[] args) {
        System.out.println(anagram("cat", "taca"));
        String words[]={"cat", "cta", "car","care"};
        findAnagram(words);
    }
    public static void findAnagram(String arr[]){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                if(i!=j){
                    if(anagram(arr[i], arr[j])){
                        System.out.println(arr[i]+" and "+arr[j]+" are anagram");
                    }
                }
            }
        }
    }

    public static boolean anagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        } else {
            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();
            for (int i = 0; i < word1.length(); i++) {
                if (map1.containsKey(word1.charAt(i))) {
                    map1.put(word1.charAt(i), map1.get(word1.charAt(i)) + 1);
                } else {
                    map1.put(word1.charAt(i), 1);
                }
                if (map2.containsKey(word2.charAt(i))) {
                    map2.put(word2.charAt(i), map2.get(word2.charAt(i)) + 1);
                } else {
                    map2.put(word2.charAt(i), 1);
                }
            }
            if (map1.equals(map2)) {
                return true;
            } else {

                return true;
            }
        }
    }
}
