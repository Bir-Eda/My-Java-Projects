package fifteenlinkedllistHashMappackage;
import java.util.HashMap;

public class OccurencesFreq {
    public static void main(String[] args) {
        int [] myArr = {1,2,3,4,3,2,2,};
        findOccurrences(myArr);
    }
    public static void findOccurrences(int [] arr) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        for (Integer n :arr) {
            if (counts.containsKey(n)) {
                counts.put(n, counts.get(n) + 1);
            } else {
                counts.put(n,1);
            }
        }
        int counter=0;
        for (Integer number : counts.keySet()) {
            System.out.println(number + " = " + counts.get(number));
            if(counts.get(number)>1) counter=counter+counts.get(number);
        }
        System.out.println("There are totally "+counter+" repeating numbers");
    }
}




