package ocaquestionsvp3;

public class Q132 {
    int i;
    static int j;

    public static void main(String[] args) {
        Q132 x1=new Q132();
        Q132 x2=new Q132();
        Q132 x3=new Q132();
        x1.i=3;
        x1.j=4;
        x2.i=5;
        x2.j=6;  // statige verdigi son degeri tum j lerde koruyacak
        x3.j=9;
        x1.j=7;
        System.out.println(x1.i+" "+ x1.j+" "+ x2.i+" "+ x2.j+" "+x3.j+" "+x1.j);
    }
}
