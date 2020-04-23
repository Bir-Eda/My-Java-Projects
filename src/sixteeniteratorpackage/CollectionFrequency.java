package sixteeniteratorpackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashSet;

public class CollectionFrequency {
    public static void main(String[] args) {
      HashSet  <String> list = new HashSet<>();
     String [] allnames={"john tom","john mary","john tom","mary anna","mary anna"};
     /* for(int i=0; i<5; i++ );
        System.out.println(list.size());
        list.add("John");
        System.out.println(list.size());
        list.add("Rachel");
        System.out.println(list.size());
        list.add("Lila");
        System.out.println(list.size());   */
        for(int i=0 ; i<allnames.length ; i++) {
            list.add(allnames[i]);
            System.out.println(list.size());


        }

        }
}
