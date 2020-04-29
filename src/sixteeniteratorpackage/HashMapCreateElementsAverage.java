package sixteeniteratorpackage;

import java.util.HashMap;

public class HashMapCreateElementsAverage {
    public static void main(String[] args) {
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("Los Angeles", 85);
        hm.put("Chicago", 30);
        hm.put("Boston", 65);
        hm.put("Texas", 97);

        int average=0;
        for (int degree : hm.values()){
            average+=degree;
        }
        System.out.println("Average Temp : "+(average/hm.size()));
    }

}

