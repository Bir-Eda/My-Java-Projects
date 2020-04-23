package sixteeniteratorpackage;

import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetExam {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();
        ts.add("John Doe : 555 555 5555");
        ts.add("Elma : 12394756");
        ts.add("Yey; 8475 4756");
        ts.add("Mell : 123097");
        System.out.println(ts);
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            String str = itr.next();
            System.out.println(str);

        }

    }
}
