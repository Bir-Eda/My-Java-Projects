package whizlabspackage;

import java.util.ArrayList;
import java.util.List;

public class Q5q1 {
    public static void main(String[] args) {
        List<String> ints = new ArrayList<>();
        ints.add("a");
        ints.add("b");
        ints.add("c");
        ints.add("Ali");
        System.out.println(ints);
        System.out.println(ints.get(2));

        while (!ints.isEmpty()) { //int bos degilse calis
            System.out.print(ints.remove(0));
           // System.out.println(ints);

        }
    }
}
