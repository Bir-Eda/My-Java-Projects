package twentyonequeuepackage;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueSecondExampleT {
    public static void main(String[] args) {
        Queue<String> names = new LinkedList<>();
        names.add("Ela");
        names.add("Seda");
        names.add("Bera");
        names.add("Meral");
        names.add("Sule");
        System.out.println("Before :" + names);
        for (int i = 0; i < 5; i++) {
            System.out.println(names.poll());
        }
        System.out.println();

    }
}
