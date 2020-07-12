package ocaquestionsvp;

public class Q27 {
    public static int sVar = 100;
    public int var = 200;


    public String toString() {
        return sVar + ":" + var+ " : ";  //

    }

}
class Q27T{
    public static void main(String[] args) {
        Q27 t1=new  Q27();
        t1.var=300;   //   200
        System.out.println(t1);
        Q27 t2= new  Q27();
        t2.sVar=300;     //   100
        System.out.println(t2);
        Q27 t3=new  Q27();
        t3.var=150;
        System.out.println(t3);
    }
}
