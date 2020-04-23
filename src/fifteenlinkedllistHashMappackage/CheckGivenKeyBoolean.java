package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class CheckGivenKeyBoolean {

        public static void main(String[] args) {
            HashMap<Character, Character> map=new HashMap<>();
            map.put('a','A');
            map.put('b','B');
            map.put('c','C');
            findKey(map,'c');
        }
    public static void findKey(HashMap<Character, Character> map, char a){
        boolean isKey=false;
        for(char element:map.keySet()) {
            if (element == a) {
                isKey = true;
            } else {
                isKey = false;
            }
        }
        if(isKey){
            System.out.println("exist");
        }
        else
        {
            System.out.println("not exist");
        }
    }

}
