package interview_questions.overloading_overriding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Repeading_Question {
    public static void main(String[] args) {
        String name="Sunday is funday, java is fun";
       name= name.toLowerCase();
        // I need to seperate the letters and find the repeating
        Map<Character, Integer> map = new HashMap<>();
        char [] letters=name.toCharArray();
       // System.out.println(Arrays.toString(letters));

        int counter=0;
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < letters.length; j++) {
                if(letters[i]==letters[j]){
                        counter++;
                }
            }
            map.put(letters[i], counter);
            counter=0;

                // I need to loop through the themletters and count
                // String word=
                // Map<String, Integer> map=new
            }
        System.out.println(map);
        }



}
   /* public static void votesElection(String[] name) {
        HashMap<String, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                if (name[i].equalsIgnoreCase(name[j])) {
                    count = count + 1;
                }
            }
            map.put(name[i], count);
            count = 0;

        } */