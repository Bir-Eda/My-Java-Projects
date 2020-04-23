package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class HashMapExample {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,2,3,2,4,3,5,5};
        HashMap<Integer, Integer> myHashMap = new HashMap<>();
        for(int num:arr){
            if(!myHashMap.containsKey(num)){
                myHashMap.put(num,1);
            }
            else{
                myHashMap.put(num, myHashMap.get(num)+1);
            }
        }
        System.out.println(myHashMap);
    }
}
