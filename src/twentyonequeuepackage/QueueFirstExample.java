package twentyonequeuepackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueFirstExample {
    public static void main(String[] args) {
        Queue<Integer> myQ = new LinkedList<>();
        myQ.add(1);
        myQ.add(2);
        myQ.add(3);
        myQ.add(4);
        myQ.add(5);
        System.out.println(myQ);
        System.out.println(myQ.peek());
        myQ.poll();
        System.out.println(myQ);
       myQ.add(1);
        System.out.println(myQ);
       System.out.println(myQ.peek());
       System.out.println(myQ.element());


    }
}