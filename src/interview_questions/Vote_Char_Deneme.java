package interview_questions;

import java.util.TreeMap;


public class Vote_Char_Deneme {
    public static void main(String[] args) {
        char array[] = {'d', 'c', 'a', 's', 'x', 'a', 's', 'c', 's'};
        duplicateChar(array);
    }

    public static void duplicateChar(char arr[]) {
        TreeMap<Character, Integer> map= new TreeMap<>();
        for(int i=0; i<arr.length; i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }
            else{
                map.put(arr[i], map.get(arr[i])+1);
            }
        }
        System.out.println(map);
        for(Character c:map.keySet()){
            if(map.get(c)>1){
                System.out.println(c+"="+map.get(c));
            }
        }

    }
}