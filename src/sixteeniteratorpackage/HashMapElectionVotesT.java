package sixteeniteratorpackage;

import java.util.HashMap;

public class HashMapElectionVotesT {
    public static void main(String[] args) {
                String votes[]={"john", "johnny", "jackie",
                        "johnny", "john", "jackie",
                        "jamie", "jamie", "john",
                        "johnny", "jamie", "johnny",
                        "john"};
        HashMap<String, Integer> voteCounts=new HashMap<>();
        for(String candidate : votes){
            if(voteCounts.containsKey(candidate)){
                voteCounts.put(candidate,voteCounts.get(voteCounts)+1);
            }
            else{
                voteCounts.put(candidate, 1);
            }
        }
        System.out.println(voteCounts);
        int max=0;
        String winner="";
        for(String key: voteCounts.keySet()){
            if(voteCounts.get(key)>max){
                max=voteCounts.get(key);
                winner=key;
            }
        }
        System.out.println("Winner isss.... : "+winner + " with total " + max + " votes");
    }

}