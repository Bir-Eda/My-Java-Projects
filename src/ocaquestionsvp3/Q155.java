package ocaquestionsvp3;

import java.util.ArrayList;

public class Q155 {
    public static void main(String[] args) {
        ArrayList<Integer> point=new ArrayList<>();
        point.add(1);
        point.add(2);
        point.add(3);
        point.add(4);
        point.add(null);
        //System.out.println(point);
        point.remove(1);
       // System.out.println(point);
        point.remove(null);
        System.out.println(point);


    }
}
