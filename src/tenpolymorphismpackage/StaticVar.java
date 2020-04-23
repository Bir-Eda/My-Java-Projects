package tenpolymorphismpackage;

public class StaticVar {
    static int a=0;
    int b=0;
    public StaticVar(){
        this.a++;
        this.b++;
    }
    public static void getA(){
        System.out.println("a="+a);
    }
    public void getB(){
        System.out.println("b="+this.b);
    }
}
