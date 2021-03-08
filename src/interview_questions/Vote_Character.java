package interview_questions;

import java.util.TreeMap;

public class Vote_Character {
    public static void main(String[] args) {
        char[] arr = {'a', 'd', 'e', 'f', 'c', 'd', 'd', 'e'};
        eda1(arr);
    }
    public static void eda1(char[] arr) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
        System.out.println(map);
        for (Character a:map.keySet()) {
            if(map.get(a)>1){
                System.out.println(a+" = "+map.get(a));
            }
        }
    }
}
