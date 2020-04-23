package fifthmethodpackage;

public class VoidVsReturn {
    public static void method1() {
        System.out.println("A");

    }
    public static int method2(){
        int w=34;
        return w;
    }

    public static void main(String[] args) {
        method1();

        System.out.println(method2());
    }
}
