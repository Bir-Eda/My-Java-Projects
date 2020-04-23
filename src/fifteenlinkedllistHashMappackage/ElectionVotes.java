package fifteenlinkedllistHashMappackage;

import java.util.HashMap;

public class ElectionVotes {
    public static void main(String[] args) {
        HashMap<String, Integer> obj = new HashMap<>();
        String []sentence={"John", "Adam","John", "Adam", "Bill", "Adam"};
       votesElection(sentence);

    }

    public static void votesElection(String []name) {
        HashMap<String, Integer> map = new HashMap<>();
        int count =0;
        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                if (name[i].equalsIgnoreCase(name[j])) {
                    count = count + 1;
                }
            }
            map.put(name[i] ,count);
            count = 0;

        }
        System.out.println(map);
        int max=0;
        String winner=" ";
        for(String elements: map.keySet()){
            if(map.get(elements)>max){
                max=map.get(elements);
                winner=elements;
            }
        }
        System.out.println(winner+ " has total votes: "+max);
    }
}
