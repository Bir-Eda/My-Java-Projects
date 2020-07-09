package ocaquestionsvp3;

public class Q106Test {
    public static void main(String[] args) {
        Q106Test ts=new Q106Test();

        System.out.println(isAvailable+" ");

        isAvailable=ts.doStuff();

        System.out.println(isAvailable);
    }
    public static boolean doStuff(){ // false un olumsuzu true oldugu icin ilkinde false ikinci
    return !isAvailable;

    }
    static boolean isAvailable=false; // isAvailablein degeri false
}
