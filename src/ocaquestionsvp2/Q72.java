package ocaquestionsvp2;

public class Q72 {
    Character c; // char yazarsak space degerini verir
    Boolean b;  // objectler null a gider
    Float f;   // wrapper classlar objecte gider ve objecte gittigi icin de null olur
    Integer a;
     String s;
    void printAll(){
        System.out.println("c = "+c);
        System.out.println("b = "+b);
        System.out.println("f = "+f);
        System.out.println("a = "+a);
        System.out.println("s = "+s);
    }

    public static void main(String[] args) {
        Q72 f=new Q72();
        f.printAll();
    }
}
