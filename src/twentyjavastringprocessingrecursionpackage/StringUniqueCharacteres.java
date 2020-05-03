package twentyjavastringprocessingrecursionpackage;

import java.util.ArrayList;
import java.util.HashSet;

public class StringUniqueCharacteres {
    public static void main(String[] args) {
        String str="abc";
        isAllCharUnique(str);
        System.out.println(isAllCharUnique(str));
        String word [] = {"abchhdea", "abc","abcdb","bbb"};
        System.out.println(result(word));
    }
    public static boolean isAllCharUnique(String str) {
        HashSet<Character> hs = new HashSet<>();
        boolean result = false;
        for (int i = 0; i < str.length(); i++) {
            hs.add(str.charAt(i));
        }
        if (hs.size() == str.length()) {
            result = true;
        }
        return result;
    }
        public static ArrayList<String> result(String []arr){
            ArrayList<String>list= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(isAllCharUnique(arr[i]));
            list.add(arr[i]);
        }
        return list;
    }
}
