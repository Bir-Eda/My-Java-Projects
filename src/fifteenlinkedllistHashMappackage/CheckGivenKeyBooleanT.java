package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class CheckGivenKeyBooleanT {
    public static void main(String[] args) {
        HashMap<String, String> map=new HashMap<>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        System.out.println(isHasKey(map, "A"));

    }
    public static boolean isHasKey(HashMap<String, String> hMap, String keyToCheck){
        boolean result=false;
        for(String key: hMap.keySet()){
            if(key.equals(keyToCheck)){
                result=true;
                break;
            }
        }
        return result;
    }
}
