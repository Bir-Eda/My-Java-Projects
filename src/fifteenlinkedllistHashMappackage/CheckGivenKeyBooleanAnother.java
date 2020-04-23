package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class CheckGivenKeyBooleanAnother {
    public static void main(String[] args) {
        System.out.println (isKeyHas () );
    }
    public static boolean isKeyHas(){
        HashMap<String,String>map=new HashMap <> (  );
        map.put ( "a","A" );
        map.put ( "b" ,"B");
        String keyCheck="c";
        System.out.println (map );
        boolean hasKey=map.containsKey ( keyCheck );
        return hasKey;
    }

}
