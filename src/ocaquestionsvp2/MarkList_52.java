package ocaquestionsvp2;

public class MarkList_52 {

    int num;

    public static void graceMarks(MarkList_52 obj4) {
        obj4.num += 10;
        System.out.println(obj4.num);

    }
//
    public static void main(String[] args) {
        MarkList_52 obj1 = new MarkList_52();  //
        MarkList_52 obj2 = obj1;
        MarkList_52 obj3 = null;
        obj2.num=60;
        graceMarks(obj3);


    }
}