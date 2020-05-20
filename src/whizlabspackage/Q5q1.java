package whizlabspackage;

import java.util.ArrayList;
import java.util.List;

public class Q5q1 {
    public static void main(String[] args) {
        List<String> ints = new ArrayList<>();
        ints.add("a");
        ints.add("b");
        ints.add("c");
        System.out.println(ints);
        while (!ints.isEmpty()) {
            System.out.println(ints.remove(0));
            System.out.println(ints);

        }
    }
}
