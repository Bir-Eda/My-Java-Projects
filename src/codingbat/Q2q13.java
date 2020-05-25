package codingbat;

public class Q2q13 {
    public static void main(String[] args) {
        A ab=new Ant();
        System.out.println(Ant.j);
    }
}
class A{
    protected int x=10;
    static int j=21;
}
 class Ant extends A{}