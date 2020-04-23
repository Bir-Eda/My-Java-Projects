package fifthmethodpackage;

public class Method {
    public static void methodA(int a, int b) {
        int c = 2 * a + 3 * b;
        System.out.println(c);
    }

    public static int passW(int imp) {
        int y = imp * imp;
        int z= y*12;
        return z;
    }


    public static void main(String[] args) {
        methodA(4, 9);
        passW(30);
        System.out.println(passW(3));

    }

}
