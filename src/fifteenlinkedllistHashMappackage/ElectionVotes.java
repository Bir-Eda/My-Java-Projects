package fifteenlinkedllistHashMappackage;

import java.lang.reflect.Type;
import java.util.*;

public class ElectionVotes {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        String[] sentence = {"Ada", "Adem", "Ada", "Ada", "Adem", "Bill", "Adem", "Bill"};
        votesElection(sentence);

    }
    public static void votesElection(String[] name) {
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

        }
        List<String> list = new ArrayList<>();
        System.out.println(map);
        int max = 0;
        String winner = " ";
        for (String elements : map.keySet()) {
            if (map.get(elements) > max) {
                max = map.get(elements);
                list.add(elements);
                winner = elements;
            }
        }
        System.out.println(winner + " has total votes: " + max);
        System.out.println(list);
        Collections.sort(list);

}
//     public Map<String, String> getOrderConfirmationResponseBodyAsMap(){
//        Type type = new TypeToken<Map<String, String>>(){}.getType();
//     }
}

























