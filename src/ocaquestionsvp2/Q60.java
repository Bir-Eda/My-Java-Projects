package ocaquestionsvp2;

public class Q60 {
    public Q60() {
        System.out.println("A");
    }
}
    class Bursa extends Q60 {
        public Bursa() {
            System.out.println("B");
        }
    }

      class Ci extends Bursa {
        public Ci() {
            System.out.println("C");
        }

    public static void main(String[] args) {
       // Q60 a=new Q60();
        Ci c=new Ci();
        System.out.println(c);
    }
}
