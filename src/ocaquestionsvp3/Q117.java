package ocaquestionsvp3;

import java.util.ArrayList;

public abstract class Q117 {

} interface Hunter{


}
 class Cat extends Q117 implements Hunter{

}
class Tiger extends Cat{

    public static void main(String[] args) {
        ArrayList<Cat>myList=new ArrayList<>();
        myList.add(new Tiger());

        ArrayList<Tiger>myList1=new ArrayList<>();
        myList.add(new Tiger());
    }
}

