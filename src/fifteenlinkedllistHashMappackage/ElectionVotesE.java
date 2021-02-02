package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class ElectionVotesE {
    public static void main(String[] args) {
        String votes[]={"John", "Eda", "Adam","John", "Adam", "Bill", "Adam", "Adam"};
        HashMap<String, Integer> map = new HashMap<>();
        int num=1;
        for(int i=0; i<votes.length; i++){
            if(map.containsKey(votes[i])){
               map.put(votes[i], map.get(votes[i])+1) ;
            }
            else{
                map.put(votes[i], 1);
            }
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
        System.out.println(winner+ " has votes: "+max);
        System.out.println(map.get("John"));
    }
}
