package sixteeniteratorpackage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class CollectionFill {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i <3; i++)
            list.add("Hello World");
        System.out.println("Before Fill: "+list);
        Collections.fill(list, "lll");
        System.out.println("After Fill: "+list);
    }

}

