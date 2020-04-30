package seventeentreemappackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class HashMapFrequency {
    public static void main(String[] args) {
        String sentence = "the weather is good, so good today but yesterday weather was good too";
        ArrayList<String> list = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        HashMap<String,Integer> hm = new HashMap<>();
        for(String word : list){
            hm.put(word, Collections.frequency(list,word));
        }
        System.out.println(hm);

    }
        }

