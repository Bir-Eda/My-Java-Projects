package twentyonequeuepackage;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueKey {
    public static void main(String[] args) {
        Queue<Character> q = new LinkedList<>(Arrays.asList('k', 'n', 'o', 'w', 'l', 'e', 'd', 'g', 'e', 'i', 's', 'p', 'o', 'w', 'e', 'r'));
        System.out.println(q);
        char s = (char) (q.peek() + 3);
        System.out.println(s);
        for (int i = 0; i < q.size(); i++) {
            q.add((char) (q.peek() + 3));
            q.poll();
        }
        System.out.println(q);
    }
}
