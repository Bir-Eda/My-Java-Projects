package twentyonequeuepackage;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> myQ=new LinkedList<>();
        myQ.add(45);
        myQ.add(78);
        myQ.add(67);
        myQ.add(12);
        System.out.println(myQ);
        System.out.println("--------------");
        System.out.println("With peed() :"+myQ.peek());
        System.out.println("-------------");
        System.out.println("After peek() :"+myQ);
        System.out.println("---------");
        System.out.println("With poll()"+myQ.poll());
        System.out.println("---------");
        System.out.println("After poll()"+myQ);
        System.out.println("---------");
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        System.out.println(myQ.poll());
        //System.out.println(myQ.remove());

    }
}
