package ocaquestionsvp2;

public class Q81Product {
    int id;
    String name;

    public Q81Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Q81Product p1=new Q81Product(101, "Pen");
//        System.out.println(p1.name);
//        System.out.println(p1.id);

       Q81Product p2=new Q81Product(101, "Pen");
//        System.out.println(p2.name);
//        System.out.println(p2.id);

        Q81Product p3=p1;  //   (101, "Pen");

        boolean ans1=p1==p2;    //  true
        System.out.println(ans1);
//        boolean ans2=p1.name.equals(p2.name);
//        System.out.println(ans1+ ":"+ans2);
    }
}
