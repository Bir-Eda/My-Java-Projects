package codingbat;

public class Examples {
    public static void main(String[] args) {
        //Overriding is runtime polymorphism so always we have tol look right side object.

        m1();
        m1("Hello mom");

    }
    static void m1(){
        System.out.println("Without parameter");
    }
    static void m1(String word){
        System.out.println(word);
    }
}
