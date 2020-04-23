package tenpolymorphismpackage;

public class StaticVarTest {
    public static void main(String[] args) {
        StaticVar o1= new StaticVar();
        StaticVar.getA();
        o1.getB();
        StaticVar o2= new StaticVar();
        StaticVar.getA();
        o2.getB();
        StaticVar o3= new StaticVar();
        StaticVar.getA();
        o3.getB();
        /*System.out.println("b="+o1.b);
        System.out.println("a="+StaticVar.a);
        System.out.println("b="+o2.b);
        System.out.println("a="+StaticVar.a);
        StaticVar.getA();
        o1.getB();
        StaticVar.getA();
        o2.getB();*/
    }
}
