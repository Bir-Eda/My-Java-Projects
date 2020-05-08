package twentyonequeuepackage;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class QueueSecondExample {

        public static void main(String[] args) {
            Queue<String> myQ = new LinkedList<>();
            myQ.add("Ali");
            myQ.add("Veli");
            myQ.add("Kirk");
            myQ.add("Dokuz");
            myQ.add("Elli");
            System.out.println(myQ);
            System.out.println(myQ.peek());
            myQ.poll();  //remove
            System.out.println(myQ);
            myQ.add("Ali");
            System.out.println(myQ);
            System.out.println(myQ.peek());
            System.out.println(myQ.element());
            System.out.println(myQ.remove());

        }
}
