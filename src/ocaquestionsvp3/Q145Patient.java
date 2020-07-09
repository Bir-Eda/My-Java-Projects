package ocaquestionsvp3;

import java.util.ArrayList;
import java.util.List;

public class Q145Patient {
    String name;
    public Q145Patient(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        List ps=new ArrayList();
        Q145Patient p2=new Q145Patient("Mike");
        ps.add(p2);

//        System.out.println(p2);
//        System.out.println(ps.size());
        //int f=ps.indexOf(Q145Patient("Mike"));
//        System.out.println(f);
//
//        if(f>=0){
//            System.out.println("Mike Found");
//        }

    }
}
