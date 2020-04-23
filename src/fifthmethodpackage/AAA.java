package fifthmethodpackage;

public class AAA {
    public static void swap(int a, int b) {
        System.out.println("Before swaping");
        int c = a;
        a = b;
        b = c;
        System.out.println("After swapp=" + a +","+ "b=" + b);
    }

    public static void main(String[] args) {
        swap(12, 45);
    }
}
